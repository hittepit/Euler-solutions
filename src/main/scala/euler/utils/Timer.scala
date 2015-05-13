package euler.utils


trait Timer {
  def time[T](methodName:String)(f:()=>T):T = {
    val start = System.nanoTime()
    val result = f()
    println("Method "+methodName+", elapsed time = "+((System.nanoTime()-start)/1000000)+" ms")
    result
  }
}