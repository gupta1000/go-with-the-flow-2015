
public class FairDriver extends DriverLogic	{
	
	public FairDriver(Vehicle v) {
		type="fair";
		v.speed = (int)(.4*v.max_speed);     //v.max_speed);
		maxTimeToImpact = (int)Math.ceil(v.max_speed/v.accel)+2;
		slowTime = 4;
		speedTime = 10;
	}
	
	public void drive(Road road, Vehicle v) {
		
		accel(road,v);
		
		int delta = (int)Math.ceil(mps(v.speed))+1;
		move(delta, road, v);
		
		mergeLeft(road, v);
	}
	
	// custom merge-left
	// merge buffer of 5 (reasonable)
	public void mergeLeft(Road road, Vehicle v){
		if(v.findLane(road) == 1){
			return;
		}
		
		int pos = v.findIndex(road);
		
		if(mergeStatus == 0){
			for(int i=pos+5;i>pos-v.length-5;i--){
				if(i >= 0 && i < road.roadblock_position && road.lane1.get(i) == null){
					return;
				}
			}
			
			mergeStatus++;
		}else{
			System.out.println(mergeStatus);
			mergeStatus++;
			if(mergeStatus == 4){
				road.moveVehicle(v, pos, 1);
			}
		}
	}
}
