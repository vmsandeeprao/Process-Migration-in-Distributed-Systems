package framework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SlaveMain {

	/**
	 * @param args
	 * @throws IOException
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Slave s1 = new Slave("SlaveOne", "linux7.gp.cs.cmu.edu", 6000);
		
		s1.startServer();
		
	}


}
