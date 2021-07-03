// 034 가변 인수

fun main(args: Array<String>)
{
    println(getSumOf(1, 2, 3, 4, 5, 6, 7))
    println(getSumOf(32, 57, 12))
    println(getSumOf())
}

// vararg 키워드를 사용하면 여러 개의 인수를 받을 수 있게 된다.
// 이러한 가변 인수는 일반 인수와 함께 사용 가능하다.
fun getSumOf(vararg numbers: Int): Int
{
    val count = numbers.size
    var i = 0
    var sum = 0

    while(i < count)
    {
        sum += numbers[i]
        i += 1
    }

    return sum
}