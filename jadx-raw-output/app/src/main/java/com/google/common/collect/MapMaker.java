package com.google.common.collect;

import com.google.common.base.Equivalence;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes7.dex */
public final class MapMaker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20444b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20445c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MapMakerInternalMap.Strength f20446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MapMakerInternalMap.Strength f20447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Equivalence<Object> f20448f;

    public enum Dummy {
        VALUE
    }

    public MapMaker a(int i10) {
        int i11 = this.f20445c;
        m5.l.t(i11 == -1, "concurrency level was already set to %s", i11);
        m5.l.d(i10 > 0);
        this.f20445c = i10;
        return this;
    }

    public int b() {
        int i10 = this.f20445c;
        if (i10 == -1) {
            return 4;
        }
        return i10;
    }

    public int c() {
        int i10 = this.f20444b;
        if (i10 == -1) {
            return 16;
        }
        return i10;
    }

    public Equivalence<Object> d() {
        return (Equivalence) m5.g.a(this.f20448f, e().defaultEquivalence());
    }

    public MapMakerInternalMap.Strength e() {
        return (MapMakerInternalMap.Strength) m5.g.a(this.f20446d, MapMakerInternalMap.Strength.STRONG);
    }

    public MapMakerInternalMap.Strength f() {
        return (MapMakerInternalMap.Strength) m5.g.a(this.f20447e, MapMakerInternalMap.Strength.STRONG);
    }

    public MapMaker g(int i10) {
        int i11 = this.f20444b;
        m5.l.t(i11 == -1, "initial capacity was already set to %s", i11);
        m5.l.d(i10 >= 0);
        this.f20444b = i10;
        return this;
    }

    public MapMaker h(Equivalence<Object> equivalence) {
        Equivalence<Object> equivalence2 = this.f20448f;
        m5.l.u(equivalence2 == null, "key equivalence was already set to %s", equivalence2);
        this.f20448f = (Equivalence) m5.l.m(equivalence);
        this.f20443a = true;
        return this;
    }

    public <K, V> ConcurrentMap<K, V> i() {
        return !this.f20443a ? new ConcurrentHashMap(c(), 0.75f, b()) : MapMakerInternalMap.create(this);
    }

    public MapMaker j(MapMakerInternalMap.Strength strength) {
        MapMakerInternalMap.Strength strength2 = this.f20446d;
        m5.l.u(strength2 == null, "Key strength was already set to %s", strength2);
        this.f20446d = (MapMakerInternalMap.Strength) m5.l.m(strength);
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.f20443a = true;
        }
        return this;
    }

    public MapMaker k(MapMakerInternalMap.Strength strength) {
        MapMakerInternalMap.Strength strength2 = this.f20447e;
        m5.l.u(strength2 == null, "Value strength was already set to %s", strength2);
        this.f20447e = (MapMakerInternalMap.Strength) m5.l.m(strength);
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.f20443a = true;
        }
        return this;
    }

    public MapMaker l() {
        return j(MapMakerInternalMap.Strength.WEAK);
    }

    public String toString() {
        m5.g.b bVarB = m5.g.b(this);
        int i10 = this.f20444b;
        if (i10 != -1) {
            bVarB.a("initialCapacity", i10);
        }
        int i11 = this.f20445c;
        if (i11 != -1) {
            bVarB.a("concurrencyLevel", i11);
        }
        MapMakerInternalMap.Strength strength = this.f20446d;
        if (strength != null) {
            bVarB.b("keyStrength", m5.a.e(strength.toString()));
        }
        MapMakerInternalMap.Strength strength2 = this.f20447e;
        if (strength2 != null) {
            bVarB.b("valueStrength", m5.a.e(strength2.toString()));
        }
        if (this.f20448f != null) {
            bVarB.h("keyEquivalence");
        }
        return bVarB.toString();
    }
}
