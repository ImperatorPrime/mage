/*
 * Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:
 *
 *    1. Redistributions of source code must retain the above copyright notice, this list of
 *       conditions and the following disclaimer.
 *
 *    2. Redistributions in binary form must reproduce the above copyright notice, this list
 *       of conditions and the following disclaimer in the documentation and/or other materials
 *       provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * The views and conclusions contained in the software and documentation are those of the
 * authors and should not be interpreted as representing official policies, either expressed
 * or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets;

import mage.constants.SetType;
import mage.cards.ExpansionSet;
import mage.constants.Rarity;

/**
 *
 * @author North
 */
public class FutureSight extends ExpansionSet {

    private static final FutureSight fINSTANCE = new FutureSight();

    public static FutureSight getInstance() {
        return fINSTANCE;
    }

    private FutureSight() {
        super("Future Sight", "FUT", ExpansionSet.buildDate(2007, 4, 4), SetType.EXPANSION);
        this.blockName = "Time Spiral";
        this.parentSet = TimeSpiral.getInstance();
        this.hasBasicLands = false;
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        cards.add(new SetCardInfo("Akroma's Memorial", 159, Rarity.RARE, mage.cards.a.AkromasMemorial.class));
        cards.add(new SetCardInfo("Angel of Salvation", 1, Rarity.RARE, mage.cards.a.AngelOfSalvation.class));
        cards.add(new SetCardInfo("Arcanum Wings", 48, Rarity.UNCOMMON, mage.cards.a.ArcanumWings.class));
        cards.add(new SetCardInfo("Arc Blade", 94, Rarity.UNCOMMON, mage.cards.a.ArcBlade.class));
        cards.add(new SetCardInfo("Augur il-Vec", 2, Rarity.COMMON, mage.cards.a.AugurIlVec.class));
        cards.add(new SetCardInfo("Augur of Skulls", 63, Rarity.COMMON, mage.cards.a.AugurOfSkulls.class));
        cards.add(new SetCardInfo("Aven Augur", 32, Rarity.COMMON, mage.cards.a.AvenAugur.class));
        cards.add(new SetCardInfo("Aven Mindcensor", 18, Rarity.UNCOMMON, mage.cards.a.AvenMindcensor.class));
        cards.add(new SetCardInfo("Barren Glory", 3, Rarity.RARE, mage.cards.b.BarrenGlory.class));
        cards.add(new SetCardInfo("Baru, Fist of Krosa", 142, Rarity.RARE, mage.cards.b.BaruFistOfKrosa.class));
        cards.add(new SetCardInfo("Bitter Ordeal", 80, Rarity.RARE, mage.cards.b.BitterOrdeal.class));
        cards.add(new SetCardInfo("Blade of the Sixth Pride", 19, Rarity.COMMON, mage.cards.b.BladeOfTheSixthPride.class));
        cards.add(new SetCardInfo("Blind Phantasm", 49, Rarity.COMMON, mage.cards.b.BlindPhantasm.class));
        cards.add(new SetCardInfo("Bloodshot Trainee", 110, Rarity.UNCOMMON, mage.cards.b.BloodshotTrainee.class));
        cards.add(new SetCardInfo("Bogardan Lancer", 95, Rarity.COMMON, mage.cards.b.BogardanLancer.class));
        cards.add(new SetCardInfo("Boldwyr Intimidator", 111, Rarity.UNCOMMON, mage.cards.b.BoldwyrIntimidator.class));
        cards.add(new SetCardInfo("Bonded Fetch", 50, Rarity.UNCOMMON, mage.cards.b.BondedFetch.class));
        cards.add(new SetCardInfo("Bound in Silence", 20, Rarity.UNCOMMON, mage.cards.b.BoundInSilence.class));
        cards.add(new SetCardInfo("Bridge from Below", 81, Rarity.RARE, mage.cards.b.BridgeFromBelow.class));
        cards.add(new SetCardInfo("Centaur Omenreader", 143, Rarity.UNCOMMON, mage.cards.c.CentaurOmenreader.class));
        cards.add(new SetCardInfo("Char-Rumbler", 96, Rarity.UNCOMMON, mage.cards.c.CharRumbler.class));
        cards.add(new SetCardInfo("Cloud Key", 160, Rarity.RARE, mage.cards.c.CloudKey.class));
        cards.add(new SetCardInfo("Cloudseeder", 33, Rarity.UNCOMMON, mage.cards.c.Cloudseeder.class));
        cards.add(new SetCardInfo("Coalition Relic", 161, Rarity.RARE, mage.cards.c.CoalitionRelic.class));
        cards.add(new SetCardInfo("Cryptic Annelid", 34, Rarity.UNCOMMON, mage.cards.c.CrypticAnnelid.class));
        cards.add(new SetCardInfo("Cutthroat il-Dal", 64, Rarity.COMMON, mage.cards.c.CutthroatIlDal.class));
        cards.add(new SetCardInfo("Cyclical Evolution", 125, Rarity.UNCOMMON, mage.cards.c.CyclicalEvolution.class));
        cards.add(new SetCardInfo("Dakmor Salvage", 169, Rarity.UNCOMMON, mage.cards.d.DakmorSalvage.class));
        cards.add(new SetCardInfo("Daybreak Coronet", 21, Rarity.RARE, mage.cards.d.DaybreakCoronet.class));
        cards.add(new SetCardInfo("Death Rattle", 82, Rarity.COMMON, mage.cards.d.DeathRattle.class));
        cards.add(new SetCardInfo("Deepcavern Imp", 83, Rarity.COMMON, mage.cards.d.DeepcavernImp.class));
        cards.add(new SetCardInfo("Delay", 35, Rarity.UNCOMMON, mage.cards.d.Delay.class));
        cards.add(new SetCardInfo("Dryad Arbor", 174, Rarity.UNCOMMON, mage.cards.d.DryadArbor.class));
        cards.add(new SetCardInfo("Dust of Moments", 5, Rarity.UNCOMMON, mage.cards.d.DustOfMoments.class));
        cards.add(new SetCardInfo("Edge of Autumn", 144, Rarity.COMMON, mage.cards.e.EdgeOfAutumn.class));
        cards.add(new SetCardInfo("Emberwilde Augur", 97, Rarity.COMMON, mage.cards.e.EmberwildeAugur.class));
        cards.add(new SetCardInfo("Emblem of the Warmind", 112, Rarity.UNCOMMON, mage.cards.e.EmblemOfTheWarmind.class));
        cards.add(new SetCardInfo("Epochrasite", 162, Rarity.RARE, mage.cards.e.Epochrasite.class));
        cards.add(new SetCardInfo("Fleshwrither", 84, Rarity.UNCOMMON, mage.cards.f.Fleshwrither.class));
        cards.add(new SetCardInfo("Flowstone Embrace", 113, Rarity.COMMON, mage.cards.f.FlowstoneEmbrace.class));
        cards.add(new SetCardInfo("Fomori Nomad", 114, Rarity.COMMON, mage.cards.f.FomoriNomad.class));
        cards.add(new SetCardInfo("Force of Savagery", 126, Rarity.RARE, mage.cards.f.ForceOfSavagery.class));
        cards.add(new SetCardInfo("Foresee", 36, Rarity.COMMON, mage.cards.f.Foresee.class));
        cards.add(new SetCardInfo("Frenzy Sliver", 85, Rarity.COMMON, mage.cards.f.FrenzySliver.class));
        cards.add(new SetCardInfo("Gathan Raiders", 99, Rarity.COMMON, mage.cards.g.GathanRaiders.class));
        cards.add(new SetCardInfo("Ghostfire", 115, Rarity.COMMON, mage.cards.g.Ghostfire.class));
        cards.add(new SetCardInfo("Gibbering Descent", 66, Rarity.RARE, mage.cards.g.GibberingDescent.class));
        cards.add(new SetCardInfo("Glittering Wish", 156, Rarity.RARE, mage.cards.g.GlitteringWish.class));
        cards.add(new SetCardInfo("Goldmeadow Lookout", 22, Rarity.UNCOMMON, mage.cards.g.GoldmeadowLookout.class));
        cards.add(new SetCardInfo("Graven Cairns", 175, Rarity.RARE, mage.cards.g.GravenCairns.class));
        cards.add(new SetCardInfo("Grave Peril", 67, Rarity.COMMON, mage.cards.g.GravePeril.class));
        cards.add(new SetCardInfo("Grave Scrabbler", 86, Rarity.COMMON, mage.cards.g.GraveScrabbler.class));
        cards.add(new SetCardInfo("Grinning Ignus", 116, Rarity.COMMON, mage.cards.g.GrinningIgnus.class));
        cards.add(new SetCardInfo("Grove of the Burnwillows", 176, Rarity.RARE, mage.cards.g.GroveOfTheBurnwillows.class));
        cards.add(new SetCardInfo("Haze of Rage", 100, Rarity.UNCOMMON, mage.cards.h.HazeOfRage.class));
        cards.add(new SetCardInfo("Heartwood Storyteller", 127, Rarity.RARE, mage.cards.h.HeartwoodStoryteller.class));
        cards.add(new SetCardInfo("Henchfiend of Ukor", 117, Rarity.COMMON, mage.cards.h.HenchfiendOfUkor.class));
        cards.add(new SetCardInfo("Homing Sliver", 118, Rarity.COMMON, mage.cards.h.HomingSliver.class));
        cards.add(new SetCardInfo("Horizon Canopy", 177, Rarity.RARE, mage.cards.h.HorizonCanopy.class));
        cards.add(new SetCardInfo("Ichor Slick", 68, Rarity.COMMON, mage.cards.i.IchorSlick.class));
        cards.add(new SetCardInfo("Imperiosaur", 145, Rarity.UNCOMMON, mage.cards.i.Imperiosaur.class));
        cards.add(new SetCardInfo("Infiltrator il-Kor", 37, Rarity.COMMON, mage.cards.i.InfiltratorIlKor.class));
        cards.add(new SetCardInfo("Intervention Pact", 8, Rarity.RARE, mage.cards.i.InterventionPact.class));
        cards.add(new SetCardInfo("Jhoira of the Ghitu", 157, Rarity.RARE, mage.cards.j.JhoiraOfTheGhitu.class));
        cards.add(new SetCardInfo("Judge Unworthy", 9, Rarity.COMMON, mage.cards.j.JudgeUnworthy.class));
        cards.add(new SetCardInfo("Kavu Primarch", 128, Rarity.COMMON, mage.cards.k.KavuPrimarch.class));
        cards.add(new SetCardInfo("Keldon Megaliths", 170, Rarity.UNCOMMON, mage.cards.k.KeldonMegaliths.class));
        cards.add(new SetCardInfo("Knight of Sursi", 10, Rarity.COMMON, mage.cards.k.KnightOfSursi.class));
        cards.add(new SetCardInfo("Korlash, Heir to Blackblade", 87, Rarity.RARE, mage.cards.k.KorlashHeirToBlackblade.class));
        cards.add(new SetCardInfo("Leaden Fists", 38, Rarity.COMMON, mage.cards.l.LeadenFists.class));
        cards.add(new SetCardInfo("Linessa, Zephyr Mage", 51, Rarity.RARE, mage.cards.l.LinessaZephyrMage.class));
        cards.add(new SetCardInfo("Llanowar Augur", 129, Rarity.COMMON, mage.cards.l.LlanowarAugur.class));
        cards.add(new SetCardInfo("Llanowar Empath", 130, Rarity.COMMON, mage.cards.l.LlanowarEmpath.class));
        cards.add(new SetCardInfo("Llanowar Mentor", 131, Rarity.UNCOMMON, mage.cards.l.LlanowarMentor.class));
        cards.add(new SetCardInfo("Llanowar Reborn", 171, Rarity.UNCOMMON, mage.cards.l.LlanowarReborn.class));
        cards.add(new SetCardInfo("Logic Knot", 52, Rarity.COMMON, mage.cards.l.LogicKnot.class));
        cards.add(new SetCardInfo("Lost Auramancers", 11, Rarity.UNCOMMON, mage.cards.l.LostAuramancers.class));
        cards.add(new SetCardInfo("Lucent Liminid", 24, Rarity.COMMON, mage.cards.l.LucentLiminid.class));
        cards.add(new SetCardInfo("Lumithread Field", 25, Rarity.COMMON, mage.cards.l.LumithreadField.class));
        cards.add(new SetCardInfo("Lymph Sliver", 26, Rarity.COMMON, mage.cards.l.LymphSliver.class));
        cards.add(new SetCardInfo("Maelstrom Djinn", 39, Rarity.RARE, mage.cards.m.MaelstromDjinn.class));
        cards.add(new SetCardInfo("Magus of the Abyss", 70, Rarity.RARE, mage.cards.m.MagusOfTheAbyss.class));
        cards.add(new SetCardInfo("Magus of the Future", 40, Rarity.RARE, mage.cards.m.MagusOfTheFuture.class));
        cards.add(new SetCardInfo("Magus of the Moat", 12, Rarity.RARE, mage.cards.m.MagusOfTheMoat.class));
        cards.add(new SetCardInfo("Magus of the Moon", 101, Rarity.RARE, mage.cards.m.MagusOfTheMoon.class));
        cards.add(new SetCardInfo("Magus of the Vineyard", 132, Rarity.RARE, mage.cards.m.MagusOfTheVineyard.class));
        cards.add(new SetCardInfo("Marshaling Cry", 13, Rarity.COMMON, mage.cards.m.MarshalingCry.class));
        cards.add(new SetCardInfo("Mass of Ghouls", 88, Rarity.COMMON, mage.cards.m.MassOfGhouls.class));
        cards.add(new SetCardInfo("Mesmeric Sliver", 53, Rarity.COMMON, mage.cards.m.MesmericSliver.class));
        cards.add(new SetCardInfo("Minions' Murmurs", 71, Rarity.UNCOMMON, mage.cards.m.MinionsMurmurs.class));
        cards.add(new SetCardInfo("Mistmeadow Skulk", 27, Rarity.UNCOMMON, mage.cards.m.MistmeadowSkulk.class));
        cards.add(new SetCardInfo("Molten Disaster", 102, Rarity.RARE, mage.cards.m.MoltenDisaster.class));
        cards.add(new SetCardInfo("Muraganda Petroglyphs", 146, Rarity.RARE, mage.cards.m.MuragandaPetroglyphs.class));
        cards.add(new SetCardInfo("Mystic Speculation", 41, Rarity.UNCOMMON, mage.cards.m.MysticSpeculation.class));
        cards.add(new SetCardInfo("Nacatl War-Pride", 147, Rarity.UNCOMMON, mage.cards.n.NacatlWarPride.class));
        cards.add(new SetCardInfo("Narcomoeba", 54, Rarity.UNCOMMON, mage.cards.n.Narcomoeba.class));
        cards.add(new SetCardInfo("Nessian Courser", 148, Rarity.COMMON, mage.cards.n.NessianCourser.class));
        cards.add(new SetCardInfo("New Benalia", 172, Rarity.UNCOMMON, mage.cards.n.NewBenalia.class));
        cards.add(new SetCardInfo("Nihilith", 72, Rarity.RARE, mage.cards.n.Nihilith.class));
        cards.add(new SetCardInfo("Nimbus Maze", 178, Rarity.RARE, mage.cards.n.NimbusMaze.class));
        cards.add(new SetCardInfo("Oblivion Crown", 73, Rarity.COMMON, mage.cards.o.OblivionCrown.class));
        cards.add(new SetCardInfo("Oriss, Samite Guardian", 28, Rarity.RARE, mage.cards.o.OrissSamiteGuardian.class));
        cards.add(new SetCardInfo("Pact of Negation", 42, Rarity.RARE, mage.cards.p.PactOfNegation.class));
        cards.add(new SetCardInfo("Pact of the Titan", 103, Rarity.RARE, mage.cards.p.PactOfTheTitan.class));
        cards.add(new SetCardInfo("Patrician's Scorn", 29, Rarity.COMMON, mage.cards.p.PatriciansScorn.class));
        cards.add(new SetCardInfo("Petrified Plating", 133, Rarity.COMMON, mage.cards.p.PetrifiedPlating.class));
        cards.add(new SetCardInfo("Phosphorescent Feast", 149, Rarity.UNCOMMON, mage.cards.p.PhosphorescentFeast.class));
        cards.add(new SetCardInfo("Pooling Venom", 74, Rarity.UNCOMMON, mage.cards.p.PoolingVenom.class));
        cards.add(new SetCardInfo("Pyromancer's Swath", 104, Rarity.RARE, mage.cards.p.PyromancersSwath.class));
        cards.add(new SetCardInfo("Quagnoth", 150, Rarity.RARE, mage.cards.q.Quagnoth.class));
        cards.add(new SetCardInfo("Quiet Disrepair", 134, Rarity.COMMON, mage.cards.q.QuietDisrepair.class));
        cards.add(new SetCardInfo("Ramosian Revivalist", 30, Rarity.UNCOMMON, mage.cards.r.RamosianRevivalist.class));
        cards.add(new SetCardInfo("Ravaging Riftwurm", 135, Rarity.UNCOMMON, mage.cards.r.RavagingRiftwurm.class));
        cards.add(new SetCardInfo("Riddle of Lightning", 105, Rarity.COMMON, mage.cards.r.RiddleOfLightning.class));
        cards.add(new SetCardInfo("Rift Elemental", 106, Rarity.COMMON, mage.cards.r.RiftElemental.class));
        cards.add(new SetCardInfo("Riftsweeper", 136, Rarity.UNCOMMON, mage.cards.r.Riftsweeper.class));
        cards.add(new SetCardInfo("Rites of Flourishing", 137, Rarity.RARE, mage.cards.r.RitesOfFlourishing.class));
        cards.add(new SetCardInfo("River of Tears", 179, Rarity.RARE, mage.cards.r.RiverOfTears.class));
        cards.add(new SetCardInfo("Saltskitter", 14, Rarity.COMMON, mage.cards.s.Saltskitter.class));
        cards.add(new SetCardInfo("Sarcomite Myr", 56, Rarity.COMMON, mage.cards.s.SarcomiteMyr.class));
        cards.add(new SetCardInfo("Scourge of Kher Ridges", 107, Rarity.RARE, mage.cards.s.ScourgeOfKherRidges.class));
        cards.add(new SetCardInfo("Scout's Warning", 16, Rarity.RARE, mage.cards.s.ScoutsWarning.class));
        cards.add(new SetCardInfo("Second Wind", 57, Rarity.UNCOMMON, mage.cards.s.SecondWind.class));
        cards.add(new SetCardInfo("Shapeshifter's Marrow", 58, Rarity.RARE, mage.cards.s.ShapeshiftersMarrow.class));
        cards.add(new SetCardInfo("Shimian Specter", 76, Rarity.RARE, mage.cards.s.ShimianSpecter.class));
        cards.add(new SetCardInfo("Skirk Ridge Exhumer", 77, Rarity.UNCOMMON, mage.cards.s.SkirkRidgeExhumer.class));
        cards.add(new SetCardInfo("Skizzik Surger", 120, Rarity.UNCOMMON, mage.cards.s.SkizzikSurger.class));
        cards.add(new SetCardInfo("Slaughter Pact", 78, Rarity.RARE, mage.cards.s.SlaughterPact.class));
        cards.add(new SetCardInfo("Sliver Legion", 158, Rarity.RARE, mage.cards.s.SliverLegion.class));
        cards.add(new SetCardInfo("Sliversmith", 163, Rarity.UNCOMMON, mage.cards.s.Sliversmith.class));
        cards.add(new SetCardInfo("Snake Cult Initiation", 89, Rarity.UNCOMMON, mage.cards.s.SnakeCultInitiation.class));
        cards.add(new SetCardInfo("Soultether Golem", 164, Rarity.UNCOMMON, mage.cards.s.SoultetherGolem.class));
        cards.add(new SetCardInfo("Sparkspitter", 109, Rarity.UNCOMMON, mage.cards.s.Sparkspitter.class));
        cards.add(new SetCardInfo("Spin into Myth", 60, Rarity.UNCOMMON, mage.cards.s.SpinIntoMyth.class));
        cards.add(new SetCardInfo("Spirit en-Dal", 17, Rarity.UNCOMMON, mage.cards.s.SpiritEnDal.class));
        cards.add(new SetCardInfo("Sporoloth Ancient", 152, Rarity.COMMON, mage.cards.s.SporolothAncient.class));
        cards.add(new SetCardInfo("Sprout Swarm", 138, Rarity.COMMON, mage.cards.s.SproutSwarm.class));
        cards.add(new SetCardInfo("Storm Entity", 122, Rarity.UNCOMMON, mage.cards.s.StormEntity.class));
        cards.add(new SetCardInfo("Street Wraith", 90, Rarity.UNCOMMON, mage.cards.s.StreetWraith.class));
        cards.add(new SetCardInfo("Stronghold Rats", 79, Rarity.UNCOMMON, mage.cards.s.StrongholdRats.class));
        cards.add(new SetCardInfo("Summoner's Pact", 139, Rarity.RARE, mage.cards.s.SummonersPact.class));
        cards.add(new SetCardInfo("Sword of the Meek", 165, Rarity.UNCOMMON, mage.cards.s.SwordOfTheMeek.class));
        cards.add(new SetCardInfo("Take Possession", 44, Rarity.RARE, mage.cards.t.TakePossession.class));
        cards.add(new SetCardInfo("Tarmogoyf", 153, Rarity.RARE, mage.cards.t.Tarmogoyf.class));
        cards.add(new SetCardInfo("Tarox Bladewing", 123, Rarity.RARE, mage.cards.t.TaroxBladewing.class));
        cards.add(new SetCardInfo("Thornweald Archer", 154, Rarity.COMMON, mage.cards.t.ThornwealdArcher.class));
        cards.add(new SetCardInfo("Tolaria West", 173, Rarity.UNCOMMON, mage.cards.t.TolariaWest.class));
        cards.add(new SetCardInfo("Tombstalker", 91, Rarity.RARE, mage.cards.t.Tombstalker.class));
        cards.add(new SetCardInfo("Unblinking Bleb", 45, Rarity.COMMON, mage.cards.u.UnblinkingBleb.class));
        cards.add(new SetCardInfo("Utopia Mycon", 140, Rarity.UNCOMMON, mage.cards.u.UtopiaMycon.class));
        cards.add(new SetCardInfo("Vedalken Aethermage", 61, Rarity.COMMON, mage.cards.v.VedalkenAethermage.class));
        cards.add(new SetCardInfo("Veilstone Amulet", 166, Rarity.RARE, mage.cards.v.VeilstoneAmulet.class));
        cards.add(new SetCardInfo("Venser, Shaper Savant", 46, Rarity.RARE, mage.cards.v.VenserShaperSavant.class));
        cards.add(new SetCardInfo("Virulent Sliver", 155, Rarity.COMMON, mage.cards.v.VirulentSliver.class));
        cards.add(new SetCardInfo("Whetwheel", 168, Rarity.RARE, mage.cards.w.Whetwheel.class));
        cards.add(new SetCardInfo("Whip-Spine Drake", 62, Rarity.COMMON, mage.cards.w.WhipSpineDrake.class));
        cards.add(new SetCardInfo("Witch's Mist", 92, Rarity.UNCOMMON, mage.cards.w.WitchsMist.class));
        cards.add(new SetCardInfo("Wrap in Vigor", 141, Rarity.COMMON, mage.cards.w.WrapInVigor.class));
        cards.add(new SetCardInfo("Yixlid Jailer", 93, Rarity.UNCOMMON, mage.cards.y.YixlidJailer.class));
        cards.add(new SetCardInfo("Zoetic Cavern", 180, Rarity.UNCOMMON, mage.cards.z.ZoeticCavern.class));
    }
}
