// 117 .. 연산자와 범위 표현식(Range Expression)

package ex_range
fun main(args: Array<String>)
{
    val oneToTen: IntRange = 1..10 // .. 연산자는 범위를 표현하는 연산자이다.
    println(5 in oneToTen) // IntRange 클래스는 contains 연산자 멤버 함수를 갖고 있으므로 in 연산자를 사용할 수 있다.

    val upperAtoZ: CharRange = 'A'..'Z' // .. 연산자는 operator fun rangeTo(매개변수 : 자유 타입): 자유 타입으로 오버로딩할 수 있다.
    if('C' in upperAtoZ)
        println("대문자입니다.")

    if('p' in 'a'..'z')
        println("소문자입니다.")
}