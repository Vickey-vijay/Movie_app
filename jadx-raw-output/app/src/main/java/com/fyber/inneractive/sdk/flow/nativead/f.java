package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements com.fyber.inneractive.sdk.flow.nativead.mainasset.c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f15486m = IAlog.a(f.class);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f15487n = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.nativead.i f15490c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t0 f15492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f15493f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InneractiveAdRequest f15495h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f15496i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f15497j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.nativead.j f15498k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f15488a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f15489b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f15491d = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f15494g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f15499l = new e(this);

    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError, String str) {
        IAlog.f("%sonMainAssetLoadFailed: %s", f15486m, str != null ? "Failed to load native main media with message ".concat(str) : "Failed to load native main media");
        for (c cVar : this.f15488a) {
            if (cVar.a()) {
                cVar.destroy();
            }
        }
        String strDescription = inneractiveInfrastructureError.description();
        if (this.f15494g.compareAndSet(false, true)) {
            InneractiveInfrastructureError inneractiveInfrastructureError2 = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, com.fyber.inneractive.sdk.flow.i.NATIVE_AD_EMPTY_CONTENT);
            inneractiveInfrastructureError2.setCause(new com.fyber.inneractive.sdk.flow.nativead.mainasset.a(strDescription));
            d dVar = this.f15493f;
            dVar.getClass();
            com.fyber.inneractive.sdk.util.r.f18606a.execute(new com.fyber.inneractive.sdk.flow.e(new com.fyber.inneractive.sdk.flow.f(dVar.f15464b, dVar.f15463a, "send_failed_native_creatives", dVar.f15469g.b()), inneractiveInfrastructureError2));
            dVar.b(inneractiveInfrastructureError2);
        }
    }

    public f(com.fyber.inneractive.sdk.config.global.r rVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.nativead.j jVar, com.fyber.inneractive.sdk.response.nativead.i iVar, d dVar, String str) {
        this.f15496i = rVar;
        this.f15498k = jVar;
        this.f15495h = inneractiveAdRequest;
        this.f15490c = iVar;
        this.f15493f = dVar;
        this.f15497j = str;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x02e3 */
    /* JADX WARN: Code duplicated, block: B:126:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.nativead.f.a():void");
    }
}
