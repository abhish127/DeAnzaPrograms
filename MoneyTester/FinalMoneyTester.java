public class FinalMoneyTester {
    public static void main(String[] args)
    {
        Money m1 = new Money(8, 75);
        Money m2 = new Money(5, 80);
        Money m3 = new Money(0,0);

        System.out.println("\tAbhishek " + "CIS35A Spring 2021  Lab 4");
        System.out.println("m1 = " + m1);
        System.out.println("m2 = " + m2);
        System.out.println("m3 = " + m3);
        System.out.println("m1 equals m2? " + m1.equals(m2));
        System.out.println("m1 equals m3? " + m1.equals(m3));

        Money m4 = m1.add(m2);
        System.out.println("m4 = m1 + m2 = " + m1.add(m2));
        Money m5 = m4.multiply(3);
        System.out.println("m5 = m4 * 3 = " + m5);

        System.out.println("m1 + m2 + m3 + m4 = " + m1.add(m2).add(m3).add(m4));
        System.out.println("m4 - m2 = " + m4.subtract(m2));

        Money[] m6 = new Money[]{new Money(10, 50), new Money(20, 50), new Money(30, 50), new Money(40, 50)};

        System.out.print("m6 = (");
        for(int i = 0; i < m6.length; i++)
        {
            if(i < m6.length -1)
                System.out.print(m6[i] + ", ");
            else
                System.out.print(m6[i] + ")");
        }
        System.out.println();

        Money[] m7 = Money.multiply(m6, 2);
        System.out.print("m7 = m6 * 2 = (");
        for(int i = 0; i < m7.length; i++)
        {
            if (i < m7.length -1)
                System.out.print(m7[i] + ", ");
            else
                System.out.print(m7[i] + ")");
        }
        System.out.println();

    }
}
