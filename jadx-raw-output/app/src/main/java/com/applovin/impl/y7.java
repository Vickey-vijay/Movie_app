package com.applovin.impl;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class y7 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f10171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f10173e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f10174f = -1;

    public static y7 a(p8 p8Var, s7 s7Var, com.applovin.impl.sdk.k kVar) {
        List<String> listExplode;
        int size;
        long seconds;
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String strD = p8Var.d();
            if (TextUtils.isEmpty(strD)) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().b("VastTracker", "Unable to create tracker. Could not find URL.");
                }
                return null;
            }
            y7 y7Var = new y7();
            y7Var.f10171c = strD;
            y7Var.f10169a = (String) p8Var.a().get("id");
            y7Var.f10170b = (String) p8Var.a().get("event");
            y7Var.f10172d = ((Boolean) kVar.a(x4.f9960j5)).booleanValue();
            if (s7Var != null) {
                y7Var.f10172d = JsonUtils.getBoolean(s7Var.b(), "vast_fire_trackers_from_webview", Boolean.valueOf(y7Var.f10172d)).booleanValue();
            }
            y7Var.f10174f = a(y7Var.b(), s7Var);
            String str = (String) p8Var.a().get(TypedValues.CycleType.S_WAVE_OFFSET);
            if (StringUtils.isValidString(str)) {
                String strTrim = str.trim();
                if (strTrim.contains("%")) {
                    y7Var.f10174f = StringUtils.parseInt(strTrim.substring(0, strTrim.length() - 1));
                } else if (strTrim.contains(io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER) && (size = (listExplode = CollectionUtils.explode(strTrim, io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER)).size()) > 0) {
                    long j10 = 0;
                    int i10 = size - 1;
                    for (int i11 = i10; i11 >= 0; i11--) {
                        String str2 = listExplode.get(i11);
                        if (StringUtils.isNumeric(str2)) {
                            int i12 = Integer.parseInt(str2);
                            if (i11 == i10) {
                                seconds = i12;
                            } else if (i11 == size - 2) {
                                seconds = TimeUnit.MINUTES.toSeconds(i12);
                            } else if (i11 == size - 3) {
                                seconds = TimeUnit.HOURS.toSeconds(i12);
                            }
                            j10 += seconds;
                        }
                    }
                    y7Var.f10173e = j10;
                    y7Var.f10174f = -1;
                }
            }
            return y7Var;
        } catch (Throwable th2) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastTracker", "Error occurred while initializing", th2);
            }
            kVar.D().a("VastTracker", th2);
            return null;
        }
    }

    public String b() {
        return this.f10170b;
    }

    public String c() {
        return this.f10171c;
    }

    public boolean d() {
        return this.f10172d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7)) {
            return false;
        }
        y7 y7Var = (y7) obj;
        if (this.f10173e != y7Var.f10173e || this.f10174f != y7Var.f10174f) {
            return false;
        }
        String str = this.f10169a;
        if (str == null ? y7Var.f10169a != null : !str.equals(y7Var.f10169a)) {
            return false;
        }
        String str2 = this.f10170b;
        if (str2 == null ? y7Var.f10170b == null : str2.equals(y7Var.f10170b)) {
            return this.f10171c.equals(y7Var.f10171c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f10169a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f10170b;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f10171c.hashCode()) * 31;
        long j10 = this.f10173e;
        return ((iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f10174f;
    }

    public String toString() {
        return "VastTracker{identifier='" + this.f10169a + "', event='" + this.f10170b + "', uriString='" + this.f10171c + "', offsetSeconds=" + this.f10173e + ", offsetPercent=" + this.f10174f + '}';
    }

    private y7() {
    }

    public boolean a(long j10, int i10) {
        long j11 = this.f10173e;
        boolean z10 = j11 >= 0;
        boolean z11 = j10 >= j11;
        int i11 = this.f10174f;
        boolean z12 = i11 >= 0;
        boolean z13 = i10 >= i11;
        if (z10 && z11) {
            return true;
        }
        return z12 && z13;
    }

    private static int a(String str, s7 s7Var) {
        if ("start".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("firstQuartile".equalsIgnoreCase(str)) {
            return 25;
        }
        if (CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT.equalsIgnoreCase(str)) {
            return 50;
        }
        if ("thirdQuartile".equalsIgnoreCase(str)) {
            return 75;
        }
        if (!"complete".equalsIgnoreCase(str)) {
            return -1;
        }
        if (s7Var != null) {
            return s7Var.g();
        }
        return 95;
    }

    public static y7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        y7 y7Var = new y7();
        String string = JsonUtils.getString(jSONObject, "uri_string", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        y7Var.f10171c = string;
        y7Var.f10169a = JsonUtils.getString(jSONObject, "identifier", "");
        y7Var.f10170b = JsonUtils.getString(jSONObject, "event", "");
        y7Var.f10173e = JsonUtils.getLong(jSONObject, "offset_seconds", -1L);
        y7Var.f10174f = JsonUtils.getInt(jSONObject, "offset_percent", -1);
        return y7Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "identifier", this.f10169a);
        JsonUtils.putString(jSONObject, "event", this.f10170b);
        JsonUtils.putString(jSONObject, "uri_string", this.f10171c);
        JsonUtils.putLong(jSONObject, "offset_seconds", this.f10173e);
        JsonUtils.putInt(jSONObject, "offset_percent", this.f10174f);
        return jSONObject;
    }
}
