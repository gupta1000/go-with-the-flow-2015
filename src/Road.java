import java.util.ArrayList;
import java.util.List;

public class Road {
	public int num_cars;
	public int speed_limit;
	public int road_length = 3000;
	public int num_lanes = 2;
	public int roadblock_position = 2500;
	
	// lanes
	// each row is a pair of lanes
	List<List<Vehicle>> road = new ArrayList<List<Vehicle>>();
	
	public Road(){
		// 4 | |X|
		// 3 | | |
		// 2 |X| |
		// 1 | | |
		// 0 |X| |
		
		for(int i=0;i<road_length;i++){ // 3000 is length of road (could be variable?)
			for(int j=0;j<num_lanes;j++){
				
			}
		}
	}
	
	public void setRoadBlock(int roadblock_position){
		this.roadblock_position = roadblock_position;
	}
	
	public void nextSecond(){
		
	}
}
