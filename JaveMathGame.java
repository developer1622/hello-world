import java.util.*;
public class JavaMathGame{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a,b,ans,i,j,T,c=0,op;
		char arr[]={'+','-','*','%'};
		char chr;
		T=in.nextInt();
		for(i=0;i<T;i++)
		{
			a=(int)(Math.random()*100+1);
			b=(int)(Math.random()*100+1);
			op=(int)(Math.random()*4+0);
			chr=arr[op];
			System.out.println(a+ "  "+chr+"  "+b+ "= ?");
			ans=in.nextInt();
			if((chr=='*' )&&(ans==(a*b)))
				c++;
			if((chr=='+')&&(ans==(a+b)))
				c++;
			if((chr=='-' )&&(ans==(a-b)))
				c++;
			if((chr=='%')&&(ans==(a%b)))
				c++;												
		}
		System.out.println("Your enthusisam is  "+(c*10));
	}
}
