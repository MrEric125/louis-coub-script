
Short.MaxValue

"100".toInt

"100".toDouble

"100".toLong



/**
 *
 * @param s
 */
implicit class StringToInt(s:String){

  @throws(classOf[NumberFormatException])
  def toInt(radix:Int)=Integer.parseInt(s,radix)

}

val range=1 to 10
val arr=range.toArray
for(e<-arr) println(e)

for(e<- arr)  yield{
  e*10
}
arr.foreach(println)


arr.map(f => f*10)

for {
  i <- 1 to 10
  if (i % 2 == 0)

} println(i)
val fruits="apple":: "banana":: "Orange"::Nil
fruits.map(i=>i.toUpperCase)
fruits.map(_.toUpperCase)


def echoWhatYouGaveMe(x:Any):String=x match {
  case 0=>"zero"
  case Nil => "an empty List"
  case List(0,_,_)=> "a three item list"
  case List(1,_*) => "a list of beginning with 1"
}
echoWhatYouGaveMe(List(1,2,3,4))

object Whilst{
  def whilst(testCondition : =>Boolean)(codeBlock : =>Unit){
    while (testCondition){
      codeBlock
    }
  }
  def whilst2(testCondition : =>Boolean)(codeBlock : =>Unit){
    while (testCondition){
      codeBlock
      whilst2(testCondition)(codeBlock)
    }
  }
}
import Whilst._

import java.time.LocalDate
object WhilstDemo extends App{
  var i=0
  whilst(i<5){
    println(i)
    i+=1
  }
}

val symbols = fruits.toList
// scala在函数中大括号与小括号之间的区别
val (topStock,topPrice)=symbols.map{ticker=>(ticker,ticker.length())}.maxBy(stockPrice=>stockPrice._2)

val (topStock,topPrice)=symbols.map(ticker=>(ticker,ticker.length())).maxBy(stockPrice=>stockPrice._2)

def getYearEndClosingPrice(symbol:String,year:Int): Unit ={
}

def madMethod()={
  throw new IllegalArgumentException

}

/**
 * todo
 * 这里几个常用的区分开来
 * 1. some
 * 2. any
 * 3. nothing
 * 4. anyRel
 * 5. Either
 * @author importance: everything is object
 *
 * ...
 * @param input
 */
def commentOnPractice(input:String): Unit ={
  if (input=="test")
    Some("good")
  else None

}

class DateHelper(int: Int){
  def days(when:String):LocalDate={
    val today=LocalDate.now

    when match {
      case "ago"=>today.minusDays(int)
      case "from_now"=>today.plusDays(int)
      case _=>today
    }
  }
}
object DateHelper{
  val age="ago"
  val from_now="from_now"

  implicit def convertIntToDateHelper(offset:Int):DateHelper=new DateHelper(offset)

}

import DateHelper._

object DaysDSL extends App{
  val past=2 days age
  val appointment =5 days from_now

  println(past)

  println(appointment)
}
DaysDSL


