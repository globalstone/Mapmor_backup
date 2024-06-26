package com.mapmory.services.timeline.domain;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.print.DocFlavor.STRING;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Record {
	private int recordNo;
	private String recordUserId;
	private String recordTitle;
	private Double latitude;
	private Double longitude;
	private String checkpointAddress;
	private LocalDateTime checkpointDate;
	private String mediaName;
	private List<String> imageName;
	private List<String> hashtag;
	private int categoryNo;
	private String recordText;
	private int tempType;
	private LocalDateTime recordAddDate;
	private LocalDateTime sharedDate;
	private int updateCount;
	private Date d_DayDate;
	private int timecapsuleType;
	
	private Double distance;
}
