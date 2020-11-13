// 065 업캐스팅(Upcasting)

package ex_upcasting

open class Person(val name: String, val age: Int)

class Student(name: String, age: Int, val id: Int) : Person(name, age) // 단순히 클래스를 확장하는 것이 목표라면 상속보다 확장함수나 확장 프로퍼티를 사용하는 것이 더 낫다.

fun main(args: Array<String>)
{
    val person: Person = Student("John", 32, 20171218) // Person2 참조 변수는 Student의 인스턴스를 가리키고 있기는 하지만, 타입이 Person2이기 때문에 name과 age 프로퍼티 밖에 접근하지 못한다.
    // person.id는 사용이 불가능하다.
    // val student: Student = person
    // 슈퍼클래스 타입은 항상 슈퍼클래스 자체나 서브클래스의 인스턴스만 가리킬 수 있다.
    // 객체를 원래 타입으로 복원할 수 없는 업캐스팅은 슈퍼 클래스를 상속하는 모든 서브 클래스의 인스턴스를 전달할 수 있도록 만들어준다.
}