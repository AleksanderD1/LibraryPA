package org.pa.items;

public interface Item {

    Item borrowItem(Item item);
    void returnItem(Item item);
}
