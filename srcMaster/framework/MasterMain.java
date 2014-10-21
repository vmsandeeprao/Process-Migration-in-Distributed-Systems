package framework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MasterMain {

	/**
	 * @param args
	 * @throws IOException
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Master m = new Master("ProcessManager", 9000);
		Slave s1 = new Slave("SlaveOne", "linux7.gp.cs.cmu.edu", 6000);
		Slave s2 = new Slave("SlaveTwo", "linux8.gp.cs.cmu.edu", 6001);
	
		m.addSlave(s1);
		m.addSlave(s2);
		m.start();
	}

}
