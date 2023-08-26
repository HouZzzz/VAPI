package org.vapi;

import org.vapi.Entity.Account;
import org.vapi.Entity.Act;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ValorantAPI valorantAPI = new ValorantAPI();
        Optional<Account> account = valorantAPI.fetchAccount("нouzz#piper", false);

        if (account.isEmpty()) {
            System.out.println("account empty");
            return;
        }

        Map<String, Act> acts = account.get().getBySeason().getActs();

        String latest = acts.keySet().stream()
                .filter(key -> acts.get(key).getError() == null)
                .sorted(Comparator.reverseOrder())
                .findFirst().get();

        System.out.println(acts.get(latest));
    }
}
