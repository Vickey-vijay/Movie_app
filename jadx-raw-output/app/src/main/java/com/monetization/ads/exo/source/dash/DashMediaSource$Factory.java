package com.monetization.ads.exo.source.dash;

import java.util.List;
import yads.a30;
import yads.ae0;
import yads.e30;
import yads.ev0;
import yads.fm1;
import yads.hc0;
import yads.hd0;
import yads.kc0;
import yads.mo;
import yads.ni;
import yads.o30;
import yads.xm1;

/* JADX INFO: loaded from: classes2.dex */
public final class DashMediaSource$Factory implements xm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a30 f42909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o30 f42910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private hd0 f42911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final hc0 f42912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ae0 f42913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f42914f;

    public DashMediaSource$Factory(o30 o30Var) {
        this(new kc0(o30Var), o30Var);
    }

    @Override // yads.xm1
    public final mo a(fm1 fm1Var) {
        fm1Var.f77444c.getClass();
        e30 e30Var = new e30();
        List list = fm1Var.f77444c.f85475d;
        return new i(fm1Var, this.f42910b, !list.isEmpty() ? new ev0(e30Var, list) : e30Var, this.f42909a, this.f42912d, this.f42911c.a(fm1Var), this.f42913e, this.f42914f);
    }

    public DashMediaSource$Factory(kc0 kc0Var, o30 o30Var) {
        this.f42909a = (a30) ni.a(kc0Var);
        this.f42910b = o30Var;
        this.f42911c = new hd0();
        this.f42913e = new ae0();
        this.f42914f = 30000L;
        this.f42912d = new hc0();
    }

    @Override // yads.xm1
    public final xm1 a(hd0 hd0Var) {
        if (hd0Var != null) {
            this.f42911c = hd0Var;
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
    }

    @Override // yads.xm1
    public final xm1 a(ae0 ae0Var) {
        if (ae0Var != null) {
            this.f42913e = ae0Var;
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
    }
}
