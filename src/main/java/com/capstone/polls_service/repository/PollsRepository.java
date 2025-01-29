package com.capstone.polls_service.repository;

import com.capstone.polls_service.pojo.RequestsPojo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.polls_service.entity.PollsEntity;

import java.util.List;

public interface PollsRepository extends JpaRepository<PollsEntity,Integer>{
    List<RequestsPojo> findByCommunityId(int communityId);

}