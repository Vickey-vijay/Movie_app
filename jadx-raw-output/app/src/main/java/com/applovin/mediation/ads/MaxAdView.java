package com.applovin.mediation.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.e8;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.s;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.sdk.AppLovinSdk;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes7.dex */
public class MaxAdView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MaxAdViewImpl f10310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f10311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10312c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V");
        CreativeInfoManager.onMaxAdViewCreated(this, getAdFormat(), getAdUnitId());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxAdView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V");
        CreativeInfoManager.onMaxAdViewCreated(this, getAdFormat(), getAdUnitId());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxAdView(String str) {
        this(str, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;)V");
        CreativeInfoManager.onMaxAdViewCreated(this, getAdFormat(), getAdUnitId());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public MaxAdView(String str, Context context) {
        this(str, context, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Landroid/content/Context;)V");
        CreativeInfoManager.onMaxAdViewCreated(this, getAdFormat(), getAdUnitId());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxAdView(String str, MaxAdFormat maxAdFormat) {
        this(str, maxAdFormat, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;)V");
        CreativeInfoManager.onMaxAdViewCreated(this, getAdFormat(), getAdUnitId());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public MaxAdView(String str, MaxAdFormat maxAdFormat, Context context) {
        this(str, maxAdFormat, context, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;Landroid/content/Context;)V");
        CreativeInfoManager.onMaxAdViewCreated(this, getAdFormat(), getAdUnitId());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxAdView(String str, MaxAdFormat maxAdFormat, @Nullable MaxAdViewConfiguration maxAdViewConfiguration) {
        this(str, maxAdFormat, maxAdViewConfiguration, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;Lcom/applovin/mediation/MaxAdViewConfiguration;)V");
        CreativeInfoManager.onMaxAdViewCreated(this, getAdFormat(), getAdUnitId());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public MaxAdView(String str, MaxAdFormat maxAdFormat, AppLovinSdk appLovinSdk, Context context) {
        this(str, maxAdFormat, appLovinSdk, context, null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;Lcom/applovin/sdk/AppLovinSdk;Landroid/content/Context;)V");
        CreativeInfoManager.onMaxAdViewCreated(this, getAdFormat(), getAdUnitId());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxAdView(String str, @Nullable MaxAdViewConfiguration maxAdViewConfiguration) {
        this(str, maxAdViewConfiguration, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdViewConfiguration;)V");
        CreativeInfoManager.onMaxAdViewCreated(this, getAdFormat(), getAdUnitId());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public MaxAdView(String str, AppLovinSdk appLovinSdk, Context context) {
        this(str, appLovinSdk, context, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/sdk/AppLovinSdk;Landroid/content/Context;)V");
        CreativeInfoManager.onMaxAdViewCreated(this, getAdFormat(), getAdUnitId());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxAdView(String p10, StatsEvent p11) {
        this(p10, (MaxAdViewConfiguration) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;)V" == 0) {
        } else {
            this(p10, (MaxAdViewConfiguration) null);
        }
    }

    private void a(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration, int i10, Context context) {
        View view = new View(context.getApplicationContext());
        this.f10311b = view;
        view.setBackgroundColor(0);
        addView(this.f10311b);
        this.f10311b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f10312c = getVisibility();
        this.f10310a = new MaxAdViewImpl(str.trim(), maxAdFormat, maxAdViewConfiguration, this, this.f10311b, context);
        setGravity(i10);
        if (getBackground() instanceof ColorDrawable) {
            setBackgroundColor(((ColorDrawable) getBackground()).getColor());
        }
        super.setBackgroundColor(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44955a, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxAdView(String p10, MaxAdFormat p11, StatsEvent p12) {
        this(p10, p11, (MaxAdViewConfiguration) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;)V" == 0) {
        } else {
            this(p10, p11, (MaxAdViewConfiguration) null);
        }
    }

    public void destroy() {
        this.f10310a.logApiCall("destroy()");
        this.f10310a.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.f10310a.getAdFormat();
    }

    public String getAdUnitId() {
        return this.f10310a.getAdUnitId();
    }

    public String getPlacement() {
        this.f10310a.logApiCall("getPlacement()");
        return this.f10310a.getPlacement();
    }

    public void loadAd() {
        this.f10310a.logApiCall("loadAd()");
        this.f10310a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f10310a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f10310a.setAdReviewListener(maxAdReviewListener);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        this.f10310a.logApiCall("setAlpha(alpha=" + f10 + ")");
        View view = this.f10311b;
        if (view != null) {
            view.setAlpha(f10);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f10310a.logApiCall("setBackgroundColor(color=" + i10 + ")");
        MaxAdViewImpl maxAdViewImpl = this.f10310a;
        if (maxAdViewImpl != null) {
            maxAdViewImpl.setPublisherBackgroundColor(i10);
        }
        View view = this.f10311b;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setCustomData(String str) {
        this.f10310a.logApiCall("setCustomData(value=" + str + ")");
        this.f10310a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f10310a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f10310a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdViewAdListener maxAdViewAdListener) {
        this.f10310a.logApiCall("setListener(listener=" + maxAdViewAdListener + ")");
        this.f10310a.setListener(maxAdViewAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f10310a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f10310a.setLocalExtraParameter(str, obj);
    }

    public void setPlacement(String str) {
        this.f10310a.logApiCall("setPlacement(placement=" + str + ")");
        this.f10310a.setPlacement(str);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f10310a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f10310a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f10310a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f10310a.setRevenueListener(maxAdRevenueListener);
    }

    public void startAutoRefresh() {
        this.f10310a.logApiCall("startAutoRefresh()");
        this.f10310a.startAutoRefresh();
    }

    public void stopAutoRefresh() {
        this.f10310a.logApiCall("stopAutoRefresh()");
        this.f10310a.stopAutoRefresh();
    }

    @Override // android.view.View
    @NonNull
    public String toString() {
        MaxAdViewImpl maxAdViewImpl = this.f10310a;
        return maxAdViewImpl != null ? maxAdViewImpl.toString() : "MaxAdView";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxAdView(String p10, MaxAdViewConfiguration p11, StatsEvent p12) {
        this(p10, s.a(k.o()), p11);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdViewConfiguration;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdViewConfiguration;)V" == 0) {
        } else {
            this(p10, s.a(k.o()), p11);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (!isInEditMode()) {
            this.f10310a.logApiCall("onWindowVisibilityChanged(visibility=" + i10 + ")");
            if (this.f10310a != null && e8.a(this.f10312c, i10)) {
                this.f10310a.onWindowVisibilityChanged(i10);
            }
            this.f10312c = i10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private MaxAdView(String p10, MaxAdFormat p11, MaxAdViewConfiguration p12, StatsEvent p13) {
        super(k.o());
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;Lcom/applovin/mediation/MaxAdViewConfiguration;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;Lcom/applovin/mediation/MaxAdViewConfiguration;)V" == 0) {
            return;
        }
        super(k.o());
        a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + p10 + ", adFormat=" + p11 + ", configuration=" + p12 + ")");
        a(p10, p11, p12, 49, k.o());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxAdView(Context p10, AttributeSet p11, StatsEvent p12) {
        this(p10, p11, 0);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V" == 0) {
        } else {
            this(p10, p11, 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private MaxAdView(Context p10, AttributeSet p11, int p12, StatsEvent p13) {
        MaxAdFormat maxAdFormatA;
        super(p10, p11, p12);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V" == 0) {
            return;
        }
        super(p10, p11, p12);
        String strA = s.a(p10, p11, AppLovinAdView.NAMESPACE, "adUnitId");
        String strA2 = s.a(p10, p11, AppLovinAdView.NAMESPACE, "adFormat");
        if (StringUtils.isValidString(strA2)) {
            maxAdFormatA = MaxAdFormat.formatFromString(strA2);
        } else {
            maxAdFormatA = s.a(p10);
        }
        MaxAdFormat maxAdFormat = maxAdFormatA;
        int attributeIntValue = p11.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 49);
        if (strA != null) {
            if (!TextUtils.isEmpty(strA)) {
                if (isInEditMode()) {
                    a(p10);
                    return;
                } else {
                    a(strA, maxAdFormat, null, attributeIntValue, p10);
                    return;
                }
            }
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    private void a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE));
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setText("AppLovin MAX Ad");
        textView.setGravity(17);
        addView(textView, i10, i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxAdView(String p10, Context p11, StatsEvent p12) {
        this(p10, AppLovinSdk.getInstance(p11), p11);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Landroid/content/Context;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Landroid/content/Context;)V" == 0) {
        } else {
            this(p10, AppLovinSdk.getInstance(p11), p11);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxAdView(String p10, AppLovinSdk p11, Context p12, StatsEvent p13) {
        this(p10, s.a(p12), p12);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/sdk/AppLovinSdk;Landroid/content/Context;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/sdk/AppLovinSdk;Landroid/content/Context;)V" == 0) {
        } else {
            this(p10, s.a(p12), p12);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxAdView(String p10, MaxAdFormat p11, Context p12, StatsEvent p13) {
        this(p10, p11, AppLovinSdk.getInstance(p12), p12);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;Landroid/content/Context;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;Landroid/content/Context;)V" == 0) {
        } else {
            this(p10, p11, AppLovinSdk.getInstance(p12), p12);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private MaxAdView(String p10, MaxAdFormat p11, AppLovinSdk p12, Context p13, StatsEvent p14) {
        super(p13);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;Lcom/applovin/sdk/AppLovinSdk;Landroid/content/Context;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;Lcom/applovin/sdk/AppLovinSdk;Landroid/content/Context;)V" == 0) {
            return;
        }
        super(p13);
        a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + p10 + ", adFormat=" + p11 + ")");
        a(p10, p11, null, 49, p13);
    }
}
