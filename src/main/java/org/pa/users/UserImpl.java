package org.pa.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.pa.enums.UserTypes;
import org.pa.items.interfaces.Item;
import org.pa.users.interfaces.User;

@Setter
@Getter
@AllArgsConstructor
public abstract class UserImpl implements User {
    int userID;
    String userName;
    UserTypes userType;
    Boolean isBlocked;
    int warnings;
    int itemLimit;
    int currentItems;
    int timeLimit;
    @Override
    public void borrowItem(Item item) {

    }

    @Override
    public void returnItem(int itemId) {

    }

    @Override
    public void addWarning() {
        warnings += 1;
        if(warnings >= 3){
            blockUser();
        }
    }
    @Override
    public void blockUser() {
        isBlocked = true;
    }
}
