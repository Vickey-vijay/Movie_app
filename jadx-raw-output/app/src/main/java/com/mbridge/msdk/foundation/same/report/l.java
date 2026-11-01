package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.ironsource.C3426d4;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.tools.q0;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: SameCommonReporter.java */
/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f35129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f35130b;

    /* JADX INFO: compiled from: SameCommonReporter.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, String> f35131a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f35132b;

        public l a() {
            return new l(this);
        }

        public b(String str) {
            this.f35132b = str;
        }
    }

    private void a(Map<String, String> map, JSONObject jSONObject) {
        if (map == null || map.isEmpty() || jSONObject == null) {
            return;
        }
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, a(map.get(str)));
            }
        } catch (Exception e10) {
            q0.b("SameCommonReporter", e10.getMessage());
        }
    }

    private l(b bVar) {
        this.f35130b = bVar.f35132b;
        this.f35129a = bVar.f35131a;
    }

    public void b(String str) {
        if (TextUtils.isEmpty(this.f35130b)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3426d4.i.W, this.f35130b);
            a(this.f35129a, jSONObject);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th2) {
            q0.b("SameCommonReporter", th2.getMessage());
        }
    }

    private String a(String str) {
        try {
            return URLEncoder.encode(str, G5.N);
        } catch (Exception unused) {
            return str;
        }
    }
}
