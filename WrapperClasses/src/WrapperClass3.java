
public class WrapperClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             String p=Integer.toBinaryString(Integer.parseInt(args[0]));
             System.out.println(String.format("%10s", p).replace(' ', '0'));
             
	}

}
