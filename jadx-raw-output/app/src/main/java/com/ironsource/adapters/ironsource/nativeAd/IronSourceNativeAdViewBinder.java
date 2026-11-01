package com.ironsource.adapters.ironsource.nativeAd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import ck.p;
import com.ironsource.F8;
import com.ironsource.G8;
import com.ironsource.I8;
import com.ironsource.J8;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdOptionsPosition;
import com.ironsource.mediationsdk.adunit.adapter.utility.NativeAdProperties;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.mediation.R;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class IronSourceNativeAdViewBinder extends AdapterNativeAdViewBinder {
    private final I8 nativeAd;
    private final NativeAdProperties nativeAdProperties;
    private F8 networkNativeAdView;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdOptionsPosition.values().length];
            try {
                iArr[AdOptionsPosition.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdOptionsPosition.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdOptionsPosition.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdOptionsPosition.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public IronSourceNativeAdViewBinder(I8 i10, NativeAdProperties nativeAdProperties) {
        p.j(i10, "nativeAd");
        p.j(nativeAdProperties, "nativeAdProperties");
        this.nativeAd = i10;
        this.nativeAdProperties = nativeAdProperties;
    }

    @SuppressLint({"RtlHardcoded"})
    private final FrameLayout.LayoutParams getPrivacyIconLayoutParams() {
        int i10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.nativeAdProperties.getAdOptionsPosition().ordinal()];
        if (i11 == 1) {
            i10 = 51;
        } else if (i11 == 2) {
            i10 = 53;
        } else if (i11 == 3) {
            i10 = 83;
        } else {
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = 85;
        }
        layoutParams.gravity = i10;
        return layoutParams;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinderInterface
    public F8 getNetworkNativeAdView() {
        return this.networkNativeAdView;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinderInterface
    public void setNativeAdView(View view) {
        if (view == null) {
            IronLog.INTERNAL.error("nativeAdView is null");
            return;
        }
        if (this.nativeAd.c() == null) {
            IronLog.INTERNAL.error("nativeAd.adData is null");
            return;
        }
        LevelPlayMediaView mediaView = getNativeAdViewHolder().getMediaView();
        if (mediaView != null) {
            G8 g8C = this.nativeAd.c();
            p.g(g8C);
            WebView webViewL = g8C.l();
            if (webViewL != null) {
                mediaView.addView(webViewL, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        G8 g8C2 = this.nativeAd.c();
        p.g(g8C2);
        View viewM = g8C2.m();
        viewM.setId(R.id.privacy_icon_button);
        viewM.setLayoutParams(getPrivacyIconLayoutParams());
        Context context = view.getContext();
        p.i(context, GAMConfig.KEY_CONTEXT);
        F8 f10 = new F8(context);
        f10.addView(view);
        f10.addView(viewM);
        this.networkNativeAdView = f10;
        F8 networkNativeAdView = getNetworkNativeAdView();
        p.g(networkNativeAdView);
        this.nativeAd.a(new J8(networkNativeAdView, getNativeAdViewHolder().getTitleView(), getNativeAdViewHolder().getAdvertiserView(), getNativeAdViewHolder().getIconView(), getNativeAdViewHolder().getBodyView(), getNativeAdViewHolder().getMediaView(), getNativeAdViewHolder().getCallToActionView(), viewM));
    }
}
