package uk.co.brotherlogic.mdb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Tester {

	public String[] javaSplit(String in)
	{
		return in.split("\\s+");
	}
	
	public String[] mySplit(String in)
	{
		int endPoint = 0;
		String[] blah = new String[5000];
		char[] buffer = new char[2000];
		int bufferPoint = 0;
		int blahPoint = 0;
		while (endPoint < in.length())
		{
			if (Character.isWhitespace(in.charAt(endPoint)))
			{
				if (bufferPoint > 0)
					blah[blahPoint++] = new String(buffer,0,bufferPoint);
				bufferPoint = 0;
			}
			else
				buffer[bufferPoint++] = in.charAt(endPoint);
			
			endPoint++;
		}
		
		if (bufferPoint > 0)
		blah[blahPoint] = new String(buffer,0,bufferPoint);
		
		String[] retArr = new String[blahPoint+1];
		for(int i = 0 ;  i < retArr.length ; i++)
			retArr[i] = blah[i];
		
		return retArr;
	}
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = new BufferedReader(new FileReader(new File("/Users/simon/Desktop/pg2324.txt")));
		StringBuffer buffer = new StringBuffer();
		for(String line = reader.readLine() ; line != null ; line = reader.readLine())
			for(int i = 0 ; i < 25 ; i++)
				buffer.append(line.replace("\n", " "));
		reader.close();
		
		String tester = buffer.toString();
		Tester mine = new Tester();
		long sTime = System.currentTimeMillis();
		String[] elems = new String[0];
		try
		{
		elems = mine.mySplit(tester);
		}
		catch (Exception e)
		{
			System.err.println("SKIPPING");
		}
		
		long mTime = System.currentTimeMillis();	
		String[] oelems = mine.javaSplit(tester);
		long eTime = System.currentTimeMillis();
		
		System.out.println("JAVA = " + (eTime - mTime) + " => " + elems.length);
		System.out.println("MINE = " + (mTime - sTime) + " => " + oelems.length);
		
		
	}
}
