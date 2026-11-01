package ua;

import android.content.Context;
import android.provider.Settings;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes11.dex */
public class d {
    @RequiresApi(api = 23)
    public static boolean a(Context context) {
        return Settings.canDrawOverlays(context);
    }
}
