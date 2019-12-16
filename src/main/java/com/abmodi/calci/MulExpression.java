package com.abmodi.calci;

public class MulExpression extends Expression {
  private Expression left;
  private Expression right;

  public MulExpression(Expression left, Expression right) {
    addChild(left);
    addChild(right);
    this.left = left;
    this.right = right;
  }

  @Override
  public Integer eval() {
    System.out.println(this);
    return left.eval() * right.eval();
  }

  @Override
  public String toString() {
    return "Mul: " + left.toString() + " * " + right.toString();
  }
}