import java.util.*;


public class Hanoi
{
    
private Deque<Integer> peg1;
    
private Deque<Integer> peg2;
    
private Deque<Integer> peg3;
    
private Deque<Integer> game;
    
private boolean win;

    

public Hanoi()
    
{
        
peg1 = new ArrayDeque();
        
peg2 = new ArrayDeque();
        
peg3 = new ArrayDeque();
        
game = new ArrayDeque();
        
peg1.addLast(4);
        
peg1.addLast(3);
        
peg1.addLast(2);
        
peg1.addLast(1);
    }

    public boolean checkWin()
    {
             if(peg3.size() == 4){return true;}
        else{return false;}
    }

    public boolean isLegal(int a, int peg)
    {
        Integer i = peg.getLast();
        if(peg.isEmpty()){return true;}
        if(i.intValue()>a){return true;}
        else {return false;}
    }
    


}
