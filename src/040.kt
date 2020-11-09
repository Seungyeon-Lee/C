// 040 메모리의 스택(Stack) 영역

fun main(args: Array<String>)
{
    val a = -36
    val result = absoulte(a)
    println(result)
}

// 입력받은 정수의 절대값을 반환하는 함수
fun absoulte(number: Int) : Int
{
    return if(number >= 0)
        number
    else -number
}