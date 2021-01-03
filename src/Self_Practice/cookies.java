package Self_Practice;

public class cookies {
    public static void main(String[] args) {

        int cookies = 10;
        String day = "tuesday";

        switch (day){
            case "sunday":
                cookies++;
            case "monday":
                cookies +=5;
                break;
            case"tuesday":
            case "wednesday":
                cookies+=10;
            case "thursday":
                cookies +=5;
                break;
            case "friday":
                break;
            case "saturday":
                cookies--;
            default:
                cookies=0;





        }






    }




}
