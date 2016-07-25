/**
 * Created by kindai on 11/07/16.
 */

var app = angular.module('Main', ['userList', 'missionList']).
    config(['$locationProvider' ,'$routeProvider',
        function config($locationProvider, $routeProvider) {
            $locationProvider.hashPrefix('!');

            $routeProvider.
                when('/missions', {
                    template: '<mission-list></mission-list>'
                }).
                when('/users', {
                    template: '<user-list></user-list>'
                }).
                otherwise('/missions');
        }
    ]);