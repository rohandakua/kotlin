fun main(){
// plus and minus operations
    var a = mutableListOf("one","two","three","four","five")
    println(a +"six")
    println(a- mutableListOf("one","two"))     // adding and subtracting the elements

// grouping
    println(a.groupBy { it.first() })     // this will group by the first alphabet of the elements
    println(a.groupBy({it.first()}, {it.uppercase()}) )           // key selector and value is defined here , it will be grouped according to the key and the value that will be stored will be defined by the value tranformation

// driven collection parts          retrieving different part of the collections

    //SLICE
    println(a.slice(1..3))
    println(a.slice(2..4 step 2))
    println(a.slice(setOf(3,4,2)))

    //TAKE AND DROP
    println(a.take(3))          // print till index 3 from the beginning
    println(a.takeLast(1))      // print till index 1 from the end

    println(a.drop(2))          // will print from index 2 to last element
    println(a.dropLast(3))      // will print till index 3 from beginning

    //CHUNKED              it makes the group of given size
    var aa = (1..13).toList()
    println(aa.chunked(3))
    println(aa.chunked(3){it.sum()})   // it will print the sum of the group of three

    //WINDOWED
    println(aa.windowed(3))


// retrieve single element
    var b = (1.. 10).toList()
    println(b.elementAt(4))
    println(b.first())
    println(b.last())
    println(b.first{it>3})        // print the 1st element that is greater then 3
    println(b.last{it<6})         // print the last element that is smaller then 6
    println(b.random())

// aggregate operations            // return values that are commonly used
    println("the sum is ${b.sum()}")
    println("the max is ${b.maxOrNull()}")
    println("the min is ${b.minOrNull()}")
    println("the no. of items is ${b.count()}")

// comparable and comparator
    var c = mutableListOf(3,1,245,32,667,4,22,-5)
    c.sorted().forEach { println(it) }








}

data class laptops(var brand:String,val ram:Int , val price :Int ):Comparable<laptops>{
    override fun compareTo(other: laptops): Int {
        return if(this.price > other.price){
             1
        }else if (this.price <other.price ){
            -1
        }else{
            0
        }
    }

}

class comparatorRam:Comparator<laptops>{                       // it is used to compare using different
    override fun compare(laptop1:laptops , laptop2:laptops): Int {
        return if(laptop1.ram > laptop2.ram){
            1
        }else if(laptop1.ram < laptop2.ram){
            -1
        }else{
            0
        }

    }
}    

