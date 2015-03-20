/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.estate.dao.impl;

import real.estate.dao.*;

/**
 *
 *
 */
public class SortedList extends List {

    public SortedList(int maxItems) {
        super(maxItems);
    }

    public void sort(int list[]) {
        for (int i = list.length - 1; i > 1; i--) {

            for (int j = 0; j < i; j++) {

                if (list[j] > list[j + 1]) {

                    swap(j, j + 1, list);

                }

            }

        }

    }

    public void swap(int i, int j, int list[]) {
        int temp = 0;
        list[temp] = list[j + 1];
        list[j + 1] = list[i];
        list[i] = list[temp];

    }

    @Override
    public boolean isThere(Listable item) {
        throw new UnsupportedOperationException("Not supported yet.");
        //Remove above line and implement the code
    }

    @Override
    public Listable retrieve(Listable item) {
        throw new UnsupportedOperationException("Not supported yet.");
        //Remove above line and implement the code
    }

    @Override
    public void insert(Listable item) {
        boolean search = (position < num_of_items);
        while (search) {
            if (item.compareTo(list[position]) < 0) {
                search = false;
            } else {
                position++;
                search = (position < num_of_items);
            }
        }
        for (int index = num_of_items; index > position; index--) {
            list[index] = list[index - 1];
        }
        list[position] = item.copy();
        num_of_items++;
    }

    @Override
    public void delete(Listable item) {
        throw new UnsupportedOperationException("Not supported yet.");
        //Remove above line and implement the code
    }


}
