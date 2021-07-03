// 025 흐름 제어 - 반복문 while

fun main(args: Array<String>): Unit
{
    var i = 1

    // while은 특정 문장을 반복할 때 사용하는 키워드이다.
    // while의 Boolean 표현식(조건)이 true이면 블록 내부의 문장을 실행한다.
    while (i < 10)
    {
        println(i)
        i += 1
    }
}