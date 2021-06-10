package com.cordova.plugin;
// The native Toast API
import android.widget.Toast;
// Cordova-required packages
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class AdpAssignmentPlugin extends CordovaPlugin {
  private static final String DURATION_LONG = "3";
  protected static final String TAG = "AdpAssignmentPlugin";
  protected CallbackContext context;

  @Override
  public boolean execute(String action, JSONArray args,
    final CallbackContext callbackContext) {
      context = callbackContext;
      if (!action.equals("calculate")) {
        context.error("\"" + action + "\" is not a recognized action.");
        Toast toast = Toast.makeText(cordova.getActivity(), "message",
        Toast.LENGTH_LONG);  
        toast.show();
        return false;
      }
      String message;
      String duration;

      duration = "3";

      try {
        JSONObject options = args.getJSONObject(0);
        int value = options.getInt("message");
        message = String.valueOf(value*10);
        context.success(message);
      } catch (JSONException e) {
        context.error("Error encountered: " + e.getMessage());
        return false;
      }
      
      Toast toast = Toast.makeText(cordova.getActivity(), message,
        DURATION_LONG.equals(duration) ? Toast.LENGTH_LONG : Toast.LENGTH_SHORT);  
      toast.show();
    
      PluginResult pluginResult = new PluginResult(PluginResult.Status.OK);
      context.sendPluginResult(pluginResult);
      return true;
  }
}