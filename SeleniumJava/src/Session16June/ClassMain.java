package Session16June;

class ClassMain {

	public static void main(String args[]) {

		WaterFilter w = new WaterFilter();
		System.out.println(w.getFilterType());
		//w.filterType = "Normal";
		w.setFilterType("Normal");
		w.tap = true;
		w.color="red";

		System.out.println("FilterType is " + w.getFilterType());
		System.out.println(w.tap);
		System.out.println(w);
		
		
	}

}