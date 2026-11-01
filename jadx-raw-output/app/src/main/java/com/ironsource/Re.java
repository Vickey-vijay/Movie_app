package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C3428d6 f27556a;

    public final class a extends Qe {
        @Override // com.ironsource.Qe, java.lang.Runnable
        public void run() {
            JSONObject jSONObjectB = IronSourceUtils.b(false);
            try {
                jSONObjectB.put("duration", a());
            } catch (JSONException e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
            C3435dd.P.a(new C5(D5.APP_ENTER_BACKGROUND, jSONObjectB));
        }

        public a() {
        }
    }

    public final void a(InterfaceC3628o7 interfaceC3628o7) {
        ck.p.j(interfaceC3628o7, "applicationLifecycleService");
        this.f27556a = new C3428d6(interfaceC3628o7, new a());
    }
}
