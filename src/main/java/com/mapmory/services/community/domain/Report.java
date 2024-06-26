package com.mapmory.services.community.domain;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Report {

	//Field
	private int reportNo;
	private String userId;
	private String targetUserId;
	private Integer recordNo;
	private Integer replyNo;
	private Integer chatroomNo;
	private String reportTitle;
	private String reportText;
	private LocalDateTime reportDate;
	private int reportStatus;
	private int reportResult;
	
	//Constructor
	
	//Method
}