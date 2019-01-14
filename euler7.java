
public class euler7 {

	public static void main(String[] args) {
		long r,s=0,x,pr[]=new long[10001];
		System.out.println("programme initiated...");
		for(r=2;s!=10001;r++)
		{
			boolean i= checkprime(r);
			if(i==true)
			{
				pr[(int)s]=r;
				s++;
			}
		}
		System.out.println(pr[10000]);
	}
	private static boolean ckeckprime(long x){
		int i=0,j;
		for(j=2;j<x;j++)
		{
			if(x%j==0)
			{
				i++;
				break;
			}
		}
		if(i!=0)
			return false;
		else
			return true;
	}
}
			
	


