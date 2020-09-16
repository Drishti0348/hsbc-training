
public class MethodCall {
	public int hello(int i)
	{
		return i;
	}
	public byte hello(byte i)
	{
		return i;
	}
	public short hello(short i)
	{
		return i;
	}
	public long hello(long i)
	{
		return i;
	}
	public static void main(String args[]) {
		MethodCall m=new MethodCall();
		System.out.println(m.hello(5));
	}
	

}
