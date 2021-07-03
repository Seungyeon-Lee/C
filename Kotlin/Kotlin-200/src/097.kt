// 097 인터페이스(Interface)

package ex_interface

interface Printable // 어떤 멤버 함수와 프로퍼티가 반드시 존재한다는 것을 보장하기 위한 장치이다.
{
    fun print(): Unit // 인터페이스는 멤버 함수, 추상 멤버 함수, 추상 프로퍼티를 가질 수 있다. (일반 프로퍼티와 생성자는 가질 수 없다)
}

class AAA: Printable // 인터페이스의 경우 여러 개를 상속 가능하다.
{
    override fun print() // Printable의 인터페이스를 구현하고 있다.
    {
        println("Hello")
    }
}

fun print(anything: Printable)
{
    anything.print()
}

fun main(args: Array<String>)
{
    print(AAA()) // 인터페이스는 기존의 클래스를 확장하기보다는 어떤 클래스에 플러그인을 추가한다는 개념에 가깝다.
}