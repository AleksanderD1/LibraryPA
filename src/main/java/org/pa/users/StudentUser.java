package org.pa.users;

import lombok.Getter;
import lombok.Setter;
import org.pa.enums.UserTypes;

@Getter
@Setter
public class StudentUser extends UserImpl{
    public StudentUser(int userID, String userName, UserTypes userType, int warnings, boolean isBlocked) {
        super(userID, userName, userType, isBlocked, warnings,5,0,14 );
    }
}
