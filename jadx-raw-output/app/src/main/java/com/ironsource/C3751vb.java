package com.ironsource;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayConfiguration;
import com.unity3d.mediation.LevelPlayInitError;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.mediation.LevelPlayInitRequest;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.segment.LevelPlaySegment;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.vb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3751vb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3751vb f31458a = new C3751vb();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C3768wb f31459b = new C3768wb();

    /* JADX INFO: renamed from: com.ironsource.vb$a */
    public static final class a implements InterfaceC3686re {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LevelPlayInitRequest f31460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f31461b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C3570l5 f31462c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LevelPlayInitListener f31463d;

        @Override // com.ironsource.InterfaceC3686re
        public void a(final C3579le c3579le) {
            ck.p.j(c3579le, "sdkConfig");
            C3768wb c3768wb = C3751vb.f31459b;
            final LevelPlayInitRequest levelPlayInitRequest = this.f31460a;
            final Context context = this.f31461b;
            final C3570l5 c3570l5 = this.f31462c;
            final LevelPlayInitListener levelPlayInitListener = this.f31463d;
            c3768wb.a(new Runnable() { // from class: com.ironsource.em
                @Override // java.lang.Runnable
                public final void run() {
                    C3751vb.a.a(levelPlayInitRequest, c3579le, context, c3570l5, levelPlayInitListener);
                }
            });
        }

        public a(LevelPlayInitRequest levelPlayInitRequest, Context context, C3570l5 c3570l5, LevelPlayInitListener levelPlayInitListener) {
            this.f31460a = levelPlayInitRequest;
            this.f31461b = context;
            this.f31462c = c3570l5;
            this.f31463d = levelPlayInitListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(LevelPlayInitRequest levelPlayInitRequest, C3579le c3579le, Context context, C3570l5 c3570l5, LevelPlayInitListener levelPlayInitListener) {
            ck.p.j(levelPlayInitRequest, "$initRequest");
            ck.p.j(c3579le, "$sdkConfig");
            ck.p.j(context, "$context");
            ck.p.j(c3570l5, "$initDuration");
            C3751vb.f31458a.a(levelPlayInitRequest, c3579le, context, c3570l5, levelPlayInitListener);
        }

        @Override // com.ironsource.InterfaceC3686re
        public void a(final C3617ne c3617ne) {
            ck.p.j(c3617ne, "error");
            C3768wb c3768wb = C3751vb.f31459b;
            final LevelPlayInitListener levelPlayInitListener = this.f31463d;
            final C3570l5 c3570l5 = this.f31462c;
            c3768wb.a(new Runnable() { // from class: com.ironsource.fm
                @Override // java.lang.Runnable
                public final void run() {
                    C3751vb.a.a(levelPlayInitListener, c3570l5, c3617ne);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(LevelPlayInitListener levelPlayInitListener, C3570l5 c3570l5, C3617ne c3617ne) {
            ck.p.j(c3570l5, "$initDuration");
            ck.p.j(c3617ne, "$error");
            C3751vb.f31458a.a(levelPlayInitListener, c3570l5, c3617ne);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.vb$b */
    public static final class b extends Lambda implements bk.a<mj.r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C3379ab f31464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C3570l5 f31465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f31466c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LevelPlayInitListener f31467d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3379ab c3379ab, C3570l5 c3570l5, long j10, LevelPlayInitListener levelPlayInitListener) {
            super(0);
            this.f31464a = c3379ab;
            this.f31465b = c3570l5;
            this.f31466c = j10;
            this.f31467d = levelPlayInitListener;
        }

        public final void a() {
            C3751vb.f31458a.a(this.f31464a, this.f31465b, this.f31466c, this.f31467d);
        }

        @Override // bk.a
        public /* bridge */ /* synthetic */ mj.r invoke() {
            a();
            return mj.r.f64562a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.vb$c */
    public static final class c extends Lambda implements bk.a<mj.r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f31468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<String> f31469b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, List<String> list) {
            super(0);
            this.f31468a = str;
            this.f31469b = list;
        }

        public final void a() {
            com.ironsource.mediationsdk.r.m().a(this.f31468a, this.f31469b);
        }

        @Override // bk.a
        public /* bridge */ /* synthetic */ mj.r invoke() {
            a();
            return mj.r.f64562a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener) {
        ck.p.j(context, "$context");
        ck.p.j(levelPlayInitRequest, "$initRequest");
        f31458a.c(context, levelPlayInitRequest, levelPlayInitListener);
    }

    private final void c(Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener) {
        IronLog.API.info("LevelPlay.init() appkey: " + levelPlayInitRequest.getAppKey() + ", userId: " + levelPlayInitRequest.getUserId() + ", legacyAdFormats: " + levelPlayInitRequest.getLegacyAdFormats() + ", context: " + context.getClass().getSimpleName());
        C3570l5 c3570l5 = new C3570l5();
        C3768wb c3768wb = f31459b;
        LevelPlay.AdFormat[] adFormatArr = (LevelPlay.AdFormat[]) levelPlayInitRequest.getLegacyAdFormats().toArray(new LevelPlay.AdFormat[0]);
        Ae.f25944a.a(context, new C3720te(levelPlayInitRequest.getAppKey(), levelPlayInitRequest.getUserId(), nj.n.s0(c3768wb.a((LevelPlay.AdFormat[]) Arrays.copyOf(adFormatArr, adFormatArr.length)))), new a(levelPlayInitRequest, context, c3570l5, levelPlayInitListener));
    }

    public final void b(LevelPlaySegment levelPlaySegment) {
        ck.p.j(levelPlaySegment, "segment");
        com.ironsource.mediationsdk.r.m().a(a(levelPlaySegment));
    }

    private C3751vb() {
    }

    public final void b(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        ck.p.j(levelPlayImpressionDataListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        com.ironsource.mediationsdk.r.m().a(new C3451eb(levelPlayImpressionDataListener));
    }

    public static /* synthetic */ void a(C3751vb c3751vb, Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            levelPlayInitListener = null;
        }
        c3751vb.a(context, levelPlayInitRequest, levelPlayInitListener);
    }

    public final void a(final Context context, final LevelPlayInitRequest levelPlayInitRequest, final LevelPlayInitListener levelPlayInitListener) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(levelPlayInitRequest, "initRequest");
        f31459b.d(new Runnable() { // from class: com.ironsource.dm
            @Override // java.lang.Runnable
            public final void run() {
                C3751vb.b(context, levelPlayInitRequest, levelPlayInitListener);
            }
        });
    }

    public final void a(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        ck.p.j(levelPlayImpressionDataListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        com.ironsource.mediationsdk.r.m().b(new C3451eb(levelPlayImpressionDataListener));
    }

    private final C3450ea a(LevelPlaySegment levelPlaySegment) {
        C3450ea c3450ea = new C3450ea();
        c3450ea.a(levelPlaySegment.getLevel());
        c3450ea.a(levelPlaySegment.getIapTotal());
        c3450ea.a(levelPlaySegment.isPaying());
        c3450ea.a(levelPlaySegment.getUserCreationDate());
        c3450ea.a(levelPlaySegment.getSegmentName());
        Iterator<T> it = levelPlaySegment.getCustoms$mediationsdk_release().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            c3450ea.a((String) pair.getFirst(), (String) pair.getSecond());
        }
        return c3450ea;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(LevelPlayInitRequest levelPlayInitRequest, C3579le c3579le, Context context, C3570l5 c3570l5, LevelPlayInitListener levelPlayInitListener) {
        Lb.b bVar = Lb.f26968s;
        L8.a aVarD = bVar.a().D();
        C3379ab c3379ab = new C3379ab(c3579le);
        if (c3379ab.l()) {
            f31459b.a(context);
        }
        N7.a aVarA = bVar.a().a();
        C3768wb c3768wb = f31459b;
        c3379ab.b(c3768wb).a(aVarA);
        c3379ab.a(c3768wb).a(bVar.a().l());
        c3379ab.c(c3768wb).a(bVar.a().v());
        C3751vb c3751vb = f31458a;
        c3751vb.a(levelPlayInitRequest, c3379ab);
        long jD = bVar.d().g().d();
        c3751vb.a(jD, new b(c3379ab, c3570l5, jD, levelPlayInitListener));
        aVarD.a(c3379ab);
        if (c3579le.a().e()) {
            new Fd(null, null, null, IronSourceThreadManager.INSTANCE.getThreadPoolExecutor(), 7, null).c(context);
        }
    }

    private final void a(long j10, bk.a<mj.r> aVar) {
        if (!Lb.f26968s.d().e().c() && j10 > 0) {
            f31459b.a(aVar, j10);
        } else {
            aVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final C3379ab c3379ab, C3570l5 c3570l5, long j10, final LevelPlayInitListener levelPlayInitListener) {
        Lb.f26968s.a().D().d();
        long jA = C3570l5.a(c3570l5);
        C3768wb c3768wb = f31459b;
        C3768wb.a(c3768wb, jA, c3379ab.f(), j10, null, 8, null);
        c3768wb.e(new Runnable() { // from class: com.ironsource.cm
            @Override // java.lang.Runnable
            public final void run() {
                C3751vb.a(levelPlayInitListener, c3379ab);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayInitListener levelPlayInitListener, C3379ab c3379ab) {
        ck.p.j(c3379ab, "$levelPlayConfig");
        IronLog.CALLBACK.info("LevelPlayInitListener.onInitSuccess()");
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitSuccess(new LevelPlayConfiguration(c3379ab.k(), c3379ab.h()));
        }
    }

    private final void a(LevelPlayInitRequest levelPlayInitRequest, C3379ab c3379ab) {
        LevelPlay.AdFormat adFormat = LevelPlay.AdFormat.REWARDED;
        if (a(levelPlayInitRequest, adFormat) && c3379ab.d().c().f() != null) {
            Td.a aVar = Td.f27711z;
            IronSource.a aVar2 = IronSource.a.REWARDED_VIDEO;
            Td tdA = aVar.a(new C3476g0(aVar2, C3815z7.f31705a.a(), "", null, null, null, 56, null), c3379ab, true);
            List<C3803yc> listC = c3379ab.c(adFormat);
            E0.b bVar = E0.b.MEDIATION;
            new C3736ud(new W0(new C3621o0(aVar2, bVar), tdA, bVar), adFormat, listC, tdA).a();
        }
        LevelPlay.AdFormat adFormat2 = LevelPlay.AdFormat.INTERSTITIAL;
        if (a(levelPlayInitRequest, adFormat2) && c3379ab.d().c().d() != null) {
            F9.a aVar3 = F9.f26512z;
            IronSource.a aVar4 = IronSource.a.INTERSTITIAL;
            F9 f9A = aVar3.a(new C3476g0(aVar4, C3815z7.f31705a.a(), "", null, null, null, 56, null), c3379ab, true);
            List<C3803yc> listC2 = c3379ab.c(adFormat2);
            E0.b bVar2 = E0.b.MEDIATION;
            new C3736ud(new W0(new C3621o0(aVar4, bVar2), f9A, bVar2), adFormat2, listC2, f9A).a();
        }
        LevelPlay.AdFormat adFormat3 = LevelPlay.AdFormat.BANNER;
        if (!a(levelPlayInitRequest, adFormat3) || c3379ab.d().c().c() == null) {
            return;
        }
        M2 m2A = M2.f27027z.a(new J2(), c3379ab, true);
        List<C3803yc> listC3 = c3379ab.c(adFormat3);
        IronSource.a aVar5 = IronSource.a.BANNER;
        E0.b bVar3 = E0.b.MEDIATION;
        new C3736ud(new W0(new C3621o0(aVar5, bVar3), m2A, bVar3), adFormat3, listC3, m2A).a();
    }

    private final boolean a(LevelPlayInitRequest levelPlayInitRequest, LevelPlay.AdFormat adFormat) {
        return !levelPlayInitRequest.getLegacyAdFormats().contains(adFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final LevelPlayInitListener levelPlayInitListener, C3570l5 c3570l5, final C3617ne c3617ne) {
        long jA = C3570l5.a(c3570l5);
        C3768wb c3768wb = f31459b;
        final C3617ne c3617neB = c3768wb.b(c3617ne);
        C3768wb.a(c3768wb, c3617neB, jA, null, 4, null);
        c3768wb.e(new Runnable() { // from class: com.ironsource.bm
            @Override // java.lang.Runnable
            public final void run() {
                C3751vb.a(c3617ne, levelPlayInitListener, c3617neB);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3617ne c3617ne, LevelPlayInitListener levelPlayInitListener, C3617ne c3617ne2) {
        ck.p.j(c3617ne, "$error");
        ck.p.j(c3617ne2, "$eventError");
        IronLog.CALLBACK.info("LevelPlayInitListener.LevelPlayInitError() error: " + c3617ne);
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitFailed(new LevelPlayInitError(f31459b.a(c3617ne2)));
        }
    }

    public final void a(String str, String str2) {
        ck.p.j(str, C3426d4.i.W);
        ck.p.j(str2, "value");
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        a(str, arrayList);
    }

    public final void a(String str, List<String> list) {
        ck.p.j(str, C3426d4.i.W);
        ck.p.j(list, "values");
        a(new c(str, list));
    }

    public final void a(bk.a<mj.r> aVar) {
        ck.p.j(aVar, "task");
        if (Lb.f26968s.c().g().j()) {
            IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, AbstractRunnableC3526ie.f29164a.a(aVar), 0L, 2, null);
        } else {
            aVar.invoke();
        }
    }
}
