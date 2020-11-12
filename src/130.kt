// 130 Triple 클래스: 세 변수를 하나로 묶기

package ex_triple
// 원의 지름, 원주, 넓이를 반환한다.
fun calculateCircle(radius: Int) : Triple<Int, Double, Double> =
        Triple(radius * 2, radius * 2 * 3.14, 3.14 * radius * radius) // Triple 클래스는 제네릭을 이용하여 세 가지 타입의 값을 보관한다.

fun main(args: Array<String>)
{
    val (diameter, _, area) = calculateCircle(5) // 데이터 클래스이므로 여러 변수로 분해할 수 있고, 샤용하지 않을 값을 _로 무시하고 있다.
    println("지름: $diameter")
    println("넓이: $area")
}