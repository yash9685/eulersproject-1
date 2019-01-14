
public class euler6 {

	public static void main(String[] args) {
	int s=0;
	int prd=0;
	for(int i=1;i<=100;i++)
	{
		s=s+i;
		prd=prd + (i*1);
	}
	s=s*s;
	int difference=s-prd;
	System.out.println(difference);
	}
}
	

	


