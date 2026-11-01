package com.mbridge.msdk.mbnative.cache;

import com.mbridge.msdk.out.Campaign;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: NativeCacheFactory.java */
/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<Integer, b<String, List<Campaign>>> f35807a = new HashMap();

    public static b<String, List<Campaign>> a(int i10) {
        if (f35807a.containsKey(Integer.valueOf(i10))) {
            return f35807a.get(Integer.valueOf(i10));
        }
        a aVar = new a(i10);
        f35807a.put(Integer.valueOf(i10), aVar);
        return aVar;
    }
}
