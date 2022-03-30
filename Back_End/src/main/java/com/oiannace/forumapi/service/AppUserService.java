package com.oiannace.forumapi.service;

import com.oiannace.forumapi.payload.AppUser;
import com.oiannace.forumapi.payload.Role;

import java.util.List;

public interface AppUserService {
    AppUser saveUser(AppUser user);
    Role saveRole(Role role);
    void assignRole(String username, String rolename);
    AppUser getUser(String username);
    List<AppUser> getUsers();
}
