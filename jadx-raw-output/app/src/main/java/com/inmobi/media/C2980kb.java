package com.inmobi.media;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: renamed from: com.inmobi.media.kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2980kb implements GoogleApiClient.ConnectionCallbacks {
    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        C3030mb.f24825f = false;
        ck.p.i(C3030mb.f24824e, "access$getTAG$p(...)");
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        ck.p.i(C3030mb.f24824e, "access$getTAG$p(...)");
        C3030mb.f24825f = true;
    }
}
