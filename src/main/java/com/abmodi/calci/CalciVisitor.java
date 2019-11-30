package com.abmodi.calci;

import com.abmodi.calci.parser.CalciBaseBaseVisitor;
import com.abmodi.calci.parser.CalciBaseParser;

public class CalciVisitor extends CalciBaseBaseVisitor<Integer> {
  @Override
  public Integer visitStart(CalciBaseParser.StartContext ctx) {
    return this.visit(ctx.expr());
  }

  @Override
  public Integer visitOpExpr(CalciBaseParser.OpExprContext ctx) {
    int left = visit(ctx.left);
    int right = visit(ctx.right);

    String op = ctx.op.getText();
    switch (op.charAt(0)) {
      case '*': return left * right;
      case '/': return left / right;
      case '+': return left + right;
      case '-': return left - right;
      default: throw new IllegalArgumentException("Unknown operator " + op);
    }
  }

  @Override
  public Integer visitAtomExpr(CalciBaseParser.AtomExprContext ctx) {
    return Integer.parseInt(ctx.atom.getText());
  }

  @Override
  public Integer visitParenExpr(
      CalciBaseParser.ParenExprContext ctx) {
    return this.visit(ctx.expr());
  }

  @Override
  public Integer visitOperation(
      CalciBaseParser.OperationContext ctx) {
    return super.visitOperation(ctx);
  }
}
