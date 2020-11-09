// 049 문자열간 + 연산 시 주의점

fun main(args: Array<String>)
{
    // 코틀린에서 Byte, Short, Int, Long, Float, Double, Char, Boolean 타입을 제외한 타입은 모두 참조 타입
    var first = "Hello"
    var second = "World"
    first += second // + 연산을 하게 되면 원래 갖고 있던 문자열에 새로운 문자열이 덧붙여지는 것이 아닌, 기존 문자열은 남아있고, 합쳐진 문자열이 새로 생성된다.
}