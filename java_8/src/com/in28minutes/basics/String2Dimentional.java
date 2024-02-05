package com.in28minutes.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class String2Dimentional {

	public static void main(String[] args) {
		String[] str = {"uxf","vof","hmp"};
		List<String> list = Arrays.asList(str);
		
		System.out.println(gridChallenge(list));	

	}
	
	public static String gridChallenge(List<String> grid) {
        ArrayList<ArrayList<Character>> char2d = new ArrayList<ArrayList<Character>>();
        for(int i=0;i<grid.size();i++){
            ArrayList<Character> list = new ArrayList<>();
            for(int j=0;j<grid.get(i).length();j++) {
            	list.add(grid.get(i).charAt(j));
            }
            Collections.sort(list);
            System.out.println(list);
            char2d.add(list);
        }
        for(int i=0;i<grid.size()-1;i++) {
        	for(int j=0;j<grid.get(i).length();j++) {
        		System.out.println(char2d.get(i).get(j) + " " + char2d.get(i+1).get(j));
        		if(char2d.get(i).get(j)>char2d.get(i+1).get(j)) {
        			return "NO";
        		}
        	}
        }
        return "YES";
    }

}
