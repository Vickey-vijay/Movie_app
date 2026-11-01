package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.Ee;
import com.inmobi.media.ads.nativeAd.MediaView;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class Ee {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nk.l0 f22592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3241un f22593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Be f22594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f22595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f22596e;

    public static final mj.r b(Ee ee2, boolean z10) {
        ee2.f22594c.f22422e.f22642b.f25673b = z10;
        return mj.r.f64562a;
    }

    public final void a() {
        if (this.f22595d.getAndSet(true)) {
            return;
        }
        ViewGroup parentView$media_release = this.f22593b.f25500e.f23523a.getParentView$media_release();
        a(this.f22593b.f25500e.f23523a.getIconView$media_release(), parentView$media_release, this.f22593b.f25496a, new bk.l() { // from class: b7.a0
            @Override // bk.l
            public final Object invoke(Object obj) {
                return Ee.a(this.f4836b, ((Boolean) obj).booleanValue());
            }
        });
        C3241un c3241un = this.f22593b;
        a(c3241un.f25500e.f23524b, parentView$media_release, c3241un.f25497b, new bk.l() { // from class: b7.b0
            @Override // bk.l
            public final Object invoke(Object obj) {
                return Ee.b(this.f4850b, ((Boolean) obj).booleanValue());
            }
        });
    }

    public Ee(nk.l0 l0Var, C3241un c3241un) {
        ck.p.j(l0Var, "coroutineScope");
        ck.p.j(c3241un, "viewabilityModel");
        this.f22592a = l0Var;
        this.f22593b = c3241un;
        this.f22595d = new AtomicBoolean(false);
        this.f22596e = new ArrayList();
        Fe fe2 = new Fe(new C3291wn(c3241un.f25496a, c3241un.f25498c), new C3291wn(c3241un.f25497b, c3241un.f25499d));
        ViewGroup parentView$media_release = c3241un.f25500e.f23523a.getParentView$media_release();
        ImageView iconView$media_release = c3241un.f25500e.f23523a.getIconView$media_release();
        Sg sg2 = c3241un.f25500e;
        MediaView mediaView = sg2.f23524b;
        ck.p.j(sg2, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        MediaView mediaView2 = sg2.f23524b;
        if (mediaView2 != null) {
            linkedHashSet.add(mediaView2);
        }
        View view = sg2.f23525c;
        if (view != null) {
            linkedHashSet.add(view);
        }
        View ctaView$media_release = sg2.f23523a.getCtaView$media_release();
        if (ctaView$media_release != null) {
            linkedHashSet.add(ctaView$media_release);
        }
        ImageView iconView$media_release2 = sg2.f23523a.getIconView$media_release();
        if (iconView$media_release2 != null) {
            linkedHashSet.add(iconView$media_release2);
        }
        View titleView$media_release = sg2.f23523a.getTitleView$media_release();
        if (titleView$media_release != null) {
            linkedHashSet.add(titleView$media_release);
        }
        View descriptionView$media_release = sg2.f23523a.getDescriptionView$media_release();
        if (descriptionView$media_release != null) {
            linkedHashSet.add(descriptionView$media_release);
        }
        View ratingView$media_release = sg2.f23523a.getRatingView$media_release();
        if (ratingView$media_release != null) {
            linkedHashSet.add(ratingView$media_release);
        }
        View advertiserView$media_release = sg2.f23523a.getAdvertiserView$media_release();
        if (advertiserView$media_release != null) {
            linkedHashSet.add(advertiserView$media_release);
        }
        linkedHashSet.addAll(sg2.f23523a.getExtraViews$media_release());
        this.f22594c = new Be(parentView$media_release, iconView$media_release, mediaView, nj.b0.O0(linkedHashSet), fe2);
    }

    public final void b() {
        if (this.f22595d.getAndSet(false)) {
            ArrayList arrayList = this.f22596e;
            ck.p.j(arrayList, "<this>");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                H6.a((kotlinx.coroutines.g) it.next());
            }
            arrayList.clear();
            this.f22596e.clear();
        }
    }

    public static final mj.r a(Ee ee2, boolean z10) {
        ee2.f22594c.f22422e.f22641a.f25673b = z10;
        return mj.r.f64562a;
    }

    public final void a(View view, ViewGroup viewGroup, boolean z10, bk.l lVar) {
        if (view == null || !z10) {
            return;
        }
        nk.l0 l0Var = this.f22592a;
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(viewGroup, "parentView");
        ck.p.j(l0Var, "coroutineScope");
        this.f22596e.add(nk.j.d(this.f22592a, null, null, new De(qk.e.G(qk.e.w(qk.e.e(new C3216tn(view, viewGroup, null)), nk.w0.c()), l0Var, kotlinx.coroutines.flow.a.f63151a.b(), Boolean.valueOf(AbstractC3266vn.b(view, viewGroup))), null, lVar), 3, null));
    }
}
