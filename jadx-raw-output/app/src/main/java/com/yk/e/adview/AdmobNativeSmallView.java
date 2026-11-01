package com.yk.e.adview;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.ironsource.C3426d4;
import com.yk.e.util.IDUtil;
import d.f;
import io.appmetrica.analytics.impl.A2;

/* JADX INFO: loaded from: classes3.dex */
public class AdmobNativeSmallView extends FrameLayout {
    public NativeAdView I1I;
    public final int IL1Iii;
    public ConstraintLayout ILL;
    public f ILil;
    public TextView Ilil;

    /* JADX INFO: renamed from: I丨L, reason: contains not printable characters */
    public TextView f3330IL;

    /* JADX INFO: renamed from: I丨iL, reason: contains not printable characters */
    public ImageView f3331IiL;

    /* JADX INFO: renamed from: L丨1丨1丨I, reason: contains not printable characters */
    public MediaView f3332L11I;

    /* JADX INFO: renamed from: iI丨LLL1, reason: contains not printable characters */
    public TextView f3333iILLL1;

    /* JADX INFO: renamed from: l丨Li1LL, reason: contains not printable characters */
    public RatingBar f3334lLi1LL;

    /* JADX INFO: renamed from: 丨il, reason: contains not printable characters */
    public Button f3335il;

    public AdmobNativeSmallView(Context context) {
        super(context);
    }

    public AdmobNativeSmallView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int layoutID = IDUtil.getLayoutID(context, "main_layout_native_adm_small");
        this.IL1Iii = layoutID;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(layoutID, this);
    }

    public NativeAdView getNativeAdView() {
        return this.I1I;
    }

    public void setStyles(f fVar) {
        this.ILil = fVar;
        ColorDrawable colorDrawable = fVar.f51764a;
        if (colorDrawable != null) {
            this.ILL.setBackground(colorDrawable);
            TextView textView = this.f3330IL;
            if (textView != null) {
                textView.setBackground(colorDrawable);
            }
            TextView textView2 = this.Ilil;
            if (textView2 != null) {
                textView2.setBackground(colorDrawable);
            }
            TextView textView3 = this.f3333iILLL1;
            if (textView3 != null) {
                textView3.setBackground(colorDrawable);
            }
        }
        this.ILil.getClass();
        this.ILil.getClass();
        this.ILil.getClass();
        this.ILil.getClass();
        this.ILil.getClass();
        this.ILil.getClass();
        this.ILil.getClass();
        this.ILil.getClass();
        this.ILil.getClass();
        this.ILil.getClass();
        this.ILil.getClass();
        this.ILil.getClass();
        this.ILil.getClass();
        this.ILil.getClass();
        this.ILil.getClass();
        this.ILil.getClass();
        invalidate();
        requestLayout();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.I1I = (NativeAdView) findViewById(IDUtil.getViewID(getContext(), "native_ad_view"));
        this.f3330IL = (TextView) findViewById(IDUtil.getViewID(getContext(), "primary"));
        this.Ilil = (TextView) findViewById(IDUtil.getViewID(getContext(), C3426d4.i.Y));
        this.f3333iILLL1 = (TextView) findViewById(IDUtil.getViewID(getContext(), "body"));
        RatingBar ratingBar = (RatingBar) findViewById(IDUtil.getViewID(getContext(), "rating_bar"));
        this.f3334lLi1LL = ratingBar;
        ratingBar.setEnabled(false);
        this.f3335il = (Button) findViewById(IDUtil.getViewID(getContext(), "cta"));
        this.f3331IiL = (ImageView) findViewById(IDUtil.getViewID(getContext(), "icon"));
        this.f3332L11I = (MediaView) findViewById(IDUtil.getViewID(getContext(), "media_view"));
        this.ILL = (ConstraintLayout) findViewById(IDUtil.getViewID(getContext(), A2.f54950g));
    }

    public void setNativeAd(NativeAd nativeAd) {
        String store = nativeAd.getStore();
        String advertiser = nativeAd.getAdvertiser();
        String headline = nativeAd.getHeadline();
        String body = nativeAd.getBody();
        String callToAction = nativeAd.getCallToAction();
        Double starRating = nativeAd.getStarRating();
        NativeAd.Image icon = nativeAd.getIcon();
        this.I1I.setCallToActionView(this.f3335il);
        this.I1I.setHeadlineView(this.f3330IL);
        this.I1I.setMediaView(this.f3332L11I);
        this.Ilil.setVisibility(0);
        String store2 = nativeAd.getStore();
        String advertiser2 = nativeAd.getAdvertiser();
        if (!TextUtils.isEmpty(store2) && TextUtils.isEmpty(advertiser2)) {
            this.I1I.setStoreView(this.Ilil);
        } else if (!TextUtils.isEmpty(advertiser)) {
            this.I1I.setAdvertiserView(this.Ilil);
            store = advertiser;
        } else {
            store = "";
        }
        this.f3330IL.setText(headline);
        this.f3335il.setText(callToAction);
        if (starRating != null && starRating.doubleValue() > 0.0d) {
            this.Ilil.setVisibility(8);
            this.f3334lLi1LL.setVisibility(0);
            this.f3334lLi1LL.setRating(starRating.floatValue());
            this.I1I.setStarRatingView(this.f3334lLi1LL);
        } else {
            this.Ilil.setText(store);
            this.Ilil.setVisibility(0);
            this.f3334lLi1LL.setVisibility(8);
        }
        if (icon != null) {
            this.f3331IiL.setVisibility(0);
            this.f3331IiL.setImageDrawable(icon.getDrawable());
        } else {
            this.f3331IiL.setVisibility(8);
        }
        TextView textView = this.f3333iILLL1;
        if (textView != null) {
            textView.setText(body);
            this.I1I.setBodyView(this.f3333iILLL1);
        }
        this.I1I.setNativeAd(nativeAd);
    }

    public AdmobNativeSmallView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int layoutID = IDUtil.getLayoutID(context, "main_layout_native_adm_small");
        this.IL1Iii = layoutID;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(layoutID, this);
    }
}
