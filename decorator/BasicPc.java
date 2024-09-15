public  class BasicPc implements Pc {
	double price;
	String description;
	
	@Override public double getPrice(){
    		return 1890;
    	}
    
	@Override public String getDescription(){
        	return "core i7";
    	} 
}
