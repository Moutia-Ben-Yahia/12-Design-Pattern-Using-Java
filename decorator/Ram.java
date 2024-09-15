import java.util.Scanner;
public class Ram extends PcDecorator{

    public Ram(Pc pc){
        super(pc);
        Scanner sc = new Scanner(System.in);
        int c ;
        do {
            System.out.println("*** PC LBC core i7 1890 dt *** \nchoisissez votre caractéristiques :\nchoisir barette ram :\n 1- 8 GB: 120dt\n 2- 12 GB: 150dt \n 3- 16 GB: 180dt");
            c=sc.nextInt();
        }
        while((c>3)||(c<1));
    
        if(c==1) 
        {
            description="/ 8 GB";
            price+=120;
        }	
        else 
            if(c==2) 
            {
                description="/ 12 GB";
                price+=150;
            }
            else 
            {
                description="/ 16 GB";
                price+=180;
            }	
    }
    @Override
    public double getPrice() {
        return pc.getPrice() + price;
    }
    @Override
    public String getDescription() {
        return pc.getDescription() + description;
    }
    
}
