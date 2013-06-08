package funsets

object Intset {
  val t1 = new NonEmpty(4, new Empty, new Empty)  //> t1  : funsets.NonEmpty = {.4.}
  val t2 = new NonEmpty(5, new Empty, new Empty)  //> t2  : funsets.NonEmpty = {.5.}
 	val t3 = t1 union t2                      //> t3  : funsets.IntSet = {{.4.}5.}
  val t4 = t2 union t3                            //> t4  : funsets.IntSet = {{.4.}5.}
  val t5 = t1 union t2 union t3                   //> t5  : funsets.IntSet = {{.4.}5.}
  //  println("Welcome to the Scala worksheet")
}

abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def union(other: IntSet): IntSet
}
class Empty extends IntSet {
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty)
  def union(other: IntSet) = other
  override def toString = "."
}
class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true
  def incl(x: Int): IntSet =
    if (x < elem) new NonEmpty(elem, left incl x, right)
    else if (x > elem) new NonEmpty(elem, left, right incl x)
    else this
  override def toString = "{" + left + elem + right + "}"
  def union(other: IntSet) =
    ((left union right) union other) incl elem
}