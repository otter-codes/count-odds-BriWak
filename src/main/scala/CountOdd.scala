object CountOdd extends App {

  def apply(input: Int) : Int = {
    val allNumbers = (1 until input).toList
    allNumbers.count(x => x % 2 != 0)
  }

}
