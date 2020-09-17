package com.demo.interface1;

public class DemoApp {
public static void main(String[] args) {
	Writer wr=new PlainTextWriter();
	wr.write("drishti");
	Writer wr1=MyWriterFactory.getWriterObj("decorated");
	wr1.write("done!");

}
}
