package aoc

object _2 {
  def part1(input: String): Int = {
    val pairs = input.trim
      .split("\n")
      .toList
      .map(_.split(' ').toList)
      .map(x => (x(0)(0), x(1)(0)))

    val a = pairs.map(outcome).sum
    val b = pairs.unzip.toList(1).map(_ - 87).sum
    val c = a + b

    c
  }
  // A,X = rock
  // B,Y = paper
  // C,Z = scissors

  def outcome(a: Char, b: Char): Int = (a, b) match {
    case ('A', 'X') => 3
    case ('B', 'Y') => 3
    case ('C', 'Z') => 3

    case ('A', 'Y') => 6
    case ('B', 'Z') => 6
    case ('C', 'X') => 6

    case ('A', 'Z') => 0
    case ('B', 'X') => 0
    case ('C', 'Y') => 0
  }

  def part2(input: String): Int = {
    val pairs = input.trim
      .split("\n")
      .toList
      .map(_.split(' ').toList)
      .map(x => (x(0)(0), x(1)(0)))
      .map((a, b) => (a, whatDoINeed(a, b-87)))

    val a = pairs.map(outcome).sum
    val b = pairs.unzip.toList(1).map(_ - 87).sum
    val c = a + b

    c
  }

  def whatDoINeed(a: Char, b: Int): Char = (a, b) match {
    case ('A', 2) => 'X'
    case ('B', 2) => 'Y'
    case ('C', 2) => 'Z'

    case ('A', 3) => 'Y'
    case ('B', 3) => 'Z'
    case ('C', 3) => 'X'

    case ('A', 1) => 'Z'
    case ('B', 1) => 'X'
    case ('C', 1) => 'Y'
  }
}
