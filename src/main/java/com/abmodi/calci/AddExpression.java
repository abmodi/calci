package com.abmodi.calci;

public class AddExpression extends Expression {
  Expression left;
  Expression right;

  public AddExpression(Expression left, Expression right) {
    addChild(left);
    addChild(right);
    this.left = left;
    this.right = right;
  }

  @Override
  public Integer eval() {
    System.out.println(this);
    return left.eval() + right.eval();
  }

  @Override
  public String toString() {
    return "Add: " + left.toString() + " + " + right.toString();
  }
}
