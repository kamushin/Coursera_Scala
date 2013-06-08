package patmat
import patmat.Huffman._

object ss {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(92); val res$0 = 
	(times(List('a','b','a'))).sortBy(_._2);System.out.println("""res0: List[(Char, Int)] = """ + $show(res$0));$skip(289); val res$1 = 
	decode(frenchCode,List(1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1));System.out.println("""res1: List[Char] = """ + $show(res$1));$skip(36); 
	val t1 = createCodeTree(List('h'));System.out.println("""t1  : patmat.Huffman.CodeTree = """ + $show(t1 ));$skip(13); val res$2 = 
	convert(t1);System.out.println("""res2: patmat.Huffman.CodeTable = """ + $show(res$2));$skip(27); val res$3 = 
	
	
	decode(t1, List(1,0));System.out.println("""res3: List[Char] = """ + $show(res$3))}
	
//	quickEncode(frenchCode)(List('e', 'n', 'c', 'o', 'r', 'e', 'u', 'n', 't', 'e', 'x', 't', 'e', 't', 'r', 'e', 's', 's' ,'e', 'c', 'r', 'e', 't'))

//	encode(frenchCode)(List('e', 'n', 'c', 'o', 'r', 'e', 'u', 'n', 't', 'e', 'x', 't', 'e', 't', 'r', 'e', 's', 's' ,'e', 'c', 'r', 'e', 't'))
                             
                           
                             
//	convert(frenchCode)
 
 
	
}
