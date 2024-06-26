package com.portal.bid.service.implementation;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.portal.bid.entity.User;
import com.portal.bid.repository.UserRepository;
import com.portal.bid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImp(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    @Override
    public void saveUser(User u) {
        u.setPassword(passwordEncoder.encode(u.getPassword()));
        User userDetail = userRepository.save(u);
        System.out.println("user saved to db with userId : " + userDetail.getId());

    }
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void loginUser(User u) {
        User storedUser = userRepository.findByUsername(u.getUsername());
        if (storedUser == null) {
            throw new UsernameNotFoundException("User not found with username: " + u.getUsername());
        }
        // Step 3: Verify password
        if (!passwordEncoder.matches(u.getPassword(), storedUser.getPassword())) {
            throw new BadCredentialsException("Invalid password");
        }

    }
    
}
