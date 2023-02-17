package org.pa.users.interfaces;

import org.pa.items.interfaces.Item;

public interface User {
    void borrowItem (Item item);
    void returnItem(int itemId);

    void addWarning();

    void blockUser();
}
