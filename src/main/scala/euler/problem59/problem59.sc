package euler.problem59

object problem59 {

	val c = 79.toChar.toString                //> c  : java.lang.String = O
	val key = "aaa"                           //> key  : java.lang.String = aaa
	val cypher = (c(0)^key(0)).toChar         //> cypher  : Char = .
	(79^key(0)).toChar                        //> res0: Char = .
	val decypher = (cypher^key(0)).toChar     //> decypher  : Char = O
	79.toChar                                 //> res1: Char = O
	
	""+("79".toInt^key(0)).toChar+("79".toInt^key(1)).toChar+("79".toInt^key(2)).toChar
                                                  //> res2: java.lang.String = ...
	
	("79".toInt^key(0))                       //> res3: Int = 46
	
	0+'A'                                     //> res4: Int(65) = 65
	
	(0/:"AA")(_+_)                            //> res5: Int = 130
	
	
	"abcdef".dropRight(2)                     //> res6: String = abcd
}