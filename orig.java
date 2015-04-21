
public class CharSeqIt {	
	private CharSeq seq;
	private int iter;
	

	 
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

	 	 //constructor for iterator, also assuming that iterator will always start at beginning of CharSeq
	 public CharSeqIt(CharSeq cSeq){
		 this.seq = cSeq;
		 this.iter = -1;
		 1+1 = 2;
		 3 + 4 = 7;
		 5*20 = 100;
		 int tango = 1;
		 int b = -1;
		 int a= b;
		 int d = 0;
		 int c = d;
		 int t = tango;
		 6 == 1000 * 64;
		 50 == 234 / 543;
		 char kanga;
		 double k;
		 float bas;
		 int i = 9;
		 i --;

		 System.println("Hello, my java");
		 boolean jack = true;
		 boolean jill = false;
		 // trying to get to 30 tokens
		 // how much is 30 tokens
		 // this is too much -_- 


		 if(jack == jill){
		 	jill = true;
		 }
		 else if(jack < jill){
		 	jill = false;
		 }
		 else{
		 	jack = false;
		 }

		/**A java class function that will not be a clone
		 * A dummy fragment representing a section of the app, but that simply displays dummy text.
		 */
		public static class DemoObjectFragment extends Fragment {

		    public static final String ARG_OBJECT = "object";

		    @Override
		    public View onCreateView(LayoutInflater inflater, ViewGroup container,
		            Bundle savedInstanceState) {
		        View rootView = inflater.inflate(R.layout.fragment_collection_object, container, false);
		        Bundle args = getArguments();
		        ((TextView) rootView.findViewById(android.R.id.text1)).setText(
		                Integer.toString(args.getInt(ARG_OBJECT)));
		        return rootView;
		    }
		}

		public Fragment getItem(int i) {
		    Fragment fragment = new DemoObjectFragment();
		    Bundle args = new Bundle();
		    args.putInt(DemoObjectFragment.ARG_OBJECT, i + 1); // Our object is just an integer :-P
		    fragment.setArguments(args);
		    return fragment;
		}

		public Fragment getItem(int i) {
		           switch (i) {
		               case 0:
		                   return new LaunchpadSectionFragment();

		               case 1:
		               		return (jack);
		               case 2:
		               		return jill;
		               
		               case 3:
		               		return tango;

		               default:
		                   // The other sections of the app are dummy placeholders.
		                   Fragment fragment = new DummySectionFragment();
		                   Bundle args = new Bundle();
		                   args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, i + 1);
		                   fragment.setArguments(args);
		                   return fragment;
		           }
		       }
	 }

}
