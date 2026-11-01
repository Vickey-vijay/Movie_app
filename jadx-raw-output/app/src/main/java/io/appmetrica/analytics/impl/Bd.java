package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Bd implements InterfaceC4202fo, InterfaceC4283j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final to f55024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final K2 f55025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PublicLogger f55026e = PublicLogger.getAnonymousInstance();

    @NonNull
    public final C4228go a() {
        C4228go c4228go = new C4228go();
        c4228go.f56866b = this.f55023b;
        c4228go.f56865a = this.f55022a.getBytes();
        c4228go.f56868d = new C4279io();
        c4228go.f56867c = new C4254ho();
        return c4228go;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4202fo
    public abstract /* synthetic */ void a(@NonNull C4176eo c4176eo);

    @NonNull
    public final K2 b() {
        return this.f55025d;
    }

    @NonNull
    public final String c() {
        return this.f55022a;
    }

    @NonNull
    @VisibleForTesting
    public final to d() {
        return this.f55024c;
    }

    public final int e() {
        return this.f55023b;
    }

    public final boolean f() {
        ro roVarA = this.f55024c.a(this.f55022a);
        if (roVarA.f57616a) {
            return true;
        }
        this.f55026e.warning("Attribute " + this.f55022a + " of type " + ((String) Pn.f55760a.get(this.f55023b)) + " is skipped because " + roVarA.f57617b, new Object[0]);
        return false;
    }

    public Bd(int i10, String str, to toVar, K2 k10) {
        this.f55023b = i10;
        this.f55022a = str;
        this.f55024c = toVar;
        this.f55025d = k10;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4202fo
    public final void a(@NonNull PublicLogger publicLogger) {
        this.f55026e = publicLogger;
    }
}
