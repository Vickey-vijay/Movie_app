package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.inmobi.media.C3287wj;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.squareup.picasso.Picasso;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.wj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3287wj extends AbstractC2946j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nk.l0 f25660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3312xj f25661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qk.k f25662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3053n9 f25663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f25664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Cj f25665g;

    @Override // com.inmobi.media.AbstractC2946j2
    public final void a(qk.l lVar) {
        ck.p.j(lVar, "windowFlow");
    }

    @Override // com.inmobi.media.AbstractC2946j2
    public final void b() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3287wj(Context context, nk.l0 l0Var, C3312xj c3312xj, qk.k kVar, C3053n9 c3053n9) {
        super(context);
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(l0Var, "coroutineScope");
        ck.p.j(c3312xj, "staticExperienceModel");
        ck.p.j(kVar, "mediaEventFlow");
        this.f25660b = l0Var;
        this.f25661c = c3312xj;
        this.f25662d = kVar;
        this.f25663e = c3053n9;
        String string = UUID.randomUUID().toString();
        ck.p.i(string, "toString(...)");
        this.f25664f = "Static-Image-" + string;
        int i10 = Cj.f22475b;
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        this.f25665g = new Cj(context);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.inmobi.media.AbstractC2946j2
    public final Object a(ContinuationImpl continuationImpl) throws Throwable {
        C3162rj c3162rj;
        List listH0;
        if (continuationImpl instanceof C3162rj) {
            c3162rj = (C3162rj) continuationImpl;
            int i10 = c3162rj.f25274c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3162rj.f25274c = i10 - Integer.MIN_VALUE;
            } else {
                c3162rj = new C3162rj(this, continuationImpl);
            }
        } else {
            c3162rj = new C3162rj(this, continuationImpl);
        }
        Object obj = c3162rj.f25272a;
        Object objF = sj.a.f();
        int i11 = c3162rj.f25274c;
        if (i11 == 0) {
            kotlin.c.b(obj);
            C3053n9 c3053n9 = this.f25663e;
            if (c3053n9 != null) {
                c3053n9.a("StaticExperienceManager", "load Called - imageAssets count: " + this.f25661c.f25736a.size());
            }
            Map mapA = AbstractC2939ik.a(this.f25661c.f25737b.f22536a);
            Wj wj2 = Wj.f23753a;
            Wj.b("MainImageLoadStarted", mapA, EnumC2735ak.SDK);
            List list = this.f25661c.f25736a;
            ck.p.j(list, "images");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                Image image = (Image) obj2;
                if (URLUtil.isHttpUrl(image.getUrl()) || URLUtil.isHttpsUrl(image.getUrl())) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.isEmpty()) {
                C3053n9 c3053n10 = this.f25663e;
                if (c3053n10 != null) {
                    c3053n10.a("StaticExperienceManager", "Sanitized Images Empty - no valid images to load");
                }
                Map mapB = kotlin.collections.a.B(AbstractC2939ik.a(this.f25661c.f25737b.f22536a));
                mapB.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2351);
                Wj wj3 = Wj.f23753a;
                Wj.b("MainImageLoadFailure", mapB, EnumC2735ak.SDK);
                throw new C2805dc();
            }
            ck.p.j(arrayList, "images");
            if (arrayList.size() > 1) {
                int iA = AbstractC3323y5.a();
                int iOrdinal = AbstractC3322y4.a().ordinal();
                if (iOrdinal == 2) {
                    listH0 = arrayList;
                    listH0 = nj.b0.H0(arrayList, new C3362zj(iA));
                } else if (iOrdinal != 3) {
                    listH0 = arrayList;
                    listH0 = nj.b0.H0(arrayList, new Aj());
                } else if (iA > 720) {
                    listH0 = arrayList;
                    listH0 = nj.b0.H0(arrayList, new Bj());
                } else {
                    listH0 = arrayList;
                    listH0 = nj.b0.H0(arrayList, new C3337yj(iA));
                }
            }
            listH0 = arrayList;
            ImageView imageView = this.f25665g;
            c3162rj.f25274c = 1;
            if (a(listH0, imageView, c3162rj) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        C3053n9 c3053n11 = this.f25663e;
        if (c3053n11 != null) {
            c3053n11.a("StaticExperienceManager", "Static Load Success");
        }
        Map mapA2 = AbstractC2939ik.a(this.f25661c.f25737b.f22536a);
        Wj wj4 = Wj.f23753a;
        Wj.b("MainImageLoadSuccess", mapA2, EnumC2735ak.SDK);
        return mj.r.f64562a;
    }

    @Override // com.inmobi.media.AbstractC2946j2
    public final Object a(FrameLayout frameLayout, C2981kc c2981kc) {
        Object objG = nk.h.g(nk.w0.c(), new C3138qj(this, frameLayout, null), c2981kc);
        return objG == sj.a.f() ? objG : mj.r.f64562a;
    }

    @Override // com.inmobi.media.AbstractC2946j2
    public final void a() {
        ViewParent parent = this.f25665g.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        Picasso picasso = Qf.f23387a;
        Qf.b(this.f24579a).cancelTag(this.f25664f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
    
        if (nk.h.g(r12, r13, r8) == r9) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r16, android.widget.ImageView r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) throws java.lang.Throwable {
        /*
            r15 = this;
            r7 = r15
            r0 = r18
            boolean r1 = r0 instanceof com.inmobi.media.C3187sj
            if (r1 == 0) goto L16
            r1 = r0
            com.inmobi.media.sj r1 = (com.inmobi.media.C3187sj) r1
            int r2 = r1.f25348f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f25348f = r2
            goto L1b
        L16:
            com.inmobi.media.sj r1 = new com.inmobi.media.sj
            r1.<init>(r15, r0)
        L1b:
            r8 = r1
            java.lang.Object r0 = r8.f25346d
            java.lang.Object r9 = sj.a.f()
            int r1 = r8.f25348f
            r10 = 2
            r2 = 1
            r11 = 0
            if (r1 == 0) goto L48
            if (r1 == r2) goto L3a
            if (r1 != r10) goto L32
            kotlin.c.b(r0)
            goto Lb1
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            kotlin.jvm.internal.Ref$BooleanRef r1 = r8.f25345c
            android.widget.ImageView r2 = r8.f25344b
            java.util.List r3 = r8.f25343a
            kotlin.c.b(r0)
            r4 = r2
            r14 = r3
            r3 = r1
            r1 = r14
            goto L93
        L48:
            kotlin.c.b(r0)
            com.inmobi.media.n9 r0 = r7.f25663e
            if (r0 == 0) goto L6e
            int r1 = r16.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "loadImagesIntoImageView - attempting to load "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " images"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = "StaticExperienceManager"
            r0.a(r3, r1)
        L6e:
            kotlin.jvm.internal.Ref$BooleanRef r0 = new kotlin.jvm.internal.Ref$BooleanRef
            r0.<init>()
            nk.y1 r1 = nk.w0.c()
            com.inmobi.media.uj r3 = new com.inmobi.media.uj
            r3.<init>(r15, r11)
            r4 = r16
            r8.f25343a = r4
            r5 = r17
            r8.f25344b = r5
            r8.f25345c = r0
            r8.f25348f = r2
            java.lang.Object r1 = nk.h.g(r1, r3, r8)
            if (r1 != r9) goto L8f
            goto Lb0
        L8f:
            r3 = r0
            r0 = r1
            r1 = r4
            r4 = r5
        L93:
            r5 = r0
            android.graphics.Bitmap$Config r5 = (android.graphics.Bitmap.Config) r5
            nk.h0 r12 = nk.w0.b()
            com.inmobi.media.tj r13 = new com.inmobi.media.tj
            r6 = 0
            r0 = r13
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.f25343a = r11
            r8.f25344b = r11
            r8.f25345c = r11
            r8.f25348f = r10
            java.lang.Object r0 = nk.h.g(r12, r13, r8)
            if (r0 != r9) goto Lb1
        Lb0:
            return r9
        Lb1:
            mj.r r0 = mj.r.f64562a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3287wj.a(java.util.List, android.widget.ImageView, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void a(ImageView imageView, final Image image) {
        imageView.setOnClickListener(new View.OnClickListener() { // from class: b7.wb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3287wj.a(this.f5239b, image, view);
            }
        });
    }

    public static final void a(C3287wj c3287wj, Image image, View view) {
        C3053n9 c3053n9 = c3287wj.f25663e;
        if (c3053n9 != null) {
            c3053n9.a("StaticExperienceManager", "Static Click Event");
        }
        nk.j.d(c3287wj.f25660b, null, null, new C3262vj(image, c3287wj, null), 3, null);
    }
}
