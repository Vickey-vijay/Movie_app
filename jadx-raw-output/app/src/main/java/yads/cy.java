package yads;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class cy extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f76462k = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Object f76463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient int[] f76464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Object[] f76465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient Object[] f76466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient int f76467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient int f76468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient yx f76469h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient wx f76470i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public transient ay f76471j;

    public final Map a() {
        Object obj = this.f76463b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int b() {
        return isEmpty() ? -1 : 0;
    }

    public final boolean c() {
        return this.f76463b == null;
    }

    public final Object b(int i10) {
        Object[] objArr = this.f76465d;
        Objects.requireNonNull(objArr);
        return objArr[i10];
    }

    public final Object c(int i10) {
        Object[] objArr = this.f76466e;
        Objects.requireNonNull(objArr);
        return objArr[i10];
    }

    public final int[] d() {
        int[] iArr = this.f76464c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] e() {
        Object[] objArr = this.f76465d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        wx wxVar = this.f76470i;
        if (wxVar != null) {
            return wxVar;
        }
        wx wxVar2 = new wx(this);
        this.f76470i = wxVar2;
        return wxVar2;
    }

    public final Object f() {
        Object obj = this.f76463b;
        Objects.requireNonNull(obj);
        return obj;
    }

    public final Object[] g() {
        Object[] objArr = this.f76466e;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        yx yxVar = this.f76469h;
        if (yxVar != null) {
            return yxVar;
        }
        yx yxVar2 = new yx(this);
        this.f76469h = yxVar2;
        return yxVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iMin;
        Object obj3;
        int i10 = 1;
        if (c()) {
            if (!c()) {
                throw new IllegalStateException("Arrays already allocated");
            }
            int i11 = this.f76467f;
            int iMax = Math.max(i11 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > ((int) (((double) iHighestOneBit) * 1.0d)) && (iHighestOneBit = iHighestOneBit << 1) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            if (iMax2 < 2 || iMax2 > 1073741824 || Integer.highestOneBit(iMax2) != iMax2) {
                throw new IllegalArgumentException(mg2.a("must be power of 2 between 2^1 and 2^30: ", iMax2));
            }
            if (iMax2 <= 256) {
                obj3 = new byte[iMax2];
            } else {
                obj3 = iMax2 <= 65536 ? new short[iMax2] : new int[iMax2];
            }
            this.f76463b = obj3;
            this.f76467f = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.f76467f & (-32));
            this.f76464c = new int[i11];
            this.f76465d = new Object[i11];
            this.f76466e = new Object[i11];
        }
        Map mapA = a();
        if (mapA != null) {
            return mapA.put(obj, obj2);
        }
        int[] iArr = this.f76464c;
        Objects.requireNonNull(iArr);
        int[] iArr2 = iArr;
        Object[] objArr = this.f76465d;
        Objects.requireNonNull(objArr);
        Object[] objArr2 = objArr;
        Object[] objArr3 = this.f76466e;
        Objects.requireNonNull(objArr3);
        Object[] objArr4 = objArr3;
        int i12 = this.f76468g;
        int i13 = i12 + 1;
        int iA = p01.a(obj == null ? 0 : obj.hashCode());
        int i14 = 1 << (this.f76467f & 31);
        int iA2 = i14 - 1;
        int i15 = iA & iA2;
        Object obj4 = this.f76463b;
        Objects.requireNonNull(obj4);
        int iA3 = dy.a(i15, obj4);
        if (iA3 != 0) {
            int i16 = ~iA2;
            int i17 = iA & i16;
            int i18 = 0;
            while (true) {
                int i19 = iA3 - i10;
                int i20 = iArr2[i19];
                int i21 = i20 & i16;
                if (i21 == i17 && l92.a(obj, objArr2[i19])) {
                    Object obj5 = objArr4[i19];
                    objArr4[i19] = obj2;
                    return obj5;
                }
                int i22 = i20 & iA2;
                int i23 = i16;
                int i24 = i18 + 1;
                if (i22 == 0) {
                    if (i24 < 9) {
                        if (i13 <= iA2) {
                            iArr2[i19] = (i13 & iA2) | i21;
                            break;
                        }
                        iA2 = a(iA2, i14 * (iA2 < 32 ? 4 : 2), iA, i12);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(1 << (this.f76467f & 31), 1.0f);
                    int iB = b();
                    while (iB >= 0) {
                        linkedHashMap.put(b(iB), c(iB));
                        iB++;
                        if (iB >= this.f76468g) {
                            iB = -1;
                        }
                    }
                    this.f76463b = linkedHashMap;
                    this.f76464c = null;
                    this.f76465d = null;
                    this.f76466e = null;
                    this.f76467f += 32;
                    return linkedHashMap.put(obj, obj2);
                }
                i18 = i24;
                iA3 = i22;
                i10 = 1;
                i16 = i23;
            }
        } else if (i13 > iA2) {
            iA2 = a(iA2, i14 * (iA2 < 32 ? 4 : 2), iA, i12);
        } else {
            Object obj6 = this.f76463b;
            Objects.requireNonNull(obj6);
            dy.a(i15, i13, obj6);
        }
        int[] iArr3 = this.f76464c;
        Objects.requireNonNull(iArr3);
        int length = iArr3.length;
        if (i13 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            int[] iArr4 = this.f76464c;
            Objects.requireNonNull(iArr4);
            this.f76464c = Arrays.copyOf(iArr4, iMin);
            Object[] objArr5 = this.f76465d;
            Objects.requireNonNull(objArr5);
            this.f76465d = Arrays.copyOf(objArr5, iMin);
            Object[] objArr6 = this.f76466e;
            Objects.requireNonNull(objArr6);
            this.f76466e = Arrays.copyOf(objArr6, iMin);
        }
        int i25 = (~iA2) & iA;
        int[] iArr5 = this.f76464c;
        Objects.requireNonNull(iArr5);
        iArr5[i12] = i25;
        Object[] objArr7 = this.f76465d;
        Objects.requireNonNull(objArr7);
        objArr7[i12] = obj;
        a(i12, obj2);
        this.f76468g = i13;
        this.f76467f += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        ay ayVar = this.f76471j;
        if (ayVar != null) {
            return ayVar;
        }
        ay ayVar2 = new ay(this);
        this.f76471j = ayVar2;
        return ayVar2;
    }

    public cy(int i10) {
        a(i10);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i10 = objectInputStream.readInt();
        if (i10 >= 0) {
            a(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        throw new InvalidObjectException(mg2.a("Invalid size: ", i10));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Iterator uxVar;
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map mapA = a();
        if (mapA != null) {
            uxVar = mapA.entrySet().iterator();
        } else {
            uxVar = new ux(this);
        }
        while (uxVar.hasNext()) {
            Map.Entry entry = (Map.Entry) uxVar.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public final int a(Object obj) {
        if (c()) {
            return -1;
        }
        int iA = p01.a(obj == null ? 0 : obj.hashCode());
        int i10 = (1 << (this.f76467f & 31)) - 1;
        Object obj2 = this.f76463b;
        Objects.requireNonNull(obj2);
        int iA2 = dy.a(iA & i10, obj2);
        if (iA2 == 0) {
            return -1;
        }
        int i11 = ~i10;
        int i12 = iA & i11;
        do {
            int i13 = iA2 - 1;
            int[] iArr = this.f76464c;
            Objects.requireNonNull(iArr);
            int i14 = iArr[i13];
            if ((i14 & i11) == i12 && l92.a(obj, b(i13))) {
                return i13;
            }
            iA2 = i14 & i10;
        } while (iA2 != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (c()) {
            return;
        }
        this.f76467f += 32;
        Map mapA = a();
        if (mapA != null) {
            this.f76467f = Math.min(Math.max(size(), 3), 1073741823);
            mapA.clear();
            this.f76463b = null;
            this.f76468g = 0;
            return;
        }
        Object[] objArr = this.f76465d;
        Objects.requireNonNull(objArr);
        Arrays.fill(objArr, 0, this.f76468g, (Object) null);
        Object[] objArr2 = this.f76466e;
        Objects.requireNonNull(objArr2);
        Arrays.fill(objArr2, 0, this.f76468g, (Object) null);
        Object obj = this.f76463b;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        int[] iArr = this.f76464c;
        Objects.requireNonNull(iArr);
        Arrays.fill(iArr, 0, this.f76468g, 0);
        this.f76468g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapA = a();
        if (mapA != null) {
            return mapA.containsKey(obj);
        }
        if (a(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapA = a();
        if (mapA != null) {
            return mapA.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f76468g; i10++) {
            if (l92.a(obj, c(i10))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapA = a();
        if (mapA != null) {
            return mapA.get(obj);
        }
        int iA = a(obj);
        if (iA == -1) {
            return null;
        }
        return c(iA);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapA = a();
        if (mapA != null) {
            return mapA.remove(obj);
        }
        Object objB = b(obj);
        if (objB == f76462k) {
            return null;
        }
        return objB;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapA = a();
        if (mapA != null) {
            return mapA.size();
        }
        return this.f76468g;
    }

    public final Object b(Object obj) {
        if (c()) {
            return f76462k;
        }
        int i10 = (1 << (this.f76467f & 31)) - 1;
        Object obj2 = this.f76463b;
        Objects.requireNonNull(obj2);
        int[] iArr = this.f76464c;
        Objects.requireNonNull(iArr);
        int[] iArr2 = iArr;
        Object[] objArr = this.f76465d;
        Objects.requireNonNull(objArr);
        int iA = dy.a(obj, null, i10, obj2, iArr2, objArr, null);
        if (iA == -1) {
            return f76462k;
        }
        Object objC = c(iA);
        a(iA, i10);
        this.f76468g--;
        this.f76467f += 32;
        return objC;
    }

    public final void a(int i10) {
        if (i10 >= 0) {
            this.f76467f = Math.min(Math.max(i10, 1), 1073741823);
            return;
        }
        throw new IllegalArgumentException("Expected size must be >= 0");
    }

    public final void a(int i10, int i11) {
        Object obj = this.f76463b;
        Objects.requireNonNull(obj);
        int[] iArr = this.f76464c;
        Objects.requireNonNull(iArr);
        int[] iArr2 = iArr;
        Object[] objArr = this.f76465d;
        Objects.requireNonNull(objArr);
        Object[] objArr2 = objArr;
        Object[] objArr3 = this.f76466e;
        Objects.requireNonNull(objArr3);
        Object[] objArr4 = objArr3;
        int size = size();
        int i12 = size - 1;
        if (i10 < i12) {
            Object obj2 = objArr2[i12];
            objArr2[i10] = obj2;
            objArr4[i10] = objArr4[i12];
            objArr2[i12] = null;
            objArr4[i12] = null;
            iArr2[i10] = iArr2[i12];
            iArr2[i12] = 0;
            int iA = p01.a(obj2 != null ? obj2.hashCode() : 0) & i11;
            int iA2 = dy.a(iA, obj);
            if (iA2 == size) {
                dy.a(iA, i10 + 1, obj);
                return;
            }
            while (true) {
                int i13 = iA2 - 1;
                int i14 = iArr2[i13];
                int i15 = i14 & i11;
                if (i15 == size) {
                    iArr2[i13] = ((i10 + 1) & i11) | (i14 & (~i11));
                    return;
                }
                iA2 = i15;
            }
        } else {
            objArr2[i10] = null;
            objArr4[i10] = null;
            iArr2[i10] = 0;
        }
    }

    public final int a(int i10, int i11, int i12, int i13) {
        Object obj;
        if (i11 >= 2 && i11 <= 1073741824 && Integer.highestOneBit(i11) == i11) {
            if (i11 <= 256) {
                obj = new byte[i11];
            } else if (i11 <= 65536) {
                obj = new short[i11];
            } else {
                obj = new int[i11];
            }
            int i14 = i11 - 1;
            if (i13 != 0) {
                dy.a(i12 & i14, i13 + 1, obj);
            }
            Object obj2 = this.f76463b;
            Objects.requireNonNull(obj2);
            int[] iArr = this.f76464c;
            Objects.requireNonNull(iArr);
            int[] iArr2 = iArr;
            for (int i15 = 0; i15 <= i10; i15++) {
                int iA = dy.a(i15, obj2);
                while (iA != 0) {
                    int i16 = iA - 1;
                    int i17 = iArr2[i16];
                    int i18 = ((~i10) & i17) | i15;
                    int i19 = i18 & i14;
                    int iA2 = dy.a(i19, obj);
                    dy.a(i19, iA, obj);
                    iArr2[i16] = ((~i14) & i18) | (iA2 & i14);
                    iA = i17 & i10;
                }
            }
            this.f76463b = obj;
            this.f76467f = ((32 - Integer.numberOfLeadingZeros(i14)) & 31) | (this.f76467f & (-32));
            return i14;
        }
        throw new IllegalArgumentException(mg2.a("must be power of 2 between 2^1 and 2^30: ", i11));
    }

    public final void a(int i10, Object obj) {
        Object[] objArr = this.f76466e;
        Objects.requireNonNull(objArr);
        objArr[i10] = obj;
    }
}
