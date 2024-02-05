package com.in28minutes.basics;

import java.util.Arrays;

public class Equating {

	public static void main(String[] args) {
		String[] table = {"id","entity"};
		String[] table_stg = {"id_stg","entity_stg"};
//		String[] finalTable = new String[table.length];
		System.out.println(equatingColumns(table,table_stg));
	}

	private static String equatingColumns(String[] table, String[] table_stg) {
		String[] finalTable = new String[table.length];
		for(int i=0;i<table.length;i++) {
			finalTable[i] = table[i] + "=" + table_stg[i];
		}
		return Arrays.toString(finalTable);
	}

}
