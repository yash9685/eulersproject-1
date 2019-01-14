
public class euler5 {

	public static void main(String[] args) {
		int s=0;
		long i;
		System.out.println("programme initiated...");
		for(i=2521;s!=19;i++)
		{
			for(int j=2;j<=20;j++)
			{
				if(i%j==0)
					s++;
				else
				{
					s=0;
					break;
				}
			}
		}
		System.out.println("smallest divisible number between 1 to 20 is"+(i-1));
	}
}
				
			
	

	

