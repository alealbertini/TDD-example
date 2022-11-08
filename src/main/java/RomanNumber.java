public class RomanNumber {

    public String getRomanNumber(Integer number){

        String romanNumber = "";

        if(number >= 1 && number <= 3){

            for(int i = 1; i <= number; i++){
                romanNumber += "I";
            }
        }

        if(number == 4){
            romanNumber = "IV";
        }

        return romanNumber; 
    }
}