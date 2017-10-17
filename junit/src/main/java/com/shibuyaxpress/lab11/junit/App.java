package com.shibuyaxpress.lab11.junit;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		App app = new App();	
		int sum = app.suma(4,5);		
		int res = app.resta(4,5);
		String mes=app.messageReceived("hola");
	}

	public  int resta(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
	}

	public  int suma(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}
	public String messageReceived(String message) {
		message="hola";
		String res;
		if(message.equalsIgnoreCase("hi")) {
			res="how are you?";
		}else {
			res=null;
		}
		
		return res;
	}

}
