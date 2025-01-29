package com.capstone.polls_service.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class RequestsPojo {
    private int requestId;
    private UserOutputDataPojo user;
    private CommunityPojo community;
    private String requestReason;
    private Double amount;
    private LocalDateTime requestDate;
    private String status;
}
