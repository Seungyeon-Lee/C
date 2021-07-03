// 078 엘비스 연산자(Elvis Operator) ?:

fun main(args: Array<String>)
{
    // 엘비스 연산자는 왼쪽의 피연산자가 null이 아니면 그 값을, null 이면 우측의 피연산자로 대체하는 연산자이다.
    val number: Int? = null
    println(number ?: 0) // 0

    val number2: Int? = 15 // 힙에 15가 생성되고, number2는 그에 대한 참조값이 저장된다.
    println(number2 ?: 0) // 15

    // 자바에서의 (str != null) ? str : "Hello"는 str ?: "Hello"와 같다.
}