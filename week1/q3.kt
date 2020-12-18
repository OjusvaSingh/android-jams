fun main() {
  var a=-4
  a=absolute(a)
  println("Absolute value is "+a)
}

fun absolute(x:Int):Int{
    if(x<0) return -x
    else return x
}
