package Grind75.Stacks_Queues;

public class DynamicStack extends CusStack{
    public DynamicStack(){
        super(); // it will call CusStack()
    }
    public DynamicStack(int size){
        super(size); // it will call DynamicStack()
    }

    @Override    // ctrl o
    public boolean push(int item) {
        if (this.isFull()){
            //double the array size
            int[] temp = new int[data.length*2];
            //cope prev items
            for (int i = 0; i < data.length; i++) {
                temp[i]= data[i];
            }
            data=temp;
        }
        //now we know array is not full
        //insert item
        return super.push(item);
    }
}
