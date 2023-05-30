
public class Test

{

 public static void main (String[]args)

 {

  String mystring = "5";

  String yourstring = "five";

  int number;

   try

  {

   number = Integer.parseInt (yourstring);

   System.out.print (number + " ");

   number = Integer.parseInt (mystring);

   System.out.print (number);

  }

  catch (NumberFormatException e)

  {

   System.out.print ("not a number ");

  }

  finally

  {

   System.out.print ("final");

  }

 }
 
}
