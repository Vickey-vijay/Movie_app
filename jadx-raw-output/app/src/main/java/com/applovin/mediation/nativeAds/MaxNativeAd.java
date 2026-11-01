package com.applovin.mediation.nativeAds;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.applovin.impl.mediation.nativeAds.MaxNativeAdImpl;
import com.applovin.mediation.MaxAdFormat;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class MaxNativeAd extends MaxNativeAdImpl {
    private static final float MINIMUM_STARS_TO_RENDER = 3.0f;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final MaxAdFormat format;
    private final MaxNativeAdImage icon;
    private final View iconView;
    private boolean isExpired;
    private final MaxNativeAdImage mainImage;
    private final float mediaContentAspectRatio;
    private final View mediaView;
    private MaxNativeAdView nativeAdView;
    private final View optionsView;
    private final Double starRating;
    private final String title;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MaxAdFormat f10320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f10321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f10322c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f10323d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f10324e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private MaxNativeAdImage f10325f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private View f10326g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private View f10327h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private View f10328i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private MaxNativeAdImage f10329j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f10330k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Double f10331l;

        public MaxNativeAd build() {
            return new MaxNativeAd(this);
        }

        public Builder setAdFormat(MaxAdFormat maxAdFormat) {
            this.f10320a = maxAdFormat;
            return this;
        }

        public Builder setAdvertiser(String str) {
            this.f10322c = str;
            return this;
        }

        public Builder setBody(String str) {
            this.f10323d = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.f10324e = str;
            return this;
        }

        public Builder setIcon(MaxNativeAdImage maxNativeAdImage) {
            this.f10325f = maxNativeAdImage;
            return this;
        }

        public Builder setIconView(View view) {
            this.f10326g = view;
            return this;
        }

        public Builder setMainImage(MaxNativeAdImage maxNativeAdImage) {
            this.f10329j = maxNativeAdImage;
            return this;
        }

        public Builder setMediaContentAspectRatio(float f10) {
            this.f10330k = f10;
            return this;
        }

        public Builder setMediaView(View view) {
            this.f10328i = view;
            return this;
        }

        public Builder setOptionsView(View view) {
            this.f10327h = view;
            return this;
        }

        public Builder setStarRating(Double d10) {
            this.f10331l = d10;
            return this;
        }

        public Builder setTitle(String str) {
            this.f10321b = str;
            return this;
        }
    }

    public static class MaxNativeAdImage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Drawable f10332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Uri f10333b;

        public MaxNativeAdImage(Drawable drawable) {
            this.f10332a = drawable;
        }

        @Nullable
        public Drawable getDrawable() {
            return this.f10332a;
        }

        @Nullable
        public Uri getUri() {
            return this.f10333b;
        }

        public MaxNativeAdImage(Uri uri) {
            this.f10333b = uri;
        }
    }

    public boolean isContainerClickable() {
        return false;
    }

    public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
        return false;
    }

    @Deprecated
    public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
    }

    public void setExpired() {
        this.isExpired = true;
    }

    public boolean shouldPrepareViewForInteractionOnMainThread() {
        return true;
    }

    @Nullable
    public final String getAdvertiser() {
        return this.advertiser;
    }

    @Nullable
    public final String getBody() {
        return this.body;
    }

    @Nullable
    public final String getCallToAction() {
        return this.callToAction;
    }

    @NonNull
    public final MaxAdFormat getFormat() {
        return this.format;
    }

    @Nullable
    public final MaxNativeAdImage getIcon() {
        return this.icon;
    }

    @Nullable
    public final View getIconView() {
        return this.iconView;
    }

    @Nullable
    public final MaxNativeAdImage getMainImage() {
        return this.mainImage;
    }

    public final float getMediaContentAspectRatio() {
        return this.mediaContentAspectRatio;
    }

    @Nullable
    public final View getMediaView() {
        return this.mediaView;
    }

    @Nullable
    public final View getOptionsView() {
        return this.optionsView;
    }

    @Nullable
    public final Double getStarRating() {
        return this.starRating;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    @UiThread
    public void performClick() {
        Button callToActionButton;
        MaxNativeAdView maxNativeAdView = this.nativeAdView;
        if (maxNativeAdView == null || (callToActionButton = maxNativeAdView.getCallToActionButton()) == null) {
            return;
        }
        callToActionButton.performClick();
    }

    public void setNativeAdView(MaxNativeAdView maxNativeAdView) {
        this.nativeAdView = maxNativeAdView;
    }

    public MaxNativeAd(Builder builder) {
        this.format = builder.f10320a;
        this.title = builder.f10321b;
        this.advertiser = builder.f10322c;
        this.body = builder.f10323d;
        this.callToAction = builder.f10324e;
        this.icon = builder.f10325f;
        this.iconView = builder.f10326g;
        this.optionsView = builder.f10327h;
        this.mediaView = builder.f10328i;
        this.mainImage = builder.f10329j;
        this.mediaContentAspectRatio = builder.f10330k;
        Double d10 = builder.f10331l;
        this.starRating = (d10 == null || d10.doubleValue() < 3.0d) ? null : d10;
    }
}
