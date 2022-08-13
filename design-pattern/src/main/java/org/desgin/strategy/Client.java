package org.desgin.strategy;

import java.util.Arrays;
import java.util.Comparator;

public class Client {
    public static void main(String[] args) {
        User anni = new User("anni", 31, 10.0);
        User anni1 = new User("anni1", 22, 9.0);
        User anni2 = new User("anni2", 18, 15.5);
        User[] users = {anni,anni1,anni2};

        UserSorter userSorter = new UserSorter();
//        userSorter.sort(users, (u1, u2) -> u1.getAge()-u2.getAge());
//        System.out.println(Arrays.toString(users));
        userSorter.sort(users, new HeightComparator());
        System.out.println(Arrays.toString(users));
        Comparable<User> userComparable = User::getAge;

        int aa = userSorter.aa(anni1, userComparable);
        System.out.println(aa);
    }

}
