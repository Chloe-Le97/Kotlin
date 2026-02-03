package collections

import java.io.File

fun main(args: Array<String>) {
    val ipMap = mutableMapOf<String, Int>()

    File("src/ips.txt").forEachLine {
//        if(ipMap.containsKey(it)) {
//            val appearance = ipMap.get(it)!! + 1
//            ipMap.put(it, appearance)
//        }else {
//            ipMap.put(it, 1)
//        }
        val previous = ipMap.getOrDefault(it, 0)
        ipMap.put(it, previous + 1)

    }

    println(ipMap)
//    val mostUsedIp = ipMap.maxByOrNull { it.value }

//    if (mostUsedIp != null) {
//        println("Most used IP: ${mostUsedIp.key}")
//        println("Appearances: ${mostUsedIp.value}")
//    }

    var maxIp = ipMap.keys.first()
    var maxCount = 0

    for((ip,count) in ipMap.entries) {
        if(count > maxCount) {
            maxCount = count
            maxIp = ip
        }
    }

    println("Most frequent IP is: $maxIp which occur $maxCount")
}