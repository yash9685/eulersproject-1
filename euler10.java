
public class euler10 {

	public static void main(String[] args) {
		long s=0;
		for(long n=1;n<=2000000;n++)
		{
			int c=0;
			for(long i=1;i<=n;i++)
			{
				if(n%i==0){
					c++;
				}
			}
			if(c==2)
			{
				System.out.println(n);
				s=s+n;
			}
			System.out.println("s="+s);
			
				}
			}
}


