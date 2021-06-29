package JavaCollectionFramework.DSAArrayList.MyList;

import java.util.Arrays;

public class MyList<E> {

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList(int i) {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index,E e) {
        if (index > elements.length) {
            throw new IllegalStateException("Error index: " + index);
        } else if (index + 1 == elements.length) {
            ensureCapa();
        }
        if (elements[index] == null) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
        elements[size++] = e;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        } else {
            for (int i = 0; i < size - 1; i++) {
                if(i == index){
                    E temp = (E) elements[i];
                }
            }
//                elements[i] =  elements[i + 1];
//            }elements[size -1] = null;
        }return (E) elements[index];
    }

    public int size(){
        int count = 0;
        for(int i = 0;i<elements.length;i++){
            count++;
        }return count;
    }

//    public E clone(){
//
//    }

    public int indexOf(E o){
        int temp = -1;
        for(int i = 0; i < elements.length;i++){
            if(elements[i]== o){
                temp = i;
            }
        }return temp;
    }

    public boolean add(E o){
        if( size == elements.length){
            ensureCapa();
        }
        elements[size] = o;
        size++;
        return true;
    }
}


