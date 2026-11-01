package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface N0 {
    void a();

    void a(IronSourceError ironSourceError);

    void b(LevelPlayAdInfo levelPlayAdInfo);

    default void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
    }
}
