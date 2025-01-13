package com.example.ccsd.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class usersService {

    @Autowired
    private usersRepository usersRepository;

    // Get all users
    public List<users> getAllUsers() {
        return usersRepository.findAll();
    }

    // Get user by ID
    public Optional<users> getUserById(String id) {
        return usersRepository.findById(id);
    }

    // Add a user
    public users addUser(users user) {
        return usersRepository.save(user);
    }

    // Update a user
    public users updateUser(String id, users userDetails) {
        Optional<users> existingUser = usersRepository.findById(id);

        if (existingUser.isPresent()) {
            users user = existingUser.get();
            user.setEmail(userDetails.getEmail());
            user.setPassword(userDetails.getPassword());
            user.setFirstName(userDetails.getFirstName());
            user.setLastName(userDetails.getLastName());
            user.setPhoneNumber(userDetails.getPhoneNumber());
            user.setAddress(userDetails.getAddress());
            user.setRole(userDetails.getRole());
            user.setUsername(userDetails.getUsername());
            user.setDob(userDetails.getDob());
            user.setProfPic(userDetails.getProfPic());
            return usersRepository.save(user);
        }

        return null;
    }

    // Delete a user
    public void deleteUser(String id) {
        usersRepository.deleteById(id);
    }

    // Get user by email
    public users getUserByEmail(String email) {
        return usersRepository.findAll()
                .stream()
                .filter(user -> email.equals(user.getEmail()))
                .findFirst()
                .orElse(null);
    }
}
