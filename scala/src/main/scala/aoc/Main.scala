package aoc

object Hello {
  def main(args: Array[String]): Unit = {
    if (args.size < 2) {
      println("""Usage:
./aoc <day> <token>""")
      sys.exit(1)
    }
    if (args(0).toIntOption.isEmpty) {
      println("first argument should be an int")
      sys.exit(1)
    }

    val inp = Fetcher.fetch(args(0).toInt, args(1))
    println(inp)
  }
}
