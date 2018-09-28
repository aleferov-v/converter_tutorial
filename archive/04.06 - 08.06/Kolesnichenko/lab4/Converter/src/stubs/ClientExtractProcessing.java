package stubs;

import person.Client;

public class ClientExtractProcessing {
    public Client createClientDataStub() {
        ClientStub clientStub = new ClientStub();
        Client client = new Client();
        client.setDul(clientStub.getDul());
        client.setFirstName(clientStub.getFirstName());
        client.setId(clientStub.getId());
        client.setSecondName(clientStub.getSecondName());
        client.setSurname(clientStub.getSurname());
        return client;
    }
}
