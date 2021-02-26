package net.velinquish.comet;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

public class LocationManager {
	@Getter
	private List<Path> paths;

	public LocationManager() {
		paths = new ArrayList<>();
	}

	public void addPath(Path path) {
		paths.add(path);
	}
}
