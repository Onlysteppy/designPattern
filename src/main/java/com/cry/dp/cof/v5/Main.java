package com.cry.dp.cof.v5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("大家好:)，<script>，欢迎访问 mashibing.com ，大家都是996 ");
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HTMLFilter()).addFilter(new SensitiveFilter());
        FilterChain filterChain2=new FilterChain();
        filterChain2.addFilter(new FaceFilter()).addFilter(new URLFilter());
        filterChain2.addFilter(filterChain);
        filterChain2.doFilter(msg);
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
class URLFilter implements Filter {
    public void doFilter(Msg m) {
        String r = m.getMsg();
        r = r.replace("mashibing.com", "http://www.mashibing.com");
        m.setMsg(r);
        return ;
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
class FaceFilter implements Filter {
    public void doFilter(Msg m) {
        String r = m.getMsg();
        r = r.replace(":)", "^V^");
        m.setMsg(r);
        return;
    }
}
class FilterChain implements Filter {
    List<Filter> filters = new ArrayList();

    public FilterChain addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }

    public void doFilter(Msg msg) {
        for (Filter f : filters) {
            f.doFilter(msg);
        }
    }
}