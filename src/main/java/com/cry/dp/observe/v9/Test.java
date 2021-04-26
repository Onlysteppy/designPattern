package com.cry.dp.observe.v9;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Button button = new Button();
        button.addActionListener(new MyActionListener());
        button.addActionListener(new MyActionListener2());
        button.buttonPressed();
    }
}

class Button {
    private List<ActionListener> actionListenerList = new ArrayList<ActionListener>();

    public void buttonPressed() {
        ActionEvent e = new ActionEvent(System.currentTimeMillis(), this);
        for (int i = 0; i < actionListenerList.size(); i++) {
            ActionListener l = actionListenerList.get(i);
            l.actionPerformed(e);
        }
    }

    public void addActionListener(ActionListener actionListener) {
        actionListenerList.add(actionListener);
    }
}

interface ActionListener {
    public void actionPerformed(ActionEvent event);
}

class MyActionListener implements ActionListener {

    public void actionPerformed(ActionEvent event) {
        System.out.println("button pressed!");
    }
}

class MyActionListener2 implements ActionListener {

    public void actionPerformed(ActionEvent event) {
        System.out.println("button pressed 2!");

    }
}

class ActionEvent {
    long when;
    Object source;

    public ActionEvent(long when, Object source) {
        this.when = when;
        this.source = source;
    }

    public long getWhen() {
        return when;
    }

    public Object getSource() {
        return source;
    }
}