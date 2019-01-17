
public class euler5 {

	public static void main(String[] args) {
		long num=20;
		System.out.println(lcm(num));
	}
	public static long lcm(long num)
	{
		long l=1;
		for(long i=1;i<=num;i++)
		
			l=l*i/(gcd(l,i));
			return l;
			
		}
	public static long gcd(long l,long i)
	{
		if(l%i!=0)
			return gcd(i,l%i);
			else
				return i;
		}
	}

				
			
	

	

