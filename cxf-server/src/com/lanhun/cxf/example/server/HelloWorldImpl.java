package com.lanhun.cxf.example.server;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.lanhun.cxf.example.model.User;

@WebService(endpointInterface = "com.lanhun.cxf.example.server.HelloWorld", serviceName = "HelloWorld")
//@Path("HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    Map<Integer, User> users = new LinkedHashMap<Integer, User>();

    //@GET
   // @Path("sayHi")
    public String sayHi(String text) {
	return "Hello " + text;
    }

    //@GET
    //@Path("sayHiToUser")
    public String sayHiToUser(User user) {
	users.put(users.size() + 1, user);
	return "Hello " + user.getName();
    }

    //@GET
    //@Path("SayHiToUserList")
    public String[] SayHiToUserList(List<User> userList) {
	String[] result = new String[userList.size()];
	int i = 0;
	for (User u : userList) {
	    result[i] = "Hello " + u.getName();
	    i++;
	}
	return result;
    }
}