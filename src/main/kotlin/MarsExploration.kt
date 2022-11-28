fun marsExploration(s: String): Int {
        // Write your code here
        val stringUpper = s.map { it.toUpperCase() }
        //println(stringUpper.toString())
        val stringNumber = stringUpper.size/3 - 1
        var count = 0

        for(i in 0.. stringNumber){
            if(stringUpper[3*i] != 'S') count++
            if(stringUpper[3*i + 1] != 'O') count++
            if(stringUpper[3*i + 2] != 'S') count++
        }
        return count
}

fun main(args: Array<String>) {
    val s = readLine()!!
    if(s.length %3 == 0) {
        val result = marsExploration(s)
        println(result)
    }
    else {
       println("Wrong Imput")
    }



}
