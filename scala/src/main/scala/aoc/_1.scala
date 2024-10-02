package aoc

object _1 {
  def part1(input: String): Int = {
    input
      .trim
      .split("\n\n").toList
      .map(_.split("\n").map(_.toInt).sum)
      .max
  }

  def part2(input: String): Int = {
    val a = input
      .trim
      .split("\n\n").toList
      .map(_.split("\n").map(_.toInt).sum)
      .sortWith(_ > _)
      .take(3)
      .sum

    a
  }
}
