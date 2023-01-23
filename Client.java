
package statebank1;


public class Client {
    
    private int id;
    private String name;
    private int mobile;
    private int deposit;
    private String address;
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public int getId()
    {
        return id;
    }
    
    
    public void SetName(String name)
    {
       this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setMobile(int mobile)
    {
        this.mobile = mobile;
    }
    
     public int getMobile()
    {
        return mobile;
    }
     
     public void setDeposit(int deposit)
     {
         this.deposit = deposit;
     }
     
     public int getDeposit()
     {
         return deposit;
     }
     
     
     public void SetAddress(String address)
    {
       this.address = address;
    } 
     
     
      public String getAddress()
    {
       return address;
    } 
    
}
