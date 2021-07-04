package queue;

import java.util.Scanner;

public class SingleArrayQueue {
//    想想队列需要那些参数
//    两个指针
//    前
    int front;
//    尾
    int real;
//    首先我们用数组的形式来创建对列，
//    那么需要声明初始数组的大小；
    int maxSize;
    int arr[];
//    构造函数：初始化对列
    public  SingleArrayQueue(int maxSize){
//        初始化
        front=-1;
        real=-1;
        this.maxSize=maxSize;
        arr=new int[maxSize];
    }

//    判断队列是否为空
    public boolean isEmpty(){
        return  front == real;
    }
//    判断是否为满员了
    public boolean isFull(){
        return real == maxSize-1;
    }

//    开始创建对列的一些功能
//    添加
     void addQueue(int yuan){
        if(isFull()){
            throw new RuntimeException("队列已满，，，，");
        }
         real++;
         arr[real] = yuan;
     }
// 出队列
    public int getQueue(){
        if(isEmpty()){
            throw  new  RuntimeException("队列为空。。。。。");
        }
        front++;
        int value=arr[front];
        return value;
    }
//    队头的数据
    int  showFront(){
        if (isEmpty()) {
            throw new RuntimeException("队列为空。。。。。");
        }
        return  arr[front+1];
    }

    void showQueue(){
        for (int i=0;i<arr.length;i++){
            System.out.printf("arr[%d]=%d\n ",i,arr[i]);
        }
    }
//    测试
    public static void main(String[] args) {
        SingleArrayQueue arrayQueue=new SingleArrayQueue(3);
        Scanner scanner=new Scanner(System.in);
        char key=' ';
        boolean loop=true;
        while (loop){
            System.out.println("add 入队");
            System.out.println("g   出队");
            System.out.println("s(show) 获取队列的数据 ");
            System.out.println("f(front) 获取队头的数据");
            System.out.println("e(exit system) 推出系统");
          key= scanner.next().charAt(0);
            switch (key){
                case 'a':
                    try{
                        System.out.println("添加数据");
                        int i = scanner.nextInt();
                        arrayQueue.addQueue(i);
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'g':
                    try{
                        int queue = arrayQueue.getQueue();
                        System.out.println("取出的数据为"+queue);
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 's':
                    arrayQueue.showQueue();
                    break;
                case 'f':
                    int i1 = arrayQueue.showFront();
                    System.out.println("front 的数据为"+i1);
                    break;
                case 'e':
                    loop =false;
                    break;
                    default:
                        break;

            }
        }
    }
//
}
