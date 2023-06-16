package com.mahi.decoratorOrPizza;

public class Test {

	public static void main(String[] args) {
	Car sheetCoverCar = new SheetCover( new PetrolCar());
	
	   DoorProctector doorProctector = new DoorProctector(sheetCoverCar);
	   System.out.println(doorProctector.cost());
	   
	   Car ac = new AcAttached( new PetrolCar());
	   System.out.println(ac.cost());
	
	}
}
