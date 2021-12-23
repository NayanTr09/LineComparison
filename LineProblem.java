
import java.util.Scanner;
public class LineProblem
{
	public static void main(String arg[])

	{

             	 int x1,x2,y1,y2;

	         double dis1,dis2;

	         Scanner sc=new Scanner(System.in);

	         System.out.println("enter x1 point");

                 x1=sc.nextInt();

                 System.out.println("enter y1 point");

                 y1=sc.nextInt();

	         System.out.println("enter x2point");

                 x2=sc.nextInt();

	         System.out.println("enter y2 point");

                 y2=sc.nextInt();

		     dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

  	         System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")"+dis1);

		     System.out.println("enter x3 point");

			      x3=sc.nextInt();

		     System.out.println("enter y3 point");

			      y3=sc.nextInt();

				  System.out.println("enter x4 point");

				  x4=sc.nextInt();

		     System.out.println("enter y4 point");

		          y4=sc.nextInt();

		     dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

		     System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")"+dis2);

			 if (dis1 == dis2)
			 {
				  System.out.println("Two lines are equal");
				  else
				  if (dis1 !=dis2)
				 {
					 System.out.println("Two lines are not equal");
					 else
						 if (dis1>dis2)
						 {
							 System.out.println("Line 1 is greater");

							 else
								 System.out.println("Line 2 is greater");
						 }
				 }
			 }


	}

}