package com.bykv.vk.openvk.ouw.ouw.vt;

import android.text.TextUtils;
import com.bykv.vk.openvk.ouw.ouw.ouw.ouw.vt;
import com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class ouw {
    private static vt fkw = null;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private static boolean f10483le = false;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static int f10484lh = 10;
    public static int ouw = 10;
    private static int pno = 8192;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private static int f10485ra = 1;
    public static int vt = 10;
    public static int yu = 10;

    public static void ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            ouw = jSONObject.optInt("splash", 10);
            vt = jSONObject.optInt("reward", 10);
            f10484lh = jSONObject.optInt("brand", 10);
            int iOptInt = jSONObject.optInt("other", 10);
            yu = iOptInt;
            if (ouw < 0) {
                ouw = 10;
            }
            if (vt < 0) {
                vt = 10;
            }
            if (f10484lh < 0) {
                f10484lh = 10;
            }
            if (iOptInt < 0) {
                yu = 10;
            }
            lh.vt("MediaConfig", "splash=", Integer.valueOf(ouw), ",reward=", Integer.valueOf(vt), ",brand=", Integer.valueOf(f10484lh), ",other=", Integer.valueOf(yu));
        } catch (Throwable th2) {
            lh.lh("MediaConfig", th2.getMessage());
        }
    }

    public static boolean vt(String str) {
        return f10483le && str != null && str.endsWith(".mp4");
    }

    public static int fkw() {
        return yu;
    }

    public static int le() {
        return f10485ra;
    }

    public static int lh() {
        return vt;
    }

    public static int ra() {
        return pno;
    }

    public static int vt() {
        return ouw;
    }

    public static int yu() {
        return f10484lh;
    }

    public static void ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            f10483le = jSONObject.optInt("check_moov", 0) == 1;
            f10485ra = jSONObject.optInt("new_media_source", 1);
            pno = jSONObject.optInt("read_buffer_size_k", 8) * 1024;
        } catch (JSONException unused) {
        }
    }

    public static void ouw(vt vtVar) {
        fkw = vtVar;
    }

    public static void ouw() {
        vt vtVar = fkw;
        if (vtVar != null) {
            vtVar.yu();
        }
    }
}
