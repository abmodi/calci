package com.abmodi.calci;

public class AtomExpression extends Expression {
  private int val;
  private String text;

  public AtomExpression(String text) {
    this.text = text;
    val = Integer.parseInt(text);
  }

  @Override
  public Integer eval() {
    System.out.println("Atom Expression: " + text);
    return val;
  }

  @Override
  public String toString() {
    return text;
  }
}
