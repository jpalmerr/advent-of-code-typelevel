package advent.solutions

//import scala.annotation.tailrec

/** Day 1: The Tyranny of the Rocket Equation
  *
  * @see https://adventofcode.com/2019/day/1
  */
object Day1 {

  object Part1 {

    /** Calculates the fuel required to launch a module of a given mass
      *
      * @param mass The mass of the module
      * @return The fuel required to to launch the module
      */
    def fuel(mass: Int): Int = {
      (mass / 3) - 2
    }

    /** Calculates the sum of the fuel required to launch each module of a given mass
      *
      * @param masses The masses of each module
      * @return The sum of the fuel required to launch each module
      */
    def sumOfFuel(masses: List[Int]): Int = {
//      masses.map(x => fuel(x)).sum
      masses.map(fuel).sum
    }

  }

  object Part2 {

    /** Calculates the total required to launch a module, including the fuel required to launch the fuel itself
      *
      * @param mass The mass of the module
      * @return The fuel required to launch the module, plus the fuel required to launch that fuel
      */
    def totalFuel(mass: Int): Int = {

      def go(currentFuel: Int, accumulator: Int): Int = {
        if (currentFuel < 0)  accumulator
        else go(Part1.fuel(currentFuel), accumulator + currentFuel)
      }
      go(Part1.fuel(mass), 0)
    }

    /** Calculates the sum of the total fuel required to launch each module of a given mass
      *
      * @param masses The masses of each module
      * @return The sum of the total fuel required to launch each module
      */
    def sumOfTotalFuel(masses: List[Int]): Int = {
      masses.map(totalFuel).sum
    }
  }

  // scalastyle:off
  @SuppressWarnings(Array("org.wartremover.warts.All"))
  def main(args: Array[String]): Unit = {

    // Copy the puzzle input from https://adventofcode.com/2019/day/1/input
    val puzzleInput: List[Int] = List(55131, 114008, 145297, 76135, 50317, 134036, 122136, 97704, 51245, 141732, 120427,
    142020, 88166, 55313, 110391, 112436, 78195, 74294, 128984, 68240, 137098, 142016, 83577, 89257, 107744, 67357,
    131342, 98247, 137501, 134577, 65696, 84925, 50159, 110319, 91921, 103303, 84505, 84683, 100811, 82626, 66774,
    123216, 95151, 88237, 60705, 124319, 102926, 143160, 92780, 64283, 132434, 113935, 84907, 113698, 117240, 129327,
    78837, 144841, 138054, 130990, 100191, 141768, 138941, 108165, 62138, 121690, 117305, 90147, 134422, 78031, 121331,
    120947, 120235, 138880, 141076, 119480, 66844, 77660, 106364, 99187, 144244, 120483, 77715, 135703, 125521, 123253,
    127556, 96458, 91965, 73924, 95176, 87540, 122083, 146013, 67761, 100413, 145994, 149450, 94330, 112824)

    // Solve your puzzle using the functions in parts 1 and 2
    val part1 = Part1.sumOfFuel(puzzleInput)
    println(part1)
    val part2 = Part2.sumOfTotalFuel(puzzleInput)
    println(part2)
  }
  // scalastyle:on
}
