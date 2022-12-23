package com.company;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem next) {
        this.rightLink = next;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem previous) {
        this.leftLink = previous;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem element) {
        if (element != null) {
            return ((String) super.getValue()).compareTo((String) element.getValue());
        }
        return -1;
    }
}
