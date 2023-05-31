fun main(){
    // to assign null to a  variable
    var a:String? =null
    // compiler cant print null if your variable can store a null so
    // apply a if else condition but there is a shortcut
    println(a?.length)    // here the ? mark is a if statement and it will run only if the a is not null
    // if the text is null then the null will be printed
    // also !!. it can be used but it will throw exception if the value is null

    // using the  else if operator
    var b = a ?: "if a is null then this string will be stored in b but if its not then b=a "
    aa(45,32)
    name("rohan")
    // to define the 2nd parameter and use the default value of the 1st parameter then
    name(b = "rohan" )
    println("the sum is ${bb(34,53)}")
    println("the sum is ${varargs(34,53,43,3,53,22,3,45,54,6,43,a="rohan")}")
    // loops
    for(i in 1..10){
        // this includes 10
        println(i)
    }
    for (i in 1 until 10 step 3){     // using step also
        // this excludes 10
        println(i)
    }
    for (i in 10 downTo 1){
        // this reverses
        println(i)
    }
    // while loop
    var i=0
    while(i <100){
        println(i++)
    }
    // do while
    i=0


    uu@do{
        print(i++)
    }while(i<10)


    // continue skips or bypass a data
    // break stops the loop
    // you can name the nested loops
    i=0
    outer@ while(i<4){
        var bbb=i
        while(bbb<5){
            if(bbb==3) break@outer    // this is breaking the outer loop
            println("**$bbb")
        }
    }
}

// functions in kotlin
fun aa(a :Int , b :Int ){
    // you need to define the type of the data your fx is taking
    // the arguments are of val type so they cant change there value
    println("the sum is ${a+b}")
}
fun bb(a:Int ,b:Int):Int{
    return a+b
}
fun max(a:Int,b:Int ) : Int{                     // return type is written later
    return if(a>b)a else b
}
fun max(a:Double,b:Double ) : Double{                     // return type is written later
    return if(a>b) a else b
}fun name(a:String="name",b:String="default value" ) {                     // default value
    println("$a $b")
}

// concept of varargs
fun varargs(vararg numbers:Int , a:String):Int{       // it helps to take n number of arguments of same type
    var sum=0
    for(number in numbers ){
        sum=+number
    }
    println(a)
    return sum
}
