package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: loaded from: classes7.dex */
public final class Ee implements M8, M8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Fe f26474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3771we f26475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3710t4 f26476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f26477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f26478e;

    public Ee(Fe fe2, InterfaceC3771we interfaceC3771we, InterfaceC3710t4 interfaceC3710t4) {
        ck.p.j(fe2, C3426d4.a.f28418k);
        ck.p.j(interfaceC3771we, "initResponseStorage");
        ck.p.j(interfaceC3710t4, "currentTimeProvider");
        this.f26474a = fe2;
        this.f26475b = interfaceC3771we;
        this.f26476c = interfaceC3710t4;
        this.f26477d = -1;
        this.f26478e = -1L;
    }

    private final int b(Context context, Fe fe2) {
        int iB = fe2.b(context, 0) + 1;
        fe2.a(context, iB);
        return iB;
    }

    @Override // com.ironsource.M8.a
    public void a(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        this.f26477d = b(context, this.f26474a);
        this.f26478e = a(context, this.f26474a);
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26479a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f26480b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f26481c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f26482d = -1;

        private a() {
        }
    }

    @Override // com.ironsource.M8
    public int c() {
        return this.f26477d;
    }

    private final long a(Context context, Fe fe2) {
        long jA = fe2.a(context, -1L);
        if (this.f26475b.a(context) || jA != -1) {
            return jA;
        }
        long jA2 = this.f26476c.a();
        IronLog.INTERNAL.verbose("set first session timestamp = " + jA2);
        fe2.b(context, jA2);
        return jA2;
    }

    @Override // com.ironsource.M8
    public String b() {
        String strD = IronSourceUtils.d();
        ck.p.i(strD, "getSessionId()");
        return strD;
    }

    public /* synthetic */ Ee(Fe fe2, InterfaceC3771we interfaceC3771we, InterfaceC3710t4 interfaceC3710t4, int i10, ck.i iVar) {
        this(fe2, (i10 & 2) != 0 ? new C3788xe() : interfaceC3771we, (i10 & 4) != 0 ? new InterfaceC3710t4.a() : interfaceC3710t4);
    }

    @Override // com.ironsource.M8
    public long a() {
        return this.f26478e;
    }
}
