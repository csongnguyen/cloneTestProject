
public class CharSeqIt {	
	private CharSeq seq;
	private int iter;
	
	 //constructor for iterator, also assuming that iterator will always start at beginning of CharSeq
	 public CharSeqIt(CharSeq cSeq){
		 this.seq = cSeq;
		 this.iter = -1;
	 }
	 
	 //any more elements?
	 public boolean hasNext(){
		++iter;
		/*for(int i = 0; i < seq.cSeq.length(); i++){*/
		if(iter >= seq.cSeq.length()){
			iter--;
			return false;
		}
		else if(String.valueOf(seq.cSeq.charAt(iter)) == null){
			iter--;
			return false;
		}
		/*}*/	
		//System.out.println("TRUE! " + seq.cSeq.charAt(iter));
		iter--;
		return true;
		
		 
	 }
	 
	 //return the next element and advance iterator to following item
	 public char next() throws UsingIteratorPastEndException{
		 
	 	//System.out.println("+ next");
		iter++;
		if(iter >= seq.cSeq.length()){
			//System.err.println("CharSeqIt called past end");
		 	throw new UsingIteratorPastEndException(
		 			"problem parsing factor");
		}
		else if(String.valueOf(seq.cSeq.charAt(iter)) == null){
			//System.err.println("CharSeqIt called past end");
			throw new UsingIteratorPastEndException(
		 			"problem parsing factor");
		}
		//System.out.println("- next");		 
		return seq.cSeq.charAt(iter);
		
	 }
	 
	 public int getIter(){
		 return iter;
	 }
}
