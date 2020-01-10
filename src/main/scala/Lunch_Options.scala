object Lunch_Options {
  val option1 = "curry"
  val option2 = "burger"
  val option3 = "pizza"
  val option4 = "hotdog"

  val drink1 = "coke"
  val drink2 = "sprite"
  val drink3 = "fanta"
  val drink4 = "drpepper"

  def favouriteMeal(food: String, drink: String): String = {
 val favouriteMeal = food + " " + drink
    favouriteMeal
  }
}
