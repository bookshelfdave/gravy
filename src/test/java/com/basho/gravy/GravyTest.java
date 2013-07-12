package com.basho.gravy;

import org.junit.Test;

public class GravyTest {
    @Test
    public void test1() throws Exception {

        String term = Gravy.parse(
                "{" +
                "  add counter gold," +
                "  add counter stone" +
                "}");
        String desired = "{update, [{add, {gold, riak_dt_pncounter}}, " +
                            "{add, {stone, riak_dt_pncounter}}]}";

    }

}
