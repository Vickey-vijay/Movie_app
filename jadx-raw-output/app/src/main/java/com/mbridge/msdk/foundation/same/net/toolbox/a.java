package com.mbridge.msdk.foundation.same.net.toolbox;

import com.mbridge.msdk.tracker.network.g;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: NetworkResponse.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f35011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<g> f35012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f35013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f35014d;

    public a(int i10, byte[] bArr, List<g> list) {
        this(i10, bArr, a(list), list);
    }

    private a(int i10, byte[] bArr, Map<String, String> map, List<g> list) {
        this.f35014d = i10;
        this.f35011a = bArr;
        this.f35013c = map;
        if (list == null) {
            this.f35012b = null;
        } else {
            this.f35012b = Collections.unmodifiableList(list);
        }
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
