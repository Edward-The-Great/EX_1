import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // 307319731  Edward Shine

                System.out.println("Enter even N bigger than 4 "); // start of input

                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                if   (n % 2 != 0 || n < 4) {
                    System.out.println("not valid input");
                    return;
                }
                long startTime = System.nanoTime();
                // saif (a)
//        welcome();
                BothPrime(n);
//        PrintWelcome();
                SmallestPrime(n);
                HowMuch(n);
                Gormim(n);
                long endTime = System.nanoTime(); // End measuring time
                double runtime = (endTime - startTime) / 1e9; // Convert to seconds
                System.out.println("e) Program runtime: " + runtime + " seconds");
                System.out.println("f) 307319731");
            }

            // a)
            public static void BothPrime(int n) {
                for (int p1 = 2; p1 <= n/2; p1++) {            // p1 is even from 4 and forward. increase by 2
                    int p2 = n - p1;                          // given n    basic formula    p2 = (n - p1)
                    if (isprime(p1) && isprime(p2)) {         // now check if both (p1, p2) are prime.
                        System.out.println("a) " + n + " = " + p1 + " + " + p2); // printout n "=" (p1) + (p2)
                        return;                                        // stop the loop i dont need the whole list
                    }
                }
            }

            // method is checking if number is prime
            private static boolean isprime(int n) {
                if (n == 1) return false;
                if (n == 2) return true;
                if (n % 2 == 0) return false;
                for (int i = 3; i <= Math.sqrt(n); i+=2) {
                    if (n % i == 0) {
                        return false;
                    }
                }
                return true;
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
            public static void SmallestPrime(int n) {

                for (int i = 1; i <= n; i += 2) {    // start from 1 is prime. increase with +2 because N is an even number
                    int p4 = n + i;                  // basic formula
                    int p3 = p4 - n;                 // needs to add up
                    if (isprime(p3) && isprime(p4)) {    // check both p3  p4  for prime
                        System.out.println("b) " + n + " = " + p4 + " - " + p3);    // printout n "=" (p1) + (p2)
                        return;                                                             // need only the first couple
                    }
                }
            }

            // c)
            public static void HowMuch(int n) {
                ArrayList<Integer> Plist = new ArrayList<>();        // I need a list to count the primes
                Plist.add(2);
                Plist.add(3);

                for (int i = 3; i <= (n); i=i+2) {
                    if (i % 2 == 0 || i % 3 == 0 ) {
                        continue;                           // Skip the number if divisible by 2 or 3
                    }                                    // start from i=2 ; incraes every one, every one is prime to begin
                    if (isprime(i)) {               // check IF it is prime, if so, add it to the list
                        Plist.add(i);
                        // is so, add that i to the Plist
                    }                               // end of 'IF'
                }                                   // end of loop
                System.out.println("c) " + Plist.size() + " prime numbers in [2," + n + ") " );

            }

            // d
            public static void Gormim(int n) {
                ArrayList<Integer> Plist2 = new ArrayList<>();
                int remain = n;
//        while (remain % 2 == 0) {
//            remain = remain / 2;
//            Plist2.add(2);
//        }
                for (int i = 2; i <= remain; i = i+1) {
                    while (isprime(i) && remain % i == 0) {
                        remain = remain / i;
                        Plist2.add(i);
                    }
//            if (n % 2 == 0) {
//                Plist2.add(n);
//                System.out.println(n + " is even");
//        for (int i = 3; i <= remain; i+2) {}
                } System.out.println("d) " + "n= " + Plist2);
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




