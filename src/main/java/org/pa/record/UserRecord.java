package org.pa.record;

import org.pa.items.ItemImpl;
import org.pa.users.UserImpl;
import org.pa.users.interfaces.User;

import java.util.ArrayList;
import java.util.List;

public class UserRecord {
    List<UserImpl>  userList = new ArrayList<UserImpl>();
    public void addUser(UserImpl user){
        userList.add(user);
    }
    public void removeUser(int id){
        userList.remove(id);
    }
}

