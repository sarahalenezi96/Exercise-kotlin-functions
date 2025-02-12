fun main(){
    println(exploreDune(height=20.0,climbRate=3.0))
}

fun exploreDune(height: Double, climbRate: Double): String {
    var ClimbTime = (height/climbRate)
    return "Time to Climb the Dune: %.2f".format(ClimbTime) + " hours"
}
