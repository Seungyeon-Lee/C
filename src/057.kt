// 057 보조 생성자(Secondary Constructor)

class Time(val second: Int)
{
    init {
        println("init 블록 실행 중")
    }

    // 보조 생성자 1
    constructor(minute: Int, second: Int) : this(minute * 60 + second) // 클래스에 주 생성자가 존재한다면, 주 생성자를 반드시 먼저 호출해주어야 한다.
    {
        println("보조 생성자 1 실행 중")
    }

    // 보조 생성자 2
    constructor(hour: Int, minute: Int, second: Int) : this(hour * 60 + minute, second) // 클래스에 포함된 또 다른 생성자를 호출하는 문법

    init {
        println("또 다른 init 블록 실행 중")
    }
}

fun main(args: Array<String>)
{
    println("${Time(15, 6).second} 초") // 906 초
    println("${Time(6, 3, 17).second} 초") // 21797 초
}