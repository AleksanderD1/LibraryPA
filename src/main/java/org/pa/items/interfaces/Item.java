package org.pa.items.interfaces;

import org.pa.users.UserImpl;

public interface Item {

    void borrowItem(UserImpl user);
    void returnItem();
}
