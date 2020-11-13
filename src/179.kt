// 179 String?.plus 연산자 확장 함수

fun main(args: Array<String>)
{
    val nullStr: String? = null
    println(nullStr + "테스트") // nullStr는 String 타입이므로 + 연산자를 사용하면 String?.plus 연산자 확장 함수가 호출된다.
}