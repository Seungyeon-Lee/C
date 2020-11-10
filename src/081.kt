// 081 as 연산자와 다운캐스팅

// 업캐스팅 예제의 Person, Student 클래스 재활용
import ex_upcasting.Person
import ex_upcasting.Student

fun main(args: Array<String>)
{
    val person: Person = Student("John", 32, 20171218)
    var person2: Person = Person("Jack", 29)

    var person3: Person = person as Student // 왼쪽 피연산자 타입을 오른쪽 피연산자 타입으로 캐스팅한다.
    person3 = person2 as Student // ClassCastException 예외가 발생한다. 캐스팅 실패 시 예외 발생을 막고 싶으면 as? 연산자를 사용하여 캐스팅에 실패하면 null을 반환하도록 한다.
}