/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.watchers.common;

import java.util.HashMap;
import java.util.UUID;
import mage.constants.CardType;
import mage.constants.WatcherScope;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.events.ZoneChangeEvent;
import mage.watchers.Watcher;

/**
 *
 * @author LevelX2
 */
public class CreaturesDiedWatcher extends Watcher {

    private int amountOfCreaturesThatDied;
    private final HashMap<UUID, Integer> amountOfCreaturesThatDiedByController = new HashMap<>();

    public CreaturesDiedWatcher() {
        super("CreaturesDiedWatcher", WatcherScope.GAME);
    }

    public CreaturesDiedWatcher(final CreaturesDiedWatcher watcher) {
        super(watcher);
        this.amountOfCreaturesThatDied = watcher.amountOfCreaturesThatDied;
        this.amountOfCreaturesThatDiedByController.putAll(watcher.amountOfCreaturesThatDiedByController);
    }

    @Override
    public void watch(GameEvent event, Game game) {
        if (event.getType() == GameEvent.EventType.ZONE_CHANGE) {
            ZoneChangeEvent zEvent = (ZoneChangeEvent) event;
            if (zEvent.isDiesEvent()
                    && zEvent.getTarget() != null
                    && zEvent.getTarget().isCreature()) {
                amountOfCreaturesThatDied++;
                int amount = 0;
                if (amountOfCreaturesThatDiedByController.containsKey(zEvent.getTarget().getControllerId())) {
                    amount = amountOfCreaturesThatDiedByController.get(zEvent.getTarget().getControllerId());
                }
                amountOfCreaturesThatDiedByController.put(zEvent.getTarget().getControllerId(), amount + 1);
            }
        }
    }

    @Override
    public void reset() {
        amountOfCreaturesThatDied = 0;
        amountOfCreaturesThatDiedByController.clear();
    }

    public int getAmountOfCreaturesDiesThisTurn() {
        return amountOfCreaturesThatDied;
    }

    public int getAmountOfCreaturesDiesThisTurn(UUID playerId) {
        return amountOfCreaturesThatDiedByController.getOrDefault(playerId, 0);
    }

    @Override
    public CreaturesDiedWatcher copy() {
        return new CreaturesDiedWatcher(this);
    }

}
