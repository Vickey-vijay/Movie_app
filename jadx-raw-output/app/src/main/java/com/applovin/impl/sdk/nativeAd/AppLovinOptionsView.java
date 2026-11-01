package com.applovin.impl.sdk.nativeAd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.impl.k7;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public class AppLovinOptionsView extends FrameLayout implements View.OnClickListener {
    private final AppLovinNativeAdImpl nativeAd;
    private final Uri privacyDestinationUri;
    private final com.applovin.impl.sdk.k sdk;

    public void destroy() {
        setOnClickListener(null);
        removeAllViews();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44955a, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.nativeAd.isCustomTabsEnabled()) {
            this.sdk.z().a(this.privacyDestinationUri, this.nativeAd, this.sdk.u0());
        } else {
            k7.a(this.privacyDestinationUri, com.applovin.impl.sdk.k.o(), this.sdk);
        }
    }

    public AppLovinOptionsView(AppLovinNativeAdImpl appLovinNativeAdImpl, com.applovin.impl.sdk.k kVar, Context context) {
        super(context);
        this.nativeAd = appLovinNativeAdImpl;
        this.sdk = kVar;
        this.privacyDestinationUri = appLovinNativeAdImpl.getPrivacyDestinationUri();
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Uri privacyIconUri = appLovinNativeAdImpl.getPrivacyIconUri();
        if (privacyIconUri != null) {
            ImageViewUtils.setImageUri(imageView, privacyIconUri, kVar);
        } else {
            imageView.setImageResource(R.drawable.applovin_ic_privacy_icon_layered_list);
        }
        addView(imageView);
        setOnClickListener(this);
    }
}
