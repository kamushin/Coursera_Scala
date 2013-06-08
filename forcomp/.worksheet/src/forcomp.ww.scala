package forcomp
object ww {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(198); 

  def Yc(f:(Any,Int) => Int): Int => Int = {
    def f_gen(self:Any):(Int => Int) = {
				f(self.asInstanceOf[Any=> (Int => Int)](self),_:Int)
    }
    f_gen(f_gen)
  };System.out.println("""Yc: (f: (Any, Int) => Int)Int => Int""");$skip(122); 

  def P(self: Any, n: Int): Int = {
    if (n == 0) 1
    else n * self.asInstanceOf[(Any, Int) => Int](self, n - 1)
  };System.out.println("""P: (self: Any, n: Int)Int""");$skip(109); 

  def p(self: Any, n: Int): Int = {
    if (n == 0) 1
    else n * self.asInstanceOf[Int => Int](n - 1)
  };System.out.println("""p: (self: Any, n: Int)Int""");$skip(8); val res$0 = 
  Yc(p);System.out.println("""res0: Int => Int = """ + $show(res$0))}
//  val f: (Any, Int) => Int = P
//  val F = f(f, _: Int)
//  p(F, 3)

  // F(3)

}
