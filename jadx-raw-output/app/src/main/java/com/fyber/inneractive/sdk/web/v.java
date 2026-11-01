package com.fyber.inneractive.sdk.web;

import android.widget.Toast;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f18760a;

    public v(String str) {
        this.f18760a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(com.fyber.inneractive.sdk.util.o.f18599a, this.f18760a, 0).show();
    }
}
