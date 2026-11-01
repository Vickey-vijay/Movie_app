package com.unity3d.ironsourceads.interstitial;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import ck.p;
import com.ironsource.C3766w9;
import com.ironsource.InterfaceC3783x9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes10.dex */
public final class InterstitialAd implements InterfaceC3783x9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3766w9 f45271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterstitialAdListener f45272b;

    @Override // com.ironsource.InterfaceC3783x9
    public void onAdInstanceDidReward(String str, int i10) {
    }

    public InterstitialAd(C3766w9 c3766w9) {
        p.j(c3766w9, "interstitialAdInternal");
        this.f45271a = c3766w9;
        c3766w9.a(this);
    }

    public final InterstitialAdInfo getAdInfo() {
        return this.f45271a.b();
    }

    public final InterstitialAdListener getListener() {
        return this.f45272b;
    }

    public final boolean isReadyToShow() {
        IronLog.API.info();
        return this.f45271a.d();
    }

    @Override // com.ironsource.InterfaceC3783x9
    public void onAdInstanceDidBecomeVisible() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdShown adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f45272b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    @Override // com.ironsource.InterfaceC3783x9
    public void onAdInstanceDidClick() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdClicked adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f45272b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdClicked(this);
        }
    }

    @Override // com.ironsource.InterfaceC3783x9
    public void onAdInstanceDidDismiss() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdDismissed adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f45272b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdDismissed(this);
        }
    }

    @Override // com.ironsource.InterfaceC3783x9
    public void onAdInstanceDidFailedToShow(IronSourceError ironSourceError) {
        p.j(ironSourceError, "error");
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdFailedToShow error : " + ironSourceError + " adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f45272b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdFailedToShow(this, ironSourceError);
        }
    }

    @Override // com.ironsource.InterfaceC3783x9
    public void onAdInstanceDidShow() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdShown adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f45272b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    public final void setListener(InterstitialAdListener interstitialAdListener) {
        this.f45272b = interstitialAdListener;
    }

    public final void show(Activity activity) {
        p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        IronLog.API.info();
        this.f45271a.a(activity);
    }
}
