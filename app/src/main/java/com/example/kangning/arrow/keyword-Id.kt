package com.example.kangning.arrow

import arrow.core.Eval
import arrow.core.Id

fun operation_Id() = Id("1")/*.map { it + "2" }.flatMap { it -> Id(Integer.valueOf(it)+0) }.*/
        .foldRight(Eval.just(1)) { a: String, b: Eval<Int> ->
            Eval.just(2)
        }. value()

val eval = Eval.One
/*   foldLeft("a",{
       a:String,b:Int ->  a
   })
*/

