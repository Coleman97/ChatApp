package main;

import javax.swing.JFrame;

public class ChatServer extends JFrame {
    ChatServer(){
        setSize(400,700);
        setLocation(400,200);
        setVisible(true);

    }

    public static void main(String[] args){
        new ChatServer().setVisible(true);
    }
}
