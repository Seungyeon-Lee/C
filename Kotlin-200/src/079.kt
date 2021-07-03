// 079 스마트 캐스팅

fun main(args: Array<String>)
{
    val number: Int? = null
    val number2 = 1225

    checkNull(number)
    checkNull(number2)
}

fun checkNull(any: Any?)
{
    if(any == null)
    {
        println("null이 들어왔습니다.")
        return
    }

    println(any.toString()) // any가 null이 아니란 것을 추론 가능하므로 자동으로 Not-null 타입이 된다.
}