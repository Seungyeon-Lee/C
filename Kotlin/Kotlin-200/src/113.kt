// 113 클래스와 인터페이스에서 제네릭 사용하기

package ex_generic_to_class_and_interface

class Pair<A, B>(val first: A, val second: B) // 클래스나 인터페이스에서 타입을 인수로 받으려면 선언시 이름 옆에 <식별자>를 붙인다.
{
    // Pair<A, B>에서 Pair<Int, Double>과 Pair<Int, Int>는 서로 다른 타입이다.
    override fun toString() = "$first\n$second" // 모든 타입은 Any 클래스를 상속하므로, 어떤 타입이 오더라도 toString 멤버 함수를 가지고 있다는 것이 보장된다.
}

fun main(args: Array<String>)
{
    val pair: Pair<Int, Double>
    pair = Pair<Int, Double>(15, 9.12) // 인수 15와 9.12로부터 Int, Double 타입을 추론할 수 있으므로 <타입 인수>는 생략이 가능하다.
    println(pair.toString())
}