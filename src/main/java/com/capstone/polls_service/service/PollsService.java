package com.capstone.polls_service.service;

import java.util.ArrayList;
import java.util.List;

import com.capstone.polls_service.pojo.CommunityPojo;
import com.capstone.polls_service.pojo.RequestsPojo;
import com.capstone.polls_service.pojo.UserOutputDataPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.polls_service.entity.PollsEntity;
import com.capstone.polls_service.repository.PollsRepository;
import org.springframework.web.client.RestClient;

@Service
public class PollsService {

    @Autowired
    PollsRepository pollsRepository;

    public List<PollsEntity> getAllPolls(){
       return pollsRepository.findAll();
    }

    public PollsEntity getAPoll(int pollId){
        PollsEntity pollsEntity = pollsRepository.findById(pollId).orElse(null);
        return pollsEntity;
    }

//    public List<RequestsPojo> getRequestsByCommunityId(int communityId) {
//        List<RequestsPojo> requestEntities = PollsRepository.findByCommunityId(communityId);
//        List<RequestsPojo> requestPojos = new ArrayList<>();
//        RestClient restClient = RestClient.create();
//        UserOutputDataPojo responseUser = restClient.get()
//                .uri("http://localhost:5001/api/users/email/" + requestPojos.getEmail())
//                .retrieve().body(UserOutputDataPojo.class);
//        requestsPojo.setUser(responseUser);
//        CommunityPojo responseCommunity = restClient.get()
//                .uri("http://localhost:5002/api/communities/" + requestsPojo.getCommunityId())
//                .retrieve().body(CommunityPojo.class);
//        requestsPojo.setUser(responseUser);
//
//        return requestsPojo;
//    }

    public PollsEntity addAPoll(PollsEntity newPoll){
        return pollsRepository.saveAndFlush(newPoll);
    }

    public PollsEntity updatePoll(PollsEntity editedPoll){
        return pollsRepository.save(editedPoll);
    }

    public void deletePoll(int pollId){
        pollsRepository.deleteById(pollId);
    }
}
