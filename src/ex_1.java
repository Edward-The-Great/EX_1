import java.util.ArrayList;
import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
// 307319731  Edward Shine
                System.out.println("Enter even N bigger than 4 "); // start of input
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();

                //validation my brother
                if   (n % 2 != 0 || n < 4) {
                    System.out.println("not valid input");
                    return;
                }

                // only now is fair to set up time
                long startTime = System.nanoTime();

                // initiate Siv of AristoShmates
                int MaxPrime = n+100;
                boolean [] isPrime = siV(MaxPrime);

//        PrintWelcome();
//        welcome();
                BothPrime(n, isPrime); // saif (a)
                SmallestPrime(n, isPrime); // saif (b)
                HowMuch(n, isPrime ); // saif (c)
                Gormim(n, isPrime); // saif (d)

                long endTime = System.nanoTime(); // End measuring time
                double runtime = (endTime - startTime) / 1e9; // Convert to seconds
                System.out.println("e) Program runtime: " + runtime + " seconds");
                System.out.println("f) 307319731");
            }

            // a) findind two apples
            public static void BothPrime(int n, boolean[] isPrime) {
                for (int p1 = 2; p1 <= n/2; p1++) {            // p1 is even from 4 and forward. increase by 2
                    int p2 = n - p1;                          // given n    basic formula    p2 = (n - p1)
                    if (isPrime[p1] && isPrime[p2]) {         // now check if both (p1, p2) are prime.
                        System.out.println("Edward is Da Boss");
                        System.out.println("a) " + n + " = " + p1 + " + " + p2); // printout n "=" (p1) + (p2)
                        return;                                        // stop the loop i dont need the whole list
                    }
                }
            }

            // Siv method is checking if number is prime
            private static boolean[] siV(int MaxPrime) {
              boolean[] LocalIsPrime = new boolean[MaxPrime+1];  // first time making array of primes - every one set to false by default
              for (int i = 2; i <= MaxPrime; i++) {
                  LocalIsPrime[i] = true;  // now second ovveride , setting every one to true
              }
              int GvulBdika = (int) Math.sqrt(MaxPrime); // i setup the GvuLL as the square root of max input
                  for (int gorem = 2; gorem <= GvulBdika; gorem++) { // i start now itirate every index up to the Gvull
                      if (LocalIsPrime[gorem]) {// i need a test ,is the gorem marked already? or not
                          for (int j = gorem*gorem; j <= MaxPrime; j+=gorem) { // i am marking the bad apples
                              LocalIsPrime[j] = false;  // third ovveride: this is the action of assigning as false removing the bad apples
                          }
                        }
                      }
                  return LocalIsPrime; // at last the final result of actual primes. only now i have output of boolean
              }

private static boolean isPrime(int n, boolean[] isPrime) {
        if (n< 2 || n >= isPrime.length) return false;
        return isPrime[n];
}

//    public static void PrintWelcome() {
//        System.out.println("welcome dude");
//    }

//    public static void welcome() {
//        System.out.println("Welcome to Java");
//    }
            // Find the smallest two prime numbers (p3,p4) such that p4-p3==n, and
            //print them according to the example below:
            // p3 = n+1
            // p4 = n - p3
            // while ( isprime(p3) && isprime(p4)) {
            //    println("b) " + n + " = " + p3 + " - " + p4);


            // b)
            public static void SmallestPrime(int n, boolean[] isPrime) {

                for (int i = 1; i <= n; i += 2) {    // start from 1 is prime. increase with +2 because N is an even number
                    int p3 = i;                  // basic formula
                    int p4 = n + p3;                 // needs to add up
                    if (p4 < isPrime.length && isPrime[p3] && isPrime[p4]) {    // check both p3  p4  for prime
                        System.out.println("b) " + n + " = " + p4 + " - " + p3);    // printout n "=" (p1) + (p2)
                        return;   //stop after that                                                          // need only the first couple
                    }
                }
            }

            // c)
            public static void HowMuch(int n, boolean[] isPrime) {
                int count = 0;
                for (int i = 2; i <= n; i++) {
                    if (isPrime[i]) {
                        count++;
                    }
                }
               // end of loop
                System.out.println("c) " + count + " prime numbers in [2," + n + ") " );
            }

            // d
            public static void Gormim(int n, boolean[] isPrime) {
                ArrayList<Integer> localGormim = new ArrayList<>();
                int remain = n;
//        while (remain % 2 == 0) {
//            remain = remain / 2;
//            Plist2.add(2);
//        }

                for (int i = 2; i <= remain && i < isPrime.length; i = i + 1) {
                    while (isPrime[i] && remain % i == 0) {
                        localGormim.add(i);
                        remain = remain / i;
                    }
                }
                if (remain > 1 && remain < isPrime.length) {
                    localGormim.add(remain);
                }
//            if (n % 2 == 0) {
//                Plist2.add(n);
//                System.out.println(n + " is even");
//        for (int i = 3; i <= remain; i+2) {}
                System.out.print("d) " + n + " = ");
                for (int i = 0; i < localGormim.size(); i++) {
                    System.out.print(localGormim.get(i));
                    if (i < localGormim.size() - 1) System.out.print("*"); {
                    }
                }
                System.out.println();
            }
        }

// d)
// define new Plist_2 (int n)
//input n
//   for  (i = 2; i<n; i++)
//      if (isprime(i))
//         plist2.add(i)  [.....    ..... ....    ...   .....]
//            if (n% plist2(i) ==0)
//
// remain = n / 2* (count "2").length
        //  public static void decomposition()




