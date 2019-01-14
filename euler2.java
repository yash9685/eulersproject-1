
public class euler2 {

	public static void main(String[] args) {
		int i=1,x=1,y=2;
		double total=0.0;
		while (x<=4000000)
		{
			if(x%2==0)
			{
				total=total+x;
				System.out.print(x + " ");
			}
			int sum = x+y;
			x=y;
			y=sum;
			i++;
			}
		System.out.println(total + " ");

	}

}
