package command;

/**
 * Created by shafiq on 14/11/15.
 */
public class CommandHandler {
    public String input(String inputLine) {
        String response = "";

        switch (inputLine){
            case "EXIT":break;
            default:response = inputLine;
        }

        return response;
    }
}
