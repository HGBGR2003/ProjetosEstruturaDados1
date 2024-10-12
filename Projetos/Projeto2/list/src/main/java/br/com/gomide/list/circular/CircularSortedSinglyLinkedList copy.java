package br.com.gomide.list.circular;

import br.com.gomide.list.ListNode;
import br.com.gomide.list.interfaces.ISinglyLinkedList;
import br.com.gomide.list.interfaces.ISortedList;

public class CircularSortedSinglyLinkedList<T extends Comparable<?>>
    implements ISortedList<T>, ISinglyLinkedList<T> {

      private ListNode <T> first;
      private ListNode <T> last;
      private ListNode <T> nextPointer;
      private ListNode <T> loopFinal;

  @Override
  public boolean remove(T value) {
    throw new UnsupportedOperationException("Unimplemented method 'remove'");
  }

  @Override
  public T find(T value) {
    throw new UnsupportedOperationException("Unimplemented method 'find'");
  }

  @Override
  public void clear() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'clear'");
  }

  @Override
  public String listContent() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listContent'");
  }

  @Override
  public void insert(T value) {
    ListNode <T> elemento = new ListNode(value);

    if(first.equals(null) && nextPointer.equals(null) && last.equals(null) && loopFinal.equals(null)){
      this.first = elemento;
      this.nextPointer = elemento;
      this.loopFinal = elemento;
      this.last = elemento;
    } 
    
    
  

    throw new UnsupportedOperationException("Unimplemented method 'insert'");
  }

  @Override
  public void clearNavigation() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'clearNavigation'");
  }

  @Override
  public T getNextElement() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getNextElement'");
  }

}
