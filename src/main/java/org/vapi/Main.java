package org.vapi;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ValorantAPI valorantAPI = new ValorantAPI();
        System.out.println(valorantAPI.fetchAccount("нouzz#piper", false));
    }
}
