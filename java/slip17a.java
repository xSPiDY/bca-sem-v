class slip17a{
    public static void main(String args[]){
        int num,i,r,sum=0,temp,count=0;;
        num = args.length;
        int a[]= new int[num];
        int b[]= new int[10];
        for(i=0; i<num; i++){
           a[i] = Integer.parseInt(args[i]);
           sum =0;
           temp =a[i];
           while(a[i]!=0){
               r = a[i]%10;
               sum = sum+r*r*r;
               a[i] = a[i]/10;
           }
           if(temp==sum){
            b[count] = temp;
            count++;
           }
        }
        for(i=0; i<count; i++){
            System.out.print(b[i] + " ");
        }
    }
}