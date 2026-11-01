package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import com.fyber.inneractive.sdk.util.g1;

/* JADX INFO: loaded from: classes9.dex */
public final class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f15759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f15761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g f15762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f15763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.click.o f15764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0 f15765g;

    public y(b0 b0Var, Context context, String str, g1 g1Var, com.fyber.inneractive.sdk.util.g gVar, boolean z10, com.fyber.inneractive.sdk.click.o oVar) {
        this.f15765g = b0Var;
        this.f15759a = context;
        this.f15760b = str;
        this.f15761c = g1Var;
        this.f15762d = gVar;
        this.f15763e = z10;
        this.f15764f = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15765g.a(this.f15759a, this.f15760b, this.f15761c, this.f15762d, this.f15763e, this.f15764f);
    }
}
