package com.fyber.inneractive.sdk.player.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f17962a = new u();

    public abstract int a();

    public abstract int a(Object obj);

    public abstract v a(int i10, v vVar, boolean z10);

    public abstract w a(int i10, w wVar, long j10);

    public abstract int b();

    public final w a(int i10, w wVar) {
        return a(i10, wVar, 0L);
    }

    public final boolean c() {
        if (b() == 0) {
            return true;
        }
        return false;
    }
}
