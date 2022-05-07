package com.company;

public class MyList<T> {
    private T[]list;
    private  int capacity;

    public MyList(){
        this.list=(T[]) new Object[10];
    };

    public MyList(int capacity) {
        this.list = (T[]) new Object[capacity];
    }


    public int size(){
        int counter=0;
        for (T item: list) {
            if(item != null){
                counter++;
            }
        }
        return  counter;
    }
    public int getCapacity (){
        return list.length;
    }
    public void add(T item){
        if(size()==getCapacity()){
            capacity();
        }
        int i=0;
        while(list[i]!=null){
            i++;
        }
        list[i]=item;
    }
    public T get(int index){
        return list[index];
    }

    public boolean remove(int index){
        if(index< list.length){
            list[index]=null;
            return true;
        }else{
            return false;
        }
    }
    public void set(T item,int index){
        if(index< list.length) {
            list[index] = item;
        }else{
            System.out.println("index değerini kontrol ediniz");
        }
    }
    public int indexOf(T item){
        for(int i = 0 ; i < size() ; i++) {
            if(this.list[i] == item){
                return i;
            }
        }
        return -1;
    }
    public int lastIndexOf(T item){
        int catcher = -1;
        for(int i = 0 ; i < size() ; i++) {
            if(this.list[i] == item){
                catcher = i;
            }
        }
        return catcher;
    }

    public boolean isEmpty(){
        return size()==0;
    }
    public T[] toArray(){
        T[]arr=(T[])new Object[list.length];
        for (int i=0; i<list.length;i++){
            arr[i]=list[i];
        }
        return arr;
    }
    public void clear(){
        for(int i=0;i< list.length;i++){
            list[i]=null;
        }
    }
    public MyList<T> subList(int start,int finish){
        MyList<T> sublist = new MyList<>((finish-start ));
        for(int i = start ; i <finish ; i++){
            sublist.add(list[i]);
        }
        return sublist;
    }
    public boolean contains(T data){
        for(T item : list){
            if(item == data)
                return true;
        }
        return false;
    }
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder("[");
        if(size() > 0){
            for(T item : this.list) {
                if( item != null)
                    result.append(item).append(",");
            }
        }
        if(result.length() > 1)
            result.deleteCharAt(result.length()-1).append("]");
        else
            result.append("]");
        return result.toString();
    }
    public void capacity(){
        T[]temp=(T[]) new Object[list.length];
        for (int i=0; i<list.length;i++) {
            temp[i]=list[i];
        }
        list=(T[]) new Object[temp.length*2];
        for (int i=0; i<temp.length;i++) {
            list[i]=temp[i];
        }
    }

}
