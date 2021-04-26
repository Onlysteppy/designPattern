package com.cry.dp.cof.v1;

public class Main {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("大家好:)，<script>，欢迎访问 mashibing.com ，大家都是996 ");
        String r = msg.getMsg();
        r = r.replace('<', '[');
        r = r.replace('>', ']');

        r = r.replaceAll("996", "995");
        msg.setMsg(r);
        System.out.println(r);
    }
}

class Msg {
    String name;
    String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "msg='" + msg + '\'' +
                '}';
    }
}