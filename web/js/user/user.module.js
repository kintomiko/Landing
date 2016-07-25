/**
 * Created by kindai on 16/07/16.
 */
angular.module('userService', ['ngResource', 'ngRoute']).
    factory('User', ['$resource',
        function($resource){
            return $resource('api/user/:userId', {}, {
                all: {method:'GET', params:{userId:''}, isArray:true}
            });
        }]);

angular.module('userList', ['userService']);

angular.
    module('userList').
    component('userList',{
        templateUrl: 'template/users.html',
        controller: ['User',
            function UserListCtrl(User) {
                this.users = User.all()
            }]
    });