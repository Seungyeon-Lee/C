// 075 Nullable 타입과 null

import ex_upcasting.Person

fun main(args: Array<String>)
{
    // 자바는 모든 참조 타입에 기본적으로 null을 지정할 수 있지만 코틀린에서는 Nullable하지 않으면 null을 지정할 수 없다.
    var person: Person? = Person("K", 30) // ?를 붙이면 변수를 Nullable하게 만들 수 있다.
    person = null // Nothing? 타입의 표현식

    var num: Int? = null // Byte, Short, Int, Long, Float, Double, Char, Boolean 타입 뒤에 ?를 붙이면 참조 변수가 된다. (힙 영역에 생성)
    num = 10

    if (true) "Test" else null // "Test"는 String, null은 Nothing? 타입이므로, 둘이 합쳐진 String? 타입이 된다.
}