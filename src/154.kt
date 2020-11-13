// 154 CharSequence 쪼개기

package ex_char_sequence_split

fun main(args: Array<String>)
{
    val hello: CharSequence = "안녕하세요.\n고맙습니다.\n반갑습니다."
    val time: CharSequence = "2018-01-22"

    println(hello.lines()) // lines는 개행 문자 \n을 기준으로 CharSequence를 쪼개 List<String> 타입으로 반환한다.
    for (line in hello.lineSequence()) // lineSequence는 개행 문자 \n을 기준으로 CharSequence를 쪼개 Sequence<String> 타입으로 반환한다.
        println(line) // Sequence는 toString을 적절히 오버라이딩하지 않으므로 for문을 돌려 일일이 문자열 조각들을 출력하였다.
    
    println(time.split('-')) // 입력받은 delimiters로 문자열을 쪼개고, limit을 지정하면 최대 몇 조각으로 쪼갤 것인지를 지정한다. (0으로 지정하면 쪼갤 수 있을 때까지 문자열을 쪼갠다. 기본값은 0이다)
}

