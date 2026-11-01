package com.mbridge.msdk.setting;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: MBDNSManager.java */
/* JADX INFO: loaded from: classes11.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<String, f> f36898b;

    /* JADX INFO: compiled from: MBDNSManager.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final e f36899a = new e();
    }

    public static e a() {
        return b.f36899a;
    }

    private e() {
        this.f36897a = 6;
        this.f36898b = new HashMap<>();
    }

    public int a(String str) {
        HashMap<String, f> map;
        f fVar;
        int i10;
        if (TextUtils.isEmpty(str) || (map = this.f36898b) == null || !map.containsKey(str) || (fVar = this.f36898b.get(str)) == null) {
            return 0;
        }
        if (fVar.b()) {
            i10 = 1;
        } else {
            i10 = fVar.a() >= this.f36897a ? 2 : 0;
        }
        fVar.a(false);
        return i10;
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (this.f36898b == null) {
                this.f36898b = new HashMap<>();
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = jSONObject.getString(next);
                f fVar = new f();
                fVar.a(next);
                fVar.b(string);
                this.f36898b.put(next, fVar);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
