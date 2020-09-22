package com.main;


import com.UI.Login;
import com.UI.MainWindow;
import com.core.Account;
import com.core.Message;


public class Main {
    public static boolean linkStatus = true;
    public static void main(String[] args){
        Account acc = new Account();
        //System.out.println(acc.Login("zdz","123456"));
        MainWindow mainWindow = null;
        Login l = new Login(acc,null);
        mainWindow = new MainWindow(acc,l);
        l.changeMainMW(mainWindow);
        l.show();
        //mainWindow.show();
        Message m = new Message(acc);
        System.out.println(m.globalSearch("王自立"));
    }
}
