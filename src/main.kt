fun main() {
    nums(7)
    println(printNames(arrayOf("Sharon","Anota","Lubembe","cat")))
    println(drinks("milk",))
    compare(21)

}
fun nums(number:Int){
    for(y in 0..100){
        if((y % 2)!=0)
            println(y)
    }

}
fun printNames(name:Array<String>):Int{
    var num=0
    name.forEach { u ->


        if (u.length == 5) {
            num++
        }
    }
    return num

    }
fun drinks(Name:String) {
    var kids = 6

    if (kids == 6) {
        println("milk")
    }
    else if (kids == 15) {
        println("fanta")
    }
    else{
        println("cocacola")
    }

}
fun compare(nims:Int){
    var l=0
    for (l in 0..100){
      if((l%3)==0) {
          println("Fizz")
      }
        else if(l%5==0){
            println("Buzz")
        }
    }
     if (l%3 ==0 && l%5==0){
        println("FizzBuzz")
    }

    }




