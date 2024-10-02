import aoc.*

class _1_test extends munit.FunSuite {
  test("part1") {
    val input = """1000
2000
3000

4000

5000
6000

7000
8000
9000

10000"""

    assertEquals(_1.part1(input), 24000)
  }

  test("part2") {
    val input = """1000
2000
3000

4000

5000
6000

7000
8000
9000

10000"""

    assertEquals(_1.part2(input), 45000)
  }
}

class _2_test extends munit.FunSuite {
  test("part1") {
    val input = """
A Y
B X
C Z
"""

    assertEquals(_2.part1(input), 15)
  }

  test("part2") {
    val input = """
A Y
B X
C Z
"""

    assertEquals(_2.part2(input), 12)
  }
}

class _4_test extends munit.FunSuite {
  test("part1") {
    val input = """
2-4,6-8
2-3,4-5
5-7,7-9
2-8,3-7
6-6,4-6
2-6,4-8
"""

    assertEquals(_4.part1(input), 2)
  }

  test("part2") {
    assert(_4.Range.overlaps(_4.Range(1, 2), _4.Range(2, 3)))
    assert(_4.Range.overlaps(_4.Range(2, 3), _4.Range(1, 2)))
    assert(_4.Range.overlaps(_4.Range(39, 84), _4.Range(35, 40)))
    assert(!_4.Range.overlaps(_4.Range(1, 2), _4.Range(3, 4)))
    assert(!_4.Range.overlaps(_4.Range(3, 4),_4.Range(1, 2)))

    val input = """
2-4,6-8
2-3,4-5
5-7,7-9
2-8,3-7
6-6,4-6
2-6,4-8
"""

    assertEquals(_4.part2(input), 4)
  }
}

class _5_test extends munit.FunSuite {
  test("part1") {
    val input = """
    [D]    
[N] [C]    
[Z] [M] [P]
 1   2   3 

move 1 from 2 to 1
move 3 from 1 to 3
move 2 from 2 to 1
move 1 from 1 to 2
"""

    assertEquals(_5.parse(input), None)

    // assertEquals(_5.part1(input), "CMZ")
  }
}
