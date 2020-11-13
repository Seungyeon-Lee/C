// 037 지역 변수와 전역 변수의 이름이 중복될 때

var a = 5

fun main()
{
    // 이름이 중복된 변수에 접근할 때는 현재 실행되고 있는 코드와 가장 가까운 스코프의 변수가 인식된다.
    val a = 30
    println(a) // 이 경우엔 main 내의 지역변수 a에 접근하게 된다.
    func()
}

fun func()
{
    println(a)
}