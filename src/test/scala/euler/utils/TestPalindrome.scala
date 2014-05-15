package euler.utils

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

class TestPalindrome extends FunSuite with ShouldMatchers{
	import euler.utils.Math.isPalindrome
	
	test("hannah is a palindrome"){
		isPalindrome("hannah") should be(true)
	}
	
	test("Hannah is not a palidrome"){
	  isPalindrome("Hannah") should be(false)
	}
	
	test("abcddcba is a palindrome"){
		isPalindrome("abcddcba") should be(true)
	}
	
	test("apap is not a palindrome"){
	  isPalindrome("apap") should be(false)
	}
}