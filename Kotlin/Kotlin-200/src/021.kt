// 021 if와 else의 중첩

fun main(args: Array<String>): Unit
{
    val score = 88

    if(score >= 90)
        println('A')
    else
    {
        if(score >= 80) // 해당 식을 else if를 사용하여 변환할 수 있다.
            println('B')
        else
        {
            if(score >= 70)
                println('C')
            else
                println('F')
        }
    }
}