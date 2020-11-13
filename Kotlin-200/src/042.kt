// 042 패키지(Package)

package ex_package

// 패키지(Package)는 코틀린 소스 파일을 담는 폴더를 의미한다.
// 패키지 이름은 가급적 소문자로 짓는 것을 추천한다.
// 소스 파일이 폴더 1/폴더 2/폴더 3의 구조로 존재한다면 package 폴더명1.폴더명2.폴더명3으로 적는다.
// 가급적 패키지 선언과 실제 폴더 구조를 일치시키는 것이 좋다.

// a와 b 중 더 큰 수를 반환하는 함수
fun max(a: Int, b: Int): Int = if(a > b) a else b

// a와 b 중 더 작은 수를 반환하는 방법
fun min(a: Int, b: Int): Int = if(a < b) a else b

// num의 절댓값을 반환하는 함수
fun abs(num: Int): Int = if(num >= 0) num else -num