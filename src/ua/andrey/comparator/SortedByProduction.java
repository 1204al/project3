package ua.andrey.comparator;

import resultJaxb.ItemCandy;

import java.util.Comparator;

public class SortedByProduction implements Comparator<ItemCandy> {
    @Override
    public int compare(ItemCandy o1, ItemCandy o2) {
        return o1.getProduction().compareTo(o2.getProduction());
    }
}
