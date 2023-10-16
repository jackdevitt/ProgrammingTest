public class programmingTest {
   
   //Set this boolean to true to mute the logs
   public static boolean mute = false;
   
   //Edit to make this function return the factorial of the number provided in the argument. Assume the number provided is greater than 0 and is of type integer.
   //Ensure the output is an integer and not a double, float, bigint or other type of number
   public static int factorial(int num) {
      return 0;
   }
   
   //Edit this function to return the pig latin version of the inputted word
   //Pig Latin Rules:
   //Move the first letter to the end of the word
   //At the letters "ay" to the end of the word, after the letter you just moved
   //Ensure the output is in all lowercase
   public static String pigLatin(String word) {
   
      return "";
   }
   
   //Take two instances of the Point class (class is defined below) and find the slope between them
   //Slope formula is equal to: y2 - y1 / x2 - x1. 
   //Make sure the function returns a double and not any other type of number such as int, bigint, float
   public static double slope(Point p1, Point p2) {
      return 0.0;
   }
   
   //Use this as a reference for implementing the slope function
   //Instance variable X (int), accessible with the getX() function
   //Instance variable Y (int), accessible with the getY() function 
   public static class Point {
      
      private double x;
      private double y;
      
      public double getX() {
         return x;
      }
      
      public double getY() {
         return y;
      }
      
      public Point(int x, int y) {
         this.x = x;
         this.y = y;
      }
      
      public String toString() {
         return "X: " + x + ", Y: " + y;
      }
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
      
      int casesSolved = 0;
      
      int[] factorialAnswers = {1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800};
      int factorialWrong = 0;
      
      if (!mute) {
         System.out.println("Checking Factorial Problem with 10 Tests");
         System.out.println("-------------------------------------------");
      }
      for (int i = 0; i < 10; i++) {
         int result = factorial(i + 1);
         if (result == factorialAnswers[i]) {
            if (!mute) {
               System.out.println("Case #" + (i + 1) + " Accepted. Answer = " + factorialAnswers[i]);
            }
         } else {
            if (!mute) {
               System.out.println("Case #" + (i + 1) + " Failed. Input = " + (i + 1) + " Answer = " + result + " Expected = " + factorialAnswers[i]);
            }
            factorialWrong++;
         }
      }
      if (factorialWrong > 0) {
         if (!mute) {
            System.out.println("-------------------------------------------");
            System.out.println("Factorial Problem Failed: " + (10 - factorialWrong) + "/10");
         }
      } else {
         if (!mute) {
            System.out.println("-------------------------------------------");
            System.out.println("Factorial Problem Solved");
         }
         casesSolved++;
      }
      
      if (!mute) {
         System.out.println("");
         System.out.println("");
      }
      
      String[] pigLatinQuestions = {"dog", "cat", "bird", "cow", "monkey", "whale", "fish", "shark", "light", "sign"};
      String[] pigLatinAnswers = {"ogday", "atcay", "irdbay", "owcay", "onkeymay", "haleway", "ishfay", "harksay", "ightlay", "ignsay"};
      int pigLatinWrong = 0;
      
      if (!mute) {
         System.out.println("Checking Pig Latin problem with 10 Tests");
         System.out.println("-------------------------------------------");
      }
      for (int i = 0; i < 10; i++) {
         String result = pigLatin(pigLatinQuestions[i]);
         if (result.equals(pigLatinAnswers[i])) {
            if (!mute) {
               System.out.println("Case #" + (i + 1) + " Accepted. Answer = " + pigLatinAnswers[i]);
            }
         } else {
            if (!mute) {
               System.out.println("Case #" + (i + 1) + " Failed. Input = " + pigLatinQuestions[i] + " Answer = " + result + " Expected = " + pigLatinAnswers[i]);
            }
            pigLatinWrong++;
         }
      }
      if (pigLatinWrong > 0) {
         if (!mute) {
            System.out.println("-------------------------------------------");
            System.out.println("Pig Latin Problem Failed: " + (10 - pigLatinWrong) + "/10");
         }
      } else {
         if (!mute) {
            System.out.println("-------------------------------------------");
            System.out.println("Pig Latin Problem Solved");
         }
         casesSolved++;
      }
      
      if (!mute) {
         System.out.println("");
         System.out.println("");
      }
      
      Point[][] slopeQuestions = {{new Point(1, 1), new Point(2, 5)}, {new Point(2, 10), new Point(10, 20)}, {new Point(1, 10), new Point(5, 8)}, {new Point(50, 50), new Point(100, 100)}, {new Point(9900, 5000), new Point(10000, 400)}};
      double[] slopeAnswers = {4.0, 1.25, -0.5, 1.0, -46.0};
      int slopeWrong = 0;
      
      if (!mute) {
         System.out.println("Checking Slope problem with 5 Tests");
         System.out.println("-------------------------------------------");
      }
      for (int i = 0; i < 5; i++) {
         double result = slope(slopeQuestions[i][0], slopeQuestions[i][1]);
         if (result == slopeAnswers[i]) {
            if (!mute) {
               System.out.println("Case #" + (i + 1) + " Accepted. Answer = " + slopeAnswers[i]);
            }
         } else {
            if (!mute) {
               System.out.println("Case #" + (i + 1) + " Failed. Point 1 = " + slopeQuestions[i][0] + " Point 2 = " + slopeQuestions[i][1] + " Answer = " + result + " Expected = " + slopeAnswers[i]);
            }
            slopeWrong++;
         }
      }
      if (slopeWrong > 0) {
         if (!mute) {
            System.out.println("-------------------------------------------");
            System.out.println("Slope Problem Failed: " + (5 - slopeWrong) + "/5");
         }
      } else {
         if (!mute) {
            System.out.println("-------------------------------------------");
            System.out.println("Slope Problem Solved");
         }
         casesSolved++;
      }
      
      System.out.println("");
      System.out.println("");
      
      if (casesSolved != 3) {
         System.out.println("You got " + casesSolved + "/3 problems correct, try again, you got this!");
      } else {
         System.out.println("Congrats you did it! Show this to Ryan/Jack/Jackson as proof of completion!");
      }
   }
}

