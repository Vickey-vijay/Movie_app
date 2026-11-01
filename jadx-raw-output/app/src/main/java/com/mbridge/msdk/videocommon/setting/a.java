package com.mbridge.msdk.videocommon.setting;

import android.text.TextUtils;
import com.ironsource.Ne;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: RewardSetting.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Integer> f39576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.videocommon.entity.c> f39577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f39578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f39579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f39580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f39581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f39582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f39583h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f39585j;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f39584i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f39586k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f39587l = "";

    public String a() {
        return this.f39585j;
    }

    public void b(String str) {
        this.f39585j = str;
    }

    public void c(String str) {
        this.f39587l = str;
    }

    public void d(String str) {
        this.f39586k = str;
    }

    public void e(long j10) {
        this.f39579d = j10;
    }

    public String f() {
        return this.f39587l;
    }

    public void a(long j10) {
        this.f39583h = j10;
    }

    public void b(long j10) {
        this.f39581f = j10;
    }

    public void c(long j10) {
        this.f39578c = j10;
    }

    public long d() {
        return this.f39578c * 1000;
    }

    public long e() {
        return this.f39580e * 1000;
    }

    public void f(long j10) {
        this.f39582g = j10;
    }

    public Map<String, com.mbridge.msdk.videocommon.entity.c> g() {
        return this.f39577b;
    }

    public long h() {
        return this.f39579d * 1000;
    }

    public long i() {
        return this.f39582g;
    }

    public String j() {
        return this.f39586k;
    }

    public JSONObject k() {
        JSONObject jSONObject = new JSONObject();
        try {
            Map<String, Integer> map = this.f39576a;
            if (map != null && map.size() > 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, Integer> entry : this.f39576a.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue().intValue());
                    }
                    jSONObject.put("caplist", jSONObject2);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            Map<String, com.mbridge.msdk.videocommon.entity.c> map2 = this.f39577b;
            if (map2 != null && map2.size() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, com.mbridge.msdk.videocommon.entity.c> entry2 : this.f39577b.entrySet()) {
                        JSONObject jSONObject3 = new JSONObject();
                        String key = entry2.getKey();
                        com.mbridge.msdk.videocommon.entity.c value = entry2.getValue();
                        if (value != null) {
                            jSONObject3.put("name", value.c());
                            jSONObject3.put("amount", value.a());
                            jSONObject3.put("id", key);
                        }
                        jSONArray.put(jSONObject3);
                    }
                    jSONObject.put("reward", jSONArray);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            jSONObject.put("getpf", this.f39578c);
            jSONObject.put("ruct", this.f39579d);
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, this.f39580e);
            jSONObject.put("dlct", this.f39581f);
            jSONObject.put("vcct", this.f39582g);
            jSONObject.put("current_time", this.f39583h);
            jSONObject.put("vtag", this.f39586k);
            jSONObject.put(Ne.f27137h1, this.f39584i);
            return jSONObject;
        } catch (Exception e12) {
            e12.printStackTrace();
            return jSONObject;
        }
    }

    public void a(Map<String, Integer> map) {
        this.f39576a = map;
    }

    public long b() {
        return this.f39583h;
    }

    public long c() {
        return this.f39581f;
    }

    public void d(long j10) {
        this.f39580e = j10;
    }

    public void a(int i10) {
        this.f39584i = i10;
    }

    public void b(Map<String, com.mbridge.msdk.videocommon.entity.c> map) {
        this.f39577b = map;
    }

    public static a a(String str) {
        a aVar = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                a aVar2 = new a();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("caplist");
                    aVar2.b(jSONObject.optString("ab_id", ""));
                    aVar2.c(jSONObject.optString(ImpressionLog.f43648x, ""));
                    if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                        HashMap map = new HashMap();
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys != null && itKeys.hasNext()) {
                            String next = itKeys.next();
                            int iIntValue = Integer.valueOf(jSONObjectOptJSONObject.optInt(next, 1000)).intValue();
                            if (!TextUtils.isEmpty(next)) {
                                if (!TextUtils.isEmpty(next) && iIntValue == 0) {
                                    map.put(next, 1000);
                                } else {
                                    map.put(next, Integer.valueOf(iIntValue));
                                }
                            }
                        }
                        aVar2.a(map);
                    }
                    aVar2.b(com.mbridge.msdk.videocommon.entity.c.a(jSONObject.optJSONArray("reward")));
                    aVar2.c(jSONObject.optLong("getpf", 43200L));
                    aVar2.e(jSONObject.optLong("ruct", 5400L));
                    aVar2.d(jSONObject.optLong(CampaignEx.JSON_KEY_PLCT, 3600L));
                    aVar2.b(jSONObject.optLong("dlct", 3600L));
                    aVar2.f(jSONObject.optLong("vcct", 5L));
                    aVar2.a(jSONObject.optLong("current_time"));
                    aVar2.d(jSONObject.optString("vtag", ""));
                    return aVar2;
                } catch (Exception e10) {
                    e = e10;
                    aVar = aVar2;
                    e.printStackTrace();
                    return aVar;
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        return aVar;
    }
}
