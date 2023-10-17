interface Bank
{
    void bank();
    static int balance(int x)
    {return x*x*x;}
}
class account implements Bank
{
    public void bank()
    {System.out.println("balance");}
}

Class accountInterfaceStatic{
    public static void main(String args[]){
        Account d=new bank();
        d.balance();
        System.out.println(bank.balance(500));
    }
}