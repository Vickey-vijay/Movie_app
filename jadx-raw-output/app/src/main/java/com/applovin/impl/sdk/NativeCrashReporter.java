package com.applovin.impl.sdk;

import com.applovin.impl.d2;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class NativeCrashReporter implements g.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f9097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f9098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final NativeCrashReporter f9099d = new NativeCrashReporter();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f9100a = new HashMap();

    public static void a(k kVar) {
        if (kVar == null) {
            return;
        }
        if (!((Boolean) kVar.a(x4.f10018q4)).booleanValue() && !n7.k(k.o())) {
            if (f9098c) {
                try {
                    g gVarL = kVar.l();
                    NativeCrashReporter nativeCrashReporter = f9099d;
                    gVarL.a(nativeCrashReporter);
                    nativeCrashReporter.disable();
                    return;
                } catch (Throwable th2) {
                    kVar.O();
                    if (o.a()) {
                        kVar.O().a("NativeCrashReporter", "Failed to disable native crash reporter", th2);
                    }
                    kVar.D().a("NativeCrashReporter", "disableInstance", th2);
                    return;
                }
            }
            return;
        }
        if (a()) {
            List listC = kVar.c(x4.f10026r4);
            int[] iArr = new int[listC.size()];
            for (int i10 = 0; i10 < listC.size(); i10++) {
                try {
                    iArr[i10] = Integer.parseInt((String) listC.get(i10));
                } catch (NumberFormatException unused) {
                }
            }
            File file = new File(k.o().getCacheDir(), "al-reports");
            if (file.exists()) {
                a(file, kVar);
            } else if (!file.mkdir()) {
                kVar.O();
                if (o.a()) {
                    kVar.O().b("NativeCrashReporter", "Failed to create reports directory");
                    return;
                }
                return;
            }
            try {
                NativeCrashReporter nativeCrashReporter2 = f9099d;
                nativeCrashReporter2.enable(file.getAbsolutePath(), iArr, ((Boolean) kVar.a(x4.f10034s4)).booleanValue());
                if (((Boolean) kVar.a(x4.f10042t4)).booleanValue()) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(g.c.LOADING);
                    hashSet.add(g.c.LOAD);
                    hashSet.add(g.c.SHOW);
                    hashSet.add(g.c.CLICK);
                    hashSet.add(g.c.SHOW_ERROR);
                    hashSet.add(g.c.DESTROY);
                    kVar.l().a(nativeCrashReporter2, hashSet);
                }
            } catch (Throwable th3) {
                kVar.O();
                if (o.a()) {
                    kVar.O().a("NativeCrashReporter", "Failed to enable native crash reporter", th3);
                }
                kVar.D().a("NativeCrashReporter", "enableInstance", th3);
            }
        }
    }

    private native void disable();

    private native void enable(String str, int[] iArr, boolean z10);

    private native void updateAdInfo(String str);

    private NativeCrashReporter() {
    }

    private static boolean a() {
        if (!f9097b) {
            f9097b = true;
            try {
                System.loadLibrary("applovin-native-crash-reporter");
                f9098c = true;
            } catch (Throwable th2) {
                o.b("NativeCrashReporter", "Failed to load native crash reporter library", th2);
            }
        }
        return f9098c;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009c  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x00a5, please report this as an issue */
    private static void a(File file, k kVar) throws Throwable {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            String strF = kVar.G().f(file2);
            if (StringUtils.isValidString(strF)) {
                String[] strArrSplit = strF.split("@@@@@");
                if (strArrSplit.length == 3) {
                    try {
                        String str = strArrSplit[0];
                        String str2 = strArrSplit[1];
                        JSONArray jSONArray = new JSONArray(strArrSplit[2]);
                        if (jSONArray.length() == 0) {
                            kVar.D().a(d2.V0, str2, CollectionUtils.hashMap("error_message", str));
                        } else {
                            ArrayList arrayList = new ArrayList(jSONArray.length());
                            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
                                if (jSONObject != null) {
                                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap("error_message", str);
                                    mapHashMap.put("source", str2);
                                    mapHashMap.putAll(JsonUtils.toStringMap(jSONObject));
                                    arrayList.add(mapHashMap);
                                }
                            }
                            kVar.D().a(d2.V0, arrayList, 0L);
                        }
                    } catch (Throwable th2) {
                        kVar.O();
                        if (o.a()) {
                            kVar.O().a("NativeCrashReporter", "Failed to symbolicate native crash report", th2);
                        }
                    }
                } else {
                    kVar.O();
                    if (o.a()) {
                        kVar.O().b("NativeCrashReporter", "Failed to read native crash error report: " + file2.getAbsolutePath());
                    }
                }
            } else {
                kVar.O();
                if (o.a()) {
                    kVar.O().b("NativeCrashReporter", "Failed to read native crash error report: " + file2.getAbsolutePath());
                }
            }
            try {
                if (!file2.delete()) {
                    kVar.O();
                    if (o.a()) {
                        kVar.O().b("NativeCrashReporter", "Failed to delete native crash report: " + file2.getAbsolutePath());
                    }
                }
            } catch (Throwable th3) {
                kVar.O();
                if (o.a()) {
                    kVar.O().a("NativeCrashReporter", "Failed to delete native crash report: " + file2.getAbsolutePath(), th3);
                }
            }
        }
    }

    @Override // com.applovin.impl.sdk.g.d
    public void a(g.b bVar) {
        String strH = bVar.h();
        if (bVar.i() == g.c.DESTROY) {
            this.f9100a.remove(strH);
        } else if (this.f9100a.containsKey(strH)) {
            JsonUtils.putString((JSONObject) this.f9100a.get(strH), "operation", bVar.i().toString());
        } else {
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, "ad_unit_id", bVar.a());
            JsonUtils.putString(jSONObject, "ad_format", bVar.g());
            JsonUtils.putString(jSONObject, BrandSafetyEvent.f44576ad, bVar.c());
            JsonUtils.putString(jSONObject, "adapter_class", bVar.b());
            JsonUtils.putString(jSONObject, "adapter_version", bVar.d());
            JsonUtils.putString(jSONObject, "bcode", bVar.e());
            JsonUtils.putString(jSONObject, "creative_id", bVar.f());
            JsonUtils.putString(jSONObject, "operation", bVar.i().toString());
            this.f9100a.put(strH, jSONObject);
        }
        try {
            updateAdInfo(new JSONArray(this.f9100a.values()).toString());
        } catch (Throwable unused) {
        }
    }
}
