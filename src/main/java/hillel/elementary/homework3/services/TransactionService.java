package hillel.elementary.homework3.services;

import hillel.elementary.homework3.entities.Client;
import hillel.elementary.homework3.utils.Helper;

public class TransactionService {
    public void proceedTransaction(Client client, String accountId) {
        Helper helper = new Helper();
        helper.checkAccountIdEquality(client.getAccountId(), accountId);
    }
}
