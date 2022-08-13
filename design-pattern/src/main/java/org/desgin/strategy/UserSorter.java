package org.desgin.strategy;


import java.util.Comparator;

public class UserSorter {
    public void sort(User[] user, Comparator<User> c){
        for (int i = 0; i < user.length; i++) {
            for (int j = 0; j < user.length - i - 1; j++) {
                if(c.compare(user[j],user[j+1])>0){
                    User temp = user[j];
                    user[j] = user[j+1];
                    user[j+1]=temp;
                }
            }
        }
    }

    public int aa(User user, Comparable<User> comparable){
        return comparable.compareTo(user);
    }

}
