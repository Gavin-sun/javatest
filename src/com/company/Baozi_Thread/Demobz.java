package com.company.Baozi_Thread;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/17 15:08
 */
public class Demobz {
    public static void main(String[] args) {
        Baozi bz = new Baozi();
        new Baozipu(bz).start();
        new Chihuo(bz).start();
    }
}
