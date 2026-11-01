package com.vungle.ads.internal.util;

import ck.p;
import java.util.HashSet;
import kotlin.Metadata;

/* JADX INFO: compiled from: CollectionsConcurrencyUtil.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0007J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0007¨\u0006\f"}, d2 = {"Lcom/vungle/ads/internal/util/CollectionsConcurrencyUtil;", "", "Ljava/util/HashSet;", "", "hashSet", "getNewHashSet", "hashset", "set", "Lmj/r;", "addToSet", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class CollectionsConcurrencyUtil {
    public static final CollectionsConcurrencyUtil INSTANCE = new CollectionsConcurrencyUtil();

    private CollectionsConcurrencyUtil() {
    }

    public static final synchronized void addToSet(HashSet<String> hashSet, String str) {
        p.j(hashSet, "hashset");
        p.j(str, "set");
        hashSet.add(str);
    }

    public static final synchronized HashSet<String> getNewHashSet(HashSet<String> hashSet) {
        return new HashSet<>(hashSet);
    }
}
