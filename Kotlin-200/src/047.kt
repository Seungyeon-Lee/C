// 047 클래스(Class)

class Person // 모양이 같은 객체를 대량 생산 가능
{
    var name: String = ""
    var age: Int = 0
}

fun main(args: Array<String>)
{
    // 자바에서 public 클래스를 선언할면 클래스 이름이 파일 이름과 같아야 한다.
    // 또한 public 클래스는 파일 하나당 한 개만 존재할 수 있다.
    // 반면 코틀린에서는 클래스 이름이 파일 이름과 같지 않아도 되고, 한 파일 내에 여러 개의 public 클래스를 선언할 수 있다.

    val person: Person // object 타입으로 객체를 여러개 생성하면 서로 다른 타입으로 인식되지만, 클래스로 선언하면 동일한 타입을 갖는다.
    person = Person() // 객체 생성 시 new 키워드 없이 생성자만 호출하여 생성 가능하다.
    person.name = "홍길동"
    person.age = 36

    val person2 = Person() // 인스턴스 (클래스로 생성된 객체) 생성
    person2.name = "김미영" // 코틀린의 기본 접근지정자는 public이다. (자바에선 default이다)
    person2.age = 29

    val person3 = Person() // 참조변수를 초기화하지 않고 프로퍼티에 접근하면 오류가 발생한다.
    person3.name = "John"
    person3.age = 52
}