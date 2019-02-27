package com.crossoverjie.cim.common.route.algorithm.consistenthash;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SortArrayMapConsistentHashTest {

    @Test
    public void getFirstNodeValue() {
        AbstractConsistentHash map = new SortArrayMapConsistentHash() ;

        List<String> strings = new ArrayList<String>();
        strings.add("zhangsan") ;
        for (int i = 0; i < 10; i++) {
            strings.add("127.0.0." + i) ;
        }
        String process = map.process(strings);
        System.out.println(process);
        Assert.assertEquals("127.0.0.8",process);

    }

    @Test
    public void getFirstNodeValue2() {
        AbstractConsistentHash map = new SortArrayMapConsistentHash() ;

        List<String> strings = new ArrayList<String>();
        strings.add("zhangsan2");
        for (int i = 0; i < 10; i++) {
            strings.add("127.0.0." + i) ;
        }
        String process = map.process(strings);
        System.out.println(process);

        Assert.assertEquals("127.0.0.4",process);
    }

    @Test
    public void getFirstNodeValue3() {
        AbstractConsistentHash map = new SortArrayMapConsistentHash() ;

        List<String> strings = new ArrayList<String>();
        strings.add("1551253899106") ;
        for (int i = 0; i < 10; i++) {
            strings.add("127.0.0." + i) ;
        }
        String process = map.process(strings);

        System.out.println(process);
        Assert.assertEquals("127.0.0.6",process);
    }


    @Test
    public void getFirstNodeValue4() {
        AbstractConsistentHash map = new SortArrayMapConsistentHash() ;

        List<String> strings = new ArrayList<String>();
        strings.add("1551253899106") ;
        strings.add("45.78.28.220:9000:8081") ;
        strings.add("45.78.28.220:9100:9081") ;

        String process = map.process(strings);

        System.out.println(process);
        Assert.assertEquals("45.78.28.220:9000:8081",process);
    }
    @Test
    public void getFirstNodeValue5() {
        AbstractConsistentHash map = new SortArrayMapConsistentHash() ;

        List<String> strings = new ArrayList<String>();
        strings.add("1551253899106") ;
        strings.add("45.78.28.220:9000:8081") ;
        strings.add("45.78.28.220:9100:9081") ;
        strings.add("45.78.28.220:9100:10081") ;

        String process = map.process(strings);

        System.out.println(process);
        Assert.assertEquals("45.78.28.220:9100:10081",process);
    }

    @Test
    public void getFirstNodeValue6() {
        AbstractConsistentHash map = new SortArrayMapConsistentHash() ;

        List<String> strings = new ArrayList<String>();
        strings.add("1551253899106") ;
        strings.add("45.78.28.220:9000:8081") ;
        strings.add("45.78.28.220:9100:9081") ;
        strings.add("45.78.28.220:9100:10081") ;

        String process = map.process(strings);

        System.out.println(process);
        Assert.assertEquals("45.78.28.220:9100:10081",process);
    }
    @Test
    public void getFirstNodeValue7() {
        AbstractConsistentHash map = new SortArrayMapConsistentHash() ;

        List<String> strings = new ArrayList<String>();
        strings.add("1551253899106") ;
        strings.add("45.78.28.220:9000:8081") ;
        strings.add("45.78.28.220:9100:9081") ;
        strings.add("45.78.28.220:9100:10081") ;
        strings.add("45.78.28.220:9100:00081") ;

        String process = map.process(strings);

        System.out.println(process);
        Assert.assertEquals("45.78.28.220:9100:10081",process);
    }

}