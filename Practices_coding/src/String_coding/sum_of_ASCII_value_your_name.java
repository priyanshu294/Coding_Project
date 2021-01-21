package String_coding;

public class sum_of_ASCII_value_your_name
{
  public static void main(String[] args)
  {
    String str = "PRIYANSHU";
    int sum=0;
    for(int i=0; i<str.length(); i++)
    {
      int asciiValue = str.charAt(i);
      sum = sum + asciiValue;
      System.out.println(str.charAt(i) + "=" + asciiValue);
    }
    System.out.println("ASCII of " + str + " = " + sum);
  }
}

