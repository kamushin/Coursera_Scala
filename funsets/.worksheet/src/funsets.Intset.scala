package funsets

object Intset {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(81); 
  val t1 = new NonEmpty(4, new Empty, new Empty);System.out.println("""t1  : funsets.NonEmpty = """ + $show(t1 ));$skip(49); 
  val t2 = new NonEmpty(5, new Empty, new Empty);System.out.println("""t2  : funsets.NonEmpty = """ + $show(t2 ));$skip(23); 
 	val t3 = t1 union t2;System.out.println("""t3  : funsets.IntSet = """ + $show(t3 ));$skip(23); 
  val t4 = t2 union t3;System.out.println("""t4  : funsets.IntSet = """ + $show(t4 ));$skip(32); 
  val t5 = t1 union t2 union t3;System.out.println("""t5  : funsets.IntSet = """ + $show(t5 ))}
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
