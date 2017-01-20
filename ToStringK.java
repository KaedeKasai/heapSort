package heapSort;

public class ToStringK {
	
	int size = 126;
	int[] heap = {-1,42,29,18,14,7,18,12,11,13,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	
	public void toStringK(){
		
		
		int height = 0;
		
		for(int i = 1;size >= i;i *= 2){
			height++;
		}
		
		int space           = 6;
		int sideSpace       = 3;
		int slashSpace      = 7;
		int sideSlashSpace  = 7;
		int slashWidthSpace = 3;
		
		sideSpace = (sideSpace * 2) + 2;
		slashSpace      = (slashSpace * 2);
		
		for(int i = 3;height > i;i++){
			
			space           = (space * 2) + 4;
			sideSpace       = (sideSpace * 2) + 2;
			slashSpace      = (slashSpace * 2) + 1;
			sideSlashSpace  = sideSlashSpace * 2;
			slashWidthSpace = (slashWidthSpace * 2) + 2;
			
		}
		if(height == 2){
			makeSpace(3);
		} else {
			makeSpace(sideSpace);
		}
		
		makeChild(1);
		
		System.out.println();
		
		int heightNode = 2;
		int countNode = 2;
		
		sideSpace = (sideSpace - 2) / 2;
		
		for(int i = 1;height - 1 > i;i++){
			
			if(height == 3){
				makeSpace(6);
			} else {
				makeSpace(sideSlashSpace + 1);
				sideSlashSpace = (sideSlashSpace - 1)/ 2;
			}
			
			System.out.print("／");
			
			for(int j = 0;heightNode - 1 > j;j++){
				
				
				if(j % 2 == 0){
					
					makeSpace(slashWidthSpace);
					System.out.print("＼");
					
				} else {
					
					makeSpace(slashSpace);
					System.out.print("／");
					
				}
				
			}
			slashWidthSpace = (slashWidthSpace - 2) / 2;
			slashSpace = (slashSpace - 2) / 2;
			
			System.out.println();
			
			
			makeSpace(sideSpace);
		
			for(int j = 0;heightNode > j;j++){
				
				makeChild(countNode);
				countNode++;
				
				
				if(heightNode - 1 != j){
					makeSpace(space);
				}
			}
			
			heightNode = heightNode * 2;
			space      = (space - 4) / 2;
			sideSpace  = (sideSpace - 2) / 2;
			
			System.out.println();
			
		}
		
		int hoge = countNode;
		
		while(size >= countNode){
			
			if(countNode % 2 == 0){
				System.out.print("  ／");	
			} else {
				System.out.print(" ＼   ");
			}
			countNode++;
		}
		System.out.println();
		
		countNode = hoge;
		
		while(size >= countNode){
			
			makeChild(countNode);
			countNode++;
			
			System.out.print(" ");
		}
	}
	
	public void makeSpace(int Space){
		
		for(int i = 0;Space > i;i++){
			System.out.print(" ");
		}
	}
	
	public void makeChild(int index){
		System.out.printf("[" + "%2d" + "]",heap[index]);
	}
}
