        fun main(args: Array<String>) {
                // two types of variables
                val a = 2 // for static

                var b = 3
                // ^^ this can auto detect the file type
                var c: Int = 45
                // to print the data
                println(" printing the data $a and  $b")
                // $ it is used to define an expression     syntax    ${}
                println(" using $ for expression ${a + b + c} ")

                // if else statement are same as java
                                                 // when statement          similar to switch case in c    else is necessary
                                                 //                        it can be use purposefully
                //
                 when(a){
                         12,5,6,7 -> println("12 executed")
                         13 -> println("12 executed")
                         14 -> println("12 executed")
                         in 20..30-> {
                                 println("range")
                                 println("ok")
                         }   // for range
                         else -> println("12 executed")
                 }
                var d= when {
                        b==2 || b==3-> "this will be stored in the var d"

                        a==5->  "this will be stored "
                        else-> "else is necessary for when "
                }

        }
