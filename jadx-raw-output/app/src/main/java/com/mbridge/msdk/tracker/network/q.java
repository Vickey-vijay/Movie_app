package com.mbridge.msdk.tracker.network;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: NetworkResponse.java */
/* JADX INFO: loaded from: classes6.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f38221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f38222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<g> f38223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f38224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f38225f;

    public q(int i10, byte[] bArr, boolean z10, long j10, List<g> list) {
        this(i10, bArr, a(list), list, z10, j10);
    }

    private q(int i10, byte[] bArr, Map<String, String> map, List<g> list, boolean z10, long j10) {
        this.f38220a = i10;
        this.f38221b = bArr;
        this.f38222c = map;
        if (list == null) {
            this.f38223d = null;
        } else {
            this.f38223d = Collections.unmodifiableList(list);
        }
        this.f38224e = z10;
        this.f38225f = j10;
    }

    private static Map<String, String> a(List<g> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (g gVar : list) {
            treeMap.put(gVar.a(), gVar.b());
        }
        return treeMap;
    }
}
