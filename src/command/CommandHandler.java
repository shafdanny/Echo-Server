package command;

/**
 * Created by shafiq on 14/11/15.
 */
public class CommandHandler {
    public String input(String inputLine) {
        String response = "";

        switch (inputLine){
            case "EXIT":response = "EXITOK";return response;
            case "ADD":response = "ADDOK";return response;
            case "HELP": return ("No help for you, sadly");
            default:response = inputLine;
        }

        return response;
    }
}
