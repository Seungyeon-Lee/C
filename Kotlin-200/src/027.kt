// 027 흐름 제어 continue

fun main(args: Array<String>): Unit
{
    var i = 0
    while(i < 10)
    {
        i += 1
        if(i % 2 == 0) // 짝수이면
            continue // conitnue 아래의 문장들을 모두 skip 한다.
        print(i)
    }
}