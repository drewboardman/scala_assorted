import PokemonTypleClasses.TierOrdering._
import PokemonTypleClasses.FireBattle._
import PokemonTypleClasses.{Tier1, Tier2, Tier3}
import org.scalatest.{FunSpec, Matchers}


class PokemonTypleClassesTest extends FunSpec with Matchers {

  describe("Hierarchy") {
    it("should correctly compare Tiers") {
      Tier1 > Tier2 shouldBe false
      Tier2 > Tier1 shouldBe true
      Tier1 < Tier2 shouldBe true
      Tier3 == Tier3 shouldBe true
    }
  }

  describe("FireBattle") {
    it("is a draw with same tiered Fire") {
    }
  }
}