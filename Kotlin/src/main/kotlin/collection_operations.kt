fun main(){
//mapping
    var a = setOf(1,2,3,4,5,6)
    println(a.map { it*10 })          // this it refers to the data of the set a         it will make each element multiplied by 10


// zipping and unzipping       make pairs of items in the two list
    var b = listOf(2,3,4,5,6,5)
    var c = listOf("rt","re","ffd","dfs","dfsh","pul")
    println(b.zip(c))
    var d = listOf("one " to 1,"two" to 2, "three " to 3)
    println(d)
    println(d.unzip())

// association     it allows you to build maps from collection and certain values associated to them
    val e = listOf("one ","two","three")
    println(e.associateWith { it.length })           // this will create a map where the  key is the list of the elements and the values are the length of the key
    println(e.associateBy { it.first().uppercase() })  // this will create a map where the key is the first char of the elements


// flattened      it converts the 2d array into 1d array
    var f = listOf(setOf(1,2,3) , setOf(4,5,6) , setOf(7,8,9))
    var g = f.flatten()
    println(g)


// joint to string
    var t=StringBuffer("hello ")
    println(e.joinTo(t))
    println(e.joinToString(" | ", "start" , "end"))  // for more customisation

// filtering    if a predicate is present then it will return true else false
    var h = listOf("dsfjs","asdfhjl","fdsafad","dsfasdfwsdf")
    println(h.filter { it.length>5 })       // condition will be checked to each of the elements
    println(a.filterIndexed{index ,value->(index<5 && value>2)})    // to check the index use flterindexed
    var i = listOf("fasdhfjhsd","sdhf",23,432,534,"dshf")
    println(i.filterIsInstance<String>())

// partition      this stores the data into two list in which one condition is matched and in other condition is not matched
    var (match,rest)= a.partition { it>3 }    // match will store all the elements where the condition is satisfied and rest will store all the elements where the condition is not satisfied
    println(match)
    println(rest)

// testing predicates      test the predicate against the testing collections
                            //  any if atleast one of the elements matches the predicate
                            //  none if all of the elements doesn't matches the predicate
                            //  all if all of the elements matches the predicate
println(e.any{it.endsWith("a")})
println(e.none{it.endsWith("a")})
println(e.all{it.endsWith("a")})


}