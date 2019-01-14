
public class eulers9 {

	public static void main(String[] args) {
		double prd=1;
		for(int i=1;i<=1000;i++)
		{
			for(int j=i+1;j<=1000;j++)
			{
				double k=Math.sqrt(i*i+j*j);
				if((i+j+k)==1000)
				{
					prd=i*j*k;
				}
			}
		}
		System.out.println(prd);
	}
}			