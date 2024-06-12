package com.example.library.service.user;

import com.example.library.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService {

    /**
     * Save a user to the repository.
     *
     * @param user the user to be saved
     * @return the saved user
     */
    User save(User user);

    /**
     * Create a new user in the repository.
     *
     * @param user the user to be created
     * @return the created user
     */
    User create(User user);

    /**
     * Get a user by their username.
     *
     * @param username the username of the user to be retrieved
     * @return the user with the specified username
     */
    User getByUsername(String username);

    /**
     * Get the user details service for loading user details by username.
     *
     * @return the user details service
     */
    UserDetailsService userDetailsService();

    /**
     * Get the currently authenticated user.
     *
     * @return the currently authenticated user
     */
    User getCurrentUser();
}
