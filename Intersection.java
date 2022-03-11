public class Intersection {
	/**
	 * 
	 */
	public String name;
	/**
	 * 
	 */
	private TrafficLight eastbound;
	/**
	 * 
	 */
	private TrafficLight westbound;
	/**
	 * 
	 */
	private TrafficLight northbound;
	/**
	 * 
	 */
	private TrafficLight southbound;
	
	/**
	 * 
	 */
	public Intersection() {
		this.name = null;
		this.eastbound = new TrafficLight();
		this.westbound = new TrafficLight();
		this.northbound = new TrafficLight();
		this.southbound = new TrafficLight();
		eastbound.setGreenLight();
		westbound.setGreenLight();
		northbound.setRedLight();
		southbound.setRedLight();
	}
	
	
	/**
	 * @return
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @param name
	 */
	public Intersection(String name) {
		this();
		this.name = name;
	}
	
	/**
	 * 
	 */
	public void displayLights() {
		System.out.println();
		System.out.println(name + " Intersection");
		System.out.print("	  Eastbound is ");
		eastbound.displayLight();
		System.out.println();
		System.out.println();
		System.out.print("	  Westbound is ");
		westbound.displayLight();
		System.out.println();
		System.out.println();
		System.out.print("	  Northbound is ");
		northbound.displayLight();
		System.out.println();
		System.out.println();
		System.out.print("	  Southbound is ");
		southbound.displayLight();
		System.out.println();
	}
	
	/**
	 * 
	 */
	public void stopTraffic() {
		northbound.setRedLight();
		westbound.setRedLight();
		eastbound.setRedLight();
		southbound.setRedLight();
	}
	
	/**
	 * 
	 */
	public void switchTraffic() {
		if(eastbound.isGreenLight()) {
			eastbound.setYellowLight();
			westbound.setYellowLight();
			northbound.setRedLight();
			southbound.setRedLight();
		} else if (eastbound.isYellowLight()) {
			eastbound.setRedLight();
			westbound.setRedLight();
			northbound.setGreenLight();
			southbound.setGreenLight();
		} else if (northbound.isGreenLight()) {
			northbound.setYellowLight();
			southbound.setYellowLight();
			eastbound.setRedLight();
			westbound.setRedLight();
		} else if (northbound.isYellowLight()) {
			northbound.setRedLight();
			southbound.setRedLight();
			eastbound.setGreenLight();
			westbound.setGreenLight();
		} else if (eastbound.isRedLight() && northbound.isRedLight()) {
			eastbound.setGreenLight();
			westbound.setGreenLight();
		}
	}
	

	


	/**
	 * @return
	 */
	public TrafficLight getEastbound() {
		return eastbound;
	}


	/**
	 * @param eastbound
	 */
	public void setEastbound(TrafficLight eastbound) {
		this.eastbound = eastbound;
	}


	/**
	 * @return
	 */
	public TrafficLight getWestbound() {
		return westbound;
	}


	/**
	 * @param westbound
	 */
	public void setWestbound(TrafficLight westbound) {
		this.westbound = westbound;
	}


	/**
	 * @return
	 */
	public TrafficLight getNorthbound() {
		return northbound;
	}


	/**
	 * @param northbound
	 */
	public void setNorthbound(TrafficLight northbound) {
		this.northbound = northbound;
	}


	/**
	 * @return
	 */
	public TrafficLight getSouthbound() {
		return southbound;
	}


	/**
	 * @param southbound
	 */
	public void setSouthbound(TrafficLight southbound) {
		this.southbound = southbound;
	}
}
