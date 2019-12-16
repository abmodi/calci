package com.abmodi.calci;

public abstract class Expression extends TreeNode<Expression> {
  abstract public Integer eval();
}
