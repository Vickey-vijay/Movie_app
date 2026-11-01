package com.bytedance.sdk.openadsdk.jqy;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class vt {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final String f13215lh;
    private SharedPreferences ouw;
    private final Context vt;

    public final SharedPreferences ouw() {
        Context context;
        SharedPreferences sharedPreferences = this.ouw;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        if (TextUtils.isEmpty(this.f13215lh) || (context = this.vt) == null) {
            return null;
        }
        try {
            this.ouw = context.getSharedPreferences(this.f13215lh, 0);
        } catch (Throwable th2) {
            Log.e("SPUnit", th2.getMessage());
        }
        return this.ouw;
    }

    public vt(Context context, String str) {
        this.vt = context;
        this.f13215lh = str;
    }

    public final void ouw(JSONObject jSONObject) {
        try {
            SharedPreferences sharedPreferencesOuw = ouw();
            if (sharedPreferencesOuw != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesOuw.edit();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        if (!TextUtils.isEmpty(next)) {
                            Object obj = jSONObject.get(next);
                            if (obj instanceof Integer) {
                                editorEdit.putInt(next, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                editorEdit.putLong(next, ((Long) obj).longValue());
                            } else if (obj instanceof String) {
                                editorEdit.putString(next, (String) obj);
                            } else if (obj instanceof Boolean) {
                                editorEdit.putBoolean(next, ((Boolean) obj).booleanValue());
                            } else if (obj instanceof Float) {
                                editorEdit.putFloat(next, ((Float) obj).floatValue());
                            } else if (obj instanceof Double) {
                                editorEdit.putFloat(next, Double.valueOf(((Double) obj).doubleValue()).floatValue());
                            }
                        }
                    } catch (Throwable th2) {
                        Log.e("SPUnit", th2.getMessage());
                    }
                }
                editorEdit.apply();
            }
        } catch (Throwable th3) {
            Log.e("SPUnit", th3.getMessage());
        }
    }

    public final int ouw(String str, int i10) {
        try {
            SharedPreferences sharedPreferencesOuw = ouw();
            if (sharedPreferencesOuw != null && sharedPreferencesOuw.contains(str)) {
                return sharedPreferencesOuw.getInt(str, i10);
            }
            return i10;
        } catch (Throwable th2) {
            Log.i("SPUnit", this.f13215lh + th2.getMessage());
            return i10;
        }
    }

    public final long ouw(String str) {
        try {
            SharedPreferences sharedPreferencesOuw = ouw();
            if (sharedPreferencesOuw != null && sharedPreferencesOuw.contains(str)) {
                return sharedPreferencesOuw.getLong(str, 0L);
            }
            return 0L;
        } catch (Throwable th2) {
            Log.i("SPUnit", this.f13215lh + th2.getMessage());
            return 0L;
        }
    }

    public final String ouw(String str, String str2) {
        try {
            SharedPreferences sharedPreferencesOuw = ouw();
            if (sharedPreferencesOuw != null && sharedPreferencesOuw.contains(str)) {
                return sharedPreferencesOuw.getString(str, str2);
            }
            return str2;
        } catch (Throwable th2) {
            Log.i("SPUnit", this.f13215lh + th2.getMessage());
            return str2;
        }
    }

    public final boolean ouw(String str, boolean z10) {
        try {
            SharedPreferences sharedPreferencesOuw = ouw();
            if (sharedPreferencesOuw != null && sharedPreferencesOuw.contains(str)) {
                return sharedPreferencesOuw.getBoolean(str, z10);
            }
            return z10;
        } catch (Throwable th2) {
            Log.i("SPUnit", this.f13215lh + th2.getMessage());
            return z10;
        }
    }
}
