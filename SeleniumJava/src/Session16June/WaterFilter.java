package Session16June;

class WaterFilter {

	private String filterType;
	boolean tap;
	int capacity;
	String color;
	double price;
	@Override
	public String toString() {
		
		return "WaterFilter [filterType=" + filterType + ", tap=" + tap + ", capacity=" + capacity + ", color=" + color
				+ ", price=" + price + "]";
	}
	public String getFilterType() {
		return filterType;
	}
	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	/*public String toString() {

		return "color "+this.color;
	}
*/
	
	
	
}