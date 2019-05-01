import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;

public class Ast {
    public static String readFile() throws IOException {
        File file = new File("test.txt");
        byte[] encoded = Files.readAllBytes(file.toPath());
        return new String(encoded, Charset.forName("UTF-8"));
    }
    public static void draw_ast() throws IOException {
        String inputString = readFile();
        ANTLRInputStream input = new ANTLRInputStream(inputString);
        gLexer lexer = new gLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gParser parser = new gParser(tokens);
        ParserRuleContext ctx = parser.program();

        printAST(ctx, false, 0);
    }
    private static void printAST(RuleContext ctx, boolean verbose, int indentation) {


        boolean toBeIgnored = !verbose && ctx.getChildCount() == 1 && ctx.getChild(0) instanceof ParserRuleContext;

        if (!toBeIgnored) {
            String ruleName = gParser.ruleNames[ctx.getRuleIndex()];
            for (int i = 0; i < indentation; i++) {
                System.out.print("   ");
            }
            System.out.println(ruleName + " ==> " + ctx.getText());
        }
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree element = ctx.getChild(i);
            if (element instanceof RuleContext) {
                printAST((RuleContext) element, verbose, indentation + (toBeIgnored ? 0 : 1));
            }
        }
    }
}
