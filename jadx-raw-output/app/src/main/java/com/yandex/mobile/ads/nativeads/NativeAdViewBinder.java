package com.yandex.mobile.ads.nativeads;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ck.i;
import ck.p;
import com.ironsource.C3426d4;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class NativeAdViewBinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f51069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f51070b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f51071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final LinkedHashMap f51072b;

        public Builder(View view) {
            this.f51071a = view;
            this.f51072b = new LinkedHashMap();
        }

        public final NativeAdViewBinder build() {
            return new NativeAdViewBinder(this.f51071a, this.f51072b, null);
        }

        public final Builder setBodyView(TextView textView) {
            this.f51072b.put("body", textView);
            return this;
        }

        public final Builder setCallToActionView(TextView textView) {
            this.f51072b.put("call_to_action", textView);
            return this;
        }

        public final Builder setDomainView(TextView textView) {
            this.f51072b.put(C3426d4.j.D, textView);
            return this;
        }

        public final Builder setFeedbackView(ImageView imageView) {
            this.f51072b.put("feedback", imageView);
            return this;
        }

        public final Builder setIconView(ImageView imageView) {
            this.f51072b.put("icon", imageView);
            return this;
        }

        public final Builder setMediaView(MediaView mediaView) {
            this.f51072b.put(C3426d4.i.I0, mediaView);
            return this;
        }

        public final Builder setTitleView(TextView textView) {
            this.f51072b.put("title", textView);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(NativeAdView nativeAdView) {
            this((View) nativeAdView);
            p.h(nativeAdView, "null cannot be cast to non-null type android.view.View");
        }
    }

    public /* synthetic */ NativeAdViewBinder(View view, Map map, i iVar) {
        this(view, map);
    }

    private NativeAdViewBinder(View view, Map map) {
        this.f51069a = view;
        this.f51070b = map;
    }

    public Map<String, View> getAssetViews() {
        return this.f51070b;
    }

    public final View getNativeAdView() {
        return this.f51069a;
    }

    public TextView getAgeView() {
        View view = getAssetViews().get("age");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    public TextView getBodyView() {
        View view = getAssetViews().get("body");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    public TextView getCallToActionView() {
        View view = getAssetViews().get("call_to_action");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    public TextView getDomainView() {
        View view = getAssetViews().get(C3426d4.j.D);
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    public ImageView getFaviconView() {
        View view = getAssetViews().get("favicon");
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        return null;
    }

    public ImageView getFeedbackView() {
        View view = getAssetViews().get("feedback");
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        return null;
    }

    public ImageView getIconView() {
        View view = getAssetViews().get("icon");
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        return null;
    }

    public MediaView getMediaView() {
        View view = getAssetViews().get(C3426d4.i.I0);
        if (view instanceof MediaView) {
            return (MediaView) view;
        }
        return null;
    }

    public TextView getPriceView() {
        View view = getAssetViews().get("price");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    public View getRatingView() {
        return getAssetViews().get("rating");
    }

    public TextView getReviewCountView() {
        View view = getAssetViews().get("review_count");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    public TextView getSponsoredView() {
        View view = getAssetViews().get("sponsored");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    public TextView getTitleView() {
        View view = getAssetViews().get("title");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    public TextView getWarningView() {
        View view = getAssetViews().get("warning");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }
}
