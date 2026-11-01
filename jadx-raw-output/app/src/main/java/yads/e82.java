package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class e82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f76977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f76978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f76979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f76980e;

    public static List a(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new q01((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    public e82(int i10, byte[] bArr, Map map, List list, boolean z10) {
        this.f76976a = i10;
        this.f76977b = bArr;
        this.f76978c = map;
        if (list == null) {
            this.f76979d = null;
        } else {
            this.f76979d = Collections.unmodifiableList(list);
        }
        this.f76980e = z10;
    }

    public static Map a(List list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q01 q01Var = (q01) it.next();
            treeMap.put(q01Var.f81668a, q01Var.f81669b);
        }
        return treeMap;
    }
}
