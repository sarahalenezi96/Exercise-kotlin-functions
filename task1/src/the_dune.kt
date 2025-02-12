fun main(){
    println(exploreDune(height=20,climbRate=3))
}

fun exploreDune(height: Int, climbRate: Int): String {
    var ClimbTime = (height.toDouble()/climbRate.toDouble())
    return "Time to Climb the Dune: %.2f".format(ClimbTime) + " hours"
}
