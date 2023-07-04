package com.example.DataDog.Services;

import com.example.DataDog.Models.User;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.logging.Logger;

@Service
public class UsersService {

    private final List<User> users = new ArrayList<>();
    private final Logger logger = Logger.getLogger(UsersService.class.getName());

    public UsersService() {
        users.add(new User(UUID.randomUUID(), "Juan Perez", "Im a Java developer"));
        users.add(new User(UUID.randomUUID(), "Marina Rojas", "Im an Elm developer"));
        users.add(new User(UUID.randomUUID(), "Bautista Fernandez", "Im an JavaScript developer"));
        users.add(new User(UUID.randomUUID(), "Georgina Martinez", "Im an Elixir developer"));
    }

    public List<User> getUsers() {
        try {
            Thread.sleep(new Random().nextInt(5) * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        logger.info("Getting users");
        logger.info("users_found=" + users.size());
        return users;
    }

}
