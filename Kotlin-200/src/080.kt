// 080 is 연산자

// 상속 예제의 Person, Student 클래스 재활용
import ex_inheritance.Person
import ex_inheritance.Student

class Professor(name: String, age: Int) : Person(name, age)

fun main(args: Array<String>)
{
    // is 연산자는 자바의 instanceof에 해당한다.
    val person: Person = Student("Mark Zuckerberg", 33, 20171225)
    print("${person is Person}") // true 왼쪽 피연산자가 실제로 가리키고 있는 객체를 오른쪽 피연산자로 가리킬 수 있는지 여부를 조사한다.
    print("${person is Student}") // true
    print("${person is Professor}") // false

    val person2: Person = Professor("Kim", 48)
    print("${person2 is Person}") // true
    print("${person2 is Student}") // false
    print("${person2 !is Professor}") // false
}