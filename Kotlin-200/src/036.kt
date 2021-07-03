// 036 지역 변수(Local Variable)와 전역 변수(Global Variable)

var count = 0 // 전역 변수 : 함수 호출이 끝나도 사라지지 않는다.

fun main(args: Array<String>)
{
    var a = 15 // 지역변수 : 블록 내부에서 선언한 변수는 블록 밖에 나가면 사라진다.
    println(a)

    count += 1
    printCount()
    println(count)
}

// 변수가 인식될 수 있는 범위를 스코프(Scope)라고 한다.
// 변수를 특정 블록에서만 사용한다면 지역 변수로 써주는 것이 좋다.
fun printCount()
{
    println(count)
    count += 1
}