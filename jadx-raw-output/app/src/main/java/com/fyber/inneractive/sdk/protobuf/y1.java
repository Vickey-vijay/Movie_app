package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class y1 extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y1 f18349b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18350a;

    public y1() {
        this.f18350a = true;
    }

    static {
        y1 y1Var = new y1();
        f18349b = y1Var;
        y1Var.f18350a = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (!this.f18350a) {
            throw new UnsupportedOperationException();
        }
        super.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean z10;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    Iterator it = entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            if (map.containsKey(entry.getKey())) {
                                Object value = entry.getValue();
                                Object obj2 = map.get(entry.getKey());
                                if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                                }
                            }
                        } else {
                            z10 = true;
                        }
                    }
                }
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (!this.f18350a) {
            throw new UnsupportedOperationException();
        }
        Charset charset = l1.f18232a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        if (!this.f18350a) {
            throw new UnsupportedOperationException();
        }
        for (Object obj : map.keySet()) {
            Charset charset = l1.f18232a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (this.f18350a) {
            return super.remove(obj);
        }
        throw new UnsupportedOperationException();
    }

    public y1(Map map) {
        super(map);
        this.f18350a = true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iHashCode;
        int i10 = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            int iHashCode2 = 1;
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                Charset charset = l1.f18232a;
                iHashCode = bArr.length;
                for (byte b10 : bArr) {
                    iHashCode = (iHashCode * 31) + b10;
                }
                if (iHashCode == 0) {
                    iHashCode = 1;
                }
            } else if (!(key instanceof d1)) {
                iHashCode = key.hashCode();
            } else {
                throw new UnsupportedOperationException();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                Charset charset2 = l1.f18232a;
                int length = bArr2.length;
                for (byte b11 : bArr2) {
                    length = (length * 31) + b11;
                }
                if (length != 0) {
                    iHashCode2 = length;
                }
            } else if (!(value instanceof d1)) {
                iHashCode2 = value.hashCode();
            } else {
                throw new UnsupportedOperationException();
            }
            i10 += iHashCode ^ iHashCode2;
        }
        return i10;
    }
}
