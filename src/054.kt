// 054 생성자(Constructor)와 초기화(Initializer) 블록

package ex_constructor

// constructor 키워드는 생략하여도 상관 없다.
class Person constructor(name: String, age: Int)
{
    val name: String
    val age: Int

    // 객체를 생성하면서 원하는 값으로 한번에 초기화할 수 있도록 만들어준다.
    // 생성자도 함수의 일종이므로 디폴트 인수와 가변 인수를 사용할 수 있다.
    init {
        this.name = name
        this.age = age
    }
}

fun main(args: Array<String>)
{
    val person = Person("홍길동", 46) // 생성자를 사용하여 초기화
    println("이름: ${person.name}")
    println("나이: ${person.age}")
}