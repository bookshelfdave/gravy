package com.basho.gravy;

import org.junit.Test;

public class GravyTest {
    @Test
    public void test1() throws Exception {
        String txt = Gravy.parse(
                "{" +
                "  add counter gold," +
                "  add counter stone," +
                "  add set foo" +
                "}");
        String desired = "{update, [{add, {gold, riak_dt_pncounter}}, " +
                            "       {add, {stone, riak_dt_pncounter}}]}";

    }

    @Test
    public void test2() throws Exception {
        String txt = "{increment counter gold by 100, " +
                     " increment counter stone by 50}";
        Gravy.parse(txt);
    }


    @Test
    public void test3() throws Exception {

        //String txt = "{update, [{update, {weapons, riak_dt_vvorset}, {add, \"Halberd\"}},\n" +
        //             "          {update, {friends, riak_dt_vvorset}, {add, dave}}]}";

//        String txt =   "{\n" +
//                        "    set(weapons) {\n" +
//                        "        add halberd\n" +
//                        "    }\n" +
//                        "    set(friends) {\n" +
//                        "        add dave\n" +
//                        "    }\n" +
//                        "}";


        String txt =   "{\n" +
                "    set(weapons), " +
                "    set(friends) {" +
                "        add dave" +
                "    }" +
                "}";
        Gravy.parse(txt);
    }
}
