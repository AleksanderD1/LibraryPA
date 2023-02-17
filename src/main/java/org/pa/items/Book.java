package org.pa.items;

import org.pa.enums.BookTypes;

public class Book extends ItemImpl{
    int numberOfPages;
    BookTypes bookTypes;
    public Book(int itemId, String itemName, BookTypes bookTypes, int numberOfPages) {
        super(itemId, itemName, false, 0,null);
        this.bookTypes = bookTypes;
        this.numberOfPages = numberOfPages;
    }
}
