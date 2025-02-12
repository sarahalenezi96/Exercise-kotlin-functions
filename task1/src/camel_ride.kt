fun main()
{
    println(startCamelRide(10,5))
    println(startCamelRide(10))

}

fun startCamelRide(time: Int, speed: Int = 5): String {
return "Camel Ride: Distance = " + (time*speed) + " km, Speed = " + speed + " km/h, Time = " + time + " hours"
}
