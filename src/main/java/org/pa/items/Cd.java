package org.pa.items;

public class Cd extends ItemImpl{
    int trackNumber;
    public Cd(int itemId, String itemName, int trackNumber) {
        super(itemId, itemName, false, 0, null);
        this.trackNumber = trackNumber;
    }
}
