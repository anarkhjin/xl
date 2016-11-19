package com.laomashi.majiong.service.uti;

import java.util.Random;

public class VerifyUtil {

	public static void main(String[] args) {
		
		System.out.println(getVerifyStr());
		
	}
	
	
public 	static String getVerifyStr(){
	  
	Random random = new Random(); 
	  int num =random.nextInt(15);
	
    String[] rBase={"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};   
	StringBuffer str =new StringBuffer();
	for(int i= 0;i<4;i++){
		str.append(rBase[random.nextInt(15)]);
	}
	return str.toString();
}
}
