package org.nzcn.services;

import org.kin.common.DAO;
import org.nzcn.models.Mission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kindai on 9/07/16.
 */
@Service("missionService")
public class MissionServiceImpl implements MissionService{

    @Autowired
    @Qualifier("missionDao")
    DAO<Mission> dao;

    @Override
    public Mission getObject(String uid) {
        return dao.getObject(uid);
    }

    @Override
    public void createMission(Mission mission) {
        dao.create(mission);
    }

    @Override
    public void updateMission(Mission mission) {
        dao.update(mission);
    }

    @Override
    public List<Mission> getObjects() {
        return dao.getAll();
    }
}
