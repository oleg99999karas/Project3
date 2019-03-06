import java.util.Scanner;
public class Main {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int a1=0, b1=0,a2=0,b2=0,a3=0,b3=0,a4=0,b4=0,a5=0,b5=0, first=0,second=0, three=0, four=0, five=0, counter=0;
        a1 =1+(int) (Math.random() * 10);
        b1 =1+(int) (Math.random() * 10);
        a2 =1+(int) (Math.random() * 10);
        b2 =1+(int) (Math.random() * 10);
        a3 =1+(int) (Math.random() * 10);
        b3 =1+(int) (Math.random() * 10);
        a4 =1+(int) (Math.random() * 10);
        b4 =1+(int) (Math.random() * 10);
        a5 =1+(int) (Math.random() * 10);
        b5 =1+(int) (Math.random() * 10);
        first=a1*b1;
        second=a2*b2;
        three=a3*b3;
        four=a4*b4;
        five=a5*b5;
        System.out.print(ANSI_BLACK+ "1) "+ a1 + " * " +b1+ " = " + ANSI_BLACK);
        int otv1 = scanner.nextInt();
        if (first==otv1)
            {
            System.out.println(ANSI_GREEN+"Правильно" +ANSI_GREEN );
            counter=counter+1;
            }
                else
                    {
                    System.out.println(ANSI_RED + "Ошибка" + ANSI_RED );
                     }

        System.out.print(ANSI_BLACK + "2) "+ a2 + " * " +b2+ " = " + ANSI_BLACK);

        int otv2 = scanner.nextInt();
        if (second==otv2)
            {
            System.out.println(ANSI_GREEN+"Правильно" +ANSI_GREEN );
            counter=counter+1;
             }
                 else
                    {
                    System.out.println(ANSI_RED+"Ошибка" +ANSI_RED );
                     }

        System.out.print(ANSI_BLACK + "3) "+ a3 + " * " +b3+ " = " + ANSI_BLACK);
        int otv3 = scanner.nextInt();
        if (three==otv3)
        {
            System.out.println(ANSI_GREEN+"Правильно" +ANSI_GREEN );
            counter=counter+1;
        }
        else
        {
            System.out.println(ANSI_RED+"Ошибка" +ANSI_RED );
        }

        System.out.print(ANSI_BLACK + "4) "+ a4 + " * " +b4+ " = " + ANSI_BLACK);
        int otv4 = scanner.nextInt();
        if (four==otv4)
        {
            System.out.println(ANSI_GREEN+"Правильно" +ANSI_GREEN );
            counter=counter+1;
        }
        else
        {
            System.out.println(ANSI_RED+"Ошибка" +ANSI_RED );
        }

        System.out.print(ANSI_BLACK+"5) "+ a5 + " * " +b5+ " = "+ ANSI_BLACK );
        int otv5 = scanner.nextInt();
        if (five==otv5)
        {
            System.out.println(ANSI_GREEN+"Правильно" +ANSI_GREEN );
            counter=counter+1;
        }
        else
        {
            System.out.println(ANSI_RED+"Ошибка" +ANSI_RED );
        }


        if (counter==5)
        {
            System.out.println(ANSI_BLACK+"Молодец!"+ANSI_BLACK);
        }
        if (counter==3 || counter==4)
        {
            System.out.println(ANSI_BLACK+"Надо бы еще поучить"+ANSI_BLACK);
        }
        if (counter<=2)
        {
            System.out.println(ANSI_BLACK+"Срочно нужно учить таблицу умножения"+ANSI_BLACK);
        }

    }
}
