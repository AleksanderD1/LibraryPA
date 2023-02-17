package org.pa.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.pa.enums.UserTypes;

@Getter
@Setter
public class LocalUser extends UserImpl {
    public LocalUser(int userID, String userName, UserTypes userType, int warnings, boolean isBlocked) {
        super(userID, userName, userType, isBlocked, warnings,3,0,7);
    }
}
