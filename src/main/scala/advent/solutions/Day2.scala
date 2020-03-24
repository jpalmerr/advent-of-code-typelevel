package advent.solutions

/** Day 2: 1202 Program Alarm
  *
  * @see https://adventofcode.com/2019/day/2
  */
object Day2 {

  object Part1 {

    /** Runs an Intcode program
      *
      * @param program A list of opcodes and positions
      * @return The program after having been run on itself
      */
    def run(program: List[Int]): List[Int] = {
      ???
    }
  }

  object Part2 {

    /** Represents the two numbers provided at addresses 1 and 2 of an Intcode program */
    final case class Input(noun: Int, verb: Int)

    /** Calculates the input required to produce a given output
      *
      * @param program A list of opcodes and positions.  The positions at address 1 and 2 will be replaced with input
      * @param output  The given output of the program
      * @return The input that would be entered in the program to produce the given output
      */
    def inputForOutput(program: List[Int], output: Int): Option[Input] = {
      ???
    }

    def generateUpdatedProgram(input: Input, program: List[Int]): List[Int] = {
      ???
    }
  }

  // scalastyle:off
  @SuppressWarnings(Array("org.wartremover.warts.All"))
  def main(args: Array[String]): Unit = {

    // Copy the puzzle input from https://adventofcode.com/2019/day/2/input
    val puzzleInput: List[Int] = List(1, 12, 2, 3, 1, 1, 2, 3, 1, 3, 4, 3, 1, 5,
      0, 3, 2, 10, 1, 19, 1, 19, 9, 23, 1, 23, 6, 27, 1, 9, 27, 31, 1, 31, 10,
      35, 2, 13, 35, 39, 1, 39, 10, 43, 1, 43, 9, 47, 1, 47, 13, 51, 1, 51, 13,
      55, 2, 55, 6, 59, 1, 59, 5, 63, 2, 10, 63, 67, 1, 67, 9, 71, 1, 71, 13,
      75, 1, 6, 75, 79, 1, 10, 79, 83, 2, 9, 83, 87, 1, 87, 5, 91, 2, 91, 9, 95,
      1, 6, 95, 99, 1, 99, 5, 103, 2, 103, 10, 107, 1, 107, 6, 111, 2, 9, 111,
      115, 2, 9, 115, 119, 2, 13, 119, 123, 1, 123, 9, 127, 1, 5, 127, 131, 1,
      131, 2, 135, 1, 135, 6, 0, 99, 2, 0, 14, 0)

    // Solve your puzzle using the functions in parts 1 and 2
    val part1 = Day2.Part1.run(puzzleInput).head
    println(part1)
    val part2 = Day2.Part2.inputForOutput(puzzleInput, 19690720)
    println(100 * part2.get.noun + part2.get.verb)
  }
  // scalastyle:on
}
