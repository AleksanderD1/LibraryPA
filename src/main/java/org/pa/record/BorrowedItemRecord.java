package org.pa.record;

import lombok.ToString;
import org.pa.items.ItemImpl;
import org.pa.users.UserImpl;
import org.pa.users.interfaces.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@ToString
public class BorrowedItemRecord {
    List<BorrowedItem> borrowedItem = new ArrayList<BorrowedItem>();
    public void borrowItem(ItemImpl item, UserImpl user){
        if(user.getCurrentItems() < user.getItemLimit()){
            item.borrowItem(user);
            int id = item.getItemId();
            BorrowedItem borrowedItem1 = new BorrowedItem(id,item,0, user,"now", "Later");
            borrowedItem.add(borrowedItem1);
        }


    }
    public void returnItem(int id){
        borrowedItem.get(id).returnItem();
    }
    public String longestBorrow(){
        borrowedItem = borrowedItem.stream()
                .sorted(Comparator.comparingInt(BorrowedItem::getDaysPassed))
                .toList();
        String userName = borrowedItem.get(borrowedItem.size()-1).user.getUserName();
        int time = borrowedItem.get(borrowedItem.size()-1).daysPassed;
        String wholeString = "The record is set by" + userName + "it was" + time + "since he borrowed his book";
        return  wholeString;

    }
}
