// 031 매개변수(Parameter)와 인수(Argument)

fun main(args: Array<String>): Unit
{
    println(cToF(30))
    println(getAverage(89, 96))
}

// 섭씨 온도를 화씨 온도로 변환하는 함수
fun cToF(celsius: Int): Double
{
    return celsius * 1.8 + 32
}

fun getAverage(a: Int, b: Int): Double
{
    return (a + b) / 2.0
}