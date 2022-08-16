package StringBufferClass;

public class BufferNewClass {
    public static void main(String[] args){
        String s1 = "Babar";
        StringBuffer sb = new StringBuffer(s1);
        System.out.println(sb.append("Satara"));         //buffer append class


       System.out.println(sb.insert( 0,1));         //insert buffer
       System.out.println(sb.replace(1,2,"satara"));        //replace method

        System.out.println(sb.delete(1,3));             //delete buffer
        System.out.println(sb.reverse());                //reverse


   }
}
