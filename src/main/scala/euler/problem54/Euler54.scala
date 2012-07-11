package euler.problem54

import scala.collection.immutable.TreeSet

class Euler54 {

}

class Hand(cards:TreeSet[Card]){
  val cardsOccurences = occurences
    
  def occurences = {
    var occ = Map[Int,Int]()
    occ
  }
  
  def highest = cards.last
  
}

class Card(val value:Int,val color:Char) extends Comparable[Card]{
	def compareTo(card:Card) = {
	  val rep = value.compareTo(card.value)
	  if(rep==0) color.compareTo(card.color) else rep
	}
}
