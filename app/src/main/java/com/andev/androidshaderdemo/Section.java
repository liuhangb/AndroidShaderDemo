package com.andev.androidshaderdemo;


import java.util.ArrayList;
import java.util.List;

public class Section {
	List<String> sectionList = new ArrayList<>();

	public Section(){
		sectionList.add("SimpleRender");
		sectionList.add("SimpleTextureRender");
		sectionList.add("MultiTextureRender");
		sectionList.add("SharpRender");
		sectionList.add("TwoFilterRender");
		sectionList.add("Mosaic");
	}

	List<String> getSectionList(){
		return sectionList;
	}
}
