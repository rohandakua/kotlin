// abstract classes          here you can declare properties unlike the interfaces
                        // they are only created to be inherited from other class

abstract class utensils{
    abstract fun type()  // this is an abstract function that needs to be programmed into the class where this class is being inherited
    fun time (){
        println("3 hours ")
    }
}

class plate (var a :String , var b:Int):utensils(){
    override fun type() {
        println("the shape is plate")
    }
}

fun main(){
        // equality
    // structural equality
    var name1="rohan"
    var name2="rohan1"
    if(name1==name2){       // structural equality
        println("equal")
    }
    // referential equality

    if(name1===name2){
        println("same variable")
    }else{
        println("different variable")
    }
    var q1 = abs(34,"r")
    var q2 = abs(34,"r")
    if(q1==q2){                  /// comparing two objects
        println("they are same")
    }
}


// data classes
// in kotlin there is a class named any that is inherited by every data classes in kotlin (there are some methods that are override )
class abs(var a :Int , var b :String ){
    override fun equals(other: Any?): Boolean {
        if(this===other ){              // this statement checks that if same objects are being compared or not
            return true;
        }
        if(other is abs){ // this line make sure that the other object is a abs type
            return this.a ==other.a && this.b==other.b
        }else{
            return false                          // this programme checks if the two object that are compared are equal or not
                                             // this fx override the equals function in the any class
        }
    }
}
//  IMPORTANT all this can be done by putting a data keyword ahead of the class


   // interfaces          they can't be initiated as they can be only implemented by a class
interface engine{
    fun startengine ()              // now the method must not be defined here as it is to be defined in the class where it is implemented (it is mandatory )
}
class veh (var t:String ):engine{
    override fun startengine() {            // this defines the method startengine of the interface
        println("$t vroom vroom ")
    }
}


 // delegation                                  giving power from one class/instance  to another class/instance
                                                 // from inheritance you can inherit from only one class but using delegation you can inherit form multiple class

interface a {
    fun aa()
}
interface b{
    fun bb()
}
open class aaa :a{
    override fun aa() {
        println("hello")
    }
}
open class bbb :b{
    override fun bb() {
        println("hello")
    }
}
// now there are two classes and we need to implement both the class in a single class then
class ccc: a by aaa() , b by bbb(){                    // it is now inheriting both the class
    override fun aa() {
        println("hello")
    }

    override fun bb() {
        println("hello")
    }
}
