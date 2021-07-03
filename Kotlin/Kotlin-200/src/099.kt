// 099 중첩 클래스(Nested Class)

package ex_nested_class

class Outer // 바깥 클래스
{
    private val property: Int = 16

    class Nested // 중첩 클래스
    {
        fun hello() = println("중첩된 클래스") // 클래스 안에는 또 다른 클래스를 선언할 수 있다.
        // fun hello() = println(property) Nested 클래스의 멤버 함수는 Outer 클래스의 프로퍼티나 멤버 함수에 접근할 수 없다.
        // Outer의 인스턴스와 Outer.Nest의 인스턴스는 서로 어떠한 프로퍼티나 멤버 함수도 공유하지 않는다. 완전히 별개의 클래스이다.
    }
}

fun main(args: Array<String>)
{
    val instance: Outer.Nested = Outer.Nested() // 바깥 클래스.중첩 클래스로 만들어진다.
    instance.hello()
}