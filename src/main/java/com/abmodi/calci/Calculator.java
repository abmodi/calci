package com.abmodi.calci;

import org.antlr.v4.runtime.ANTLRInputStream;
import com.abmodi.calci.parser.*;
import org.antlr.v4.runtime.CommonTokenStream;

public class Calculator {
  public static void main(String[] args) {
    System.out.println("Hello world");

    System.out.println("Evaluating " + args[0]);

    ANTLRInputStream inputStream = new ANTLRInputStream(args[0]);
    CalciBaseLexer lexer = new CalciBaseLexer(inputStream);
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    System.out.println("Token Stream: " + tokenStream);
    CalciBaseParser parser = new CalciBaseParser(tokenStream);
    CalciVisitor visitor = new CalciVisitor();
    System.out.println("Result is: " + visitor.visitStart(parser.start()));
  }
}
