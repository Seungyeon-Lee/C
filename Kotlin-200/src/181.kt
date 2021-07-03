// 181 인수(Argument) 검증하기

fun func(num: Int?)
{
    checkNotNull(num) // 인수로 전달한 값이 null이면 IllegalStateException 예외를 던진다. null이 아니면 그대로 Non-null 타입으로 캐스팅하여 그대로 반환한다.
    check(num!! >= 0) // 인수로 전달한 값이 false이면 IllegalStateException 예외를 던진다.
}

fun func2(num: Double?)
{
    requireNotNull(num) // 인수로 전달한 값이 null이면 IllegalArgumentException 예외를 던진다. null이 아니면 그대로 Non-null 타입으로 캐스팅하여 그대로 반환한다.
    require(num!!.isNaN()) // 인술 전달한 값이 false이면 IllegalArgumentException 예외를 던진다.
}

fun main(args: Array<String>)
{
    func(10)
    func2(0.0 / 0.0)
}