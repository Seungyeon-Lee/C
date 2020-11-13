// 120 배열(Array)

/*
class Array<T>
{
    val size: Int // 배열의 원소 개수를 나타낸다.
    operator fun get(index: Int): T // get/set은 배열을 [] 연산자로 접근할 수 있게 해준다.
    operator fun set(index: Int, value: T): Unit
    operator fun iterator(): Iterator<T> // iterator는 배열을 for 문에 쓸 수 있게 해준다.
}
 */

fun main(args: Array<String>)
{
    val integers: Array<Int> = arrayOf(10, 20, 30, 40)

    println(integers.size) // 원소 개수 출력
    println(integers[1])

    for(i in integers)
        print("$i ")
}