
public class NumberGame {

    public boolean isDividedByThree(int n){
        if(n%3==0){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isDividedByFive(int n){
        if(n%5==0){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isDividedByFiveAndThree(int n){
        if(isDividedByThree(n)&&isDividedByFive(n)){
            return true;
        }
        else{
            return false;
        }
    }

    public String sayFizz() {
        return "Fizz";
    }

    public String sayBuzz(){
        return "Buzz";
    }

    public String sayFizzBuzz() {
        return "FizzBuzz";
    }

    public void playGame(int n){
        for (int i = 0; i < n; i++) {
            System.out.println(decideFizzOrBuzz(i));
        }
    }

    public String decideFizzOrBuzz(int i) {
        if (isDividedByThree(i)){
            return sayFizz();
        }
        else if(isDividedByFive(i)){
            return sayBuzz();
        }
        else if(isDividedByFiveAndThree(i)){
           return sayFizzBuzz();
        }
        else {
            return String.valueOf(i);
        }
    }

}
