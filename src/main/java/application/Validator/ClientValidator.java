package application.Validator;

import application.Entity.Client;

/**
 * Created by Cirus on 02-June-19.
 */
public class ClientValidator {

    public boolean validate(Client client) {
        return validateEmail(client.getEmail()) ;
        //&& validateName(client.getName())
        //client.getDatebirth()) &&
    }

   /* private boolean validateName(String name) {
        return name.matches("[a-zA-Z\\s]");
    }*/

   /* private boolean validateCNP(String cnp){
        return (cnp.startsWith("1") || cnp.startsWith("2")) && (cnp.length()==13);
    }*/

    private boolean validateEmail(String email) {
        return email.contains("@") && email.contains(".com");
    }
}
