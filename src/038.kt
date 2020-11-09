// 038 지역 변수와 다른 함수의 지역 벼수가 중복될 때

fun main(args: Array<String>)
{
    val a = 52
    println(a)

    // 지역 변수의 이름은 가튼 스코프 내에서만 중복되지 않으면 된다.
    // 다라서 서로 다른 함수 안에 같은 이름의 변수가 존재할 수 있다.
    printA()
    printA2()
}

fun printA()
{
    val a = 17
    println(a)
}

fun printA2()
{
    val a = 120
    println(a)
}