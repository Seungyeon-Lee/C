// 186 FileTreeWalk 클래스: 디렉토리 순회하기

import java.io.File

fun main(args: Array<String>)
{
    val fileTree: FileTreeWalk = File("./").walk() // walk의 매개 변수인 FileWalkDirection는 파일 순회 방향을 나타내며 기본 값은 TOP_DOWN이다.
            .maxDepth(3) // 탐색할 하위 디렉토리의 최대 깊이를 지정하는 멤버 함수이다. (이 함수를 호출하지 않으면 최하위 디렉토리까지 계속 순회한다.
            .onEnter { file ->
                println("새 디렉토리 방문: ${file.name}")
                true
            }

    for(file in fileTree)
        println(file.name)

}