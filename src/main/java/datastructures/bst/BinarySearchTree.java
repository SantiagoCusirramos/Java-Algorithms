package datastructures.bst;

import datastructures.bst.exceptions.ExceptionIsEmpty;
import datastructures.bst.exceptions.ItemDuplicated;
import datastructures.bst.exceptions.ItemNotFound;

public interface BinarySearchTree<E> {
    void insert(E element) throws ItemDuplicated;
    E search(E element) throws ItemNotFound;
    void delete(E element) throws ExceptionIsEmpty;
    boolean isEmpty();
}
