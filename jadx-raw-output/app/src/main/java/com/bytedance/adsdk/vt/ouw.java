package com.bytedance.adsdk.vt;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class ouw<E> implements Collection<E>, Set<E> {
    private static Object[] fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private static int f11233le;
    private static int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private static Object[] f11235ra;
    private int[] bly;
    public Object[] ouw;
    private rn<E, E> tlj;
    public int vt;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static final int[] f11234lh = new int[0];
    private static final Object[] yu = new Object[0];

    public ouw() {
        this((byte) 0);
    }

    private int ouw(Object obj, int i10) {
        int i11 = this.vt;
        if (i11 == 0) {
            return -1;
        }
        int iOuw = vt.ouw(this.bly, i11, i10);
        if (iOuw < 0 || obj.equals(this.ouw[iOuw])) {
            return iOuw;
        }
        int i12 = iOuw + 1;
        while (i12 < i11 && this.bly[i12] == i10) {
            if (obj.equals(this.ouw[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iOuw - 1; i13 >= 0 && this.bly[i13] == i10; i13--) {
            if (obj.equals(this.ouw[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    private void vt(int i10) {
        if (i10 == 8) {
            synchronized (ouw.class) {
                Object[] objArr = f11235ra;
                if (objArr != null) {
                    this.ouw = objArr;
                    f11235ra = (Object[]) objArr[0];
                    this.bly = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    pno--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (ouw.class) {
                Object[] objArr2 = fkw;
                if (objArr2 != null) {
                    this.ouw = objArr2;
                    fkw = (Object[]) objArr2[0];
                    this.bly = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f11233le--;
                    return;
                }
            }
        }
        this.bly = new int[i10];
        this.ouw = new Object[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e10) {
        int i10;
        int iOuw;
        if (e10 == null) {
            iOuw = ouw();
            i10 = 0;
        } else {
            int iHashCode = e10.hashCode();
            i10 = iHashCode;
            iOuw = ouw(e10, iHashCode);
        }
        if (iOuw >= 0) {
            return false;
        }
        int i11 = ~iOuw;
        int i12 = this.vt;
        int[] iArr = this.bly;
        if (i12 >= iArr.length) {
            int i13 = 4;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 >= 4) {
                i13 = 8;
            }
            Object[] objArr = this.ouw;
            vt(i13);
            int[] iArr2 = this.bly;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.ouw, 0, objArr.length);
            }
            ouw(iArr, objArr, this.vt);
        }
        int i14 = this.vt;
        if (i11 < i14) {
            int[] iArr3 = this.bly;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.ouw;
            System.arraycopy(objArr2, i11, objArr2, i15, this.vt - i11);
        }
        this.bly[i11] = i10;
        this.ouw[i11] = e10;
        this.vt++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.vt; i10++) {
                try {
                    if (!set.contains(this.ouw[i10])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i10 = this.vt;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.ouw, 0, objArr, 0, i10);
        return objArr;
    }

    private ouw(byte b10) {
        this.bly = f11234lh;
        this.ouw = yu;
        this.vt = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        int size = this.vt + collection.size();
        int[] iArr = this.bly;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.ouw;
            vt(size);
            int i10 = this.vt;
            if (i10 > 0) {
                System.arraycopy(iArr, 0, this.bly, 0, i10);
                System.arraycopy(objArr, 0, this.ouw, 0, this.vt);
            }
            ouw(iArr, objArr, this.vt);
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i10 = this.vt;
        if (i10 != 0) {
            ouw(this.bly, this.ouw, i10);
            this.bly = f11234lh;
            this.ouw = yu;
            this.vt = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.bly;
        int i10 = this.vt;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.vt <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        if (this.tlj == null) {
            this.tlj = new rn<E, E>() { // from class: com.bytedance.adsdk.vt.ouw.1
                @Override // com.bytedance.adsdk.vt.rn
                public final int ouw() {
                    return ouw.this.vt;
                }

                @Override // com.bytedance.adsdk.vt.rn
                public final Map<E, E> vt() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // com.bytedance.adsdk.vt.rn
                public final void lh() {
                    ouw.this.clear();
                }

                @Override // com.bytedance.adsdk.vt.rn
                public final Object ouw(int i10) {
                    return ouw.this.ouw[i10];
                }

                @Override // com.bytedance.adsdk.vt.rn
                public final void vt(int i10) {
                    ouw.this.ouw(i10);
                }

                @Override // com.bytedance.adsdk.vt.rn
                public final int ouw(Object obj) {
                    return ouw.this.ouw(obj);
                }
            };
        }
        rn<E, E> rnVar = this.tlj;
        if (rnVar.vt == null) {
            rnVar.vt = new rn.vt();
        }
        return rnVar.vt.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.vt - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.ouw[i10])) {
                ouw(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.vt;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (ouw(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iOuw = ouw(obj);
        if (iOuw >= 0) {
            ouw(iOuw);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.vt) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.vt));
        }
        System.arraycopy(this.ouw, 0, tArr, 0, this.vt);
        int length = tArr.length;
        int i10 = this.vt;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.vt * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.vt; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = this.ouw[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    private int ouw() {
        int i10 = this.vt;
        if (i10 == 0) {
            return -1;
        }
        int iOuw = vt.ouw(this.bly, i10, 0);
        if (iOuw < 0 || this.ouw[iOuw] == null) {
            return iOuw;
        }
        int i11 = iOuw + 1;
        while (i11 < i10 && this.bly[i11] == 0) {
            if (this.ouw[i11] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iOuw - 1; i12 >= 0 && this.bly[i12] == 0; i12--) {
            if (this.ouw[i12] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    private static void ouw(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (ouw.class) {
                if (pno < 10) {
                    objArr[0] = f11235ra;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f11235ra = objArr;
                    pno++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (ouw.class) {
                if (f11233le < 10) {
                    objArr[0] = fkw;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    fkw = objArr;
                    f11233le++;
                }
            }
        }
    }

    public final int ouw(Object obj) {
        return obj == null ? ouw() : ouw(obj, obj.hashCode());
    }

    public final E ouw(int i10) {
        Object[] objArr = this.ouw;
        E e10 = (E) objArr[i10];
        int i11 = this.vt;
        if (i11 <= 1) {
            ouw(this.bly, objArr, i11);
            this.bly = f11234lh;
            this.ouw = yu;
            this.vt = 0;
        } else {
            int[] iArr = this.bly;
            if (iArr.length > 8 && i11 < iArr.length / 3) {
                vt(i11 > 8 ? i11 + (i11 >> 1) : 8);
                this.vt--;
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.bly, 0, i10);
                    System.arraycopy(objArr, 0, this.ouw, 0, i10);
                }
                int i12 = this.vt;
                if (i10 < i12) {
                    int i13 = i10 + 1;
                    System.arraycopy(iArr, i13, this.bly, i10, i12 - i10);
                    System.arraycopy(objArr, i13, this.ouw, i10, this.vt - i10);
                }
            } else {
                int i14 = i11 - 1;
                this.vt = i14;
                if (i10 < i14) {
                    int i15 = i10 + 1;
                    System.arraycopy(iArr, i15, iArr, i10, i14 - i10);
                    Object[] objArr2 = this.ouw;
                    System.arraycopy(objArr2, i15, objArr2, i10, this.vt - i10);
                }
                this.ouw[this.vt] = null;
            }
        }
        return e10;
    }
}
