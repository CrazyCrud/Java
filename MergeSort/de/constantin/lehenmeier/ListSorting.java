package de.constantin.lehenmeier;

public class ListSorting {
	private int [] unsortedList, sortedList;
	
	public ListSorting(Object [] unsortedList, Object [] sortedList){
		 initLists(unsortedList, sortedList);
	}

	private void initLists(Object[] unsortedListObj, Object[] sortedListObj) {
		this.unsortedList = new int [unsortedListObj.length];
		this.sortedList = new int [sortedListObj.length];
		for(int i = 0; i < unsortedListObj.length; i++){
			this.unsortedList[i] = ((Integer)unsortedListObj[i]).intValue();
		}
		for(int i = 0; i < sortedListObj.length; i++){
			this.sortedList[i] = ((Integer)sortedListObj[i]).intValue();
		}
	}
	
	protected void sortLists(){
		for(int i = 0; i < this.unsortedList.length; i++){
			mergeValue(this.unsortedList[i]);
		}
	}
	
	private void mergeValue(int value) {
		int buffer = findBuffer();
		if(buffer == -1){
			return;
		}
		this.sortedList[buffer] = value;
		for(int i = buffer; i < this.sortedList.length - 1; i++){
			if(this.sortedList[i] > this.sortedList[i + 1]){
				swapValues(this.sortedList, i, i + 1);
			}else{
				break;
			}
		}
	}

	private int findBuffer(){
		for(int i = 0; i < this.sortedList.length; i++){
			if(this.sortedList[i] == 0){
				continue;
			}else if(i > 0){
				return (i - 1);
			}else{
				return -1;
			}
		}
		return -1;
	}
	
	private void swapValues(int [] list, int i, int j){
		if(i > list.length || j > list.length ||
				i < 0 || j < 0){
			return;
		}else{
			int help = list[i];
			list[i] = list[j];
			list[j] = help;
		}
	}

	protected void printMergedList() {
		for(int i = 0; i < this.sortedList.length; i++){
			System.out.println(this.sortedList[i]);
		}
	}
}
