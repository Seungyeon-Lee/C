// 022 if-else를 표현식으로 사용하기

fun main(args: Array<String>): Unit
{
    // if 블록 안의 마지막 표현식이 if-else 표현식의 값이 된다.
    val value: Int = if (10 > 5)
    {
        println("10은 5보다 크다.")
        10

    }
    else
    {
        println("10은 5보다 크지 않다.")
        5
    }

    println(value) // 10

    // a, b는 Unit 타입이 되며, 의미 없는 값이 저장된다.
    val a = if(10 > 5) { }
    else { }

    val b = if(10 > 5) {
        val a = 10
    }
    else
    {
        val a = 5
    }
}