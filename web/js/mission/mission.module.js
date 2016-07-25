/**
 * Created by kindai on 11/07/16.
 */

angular.module('missionService', ['ngRoute', 'ngResource'])
    .factory('Mission', ['$resource',
        function($resource){
            return $resource('api/mission/:missionId', {}, {
                all: {method:'GET', params: {missionId: ''}, isArray:true}
            });
    }]);

angular.module('missionList', ['missionService']);

angular.
    module('missionList').
    component('missionList', {
        templateUrl: 'template/missions.html',
        controller: ['Mission',
            function MissionListCtrl(Mission) {
                this.missions = Mission.all()

                this.setImage = function(mission, index){
                    if(mission.picUrls && index>=0 && index <mission.picUrls.size){
                        mission.showIndex = index;
                    }
                }

                for(mission in this.missions){
                    this.setImage(mission, 0);
                }

                this.nextImage = function(mission){
                    mission.showIndex = (mission.showIndex+1) % mission.picUrls.size;
                    this.setImage(mission, mission.showIndex);
                }

                this.previousImage = function(mission){
                    mission.showIndex = (mission.showIndex-1) % mission.picUrls.size;
                    this.setImage(mission, mission.showIndex);
                }
            }]
    });