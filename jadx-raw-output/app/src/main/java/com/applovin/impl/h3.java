package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class h3 extends y2 {
    public float j0() {
        return a("viewability_min_alpha", ((Float) this.f7799a.a(x4.f10063w1)).floatValue() / 100.0f);
    }

    public int k0() {
        return a("viewability_min_pixels", -1);
    }

    public float m0() {
        return a("viewability_min_percentage_dp", -1.0f);
    }

    public float n0() {
        return a("viewability_min_percentage_pixels", -1.0f);
    }

    public long o0() {
        return a("viewability_timer_min_visible_ms", ((Long) this.f7799a.a(x4.f10071x1)).longValue());
    }

    public h3(a3 a3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.h hVar, com.applovin.impl.sdk.k kVar) {
        super(a3Var, jSONObject, jSONObject2, hVar, kVar);
    }

    public int l0() {
        x4 x4Var;
        MaxAdFormat format = getFormat();
        if (format == MaxAdFormat.BANNER) {
            x4Var = x4.f10007p1;
        } else if (format == MaxAdFormat.MREC) {
            x4Var = x4.f10023r1;
        } else if (format == MaxAdFormat.LEADER) {
            x4Var = x4.f10039t1;
        } else if (format == MaxAdFormat.NATIVE) {
            x4Var = x4.f10055v1;
        } else {
            x4Var = null;
        }
        if (x4Var != null) {
            return a("viewability_min_height", ((Integer) this.f7799a.a(x4Var)).intValue());
        }
        return 0;
    }

    public int p0() {
        x4 x4Var;
        MaxAdFormat format = getFormat();
        if (format == MaxAdFormat.BANNER) {
            x4Var = x4.f9999o1;
        } else if (format == MaxAdFormat.MREC) {
            x4Var = x4.f10015q1;
        } else if (format == MaxAdFormat.LEADER) {
            x4Var = x4.f10031s1;
        } else if (format == MaxAdFormat.NATIVE) {
            x4Var = x4.f10047u1;
        } else {
            x4Var = null;
        }
        if (x4Var != null) {
            return a("viewability_min_width", ((Integer) this.f7799a.a(x4Var)).intValue());
        }
        return 0;
    }

    public boolean q0() {
        if (k0() < 0 && m0() < 0.0f && n0() < 0.0f) {
            return false;
        }
        return true;
    }
}
