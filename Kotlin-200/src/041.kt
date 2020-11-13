// 041 소스 파일 여러 개로 분리하기

// a와 b 중 더 큰 수를 반환하는 함수
fun max(a: Int, b: Int): Int = if(a > b) a else b

// a와 b 중 더 작은 수를 반환하는 방법
fun min(a: Int, b: Int): Int = if(a < b) a else b

// num의 절댓값을 반환하는 함수
fun abs(num: Int): Int = if(num >= 0) num else -num

fun main(args: Array<String>)
{
    val a = 20
    var b = -30

    print(max(a, abs(b))) // 같은 패키지일 때, 파일이 분리되어 있어도 함수에 접근 가능하다.
}