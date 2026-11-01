package com.ironsource;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class Ae implements Dc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ae f25944a = new Ae();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final De f25945b = new De();

    public static final class a implements InterfaceC3686re {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3686re f25946a;

        @Override // com.ironsource.InterfaceC3686re
        public void a(final C3579le c3579le) {
            ck.p.j(c3579le, "sdkConfig");
            De de2 = Ae.f25945b;
            final InterfaceC3686re interfaceC3686re = this.f25946a;
            de2.a(new Runnable() { // from class: com.ironsource.rh
                @Override // java.lang.Runnable
                public final void run() {
                    Ae.a.a(c3579le, interfaceC3686re);
                }
            });
        }

        public a(InterfaceC3686re interfaceC3686re) {
            this.f25946a = interfaceC3686re;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C3579le c3579le, InterfaceC3686re interfaceC3686re) {
            ck.p.j(c3579le, "$sdkConfig");
            ck.p.j(interfaceC3686re, "$listener");
            Ae.f25944a.a(c3579le, interfaceC3686re);
        }

        @Override // com.ironsource.InterfaceC3686re
        public void a(final C3617ne c3617ne) {
            ck.p.j(c3617ne, "error");
            De de2 = Ae.f25945b;
            final InterfaceC3686re interfaceC3686re = this.f25946a;
            de2.d(new Runnable() { // from class: com.ironsource.qh
                @Override // java.lang.Runnable
                public final void run() {
                    Ae.a.a(interfaceC3686re, c3617ne);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(InterfaceC3686re interfaceC3686re, C3617ne c3617ne) {
            ck.p.j(interfaceC3686re, "$listener");
            ck.p.j(c3617ne, "$error");
            interfaceC3686re.a(c3617ne);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, C3720te c3720te, InterfaceC3686re interfaceC3686re) {
        ck.p.j(context, "$context");
        ck.p.j(c3720te, "$initRequest");
        ck.p.j(interfaceC3686re, "$listener");
        new X9().a(EnumC3703se.LEVEL_PLAY_INIT);
        f25944a.a(context, c3720te, interfaceC3686re, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Context context, C3720te c3720te, InterfaceC3686re interfaceC3686re) {
        ck.p.j(context, "$context");
        ck.p.j(c3720te, "$initRequest");
        ck.p.j(interfaceC3686re, "$listener");
        com.ironsource.mediationsdk.r rVarM = com.ironsource.mediationsdk.r.m();
        String strD = c3720te.d();
        IronSource.a[] aVarArr = (IronSource.a[]) c3720te.e().toArray(new IronSource.a[0]);
        List<IronSource.a> listA = rVarM.a(context, strD, false, (IronSource.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        ck.p.i(listA, "validAdUnitsList");
        c3720te.a(listA);
        new X9().a(EnumC3703se.EXTERNAL_MEDIATION_INIT);
        f25944a.a(context, c3720te, interfaceC3686re, true);
    }

    public final void c(final Context context, final C3720te c3720te, final InterfaceC3686re interfaceC3686re) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(c3720te, "initRequest");
        ck.p.j(interfaceC3686re, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        f25945b.c(new Runnable() { // from class: com.ironsource.lh
            @Override // java.lang.Runnable
            public final void run() {
                Ae.d(context, c3720te, interfaceC3686re);
            }
        });
    }

    @Override // com.ironsource.Dc
    public void onInitFailed(final IronSourceError ironSourceError) {
        ck.p.j(ironSourceError, "error");
        f25945b.a(new Runnable() { // from class: com.ironsource.mh
            @Override // java.lang.Runnable
            public final void run() {
                Ae.a(ironSourceError);
            }
        });
    }

    private Ae() {
    }

    public final void a(final Context context, final C3720te c3720te, final InterfaceC3686re interfaceC3686re) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(c3720te, "initRequest");
        ck.p.j(interfaceC3686re, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        f25945b.c(new Runnable() { // from class: com.ironsource.jh
            @Override // java.lang.Runnable
            public final void run() {
                Ae.b(context, c3720te, interfaceC3686re);
            }
        });
    }

    private final void a(Context context, C3720te c3720te, final InterfaceC3686re interfaceC3686re, boolean z10) {
        String strF = c3720te.f();
        if (strF != null && strF.length() > 0) {
            com.ironsource.mediationsdk.r.m().o(c3720te.f());
        } else {
            c3720te = new C3720te(c3720te.d(), com.ironsource.mediationsdk.r.m().o(), nj.b0.R0(c3720te.e()));
        }
        com.ironsource.mediationsdk.r rVarM = com.ironsource.mediationsdk.r.m();
        String strD = c3720te.d();
        IronSource.a[] aVarArr = (IronSource.a[]) c3720te.e().toArray(new IronSource.a[0]);
        final IronSourceError ironSourceErrorA = rVarM.a(context, strD, z10, this, (IronSource.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        if (ironSourceErrorA != null && ironSourceErrorA.getErrorCode() != 2020) {
            if (ironSourceErrorA.getErrorCode() == 2040) {
                Ne neH = com.ironsource.mediationsdk.r.m().h();
                if (neH != null) {
                    a(new C3579le(new C3737ue(neH)), interfaceC3686re);
                    return;
                }
            } else if (ironSourceErrorA.getErrorCode() == 2030) {
                C3822ze.f31734a.e();
                return;
            }
            f25945b.d(new Runnable() { // from class: com.ironsource.nh
                @Override // java.lang.Runnable
                public final void run() {
                    Ae.a(interfaceC3686re, ironSourceErrorA);
                }
            });
            return;
        }
        C3822ze.f31734a.a(context, c3720te, new a(interfaceC3686re));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ne ne2) {
        ck.p.j(ne2, "$serverResponse");
        C3822ze.f31734a.a(new C3737ue(ne2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC3686re interfaceC3686re, IronSourceError ironSourceError) {
        ck.p.j(interfaceC3686re, "$listener");
        ck.p.i(ironSourceError, "error");
        interfaceC3686re.a(new C3617ne(ironSourceError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final C3579le c3579le, final InterfaceC3686re interfaceC3686re) {
        if (!com.ironsource.mediationsdk.r.m().a(false, c3579le.d())) {
            f25945b.d(new Runnable() { // from class: com.ironsource.oh
                @Override // java.lang.Runnable
                public final void run() {
                    Ae.a(interfaceC3686re);
                }
            });
        } else {
            f25945b.d(new Runnable() { // from class: com.ironsource.ph
                @Override // java.lang.Runnable
                public final void run() {
                    Ae.a(interfaceC3686re, c3579le);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC3686re interfaceC3686re) {
        ck.p.j(interfaceC3686re, "$listener");
        interfaceC3686re.a(new C3617ne(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "An unknown error has occurred"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC3686re interfaceC3686re, C3579le c3579le) {
        ck.p.j(interfaceC3686re, "$listener");
        ck.p.j(c3579le, "$sdkInitResponse");
        interfaceC3686re.a(c3579le);
    }

    @Override // com.ironsource.Dc
    public void a(final Ne ne2) {
        ck.p.j(ne2, "serverResponse");
        f25945b.a(new Runnable() { // from class: com.ironsource.kh
            @Override // java.lang.Runnable
            public final void run() {
                Ae.b(ne2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError ironSourceError) {
        ck.p.j(ironSourceError, "$error");
        C3822ze.f31734a.b(new C3617ne(ironSourceError));
    }
}
