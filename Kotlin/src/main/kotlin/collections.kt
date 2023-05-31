// they are the group of objects stored in a single variable
// list , set and map ( both of mutable and immutable type)
fun main() {
// list
    // immutable list
    var a = listOf<String>("rohan ","ramesh","rahul")
    a.forEach { println(it) }  // this prints the list


    //mutable list
    val b = mutableListOf("tohan","riahn","sdjhfj")
    b.remove("tohan")
    b.add(1,"toajj")
    b.forEach { println(it) }

// set      it is a collection where you can store only unique elements
    var c = setOf<String>("rohan","thsa","djfhs")  // no duplicate elements can be there

    // mutable  set
    var d = mutableSetOf<Int>(3,4,2,5,677)
    d.add(42)
    d.forEach { it }
// maps             use to store key value pairs
    val e = mapOf<Int,String>(1 to "rohan",2 to "mohan",3 to "sohan")
    e.forEach { t, u ->
        println("$t is mapped to $u")
    }

    // mutable map
    val f = mutableMapOf(3 to 4 , 4 to 3 , 2 to 5)
    f[5]=6
    f.remove(4)
    f.forEach { t, u ->
        println("$t is mapped to $u")
    }



}