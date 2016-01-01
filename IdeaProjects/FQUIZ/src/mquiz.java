import javax.swing.JOptionPane;

/**
 * Created by j1 on 12/28/2015.
 */
public class mquiz {
    public static void main(String[] args) {
        questions();
    }
    public static void questions()
    {
        JOptionPane.showMessageDialog(null, "Click on the answer that is the most correct.");
        Object[] options = {"A:Windows","B:Linux","C:Mac OS","D:DOS"};
        int n = JOptionPane.showOptionDialog(null,"Which OS is open source","Question 1",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]);
        System.out.println(n);
        double score;
        double correct=0;
        if(n==1)
        {
            correct++;
        }
        options = new Object[]{"A:It can be bought", "B:Its design is publicly accessible and modifiable", "C:It can not be modified", "D:It is free"};
        n = JOptionPane.showOptionDialog(null,"What makes an OS open source","Question 2",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]);
        System.out.println(n);
        if(n==1)
        {
            correct++;
        }
        options = new Object[]{"A:Fossasia", "B:Sugarlabs", "C:Copyleft Games", "D: All of them"};
        n = JOptionPane.showOptionDialog(null,"Which of these companies participating in Google Code-in are Open source companies","Question 3",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]);
        System.out.println(n);
        if(n==3)
        {
            correct++;
        }
        options = new Object[]{"A:To make money by selling licenses", "B:To promote the development of a program by multiple people", "C: To destroy non-open source software", "D:To give to their friends"};
        n = JOptionPane.showOptionDialog(null,"Why do people make open source software","Question 4",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]);
        System.out.println(n);
        if(n==1)
        {
            correct++;
        }
        options = new Object[]{"A:$54.00", "B:$107.00", "C: Its free", "D:$17.00"};
        n = JOptionPane.showOptionDialog(null,"How much does open source software normally cost","Question 5",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]);
        System.out.println(n);
        if(n==2)
        {
            correct++;
        }
        options = new Object[]{"A:Anyone", "B:Only the programmers", "C:Only children", "D: Only large companies"};
        n = JOptionPane.showOptionDialog(null,"Who can obtain open source software","Question 6",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]);
        System.out.println(n);
        if(n==0)
        {
            correct++;
        }
        options = new Object[]{"A:It looks cool", "B:It is 100% bug free", "C:Its free and modifiable by anyone", "D:It costs money"};
        n = JOptionPane.showOptionDialog(null,"Why is open source software popular","Question 7",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]);
        System.out.println(n);
        if(n==2)
        {
            correct++;
        }
        options = new Object[]{"A:It is free and changeable", "B:I can buy it", "C: Microsoft made it", "D:It doesn't allow me to change it"};
        n = JOptionPane.showOptionDialog(null,"How can you tell if something is open source","Question 8",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]);
        System.out.println(n);
        if(n==0)
        {
            correct++;
        }
        options = new Object[]{"A:Windows", "B:Linux", "C:UNIX", "D: Mac OS"};
        n = JOptionPane.showOptionDialog(null,"Which of the following is the most famous example of open source software?","Question 9",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]);
        System.out.println(n);
        if(n==1)
        {
            correct++;
        }
        options = new Object[]{"A:A programmer selfishly creates a program to sell", "B:A design is layed out and a community works on it", "C:A random person makes it", "D: A company creates it to sell licenses"};
        n = JOptionPane.showOptionDialog(null,"How is open source software created","Question 10",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]);
        System.out.println(n);
        if(n==1)
        {
            correct++;

        }
        score = 100*(correct/10);
        JOptionPane.showMessageDialog(null, "You got a "+score+" congratulations");
        JOptionPane.showMessageDialog(null, "You got "+correct+" correct");
    }
}
