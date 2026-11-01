package yads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class xm2 extends s51 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final xm2 f84636h = new xm2(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object f84637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f84638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f84639g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    public static xm2 a(int i10, Object[] objArr) {
        byte[] bArr;
        int i11;
        int i12;
        int i13;
        if (i10 == 0) {
            return f84636h;
        }
        ?? r10 = 0;
        int i14 = 0;
        if (i10 == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
            return new xm2(null, objArr, 1);
        }
        ng2.b(i10, objArr.length >> 1);
        int iA = u51.a(i10);
        if (i10 == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
        } else {
            int i15 = iA - 1;
            if (iA <= 128) {
                bArr = new byte[iA];
                Arrays.fill(bArr, (byte) -1);
                while (i14 < i10) {
                    int i16 = i14 * 2;
                    Object obj = objArr[i16];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArr[i16 ^ 1];
                    Objects.requireNonNull(obj2);
                    int iA2 = p01.a(obj.hashCode());
                    while (true) {
                        i13 = iA2 & i15;
                        int i17 = bArr[i13] & 255;
                        if (i17 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i17])) {
                            throw a(obj, obj2, objArr, i17);
                        }
                        iA2 = i13 + 1;
                    }
                    bArr[i13] = (byte) i16;
                    i14++;
                }
            } else if (iA <= 32768) {
                bArr = new short[iA];
                Arrays.fill(bArr, (short) -1);
                while (i14 < i10) {
                    int i18 = i14 * 2;
                    Object obj3 = objArr[i18];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArr[i18 ^ 1];
                    Objects.requireNonNull(obj4);
                    int iA3 = p01.a(obj3.hashCode());
                    while (true) {
                        i12 = iA3 & i15;
                        int i19 = bArr[i12] & 65535;
                        if (i19 == 65535) {
                            break;
                        }
                        if (obj3.equals(objArr[i19])) {
                            throw a(obj3, obj4, objArr, i19);
                        }
                        iA3 = i12 + 1;
                    }
                    bArr[i12] = (short) i18;
                    i14++;
                }
            } else {
                bArr = new int[iA];
                Arrays.fill((int[]) bArr, -1);
                while (i14 < i10) {
                    int i20 = i14 * 2;
                    Object obj5 = objArr[i20];
                    Objects.requireNonNull(obj5);
                    Object obj6 = objArr[i20 ^ 1];
                    Objects.requireNonNull(obj6);
                    int iA4 = p01.a(obj5.hashCode());
                    while (true) {
                        i11 = iA4 & i15;
                        ?? r11 = bArr[i11];
                        if (r11 == -1) {
                            break;
                        }
                        if (obj5.equals(objArr[r11])) {
                            throw a(obj5, obj6, objArr, r11);
                        }
                        iA4 = i11 + 1;
                    }
                    bArr[i11] = i20;
                    i14++;
                }
            }
            r10 = bArr;
        }
        return new xm2(r10, objArr, i10);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008d A[EDGE_INSN: B:43:0x008d->B:35:0x008d BREAK  A[LOOP:0: B:15:0x0036->B:21:0x004c], EDGE_INSN: B:45:0x008d->B:35:0x008d BREAK  A[LOOP:1: B:25:0x0061->B:31:0x0078], EDGE_INSN: B:47:0x008d->B:35:0x008d BREAK  A[LOOP:2: B:33:0x0087->B:42:0x009f]] */
    @Override // yads.s51, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object obj3 = this.f84637e;
        Object[] objArr = this.f84638f;
        int i10 = this.f84639g;
        if (obj == null) {
            obj2 = null;
        } else if (i10 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            if (obj4.equals(obj)) {
                obj2 = objArr[1];
                Objects.requireNonNull(obj2);
            } else {
                obj2 = null;
            }
        } else if (obj3 == null) {
            obj2 = null;
        } else if (obj3 instanceof byte[]) {
            byte[] bArr = (byte[]) obj3;
            int length = bArr.length - 1;
            int iA = p01.a(obj.hashCode());
            while (true) {
                int i11 = iA & length;
                int i12 = bArr[i11] & 255;
                if (i12 == 255) {
                    break;
                }
                if (obj.equals(objArr[i12])) {
                    obj2 = objArr[i12 ^ 1];
                } else {
                    iA = i11 + 1;
                }
            }
            obj2 = null;
        } else if (obj3 instanceof short[]) {
            short[] sArr = (short[]) obj3;
            int length2 = sArr.length - 1;
            int iA2 = p01.a(obj.hashCode());
            while (true) {
                int i13 = iA2 & length2;
                int i14 = sArr[i13] & 65535;
                if (i14 == 65535) {
                    break;
                }
                if (obj.equals(objArr[i14])) {
                    obj2 = objArr[i14 ^ 1];
                } else {
                    iA2 = i13 + 1;
                }
            }
            obj2 = null;
        } else {
            int[] iArr = (int[]) obj3;
            int length3 = iArr.length - 1;
            int iA3 = p01.a(obj.hashCode());
            while (true) {
                int i15 = iA3 & length3;
                int i16 = iArr[i15];
                if (i16 == -1) {
                    break;
                }
                if (obj.equals(objArr[i16])) {
                    obj2 = objArr[i16 ^ 1];
                } else {
                    iA3 = i15 + 1;
                }
            }
            obj2 = null;
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f84639g;
    }

    public xm2(Object obj, Object[] objArr, int i10) {
        this.f84637e = obj;
        this.f84638f = objArr;
        this.f84639g = i10;
    }

    public static IllegalArgumentException a(Object obj, Object obj2, Object[] objArr, int i10) {
        return new IllegalArgumentException("Multiple entries with same key: " + obj + "=" + obj2 + " and " + objArr[i10] + "=" + objArr[i10 ^ 1]);
    }
}
