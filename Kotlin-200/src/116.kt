// 116 in/out 키워드

package ex_kotlin_in_out

class AAA<out T> // AAA<서브 타입>을 AAA<슈퍼 타입>에 대입할 수 있다. 자바의 ? extents T와 같다.

class BBB<in T> // BBB<슈퍼 타입>을 BBB<서브 타입>에 대입할 수 있게 된다. 자바의 ? super T와 같다.

fun main(args: Array<String>)
{
    val aaaSub = AAA<Int>()
    val aaaSuper: AAA<Any> = aaaSub

    val bbbSuper = BBB<Any>()
    val bbbSub: BBB<Int> = bbbSuper

    val star: AAA<*> = aaaSub // 타입 인수로 *을 지정하면, 타입 인수가 무엇이든 상관없이 AAA 타입을 대입할 수 있다.
}