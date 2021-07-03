// 165 lazy 함수: 게으른 초기화를 하는 프로퍼티 대리자

package ex_lazy_funciton

class AAA
{
    var num: Int = 0
    val num2 by lazy { num * 5 }
}

fun main(args: Array<String>)
{
    val one = AAA()
    println(one.num2) // num2는 0으로 계산된다.
    one.num = 10
    println(one.num2) // 다시 값을 계산하지 않는다.

    val two = AAA()
    two.num = 4
    println(two.num2) // 게으른 초기화를 사용하여 필요한 시점에 계산이 시작된다.
}