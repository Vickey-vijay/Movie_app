package com.fyber.inneractive.sdk.flow.storepromo.model;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f15665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15667c;

    public a(String str, b bVar) {
        this.f15666b = str;
        this.f15665a = bVar;
        this.f15667c = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f15667c - ((a) obj).f15667c;
    }

    public a(String str, b bVar, int i10) {
        this.f15666b = str;
        this.f15665a = bVar;
        this.f15667c = i10;
    }
}
