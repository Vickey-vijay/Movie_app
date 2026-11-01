package yads;

import android.os.Build;
import com.ironsource.C3426d4;
import com.ironsource.Q6;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ew3 {
    public static JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        lw3.a(jSONObject, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        lw3.a(jSONObject, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        lw3.a(jSONObject, Q6.F, C3426d4.f28386d);
        return jSONObject;
    }
}
