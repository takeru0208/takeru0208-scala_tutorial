import scala.math.BigInt

object FactorialOver10000 extends App {
    def factorialTailCall(i: BigInt, accum: BigInt): BigInt = if(i == 0) accum else factorialTailCall(i-1, i*accum)
    def factorial(i: BigInt): BigInt = factorialTailCall(i, 1)
    
    println(factorial(100000))
}