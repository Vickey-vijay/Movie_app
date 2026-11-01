package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4528sl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dc f57685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cc f57686b;

    public C4528sl(PublicLogger publicLogger, String str) {
        this(new Dc(str, publicLogger), new Cc(str, publicLogger));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized boolean a(Gc gc2, String str, String str2) {
        int size = gc2.size();
        int i10 = this.f57685a.f55135c.f57309a;
        if (size < i10 || (i10 == gc2.size() && gc2.containsKey(str))) {
            this.f57686b.getClass();
            int length = gc2.f55265a;
            if (str2 != null) {
                length += str2.length();
            }
            if (gc2.containsKey(str)) {
                String str3 = (String) gc2.get(str);
                if (str3 != null) {
                    length -= str3.length();
                }
            } else {
                length += str.length();
            }
            if (length <= 4500) {
                gc2.put(str, str2);
                return true;
            }
            Cc cc2 = this.f57686b;
            cc2.f55094b.warning("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", cc2.f55093a, 4500, str);
        } else {
            Dc dc2 = this.f57685a;
            dc2.f55136d.warning("The %s has reached the limit of %d items. Item with key %s will be ignored", dc2.f55137e, Integer.valueOf(dc2.f55135c.f57309a), str);
        }
        return false;
    }

    public C4528sl(Dc dc2, Cc cc2) {
        this.f57685a = dc2;
        this.f57686b = cc2;
    }

    public final boolean b(Gc gc2, String str, String str2) {
        if (gc2 == null) {
            return false;
        }
        String strA = this.f57685a.f55133a.a(str);
        String strA2 = this.f57685a.f55134b.a(str2);
        if (!gc2.containsKey(strA)) {
            if (strA2 != null) {
                return a(gc2, strA, strA2);
            }
            return false;
        }
        String str3 = (String) gc2.get(strA);
        if (strA2 == null || !strA2.equals(str3)) {
            return a(gc2, strA, strA2);
        }
        return false;
    }
}
