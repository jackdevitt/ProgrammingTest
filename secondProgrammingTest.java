public class secondProgrammingTest {
   
   //Set this boolean to true to mute the logs
   public static boolean mute = false;
   
   //Implement the Measurement class
   //Allow for the class initalization to accept a variable that is assigned to the instance variable inches
   //Create a getter and setter method for the inches instance variable
   //Create a method getFeet(), that will convert the inches instance variable into feet and return it
   //IMPORTANT: 1 foot = 12 inches
   public static class Measurement {
      
      private double inches = 0;
      
      public Measurement(double inches) {
      
      }
      
      public double getInches() {
         return 0.0;
      }
      
      public void setInches(double inches) {

      }
      
      public double getFeet() {
         return 0.0;
      }
   }
   
   //Create the Metric class, an instance of the Metric class should be able to perform methods from the Measurement class
   //One inch is equal to 0.0254 of a meter
   //One centimeter is equal to 0.01 of a meter
   public static class Metric extends Measurement {
      
      public Metric(double inches) {
         super(inches);
      }
      
      public double getMeters() {
         return 0.0;
      }
      
      public double getCentimeters() {
         return 0.0;
      }
   }
   
   //Implement the method to find the number in the place of the integer taken as an argument, index, in the fibonacci sequence
   //Where fibonacci sequence formula: F[n] = F[n-1] + F[n-2] and F[0] = 0 and f[1] = 1
   //Ex.) F[2] = 1 because: F[2] = F[1] + f[0], F[2] = 1 + 0, F[2] = 1
   public static int fibonacciSequence(int index) {
      return 0;
   }
   
   //Accept the integer, num, return true if the integer is prime and false if it is not
   //Prime numbers are defined as any number where the only two factors are 1 and itself
   public static boolean isPrime(int num) {
      return false;
   }
      
   
//....................................................................................................
//....................................................................................................
//.............................. :^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^: ..............................
//............................ :755YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY557: ............................
//...........................^?PP7:..................................:7PP?^ ..........................
//.........................^JP5!. ^JYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYJ^ .75PJ^.........................
//..................... .~JP5!. ~YPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPY~ .!5PJ~. .....................
//................... .~YPY~  ~YPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPY~  ~YPY~. ...................
//................. .!YPY~ .!5PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP5!. ~YPY!. .................
//............... .!5PJ^ .75PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP5!. ^JP5!. ...............
//............. :75PJ: .75PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP57. :?P57: .............
//........... :?PP?: :?5PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP5?: :?PP?: ...........
//..........^?PP7. ^JPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPJ^ .7PP?^ .........
//........^JP5!. ^JPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPJ^ .!5PJ^........
//......^JP5!  ~YPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPY~  !5PJ^......
//......YG7  ~YPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPY~  7GY......
//......YG~ :5PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP5: ~GY......
//......YG! :5PPPPPPPYJ?777?J5PPPPPYJJJJJJJJJJJJJJJ5PPPP5Y?777?YPPPPPPPYJJJJJJJJJYY5PPPPPP5: !GY......
//......YG! :5PPPPPJ^.       .~YPPG^               YPP57:       :75PPPP7           :!5PPPP5: !GY......
//......YG! :5PPPP?   .~!7!^   .JPP7^^^^^.   :^^^^~5P5^   :~!~:   ^5PPP7   :^^^^:.   :YPPP5: !GY......
//......YG! :5PPP5:  .YGPPPP7   ^PPPPPPPP^   JPPPPPP5^  .?PPPPPJ.  :PPP7   !PPPPPY^   !PPP5: !GY......
//......YG! :5PPPP^   ^?J55PPYYYYPPPPPPPP^   ?PPPPPPJ   ?PPPPPPG?   ?PP7   !PPPPPG!   ~PPP5: !GY......
//......YG! :5PPPP5^     .:^!?YPPPPPPPPPP^   ?PPPPPP!  .5PPPPPPP5:  ~GP7   ~555YJ7.   ?PPP5: !GY......
//......YG! :5PPPPPPJ~:.       ~YPPPPPPPP^   ?PPPPPP^  :5PPPPPPPP:  ^GP7    ...      !PPPP5: !GY......
//......YG! :5PPPPPPPP5YJ?!^.   .5PPPPPPP^   ?PPPPPP!  .5PPPPPPP5.  ~GP7   .::::::^!YPPPPP5: !GY......
//......YG! :5PPPJ~~^?GPPPPPP^   7GPPPPPP^   ?PPPPPPJ   7GPPPPPP?   ?PP7   !P55555PPPPPPPP5: !GY......
//......YG! :5PPPJ   .JPPPPP5^   ?PPPPPPP^   ?PPPPPP5^  .7PPPPP?.  :PPP7   !PPPPPPPPPPPPPP5: !GY......
//......YG! :5PPPP7    ^!!!~.   ^PPPPPPPP^   ?PPPPPPP5^   :~!~:   ^5PPP7   !PPPPPPPPPPPPPP5: !GY......
//......YG! :5PPPPPJ^.        :?PPPPPPPPP:   ?PPPPPPPPP7:       :75PPPP7   !PPPPPPPPPPPPPP5: !GY......
//......YG! :5PPPPPPP5J?777?JYPPPPPPPPPPPYJJJ5PPPPPPPPPPPYJ?77JYPPPPPPPYJJJYPPPPPPPPPPPPPP5: !GY......
//......YG~ :5PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP5: ~GY......
//......YG7  ~YPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPY~  7GY......
//......^JP5!  ~YPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPY~ .!5PJ^......
//........^JP5!. ^JPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPJ^ .75PJ^........
//......... ^?PP7. ^JPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPJ^ .7PP?^..........
//........... :?PP?: :?5PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP5?: :?PP?: ...........
//............. :75P?: .75PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP57. :?P57: .............
//............... .!5PJ^ .!5PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP5!. ^JP5!. ...............
//................. .!YPY~ .!5PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP5!. ~YPY!. .................
//................... .~YPY~  ~YPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPY~  ~YPY~. ...................
//..................... .~JP5!. ~YPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPY~ .!5PJ~. .....................
//.........................^JP57. ^JYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYJ^ .75PJ^.........................
//.......................... ^?PP7:..................................:7PP?^ ..........................
//............................ :755YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY557: ............................
//.............................. :^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^: ..............................
//....................................................................................................
//....................................................................................................
   
   //DO NOT TOUCH OR EDIT THIS FUNCTION
   public static void main(String[] args) {
     
      int numPassed = 0;
     
      Metric[] m = new Metric[10];
      double[] creationVal = {0.0, 10.0, 30.0, 45.5, 100.0, 12.0, 632.0, 99999.0, 632.0, 43.2};
      
      if (!mute) {
         System.out.println("Checking Measurement with 10 Tests");
         System.out.println("-------------------------------------------");
      }
      int casesPassed = 0;
      for (int i = 0; i < 10; i++) {
         boolean metricPassed = false;
         m[i] = new Metric(creationVal[i]);
         if (m[i].getInches() == creationVal[i]) {
            if (m[i].getFeet() == creationVal[i] / 12) {
               double rand = (Math.random() + 1) * 10;
               m[i].setInches(rand);
               if (m[i].getInches() == rand) {
                  if (m[i].getFeet() == rand / 12) {
                     if (m[i].getMeters() == rand * 0.0254) {
                        if (m[i].getCentimeters() == rand * 0.0254 * 100) {
                           casesPassed += 1;
                           metricPassed = true;
                        }
                     }
                  }
               }
            }  
         }
         if (!mute) {
            if (metricPassed) {
               System.out.println("Case #" + (i + 1) + " Passed");
            } else {
               System.out.println("Case #" + (i + 1) + " Failed");
            }
         }
      }
      if (!mute) {
         System.out.println("");
         System.out.println("");
      }
      if (casesPassed == 10) {
         numPassed++;
         System.out.println("Measurement problem passed");
      } else {
         System.out.println("Measurement problem failed");
      }
      
      if (!mute) {
         System.out.println("");
         System.out.println("");
      }
      if (!mute) {
         System.out.println("Checking Fibonacci with 10 Tests");
         System.out.println("-------------------------------------------");
      }
      
      int[] fibQ = {0, 1, 10, 2, 3, 7, 5, 6, 8, 9};
      int[] fibSol = {0, 1, 55, 1, 2, 13, 5, 8, 21, 34};
      int fibCasesPassed = 0;
      
      for (int i = 0; i < 10; i++) {
         if (fibonacciSequence(fibQ[i]) == fibSol[i]) {
            fibCasesPassed++;
            if (!mute) {
               System.out.println("Case #" + (i + 1) + " Passed");
            }
         } else {
            System.out.println("Case #" + (i + 1) + " Failed");
         }
      }
      if (!mute) {
         System.out.println("");
         System.out.println("");
      }
      if (fibCasesPassed == 10) {
         numPassed++;
         System.out.println("Fibonacci problem Solved");
      } else {
         System.out.println("Fibonacci problem Failed");
      }
      
      if (!mute) {
         System.out.println("");
         System.out.println("");
      }
      if (!mute) {
         System.out.println("Checking Prime Number with 10 Tests");
         System.out.println("-------------------------------------------");
      }
      
      boolean[] primeSol = {false, true, true, false, true, false, true, false, false, false};
      int[] primeQ = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      int primeCasesSolved = 0;
      
      for (int i = 0; i < 10; i++) {
         if (isPrime(primeQ[i]) == primeSol[i]) {
            primeCasesSolved++;
            if (!mute) {
               System.out.println("Case #" + (i + 1) + " Passed");
            } 
         } else {
            if (!mute) {
               System.out.println("Case #" + (i + 1) + " Failed");
            }
         }
      }
      if (!mute) {
         System.out.println("");
         System.out.println("");
      }
      if (primeCasesSolved == 10) {
         numPassed++;
         System.out.println("Prime Numbers problem Solved");
      } else {
         System.out.println("Prime Numbers problem Failed");
      }
      
      if (!mute) {
         System.out.println("");
         System.out.println("");
      }
      
      System.out.println("Problems Passed " + numPassed + "/3");
   }
}
