package parser;

public class WagonBuilder implements Builder{
	private String naam;
	private int stoelen;
	private int bedden;

	@Override
	public void setNaam(String naam) {
		this.naam=naam;
		
	}

	@Override
	public void setStoel(int stoelen) {
		this.stoelen= stoelen;
		
	}

	@Override
	public void setBed(int bedden) {
		this.bedden=bedden;
		
	}

}
