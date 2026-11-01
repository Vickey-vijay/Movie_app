package com.inmobi.media.ads.nativeAd;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import ck.i;
import ck.p;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class InMobiNativeViewData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f23975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f23976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f23977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f23978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f23979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f23980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f23981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f23982h;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewGroup f23983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f23984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public View f23985c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ImageView f23986d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public View f23987e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public View f23988f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f23989g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ArrayList f23990h;

        public Builder(ViewGroup viewGroup) {
            p.j(viewGroup, "parentView");
            this.f23983a = viewGroup;
            this.f23990h = new ArrayList();
        }

        public final InMobiNativeViewData build() {
            return new InMobiNativeViewData(this.f23983a, this.f23984b, this.f23985c, this.f23986d, this.f23987e, this.f23988f, this.f23989g, this.f23990h, null);
        }

        public final Builder setAdvertiserView(View view) {
            this.f23989g = view;
            return this;
        }

        public final Builder setCTAView(View view) {
            this.f23987e = view;
            return this;
        }

        public final Builder setDescriptionView(View view) {
            this.f23985c = view;
            return this;
        }

        public final Builder setExtraViews(List<? extends View> list) {
            p.j(list, "extraViews");
            this.f23990h.addAll(list);
            return this;
        }

        public final Builder setIconView(ImageView imageView) {
            this.f23986d = imageView;
            return this;
        }

        public final Builder setRatingView(View view) {
            this.f23988f = view;
            return this;
        }

        public final Builder setTitleView(View view) {
            this.f23984b = view;
            return this;
        }
    }

    public final View getAdvertiserView$media_release() {
        return this.f23981g;
    }

    public final View getCtaView$media_release() {
        return this.f23979e;
    }

    public final View getDescriptionView$media_release() {
        return this.f23977c;
    }

    public final List<View> getExtraViews$media_release() {
        return this.f23982h;
    }

    public final ImageView getIconView$media_release() {
        return this.f23978d;
    }

    public final ViewGroup getParentView$media_release() {
        return this.f23975a;
    }

    public final View getRatingView$media_release() {
        return this.f23980f;
    }

    public final View getTitleView$media_release() {
        return this.f23976b;
    }

    public InMobiNativeViewData(ViewGroup viewGroup, View view, View view2, ImageView imageView, View view3, View view4, View view5, List list, i iVar) {
        this.f23975a = viewGroup;
        this.f23976b = view;
        this.f23977c = view2;
        this.f23978d = imageView;
        this.f23979e = view3;
        this.f23980f = view4;
        this.f23981g = view5;
        this.f23982h = list;
    }
}
