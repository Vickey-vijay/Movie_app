package com.iab.omid.library.applovin.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f20972c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.applovin.adsession.a> f20973a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.applovin.adsession.a> f20974b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f20972c;
    }

    public Collection<com.iab.omid.library.applovin.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f20974b);
    }

    public void a(com.iab.omid.library.applovin.adsession.a aVar) {
        this.f20973a.add(aVar);
    }

    public Collection<com.iab.omid.library.applovin.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f20973a);
    }

    public void b(com.iab.omid.library.applovin.adsession.a aVar) {
        boolean zD = d();
        this.f20973a.remove(aVar);
        this.f20974b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.applovin.adsession.a aVar) {
        boolean zD = d();
        this.f20974b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }

    public boolean d() {
        return this.f20974b.size() > 0;
    }
}
