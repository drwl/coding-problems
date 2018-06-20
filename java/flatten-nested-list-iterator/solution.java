/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    Deque<NestedInteger> stack;

    public NestedIterator(List<NestedInteger> nestedList) {
        stack = new LinkedList<>(nestedList);
    }

    @Override
    public Integer next() {
        return stack.removeFirst().getInteger();
    }

    @Override
    public boolean hasNext() {
        // This while condition will ensure that there is will be an integer at
        // the top to return. Otherwise it will return false.
        while (!stack.isEmpty() && !stack.peekFirst().isInteger()) {
            NestedInteger item = stack.removeFirst();
            List<NestedInteger> list = item.getList();
            // Depending on the list implementation, it may be more efficient
            // to use a reverse iterator or another stack. In the case of a
            // linked list implementation, the list.get(i) call will take
            // O(N^2) accesses. Using another stack you can add reverse the
            // order and keep it to be a linear time operation.
            for (int i = list.size() - 1; i >= 0; i--) {
                stack.addFirst(list.get(i));
            }
        }

        return !stack.isEmpty();
    }
    // Analysis: seems to be a bit tricky. Let N be the number of integers and
    // M be the number of nested lists.
    // Time Complexity: O(N + M)
    // Space Complexity: O(N + M)
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
