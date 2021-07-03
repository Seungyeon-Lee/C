// 068 다형성(Polymorphism)의 활용

package ex_polymorhpism

open class AAA
{
    open fun hello() = println("AAA 입니다.")
}

class BBB : AAA()
{
    override fun hello() = println("BBB 입니다.")
}

fun main(args: Array<String>)
{
    val one = AAA()
    val two = BBB()
    val three: AAA = two

    one.hello() // AAA 입니다.
    two.hello() // BBB 입니다.
    three.hello() // BBB 입니다. (타입은 AAA이지만 참조 변수가 실제로 가리키고 있는 객체의 멤버 함수가 호출된다)
}