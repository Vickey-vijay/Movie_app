package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.ironsource.pa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3649pa {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C3649pa f30453c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet<ImpressionDataListener> f30454a = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, List<String>> f30455b = new ConcurrentHashMap<>();

    public static synchronized C3649pa b() {
        if (f30453c == null) {
            f30453c = new C3649pa();
        }
        return f30453c;
    }

    public HashSet<ImpressionDataListener> a() {
        return this.f30454a;
    }

    public void d() {
        synchronized (this) {
            this.f30454a.clear();
        }
    }

    public void a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f30454a.add(impressionDataListener);
        }
    }

    public ConcurrentHashMap<String, List<String>> c() {
        return this.f30455b;
    }

    public void b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f30454a.remove(impressionDataListener);
        }
    }

    public void a(String str, List<String> list) {
        this.f30455b.put(str, list);
    }
}
