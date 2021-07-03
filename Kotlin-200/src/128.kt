// 128 Pair 클래스: 두 변수를 하나로 묶기

package ex_pair

// 두 수의 몫과 나머지를 반환한다.
fun divide(a: Int, b: Int): Pair<Int, Int> = Pair(a / b, a % b) // Pair 클래스는 제네릭을 이용하여 두 가지 타입의 값을 보관한다.

fun main(args: Array<String>)
{
    val (q, r) = divide(10 ,3) // Pair 클래스는 데이터 클래스이므로 이렇게 여러 변수로 분해할 수 있다.
    println("몫: $q")
    println("나머지: $r")
}