package com.safedk.android.utils;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.safedk.android.analytics.reporters.CrashReporter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f44982a = "sdk_key";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f44983b = "userUUID";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f44984c = "configuration";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f44985d = "last_reported_device_at";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f44986e = "last_reported_version";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f44987f = "configETag";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f44988g = "sdk_version";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f44989h = "versionCode";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f44990i = "randomToken";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f44991j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f44992k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f44993l = "SharedPreferencesUtils";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f44994m = "offlineMode";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f44995n = "age";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f44996o = "region";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f44997p = "last_foreground_time";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f44998q = "last_foreground_report";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f44999r = "sdk_versions";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f45000s = "is_reported";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f45001w = "safedk_stored_version";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f45002x = "§§";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final SharedPreferences f45003t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f45004u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private JSONObject f45005v;

    public i(SharedPreferences sharedPreferences, boolean z10) {
        this.f45003t = sharedPreferences;
        this.f45004u = z10;
    }

    private void a(Map<String, String> map) {
        try {
            this.f45005v = new JSONObject(this.f45003t.getString(f44999r, JsonUtils.EMPTY_JSON));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String sdkUUIDByPackage = SdksMapping.getSdkUUIDByPackage(key);
                Logger.d(f44993l, "addDiscoveredVersionsToVersionsJson sdkPackage=" + key + ", version=" + value + ", uuid=" + sdkUUIDByPackage);
                if (sdkUUIDByPackage != null) {
                    try {
                        if (sdkUUIDByPackage.length() > 0 && value != null && value.length() > 0) {
                            this.f45005v.put(sdkUUIDByPackage, value);
                        }
                    } catch (JSONException e10) {
                        Logger.d(f44993l, "error in addDiscoveredVersionsToVersionsJson", e10);
                    }
                }
                Logger.d(f44993l, "UUID for sdkPackage " + key + "is empty and will not be added to sdkVersionsJson");
            }
            a(this.f45005v);
        } catch (Throwable th2) {
            Logger.e(f44993l, "Exception in addDiscoveredVersionsToVersionsJson", th2);
        }
    }

    private void a(JSONObject jSONObject) {
        SharedPreferences.Editor editorEdit = this.f45003t.edit();
        editorEdit.putString(f44999r, jSONObject.toString());
        Logger.d(f44993l, "saveSdkVersions saved (" + jSONObject.length() + " items) : " + jSONObject.toString());
        editorEdit.commit();
    }

    public String a() {
        return this.f45003t.getString(f44983b, null);
    }

    public boolean b() {
        return this.f45003t.getBoolean(f44994m, this.f45004u);
    }

    public Integer c() {
        int i10 = this.f45003t.getInt("age", -1);
        if (i10 < 0) {
            return null;
        }
        return new Integer(i10);
    }

    public String d() {
        return this.f45003t.getString("region", null);
    }

    public Bundle e() {
        Logger.d(f44993l, "getConfiguration started");
        return a(this.f45003t, f44984c);
    }

    public long f() {
        return this.f45003t.getLong(f44985d, 0L);
    }

    public int g() {
        return this.f45003t.getInt(f44986e, 0);
    }

    public long h() {
        return this.f45003t.getLong(f44997p, 0L);
    }

    public long i() {
        return this.f45003t.getLong(f44998q, 0L);
    }

    public JSONObject j() {
        return this.f45005v;
    }

    public void a(long j10) {
        SharedPreferences.Editor editorEdit = this.f45003t.edit();
        editorEdit.putLong(f44997p, j10);
        editorEdit.commit();
    }

    public String k() {
        return this.f45003t.getString(f44987f, null);
    }

    public boolean a(String str) {
        SharedPreferences.Editor editorEdit = this.f45003t.edit();
        editorEdit.putString(f44983b, str);
        return editorEdit.commit();
    }

    public boolean l() {
        return this.f45003t.contains(f44984c);
    }

    public boolean a(Bundle bundle) {
        try {
            SharedPreferences.Editor editorEdit = this.f45003t.edit();
            String strP = p();
            String strA = a();
            editorEdit.clear();
            a(editorEdit, f44984c, bundle);
            if (strP != null) {
                editorEdit.putString(f45001w, strP);
            }
            if (strA != null) {
                editorEdit.putString(f44983b, strA);
            }
            return editorEdit.commit();
        } catch (Throwable th2) {
            Logger.e(f44993l, "Caught exception", th2);
            new CrashReporter().caughtException(th2);
            return false;
        }
    }

    public static void a(SharedPreferences.Editor editor, String str, Bundle bundle) {
        String str2 = str + f45002x;
        for (String str3 : bundle.keySet()) {
            Object obj = bundle.get(str3);
            if (obj == null) {
                editor.remove(str2 + str3);
            } else if (obj instanceof Integer) {
                editor.putInt(str2 + str3, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                editor.putLong(str2 + str3, ((Long) obj).longValue());
            } else if (obj instanceof Boolean) {
                editor.putBoolean(str2 + str3, ((Boolean) obj).booleanValue());
            } else if (obj instanceof CharSequence) {
                editor.putString(str2 + str3, ((CharSequence) obj).toString());
            } else if ((obj instanceof ArrayList) && ((ArrayList) obj).size() > 0 && (((ArrayList) obj).get(0) instanceof String)) {
                editor.putStringSet(str2 + str3, new HashSet((ArrayList) obj));
            } else if (obj instanceof Bundle) {
                a(editor, str2 + str3, (Bundle) obj);
            }
        }
    }

    public static Bundle a(SharedPreferences sharedPreferences, String str) {
        Logger.d(f44993l, "loadPreferencesBundle started, key=" + str);
        Bundle bundle = new Bundle();
        Map<String, ?> all = sharedPreferences.getAll();
        String str2 = str + f45002x;
        HashSet<String> hashSet = new HashSet();
        for (String str3 : all.keySet()) {
            if (str3.startsWith(str2)) {
                String strB = b(str3, str2);
                if (!strB.contains(f45002x)) {
                    Object obj = all.get(str3);
                    if (obj != null) {
                        if (obj instanceof Integer) {
                            bundle.putInt(strB, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(strB, ((Long) obj).longValue());
                        } else if (obj instanceof Boolean) {
                            bundle.putBoolean(strB, ((Boolean) obj).booleanValue());
                        } else if (obj instanceof CharSequence) {
                            bundle.putString(strB, ((CharSequence) obj).toString());
                        } else if (obj instanceof HashSet) {
                            bundle.putStringArrayList(strB, new ArrayList<>((HashSet) obj));
                        }
                    }
                } else {
                    hashSet.add(a(strB, f45002x));
                }
            }
        }
        for (String str4 : hashSet) {
            bundle.putBundle(str4, a(sharedPreferences, str2 + str4));
        }
        return bundle;
    }

    public static String a(String str, String str2) {
        if (!b(str) && str2 != null) {
            if (str2.length() == 0) {
                return "";
            }
            int iIndexOf = str.indexOf(str2);
            return iIndexOf != -1 ? str.substring(0, iIndexOf) : str;
        }
        return str;
    }

    public static boolean b(String str) {
        return str == null || str.length() == 0;
    }

    public static String b(String str, String str2) {
        if (!b(str) && !b(str2) && str.startsWith(str2)) {
            return str.substring(str2.length());
        }
        return str;
    }

    public boolean a(int i10, String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = this.f45003t.edit();
            editorEdit.putInt(f44989h, i10);
            editorEdit.putString(f44990i, str);
            editorEdit.putString("sdk_key", str2);
            Logger.d(f44993l, "save sdk key " + str2 + ", token " + str + ", version code " + i10);
            return editorEdit.commit();
        } catch (Throwable th2) {
            Logger.d(f44993l, "Caught exception", th2);
            new CrashReporter().caughtException(th2);
            return false;
        }
    }

    public String m() {
        String string = this.f45003t.getString("sdk_key", null);
        Logger.d(f44993l, "read sdk key " + string);
        return string;
    }

    public int n() {
        int i10 = this.f45003t.getInt(f44989h, 0);
        Logger.d(f44993l, "read version code " + i10);
        return i10;
    }

    public String o() {
        String string = this.f45003t.getString(f44990i, null);
        Logger.d(f44993l, "read token " + string);
        return string;
    }

    public boolean c(String str) {
        SharedPreferences.Editor editorEdit = this.f45003t.edit();
        editorEdit.putString(f45001w, str);
        return editorEdit.commit();
    }

    public String p() {
        return this.f45003t.getString(f45001w, null);
    }
}
