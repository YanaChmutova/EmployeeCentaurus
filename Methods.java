
public class Methods {
	//HomeWork
	public static int arraySum(byte[] ar) {
		int sum = 0;
		for(byte b: ar) {
			sum += b;		
		}
		return sum;
	}
			
	public static double arraySum(double[] ar) {
		double sum = 0;
		for(double d: ar) {
			sum += d;
		}
		return sum;
	}

	public static String arraySum(String[] ar) {
		String sum = "";
		for(String str : ar) {
			sum += str + " ";
			//sum += " ";
		}
		return sum;
		}
			
	public static int arraySum(boolean[] ar) {
		int sum = 0;
		for(boolean bln : ar) {
			if(bln != false) {
				sum += 1; // sum++;	
			}
		}
		return sum;
		}       
}
