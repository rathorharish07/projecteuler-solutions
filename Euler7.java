class Euler7
{

    public static void main(String args[])
    {
        
        int counter = 0,a=0;
        int primeNum = 0;

        for (int i = 2; i < 10000000; i++) 
        {
          boolean isPrime = true;
          for (int j = 2; j < i; j++) 
           {
                if (i% j == 0)
                {
                    isPrime = false;
                    break;
                }
           }
          if (isPrime)
           {
                primeNum =i;
                counter++;
           }
          if (counter == 10001)
           {
                break;
           }
        }
        System.out.println(primeNum);
    }
}