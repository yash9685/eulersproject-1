
public class euler3 {

	public static void main(String[] args) {
	double num=600851475143.0;
	double temp =num;
	double largeprime;
	for(int i=2;i<num;i++)
	{
		while(num%i==0)
			{
			System.out.println(i+" ");
			num=num/i;
			}
			}
	if(num>2)
	{
		System.out.println(num);
		largeprime=num;
		System.out.println("largest prime no. is="+largeprime);
	}

	}

}