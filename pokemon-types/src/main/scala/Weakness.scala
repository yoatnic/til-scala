class Weakness() {
  def types(targetType: TypeEnum): Set[TypeEnum] = {
    targetType match {
      case Fire => Set(Water, Rock)
      case Water => Set(Glass)
      case Glass => Set(Fire)
      case Rock => Set(Water, Glass, Fight)
      case Ghost => Set()
      case Fight => Set()
    }
  }
}