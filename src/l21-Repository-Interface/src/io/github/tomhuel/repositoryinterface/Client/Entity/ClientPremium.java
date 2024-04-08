package io.github.tomhuel.repositoryinterface.Client.Entity;

public class ClientPremium extends Client {
    public ClientPremium(String username, String email) {
        super(username, email);
    }

    public ClientPremium(Client client) {
        super(client.getUsername(), client.getEmail());
    }
}
