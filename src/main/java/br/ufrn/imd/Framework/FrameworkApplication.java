package br.ufrn.imd.Framework;

import br.ufrn.imd.Framework.model.AppRole;
import br.ufrn.imd.Framework.model.AppUser;
import br.ufrn.imd.Framework.service.AppUserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class FrameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrameworkApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}


	@Bean
	CommandLineRunner run(AppUserService userService){
		return args -> {
			userService.saveAppRole(new AppRole(null, "ADMIN_ROLE"));
			userService.saveAppRole(new AppRole(null, "MANAGER_ROLE"));
			userService.saveAppRole(new AppRole(null, "USER_ROLE"));
			userService.saveAppRole(new AppRole(null, "SUPER_ADMIN_ROLE"));

			userService.saveAppUser(new AppUser(null, "John", "Doe", "john.doe@gmail.com", "123456", new ArrayList<>()));
			userService.saveAppUser(new AppUser(null, "Morgan", "Freeman", "morgan.freeman@gmail.com", "123456", new ArrayList<>()));
			userService.saveAppUser(new AppUser(null, "Brad", "Pitt", "brad.pitt@gmail.com", "123456", new ArrayList<>()));
			userService.saveAppUser(new AppUser(null, "Leonardo", "DiCaprio", "leonardo.dicaprio@gmail.com", "123456", new ArrayList<>()));

			userService.addAppRoleToAppUser("john.doe@gmail.com", "USER_ROLE");
			userService.addAppRoleToAppUser("morgan.freeman@gmail.com", "USER_ROLE");
			userService.addAppRoleToAppUser("morgan.freeman@gmail.com", "MANAGER_ROLE");
			userService.addAppRoleToAppUser("leonardo.dicaprio@gmail.com", "USER_ROLE");
			userService.addAppRoleToAppUser("leonardo.dicaprio@gmail.com", "MANAGER_ROLE");
			userService.addAppRoleToAppUser("leonardo.dicaprio@gmail.com", "ADMIN_ROLE");
			userService.addAppRoleToAppUser("leonardo.dicaprio@gmail.com", "SUPER_ADMIN_ROLE");
			userService.addAppRoleToAppUser("brad.pitt@gmail.com", "USER_ROLE");
		};
	}

}
