package application.Validator;

import application.Entity.Account;

/**
 * Created by Cirus on 02-June-19.
 */
public class TransactionValidator {

    public boolean validate(Account from, Double amount) {
        return (from.getBalance() - amount) > 0 && amount > 0;
    }
}
