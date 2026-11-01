package com.fyber.inneractive.sdk.measurement;

import android.content.Context;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.network.v0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.Omid;
import com.iab.omid.library.fyber.adsession.Partner;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f15809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Partner f15810e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15806a = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.measurement.tracker.f f15811f = new com.fyber.inneractive.sdk.measurement.tracker.f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f15812g = new a(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f15813h = new b(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f15814i = new c(this);

    public static void a(e eVar, Context context) {
        eVar.getClass();
        a(context, "https://cdn2.inner-active.mobi/client/ia-js-tags/omsdk/" + Omid.getVersion() + ".js", "omid-latest.js", eVar.f15812g);
        a(context, "https://cdn2.inner-active.mobi/client/ia-js-tags/omsdk/omid-session-client-" + Omid.getVersion() + ".js", "omid-session-client-latest.js", eVar.f15813h);
        a(context, "https://cdn2.inner-active.mobi/client/ia-js-tags/omsdk/dt-omsdk-mraid-video-tracker.js", "dt-omsdk-mraid-video-tracker.js", eVar.f15814i);
    }

    public static void a(Context context, String str, String str2, f0 f0Var) {
        IAlog.d("%s- Loading URL: %s", IAlog.a(e.class), str);
        IAConfigManager.O.f15024s.a(new v0(f0Var, context, new com.fyber.inneractive.sdk.cache.f(str, str2)));
    }
}
