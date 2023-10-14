package csci2320;

import java.util.Iterator;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;

public class AVLMap<K extends Comparable<K>, V> implements Map<K, V> {
  // If you use this, you don't have to do null checks on nodes when you
  // get the height. It is static so it can be called from the Node as well.
  // private static <K extends Comparable<K>, V> int height(Node<K, V> n) {
  //   if (n == null) return 0;
  //   return n.height;
  // }

  // Put your Node class and private data up here.

  // I'm giving you some helper method to make testing easier.
  @SuppressWarnings("unchecked")
  public static <K extends Comparable<K>, V> AVLMap<K, V> of(Map.KeyValuePair<K, V>... elems) {
    AVLMap<K, V> ret = new AVLMap<>();
    for (var kvp: elems) ret.put(kvp.key(), kvp.value());
    return ret;
  }

  @Override
  public boolean equals(Object that) {
    if (that == null || !(that instanceof AVLMap)) return false;
    AVLMap<?, ?> thatSeq = (AVLMap<?, ?>)that;
    if (thatSeq.size() != size()) return false;
    for (Iterator<?> iter1 = thatSeq.iterator(), iter2 = this.iterator(); iter1.hasNext();)
      if (!iter1.next().equals(iter2.next())) return false;
    return true;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BSTMap(");
    boolean first = true;
    for (var kvp: this) {
      if (!first) {
        sb.append(", " + kvp.key() +"->"+kvp.value());
      } else {
        sb.append(kvp.key() +"->"+kvp.value());
        first = false;
      }
    }
    sb.append(")");
    return sb.toString();
  }

  /**
   * Return the height of the tree. This is just for testing purposes, but my tests are going to call it.
   * @return The height of the tree.
   */
  public int treeHeight() {
    // return heigh(root)t;  // Suggested implementation.
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'iterator'");
  }

  @Override
  public Iterator<KeyValuePair<K, V>> iterator() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'iterator'");

    // Note that if you choose to put a parent in your node, you can use the pseudocode
    // in the book for this. If you don't, you are allowed to use a java.util.Stack. Both
    // approaches will need to be named so they can have a constructor that either moves
    // the Node pointer to the first value or populates the stack.
  }

  @Override
  public Optional<V> put(K key, V value) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'put'");
  }

  @Override
  public Optional<V> get(K key) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'get'");
  }

  @Override
  public V getOrElse(K key, V defaultValue) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getOrElse'");
  }

  @Override
  public boolean contains(K key) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'contains'");
  }

  @Override
  public Optional<V> remove(K key) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'remove'");
  }

  @Override
  public int size() {
    // TODO basic implementation to get test to pass.
    return 0;
  }

  @Override
  public Set<K> keySet() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'keySet'");

    // Implementation note. This can be done with an anonymous inner class.
    // You can refer to the BSTMap it is in with `BSTMap.this`. So you
    // can call things like `BSTMap.this.contains`.
  }
  
  @Override
  public <V2> AVLMap<K, V2> mapValues(Function<V, V2> f) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'mapValues'");
  }

  @Override
  public Map<K, V> filter(Function<Map.KeyValuePair<K, V>, Boolean> predicate) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'filter'");
  }

  @Override
  public Optional<Map.KeyValuePair<K, V>> find(Function<Map.KeyValuePair<K, V>, Boolean> predicate) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'find'");
  }

  @Override
  public <E2> E2 fold(E2 zero, BiFunction<E2, Map.KeyValuePair<K, V>, E2> f) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'fold'");
  }

  @Override
  public boolean exists(Function<Map.KeyValuePair<K, V>, Boolean> predicate) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'exists'");
  }

  @Override
  public boolean forall(Function<Map.KeyValuePair<K, V>, Boolean> predicate) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'forall'");
  }

  /**
   * Lets this object work as a function from K to V. Gets the value if the key exists.
   * Throws an exception if it doesn't.
   * @param key the key to look up in the collection
   * @return the associated value
   */
  @Override
  public V apply(K key) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'apply'");
  }

  // ----------------------------These are potential helper functions for debugging ---------------------
  // You can modify these if you want. I don't call them in any way. They don't have to be used if you 
  // don't need them. I used them in debugging my own implementation.

  // public void inorderPrint() {
  //   inorderPrintRecur(root);
  // }

  // private void inorderPrintRecur(Node<K, V> n) {
  //   if (n != null) {
  //     inorderPrintRecur(n.left);
  //     System.out.println(n.key+" -> "+n.value+"  ");
  //     inorderPrintRecur(n.right);
  //   }
  // }

  // public void preorderPrintKeys() {
  //   preorderPrintKeysRecur(root);
  //   System.out.println();
  // }

  // public void preorderPrintKeysRecur(Node<K, V> n) {
  //   if (n != null) {
  //     System.out.print("(" + n.key);
  //     preorderPrintKeysRecur(n.left);
  //     preorderPrintKeysRecur(n.right);
  //     System.out.print(")");
  //   }
  // }

  // public boolean isConsistent() {
  //   return isConsistentRecur(root);
  // }

  // private boolean isConsistentRecur(Node<K, V> n) {
  //   if (n == null) return true;
  //   if (n.parent != null && n.parent.left != n && n.parent.right != n) {
  //     System.out.println("Not a child of parent at "+n.key);
  //     return false;
  //   }
  //   if (n.left != null && n.left.key.compareTo(n.key) >= 0) {
  //     System.out.println("Left child not smaller at "+n.key);
  //     return false;
  //   }
  //   if (n.right != null && n.right.key.compareTo(n.key) <= 0) {
  //     System.out.println("Right child not larger at "+n.key);
  //     return false;
  //   }
  //   return isConsistentRecur(n.left) && isConsistentRecur(n.right);
  // }

}
