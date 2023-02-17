package org.pa;

import org.pa.enums.BookTypes;
import org.pa.enums.UserTypes;
import org.pa.items.Book;
import org.pa.items.Cd;
import org.pa.record.BorrowedItem;
import org.pa.record.BorrowedItemRecord;
import org.pa.record.ItemRecord;
import org.pa.record.UserRecord;
import org.pa.users.LocalUser;
import org.pa.users.StudentUser;

public class Main {
    public static void main(String[] args) {
        ItemRecord itemRecord = new ItemRecord();
        UserRecord userRecord = new UserRecord();
        BorrowedItemRecord borrowedItemRecord = new BorrowedItemRecord();

        StudentUser studentUser1 = new StudentUser(0, "Andrzej", UserTypes.Student, 0, false);
        LocalUser localUser1 = new LocalUser(1, "Piotr", UserTypes.Local, 0, false);

        Book book1 = new Book(0,"Mein Kempf", BookTypes.Textbooks,214);
        Cd cd1 = new Cd(0,"Bethoven", 16);



        userRecord.addUser(studentUser1);
        userRecord.addUser(localUser1);

        itemRecord.addItem(book1);
        itemRecord.addItem(cd1);

        borrowedItemRecord.borrowItem(book1, localUser1);
        System.out.println(borrowedItemRecord);



    }
}