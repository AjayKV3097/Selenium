package org.practice;



public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s= "I love mangoes,I love apples";
		String[] s1 = s.split(" ");
		int count=0;
		
		for (int i = 0; i < s1.length; i++) {
			count=1;
			for(int j =0;j<s1.length;j++) {
				if(s1[i].equalsIgnoreCase(s1[j])) {
					count++;
					s1[j]=" ";
				}
			}
			if(!s1[i].contains(" ")) {
				System.out.println(s1[i]+count);
			}
			
		}

	}

}
