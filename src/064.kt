// 064 상속(Inheritance)

package ex_inheritance

// Student 클래스의 슈퍼클래스(Superclass) 또는 슈퍼 타입
open class Person(val name: String, val age: Int) // 클래스의 상속을 허용하려면 클래스 정의부 앞에 open 키워드를 붙여주어야 한다.
// 코틀린은 자바와는 달리, 클래스 선언이 기본적으로 final로 되어 있다.

// Person2 클래스의 서브클래스(Subclass) 또는 서브 타입
class Student(name: String, age: Int, val id: Int) : Person(name, age) // Person2 클래스를 상속한다, 자바처럼 다중 상속은 불가하며, 하나의 클래스만 상속 가능하다.

fun main(args: Array<String>)
{
    val person = Person("홍길동", 35)
    val student = Student("김길동", 23, 20171217) // 상속을 하면 슈퍼 클래스의 프로퍼티와 멤버 함수가 서브클래스에 그대로 복사된다.
}