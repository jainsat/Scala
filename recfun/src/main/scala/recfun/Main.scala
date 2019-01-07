package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = if (c==0||c==r) 1 else pascal(c-1,r-1) + pascal(c,r-1)
  
  /**
   * Exercise 2
   */
def balance(chars: List[Char]): Boolean = {
def balance(index : Int, flag : Int) : Boolean = {
if (flag<0) false
else if (index==chars.length && flag !=0) false
else if (index==chars.length && flag ==0) true
else if (chars(index)=='(') balance(index+1, flag+1)
else if (chars(index)==')') balance(index+1, flag-1) else balance(index+1,flag)
}
if (chars.isEmpty) true else balance(0,0)
}                                                 //> balance: (chars: List[Char])Boolean
balance(":-)(".toList)                            //> res3: Boolean = false

def countChange(money: Int, coins: List[Int]): Int = {
 
 def count(money : Int, i : Int) : Int = {
 //println(money,i);
 if (money==0) 1;
 else if (money < 0) 0;
 else {
 var res = 0;
 for (j <- i to coins.length-1) {
   var tmp = count((money - coins(j)), j);
   res = res + tmp;
 }
 res
 }
 }
if (money==0) 1 else if (coins.isEmpty) 0 else count(money, 0)
}  
}
