package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class Gc extends HashMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55265a;

    public Gc() {
        this.f55265a = 0;
    }

    public Gc(String str) {
        super(AbstractC4241hb.d(str));
        this.f55265a = 0;
        for (String str2 : keySet()) {
            String str3 = (String) get(str2);
            this.f55265a = str2.length() + (str3 == null ? 0 : str3.length()) + this.f55265a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String put(String str, String str2) {
        if (containsKey(str)) {
            int length = 0;
            if (str2 == null) {
                if (containsKey(str)) {
                    String str3 = (String) get(str);
                    int i10 = this.f55265a;
                    int length2 = str.length();
                    if (str3 != null) {
                        length = str3.length();
                    }
                    this.f55265a = i10 - (length2 + length);
                }
                return (String) super.remove(str);
            }
            String str4 = (String) get(str);
            int i11 = this.f55265a;
            int length3 = str2.length();
            if (str4 != null) {
                length = str4.length();
            }
            this.f55265a = (length3 - length) + i11;
            return (String) super.put(str, str2);
        }
        if (str2 != null) {
            this.f55265a = str2.length() + str.length() + this.f55265a;
            return (String) super.put(str, str2);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int length;
        if (containsKey(obj)) {
            String str = (String) get(obj);
            int i10 = this.f55265a;
            int length2 = ((String) obj).length();
            if (str == null) {
                length = 0;
            } else {
                length = str.length();
            }
            this.f55265a = i10 - (length2 + length);
        }
        return (String) super.remove(obj);
    }
}
