package OOPs.video6.CustomArrayList;

import java.util.Arrays;

public class CustomArraylist {
    // Costum Arraylist
    private int [] data;
    private static int DEFUALT_SIZE= 10;
    private int size= 0;

    public CustomArraylist(){
        this.data=new int[DEFUALT_SIZE];
    }

    public void add(int num){
        if (ifFull()){
            resize();
        }
        data[size++]=num;
    }


    private void resize() {
        int[] temp=new int[data.length*2];

        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean ifFull() {
        return size==data.length;
    }

    public int remove(){
        int removed=data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }
    public void set(int index, int value){
        data[index]= value;
    }
    @Override
    public String toString() {
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArraylist list =new CustomArraylist();
//        list.add(3);
//        list.add(5);
//        list.add(6);
//
//        System.out.println(list);

        for (int i = 0; i < 14; i++) {
            list.add(2*i);
        }
        System.out.println(list);
    }


}
