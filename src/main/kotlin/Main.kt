fun main() {

    val max = getMaximum(1,2,3,4,5,6,7,8,9,4,2,1)
    println("the maximun number is $max")

}

fun getMaximum(vararg numbers: Int): Int{
    var max = numbers[0]
    for (number in numbers){
        if (number > max){
            max = number
        }
    }
    return max
}