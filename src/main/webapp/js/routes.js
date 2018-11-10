var app = angular.module("RegistroAcademico");

app.config(["$stateProvider", "$urlRouterProvider", function ($stateProvider, $urlRouterProvider) {
        
        //Otherwise - control 404
        $urlRouterProvider.otherwise('/');
        
        //Por cada ruta se crea un nuevo estado
        $stateProvider.state("listarCurso", {
           url: '/',
           views:{
               mainView: {
                   templateUrl: './js/curso/listar/listarCurso.html',
                   controller: 'listarCursoCtrl'
               }
           }
        });
        
        
        
}]);


