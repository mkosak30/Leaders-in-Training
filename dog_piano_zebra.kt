//Leader's In Training Kotlin Program

//1. Declare class 
class Leader {
    //2. Declare variables
    private var numTrainingHours: Int = 0
    private var numFieldForce: Int = 0
    private var numOutreachEvents: Int = 0
    
    //3. Add constructor
    constructor(numTrainingHours: Int, numFieldForce: Int, numOutreachEvents: Int) {
        this.numTrainingHours = numTrainingHours
        this.numFieldForce = numFieldForce
        this.numOutreachEvents = numOutreachEvents
    }
    
    //4. add getters & setters
    fun getNumTrainingHours(): Int {
        return numTrainingHours
    }

    fun getNumFieldForce(): Int {
        return numFieldForce
    }

    fun getNumOutreachEvents(): Int{
        return numOutreachEvents
    }

    fun setNumTrainingHours(numTrainingHours: Int) {
        this.numTrainingHours = numTrainingHours
    }

    fun setNumFieldForce(numFieldForce: Int) {
        this.numFieldForce = numFieldForce
    }

    fun setNumOutreachEvents(numOutreachEvents: Int) {
        this.numOutreachEvents = numOutreachEvents
    }
    
    //5. add functions
    fun getTotalHours(): Int {
        return this.numTrainingHours + this.numFieldForce + this.numOutreachEvents
    }
    
    fun getAvgHours(): Double {
        return getTotalHours().toDouble() / 3
    }
    
    //6. Override toString
    override fun toString(): String {
        return "Total Number of Hours: ${getTotalHours()}, Average Hours/Task: ${getAvgHours()}"
    }
}

//7. Main function to create objects & print
fun main(args: Array<String>) {
    val leader1 = Leader(4, 8, 12)
    val leader2 = Leader(10, 10, 6)
    
    println("Leader 1 info: ${leader1.toString()}")
    println("Leader 2 info: ${leader2.toString()}")
}