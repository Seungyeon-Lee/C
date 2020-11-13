// 019 흐름 제어 - 조건문 if

fun main(args: Array<String>): Unit
{
    var a = 15
    var b = 11

    if(a > b) // if(Boolean 타입 표현식) = 조건아 true일 때 실행된다.
    {
        println("if 안으로 들어옴") // if문에 속한 문장이 하나일 땐 중괄호를 생략할 수 있다.
        a -= b
    }

    println(a)
}