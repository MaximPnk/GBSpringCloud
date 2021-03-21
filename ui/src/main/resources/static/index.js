angular.module('app', []).controller('indexController', function ($scope, $http) {
    const contextPath = 'http://localhost:8187/feign/';

    $scope.asd = 'asd';

    $scope.fillProducts = function () {
        $http.get(contextPath + 'product/')
            .then(function (response) {
                $scope.products = response.data;
            });
    }

    $scope.fillProducts();

});