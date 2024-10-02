package aoc

import scala.collection.mutable.Stack

object _5 {
  class Stacks {
    var stacks: List[Stack[Char]] = List.empty

    def Stacks(items: List[List[Char]]) = {
      items.foreach(items => {
        val st = new Stack[Char]()
        items.foreach(st.addOne(_))
        stacks = stacks.appended(st)
      })
    }

    def move(count: Int, from: Int, to: Int) = {

    }

    def tops: String = {
      "todo"
    }
  }

  case class Instruction(count: Int, from: Int, to: Int)

  def parse(input: String): Option[(Stacks, List[Instruction])] = {
    val lines = input.trim.split('\n')

    val instructions = lines.filter(_.startsWith("move"))
      .map(_.stripPrefix("move ").replace(" from ", "-").replace(" to ", "-"))
      .map(s => s.split('-'))
      .map(a => Instruction(a(0).toInt, a(1).toInt, a(2).toInt))

    var stacksInp = input.split('\n').filter(!_.startsWith("move")).filter(!_.startsWith(" 1"))
      .filter(_.nonEmpty)
      .reverse
      .map(line => line + ' ')
      .map(_.replace("]", " "))
      .map(_.replace("[", " "))
      // .foreach(x => println("'%s'".format(x)))

    var stacks: List[Stack[Char]] = List.empty
    val countStacks = (stacksInp(0).length)/4
    for {i <- 0 to countStacks} {
      stacks = stacks.appended(new Stack)
    }

    var i = 0
    var j = 0
    while (true) {
      while (i < countStacks) {
        val ii = 
        val c = stacksInp(j)(i)
        stacks(i)
      }
      j += 1
    }


    // println;println((123, stacksInp.toList))

    None
  }

  def rotate(m: List[List[Char]]) = {
    val cp = m
  }

  def part1(input: String): String = {
    val (stacks, instructions) = parse(input).get

    instructions.foreach(inst => {
      stacks.move(inst.count, inst.from, inst.to)
    })

    stacks.tops
  }
}
