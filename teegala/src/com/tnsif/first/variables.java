package com.tnsif.first;

class Variables {
	  int x = 10;   

	  void show() {
	    int y = 20; 
	    System.out.println("Instance variable: " + x);
	    System.out.println("Local variable: " + y);
	  }

	  public static void main(String[] args) {
	    Variables obj = new Variables();
	    obj.show();
	  }
}
