import java.util.Scanner;
public class disquedur extends PcDecorator{
    
    public disquedur(Pc pc){
        super(pc);
		Scanner sc = new Scanner(System.in);
        int c ;
        do {
            System.out.println("choisir ton disque dur :\n 1- SATA 500 GB: +100dt\n 2- SSD 500GB: +180\n 3- M2 500GB: +300");
            c=sc.nextInt();
        }
        while((c>3)||(c<1));
    
        if(c==1) 
        {
            description="/ SATA 500 GB";
            price+=100;
        }	
        else 
            if(c==2) 
            {
                description="/ SSD 500 GB";
                price+=180;
            }
            else 
            {
                description="/ M2 500 GB";
                price+=300;
            }	
    }
    @Override
    public double getPrice() {
        return pc.getPrice()+price;
    }
    @Override
    public String getDescription() {
        return pc.getDescription()+description;
    }
    
}
