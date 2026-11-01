package com.ironsource.sdk.controller;

import com.ironsource.C3374a6;
import com.ironsource.C3676r4;
import com.ironsource.C3682ra;
import com.ironsource.C3699sa;
import com.ironsource.C3731u8;
import com.ironsource.C8;
import com.ironsource.InterfaceC3666qa;
import com.ironsource.Oc;
import com.ironsource.Y5;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3374a6 f30958b;

    public class a implements Oc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C3699sa f30959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C3682ra f30960b;

        @Override // com.ironsource.Oc
        public void a(C8 c10) {
            try {
                C3699sa c3699sa = this.f30959a;
                C3682ra c3682ra = this.f30960b;
                c3699sa.b(c3682ra, j.this.a(c3682ra, c10.a()));
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        public a(C3699sa c3699sa, C3682ra c3682ra) {
            this.f30959a = c3699sa;
            this.f30960b = c3682ra;
        }

        @Override // com.ironsource.Oc
        public void a(C8 c10, C3731u8 c3731u8) {
            try {
                C3699sa c3699sa = this.f30959a;
                C3682ra c3682ra = this.f30960b;
                c3699sa.a(c3682ra, j.this.a(c3682ra, c3731u8.b()));
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
    }

    private C8 b(JSONObject jSONObject, String str) throws Exception {
        if (!jSONObject.has(Y5.c.f27929c) || !jSONObject.has(Y5.c.f27928b)) {
            throw new Exception(Y5.a.f27913a);
        }
        String string = jSONObject.getString(Y5.c.f27929c);
        return new C8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, string), jSONObject.getString(Y5.c.f27928b));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(JSONObject jSONObject, InterfaceC3666qa interfaceC3666qa) {
        C3682ra c3682ra = new C3682ra(jSONObject);
        C3699sa c3699sa = new C3699sa(interfaceC3666qa);
        try {
            String strB = c3682ra.b();
            JSONObject jSONObjectC = c3682ra.c();
            C8 c8B = b(jSONObjectC, this.f30957a);
            IronSourceStorageUtils.ensurePathSafety(c8B, this.f30957a);
            byte b10 = -1;
            switch (strB.hashCode()) {
                case -2073025383:
                    if (strB.equals(Y5.b.f27921a)) {
                        b10 = 0;
                    }
                    break;
                case -1137024519:
                    if (strB.equals(Y5.b.f27923c)) {
                        b10 = 2;
                    }
                    break;
                case -318115535:
                    if (strB.equals(Y5.b.f27925e)) {
                        b10 = 4;
                    }
                    break;
                case 537556755:
                    if (strB.equals(Y5.b.f27926f)) {
                        b10 = 5;
                    }
                    break;
                case 1764172231:
                    if (strB.equals(Y5.b.f27922b)) {
                        b10 = 1;
                    }
                    break;
                case 1953259713:
                    if (strB.equals(Y5.b.f27924d)) {
                        b10 = 3;
                    }
                    break;
            }
            if (b10 == 0) {
                this.f30958b.a(c8B, jSONObjectC.optString(Y5.c.f27927a), jSONObjectC.optInt("connectionTimeout"), jSONObjectC.optInt("readTimeout"), a(c3682ra, c3699sa));
                return;
            }
            if (b10 == 1) {
                this.f30958b.a(c8B);
                c3699sa.b(c3682ra, a(c3682ra, c8B.a()));
                return;
            }
            if (b10 == 2) {
                this.f30958b.b(c8B);
                c3699sa.b(c3682ra, a(c3682ra, c8B.a()));
                return;
            }
            if (b10 == 3) {
                c3699sa.b(c3682ra, a(c3682ra, this.f30958b.c(c8B)));
                return;
            }
            if (b10 == 4) {
                c3699sa.b(c3682ra, a(c3682ra, this.f30958b.d(c8B)));
            } else {
                if (b10 != 5) {
                    return;
                }
                this.f30958b.a(c8B, jSONObjectC.optJSONObject(Y5.c.f27933g));
                c3699sa.b(c3682ra, a(c3682ra, c8B.a()));
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            c3699sa.a(c3682ra, a(c3682ra, e10.getMessage()));
        }
    }

    public j(String str, C3374a6 c3374a6) {
        this.f30957a = str;
        this.f30958b = c3374a6;
    }

    private Oc a(C3682ra c3682ra, C3699sa c3699sa) {
        return new a(c3699sa, c3682ra);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(C3682ra c3682ra, JSONObject jSONObject) {
        try {
            return c3682ra.e().put("result", jSONObject);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return IronSourceVideoBridge.jsonObjectInit();
        }
    }

    private JSONObject a(C3682ra c3682ra, long j10) {
        try {
            return c3682ra.e().put("result", j10);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return IronSourceVideoBridge.jsonObjectInit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(C3682ra c3682ra, String str) {
        try {
            return c3682ra.e().put("errMsg", str);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return IronSourceVideoBridge.jsonObjectInit();
        }
    }

    private C8 a(JSONObject jSONObject, String str) throws Exception {
        if (jSONObject.has(Y5.c.f27930d)) {
            return new C8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, jSONObject.getString(Y5.c.f27930d)));
        }
        throw new Exception(Y5.a.f27914b);
    }
}
