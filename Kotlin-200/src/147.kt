// 147 컬렉션 원소 타입 변환하기

package ex_collection_map

fun main(args: Array<String>)
{
    val origin = listOf(65, 66, 67, 68, 69)

    println(origin.map { it.toChar() }) // 기본적인 기능은 T 타입의 원소를 R 타입의 원소로 변환하는 것이다.

    println(origin.mapIndexed { index, element -> // 변환 함수에 index 매개 변수를 추가한 버전이다.
        println("[$index]: $element")
        element.toChar()
    })

    val to100 = 1 .. 10
    println(to100.mapNotNull { // 변환 함수가 null을 반환하면 결과에서 제외한다.
        if(it % 3 == 0) it // 원소가 3의 배수이면 그대로 반환하고, 아니면 null을 반환한다.
        else null
    })
}