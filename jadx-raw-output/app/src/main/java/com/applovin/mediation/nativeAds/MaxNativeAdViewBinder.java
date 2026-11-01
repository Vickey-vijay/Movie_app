package com.applovin.mediation.nativeAds;

import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;

/* JADX INFO: loaded from: classes4.dex */
public class MaxNativeAdViewBinder {

    @IdRes
    public final int advertiserTextViewId;

    @IdRes
    public final int bodyTextViewId;

    @IdRes
    public final int callToActionButtonId;

    @IdRes
    public final int iconContentViewId;

    @IdRes
    public final int iconImageViewId;

    @LayoutRes
    public final int layoutResourceId;
    public final View mainView;

    @IdRes
    public final int mediaContentFrameLayoutId;

    @IdRes
    public final int mediaContentViewGroupId;

    @IdRes
    public final int optionsContentFrameLayoutId;

    @IdRes
    public final int optionsContentViewGroupId;

    @IdRes
    public final int starRatingContentViewGroupId;
    public final String templateType;

    @IdRes
    public final int titleTextViewId;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f10351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f10352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f10353c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f10354d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f10355e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f10356f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f10357g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f10358h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f10359i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f10360j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f10361k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f10362l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f10363m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f10364n;

        public Builder(View view) {
            this(-1, view);
        }

        public Builder(@LayoutRes int i10) {
            this(i10, null);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.f10351a, this.f10352b, this.f10353c, this.f10354d, this.f10355e, this.f10356f, this.f10357g, this.f10360j, this.f10358h, this.f10359i, this.f10361k, this.f10362l, this.f10363m, this.f10364n);
        }

        public Builder setAdvertiserTextViewId(@IdRes int i10) {
            this.f10354d = i10;
            return this;
        }

        public Builder setBodyTextViewId(@IdRes int i10) {
            this.f10355e = i10;
            return this;
        }

        public Builder setCallToActionButtonId(@IdRes int i10) {
            this.f10363m = i10;
            return this;
        }

        @Deprecated
        public Builder setIconContentViewId(@IdRes int i10) {
            this.f10357g = i10;
            return this;
        }

        public Builder setIconImageViewId(@IdRes int i10) {
            this.f10356f = i10;
            return this;
        }

        @Deprecated
        public Builder setMediaContentFrameLayoutId(@IdRes int i10) {
            this.f10362l = i10;
            return this;
        }

        public Builder setMediaContentViewGroupId(@IdRes int i10) {
            this.f10361k = i10;
            return this;
        }

        @Deprecated
        public Builder setOptionsContentFrameLayoutId(@IdRes int i10) {
            this.f10359i = i10;
            return this;
        }

        public Builder setOptionsContentViewGroupId(@IdRes int i10) {
            this.f10358h = i10;
            return this;
        }

        public Builder setStarRatingContentViewGroupId(@IdRes int i10) {
            this.f10360j = i10;
            return this;
        }

        public Builder setTemplateType(String str) {
            this.f10364n = str;
            return this;
        }

        public Builder setTitleTextViewId(@IdRes int i10) {
            this.f10353c = i10;
            return this;
        }

        private Builder(int i10, View view) {
            this.f10353c = -1;
            this.f10354d = -1;
            this.f10355e = -1;
            this.f10356f = -1;
            this.f10357g = -1;
            this.f10358h = -1;
            this.f10359i = -1;
            this.f10360j = -1;
            this.f10361k = -1;
            this.f10362l = -1;
            this.f10363m = -1;
            this.f10352b = i10;
            this.f10351a = view;
        }
    }

    private MaxNativeAdViewBinder(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, String str) {
        this.mainView = view;
        this.layoutResourceId = i10;
        this.titleTextViewId = i11;
        this.advertiserTextViewId = i12;
        this.bodyTextViewId = i13;
        this.iconImageViewId = i14;
        this.iconContentViewId = i15;
        this.starRatingContentViewGroupId = i16;
        this.optionsContentViewGroupId = i17;
        this.optionsContentFrameLayoutId = i18;
        this.mediaContentViewGroupId = i19;
        this.mediaContentFrameLayoutId = i20;
        this.callToActionButtonId = i21;
        this.templateType = str;
    }
}
