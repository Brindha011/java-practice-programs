class Q3{
    public static void main(String args[]) {
        int oddcount=0;//int evencount=0;
        for(int i=1;i<=10;i++)
        {
            if(i%2!=0)  // if(i%2==0)
            {
                oddcount=oddcount+1;   //evencount=evencount+1;
                //System.out.println(i);
            }
        }
        System.out.println(oddcount);   //System.out.println(evencount);
    }
}
