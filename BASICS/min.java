package BASICS;

public class min {
    public static void main(String[] args) {
        int[] array={4,5224,45,25,45,66,65,323,42,2};
        min m=new min();
        m.minvalue(array);
    }
    public void minvalue(int[] array){
          int minv=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<=minv){
               System.out.println(minv=array[i]);
            }
        }
    }
}
