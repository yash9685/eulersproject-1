
public class euler4 {

	public static void main(String[] args) {
		int prod=1;
		int maxpal= -1;
		for(int i=999;i>=100;i--)
		{
			for(int j=999;j>=100;j--)
			{
				prod=i*j;
				int temp=prod;
				if(ispal(prod) && prod>maxpal)
					maxpal=temp;
			}
		}
		System.out.println(maxpal);
	}
	 public static boolean ispal(int n){
	
		int r=0;
		int x;
		int temp=n;
		while(n>0)
		{
			x=n%10;
			r=x+r*10;
			n/=10;
			}
		return temp==r;
		}
		
			}
		

	


//         result --> 906609
