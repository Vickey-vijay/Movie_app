package com.ironsource.mediationsdk.ads.nativead.internal;

import android.view.View;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;

/* JADX INFO: loaded from: classes11.dex */
public final class NativeAdViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f29559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f29560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f29561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f29562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LevelPlayMediaView f29563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f29564f;

    public final View getAdvertiserView() {
        return this.f29560b;
    }

    public final View getBodyView() {
        return this.f29562d;
    }

    public final View getCallToActionView() {
        return this.f29564f;
    }

    public final View getIconView() {
        return this.f29561c;
    }

    public final LevelPlayMediaView getMediaView() {
        return this.f29563e;
    }

    public final View getTitleView() {
        return this.f29559a;
    }

    public final void setAdvertiserView(View view) {
        this.f29560b = view;
    }

    public final void setBodyView(View view) {
        this.f29562d = view;
    }

    public final void setCallToActionView(View view) {
        this.f29564f = view;
    }

    public final void setIconView(View view) {
        this.f29561c = view;
    }

    public final void setMediaView(LevelPlayMediaView levelPlayMediaView) {
        this.f29563e = levelPlayMediaView;
    }

    public final void setTitleView(View view) {
        this.f29559a = view;
    }
}
