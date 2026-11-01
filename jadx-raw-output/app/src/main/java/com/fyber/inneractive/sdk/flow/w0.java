package com.fyber.inneractive.sdk.flow;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.external.MediaView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 extends x implements NativeAdContent, com.fyber.inneractive.sdk.flow.nativead.u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f15728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f15729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f15730i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f15731j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f15732k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Uri f15733l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Uri f15734m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MediaView f15735n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Float f15736o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Float f15737p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f15738q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.r f15739r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public t0 f15740s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashMap f15741t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.j f15742u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.a f15743v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f15744w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f15745x;

    public final void b(String str) {
        com.fyber.inneractive.sdk.util.g gVar;
        if (str == null || str.trim().isEmpty()) {
            str = NativeAdContent.ViewTag.OTHER;
        }
        IAlog.c("%s : handleClick(): %s", "w0", str);
        if (this.f15742u != null) {
            switch (str) {
                case "CTA":
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE_CTA;
                    break;
                case "TITLE":
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_TITLE;
                    break;
                case "DESCRIPTION":
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_DESCRIPTION;
                    break;
                case "RATING":
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_RATING;
                    break;
                case "MEDIA_VIEW":
                    if (!isVideoAd()) {
                        gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_IMAGE;
                        break;
                    } else {
                        gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_VIDEO;
                        break;
                    }
                    break;
                case "ICON":
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_ICON;
                    break;
                case "ROOT":
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_ROOT;
                    break;
                case "OTHER":
                default:
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE;
                    break;
            }
            com.fyber.inneractive.sdk.flow.nativead.i iVar = (com.fyber.inneractive.sdk.flow.nativead.i) this.f15741t.get(str);
            com.fyber.inneractive.sdk.flow.nativead.j jVar = this.f15742u;
            if (iVar == null) {
                iVar = jVar.f15513a;
            }
            if (iVar == null) {
                jVar.getClass();
                IAlog.a("%s : No active link (no root and object related links), origin: %s", com.fyber.inneractive.sdk.flow.nativead.j.f15512d, gVar);
            } else {
                com.fyber.inneractive.sdk.flow.nativead.p pVar = jVar.f15515c;
                pVar.getClass();
                com.fyber.inneractive.sdk.util.r.f18606a.execute(new com.fyber.inneractive.sdk.flow.nativead.m(pVar, iVar, false, gVar));
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final void bindMediaView(MediaView mediaView) {
        this.f15735n = mediaView;
        com.fyber.inneractive.sdk.flow.nativead.a aVar = this.f15743v;
        if (aVar != null) {
            aVar.bind(mediaView);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void destroy() {
        t0 t0Var = this.f15740s;
        if (t0Var != null) {
            t0Var.destroy();
            this.f15740s = null;
        }
        com.fyber.inneractive.sdk.flow.nativead.j jVar = this.f15742u;
        if (jVar != null) {
            jVar.f15514b = null;
            jVar.f15515c.f15543a = null;
            this.f15742u = null;
        }
        if (this.f15743v != null) {
            this.f15743v = null;
        }
        for (View view : this.f15738q) {
            if (view != null) {
                view.setOnClickListener(null);
            }
        }
        for (View view2 : this.f15738q) {
            if (view2 != null) {
                view2.setOnTouchListener(null);
            }
        }
        this.f15739r = null;
        this.f15738q.clear();
        this.f15732k = null;
        this.f15736o = null;
        this.f15733l = null;
        this.f15728g = null;
        this.f15734m = null;
        this.f15735n = null;
        this.f15729h = null;
        this.f15731j = null;
        this.f15730i = null;
        this.f15737p = null;
        this.f15741t.clear();
        this.f15744w.clear();
        this.f15745x.clear();
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean e() {
        return (this.f15734m == null && this.f15735n == null) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getAdCallToAction() {
        return this.f15730i;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getAdDescription() {
        return this.f15729h;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getAdTitle() {
        return this.f15728g;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getAdvertiserName() {
        return this.f15731j;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final Uri getAppIcon() {
        return this.f15733l;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final Float getMediaAspectRatio() {
        return this.f15737p;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final MediaView getMediaView() {
        return this.f15735n;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getPrice() {
        return this.f15732k;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final Float getRating() {
        return this.f15736o;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean isVideoAd() {
        return this.f15740s != null;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final void registerViewsForInteraction(ViewGroup viewGroup, MediaView mediaView, ImageView imageView, Collection collection) {
        this.f15738q.clear();
        if (collection != null) {
            this.f15738q.addAll(collection);
        }
        if (viewGroup != null && !this.f15738q.contains(viewGroup)) {
            this.f15738q.add(viewGroup);
        }
        if (mediaView != null && !this.f15738q.contains(mediaView)) {
            this.f15738q.add(mediaView);
        }
        if (imageView != null && !this.f15738q.contains(imageView)) {
            this.f15738q.add(imageView);
        }
        MediaView mediaView2 = this.f15735n;
        if (mediaView2 == null || mediaView2.getContext() == null) {
            IAlog.b("%sCould not attach NativeAdViewGestureDetector, MediaView or its context are null", "w0");
            return;
        }
        this.f15739r = new com.fyber.inneractive.sdk.flow.nativead.r(this.f15735n.getContext(), this);
        for (View view : this.f15738q) {
            if (view != null) {
                view.setOnTouchListener(this.f15739r);
            }
        }
    }

    public w0(com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(s0Var, rVar);
        this.f15738q = new ArrayList();
        this.f15741t = new HashMap();
        this.f15744w = new ArrayList();
        this.f15745x = new ArrayList();
    }
}
