// 051 ===, !== 연산자

fun main(args: Array<String>)
{
    var a = "one"
    var b = "one"

    // 두 참조 변수가 같은 객체를 가리키고 있는 지의 여부
    println(a === b) // true

    b = "on" // 표현식이 리터럴로만 이루어져 있지 않으면, 동일한 문자열을 저장하고 있다 하더라도 새로운 문자열이 만들어진다.
    b += "e"
    // 두 참조 변수가 서로 다른 객체를 가리키고 있는 지의 여부
    print(a !== b) // true

    b = a
    // 코틀린의 === 는 자바의 == 연산자와 같다.
    // 코틀린의 == 연산자는 자바의 equals와 같다.
    println(a === b) // true
}