package Array;

import com.sun.xml.internal.messaging.saaj.util.TeeInputStream;

public class twoArray {
    public static void main(String[] args) {
//        创建11 *   11 的二维数组
        int arrs[] []=new int [12][11];
//        第二行第三列存入数据 1 ，记住数组是从0 下标开始的
         arrs[1][2]=1;
//        第4行第5列存入数据 2
        arrs[3][4]=2;
        System.out.println(arrs.length);
        for(int [] rows:arrs){
            for (int data:rows){
                System.out.printf("%d \t",data);
            }
            System.out.println( );
        }
        System.out.println("-------------------------------------------");
//        将原始数组转化为稀疏数组
//        声明稀疏数组的空间
//        想获得参数空间的值
        int valueCount=0;
        for(int [] rows:arrs){
            for (int data:rows){
                if(data != 0){
                    valueCount++;
                }
            }
            System.out.println( );
        }
        int count = 0;
        int Trr [] []=new int [valueCount+1][3];
        Trr[count][0]=arrs.length-1;
        Trr[count][1]=arrs[0].length-1;
        Trr[count][2]=valueCount;
//        想想哪些值是否满足循环条件
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs[0].length; j++) {
                if(arrs[i][j]!=0){
                    count ++;
                    Trr[count][0]=i;
                    Trr[count][1]=j;
                    Trr[count][2]=arrs[i][j];
                }
            }
        }
        for (int i =0;i<Trr.length;i++){
            System.out.print(Trr[i][0]+"\t"+Trr[i][1]+"\t"+Trr[i][2]);
            System.out.println( );
        }
        System.out.println("==============================");
//        将稀疏数组转化为二维数组
        int twoArr[][]=new int[Trr[0][0]][Trr[0][1]];
        for (int i = 1; i <= Trr[0][2]; i++) {
                 twoArr[Trr[i][0]][Trr[i][1]]=Trr[i][2];;
        }
        for(int [] rows:twoArr){
            for (int data:rows){
                System.out.printf("%d \t",data);
            }
            System.out.println( );
        }
    }
}
