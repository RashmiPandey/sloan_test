/**
 * 
 * @author Geppetto Generated Code</br>
 * Date Created: </br>
 * @since  </br>
   build:   </p> 
 *
 * code was generated by the Geppetto System </br>
 * Geppetto system Copyright - NewPortBay LLC </br>
 * The generated code is free to use by anyone</p>
 *
 *
 *
*/

var app = angular.module('Sloan_test_1', ['ngRoute','ngCookies','ui.bootstrap','ui.grid','ui.grid.pagination','ui.grid.resizeColumns','ui.grid.edit']);

   // configure our routes
   app.config(function($routeProvider) {
       $routeProvider
            .when('/First_time_setup-en', {
                         templateUrl : 'app/views/en/First_time_setup-en.html',
          controller: 'First_time_setup'
                     })
            .when('/en-US/campaigns', {
                         templateUrl : 'app/views/en-US/user/campaigns.html',
          controller: 'CampaignController'
                     })
            .when('/en-US/campaign/:action', {
                         templateUrl : 'app/views/en-US/user/campaign.html',
          controller: 'CampaignController'
                     })


          .otherwise( {templateUrl : 'app/views/en/First_time_setup-en.html',
          controller: 'First_time_setup'});



   });

