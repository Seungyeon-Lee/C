// 045 객체(Object)

fun main(args: Array<String>)
{
    // 객체에는 타입 이름이 없으므로 타입을 생략하고 선언과 동시에 초기화 한다.
    val person = object
    {
        // Property
        // 자바의 필드와 동일해보이지만 프로퍼티는 필드 + Getter + Setter가 합쳐진 개념이다.
        val name:String = "홍길동"
        val age: Int = 36
    }

    println(person.name)
    println(person.age)
}