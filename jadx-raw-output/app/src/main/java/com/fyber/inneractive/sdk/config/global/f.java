package com.fyber.inneractive.sdk.config.global;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15087b;

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        String str = this.f15086a;
        if (str != null) {
            return str.equalsIgnoreCase("android") ? !this.f15087b : this.f15087b;
        }
        return false;
    }

    public final String toString() {
        return "os - " + this.f15086a + " include: " + this.f15087b;
    }

    public f(boolean z10, String str) {
        this.f15086a = str;
        this.f15087b = z10;
    }
}
