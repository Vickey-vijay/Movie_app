package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f18787a;

    public w(x xVar) {
        this.f18787a = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18787a.f18795a.getClass();
        com.fyber.inneractive.sdk.util.r.f18607b.post(new v("Image failed to download."));
        this.f18787a.f18795a.a(com.fyber.inneractive.sdk.mraid.k.STORE_PICTURE, "Error downloading and saving image file.");
        IAlog.a("failed to download and save the image file.", new Object[0]);
    }
}
