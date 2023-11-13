package DAO;

import Domain.Client;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClientMapDAO implements IClientDAO {

    private Map<Long, Client> map;

    public ClientMapDAO() {
        this.map = new HashMap<>();
    }

    @Override
    public boolean register(Client client) {
        if (this.map.containsKey(client.getCpf())) {
            return false;
        }
        this.map.put(client.getCpf(), client);
        return false;
    }

    @Override
    public void delete(long cpf) {
        Client registeredClient = this.map.get(cpf);

        if (registeredClient != null) {
            this.map.remove(registeredClient.getCpf(), registeredClient);

        }
    }

    @Override
    public void modify(Client client) {
        Client registeredClient = this.map.get(client.getCpf());
        if (registeredClient != null) {
            registeredClient.setName(client.getName());
            registeredClient.setCity(client.getCity());
            registeredClient.setAddress(client.getAddress());
            registeredClient.setCpf(client.getCpf());
            registeredClient.setTel(client.getTel());
            registeredClient.sethomeNumber(client.gethomeNumber());
        }
    }

    @Override
    public Client consult(long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Client> allConsult() {
        return this.map.values();
    }

}