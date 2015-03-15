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
public class SortedList {

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

}
