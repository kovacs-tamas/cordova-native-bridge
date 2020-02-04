package org.crudworks.cordova.plugins;

import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

// Needed only for fake API calls
import java.util.HashMap;
import java.util.Map;

public class CordovaBoilerPlatePlugin extends CordovaPlugin {
    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        // Plugin specific one off initialization code here, this one doesn't
        // have any
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

        if ("callMainActivity".equals(action)) {
            callMainActivity(args.getString(0), callbackContext);
            return true;
        }

        // No action matched
        return false;
    }

    private void callMainActivity(String arg, CallbackContext callbackContext) {
        // TODO
        boolean success = true;

        // Call some native API and set success to true|false
        // String result = callSomeApi(arg);

        Log.v(TAG, "Called!!!!!!!!!!!!!!!!!!!" );
        // success = (result != null);
        // End call some native API

        if (success) {
            callbackContext.success([arg]);
        } else {
            callbackContext.error("Something is wrong!");
        }

    }
}