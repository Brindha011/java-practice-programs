class StarPattern {
    public static void main(String[] args) {
        //int rows = 4;

        // Loop through each row
        for (int i = 1; i<=4; i++) { //for(int i=1;i<=rows;i++)
            //here the i value is keep on changes ex:if the i is 1 then the star printed one time
            //then it will go to second line,becoz of Second printline,then i=2 then second loop
            //two times so "**" in same line then it moved to next line so on...
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}