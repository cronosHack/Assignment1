import kotlin.math.sqrt

fun main(){
//    ----------------------- Age Calculator -------------------
    println("    PROGRAM TO CALCULATE AGE")

    fun ageCalc(){
        val birthYear = 2000
        val currentYear = 2023
        val age = currentYear - birthYear

        println("You are $age years old")
    }

    ageCalc()

    println("")
    println("")

//    ------------------- Solving Pythagoras's Equation --------------
    println("    PROGRAM TO SOLVE PYTHAGORAS'S EQUATION")

    fun eqnCalc(){
        val opp = 4.0
        val adj = 3.0
        val hyp: Double = (opp * opp) + (adj * adj)
        val sol = sqrt(hyp)

        println("The hypotenuse of the triangle with opposite as $opp cm and adjacent as $adj cm is $sol cm")
    }

    eqnCalc()
}