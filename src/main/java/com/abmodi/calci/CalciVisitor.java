package com.abmodi.calci;

import com.abmodi.calci.parser.CalcBaseBaseVisitor;
import com.abmodi.calci.parser.CalcBaseParser;

public class CalciVisitor extends CalcBaseBaseVisitor<Expression> {
  @Override
  public Expression visitStart(CalcBaseParser.StartContext ctx) {
    return this.visit(ctx.expr());
  }

  @Override
  public Expression visitOpExpr(CalcBaseParser.OpExprContext ctx) {
    Expression left = visit(ctx.left);
    Expression right = visit(ctx.right);

    String op = ctx.op.getText();
    switch (op.charAt(0)) {
      case '*': return new MulExpression(left, right);
      case '/': return new DivExpression(left, right);
      case '+': return new AddExpression(left, right);
      case '-': return new SubExpression(left, right);
      default: throw new IllegalArgumentException("Unknown operator " + op);
    }
  }

  @Override
  public Expression visitAtomExpr(CalcBaseParser.AtomExprContext ctx) {
    return new AtomExpression(ctx.getText());
  }

  @Override
  public Expression visitParenExpr(
      CalcBaseParser.ParenExprContext ctx) {
    return this.visit(ctx.expr());
  }

  @Override
  public Expression visitOperation(
      CalcBaseParser.OperationContext ctx) {
    return super.visitOperation(ctx);
  }
}
