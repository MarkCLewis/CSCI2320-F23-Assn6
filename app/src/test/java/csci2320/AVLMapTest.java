package csci2320;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AVLMapTest {
  @Test void emptyOnCreate() {
    Map<String, Integer> map = new AVLMap<>();
    assertEquals(0, map.size());
  }

  /**
   * Leave this test here! It is verifying the AVL is doing the right thing.
   */
  @Test void heightTest1() {
    AVLMap<Integer, Integer> map = new AVLMap<>();
    for (int i = 0; i < (1 << 20) - 1; ++i) {
      map.put(i, i);
    }
    assertEquals((1 << 20) - 1, map.size());
    assertEquals(20, map.treeHeight());
  }

  /**
   * Leave this test here! It is verifying the AVL is doing the right thing.
   */
  @Test void heightTest2() {
    AVLMap<Integer, Integer> map = new AVLMap<>();
    for (int i = (1 << 20) - 1; i > 0; --i) {
      map.put(i, i);
    }
    assertEquals((1 << 20) - 1, map.size());
    assertEquals(20, map.treeHeight());
  }

  /**
   * Leave this test here! It is verifying the AVL is doing the right thing.
   */
  @Test void heightTest3() {
    AVLMap<Integer, Integer> map = new AVLMap<>();
    var mid = (1 << 19);
    map.put(mid, mid);
    for (int i = 0; i < (1 << 19); ++i) {
      map.put(mid - i,mid - i);
      map.put(mid + i,mid + i);
    }
    assertEquals((1 << 20) - 1, map.size());
    assertEquals(20, map.treeHeight());
  }

  /**
   * Leave this test here! It is verifying the AVL is doing the right thing.
   */
  @Test void heightTest4() {
    AVLMap<Integer, Integer> map = new AVLMap<>();
    var mid = (1 << 19);
    map.put(mid, mid);
    for (int i = 1; i <= (1 << 19); ++i) {
      map.put(i, i);
      map.put((1 << 20) - i, i);
    }
    assertEquals((1 << 20) - 1, map.size());
    assertEquals(20, map.treeHeight());
  }

  // I'm giving you this test of your iterator that does a petty good job of finding
  // standard errors.
  // @Test void testIterator() {
  //   Map<String, Integer> map = new BSTMap<>();
  //   assertEquals(0, map.size());
  //   var keys = List.of("abc", "xyz", "def", "bob", "pat");
  //   var vals = List.of(3, 19, 42, 16, 32);
  //   for (int i = 0; i < keys.size(); ++i) {
  //     map.put(keys.get(i), vals.get(i));
  //   }
  //   assertEquals(keys.size(), map.size());
  //   int cnt = 0;
  //   for (var kvp: map) {
  //     int index = keys.indexOf(kvp.key());
  //     assertEquals(kvp.value(), vals.get(index));
  //     cnt++;
  //     assertTrue(cnt <= keys.size()); // This prevents you from going into an infinite loop if your iterator doesn't stop.
  //   }
  //   assertEquals(keys.size(), cnt);
  // }

  // Testing remove can be hard. This does a randomized test of remove. You should write your own little
  // tests, but 
  // @Test void testRemoveBig() {
  //   AVLMap<String, Integer> map = new AVLMap<>();
  //   assertEquals(0, map.size());
  //   var keys = new ArrayList<String>();
  //   var vals = new ArrayList<Integer>();
  //   var rand = new Random(70); // Keeping the same number here means you always get the operations.
  //   for (int i = 0; i < 2000; ++i) {
  //     keys.add(App.randomString(rand, 10));
  //     vals.add(rand.nextInt());
  //     map.put(keys.get(i), vals.get(i));
  //   }
  //   Collections.shuffle(keys, rand);
  //   for (int i = 0; i < keys.size(); ++i) {
  //     var key = keys.get(i);
  //     var value = map.get(key).get();
  //     assertTrue(map.contains(key));
  //     // System.out.println("Removing "+key);
  //     assertEquals(Optional.of(value), map.remove(key));
  //     // map.preorderPrintKeys();
  //     assertTrue(map.isConsistent());
  //     assertFalse(map.contains(key));
  //     assertEquals(keys.size()-i-1, map.size());
  //   }
  // }

}
