package com.inmobi.media;

import okhttp3.Call;

/* JADX INFO: renamed from: com.inmobi.media.cl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2788cl implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Call f24201a;

    public C2788cl(Call call) {
        this.f24201a = call;
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        this.f24201a.cancel();
        return mj.r.f64562a;
    }
}
