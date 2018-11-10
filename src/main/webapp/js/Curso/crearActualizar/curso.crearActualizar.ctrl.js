var coordiandorModule = angular.module('coordinadorModule');
coordinadorModule.controller('crearCursoCtrl',['$scope','$http','$state',function($scope,$http,$state){
        var id = $state.parms.id;
        $scope.curso = {};
        
        if(id){
            $http.get('api/cursos/' + id).then(function (response){
              $scope.curso = response.data;  
            },function(error){
                console.log(error);
            });
        }
        
        $scope.crearCurso = function(){
          if($scope.curso.nombre && $scope.curso.PROGAMA_id){
              $http.post('api/cursos',JSON.stringify($scope.curso)).then(function(response){
                  $scope.curso = {};
                  $state.go('listarCurso');
              },function(error){
                  console.log(error);
              });
          }  
        };
        
        $scope.actualizarCurso = function(){
          if($scope.curso.nombre && $scope.curso.PROGRAMA_id){
              $http.put('api/cursos'+id,JSON.stringify($scope.curso)).then(function(response){
                 $scope.curso ={};
                 $state.go('listarCurso');
              },function(error){
                  console.log(error);
              });
          }  
        };
}]);


