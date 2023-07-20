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
        val opp = 4
        val adj = 3
        val hyp = (opp * opp) + (adj * adj)

        println("The hypotenuse of the triangle with opposite as $opp cm and adjacent as $adj cm is $hyp cm")
    }

    eqnCalc()
}