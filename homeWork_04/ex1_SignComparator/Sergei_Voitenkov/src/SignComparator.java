public class SignComparator{

    public String compare(int number) {

        if (number > 0){
            return "Number is positive";
        }
        else if (number == 0){
            return "Number is equal to zero";
        }
        else {
            return "Number is negative";
        }
    }
}
