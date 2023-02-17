package org.pa.items;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.pa.items.interfaces.Item;
import org.pa.users.UserImpl;

@Setter
@Getter
@AllArgsConstructor
public abstract class ItemImpl implements Item {
    int itemId;
    String itemName;
    Boolean isBorrowed = false;
    int daysBorrowed = 0;
    UserImpl itemBorrower;
    @Override
    public void borrowItem(UserImpl user) {
        itemBorrower = user;
        isBorrowed = true;
    }

    @Override
    public void returnItem() {
        isBorrowed = false;
        itemBorrower = null;

    }
}
