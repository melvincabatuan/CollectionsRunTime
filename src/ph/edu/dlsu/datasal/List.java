/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.dlsu.datasal;

import ph.edu.dlsu.datasal.Exception.ListEmptyException;
import ph.edu.dlsu.datasal.Exception.ListFullException;
import ph.edu.dlsu.datasal.Exception.ListIndexOutOfBoundsException;

/**
 *
 * @author cobalt File: List.java ------------------ This is the List ADT
 * definition
 * @param <E>
 */
public interface List<E> {

    public void createList();
    // precondition: none
    // postcondition: Create an empty list

    public void add(int index, E item) throws ListIndexOutOfBoundsException;
// precondition: index (to be added) is within the position of the list of items, 1<=index<=size()+1
// postcondition: Insert item at position index of a list
// if 1<=index<= size()+1. If index <= size(), items
// at position index onwards are shifted one position
// to the right. Throws an exception when index is out of range
// or if the item cannot be placed on the list (list full).

    public void add(E item);
// postcondition: Insert item at end position of a list
// Throws an exception when index is out of range
// or if the item cannot be placed on the list (list full).

    public void set(int index, E item) throws ListIndexOutOfBoundsException;
// precondition: index (to be replaced) is within the position of the list of items, 1<=index<=size()+1
// postcondition: Replace item at position index of a list
// if 1<=index<= size()+1. If index <= size(), items
// at position index onwards are shifted one position
// to the right. Throws an exception when index is out of range
// or if the item cannot be placed on the list (list empty).

    public void remove(int index) throws ListIndexOutOfBoundsException;
// precondition: index (to be removed) is within the position of the list of items, 1<=index<=size()
// postcondition: Remove item at position index of a list
// if 1<=index<= size(). Items at position
// index+1 onwards are shifted one position to the left
// Throws an exception when index is out of range, or if list is empty.

    public boolean isEmpty();
// precondition: none
// postcondition: Determine if a list is empty

    public E get(int index) throws ListIndexOutOfBoundsException;
// precondition: index is within the position of the list of items, 1<=index<=size()
// postcondition: Returns item at position index of
// a list if 1<=index<=size(). Throws an exception if index is out of range.

    public int size();
// precondition: none
// postcondition: Returns number of items in a list
    
    public void clear();

}
