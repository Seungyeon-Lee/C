// 058 프로퍼티와 Getter/Setter

package ex_func_in_another_package

class Person
{
    // 프로퍼티에는 변수뿐만 아니라 Getter/Setter라고 부르는 특수 함수도 포함되어 있다.
    var age: Int = 0
        get() // getter의 반환 타입은 어차피 프로퍼티 타입과 같기 때문에 생략이 가능하다.
        {
            return field
        }
        set(value) // setter
        {
            field = if(value >= 0) value else 0 // field는 실제로 값이 저장된 프로퍼티 속의 변수를 나타내는 특수 식별자이다.
            // defalut의 경우 field = value, 커스터마이징 하고싶다면 별도로 정의해 주어야 한다.
        }

    /*
    var age = 0
        get
        set
     */

    var name = ""
        get() = "이름: $field" // var 프로퍼티이고, Getter의 반환값이 field가 아니라면 프로퍼티 타입을 생략할 수 있다 (반환 타입으로 프로퍼티 차입을 추론)
    val isYoung get() = age < 30
}

fun main(args: Array<String>)
{
    val person = Person()
    person.age = -30 // 프로퍼티에 특정 값을 대입하면 해당하는 setter 호출
    println(person.age) // 프로퍼티에 해당하는 getter 호출
}