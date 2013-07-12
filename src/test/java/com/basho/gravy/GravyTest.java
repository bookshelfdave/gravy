package com.basho.gravy;

import org.junit.Test;

public class GravyTest {
//    @Test
//    public void test1() throws Exception {
//        String txt = Gravy.parse(
//                "{" +
//                "  add counter gold," +
//                "  add counter stone," +
//                "  add set foo" +
//                "}");
//        String desired = "{update, [{add, {gold, riak_dt_pncounter}}, " +
//                            "{add, {stone, riak_dt_pncounter}}]}";
//
//    }

    @Test
    public void test2() throws Exception {
        String txt = "{increment counter gold by 100, increment counter stone by 50}";
        Gravy.parse(txt);
    }

}
