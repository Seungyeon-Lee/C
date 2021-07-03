// 129 to 확장 함수: 두 값을 간단히 Pair로 묶기

package ex_to

fun main(args: Array<String>)
{
    // to는 모든 타입에 적용되는 확장 함수이다.
    // infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)
    val test: Pair<Int, Double> = 10 to 3.14 // to 확장 함수는 리시버 타입에 제네릭을 적용했기 때문에 모든 타입에 이용 가능하다.
}