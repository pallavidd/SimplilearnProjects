package corn.mphasis.basics;

import java.util.ArrayList;


public class Iterator {

		private static ArrayList<Integer> al;

		public static void main(String[]args) {
			ArrayList<Integer>al=new ArrayList<>();
			al.add(23);
			al.add(25);
			al.add(2);
			System.out.println(al);
			
			
			System.out.println("for");
	
			for(int i=0;i<al.size();i++){
				System.out.println(al.get(i));
			}
			
			
			System.out.println("for each");
			for(Integer i:al) {
				System.out.println(i);
				
				
			}
			
			
			System.out.println("Iterator");
			Iterator j= (Iterator) al.iterator();
			while(j.hasNEXT());{
				System.out.println(j.next());
				
				
			}
			
			
				
			
			
			
				}

		private boolean hasNEXT() {
			// TODO Auto-generated method stub
			return false;
		}

		private char[] next() {
			// TODO Auto-generated method stub
			return null;
		}

		private boolean hasnext() {
			// TODO Auto-generated method stub
			return false;
		}

}
