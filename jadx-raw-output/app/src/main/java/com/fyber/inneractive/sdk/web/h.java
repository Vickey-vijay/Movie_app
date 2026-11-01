package com.fyber.inneractive.sdk.web;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.util.g1 f18678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f18679c;

    @Override // com.fyber.inneractive.sdk.web.f
    public final String a() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final void b() {
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final String c() {
        return "open";
    }

    public h(i iVar, String str, com.fyber.inneractive.sdk.util.g1 g1Var) {
        this.f18679c = iVar;
        this.f18678b = g1Var;
        this.f18677a = str;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final void d() {
        i iVar = this.f18679c;
        String str = this.f18677a;
        com.fyber.inneractive.sdk.util.g1 g1Var = this.f18678b;
        j1 j1Var = iVar.f18687g;
        if (j1Var != null) {
            com.fyber.inneractive.sdk.util.g0 g0Var = j1Var.a(str, g1Var).f18572a;
        }
    }

    public final String toString() {
        return "action: open url: " + this.f18677a;
    }
}
