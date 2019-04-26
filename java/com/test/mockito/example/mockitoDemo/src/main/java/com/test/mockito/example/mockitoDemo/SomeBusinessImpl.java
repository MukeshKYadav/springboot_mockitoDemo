package com.test.mockito.example.mockitoDemo;

public class SomeBusinessImpl {
	private DataService dataService;

	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	int findTheGreatestFromAllData() {
		int[] data = dataService.retrieveAllData();
		int greatest = Integer.MIN_VALUE;
//		int greatest = 0;

		for (int value : data) {
			if (value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	}
	
	int findTheLeastFromAllData() {
		int[] data = dataService.retrieveAllData();
		int least = data[0];

		for(int i=1;i<data.length-1;i++) {
			if(data[i]<least) {
				least = data[i];
			}
		}
		return least;
	}
}
