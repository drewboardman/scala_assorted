sealed trait PokeMove {
  def show: String
}

trait FireMove extends PokeMove
case object Ember extends FireMove {
  override def show = "Vinewhip"
}
case object FlameThrower extends FireMove {
  override def show = "FlameThrower"
}
case object FireBlast extends FireMove {
  override def show = "Fireblast"
}

trait WaterMove extends PokeMove
case object Bubble extends WaterMove {
  override def show = "Bubble"
}
case object WaterGun extends WaterMove {
  override def show = "Watergun"
}

trait GrassMove extends PokeMove
case object VineWhip extends GrassMove {
  override def show = "Vinewhip"
}

