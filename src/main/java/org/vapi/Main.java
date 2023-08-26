package org.vapi;

import org.vapi.Entity.AccountObject.Account;
import org.vapi.Entity.AccountObject.Act;
import org.vapi.Entity.MatchObject.Match;

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

        List<Match> matches = account.get().getMatches();
        for (Match match : matches) {
            System.out.println(match.getMetadata().getGameStartPatched());
        }
    }
}
