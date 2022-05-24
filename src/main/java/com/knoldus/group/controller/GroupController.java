package com.knoldus.group.controller;

import com.knoldus.group.repository.GroupRepository;
import com.knoldus.group.model.GroupModel;
import com.knoldus.group.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/group")
public class GroupController {
    @Autowired
    GroupService groupModelService;

    @Autowired
    GroupRepository groupRepository;

    @PostMapping(path = "/save")
    public String saveNewUser (final @RequestParam String name) {

        return groupModelService.saveNewUser(name);
    }

    @PostMapping(path = "/edit")
    public String update(final @RequestBody GroupModel groupModel) {
       return groupModelService.update(groupModel);
    }
    @GetMapping(path = "/findAll")
    public Iterable<GroupModel> findAllGroup() {

       return groupModelService.findGroups();
    }
}













//@GetMapping(path = "/findGroup")
//    public @ResponseBody Iterable<GroupModel> findOne(final @RequestBody GroupModel groupModel) {
//        return groupModelService.findGroupById(groupModel);
//    }