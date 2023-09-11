package com.genpact.projectk.coding.designpatterns;


// Vechicle bike car
public class BuilderDesignPattern {
		// constructor with manadatory fields //set method for optional // build method to build entire object
	public static void main(String[] args) {
		Laptop laptop=new Laptop.LaptopBuilder(2,"i5",500).setBlutoothEnabled(false).build();
		var lap=new Laptop.LaptopBuilder(0, null, 0).setIsGraphicCardEnabled(true).build();
		System.out.println(laptop);
		System.out.println(lap);
	}
}

class Laptop{
	private long ram;
	private String cpu;
	private long hdd;
	
	private boolean isGraphicCardEnabled;
	private boolean isBlutoothEnabled;
	
	private Laptop(LaptopBuilder builder) {
		this.ram=builder.ram;
		this.cpu=builder.cpu;
		this.hdd=builder.hdd;
		this.isBlutoothEnabled=builder.isBlutoothEnabled;
		this.isGraphicCardEnabled=builder.isGraphicCardEnabled;
		
	}
	
	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", cpu=" + cpu + ", hdd=" + hdd + ", isGraphicCardEnabled=" + isGraphicCardEnabled
				+ ", isBlutoothEnabled=" + isBlutoothEnabled + "]";
	}

	public static class LaptopBuilder{
		private long ram;
		private String cpu;
		private long hdd;
		
		private boolean isGraphicCardEnabled;
		private boolean isBlutoothEnabled;
		
		public LaptopBuilder(long ram,String cpu,long hdd) {
			super();
			this.ram=ram;
			this.cpu=cpu;
			this.hdd=hdd;
		}
		public LaptopBuilder setIsGraphicCardEnabled(boolean isgraphics) {
			this.isGraphicCardEnabled=isgraphics;
			return this;
		}
		public LaptopBuilder setBlutoothEnabled(boolean blutooth) {
			this.isGraphicCardEnabled=blutooth;
			return this;
		}
		public Laptop build() {
			return new Laptop(this);
		}
	}
}




