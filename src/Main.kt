//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var addition = sum(5,5)
    println(addition)

    var sentence=reverseString("I am Jane Kibaara")
    println(sentence)

    var factor=12
    println(factor)

}
//Write a Kotlin function named sum that takes two integers as parameters and returns their sum. Print the result.
fun sum(x:Int,y:Int):Int{
    var number = x + y
    return number
}


//Write a Kotlin function named reverseString that takes a string as a parameter and returns the reversed version of the string. Print the reversed string.
fun reverseString(a:String):String{
    return a.reversed()
}


fun factorial(a:Int):Int{
    for(i in 1..a){
        if(a % i == 0){
            return i
        }
    }


}
