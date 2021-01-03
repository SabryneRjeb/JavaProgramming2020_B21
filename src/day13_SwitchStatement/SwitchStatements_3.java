package day13_SwitchStatement;

public class SwitchStatements_3 {

    public static void main(String[] args) {


        String browser = "";
        String selectedBrowser = "";

        switch (browser) {   // chrome
            case "chrome":
                selectedBrowser = "CHROME BROWSER";
                break;

            case "firefox":
                selectedBrowser = "FIREFOX BROWSER";

                break;
            case " internet explore":
                selectedBrowser = "internet explore";
                break;
            case "opera":
                selectedBrowser = "OPERA BROWSER";
                break;
            case "edge":
                selectedBrowser = "EDGE BROWSER";
                break;
            case "safari":
                selectedBrowser = "SAFARI BROWSER";
                break;
            default:
                selectedBrowser = "INVALID BROWSER";
        }

        System.out.println(selectedBrowser);
    }


}
