// 009 실수 타입의 함정

fun main(args: Array<String>) : Unit
{
    println(0.1f + 0.1f + 0.1f)
    // 오차가 10번 누적되어 상황에 따라 정확한 값을 가리킬 수 없다.
    // 실수 계산 시에는 항상 대략적인 값만 얻을 수 있다는 것을 염두한다.
    println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f)
    println(0.1f * 10)
}