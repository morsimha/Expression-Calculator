/**
 * GuessNumber class is responsible for each game's logic, calculations and attributes.
 */

import java.util.ArrayList;
import java.util.Random;

public abstract class Expression {
   // protected String expression;
   protected String num;

    public Expression() {
        this.num = "";
    }

    public abstract double calculate();

    @Override
    public abstract String toString();

    @Override
    public boolean equals(Object other){
        if((other instanceof Expression))
            return false;
        return false;
    }

//    public boolean equals(Expression exp) {
//        if (exp instanceof Expression)
//            System.out.println("good");
//    }
}
//
//    //Getters and Setters
//    public void setNum(String num) {
//        this.cpuNum = num;
//    }
//
//    public String getNum() {
//        return this.cpuNum;
//    }
//
//    public void addCount() {
//        this.guessCount += 1;
//    }
//
//    public int getCount() {
//        return this.guessCount;
//    }
//
//    public void addNewGuess(String num) {
//        this.guessHistory.add(num);
//    }
//    //Updating the current score using a String containing 2 chars.
//    public void updateScore(int cows, int bulls) {
//        this.scores.add(cows + "" + bulls);
//    }
//
//    public String getLastGuess() {
//        return this.guessHistory.get(this.guessCount);
//    }
//
//    // Generates a random 4 digits number, and tries again if not valid.
//    public void generateNum() {
//        Random rand = new Random();
//        this.setNum(String.format("%04d", rand.nextInt( 9999))); //4 digits format.
//
//        //checks that the random number does not have repeated digits. if so, regenerate.
//        while (!this.checkRepetitive(this.getNum()))
//            this.setNum(String.format("%04d", rand.nextInt( 9999)));
//    }
//
//    //Validity check for all 3 requested checks
//    public String checkValidity() {
//        String num = getLastGuess();
//        if (num != null) { // null means no input was entered or the exit button was pressed.
//            if (num.length() != 4)
//                return "Error! The number you entered is different than 4 digits.\n";
//            else if (!num.matches("^[0-9]+$"))
//                return "Error! Please use only numeric characters.\n";
//            else if (!(checkRepetitive(num)))
//                return "Error! Please use 4 different digits.\n";
//        }
//        return ""; //empty string will ensure proper output for no response from user.
//    }
//
//    //Checks if there's a repetitive digit
//    public boolean checkRepetitive(String num) {
//
//        for (int i = 0; i < 4; i++)
//            for (int j = i + 1; j < 4; j++)
//                if (num.charAt(i) == num.charAt(j))
//                    return false;
//        return true;
//    }
//    //Comparing the new guess to the cpu number.
//    public String compareGuess() {
//        int bulls = 0, cows = 0;
//        for (int i = 0; i < 4; i++) {  //every combination will be checked and stored.
//            for (int j = 0; j < 4; j++)
//                if (this.cpuNum.charAt(i) == this.getLastGuess().charAt(j))
//                    if (i == j)
//                        bulls++;
//                    else
//                        cows++;
//        }
//        updateScore(cows, bulls);
//
//        if (bulls == 4)
//            return "success";
//
//        else { //Creating current info message
//            String initial = "You hit " + cows + (" Cows and ") + bulls + (" Bulls!\nAttempts History:\n\n");
//            scoreMessage += "#" + (guessCount+1) + " (" + guessHistory.get(guessCount) + "): " + scores.get(guessCount).charAt(0) + (" cows and ") + scores.get(guessCount).charAt(1) + " bulls.\n";
//            return initial.concat(scoreMessage);
//        }
//    }
//}