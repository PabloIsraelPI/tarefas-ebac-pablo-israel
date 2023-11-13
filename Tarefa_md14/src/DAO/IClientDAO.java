package DAO;

import Domain.Client;

import java.util.*;

public interface IClientDAO {


    boolean register(Client client);

    void delete(long cpf);

    void modify(Client client);

    Client consult(long cpf);

    Collection<Client> allConsult();
}
