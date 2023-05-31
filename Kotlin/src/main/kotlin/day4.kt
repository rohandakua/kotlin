fun main(){
    // lateinit    this stand for late initialisation
    var s=abc(23,32)
    s.r="rohan";    // later intialised
    println("${calculator.sum(53,232)} ${calculator.c} ")
    println("${database.getInstance()}")
    var t=database
    println("${t.getInstance()}")
    // using the short method
    println(data)

    /// lazy intialisation                           this initialize the object when the object is in use
    var d=lazy(34,53,32)  // this gets initialized immediately
    val e:lazy by lazy {                          // val is used when lazy is used
        lazy(21,43,65)
    }
    e.a     // this is used here so the object will be initialized here

    // enum class
    println(direction.east.a)
    println(direction.east.b)
    println(direction.east.name)             // this is  defined automatically by the system
    println(direction.north.a)
    for(aa in direction.values()){
        println(aa.a)
        println(aa.b)
        println(aa.name)
        println("looping")

    }

    var tt=list(23)
    var k = tt.listitems(53)
    k.show()


    var ob1=bikes("abc","yellow",2,200)
    var ob2= cars("abc","green",4,300)
    println(ob1.move())
    println(ob2.move())



    val aaa=result.success("hey")
    val bbb=result.error("ohohohoh")
    getData(aaa)
    getData(bbb)

 }
class abc(var a:Int ,var b:Int) {
    lateinit var r: String     // only for primitive data type

}
// companion object                this doesn't require a object to call it
class calculator(){
    companion object{      // this stores the property that is specific to the class and doesn't require a object to call
        fun sum(a :Int ,b:Int ):Int{
            return a+b;
        }
        var c = 344;
    }
}
// singelton = only one instance of a particular object
            // if you have multiple instances then multiple data will be created
class database private constructor(){
    companion object{
        private var instance:database?=null
        fun getInstance():database?{
            if(instance == null){
                instance=database()      // this is eg of singelton that creates a database that is unique
            }
            return instance             ///  this fx gives the location of the database and it is constant

        }
    }
}                                                // this can be achieved in a simpler way

object data{
    init{
        println("database created")
    }
}

         // lazy initialisation
// it is used when the initialisation is expensive i.e. takes time and memory

 class lazy(var a: Int ,var b :Int , var c :Int ){
     init {
         println("the no. are $a $b $c")
     }
 }

// enum classes       they are like constants that can have fixed properties and methods \
 enum class direction (var a :String , var b :Int){
    north ("north",31),                            // this are not object , this are a type of class
    south("south",28),
    east("east",44),
    west("west",18);
 }



// inner classes

class list(var a:Int){
    inner class listitems(var b:Int){
        fun show(){
            println("$a  $b")
        }
    }
}

// inheritance in kotlin

open class vehicle(var brand:String , var color:String){                // open keyword is required to make it inheritable
    open fun move(){                                // this open is used to override a fx
        println("the vehicle is moving")
    }
    fun desc(){
        println("the vehicle is of $color color and of $brand brand")
    }
}
class bikes(brand:String , color :String , var tyre :Int , var topspeed :Int):vehicle(brand,color){   // you need to initialize the base class
    fun tops(){
        println("the top speed of the bike is $topspeed")
    }
}
class cars(brand:String , color :String , var tyre :Int , var topspeed :Int):vehicle(brand,color){   // you need to initialize the base class
    fun tops(){
        println("the top speed of the car is $topspeed")
    }

    override fun move() {
        println("the car is moving very fast")

    }

}


// sealed classes                 bcs enum classes cant have additional parameters so the concept of sealed classes

sealed class result(var msg:String){
    class success (msg :String ):result(msg)                                       // these are two classes inside the sealed class
    class error (msg :String ):result(msg)
    fun shmsg(){
        println("the result is $msg")
    }
}
// now defining a fx
fun getData(re:result){
    when(re){
        is result.error -> re.shmsg()                              // this are the two possibilities that can happen
        is result.success -> re.shmsg()
    }
}





