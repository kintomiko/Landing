package org.nzcn.controllers;

import org.bson.types.ObjectId;
import org.nzcn.models.Mission;
import org.nzcn.models.User;
import org.nzcn.services.MissionService;
import org.nzcn.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

/**
 * Created by kindai on 9/07/16.
 */
@Controller
@EnableWebMvc
@RequestMapping("/mission")
public class MissionServiceController {

    @Autowired
    @Qualifier("missionService")
    private MissionService missionService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Mission> getMission(){
        List<Mission> missions = missionService.getObjects();
        return missions;
    }

    @RequestMapping(value = "/{mid}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    Mission getMission(@PathVariable String uid){
        Mission mission = missionService.getObject(uid);
        return mission;
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    Mission createMission(@RequestBody Mission mission){
        missionService.createMission(mission);
        return mission;
    }

    @RequestMapping(value = "/{mid}", method = RequestMethod.PUT, produces = "application/json")
    public @ResponseBody
    Mission updateMission(@PathVariable String uid, @RequestBody Mission mission){
        mission.set_id(new ObjectId(uid));
        missionService.updateMission(mission);
        return mission;
    }
}
