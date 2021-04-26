package com.cry.dp.cof.v2;

public class Main {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("大家好:)，<script>，欢迎访问 mashibing.com ，大家都是996 ");
        new HTMLFilter().doFilter(msg);
        new SensitiveFilter().doFilter(msg);
        System.out.println(msg);
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

interface Filter {
    void doFilter(Msg m);
}

class HTMLFilter implements Filter {
    public void doFilter(Msg m) {
        String r = m.getMsg();
        r = r.replace('<', '[');
        r = r.replace('>', ']');
        m.setMsg(r);
        return;
    }
}

class SensitiveFilter implements Filter {
    public void doFilter(Msg m) {
        String r = m.getMsg();
        r = r.replaceAll("996", "955");
        m.setMsg(r);
        return;
    }
}

