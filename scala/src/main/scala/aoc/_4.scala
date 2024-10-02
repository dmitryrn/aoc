package aoc

object _4 {
  case class Range(begin: Int, end: Int)

  object Range {
    def fromString(str: String): Range = 
      val spl = str.split('-').map(_.toInt)
      Range(spl(0), spl(1))

    def contains(a: Range, b: Range): Boolean = 
      a.begin >= b.begin && a.end <= b.end
        || b.begin >= a.begin && b.end <= a.end

    def overlaps(a: Range, b: Range): Boolean = 
      _overlaps(a, b) || _overlaps(b, a)
    
    def _overlaps(a: Range, b: Range): Boolean =
      (b.begin >= a.begin && b.begin <= a.end)
        || (b.end >= a.begin && b.end <= a.end)
      //   1    1
      //      1   1
      //
      //    1    1
      //  1   1
  }

  def common(input: String, check: (Range, Range) => Boolean): Int =
    input.trim
      .split("\n").toList
      .map(_.split(',').toList.map(Range.fromString))
      .map(pair => check(pair(0), pair(1)))
      .count(_ == true)

  def part1(input: String) = common(input, Range.contains)

  def part2(input: String) = common(input, Range.overlaps)
}
