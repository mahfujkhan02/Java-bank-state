
package statebank1;


public class StateBank1 {
    
    public void WithdrawMoney(Client x , int money)
    {
        int deposit = x.getDeposit();
        if(deposit > money)
        {
            deposit = deposit - money;
            x.setDeposit(deposit);
            System.out.println("Withdrawn Amount :"+ money);
            System.out.println("Available Balance : "+ deposit);
        }
        else
        {
            System.out.println("Insufficience Balance");
        }
            
    }
    
    public void depostiMoney(Client x, int money)
    {
        int deposit = x.getDeposit();
        deposit = deposit + money;
        x.setDeposit(deposit);
    }

    
    public static void main(String[] args) {
        
        StateBank1 sb = new StateBank1();
       
        Client tanim = new Client();
        tanim.setId(1);
        tanim.SetName("Mahfuj Khan Tanim");
        tanim.setMobile(2621);
        tanim.setDeposit(0);
        tanim.SetAddress("Monsur Ali Road Arichpur");
        
        
        Client dipto = new Client();
        dipto.setId(1);
        dipto.SetName("Shovvota Islam Dipto");
        dipto.setMobile(2621);
        dipto.setDeposit(50000);
        
       // System.out.println(tanim.getDeposit());
       
        System.out.println("\n"+tanim.getName() + " :" +tanim.getDeposit());
       
       System.out.println(tanim.getDeposit());
       
      sb.WithdrawMoney(tanim , 3500);
        System.out.println(tanim.getDeposit());
        
        sb.depostiMoney(tanim, 7000);
       
        System.out.println(tanim.getDeposit());
        
         sb.WithdrawMoney(tanim , 3500);
        System.out.println(tanim.getDeposit());
       
       
    }
    
   
    
}
