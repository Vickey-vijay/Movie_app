package com.google.android.exoplayer2.upstream;

import android.content.Context;
import androidx.annotation.Nullable;
import e5.q;

/* JADX INFO: compiled from: DefaultDataSourceFactory.java */
/* JADX INFO: loaded from: classes11.dex */
public final class c implements a.InterfaceC0188a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final q f20107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a.InterfaceC0188a f20108c;

    public c(Context context, String str) {
        this(context, str, (q) null);
    }

    public c(Context context, String str, @Nullable q qVar) {
        this(context, qVar, new e(str, qVar));
    }

    @Override // com.google.android.exoplayer2.upstream.a.InterfaceC0188a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b createDataSource() {
        b bVar = new b(this.f20106a, this.f20108c.createDataSource());
        q qVar = this.f20107b;
        if (qVar != null) {
            bVar.b(qVar);
        }
        return bVar;
    }

    public c(Context context, a.InterfaceC0188a interfaceC0188a) {
        this(context, (q) null, interfaceC0188a);
    }

    public c(Context context, @Nullable q qVar, a.InterfaceC0188a interfaceC0188a) {
        this.f20106a = context.getApplicationContext();
        this.f20107b = qVar;
        this.f20108c = interfaceC0188a;
    }
}
