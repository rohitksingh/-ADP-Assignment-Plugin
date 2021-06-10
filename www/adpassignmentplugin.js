
// function AdpAssignmentPlugin() {}

// // Message is the number and duration is the time after which the callback will happen.
// AdpAssignmentPlugin.prototype.show = function(message, duration, successCallback, errorCallback) {
//   var options = {};
//   options.message = message;
//   options.duration = duration;
//   cordova.exec(successCallback, errorCallback, 'AdpAssignmentPlugin', 'show', [options]);
// }

// AdpAssignmentPlugin.install = function() {
//   if (!window.plugins) {
//     window.plugins = {};
//   }
//   window.plugins.adpAssignmentPlugin = new AdpAssignmentPlugin();
//   return window.plugins.adpAssignmentPlugin;
// };

// cordova.addConstructor(AdpAssignmentPlugin.install);

module.exports = {
    
    calculate: function (number, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "AdpAssignmentPlugin", "calculate", [number]);
    },
    
};

