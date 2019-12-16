package com.abmodi.calci;

public class SubExpression extends Expression {
  private Expression left;
  private Expression right;

  public SubExpression(Expression left, Expression right) {
    addChild(left);
    addChild(right);
    this.left = left;
    this.right = right;
  }

  @Override
  public String toString() {
    return "Sub: " + left.toString() + " - " + right.toString();
  }

  @Override
  public Integer eval() {
    System.out.println(this);
    return left.eval() - right.eval();
  }
}