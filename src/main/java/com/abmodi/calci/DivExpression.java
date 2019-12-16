package com.abmodi.calci;

public class DivExpression extends Expression {
  private Expression left;
  private Expression right;

  public DivExpression(Expression left, Expression right) {
    addChild(left);
    addChild(right);
    this.left = left;
    this.right = right;
  }

  @Override
  public Integer eval() {
    System.out.println(this);
    return left.eval() / right.eval();
  }

  @Override
  public String toString() {
    return "Div: " + left.toString() + " / " + right.toString();
  }
}