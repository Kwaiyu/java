package com.lsaiah.java;
import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        List<Message> received = List.of(
                new Message(1, "Hello!"),
                new Message(2, "发工资了吗？"),
                new Message(2, "发工资了吗？"),
                new Message(3, "去哪吃饭？"),
                new Message(3, "去哪吃饭？"),
                new Message(4, "Bye")
        );
        List<Message> displayMessages = process(received);
        for (Message message : displayMessages) {
            System.out.println(message.text);
        }
    }
    static List<Message> process(List<Message> received) {
        // TODO: 按sequence去除重复消息
        Set<Message> treeSet = new TreeSet<>(new Comparator<Message>() {
            @Override
            public int compare(Message m1,Message m2) {
                return Integer.compare(m1.sequence, m2.sequence);
            }
        });
        treeSet.addAll(received);
        //将received重定向为一个可修改的新创建的空的ArrayList
        received = new ArrayList<>();
        //将Set的内容全数添加给received
        received.addAll(treeSet);
        return received;
    }
}
class Message {
    public final int sequence;
    public final String text;
    public Message(int sequence, String text) {
        this.sequence = sequence;
        this.text = text;
    }
}
