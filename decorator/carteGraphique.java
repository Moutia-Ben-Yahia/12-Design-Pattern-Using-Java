import java.util.Scanner;
public class carteGraphique extends PcDecorator{
	public carteGraphique(Pc pc) {
		super(pc);	
		Scanner sc = new Scanner(System.in);
        	int c ;
        
        	do {
        		System.out.println("choisir ton carte grafique :\n 1- NVIDIA RTX 3060: +1500dt\n 2- NVIDIA RTX 3070: +2200dt \n 3- NVIDIA RTX 3080: +3000dt");
        		c=sc.nextInt();
        	}
        	while((c>3)||(c<1));
        
        	if(c==1) 
			{
        		description="/ NVIDIA RTX 3060";
			    price+=1500;
			}	
			else 
        		if(c==2) 
				{
        			description="/ NVIDIA RTX 3070";
					price+=2200;
				}
				else 
				{
        			description="/ NVIDIA RTX 3080";
					price+=3000;
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
