package patmat
import patmat.Huffman._

object ss {
	(times(List('a','b','a'))).sortBy(_._2)   //> res0: List[(Char, Int)] = List((b,1), (a,2))
	decode(frenchCode,List(1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1))
                                                  //> res1: List[Char] = List(e, n, c, o, r, e, u, n, t, e, x, t, e, t, r, e, s, s
                                                  //| , e, c, r, e, t)
	val t1 = createCodeTree(List('h'))        //> t1  : patmat.Huffman.CodeTree = Fork(Leaf(h,1),Leaf(_,1),List(h, _),2)
	convert(t1)                               //> res2: patmat.Huffman.CodeTable = List((h,List(0)), (_,List(1)))
	
	
	decode(t1, List(1,0))                     //> res3: List[Char] = List(_, h)
	
//	quickEncode(frenchCode)(List('e', 'n', 'c', 'o', 'r', 'e', 'u', 'n', 't', 'e', 'x', 't', 'e', 't', 'r', 'e', 's', 's' ,'e', 'c', 'r', 'e', 't'))

//	encode(frenchCode)(List('e', 'n', 'c', 'o', 'r', 'e', 'u', 'n', 't', 'e', 'x', 't', 'e', 't', 'r', 'e', 's', 's' ,'e', 'c', 'r', 'e', 't'))
                             
                           
                             
//	convert(frenchCode)
 
 
	
}