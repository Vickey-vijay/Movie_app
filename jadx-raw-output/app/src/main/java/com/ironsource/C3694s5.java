package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.s5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3694s5 implements D7, D7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f30720a = IronSourceVideoBridge.jsonObjectInit();

    @Override // com.ironsource.D7.a
    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = this.f30720a;
        }
        this.f30720a = jSONObject;
        IronLog.INTERNAL.verbose("setEpConfig: " + jSONObject);
    }

    private final JSONObject k() {
        JSONObject jSONObjectOptJSONObject = this.f30720a.optJSONObject(C3711t5.f31264a);
        return jSONObjectOptJSONObject == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject;
    }

    @Override // com.ironsource.D7
    public JSONObject config() {
        return this.f30720a;
    }

    @Override // com.ironsource.InterfaceC3728u5
    public boolean a() {
        return k().optBoolean(C3745v5.f31450e, true);
    }

    @Override // com.ironsource.InterfaceC3728u5
    public long b() {
        String strOptString = k().optString(C3745v5.f31448c);
        ck.p.i(strOptString, "traits.optString(LPM_BN_…FRESH_ANIMATION_DURATION)");
        Long lT = lk.w.t(strOptString);
        if (lT != null) {
            return lT.longValue();
        }
        return 0L;
    }

    @Override // com.ironsource.InterfaceC3728u5
    public boolean c() {
        return k().optBoolean(C3745v5.f31451f, true);
    }

    @Override // com.ironsource.InterfaceC3728u5
    public long d() {
        String strOptString = k().optString(C3745v5.f31449d);
        ck.p.i(strOptString, "traits.optString(LPM_DEL…_TIME_AFTER_INIT_PROCESS)");
        Long lT = lk.w.t(strOptString);
        if (lT != null) {
            return lT.longValue();
        }
        return 2000L;
    }

    @Override // com.ironsource.InterfaceC3728u5
    public boolean e() {
        return k().optBoolean(C3745v5.f31454i, false);
    }

    @Override // com.ironsource.InterfaceC3728u5
    public boolean f() {
        return k().optBoolean(C3745v5.f31455j, false);
    }

    @Override // com.ironsource.InterfaceC3728u5
    public boolean g() {
        return k().optBoolean(C3745v5.f31452g, false);
    }

    @Override // com.ironsource.InterfaceC3728u5
    public boolean h() {
        String strOptString = k().optString(C3745v5.f31446a);
        ck.p.i(strOptString, "traits.optString(IS_EP_CONFIG_ENABLED)");
        String lowerCase = strOptString.toLowerCase(Locale.ROOT);
        ck.p.i(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return ck.p.e(lowerCase, "true");
    }

    @Override // com.ironsource.InterfaceC3728u5
    public int i() {
        String strOptString = k().optString(C3745v5.f31447b);
        ck.p.i(strOptString, "traits.optString(ISN_CTRL_INIT_DELAY)");
        Integer numR = lk.w.r(strOptString);
        if (numR != null) {
            return numR.intValue();
        }
        return 0;
    }

    @Override // com.ironsource.InterfaceC3728u5
    public boolean j() {
        return k().optBoolean(C3745v5.f31453h, false);
    }
}
