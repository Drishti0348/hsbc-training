package com.demo.interface1;

public class MyWriterFactory {
	
	public static Writer getWriterObj(String className)
	{
		if(className.equals("plain"))
			return new PlainTextWriter();
		else if(className.equals("decorated"))
			return new DecorateWriter();
		else
			return null;
	}

}
