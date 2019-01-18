
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
	public static long gcd(long m,long n)
	{
		long r;
		while (n!=0)
		{
			r=m%n;
			m=n;
			n=r;
		}
		return m;
		}
		}
	

				
			
	

	

