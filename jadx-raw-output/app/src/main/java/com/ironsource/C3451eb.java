package com.ironsource;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;

/* JADX INFO: renamed from: com.ironsource.eb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3451eb implements ImpressionDataListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LevelPlayImpressionDataListener f28788a;

    public C3451eb(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        ck.p.j(levelPlayImpressionDataListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f28788a = levelPlayImpressionDataListener;
    }

    public final LevelPlayImpressionDataListener a() {
        return this.f28788a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3451eb) {
            return ck.p.e(this.f28788a, ((C3451eb) obj).f28788a);
        }
        return false;
    }

    public int hashCode() {
        return this.f28788a.hashCode();
    }

    @Override // com.ironsource.mediationsdk.impressionData.ImpressionDataListener
    public void onImpressionSuccess(Z8 z10) {
        ck.p.j(z10, "impressionData");
        this.f28788a.onImpressionSuccess(new LevelPlayImpressionData(z10.d()));
    }
}
