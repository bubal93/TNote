package bubal.tnote;

import android.app.Application;

/**
 * Need this class for checking if activity is visible or in background mode. Checking is needed for notifications.
 */
public class MyApplication extends Application {

    private static boolean activityVisible;

    public static boolean isActivityVisible() {
        return activityVisible;
    }

    public static void activityResumed() {
        activityVisible = true;
    }

    public static void activityPaused() {
        activityVisible = false;
    }

}
