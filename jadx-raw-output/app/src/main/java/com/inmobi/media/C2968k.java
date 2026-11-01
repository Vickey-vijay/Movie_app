package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.inmobi.media.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2968k extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (ck.p.e(intent != null ? intent.getAction() : null, "android.media.VOLUME_CHANGED_ACTION")) {
            C3118q c3118q = C3118q.f25117a;
            C3298x5.f25687a.getClass();
            if (C3298x5.w()) {
                nk.j.d(C3118q.f25123g, null, null, new C3018m(null), 3, null);
            } else {
                C3118q.a((Float) null);
            }
        }
    }
}
