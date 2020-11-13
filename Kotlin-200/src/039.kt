// 039 지역 함수(Local Function)

fun main(args: Array<String>)
{
    // 지역 함수 : 블록 안에 선언된 함수
    fun printFomular(a: Int, b: Int)
    {
        println(a * b + a - b)
    }

    printFomular(73, 1)
    printFomular(4, 6)
}