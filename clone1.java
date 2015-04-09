
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
	 
}
