package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.impl.xo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class xo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zo f57978a;

    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("device_id", JsonUtils.optStringOrNullable(jSONObject2, "device_id", JsonUtils.optStringOrNull(jSONObject, "device_id")));
        jSONObject3.put("device_id_hash", JsonUtils.optStringOrNullable(jSONObject2, "device_id_hash", JsonUtils.optStringOrNull(jSONObject, "device_id_hash")));
        jSONObject3.put("referrer", JsonUtils.optStringOrNullable(jSONObject2, "referrer", JsonUtils.optStringOrNull(jSONObject, "referrer")));
        jSONObject3.put("referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_checked", Boolean.FALSE)));
        jSONObject3.put("last_migration_api_level", AbstractC4241hb.a(jSONObject2, "last_migration_api_level", AbstractC4241hb.a(jSONObject, "last_migration_api_level", -1)));
        return jSONObject3;
    }

    public final synchronized void b(String str) {
        zo zoVar = this.f57978a;
        zoVar.a(zoVar.a().put("device_id_hash", str));
    }

    public final synchronized boolean c() {
        return this.f57978a.a().optBoolean("referrer_checked", false);
    }

    public final synchronized void d() {
        zo zoVar = this.f57978a;
        zoVar.a(zoVar.a().put("referrer_checked", true));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    public final synchronized C4424og b() {
        C4424og c4424og;
        String strOptStringOrNull = JsonUtils.optStringOrNull(this.f57978a.a(), "referrer");
        if (strOptStringOrNull != null) {
            try {
                byte[] bArrDecode = Base64.decode(strOptStringOrNull.getBytes(lk.c.f63591b), 0);
                if (bArrDecode == null || bArrDecode.length == 0) {
                    c4424og = null;
                } else {
                    c4424og = new C4424og(bArrDecode);
                }
            } catch (Throwable unused) {
            }
        } else {
            c4424og = null;
        }
        return c4424og;
    }

    public xo(C4064af c4064af, C4111ca c4111ca) {
        this.f57978a = new zo(c4064af, c4111ca, new Ao() { // from class: af.x0
            @Override // io.appmetrica.analytics.impl.Ao
            public final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
                return xo.a(jSONObject, jSONObject2);
            }
        });
    }

    public final synchronized void a(String str) {
        zo zoVar = this.f57978a;
        zoVar.a(zoVar.a().put("device_id", str));
    }

    public final synchronized String a() {
        return JsonUtils.optStringOrNull(this.f57978a.a(), "device_id_hash");
    }

    public final synchronized void a(C4424og c4424og) {
        zo zoVar = this.f57978a;
        zoVar.a(zoVar.a().put("referrer", c4424og != null ? new String(Base64.encode(c4424og.a(), 0), lk.c.f63591b) : null));
    }
}
