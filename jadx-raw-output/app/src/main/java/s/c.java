package s;

import android.content.Context;
import android.provider.Settings;

/* JADX INFO: compiled from: SensorUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public class c {
    public static int a(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation");
        } catch (Settings.SettingNotFoundException e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static boolean b(Context context) {
        if (a(context) == 1) {
            return true;
        }
        a(context);
        return false;
    }
}
