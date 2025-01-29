package com.capstone.polls_service.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PollsPojo {
    private int pollId;
    private LocalDateTime pollStart;
    private LocalDate pollEnd;
    private int pollResult;
    private int requestId;
}
