package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u4;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f9495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f9496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f9497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f9498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f9499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f9500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f9501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private u4.a f9502h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f9503i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f9504j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f9505k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f9506l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f9507m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f9508n;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f9509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f9510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f9511c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f9512d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map f9513e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f9514f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map f9515g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private u4.a f9516h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f9517i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f9518j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f9519k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f9520l;

        public b a(String str) {
            this.f9512d = str;
            return this;
        }

        public b b(String str) {
            this.f9509a = str;
            return this;
        }

        public b c(String str) {
            this.f9510b = str;
            return this;
        }

        public b d(String str) {
            this.f9511c = str;
            return this;
        }

        public b a(Map map) {
            this.f9514f = map;
            return this;
        }

        public b b(Map map) {
            this.f9513e = map;
            return this;
        }

        public b c(Map map) {
            this.f9515g = map;
            return this;
        }

        public b d(boolean z10) {
            this.f9519k = z10;
            return this;
        }

        public b a(u4.a aVar) {
            this.f9516h = aVar;
            return this;
        }

        public b b(boolean z10) {
            this.f9520l = z10;
            return this;
        }

        public b c(boolean z10) {
            this.f9518j = z10;
            return this;
        }

        public b a(boolean z10) {
            this.f9517i = z10;
            return this;
        }

        public d a() {
            return new d(this);
        }
    }

    public d(JSONObject jSONObject, k kVar) throws JSONException {
        String string = JsonUtils.getString(jSONObject, "uniqueId", UUID.randomUUID().toString());
        String string2 = JsonUtils.getString(jSONObject, "communicatorRequestId", "");
        String string3 = JsonUtils.getString(jSONObject, "httpMethod", "");
        String string4 = jSONObject.getString("targetUrl");
        String string5 = JsonUtils.getString(jSONObject, "backupUrl", "");
        int i10 = jSONObject.getInt("attemptNumber");
        Map mapSynchronizedMap = JsonUtils.valueExists(jSONObject, "parameters") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("parameters"))) : new HashMap();
        Map mapSynchronizedMap2 = JsonUtils.valueExists(jSONObject, "httpHeaders") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("httpHeaders"))) : new HashMap();
        Map mapSynchronizedMap3 = JsonUtils.valueExists(jSONObject, "requestBody") ? Collections.synchronizedMap(JsonUtils.toStringObjectMap(jSONObject.getJSONObject("requestBody"))) : new HashMap();
        this.f9495a = string;
        this.f9496b = string3;
        this.f9507m = string2;
        this.f9497c = string4;
        this.f9498d = string5;
        this.f9499e = mapSynchronizedMap;
        this.f9500f = mapSynchronizedMap2;
        this.f9501g = mapSynchronizedMap3;
        this.f9502h = u4.a.a(jSONObject.optInt("encodingType", u4.a.DEFAULT.b()));
        this.f9503i = jSONObject.optBoolean("isEncodingEnabled", false);
        this.f9504j = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.f9505k = jSONObject.optBoolean("isAllowedPreInitEvent", false);
        this.f9506l = jSONObject.optBoolean("shouldFireInWebView", false);
        this.f9508n = i10;
    }

    public static b b() {
        return new b();
    }

    public void a() {
        Map map = CollectionUtils.map(this.f9499e);
        map.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.f9499e = map;
    }

    public int c() {
        return this.f9508n;
    }

    public String d() {
        return this.f9498d;
    }

    public String e() {
        return this.f9507m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f9495a.equals(((d) obj).f9495a);
    }

    public u4.a f() {
        return this.f9502h;
    }

    public Map g() {
        return this.f9500f;
    }

    public String h() {
        return this.f9496b;
    }

    public int hashCode() {
        return this.f9495a.hashCode();
    }

    public Map i() {
        return this.f9499e;
    }

    public Map j() {
        return this.f9501g;
    }

    public String k() {
        return this.f9497c;
    }

    public void l() {
        this.f9508n++;
    }

    public boolean m() {
        return this.f9505k;
    }

    public boolean n() {
        return this.f9503i;
    }

    public boolean o() {
        return this.f9504j;
    }

    public boolean p() {
        return this.f9506l;
    }

    public JSONObject q() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.f9495a);
        jSONObject.put("communicatorRequestId", this.f9507m);
        jSONObject.put("httpMethod", this.f9496b);
        jSONObject.put("targetUrl", this.f9497c);
        jSONObject.put("backupUrl", this.f9498d);
        jSONObject.put("encodingType", this.f9502h);
        jSONObject.put("isEncodingEnabled", this.f9503i);
        jSONObject.put("gzipBodyEncoding", this.f9504j);
        jSONObject.put("isAllowedPreInitEvent", this.f9505k);
        jSONObject.put("attemptNumber", this.f9508n);
        if (this.f9499e != null) {
            jSONObject.put("parameters", new JSONObject(this.f9499e));
        }
        if (this.f9500f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f9500f));
        }
        if (this.f9501g != null) {
            jSONObject.put("requestBody", new JSONObject(this.f9501g));
        }
        return jSONObject;
    }

    public String toString() {
        return "PostbackRequest{uniqueId='" + this.f9495a + "', communicatorRequestId='" + this.f9507m + "', httpMethod='" + this.f9496b + "', targetUrl='" + this.f9497c + "', backupUrl='" + this.f9498d + "', attemptNumber=" + this.f9508n + ", isEncodingEnabled=" + this.f9503i + ", isGzipBodyEncoding=" + this.f9504j + ", isAllowedPreInitEvent=" + this.f9505k + ", shouldFireInWebView=" + this.f9506l + '}';
    }

    private d(b bVar) {
        this.f9495a = UUID.randomUUID().toString();
        this.f9496b = bVar.f9510b;
        this.f9497c = bVar.f9511c;
        this.f9498d = bVar.f9512d;
        this.f9499e = bVar.f9513e;
        this.f9500f = bVar.f9514f;
        this.f9501g = bVar.f9515g;
        this.f9502h = bVar.f9516h;
        this.f9503i = bVar.f9517i;
        this.f9504j = bVar.f9518j;
        this.f9505k = bVar.f9519k;
        this.f9506l = bVar.f9520l;
        this.f9507m = bVar.f9509a;
        this.f9508n = 0;
    }
}
