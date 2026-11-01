package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;

/* JADX INFO: renamed from: com.inmobi.media.ye, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3332ye implements InterfaceC2786cj, InterfaceC3160rh, InterfaceC2843f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f25786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaView f25787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3186si f25788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC2819e1 f25789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final D4 f25790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Nc f25791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ec f25792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Jc f25793h;

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void a() {
        Gh gh2;
        C3053n9 c3053n9 = this.f25792g.f22583a.f25676a.f24939c;
        if (c3053n9 == null || (gh2 = c3053n9.f24879a) == null) {
            return;
        }
        gh2.a();
    }

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void c() {
    }

    public C3332ye(View view, MediaView mediaView, C3186si c3186si, AbstractC2819e1 abstractC2819e1, D4 d10, Nc nc2, Ec ec2, Jc jc2) {
        ck.p.j(c3186si, "renderedStateCache");
        ck.p.j(abstractC2819e1, "adSessionManager");
        ck.p.j(d10, "contextualDataHandler");
        ck.p.j(nc2, "nativeBeaconProcessor");
        ck.p.j(ec2, "nativeAdUnitComponent");
        ck.p.j(jc2, "stateMachine");
        this.f25786a = view;
        this.f25787b = mediaView;
        this.f25788c = c3186si;
        this.f25789d = abstractC2819e1;
        this.f25790e = d10;
        this.f25791f = nc2;
        this.f25792g = ec2;
        this.f25793h = jc2;
    }

    @Override // com.inmobi.media.InterfaceC3160rh
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        ck.p.j(inMobiNativeViewData, "nativeViewData");
        this.f25793h.a(new C3207te(new C3232ue(this.f25788c, new Sg(inMobiNativeViewData, this.f25787b, this.f25786a), this.f25790e, this.f25789d, this.f25791f, this.f25792g), this.f25793h), this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (r9.a(r2, r8, r0) == r1) goto L33;
     */
    @Override // com.inmobi.media.InterfaceC2843f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(rj.c r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.inmobi.media.C3282we
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.we r0 = (com.inmobi.media.C3282we) r0
            int r1 = r0.f25642c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25642c = r1
            goto L1a
        L13:
            com.inmobi.media.we r0 = new com.inmobi.media.we
            kotlin.coroutines.jvm.internal.ContinuationImpl r9 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r9
            r0.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r0.f25640a
            java.lang.Object r1 = sj.a.f()
            int r2 = r0.f25642c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.c.b(r9)
            goto La7
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L37:
            kotlin.c.b(r9)
            goto L92
        L3b:
            kotlin.c.b(r9)
            com.inmobi.media.e1 r9 = r8.f25789d
            com.iab.omid.library.inmobi.adsession.AdSession r2 = r9.f24279c
            r5 = 0
            if (r2 != 0) goto L53
            com.inmobi.media.m9 r9 = r9.f24278b
            if (r9 == 0) goto L6a
            java.lang.String r2 = com.inmobi.media.AbstractC2819e1.f24276f
            com.inmobi.media.n9 r9 = (com.inmobi.media.C3053n9) r9
            java.lang.String r6 = "Failed to stopAdSession. adSession is null"
            r9.a(r2, r6)
            goto L6a
        L53:
            com.inmobi.media.m9 r2 = r9.f24278b
            if (r2 == 0) goto L60
            java.lang.String r6 = com.inmobi.media.AbstractC2819e1.f24276f
            com.inmobi.media.n9 r2 = (com.inmobi.media.C3053n9) r2
            java.lang.String r7 = "stopAdSession"
            r2.a(r6, r7)
        L60:
            nk.l0 r2 = r9.f24277a
            com.inmobi.media.c1 r6 = new com.inmobi.media.c1
            r6.<init>(r9, r5)
            com.inmobi.media.P4.a(r2, r6)
        L6a:
            com.inmobi.media.Ec r9 = r8.f25792g
            mj.g r9 = r9.f22589g
            java.lang.Object r9 = r9.getValue()
            com.inmobi.media.lc r9 = (com.inmobi.media.C3006lc) r9
            r0.f25642c = r4
            r9.getClass()
            nk.y1 r2 = nk.w0.c()
            com.inmobi.media.jc r4 = new com.inmobi.media.jc
            r4.<init>(r9, r5)
            java.lang.Object r9 = nk.h.g(r2, r4, r0)
            java.lang.Object r2 = sj.a.f()
            if (r9 != r2) goto L8d
            goto L8f
        L8d:
            mj.r r9 = mj.r.f64562a
        L8f:
            if (r9 != r1) goto L92
            goto La6
        L92:
            com.inmobi.media.D4 r9 = r8.f25790e
            r9.b()
            com.inmobi.media.Jc r9 = r8.f25793h
            com.inmobi.media.Vc r2 = new com.inmobi.media.Vc
            r2.<init>()
            r0.f25642c = r3
            java.lang.Object r9 = r9.a(r2, r8, r0)
            if (r9 != r1) goto La7
        La6:
            return r1
        La7:
            mj.r r9 = mj.r.f64562a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3332ye.a(rj.c):java.lang.Object");
    }
}
