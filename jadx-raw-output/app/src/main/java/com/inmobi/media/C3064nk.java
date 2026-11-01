package com.inmobi.media;

import java.util.TimerTask;

/* JADX INFO: renamed from: com.inmobi.media.nk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3064nk extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3089ok f24909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte f24910b;

    public C3064nk(C3089ok c3089ok, byte b10) {
        this.f24909a = c3089ok;
        this.f24910b = b10;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f24909a.b(this.f24910b);
    }
}
