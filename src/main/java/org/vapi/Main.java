package org.vapi;

import org.vapi.Entity.AccountObject.Account;
import org.vapi.Entity.AccountObject.Act;
import org.vapi.Entity.MatchObject.Match;
import org.vapi.Entity.MatchObject.Player;
import org.vapi.Entity.MatchObject.PlayerStats;
import org.vapi.Entity.MatchObject.Round;

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
        System.out.println(matches.size());
        for (Match match : matches) {
            for (Round round : match.getRounds()) {
                for (PlayerStats playerStat : round.getPlayerStats()) {
                    System.out.println(playerStat.getRoundEconomy().getSpent());
                }
            }
        }
    }
}
