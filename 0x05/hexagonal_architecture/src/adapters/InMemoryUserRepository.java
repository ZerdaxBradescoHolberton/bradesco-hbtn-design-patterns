// Adaptador (Implementação do repositório em memória)
package adapters;

import domain.User;
import ports.UserRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class InMemoryUserRepository implements UserRepository {
    private final Map<String, User> database = new HashMap<>();


    public void save(User user)
    {
        //implemente o metodo
        database.put(user.getId(), user);
    }

    public User findById(String id)
    {
        //implemente o metodo
        return database.get(id);
    }

    public List<User> findAll()
    {
        //implemente o metodo
        return database.values().stream().toList();
    }
}