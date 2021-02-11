package org.zerock.domain;

import java.awt.List;
import java.util.ArrayList;

import lombok.Data;

@Data
public class SampleDTOList {

	private java.util.List<SampleDTO> list;
	
	public SampleDTOList() {
		list=new ArrayList<>();
	}
}
