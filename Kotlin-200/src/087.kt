// 087 확장 프로퍼티(Extension Property)

package ex_extension_property

// 문자열이 큰지 판단하는 확장 프로퍼티
// 리시버 타입.확장 프로퍼티
val String.isLarge: Boolean // 프로퍼티이므로 소괄호를 적지 않는다.
    get() = this.length >= 10 // 확장 프로퍼티에는 Field가 존재하지 않기 때문에 field 식별자는 사용할 수 없다.

fun main(args: Array<String>)
{
    println("1234567890".isLarge) // true
    println("500원".isLarge) // false
}