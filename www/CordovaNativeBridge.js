var exec = require('cordova/exec');

var cordovaNativeBridge = {

    callMainActivity: function (arg, onSuccess, onError) {
        console.log('Hello from callMainActivity');
        console.log('Called with arg = "' + arg + '"');
        cordova.exec(onSuccess, onError, 'CordovaNativeBridge', 'callMainActivity', [arg]);
    }
};

module.exports = cordovaNativeBridge;