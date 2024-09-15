public  class PcDecorator implements Pc{
   	Pc pc;
   	double price;
   	String description;
   	
   	public PcDecorator(){
       		
   	}
   	
    	public PcDecorator(Pc pc){
       		this.pc=pc;
   	}
    
    	@Override 
    	public double getPrice(){
        	return pc.getPrice();
    	}
    
    	@Override 
    	public String getDescription(){
        	return pc.getDescription();
    	}
	


}
