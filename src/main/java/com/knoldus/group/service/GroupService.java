package com.knoldus.group.service;

import com.knoldus.group.model.GroupModel;
import com.knoldus.group.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class GroupService {

    @Autowired
    GroupRepository groupRepository;

    public String saveNewUser (String name) {
        GroupModel group = new GroupModel();
        group.setName(name);
        group.setActive(true);

        Date date = new Date();
        group.setCreatedDate(date);
        group.setUpdatedDate(date);
        groupRepository.save(group);
        return "New group saved successfully";

    }
    public String update (GroupModel groupModelReceived ) {
        //System.out.println(id +" "+name);
        GroupModel groupModel = groupRepository.getById(groupModelReceived.getId());
        groupModel.setName(groupModelReceived.getName());
        groupRepository.save(groupModel);
        return "Name updated successfully";
    }
    public GroupModel findGroupById(GroupModel receivedGroupModel) {
        return groupRepository.fetchGroup(receivedGroupModel.getId());
    }

    public Iterable<GroupModel> findGroups () {
        return groupRepository.findAll();
    }

    }



