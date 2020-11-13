// 010 문자 타입

fun main(args: Array<String>): Unit
{
    var ch: Char = 'A' // 문자 1개만 저장 가능. 문자 한 개를 작은따옴표로 감싸면 Char 타입과 동일하다.
    println(ch)

    ch = '\uAC00'
    println(ch)

    ch = '한'
    println(ch.toInt()) // ch 타입의 표현식에서 .toInt()를 사용하면 해당 문자의 유니코드 값을 갖는 Int 타입으로 변화한다.
}