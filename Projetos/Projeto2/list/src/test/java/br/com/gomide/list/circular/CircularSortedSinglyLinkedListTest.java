package br.com.gomide.list.circular;

import org.junit.jupiter.api.Test;       // Para a anotação @Test
import org.junit.jupiter.api.Nested;     // Para a anotação @Nested
import static org.junit.jupiter.api.Assertions.*;  // Para asserções como assertEquals, assertTrue, etc.
import org.junit.jupiter.api.DisplayName; // Para a anotação @DisplayName

public class CircularSortedSinglyLinkedListTest {

    @Test
    @DisplayName("retrieve an empty list")
    public void retrieveAnEmptyList() {
        CircularSortedSinglyLinkedList<Integer> list = new CircularSortedSinglyLinkedList<Integer>();

        String content = list.listContent();

        assertEquals("Lista vazia", content);
    }

    @Nested
    @DisplayName("insert action")
    class Insertion {

        @Test
        @DisplayName("insert elements in order successfully")
        public void insertElementsInOrderSuccessfully() {
            CircularSortedSinglyLinkedList<Integer> list = new CircularSortedSinglyLinkedList<Integer>();

            list.insert(5);
            list.insert(2);
            list.insert(8);
            list.insert(4);

            String content = list.listContent();

            assertEquals("2 -> 4 -> 5 -> 8 -> (circular)", content);
        }
    }

    @Nested
    @DisplayName("find action")
    class Find {

        @Test
        @DisplayName("find an existing element")
        public void findAnExistingElement() {
            CircularSortedSinglyLinkedList<Integer> list = new CircularSortedSinglyLinkedList<Integer>();

            list.insert(2);
            list.insert(5);
            list.insert(8);
            list.insert(4);

            Integer value = list.find(5);

            assertEquals(5, value);
        }

        @Test
        @DisplayName("does not find an element")
        public void doesNotFindAnElement() {
            CircularSortedSinglyLinkedList<Integer> list = new CircularSortedSinglyLinkedList<Integer>();

            list.insert(2);
            list.insert(5);
            list.insert(8);
            list.insert(4);

            Integer value = list.find(666);

            assertNull(value);
        }
    }

    @Nested
    @DisplayName("remove action")
    class Remove {

        @Test
        @DisplayName("remove an existing element")
        public void removeAnExistingElement() {
            CircularSortedSinglyLinkedList<Integer> list = new CircularSortedSinglyLinkedList<Integer>();

            list.insert(2);
            list.insert(5);
            list.insert(8);
            list.insert(4);

            boolean removed = list.remove(5);
            String content = list.listContent();

            assertTrue(removed);
            assertEquals("2 -> 4 -> 8 -> (circular)", content);
        }

        @Test
        @DisplayName("remove the first element")
        public void removeTheFirstElement() {
            CircularSortedSinglyLinkedList<Integer> list = new CircularSortedSinglyLinkedList<Integer>();

            list.insert(2);
            list.insert(5);
            list.insert(8);
            list.insert(4);

            boolean removed = list.remove(2);
            String content = list.listContent();

            assertTrue(removed);
            assertEquals("4 -> 5 -> 8 -> (circular)", content);
        }

        @Test
        @DisplayName("remove the last element")
        public void removeTheLastElement() {
            CircularSortedSinglyLinkedList<Integer> list = new CircularSortedSinglyLinkedList<Integer>();

            list.insert(2);
            list.insert(5);
            list.insert(8);
            list.insert(4);

            boolean removed = list.remove(8);
            String content = list.listContent();

            assertTrue(removed);
            assertEquals("2 -> 4 -> 5 -> (circular)", content);
        }

        @Test
        @DisplayName("does not remove an element")
        public void doesNotRemoveAnElement() {
            CircularSortedSinglyLinkedList<Integer> list = new CircularSortedSinglyLinkedList<Integer>();

            list.insert(2);
            list.insert(5);
            list.insert(8);
            list.insert(4);

            boolean removed = list.remove(666);
            String content = list.listContent();

            assertFalse(removed);
            assertEquals("2 -> 4 -> 5 -> 8 -> (circular)", content);
        }
    }

    @Nested
    @DisplayName("navigation action")
    class Navigate {

        @Test
        @DisplayName("navigate through all elements in a circular manner")
        public void navigateThroughAllElements() {
            CircularSortedSinglyLinkedList<Integer> list = new CircularSortedSinglyLinkedList<Integer>();

            list.insert(2);
            list.insert(5);
            list.insert(8);
            list.insert(9);

            Integer element = list.getNextElement();
            assertEquals(2, element);

            element = list.getNextElement();
            assertEquals(5, element);

            element = list.getNextElement();
            assertEquals(8, element);

            // Circular behavior - after the last element, it should restart
            element = list.getNextElement();
            assertEquals(9, element);

            element = list.getNextElement();
            assertEquals(2, element);
        }

        @Test
        @DisplayName("restart navigation pointer after manually resetting")
        public void restartNavigationPointerAfterResetting() {
            CircularSortedSinglyLinkedList<Integer> list = new CircularSortedSinglyLinkedList<Integer>();

            list.insert(2);
            list.insert(5);
            list.insert(8);

            Integer element = list.getNextElement();
            assertEquals(2, element);

            element = list.getNextElement();
            assertEquals(5, element);

            list.clearNavigation(); // Reset navigation pointer

            element = list.getNextElement();
            assertEquals(2, element); // Should start from the first element again
        }
    }

    @Test
    @DisplayName("clear a list")
    public void clearAListWithElements() {
        CircularSortedSinglyLinkedList<Integer> list = new CircularSortedSinglyLinkedList<Integer>();

        list.insert(2);
        list.insert(5);
        list.insert(8);

        list.clear();
        String content = list.listContent();

        assertEquals("Lista vazia", content);
    }
}
