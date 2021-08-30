package br.ufrn.imd.Framework.service;

import br.ufrn.imd.Framework.model.AppRole;
import br.ufrn.imd.Framework.model.AppUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AppUserInterface {

    AppUser saveAppUser(AppUser appUser);

    AppRole saveAppRole(AppRole appRole);

    void addAppRoleToAppUser(String username, String roleName);

    AppUser getAppUser(String username);

    List<AppUser> getUserList();

}
