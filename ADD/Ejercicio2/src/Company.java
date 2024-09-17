import java.util.ArrayList;
import java.util.List;

public class Company{
    private int clientsNumber = 0;
    private List<Client> clientsList = new ArrayList<>();

    public int getClientsNumber(){
        return clientsList.size();
    }

    public void addClient(Client client) throws RuntimeException{
        if(client == null)
            throw new RuntimeException("El cliente introducido es nulo");
        clientsList.add(client);
    }
    
}
