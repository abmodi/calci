package com.abmodi.calci;

import com.abmodi.calci.parser.CalciBaseBaseVisitor;
import com.abmodi.calci.parser.CalciBaseParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class CalciVisitor extends CalciBaseBaseVisitor {
  @Override
  public Integer visitExpr(CalciBaseParser.ExprContext ctx) {
    List<TerminalNode> nodes = ctx.NUMBER();
    int num1 = Integer.parseInt(nodes.get(0).toString());
    int num2 = Integer.parseInt(nodes.get(1).toString());
    String operator = ctx.operation().getText();
    System.out.println("Operator: " + operator);
    char oper = operator.charAt(0);
    switch (oper) {
    case '+':
      return num1 + num2;
    case '-':
      return num1 - num2;
    case '*':
      return num1 * num2;
    case '/':
      return num1 / num2;
    }
    return 5;
  }

  @Override
  public Object visitOperation(CalciBaseParser.OperationContext ctx) {
    return super.visitOperation(ctx);
  }
}
