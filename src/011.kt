// 011 문자열(String)

fun main(args: Array<String>): Unit
{
    var str: String = "Hello"
    println(str)

    str = str + "\nKotlin!" // str += "\nKotlin!"과 동일
    println(str)

    println(str[8]) // Char 타입, 인덱스는 0부터 시작

    val num = 10 * 5 + 3
    println(str + num)
    // println("Great"[1]) 처럼 String 리터럴에도 대괄호를 사용할 수 있다. 해당 결과값은 r이다.
}