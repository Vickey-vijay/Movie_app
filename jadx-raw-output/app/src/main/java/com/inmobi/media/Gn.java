package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.C2987ki;
import com.inmobi.media.Gn;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class Gn extends Fn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC2785ci f22765d;

    @Override // com.inmobi.media.Fn
    public final void a(Context context, byte b10) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
    }

    @Override // com.inmobi.media.Fn
    public final void a(Map map) {
    }

    public final void b(final View view) {
        this.f22765d.getWebViewFactory().b(new bk.l() { // from class: b7.y0
            @Override // bk.l
            public final Object invoke(Object obj) {
                return Gn.a(view, (C2987ki) obj);
            }
        });
    }

    @Override // com.inmobi.media.Fn
    public final View c() {
        this.f22688b = new WeakReference(this.f22765d);
        return this.f22765d;
    }

    @Override // com.inmobi.media.Fn
    public final void d() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gn(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        super(gestureDetectorOnGestureListenerC2785ci);
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "mRenderView");
        this.f22765d = gestureDetectorOnGestureListenerC2785ci;
    }

    public static final mj.r a(View view, C2987ki c2987ki) {
        ck.p.j(c2987ki, "it");
        c2987ki.getViewableAd().a(view, FriendlyObstructionPurpose.OTHER);
        U exposureTracker = c2987ki.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.a(view);
        }
        return mj.r.f64562a;
    }

    public static final mj.r b(View view, C2987ki c2987ki) {
        ck.p.j(c2987ki, "it");
        c2987ki.getViewableAd().a(view);
        U exposureTracker = c2987ki.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.b(view);
        }
        return mj.r.f64562a;
    }

    public final void c(final View view) {
        this.f22765d.getWebViewFactory().b(new bk.l() { // from class: b7.x0
            @Override // bk.l
            public final Object invoke(Object obj) {
                return Gn.b(view, (C2987ki) obj);
            }
        });
    }

    @Override // com.inmobi.media.Fn
    public final void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        ck.p.j(view, "childView");
        ck.p.j(friendlyObstructionPurpose, "obstructionCode");
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.f22765d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.put(view, friendlyObstructionPurpose);
        }
        U exposureTracker = this.f22765d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.a(view);
        }
        b(view);
    }

    @Override // com.inmobi.media.Fn
    public final void a(View view) {
        ck.p.j(view, "childView");
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.f22765d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.remove(view);
        }
        U exposureTracker = this.f22765d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.b(view);
        }
        c(view);
    }
}
