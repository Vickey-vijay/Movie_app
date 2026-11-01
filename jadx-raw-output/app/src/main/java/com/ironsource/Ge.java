package com.ironsource;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: loaded from: classes5.dex */
public final class Ge implements Fe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final N8 f26677a;

    /* JADX WARN: Multi-variable type inference failed */
    public Ge() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.He
    public void a(Context context, int i10) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        this.f26677a.a(context, a.f26679b, i10);
    }

    @Override // com.ironsource.He
    public int b(Context context, int i10) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        return this.f26677a.b(context, a.f26679b, i10);
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26678a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f26679b = "sessionNumber";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f26680c = "firstSessionTimestamp";

        private a() {
        }
    }

    public Ge(N8 n10) {
        ck.p.j(n10, "sdkSharedPref");
        this.f26677a = n10;
    }

    @Override // com.ironsource.InterfaceC3635oe
    public long a(Context context, long j10) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        return this.f26677a.b(context, "firstSessionTimestamp", j10);
    }

    @Override // com.ironsource.InterfaceC3635oe
    public void b(Context context, long j10) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        this.f26677a.a(context, "firstSessionTimestamp", j10);
    }

    public /* synthetic */ Ge(N8 n10, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? new Ie() : n10);
    }
}
