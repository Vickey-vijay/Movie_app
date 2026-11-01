package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes10.dex */
public final class p1 extends c implements q1, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f18254b;

    public p1(int i10) {
        this.f18254b = new ArrayList(i10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q1
    public final q1 a() {
        return this.f18157a ? new r3(this) : this;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f18254b.size(), collection);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    public final k1 b(int i10) {
        if (i10 < this.f18254b.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f18254b);
        return new p1(arrayList);
    }

    static {
        new p1(10).f18157a = false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        c();
        this.f18254b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        String strA;
        Object obj = this.f18254b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            strA = sVar.f();
            if (sVar.c()) {
                this.f18254b.set(i10, strA);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            strA = l1.a(bArr);
            if (d4.f18169a.b(bArr, 0, bArr.length)) {
                this.f18254b.set(i10, strA);
            }
        }
        return strA;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        c();
        Object obj2 = this.f18254b.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return obj2 instanceof s ? ((s) obj2).f() : l1.a((byte[]) obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18254b.size();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q1
    public final void a(s sVar) {
        c();
        this.f18254b.add(sVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        c();
        if (collection instanceof q1) {
            collection = ((q1) collection).b();
        }
        boolean zAddAll = this.f18254b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        c();
        this.f18254b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        c();
        Object objRemove = this.f18254b.remove(i10);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof s) {
            return ((s) objRemove).f();
        }
        return l1.a((byte[]) objRemove);
    }

    public p1(ArrayList arrayList) {
        this.f18254b = arrayList;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q1
    public final Object a(int i10) {
        return this.f18254b.get(i10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q1
    public final List b() {
        return Collections.unmodifiableList(this.f18254b);
    }
}
