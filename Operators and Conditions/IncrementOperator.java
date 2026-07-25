class IncrementOperator{
    public static void main(String args[]){
        // post increment
        System.out.println("Post increment:");
        int x=3;
        if(x++ == 3){
            // first evaluation (3==3 => evaluate true), then increment x++ (x=4)
            System.out.println("value of x is " + x);
        }
        else{
            System.out.println("condition is false");
        }


        // pre increment
        System.out.println("Pre increment:");
        int y = 5;
        if(++y == 5){
            // first increment ++x (x=6), then evaluation (6==5 => evaluate false)
            System.out.println("value of y is " + y);
        }
        else{
            System.out.println("condition is false");
        }


    }
}
