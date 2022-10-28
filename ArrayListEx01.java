package classes;

import java.util.ArrayList;

class ArrayListEx01{

	String[] name = {"보라돌이", "뚜비", "나나", "뽀"};
	int[] score = {100, 90, 85, 70};
	ArrayList dto = new ArrayList();
	//ArrayList<Integer> dto = new ArrayList<Integer>();

	void objectAdd(){
		for(int i=0; i<name.length; i++){
			dto.add(name[i]);
			dto.add(score[i]);
		}
	}

	void objectPrint(){
		for(int i=0; i<dto.size(); i++){
			System.out.print(dto.get(i) + "\t");		
		}
	}
	public static void main(String[] args){
		
		ArrayListEx01 obj = new ArrayListEx01();
		obj.objectAdd();
		obj.objectPrint();
	}

}