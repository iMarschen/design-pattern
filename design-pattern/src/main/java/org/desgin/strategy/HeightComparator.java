package org.desgin.strategy;

import java.util.Comparator;

public class HeightComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return (int)(o1.getHeight()- o2.getHeight());
    }
}
