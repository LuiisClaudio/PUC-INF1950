package engine.drive;

import java.util.ArrayList;
import java.util.stream.Stream;

import engine.Engine;
import engine.EngineAction;

public class DriveList {
	
	private Engine engine;
	
	private ArrayList<Drive> driveList = new ArrayList<Drive>();
	
	public DriveList(Engine engine) {
		this.engine = engine;
	}
	
	public Stream<Drive> getDrives() {
		return driveList.stream();
	}
	
	public Drive getDrive(String driveName) {
		return driveList
				.stream()
				.filter(drive -> drive.getName().equals(driveName))
				.findFirst()
				.orElse(null);
	}
	
	public boolean isNameUsed(String driveName) {
		return driveList
				.stream()
				.anyMatch((drive) -> drive.getName().equals(driveName));
	}
	
	public void addDrive(String driveName, String pluginName) throws Exception {
		if(isNameUsed(driveName))
			throw new Exception("Drive name in use");
		
		driveList.add(new Drive(driveName, pluginName));
		
		engine.updateEngineListeners(EngineAction.ADD_DRIVE);
	}
	
	public void removeDrive(String driveName) {
		driveList.removeIf((drive) -> drive.getName().equals(driveName));
		
		engine.updateEngineListeners(EngineAction.REMOVE_DRIVE);
	}
	
}
