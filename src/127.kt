// 127 클래스 위임(Class Delegation)

package ex_class_delegation

interface Plusable
{
    operator fun plus(other: Int): Int // Int 타입과 덧셈을 가능하게 하는 인터페이스를 선언한다.
}

class ClassDelegator: Plusable
{
    override fun plus(other: Int): Int
    {
        println("기본 구현")
        return other
    }
}

class Sample : Plusable by ClassDelegator() // 인터페이스를 구현하면서 by 객체를 지정하면 인터페이스의 구현을 해당 객체로 위임한다.
// 이때 객체는 대리할 인터페이스를 구현하고 있어야 한다.

fun main(args: Array<String>)
{
    println(Sample() + 10) // ClassDelegator의 plus가 호출된다.
}