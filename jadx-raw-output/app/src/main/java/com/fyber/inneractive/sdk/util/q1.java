package com.fyber.inneractive.sdk.util;

import com.ironsource.Q6;

/* JADX INFO: loaded from: classes5.dex */
public final class q1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f18604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f18605b;

    public q1(s1 s1Var, String str) {
        this.f18605b = s1Var;
        this.f18604a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18605b.f18616c.getSharedPreferences("fyber.ua", 0).edit().putString(Q6.f27422d0, this.f18604a).apply();
    }
}
