package org.pa.record;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.pa.items.ItemImpl;
import org.pa.users.UserImpl;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class BorrowedItem {
    int id;
    ItemImpl item;
    int daysPassed;
    UserImpl user;
    String startDate;
    String EndDate;

    void returnItem(){
        EndDate = "Dont really have the time to implement this thingy";
        item.returnItem();
    }

}
