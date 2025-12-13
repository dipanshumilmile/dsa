class MyCircularQueue {
    private int[] queue;
    private int rear;
    private int front;
    private int size;
    private int capacity;


    public MyCircularQueue(int k) {
        capacity =k;
        size=0;
        front =-1;
        rear=-1;
        queue = new int[k];   
    }
    
    public boolean enQueue(int value) {
        if(!isFull()){
            rear = (rear+1)%capacity;
            queue[rear]=value;
            if(front ==-1) front++;
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if(!isEmpty()){
             if(front == rear) {
                front =-1; 
                rear=-1;
            }else{
            front = (front +1)%capacity;
            }
            
            return true;

        }
        return false;
    }
    
    public int Front() {
        if(!isEmpty()) return queue[front];
        return -1;
    }
    
    public int Rear() {
        if(!isEmpty()) return queue[rear];
        return -1;
    }
    
    public boolean isEmpty() {
        return rear==-1 && front ==-1;
    }
    
    public boolean isFull() {
        if((rear + 1)%capacity == front) return true;
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */