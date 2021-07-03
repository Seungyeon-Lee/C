// 033 디폴트 인수

fun main(args: Array<String>)
{
    println(getAverage(89, 96))
    getAverage(100, 50, true)
    println(getAverage(90))
    getAverage(66, print = true) // 매개변수의 이름을 지정한 인수는 일반 인수들보다 항상 오른쪽에 있어야 한다.
    getAverage(print = true)
    getAverage(print = true, a = 10, b = 30) // 매개변수 이름을 직접 지정하면 인수의 위치를 마음대로 할 수 있다.
}

// 함수 호출 시 해당 매개변수에 인수를 지정하지 않아도 된다.
// 인수가 지정되지 않은 매개변수는 디폴트 값으로 초기화된다.
fun getAverage(a: Int = 0, b: Int = 0, print: Boolean = false): Double
{
    var result = (a + b) / 2.0
    if(print)
        println(result)
    return result
}