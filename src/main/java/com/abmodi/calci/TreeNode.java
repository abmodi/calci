package com.abmodi.calci;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<T> {
  private List<TreeNode> children;

  public TreeNode() {
    children = new ArrayList<>();
  }

  public List<TreeNode> getChildren() {
    return children;
  }

  public void addChild(TreeNode node) {
    children.add(node);
  }
}
