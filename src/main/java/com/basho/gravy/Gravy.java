package com.basho.gravy;


import com.basho.gravy.parser.GravyErrorListener;
import com.basho.gravy.parser.GravyLexer;
import com.basho.gravy.parser.GravyParser;
import com.basho.gravy.parser.ParseException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Gravy {
    public static String parse(String s) throws ParseException {
        ANTLRInputStream input = new ANTLRInputStream(s);
        GravyLexer lexer = new GravyLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GravyParser parser = new GravyParser(tokens);
        parser.removeErrorListeners();
        //parser.addErrorListener(new GravyErrorListener());
        GravyWalker ew = new GravyWalker(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        GravyParser.Crdt_commandContext result = null;
        try {
            result = parser.crdt_command();
            walker.walk(ew, result);
        } catch (Throwable e) {
            throw new ParseException("Gravy parse error", e);
        }
        String term = (String)ew.getValue(result);
        return term;
    }
}
