package com.abmodi.calci;

import org.antlr.v4.runtime.ANTLRInputStream;
import com.abmodi.calci.parser.*;
import org.antlr.v4.runtime.CommonTokenStream;

public class Calculator {
  public static void main(String[] args) {
    System.out.println("Hello world");

    System.out.println("Evaluating " + args[0]);

    ANTLRInputStream inputStream = new ANTLRInputStream("3 + 5*(16 + 12)/7 - 4");
    CalcBaseLexer lexer = new CalcBaseLexer(inputStream);
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    System.out.println("Token Stream: " + tokenStream);
    CalcBaseParser parser = new CalcBaseParser(tokenStream);
    CalciVisitor visitor = new CalciVisitor();
    System.out.println("Result is: " + visitor.visitStart(parser.start()).eval());
  }
}
