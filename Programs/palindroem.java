class palindroem{
    public static void main(String[]args){
        int x=141;
        if (x < 0){
            System.out.println("false");
        }
        int rev=0,rem;
        int temp=x;
        while(temp>0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if (rev!= x){
            System.out.println("false");

        }else{
            System.out.println("true");
        }
}
}
        