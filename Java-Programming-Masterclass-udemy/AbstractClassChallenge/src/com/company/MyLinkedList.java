package com.company;

public class MyLinkedList implements NodeList {
    ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {
            this.root = item;
            return true;
        }
        ListItem next = this.root.next();
        while(next != null) {
            if (next.compareTo(item) != 0) {
                next = next.next();
            } else {
                return false;
            }
        }
        next = item;
        return true;
    }

    @Override
    public boolean removeItem(ListItem item) {

    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        }
    }
}
