package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class q5 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.e f8860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppLovinPostbackListener f8861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d6.b f8862i;

    public class a implements AppLovinPostbackListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i10) {
            q5.this.e();
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            if (q5.this.f8861h != null) {
                q5.this.f8861h.onPostbackSuccess(q5.this.f8860g.f());
            }
        }
    }

    public class b extends l6 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f8864m;

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, Object obj, int i10) {
            if (obj instanceof String) {
                for (String str2 : this.f7705a.c(x4.f9946i0)) {
                    if (str2.startsWith(str2)) {
                        String str3 = (String) obj;
                        if (TextUtils.isEmpty(str3)) {
                            continue;
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(str3);
                                r0.c(jSONObject, this.f7705a);
                                r0.b(jSONObject, this.f7705a);
                                r0.a(jSONObject, this.f7705a);
                                break;
                            } catch (JSONException unused) {
                                continue;
                            }
                        }
                    }
                }
            }
            if (q5.this.f8861h != null) {
                q5.this.f8861h.onPostbackSuccess(this.f8864m);
            }
            if (q5.this.f8860g.t()) {
                this.f7705a.t().a(q5.this.f8860g.s(), this.f8864m, i10, obj, null, true);
            }
        }

        public b(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
            this.f8864m = q5.this.f8860g.f();
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, Object obj) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.b(this.f7706b, "Failed to dispatch postback. Error code: " + i10 + " URL: " + this.f8864m);
            }
            if (q5.this.f8861h != null) {
                q5.this.f8861h.onPostbackFailure(this.f8864m, i10);
            }
            if (q5.this.f8860g.t()) {
                this.f7705a.t().a(q5.this.f8860g.s(), this.f8864m, i10, obj, str2, false);
            }
        }
    }

    public q5(com.applovin.impl.sdk.network.e eVar, d6.b bVar, com.applovin.impl.sdk.k kVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", kVar);
        if (eVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.f8860g = eVar;
        this.f8861h = appLovinPostbackListener;
        this.f8862i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        b bVar = new b(this.f8860g, b());
        bVar.a(this.f8862i);
        b().q0().a(bVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (StringUtils.isValidString(this.f8860g.f())) {
            if (this.f8860g.u()) {
                b().x0().a(this.f8860g, new a());
                return;
            } else {
                e();
                return;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.d(this.f7706b, "Requested URL is not valid; nothing to do...");
        }
        AppLovinPostbackListener appLovinPostbackListener = this.f8861h;
        if (appLovinPostbackListener != null) {
            appLovinPostbackListener.onPostbackFailure(this.f8860g.f(), AppLovinErrorCodes.INVALID_URL);
        }
    }
}
