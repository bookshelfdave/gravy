package com.basho.gravy;

/*
 * -------------------------------------------------------------------
 *
 *   Copyright (c) 2013 Dave Parfitt
 *
 *   This file is provided to you under the Apache License,
 *   Version 2.0 (the "License"); you may not use this file
 *   except in compliance with the License.  You may obtain
 *   a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing,
 *   software distributed under the License is distributed on an
 *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *   KIND, either express or implied.  See the License for the
 *   specific language governing permissions and limitations
 *   under the License.
 * -------------------------------------------------------------------
 */


import com.basho.gravy.parser.GravyBaseListener;
import com.basho.gravy.parser.GravyParser;
import com.metadave.etp.rep.*;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GravyWalker extends GravyBaseListener {
    ParseTreeProperty<Object> values = new ParseTreeProperty<Object>();

    CommonTokenStream tokens;

    static Map<String, String> crdtTypeMap = new HashMap<String, String>();
    static {
        crdtTypeMap.put("counter", "riak_dt_pncounter");
        crdtTypeMap.put("set",     "riak_dt_vvorset");
    }

    public GravyWalker(CommonTokenStream tokens) {
        this.tokens = tokens;
    }

    public void setValue(ParseTree node, Object value) {
        values.put(node, value);
    }

    public Object getValue(ParseTree node) {
        return values.get(node);
    }

    @Override
    public void exitCrdt_command(GravyParser.Crdt_commandContext ctx) {

    }

    @Override
    public void exitCrdt_incdec_counter(GravyParser.Crdt_incdec_counterContext ctx) {
        //crdt_incdec_counter: (INCREMENT | DECREMENT) TYPE_COUNTER ID BY INT;
        ETPAtom op = null;
        if(ctx.INCREMENT() != null) {
            op = new ETPAtom("increment");
        } else {
            op = new ETPAtom("decrement");
        }
        ETPAtom ctype = new ETPAtom(crdtTypeMap.get(ctx.TYPE_COUNTER().getText()));

        //ETPInteger val = new ETPInteger(Integer.parseInt(ctx.value.getText());
        ETPAtom id = new ETPAtom(ctx.ID().getText());

        //ETPTuple t = new ETPTuple(new ETPAtom("update"), new ETPTuple(id, ctype), new ETPTuple(op, val));
        //System.out.println(t);
    }

    @Override
    public void exitCrdt_type(GravyParser.Crdt_typeContext ctx) {
        setValue(ctx, crdtTypeMap.get(ctx.getText()));
    }

    @Override
    public void exitCrdt_scope(GravyParser.Crdt_scopeContext ctx) {
//        List<ETPTerm<?>> children = new ArrayList<ETPTerm<?>>();
//        for(GravyParser.Crdt_scope_commandContext cmd : ctx.cmds) {
//            children.add((ETPTerm<?>)getValue(cmd));
//        }
//        ETPTuple term = new ETPTuple(new ETPAtom("update"), new ETPList(children));
//        System.out.println(term);
//        setValue(ctx, term);
    }

    @Override
    public void exitCrdt_add_type(GravyParser.Crdt_add_typeContext ctx) {
        ETPAtom op = new ETPAtom("add");
        ETPAtom id = new ETPAtom(ctx.ID().getText());
        ETPAtom ctype = new ETPAtom((String)getValue(ctx.crdt_type()));
        ETPTuple t = new ETPTuple(id, ctype);
        ETPTuple add = new ETPTuple(op, t);
        // {add, {gold, riak_dt_pncounter}
        setValue(ctx, add);
    }

    @Override
    public void exitCrdt_scope_command(GravyParser.Crdt_scope_commandContext ctx) {
        if(ctx.crdt_add_type() != null) {
            ETPTerm<?> newval = (ETPTerm<?>)getValue(ctx.crdt_add_type());
            setValue(ctx, newval);
        }
    }

    @Override
    public void exitCrdt_initializer(GravyParser.Crdt_initializerContext ctx) {
        super.exitCrdt_initializer(ctx);
    }

}
