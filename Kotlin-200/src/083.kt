// 083 접근 지정자: priavte

package ex_access_modifier_private

private var num = 10 // 083.kt 파일 내에서만 접근 가능
private fun print() // 083.kt 파일 내에서만 접근 가능
    = println(num)

public fun hello(value: Int) // 어디에서나 접근 가능
{
    num = value
    print()
}

public class Person(age: Int) // 어디에서나 접근 가능
{
    // 디폴트 Setter를 private로 지정. Setter는 Person 클래스 내부에서만 접근 가능
    public var age = age
        private set

    // Getter를 public으로 지정. Getter는 어디에서나 접근 가능
    public val isYoung public get() = age < 30 // public 접근 지정자는 생략 가능하다.
}

fun main(args: Array<String>)
{
    num = 5 // 다른 파일에서 같은 방식으로 접근하면 에러가 발생한다.
    hello(15)

    val person = Person(10)
    println(person.age)
    // person.age = 20 class 내부에 Setter가 private로 선언되어 있어 에러가 발생한다.
    println(person.isYoung)
}