package recfun
import common._

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
  def pascal(c: Int, r: Int): Int =
    if (r == 0 || c == 0 || c == r) 1
    else
      pascal(c - 1, r - 1) + pascal(c, r - 1)

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def find(chars: List[Char], num: Int): Boolean =
      if (chars.isEmpty && num == 0)
        true
      else if (chars.isEmpty && num != 0)
        false
      else if (chars.head == '(')
        find(chars.tail, num + 1)
      else if (chars.head == ')')
        if (num == 0) false
        else find(chars.tail, num - 1)
      else
        find(chars.tail, num)
    find(chars, 0)
  }
  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def sum(money: Int, coins: List[Int], curValue: Int, add: Int): Int = {
      if (curValue > money) 0
      else
        count(money, coins, curValue) + sum(money, coins, curValue + add, add)
    }
    def count(money: Int, coins: List[Int], curValue: Int): Int = {
      if (curValue == money) 1
      else if (coins.isEmpty) 0
      else {
        sum(money, coins.tail, curValue, coins.head)
      }
    }
    count(money, coins, 0)
  }
}
