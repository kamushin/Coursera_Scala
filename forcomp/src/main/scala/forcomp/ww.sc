package forcomp
object ww {

  def Yc(f:(Any,Int) => Int): Int => Int = {
    def f_gen(self:Any):(Int => Int) = {
				f(self.asInstanceOf[Any=> (Int => Int)](self),_:Int)
    }
    f_gen(f_gen)
  }

  def P(self: Any, n: Int): Int = {
    if (n == 0) 1
    else n * self.asInstanceOf[(Any, Int) => Int](self, n - 1)
  }

  def p(self: Any, n: Int): Int = {
    if (n == 0) 1
    else n * self.asInstanceOf[Int => Int](n - 1)
  }
  Yc(p)
//  val f: (Any, Int) => Int = P
//  val F = f(f, _: Int)
//  p(F, 3)

  // F(3)

}