package com.mapmory.services.user.domain;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class SocialLoginInfo {

	private Integer socialLoginInfoNo;
    private String userId;
    private Integer socialLoginInfoType;  // 0: google, 1: naver, 2: kakao
    private String socialId;
    private LocalDateTime linkRegDate;
}
