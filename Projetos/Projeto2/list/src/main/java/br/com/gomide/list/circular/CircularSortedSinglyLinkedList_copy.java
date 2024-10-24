package br.com.gomide.list.circular;

import br.com.gomide.list.ListNode;
import br.com.gomide.list.interfaces.ISinglyLinkedList;
import br.com.gomide.list.interfaces.ISortedList;

public class CircularSortedSinglyLinkedList_copy<T extends Comparable<T>>
        implements ISortedList<T>, ISinglyLinkedList<T> {

    private ListNode<T> first;
    private ListNode<T> last;
    private ListNode<T> nextPointer;
    private ListNode<T> loopFinal;

    @Override
    public boolean remove(T value) {
        if (first == null) {
            return false;  // Lista vazia
        }

        ListNode<T> current = first;
        ListNode<T> previous = null;

        do {
            if (current.getValue().equals(value)) {
                if (current == first) { // Remover o primeiro elemento
                    first = first.getNext();
                    last.setNext(first);  // Mantém a circularidade

                    if (current == last) { // Caso a lista tenha apenas um elemento
                        first = null;
                        last = null;
                    }
                } else {
                    previous.setNext(current.getNext());
                    if (current == last) {
                        last = previous; // Atualiza o último se necessário
                        last.setNext(first);  // Mantém a circularidade
                    }
                }

                return true;
            }

            previous = current;
            current = current.getNext();
        } while (current != first);

        return false;  // Valor não encontrado
    }

    @Override
    public T find(T value) {
        if (first == null) {
            return null;  // Lista vazia
        }

        ListNode<T> current = first;
        do {
            if (current.getValue().equals(value)) {
                return current.getValue();
            }
            current = current.getNext();
        } while (current != first);

        return null;  // Valor não encontrado
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        nextPointer = null;
    }

    @Override
    public String listContent() {
        if (first == null) {
            return "Lista vazia";
        }

        StringBuilder listContent = new StringBuilder();
        ListNode<T> current = first;
        do {
            listContent.append(current.getValue()).append(" -> ");
            current = current.getNext();
        } while (current != first);

        listContent.append("(circular)");

        return listContent.toString();
    }

    @Override
    public void insert(T value) {
        ListNode<T> newNode = new ListNode<>(value);

        // Caso a lista esteja vazia
        if (first == null) {
            first = newNode;
            last = newNode;
            last.setNext(first);  // Circularidade, último aponta para o primeiro
        } else if (value.compareTo(first.getValue()) < 0) {
            // Caso o valor a ser inserido seja menor que o primeiro (inserção no início)
            newNode.setNext(first);
            first = newNode;
            last.setNext(first);  // Mantém a circularidade
        } else {
            // Percorre a lista para inserir em ordem
            ListNode<T> current = first;
            while (current.getNext() != first && value.compareTo(current.getNext().getValue()) > 0) {
                current = current.getNext();
            }

            // Inserção entre os elementos
            newNode.setNext(current.getNext());
            current.setNext(newNode);

            // Atualiza o ponteiro "last" se o novo elemento for inserido no final
            if (current == last) {
                last = newNode;
            }
        }
    }

    @Override
    public void clearNavigation() {
        this.nextPointer = this.first;
    }

    @Override
    public T getNextElement() {
        if (first == null) {
            return null;  // Lista vazia
        }

        // Se o ponteiro de navegação não estiver inicializado, comece do primeiro
        if (nextPointer == null) {
            nextPointer = first;
        }

        T value = nextPointer.getValue();

        // Avança para o próximo elemento e, se chegar no fim, retorna ao início
        nextPointer = nextPointer.getNext();
        if (nextPointer == null) {  // Se chegamos ao final da lista (não deveria acontecer em uma lista circular)
            nextPointer = first;  // Reinicia a navegação
        }

        return value;
    }

}
