package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: loaded from: classes7.dex */
public interface E6 {
    void a(Activity activity);

    void a(C3712t6 c3712t6);

    void a(C3712t6 c3712t6, IronSourceError ironSourceError);

    void a(C3712t6 c3712t6, LevelPlayAdInfo levelPlayAdInfo);

    void b(C3712t6 c3712t6, IronSourceError ironSourceError);

    void b(C3712t6 c3712t6, LevelPlayAdInfo levelPlayAdInfo);

    void c(C3712t6 c3712t6, LevelPlayAdInfo levelPlayAdInfo);

    void loadAd();
}
