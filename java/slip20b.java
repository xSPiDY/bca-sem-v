import java.util.*;
    public class slip20b{
        public static void main (String args[]){
            LinkedList al = new LinkedList<>();
            al.add("CPP");
            al.add("JAVA");
            al.add("Python");
            al.add("PHP");
            System.out.println("Display content using Iterator...");
            Iterator il=al.iterator();
            while(il.hasNext()){
                System.out.println(il.next());
            }
            System.out.println("Display Content Revverse Using ListIterator");
            ListIterator li1=al.listIterator();
            while(li1.hasNext()){
                li1.next();
            }
            while(li1.hasPrevious()){
                System.out.println("" + li1.previous());
            }
        }
    }