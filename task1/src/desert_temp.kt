
fun main()
{
    println("Average Temperature: " + currentTemperature(25,40))
}
fun currentTemperature(morningTemperature:Int,afternoonTemperature:Int): Double {
    var avg:Double = ((morningTemperature.toDouble() + afternoonTemperature.toDouble()) / 2)
    return avg

    //I casted the integers because average values are usually Double
    // And in this case, the real answer is 32.5 for the given temp values
}