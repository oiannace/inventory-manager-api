package com.oiannace.forumapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.oiannace.forumapi.payload.AppUser;
public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    AppUser findByUsername(String username);
}
