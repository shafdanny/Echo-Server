package command;

/**
 * Created by shafiq on 14/11/15.
 */
public class CommandHandler {
    public String input(String inputLine) {
        String response = "";

        switch (inputLine){
            case "EXIT":response = "EXITOK";return response;
            case "ADDNOM":response = "ADDNOMOK";return response;
            default:response = inputLine;
        }

        return response;
    }
}
