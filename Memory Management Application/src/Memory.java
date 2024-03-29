import java.util.ArrayList;

public class Memory {
	
	private ArrayList<Partition> partitionList = new ArrayList<Partition>();
	
	public void addPartition(Partition partition){
		this.partitionList.add(partition);
	}
	
	public Partition removePartition(int partitionLocation){
		return this.partitionList.remove(partitionLocation);
	}
	
	public int getTotalMemory(){
		
		int totalMemory = 0;
		
		for(Partition partition : partitionList){
			totalMemory += partition.getSize();
		}
		
		return totalMemory;
	}
	
	public int getNumberOfPartitions(){
		return this.partitionList.size();
	}
	
	public Partition getPartition(int index){
		return this.partitionList.get(index);
	}
	
	public ArrayList getPartitionList(){
		return this.partitionList;
	}
}
