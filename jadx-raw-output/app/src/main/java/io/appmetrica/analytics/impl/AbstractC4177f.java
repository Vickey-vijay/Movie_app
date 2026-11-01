package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4177f implements InterfaceC4208g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f56702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cg f56703b;

    @Override // io.appmetrica.analytics.impl.InterfaceC4208g4
    public final void a(@NonNull Q5 q10, @NonNull C4462q4 c4462q4) {
        b(q10, c4462q4);
    }

    public abstract void b(@NonNull Q5 q10, @NonNull C4462q4 c4462q4);

    @Override // io.appmetrica.analytics.impl.InterfaceC4208g4
    public final void a() {
        this.f56703b.b(this);
        C4418oa.I.m().a(this);
    }

    @NonNull
    public final Cg b() {
        return this.f56703b;
    }

    @NonNull
    public final Context c() {
        return this.f56702a;
    }

    public AbstractC4177f(@NonNull Context context, @NonNull Cg cg2) {
        this.f56702a = context.getApplicationContext();
        this.f56703b = cg2;
        cg2.a(this);
        C4418oa.k().n().b(this);
    }
}
