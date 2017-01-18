package heapSort;

public class ToStringK {
	
	int size = 8;
	int[] arr = {-1,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63};
	
	public void toStringK(){
		
		;
		int height = 0;
		
		for(int i = 1;size >= i;i *= 2){
			height++;
		}
		
		
		int space = 6;
		int sideSpace = 3;
		
		sideSpace = (sideSpace * 2) + 2;
		
		for(int i = 3;height > i;i++){
			
			space     = (space * 2) + 4;
			sideSpace = (sideSpace * 2) + 2;
			
		}
		System.out.println(space);
		System.out.println(sideSpace);
		
		
		makeSpace(sideSpace);
		
		makeNode(1);
		
		System.out.println();
		System.out.println();
		
		int heightNode = 2;
		int countNode = 2;
		
		sideSpace = (sideSpace - 2) / 2;
		
		for(int i = 1;height - 1 > i;i++){
			
			makeSpace(sideSpace);
			
			for(int j = 0;heightNode > j;j++){
			
			makeNode(countNode);
			countNode++;
			
			makeSpace(space);
			
			}
			
			heightNode *= 2;
			space = (space - 4) / 2;
			sideSpace = (sideSpace - 2) / 2;
			
			System.out.println();
//			while(size >= countNode){
//				
//				System.out.print("  ／");
//				countNode++;
//				if(size < countNode){
//					break;
//				}
//				System.out.print(" ＼   ");
//				
//				
//			}
			
		}
		
		int hoge = countNode;
		
		while(size >= countNode){
			
			System.out.print("  ／");
			countNode++;
			if(size < countNode){
				break;
			}
			System.out.print(" ＼   ");
			
			
		}
		System.out.println();
		
		countNode = hoge;
		
		while(size >= countNode){
			
			makeNode(countNode);
			countNode++;
			
			System.out.print(" ");
		}
	}
	
	public void makeSpace(int Space){
		
		for(int i = 0;Space > i;i++){
			System.out.print(" ");
		}
	}
	
	public void makeNode(int index){
		
		System.out.printf("[" + "%2d" + "]",arr[index]);
		
	}
}
