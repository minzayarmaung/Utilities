package OOP.Encapsulation;

public class StackObject {
    public static void main(String [] args){
        int number = 1;
        Stack s = new Stack();

        while(s.push(number)) // Called and Used the Push Method in Stack java program and retun true / false
        {
            System.out.println("Number pushed is : " + number);
            number++;
        }
        
        System.out.println();

        boolean check = true;

        while(check)
        {
            number = s.pop(); // called and used the pop method declared in Stack java program

            if(number!= -1)
            {
            System.out.println("Number popped is : " + number);
            }
            else
            {
                check = false;
            }
        }

    }
}
