package yads;

import com.google.common.collect.Sets;
import java.util.List;
import java.util.Map;
import java.util.Set;
import yads.qd0;

/* JADX INFO: loaded from: classes2.dex */
public final class qd0 extends com.google.common.collect.q1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f81829b;

    public static /* synthetic */ boolean a(String str) {
        return str != null;
    }

    @Override // com.google.common.collect.q1, com.google.common.collect.r1
    /* JADX INFO: renamed from: delegate */
    public final Object g() {
        return this.f81829b;
    }

    @Override // com.google.common.collect.q1, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.common.collect.q1, com.google.common.collect.r1
    /* JADX INFO: renamed from: delegate */
    public final Map g() {
        return this.f81829b;
    }

    @Override // com.google.common.collect.q1, java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && standardEquals(obj);
    }

    @Override // com.google.common.collect.q1, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) super.get(obj);
    }

    public qd0(Map map) {
        this.f81829b = map;
    }

    public static /* synthetic */ boolean a(Map.Entry entry) {
        if (entry.getKey() != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.collect.q1, java.util.Map
    public final boolean containsValue(Object obj) {
        return standardContainsValue(obj);
    }

    @Override // com.google.common.collect.q1, java.util.Map
    public final Set entrySet() {
        return Sets.b(super.entrySet(), new m5.m() { // from class: cp.t8
            @Override // m5.m
            public final boolean apply(Object obj) {
                return qd0.a((Map.Entry) obj);
            }
        });
    }

    @Override // com.google.common.collect.q1, java.util.Map
    public final int hashCode() {
        return standardHashCode();
    }

    @Override // com.google.common.collect.q1, java.util.Map
    public final boolean isEmpty() {
        if (super.isEmpty()) {
            return true;
        }
        if (super.size() == 1 && super.containsKey(null)) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.collect.q1, java.util.Map
    public final Set keySet() {
        return Sets.b(super.keySet(), new m5.m() { // from class: cp.u8
            @Override // m5.m
            public final boolean apply(Object obj) {
                return qd0.a((String) obj);
            }
        });
    }

    @Override // com.google.common.collect.q1, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
