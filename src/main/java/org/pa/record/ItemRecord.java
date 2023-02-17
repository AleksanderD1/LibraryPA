package org.pa.record;

import org.pa.items.ItemImpl;

import java.util.ArrayList;
import java.util.List;

public class ItemRecord {
    List<ItemImpl> itemsList = new ArrayList<ItemImpl>();
    public void addItem(ItemImpl item){
        itemsList.add(item);
    }
    public void removeItem(int id){
        itemsList.remove(id);
    }
}
