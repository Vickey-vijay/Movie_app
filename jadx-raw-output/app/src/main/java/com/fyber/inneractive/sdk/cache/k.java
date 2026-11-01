package com.fyber.inneractive.sdk.cache;

import android.app.Application;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.s;
import com.fyber.inneractive.sdk.network.v0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f14932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f14935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f14936e;

    public final void a() {
        if (TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - this.f14932a) >= 60) {
            IAConfigManager iAConfigManager = IAConfigManager.O;
            if (iAConfigManager.f15026u.f15195b.a(false, "use_js_inline")) {
                Application application = o.f18599a;
                if (application == null) {
                    IAlog.f("fetchJS() failed context null", new Object[0]);
                    return;
                }
                this.f14932a = System.currentTimeMillis();
                v0 v0Var = new v0(new g(this), application, new f("https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js", "dt-mraid-video-controller.js"));
                IAlog.d("%s- Loading URL: %s", IAlog.a(this), "https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js");
                iAConfigManager.f15024s.a(v0Var);
                iAConfigManager.f15024s.a(new v0(new h(this), application, new f("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css", "centering_v1.css")));
                iAConfigManager.f15024s.a(new v0(new i(this), application, new f("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js", "centering_v1.js")));
                s sVar = iAConfigManager.f15026u;
                if (sVar == null || !sVar.f15195b.a(false, "dt_plbl")) {
                    return;
                }
                iAConfigManager.f15024s.a(new v0(new j(this), application, new f("https://cdn2.inner-active.mobi/client/ia-js-tags/playable_detect.js", "playable_detect.js")));
            }
        }
    }
}
