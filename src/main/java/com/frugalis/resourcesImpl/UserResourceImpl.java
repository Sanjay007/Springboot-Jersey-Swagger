package com.frugalis.resourcesImpl;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Named;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.frugalis.beans.Users;
import com.frugalis.resources.UsersResource;
@Component
public class UserResourceImpl implements UsersResource {
	private static Map<Integer, Users> userStorage = new HashMap<>();
	private static int i = 1;

	@Override
	public Response getAllUsers() {
		System.out.println("Returning All Users");
		return Response.ok(userStorage.values()).build();
	}

	@Override
	public Response saveUser(Users user) {
		if (userStorage.size() <= 0) {
			user.setId("1");
			userStorage.put(1, user);
			System.out.println("First Inserted");
		} else {
			user.setId(String.valueOf(userStorage.size() + 1));
			userStorage.put(userStorage.size() + 1, user);
		}

		return Response.ok(userStorage.get(userStorage.size())).build();
	}

}
