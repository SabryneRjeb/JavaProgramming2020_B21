package day13_SwitchStatement;

public class selectBrowser {

    public static void main(String[] args) {

        /*

          2. write a program that can display the selected browser
                1. declare a String variable called browserName
                2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge, ie
                3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
             Ex:
                browserName = "chrome";
                output:
                    Chrome Browser is Selected






         */


        String browserName = "chrome";
        boolean valid = browserName == "Chrome" || browserName == "Firefox" || browserName == "Opera"
                || browserName == " Safari" || browserName == "edge" || browserName == "ie";
        String selectedBrowser = "Firefox";

        if (valid) {
            if (browserName == "Chrome") {
                selectedBrowser = "CHROME BROWSER";
            } else if (browserName == "Firefox") {
                selectedBrowser = "FIREFOX BROWSER";
            } else if (browserName == "Opera") {
                selectedBrowser = "OPERA BROWSER";
            } else if (browserName == "Safari") {
                selectedBrowser = "SAFARI BROWSER";              // commad+option+l will organize code
            } else if (browserName == "edge") {
                selectedBrowser = "EDGE BROWSER";
            } else {
                selectedBrowser = "INTERNET EXPLORE";

            }
        } else {
            System.out.println("no such browser");


        }


        System.out.println(selectedBrowser);


    }


}
