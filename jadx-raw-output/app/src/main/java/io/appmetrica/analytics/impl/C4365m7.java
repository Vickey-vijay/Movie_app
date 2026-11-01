package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4365m7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f57253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f57254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f57255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f57256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f57257g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f57258h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f57259i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f57260j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f57261k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f57262l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f57263m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f57264n;

    public C4365m7(C4215gb c4215gb) {
        this.f57251a = c4215gb.b("dId");
        this.f57252b = c4215gb.b("uId");
        this.f57253c = c4215gb.b("analyticsSdkVersionName");
        this.f57254d = c4215gb.b("kitBuildNumber");
        this.f57255e = c4215gb.b("kitBuildType");
        this.f57256f = c4215gb.b("appVer");
        this.f57257g = c4215gb.optString("app_debuggable", "0");
        this.f57258h = c4215gb.b("appBuild");
        this.f57259i = c4215gb.b("osVer");
        this.f57261k = c4215gb.b(com.ironsource.Q6.f27460q);
        this.f57262l = c4215gb.b("root");
        this.f57263m = c4215gb.optString(CommonUrlParts.APP_FRAMEWORK, FrameworkDetector.framework());
        int iOptInt = c4215gb.optInt("osApiLev", -1);
        this.f57260j = iOptInt == -1 ? null : String.valueOf(iOptInt);
        int iOptInt2 = c4215gb.optInt("attribution_id", 0);
        this.f57264n = iOptInt2 > 0 ? String.valueOf(iOptInt2) : null;
    }

    public final String toString() {
        return "DbNetworkTaskConfig{deviceId='" + this.f57251a + "', uuid='" + this.f57252b + "', analyticsSdkVersionName='" + this.f57253c + "', kitBuildNumber='" + this.f57254d + "', kitBuildType='" + this.f57255e + "', appVersion='" + this.f57256f + "', appDebuggable='" + this.f57257g + "', appBuildNumber='" + this.f57258h + "', osVersion='" + this.f57259i + "', osApiLevel='" + this.f57260j + "', locale='" + this.f57261k + "', deviceRootStatus='" + this.f57262l + "', appFramework='" + this.f57263m + "', attributionId='" + this.f57264n + "'}";
    }

    public C4365m7() {
        this.f57251a = null;
        this.f57252b = null;
        this.f57253c = null;
        this.f57254d = null;
        this.f57255e = null;
        this.f57256f = null;
        this.f57257g = null;
        this.f57258h = null;
        this.f57259i = null;
        this.f57260j = null;
        this.f57261k = null;
        this.f57262l = null;
        this.f57263m = null;
        this.f57264n = null;
    }
}
