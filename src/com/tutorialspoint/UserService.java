package com.tutorialspoint;

import java.util.List;
//comentario para probar rebase master
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
//comentario test rebase 2
@Path("/UserService")
public class UserService {

	UserDao userDao = new UserDao();
	
	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_XML)
	public List<User> getUsers(){
		return userDao.getAllUsers(); 
	}
}
//comentario en master para generar conflicto
//comentario para probar pull with rebase