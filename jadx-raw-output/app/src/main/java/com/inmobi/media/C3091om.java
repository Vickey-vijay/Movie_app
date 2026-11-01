package com.inmobi.media;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.om, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3091om extends AbstractC2946j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nk.l0 f25009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3116pm f25010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qk.k f25011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3053n9 f25012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f25013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f25014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC2830ec f25015h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public K3 f25016i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ViewGroup f25017j;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        if (b(r0) == r1) goto L25;
     */
    @Override // com.inmobi.media.AbstractC2946j2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.inmobi.media.C2763bm
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.bm r0 = (com.inmobi.media.C2763bm) r0
            int r1 = r0.f24087d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24087d = r1
            goto L18
        L13:
            com.inmobi.media.bm r0 = new com.inmobi.media.bm
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f24085b
            java.lang.Object r1 = sj.a.f()
            int r2 = r0.f24087d
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r3) goto L2d
            kotlin.c.b(r9)
            goto L84
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            com.inmobi.media.om r2 = r0.f24084a
            kotlin.c.b(r9)
            goto L75
        L3b:
            kotlin.c.b(r9)
            com.inmobi.media.n9 r9 = r8.f25012e
            if (r9 == 0) goto L60
            com.inmobi.media.pm r2 = r8.f25010c
            java.util.ArrayList r2 = r2.f25098c
            int r2 = r2.size()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "load Called - mediaFiles count: "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            java.lang.String r6 = "VideoExperienceManager"
            r9.a(r6, r2)
        L60:
            nk.y1 r9 = nk.w0.c()
            com.inmobi.media.cm r2 = new com.inmobi.media.cm
            r2.<init>(r8, r4)
            r0.f24084a = r8
            r0.f24087d = r5
            java.lang.Object r9 = nk.h.g(r9, r2, r0)
            if (r9 != r1) goto L74
            goto L83
        L74:
            r2 = r8
        L75:
            com.inmobi.media.ec r9 = (com.inmobi.media.InterfaceC2830ec) r9
            r2.f25015h = r9
            r0.f24084a = r4
            r0.f24087d = r3
            java.lang.Object r9 = r8.b(r0)
            if (r9 != r1) goto L84
        L83:
            return r1
        L84:
            mj.r r9 = mj.r.f64562a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3091om.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ContinuationImpl continuationImpl) throws Throwable {
        C2815dm c2815dm;
        C3091om c3091om;
        C3053n9 c3053n9;
        if (continuationImpl instanceof C2815dm) {
            c2815dm = (C2815dm) continuationImpl;
            int i10 = c2815dm.f24263d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2815dm.f24263d = i10 - Integer.MIN_VALUE;
            } else {
                c2815dm = new C2815dm(this, continuationImpl);
            }
        } else {
            c2815dm = new C2815dm(this, continuationImpl);
        }
        Object objE = c2815dm.f24261b;
        Object objF = sj.a.f();
        int i11 = c2815dm.f24263d;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.c.b(objE);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3091om = c2815dm.f24260a;
                kotlin.c.b(objE);
            }
            c3091om.f25017j = (ViewGroup) objE;
            c3053n9 = this.f25012e;
            if (c3053n9 != null) {
                c3053n9.a("VideoExperienceManager", "Video Experience Load Success");
            }
            return mj.r.f64562a;
        }
        kotlin.c.b(objE);
        C3053n9 c3053n10 = this.f25012e;
        if (c3053n10 != null) {
            c3053n10.a("VideoExperienceManager", "loadVideoExperience - getting sorted media files");
        }
        c2815dm.f24263d = 1;
        ArrayList arrayList = this.f25010c.f25098c;
        ck.p.j(arrayList, "mediaFiles");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C3115pl c3115pl = (C3115pl) obj;
            if (URLUtil.isHttpUrl(c3115pl.f25094c) || URLUtil.isHttpsUrl(c3115pl.f25094c)) {
                arrayList2.add(obj);
            }
        }
        objE = kotlinx.coroutines.d.e(new C3265vm(arrayList2, ((double) Jl.a(this.f25010c.f25096a)) / ((double) 1000), this.f25010c.f25099d, null), c2815dm);
        if (objE != objF) {
        }
        return objF;
        List list = (List) objE;
        ArrayList arrayList3 = new ArrayList(nj.t.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C3115pl) it.next()).f25094c);
        }
        InterfaceC2830ec interfaceC2830ec = this.f25015h;
        if (interfaceC2830ec == null) {
            ck.p.B("mediaPlayer");
            interfaceC2830ec = null;
        }
        c2815dm.f24260a = this;
        c2815dm.f24263d = 2;
        objE = ((Sd) interfaceC2830ec).a(arrayList3, c2815dm);
        if (objE != objF) {
            c3091om = this;
            c3091om.f25017j = (ViewGroup) objE;
            c3053n9 = this.f25012e;
            if (c3053n9 != null) {
                c3053n9.a("VideoExperienceManager", "Video Experience Load Success");
            }
            return mj.r.f64562a;
        }
        return objF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3091om(Context context, nk.l0 l0Var, C3116pm c3116pm, qk.k kVar, C3053n9 c3053n9) {
        super(context);
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(l0Var, "coroutineScope");
        ck.p.j(c3116pm, "videoExperienceModel");
        ck.p.j(kVar, "mediaEventFlow");
        this.f25009b = l0Var;
        this.f25010c = c3116pm;
        this.f25011d = kVar;
        this.f25012e = c3053n9;
        this.f25013f = new ArrayList();
        this.f25014g = new ArrayList();
    }

    @Override // com.inmobi.media.AbstractC2946j2
    public final Object a(FrameLayout frameLayout, C2981kc c2981kc) {
        Object objG = nk.h.g(nk.w0.c(), new C2737am(this, frameLayout, null), c2981kc);
        return objG == sj.a.f() ? objG : mj.r.f64562a;
    }

    @Override // com.inmobi.media.AbstractC2946j2
    public final void a(qk.l lVar) {
        ck.p.j(lVar, "windowFlow");
        kotlinx.coroutines.g gVarD = nk.j.d(this.f25009b, null, null, new Yl(lVar, null, this), 3, null);
        ArrayList arrayList = this.f25014g;
        ck.p.j(gVarD, "<this>");
        ck.p.j(arrayList, "activeJobs");
        arrayList.add(gVarD);
    }

    @Override // com.inmobi.media.AbstractC2946j2
    public final void a() {
        C3053n9 c3053n9 = this.f25012e;
        if (c3053n9 != null) {
            c3053n9.a("VideoExperienceManager", "destroy");
        }
        b();
        InterfaceC2830ec interfaceC2830ec = this.f25015h;
        if (interfaceC2830ec != null) {
            Sd sd2 = (Sd) interfaceC2830ec;
            C3053n9 c3053n10 = sd2.f23507c;
            if (c3053n10 != null) {
                c3053n10.a("NativeMediaPlayer", "destroy called");
            }
            sd2.f23509e = EnumC3184sg.STATE_DESTROYED;
            P4.a(sd2.f23508d);
            sd2.f23515k.b();
            C2729ae c2729ae = sd2.f23513i;
            c2729ae.f23998g.removeAllViews();
            c2729ae.f23997f.c();
            sd2.f23514j.c();
            sd2.f23511g.removeAllViews();
            sd2.f23512h.release();
        }
        P4.a(this.f25014g);
        K3 k10 = this.f25016i;
        if (k10 != null) {
            k10.a();
        }
    }

    @Override // com.inmobi.media.AbstractC2946j2
    public final void b() {
        P4.a(this.f25009b, new Zl(this, null));
        InterfaceC2830ec interfaceC2830ec = this.f25015h;
        if (interfaceC2830ec == null) {
            ck.p.B("mediaPlayer");
            interfaceC2830ec = null;
        }
        Sd sd2 = (Sd) interfaceC2830ec;
        sd2.f23514j.c();
        C3117pn c3117pn = sd2.f23515k;
        Ij ij2 = c3117pn.f25111h;
        if (ij2 != null) {
            ij2.b();
        }
        c3117pn.f25107d.set(false);
        C3284wg c3284wg = (C3284wg) c3117pn.f25112i.f23770d.getValue();
        c3284wg.f25651f.set(true);
        H6.a(c3284wg.f25650e);
        c3284wg.f25650e = null;
        P4.a(c3117pn.f25108e);
        P4.a(sd2.f23508d);
        P4.a(this.f25013f);
    }
}
