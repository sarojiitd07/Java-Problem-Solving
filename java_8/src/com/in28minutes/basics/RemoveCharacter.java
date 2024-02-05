package com.in28minutes.basics;

public class RemoveCharacter {

	public static void main(String[] args) {
		String str = "12:05:45AM";
		System.out.println(removeCharacter(str));


	}

	private static String removeCharacter(String s) {
		
		String str="";
        if(s.endsWith("AM")){
            if(s.startsWith("12")){
                str=s.replace("AM","");
                str = str.replace("12","00");
                return str;
            }else{
                str=s.replace("AM","");
                return str;
                }
        }

        if(s.endsWith("PM")){
            if(s.startsWith("12")){
                str=s.replace("PM","");
                return str;
            }else{
                str=s.replace("PM","");
                int n = 12 + Integer.valueOf(s.substring(0,2));
                str = n + str.substring(2);
                return str;
                }
            
        }
		return str;
	}

}
