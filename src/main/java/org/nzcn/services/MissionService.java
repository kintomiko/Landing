package org.nzcn.services;

import org.nzcn.models.Mission;
import org.nzcn.models.User;

import java.util.List;

/**
 * Created by kindai on 9/07/16.
 */
public interface MissionService {
    Mission getObject(String uid);

    void createMission(Mission user);

    void updateMission(Mission user);

    List<Mission> getObjects();
}
