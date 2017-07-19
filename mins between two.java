# mins-between-two
import java.io.*;
import java.util.*;
public class mins between two
{
public static void main(String args[])throws IOException
{
int h1,h2,m1,m2,tmin1,tmin2=0,min;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the first time hours and seconds");
h1=br.readLine();
m1=br.readLine();
tmin1=h1*60;
System.out.println("Enter the second time hours and seconds");
h2=br.readLine();
m2=br.readLine();
tmin2=h2*60;
min=tmin2-tmin1;
System.out.println("The minute difference between two time is:"+Math.abs(min));
]
}
