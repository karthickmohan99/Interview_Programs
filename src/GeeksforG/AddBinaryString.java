package GeeksforG;

public class AddBinaryString {

	public static void main(String[] args) {
		String x="011011";
		String y ="1010111";
		
		int num1 = Integer.parseInt(y,2);
		int num2 =Integer.parseInt(x,2);
		int addition =num1+num2;
		String result = Integer.toBinaryString(addition);
        System.out.println(result);
	}

}
