// 094 동반자 객체의 확장 함수

package ex_extension_funciton_companion_object

class Person { companion object }

fun Person.Companion.create() = Person() // 동반자 객체에 create 함수를 주입한다.

fun main(args: Array<String>) = Person.create() // 동반자 객체에 주입된 create 함수를 호출한다.