package mini3;

public class main {

	public static void main(String[] args) {
		int number=28;
		int remainder;
		int total=0;
		
		for(int i=1;i<number;i++)
		{
			remainder=number % i;
			if(remainder==0)
			{
				total=total+i;
			}
		}
		if(number==total)
		{
			System.out.println("Mükemmel Sayı");
		}
		else
		{
			System.out.println("Mükemmel Sayı Değil");
		}

	}

}
