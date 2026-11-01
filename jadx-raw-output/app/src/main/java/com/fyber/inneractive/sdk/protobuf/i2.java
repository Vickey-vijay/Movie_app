package com.fyber.inneractive.sdk.protobuf;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
public final class i2 implements t2 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f18200q = new int[0];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Unsafe f18201r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f18202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f18203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d2 f18206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f18207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f18208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f18209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f18210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f18211j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f18212k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k2 f18213l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t1 f18214m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o3 f18215n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j0 f18216o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z1 f18217p;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new s3());
        } catch (Throwable unused) {
            unsafe = null;
        }
        f18201r = unsafe;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x026e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0271  */
    /* JADX WARN: Code duplicated, block: B:132:0x0289  */
    /* JADX WARN: Code duplicated, block: B:133:0x028c  */
    public static i2 a(r2 r2Var, k2 k2Var, t1 t1Var, o3 o3Var, j0 j0Var, z1 z1Var) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int i11;
        int iCharAt3;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        int i15;
        char cCharAt;
        int i16;
        char cCharAt2;
        int i17;
        char cCharAt3;
        int i18;
        char cCharAt4;
        int i19;
        char cCharAt5;
        int i20;
        char cCharAt6;
        int i21;
        char cCharAt7;
        int i22;
        char cCharAt8;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i28;
        int i29;
        Field fieldA;
        char cCharAt9;
        int i30;
        int i31;
        int i32;
        Object obj;
        Field fieldA2;
        int i33;
        Object obj2;
        Field fieldA3;
        int i34;
        char cCharAt10;
        int i35;
        char cCharAt11;
        int i36;
        char cCharAt12;
        int i37;
        char cCharAt13;
        if (!(r2Var instanceof r2)) {
            r2Var.getClass();
            throw new ClassCastException();
        }
        int i38 = 0;
        boolean z10 = ((r2Var.f18272d & 1) == 1 ? o2.PROTO2 : o2.PROTO3) == o2.PROTO3;
        String str = r2Var.f18270b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i39 = 1;
            while (true) {
                i10 = i39 + 1;
                if (str.charAt(i39) < 55296) {
                    break;
                }
                i39 = i10;
            }
        } else {
            i10 = 1;
        }
        int i40 = i10 + 1;
        int iCharAt4 = str.charAt(i10);
        if (iCharAt4 >= 55296) {
            int i41 = iCharAt4 & 8191;
            int i42 = 13;
            while (true) {
                i37 = i40 + 1;
                cCharAt13 = str.charAt(i40);
                if (cCharAt13 < 55296) {
                    break;
                }
                i41 |= (cCharAt13 & 8191) << i42;
                i42 += 13;
                i40 = i37;
            }
            iCharAt4 = i41 | (cCharAt13 << i42);
            i40 = i37;
        }
        if (iCharAt4 == 0) {
            i14 = 0;
            iCharAt2 = 0;
            i12 = 0;
            iCharAt3 = 0;
            i11 = i40;
            iArr = f18200q;
            iCharAt = 0;
            i13 = 0;
        } else {
            int i43 = i40 + 1;
            iCharAt = str.charAt(i40);
            if (iCharAt >= 55296) {
                int i44 = iCharAt & 8191;
                int i45 = 13;
                while (true) {
                    i22 = i43 + 1;
                    cCharAt8 = str.charAt(i43);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt8 & 8191) << i45;
                    i45 += 13;
                    i43 = i22;
                }
                iCharAt = i44 | (cCharAt8 << i45);
                i43 = i22;
            }
            int i46 = i43 + 1;
            int iCharAt5 = str.charAt(i43);
            if (iCharAt5 >= 55296) {
                int i47 = iCharAt5 & 8191;
                int i48 = 13;
                while (true) {
                    i21 = i46 + 1;
                    cCharAt7 = str.charAt(i46);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt7 & 8191) << i48;
                    i48 += 13;
                    i46 = i21;
                }
                iCharAt5 = i47 | (cCharAt7 << i48);
                i46 = i21;
            }
            int i49 = i46 + 1;
            int iCharAt6 = str.charAt(i46);
            if (iCharAt6 >= 55296) {
                int i50 = iCharAt6 & 8191;
                int i51 = 13;
                while (true) {
                    i20 = i49 + 1;
                    cCharAt6 = str.charAt(i49);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt6 & 8191) << i51;
                    i51 += 13;
                    i49 = i20;
                }
                iCharAt6 = i50 | (cCharAt6 << i51);
                i49 = i20;
            }
            int i52 = i49 + 1;
            int iCharAt7 = str.charAt(i49);
            if (iCharAt7 >= 55296) {
                int i53 = iCharAt7 & 8191;
                int i54 = 13;
                while (true) {
                    i19 = i52 + 1;
                    cCharAt5 = str.charAt(i52);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt5 & 8191) << i54;
                    i54 += 13;
                    i52 = i19;
                }
                iCharAt7 = i53 | (cCharAt5 << i54);
                i52 = i19;
            }
            int i55 = i52 + 1;
            iCharAt2 = str.charAt(i52);
            if (iCharAt2 >= 55296) {
                int i56 = iCharAt2 & 8191;
                int i57 = 13;
                while (true) {
                    i18 = i55 + 1;
                    cCharAt4 = str.charAt(i55);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt4 & 8191) << i57;
                    i57 += 13;
                    i55 = i18;
                }
                iCharAt2 = i56 | (cCharAt4 << i57);
                i55 = i18;
            }
            int i58 = i55 + 1;
            int iCharAt8 = str.charAt(i55);
            if (iCharAt8 >= 55296) {
                int i59 = iCharAt8 & 8191;
                int i60 = 13;
                while (true) {
                    i17 = i58 + 1;
                    cCharAt3 = str.charAt(i58);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt3 & 8191) << i60;
                    i60 += 13;
                    i58 = i17;
                }
                iCharAt8 = i59 | (cCharAt3 << i60);
                i58 = i17;
            }
            int i61 = i58 + 1;
            int iCharAt9 = str.charAt(i58);
            if (iCharAt9 >= 55296) {
                int i62 = iCharAt9 & 8191;
                int i63 = 13;
                while (true) {
                    i16 = i61 + 1;
                    cCharAt2 = str.charAt(i61);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i62 |= (cCharAt2 & 8191) << i63;
                    i63 += 13;
                    i61 = i16;
                }
                iCharAt9 = i62 | (cCharAt2 << i63);
                i61 = i16;
            }
            i11 = i61 + 1;
            iCharAt3 = str.charAt(i61);
            if (iCharAt3 >= 55296) {
                int i64 = iCharAt3 & 8191;
                int i65 = i11;
                int i66 = 13;
                while (true) {
                    i15 = i65 + 1;
                    cCharAt = str.charAt(i65);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i64 |= (cCharAt & 8191) << i66;
                    i66 += 13;
                    i65 = i15;
                }
                iCharAt3 = i64 | (cCharAt << i66);
                i11 = i15;
            }
            int[] iArr2 = new int[iCharAt3 + iCharAt8 + iCharAt9];
            i12 = (iCharAt * 2) + iCharAt5;
            i13 = iCharAt8;
            iArr = iArr2;
            i38 = iCharAt6;
            i14 = iCharAt7;
        }
        Unsafe unsafe = f18201r;
        Object[] objArr = r2Var.f18271c;
        Class<?> cls = r2Var.f18269a.getClass();
        int[] iArr3 = new int[iCharAt2 * 3];
        Object[] objArr2 = new Object[iCharAt2 * 2];
        int i67 = iCharAt3 + i13;
        int i68 = iCharAt3;
        int i69 = i11;
        int i70 = i67;
        int i71 = 0;
        int i72 = 0;
        while (i69 < length) {
            int i73 = i69 + 1;
            int iCharAt10 = str.charAt(i69);
            int i74 = length;
            if (iCharAt10 >= 55296) {
                int i75 = iCharAt10 & 8191;
                int i76 = i73;
                int i77 = 13;
                while (true) {
                    i36 = i76 + 1;
                    cCharAt12 = str.charAt(i76);
                    i23 = iCharAt3;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i75 |= (cCharAt12 & 8191) << i77;
                    i77 += 13;
                    i76 = i36;
                    iCharAt3 = i23;
                }
                iCharAt10 = i75 | (cCharAt12 << i77);
                i24 = i36;
            } else {
                i23 = iCharAt3;
                i24 = i73;
            }
            int i78 = i24 + 1;
            int iCharAt11 = str.charAt(i24);
            if (iCharAt11 >= 55296) {
                int i79 = iCharAt11 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i35 = i80 + 1;
                    cCharAt11 = str.charAt(i80);
                    i25 = i14;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i79 |= (cCharAt11 & 8191) << i81;
                    i81 += 13;
                    i80 = i35;
                    i14 = i25;
                }
                iCharAt11 = i79 | (cCharAt11 << i81);
                i26 = i35;
            } else {
                i25 = i14;
                i26 = i78;
            }
            int i82 = iCharAt11 & 255;
            int i83 = i38;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i71] = i72;
                i71++;
            }
            if (i82 >= 51) {
                int i84 = i26 + 1;
                int iCharAt12 = str.charAt(i26);
                char c10 = 55296;
                if (iCharAt12 >= 55296) {
                    int i85 = iCharAt12 & 8191;
                    int i86 = 13;
                    while (true) {
                        i34 = i84 + 1;
                        cCharAt10 = str.charAt(i84);
                        if (cCharAt10 < c10) {
                            break;
                        }
                        i85 |= (cCharAt10 & 8191) << i86;
                        i86 += 13;
                        i84 = i34;
                        c10 = 55296;
                    }
                    iCharAt12 = i85 | (cCharAt10 << i86);
                    i84 = i34;
                }
                int i87 = i82 - 51;
                int i88 = i84;
                if (i87 == 9 || i87 == 17) {
                    i31 = i12 + 1;
                    objArr2[((i72 / 3) * 2) + 1] = objArr[i12];
                } else {
                    if (i87 == 12 && !z10) {
                        i31 = i12 + 1;
                        objArr2[((i72 / 3) * 2) + 1] = objArr[i12];
                    }
                    i32 = iCharAt12 * 2;
                    obj = objArr[i32];
                    if (obj instanceof Field) {
                        fieldA2 = (Field) obj;
                    } else {
                        fieldA2 = a((Class) cls, (String) obj);
                        objArr[i32] = fieldA2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldA2);
                    i33 = i32 + 1;
                    obj2 = objArr[i33];
                    if (obj2 instanceof Field) {
                        fieldA3 = (Field) obj2;
                    } else {
                        fieldA3 = a((Class) cls, (String) obj2);
                        objArr[i33] = fieldA3;
                    }
                    str = str;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldA3);
                    i27 = i12;
                    i69 = i88;
                    i28 = 0;
                    iObjectFieldOffset = iObjectFieldOffset3;
                }
                i12 = i31;
                i32 = iCharAt12 * 2;
                obj = objArr[i32];
                if (obj instanceof Field) {
                    fieldA2 = (Field) obj;
                } else {
                    fieldA2 = a((Class) cls, (String) obj);
                    objArr[i32] = fieldA2;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldA2);
                i33 = i32 + 1;
                obj2 = objArr[i33];
                if (obj2 instanceof Field) {
                    fieldA3 = (Field) obj2;
                } else {
                    fieldA3 = a((Class) cls, (String) obj2);
                    objArr[i33] = fieldA3;
                }
                str = str;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldA3);
                i27 = i12;
                i69 = i88;
                i28 = 0;
                iObjectFieldOffset = iObjectFieldOffset4;
            } else {
                i27 = i12 + 1;
                Field fieldA4 = a((Class) cls, (String) objArr[i12]);
                if (i82 == 9 || i82 == 17) {
                    objArr2[((i72 / 3) * 2) + 1] = fieldA4.getType();
                } else {
                    if (i82 == 27 || i82 == 49) {
                        i30 = i12 + 2;
                        objArr2[((i72 / 3) * 2) + 1] = objArr[i27];
                    } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                        if (!z10) {
                            i30 = i12 + 2;
                            objArr2[((i72 / 3) * 2) + 1] = objArr[i27];
                        }
                    } else if (i82 == 50) {
                        int i89 = i68 + 1;
                        iArr[i68] = i72;
                        int i90 = (i72 / 3) * 2;
                        int i91 = i12 + 2;
                        objArr2[i90] = objArr[i27];
                        if ((iCharAt11 & 2048) != 0) {
                            i27 = i12 + 3;
                            objArr2[i90 + 1] = objArr[i91];
                            i68 = i89;
                        } else {
                            i68 = i89;
                            i27 = i91;
                        }
                    }
                    i27 = i30;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldA4);
                if ((iCharAt11 & 4096) != 4096 || i82 > 17) {
                    iObjectFieldOffset2 = 1048575;
                    i28 = 0;
                } else {
                    int i92 = i26 + 1;
                    int iCharAt13 = str.charAt(i26);
                    if (iCharAt13 >= 55296) {
                        int i93 = iCharAt13 & 8191;
                        int i94 = 13;
                        while (true) {
                            i29 = i92 + 1;
                            cCharAt9 = str.charAt(i92);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i93 |= (cCharAt9 & 8191) << i94;
                            i94 += 13;
                            i92 = i29;
                        }
                        iCharAt13 = i93 | (cCharAt9 << i94);
                    } else {
                        i29 = i92;
                    }
                    int i95 = (iCharAt13 / 32) + (iCharAt * 2);
                    Object obj3 = objArr[i95];
                    if (obj3 instanceof Field) {
                        fieldA = (Field) obj3;
                    } else {
                        fieldA = a((Class) cls, (String) obj3);
                        objArr[i95] = fieldA;
                    }
                    i28 = iCharAt13 % 32;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldA);
                    i26 = i29;
                }
                if (i82 >= 18 && i82 <= 49) {
                    iArr[i70] = iObjectFieldOffset;
                    i70++;
                }
                i69 = i26;
            }
            int i96 = i72 + 1;
            iArr3[i72] = iCharAt10;
            int i97 = i72 + 2;
            iArr3[i96] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i82 << 20) | iObjectFieldOffset;
            i72 += 3;
            iArr3[i97] = (i28 << 20) | iObjectFieldOffset2;
            iArr3 = iArr3;
            str = str;
            i38 = i83;
            length = i74;
            iCharAt3 = i23;
            i14 = i25;
            i12 = i27;
        }
        return new i2(iArr3, objArr2, i38, i14, r2Var.f18269a, z10, iArr, iCharAt3, i67, k2Var, t1Var, o3Var, j0Var, z1Var);
    }

    public static long d(int i10) {
        return i10 & 1048575;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01cb  */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final boolean b(Object obj, Object obj2) {
        int length = this.f18202a.length;
        int i10 = 0;
        while (true) {
            boolean zA = true;
            if (i10 >= length) {
                this.f18215n.getClass();
                n3 n3Var = ((z0) obj).unknownFields;
                this.f18215n.getClass();
                if (!n3Var.equals(((z0) obj2).unknownFields)) {
                    return false;
                }
                if (!this.f18207f) {
                    return true;
                }
                this.f18216o.getClass();
                n0 n0Var = ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
                this.f18216o.getClass();
                return n0Var.equals(((GeneratedMessageLite$ExtendableMessage) obj2).extensions);
            }
            int[] iArr = this.f18202a;
            int i11 = iArr[i10 + 1];
            long j10 = i11 & 1048575;
            switch ((i11 & 267386880) >>> 20) {
                case 0:
                    if (!a(i10, obj, obj2)) {
                        zA = false;
                    } else {
                        w3 w3Var = x3.f18340c;
                        if (Double.doubleToLongBits(w3Var.c(obj, j10)) != Double.doubleToLongBits(w3Var.c(obj2, j10))) {
                            zA = false;
                        }
                    }
                    break;
                case 1:
                    if (!a(i10, obj, obj2)) {
                        zA = false;
                    } else {
                        w3 w3Var2 = x3.f18340c;
                        if (Float.floatToIntBits(w3Var2.d(obj, j10)) != Float.floatToIntBits(w3Var2.d(obj2, j10))) {
                            zA = false;
                        }
                    }
                    break;
                case 2:
                    if (!a(i10, obj, obj2) || x3.d(obj, j10) != x3.d(obj2, j10)) {
                        zA = false;
                    }
                    break;
                case 3:
                    if (!a(i10, obj, obj2) || x3.d(obj, j10) != x3.d(obj2, j10)) {
                        zA = false;
                    }
                    break;
                case 4:
                    if (!a(i10, obj, obj2) || x3.c(obj, j10) != x3.c(obj2, j10)) {
                        zA = false;
                    }
                    break;
                case 5:
                    if (!a(i10, obj, obj2) || x3.d(obj, j10) != x3.d(obj2, j10)) {
                        zA = false;
                    }
                    break;
                case 6:
                    if (!a(i10, obj, obj2) || x3.c(obj, j10) != x3.c(obj2, j10)) {
                        zA = false;
                    }
                    break;
                case 7:
                    if (!a(i10, obj, obj2)) {
                        zA = false;
                    } else {
                        w3 w3Var3 = x3.f18340c;
                        if (w3Var3.a(obj, j10) != w3Var3.a(obj2, j10)) {
                            zA = false;
                        }
                    }
                    break;
                case 8:
                    if (!a(i10, obj, obj2) || !u2.a(x3.e(obj, j10), x3.e(obj2, j10))) {
                        zA = false;
                    }
                    break;
                case 9:
                    if (!a(i10, obj, obj2) || !u2.a(x3.e(obj, j10), x3.e(obj2, j10))) {
                        zA = false;
                    }
                    break;
                case 10:
                    if (!a(i10, obj, obj2) || !u2.a(x3.e(obj, j10), x3.e(obj2, j10))) {
                        zA = false;
                    }
                    break;
                case 11:
                    if (!a(i10, obj, obj2) || x3.c(obj, j10) != x3.c(obj2, j10)) {
                        zA = false;
                    }
                    break;
                case 12:
                    if (!a(i10, obj, obj2) || x3.c(obj, j10) != x3.c(obj2, j10)) {
                        zA = false;
                    }
                    break;
                case 13:
                    if (!a(i10, obj, obj2) || x3.c(obj, j10) != x3.c(obj2, j10)) {
                        zA = false;
                    }
                    break;
                case 14:
                    if (!a(i10, obj, obj2) || x3.d(obj, j10) != x3.d(obj2, j10)) {
                        zA = false;
                    }
                    break;
                case 15:
                    if (!a(i10, obj, obj2) || x3.c(obj, j10) != x3.c(obj2, j10)) {
                        zA = false;
                    }
                    break;
                case 16:
                    if (!a(i10, obj, obj2) || x3.d(obj, j10) != x3.d(obj2, j10)) {
                        zA = false;
                    }
                    break;
                case 17:
                    if (!a(i10, obj, obj2) || !u2.a(x3.e(obj, j10), x3.e(obj2, j10))) {
                        zA = false;
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zA = u2.a(x3.e(obj, j10), x3.e(obj2, j10));
                    break;
                case 50:
                    zA = u2.a(x3.e(obj, j10), x3.e(obj2, j10));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j11 = iArr[i10 + 2] & 1048575;
                    if (x3.c(obj, j11) != x3.c(obj2, j11) || !u2.a(x3.e(obj, j10), x3.e(obj2, j10))) {
                        zA = false;
                    }
                    break;
            }
            if (!zA) {
                return false;
            }
            i10 += 3;
        }
    }

    public final t2 c(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f18203b;
        t2 t2Var = (t2) objArr[i11];
        if (t2Var != null) {
            return t2Var;
        }
        t2 t2VarA = p2.f18255c.a((Class) objArr[i11 + 1]);
        this.f18203b[i11] = t2VarA;
        return t2VarA;
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0228 A[PHI: r2
  0x0228: PHI (r2v30 int) = (r2v10 int), (r2v31 int) binds: [B:81:0x0225, B:40:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final int d(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int i11;
        int iFloatToIntBits;
        int i12;
        int i13;
        int length = this.f18202a.length;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15 += 3) {
            int[] iArr = this.f18202a;
            int i16 = iArr[i15 + 1];
            int i17 = iArr[i15];
            long j10 = 1048575 & i16;
            int i18 = 1231;
            int iHashCode = 37;
            switch ((i16 & 267386880) >>> 20) {
                case 0:
                    i10 = i14 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(x3.f18340c.c(obj, j10));
                    Charset charset = l1.f18232a;
                    i13 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    i14 = i13;
                    break;
                case 1:
                    i11 = i14 * 53;
                    iFloatToIntBits = Float.floatToIntBits(x3.f18340c.d(obj, j10));
                    i13 = iFloatToIntBits + i11;
                    i14 = i13;
                    break;
                case 2:
                    i10 = i14 * 53;
                    jDoubleToLongBits = x3.d(obj, j10);
                    Charset charset2 = l1.f18232a;
                    i13 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    i14 = i13;
                    break;
                case 3:
                    i10 = i14 * 53;
                    jDoubleToLongBits = x3.d(obj, j10);
                    Charset charset3 = l1.f18232a;
                    i13 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    i14 = i13;
                    break;
                case 4:
                    i11 = i14 * 53;
                    iFloatToIntBits = x3.c(obj, j10);
                    i13 = iFloatToIntBits + i11;
                    i14 = i13;
                    break;
                case 5:
                    i10 = i14 * 53;
                    jDoubleToLongBits = x3.d(obj, j10);
                    Charset charset4 = l1.f18232a;
                    i13 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    i14 = i13;
                    break;
                case 6:
                    i11 = i14 * 53;
                    iFloatToIntBits = x3.c(obj, j10);
                    i13 = iFloatToIntBits + i11;
                    i14 = i13;
                    break;
                case 7:
                    i12 = i14 * 53;
                    boolean zA = x3.f18340c.a(obj, j10);
                    Charset charset5 = l1.f18232a;
                    if (!zA) {
                        i18 = 1237;
                    }
                    i13 = i18 + i12;
                    i14 = i13;
                    break;
                case 8:
                    i11 = i14 * 53;
                    iFloatToIntBits = ((String) x3.e(obj, j10)).hashCode();
                    i13 = iFloatToIntBits + i11;
                    i14 = i13;
                    break;
                case 9:
                    Object objE = x3.e(obj, j10);
                    if (objE != null) {
                        iHashCode = objE.hashCode();
                    }
                    iFloatToIntBits = i14 * 53;
                    i11 = iHashCode;
                    i13 = iFloatToIntBits + i11;
                    i14 = i13;
                    break;
                case 10:
                    i11 = i14 * 53;
                    iFloatToIntBits = x3.e(obj, j10).hashCode();
                    i13 = iFloatToIntBits + i11;
                    i14 = i13;
                    break;
                case 11:
                    i11 = i14 * 53;
                    iFloatToIntBits = x3.c(obj, j10);
                    i13 = iFloatToIntBits + i11;
                    i14 = i13;
                    break;
                case 12:
                    i11 = i14 * 53;
                    iFloatToIntBits = x3.c(obj, j10);
                    i13 = iFloatToIntBits + i11;
                    i14 = i13;
                    break;
                case 13:
                    i11 = i14 * 53;
                    iFloatToIntBits = x3.c(obj, j10);
                    i13 = iFloatToIntBits + i11;
                    i14 = i13;
                    break;
                case 14:
                    i10 = i14 * 53;
                    jDoubleToLongBits = x3.d(obj, j10);
                    Charset charset6 = l1.f18232a;
                    i13 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    i14 = i13;
                    break;
                case 15:
                    i11 = i14 * 53;
                    iFloatToIntBits = x3.c(obj, j10);
                    i13 = iFloatToIntBits + i11;
                    i14 = i13;
                    break;
                case 16:
                    i10 = i14 * 53;
                    jDoubleToLongBits = x3.d(obj, j10);
                    Charset charset7 = l1.f18232a;
                    i13 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    i14 = i13;
                    break;
                case 17:
                    Object objE2 = x3.e(obj, j10);
                    if (objE2 != null) {
                        iHashCode = objE2.hashCode();
                    }
                    iFloatToIntBits = i14 * 53;
                    i11 = iHashCode;
                    i13 = iFloatToIntBits + i11;
                    i14 = i13;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i11 = i14 * 53;
                    iFloatToIntBits = x3.e(obj, j10).hashCode();
                    i13 = iFloatToIntBits + i11;
                    i14 = i13;
                    break;
                case 50:
                    i11 = i14 * 53;
                    iFloatToIntBits = x3.e(obj, j10).hashCode();
                    i13 = iFloatToIntBits + i11;
                    i14 = i13;
                    break;
                case 51:
                    if (a(obj, i17, i15)) {
                        i10 = i14 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) x3.e(obj, j10)).doubleValue());
                        Charset charset8 = l1.f18232a;
                        i13 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        i14 = i13;
                    }
                    break;
                case 52:
                    if (a(obj, i17, i15)) {
                        i11 = i14 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) x3.e(obj, j10)).floatValue());
                        i13 = iFloatToIntBits + i11;
                        i14 = i13;
                    }
                    break;
                case 53:
                    if (a(obj, i17, i15)) {
                        i10 = i14 * 53;
                        jDoubleToLongBits = ((Long) x3.e(obj, j10)).longValue();
                        Charset charset9 = l1.f18232a;
                        i13 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        i14 = i13;
                    }
                    break;
                case 54:
                    if (a(obj, i17, i15)) {
                        i10 = i14 * 53;
                        jDoubleToLongBits = ((Long) x3.e(obj, j10)).longValue();
                        Charset charset10 = l1.f18232a;
                        i13 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        i14 = i13;
                    }
                    break;
                case 55:
                    if (a(obj, i17, i15)) {
                        i11 = i14 * 53;
                        iFloatToIntBits = ((Integer) x3.e(obj, j10)).intValue();
                        i13 = iFloatToIntBits + i11;
                        i14 = i13;
                    }
                    break;
                case 56:
                    if (a(obj, i17, i15)) {
                        i10 = i14 * 53;
                        jDoubleToLongBits = ((Long) x3.e(obj, j10)).longValue();
                        Charset charset11 = l1.f18232a;
                        i13 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        i14 = i13;
                    }
                    break;
                case 57:
                    if (a(obj, i17, i15)) {
                        i11 = i14 * 53;
                        iFloatToIntBits = ((Integer) x3.e(obj, j10)).intValue();
                        i13 = iFloatToIntBits + i11;
                        i14 = i13;
                    }
                    break;
                case 58:
                    if (a(obj, i17, i15)) {
                        i12 = i14 * 53;
                        boolean zBooleanValue = ((Boolean) x3.e(obj, j10)).booleanValue();
                        Charset charset12 = l1.f18232a;
                        if (!zBooleanValue) {
                            i18 = 1237;
                        }
                        i13 = i18 + i12;
                        i14 = i13;
                    }
                    break;
                case 59:
                    if (a(obj, i17, i15)) {
                        i11 = i14 * 53;
                        iFloatToIntBits = ((String) x3.e(obj, j10)).hashCode();
                        i13 = iFloatToIntBits + i11;
                        i14 = i13;
                    }
                    break;
                case 60:
                    if (a(obj, i17, i15)) {
                        i11 = i14 * 53;
                        iFloatToIntBits = x3.e(obj, j10).hashCode();
                        i13 = iFloatToIntBits + i11;
                        i14 = i13;
                    }
                    break;
                case 61:
                    if (a(obj, i17, i15)) {
                        i11 = i14 * 53;
                        iFloatToIntBits = x3.e(obj, j10).hashCode();
                        i13 = iFloatToIntBits + i11;
                        i14 = i13;
                    }
                    break;
                case 62:
                    if (a(obj, i17, i15)) {
                        i11 = i14 * 53;
                        iFloatToIntBits = ((Integer) x3.e(obj, j10)).intValue();
                        i13 = iFloatToIntBits + i11;
                        i14 = i13;
                    }
                    break;
                case 63:
                    if (a(obj, i17, i15)) {
                        i11 = i14 * 53;
                        iFloatToIntBits = ((Integer) x3.e(obj, j10)).intValue();
                        i13 = iFloatToIntBits + i11;
                        i14 = i13;
                    }
                    break;
                case 64:
                    if (a(obj, i17, i15)) {
                        i11 = i14 * 53;
                        iFloatToIntBits = ((Integer) x3.e(obj, j10)).intValue();
                        i13 = iFloatToIntBits + i11;
                        i14 = i13;
                    }
                    break;
                case 65:
                    if (a(obj, i17, i15)) {
                        i10 = i14 * 53;
                        jDoubleToLongBits = ((Long) x3.e(obj, j10)).longValue();
                        Charset charset13 = l1.f18232a;
                        i13 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        i14 = i13;
                    }
                    break;
                case 66:
                    if (a(obj, i17, i15)) {
                        i11 = i14 * 53;
                        iFloatToIntBits = ((Integer) x3.e(obj, j10)).intValue();
                        i13 = iFloatToIntBits + i11;
                        i14 = i13;
                    }
                    break;
                case 67:
                    if (a(obj, i17, i15)) {
                        i10 = i14 * 53;
                        jDoubleToLongBits = ((Long) x3.e(obj, j10)).longValue();
                        Charset charset14 = l1.f18232a;
                        i13 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        i14 = i13;
                    }
                    break;
                case 68:
                    if (a(obj, i17, i15)) {
                        i11 = i14 * 53;
                        iFloatToIntBits = x3.e(obj, j10).hashCode();
                        i13 = iFloatToIntBits + i11;
                        i14 = i13;
                    }
                    break;
            }
        }
        this.f18215n.getClass();
        int iHashCode2 = ((z0) obj).unknownFields.hashCode() + (i14 * 53);
        if (!this.f18207f) {
            return iHashCode2;
        }
        this.f18216o.getClass();
        return (iHashCode2 * 53) + ((GeneratedMessageLite$ExtendableMessage) obj).extensions.f18241a.hashCode();
    }

    public final void e(int i10, Object obj, Object obj2) {
        int[] iArr = this.f18202a;
        int i11 = iArr[i10 + 1];
        int i12 = iArr[i10];
        long j10 = i11 & 1048575;
        if (a(obj2, i12, i10)) {
            Object objE = a(obj, i12, i10) ? x3.e(obj, j10) : null;
            Object objE2 = x3.e(obj2, j10);
            if (objE != null && objE2 != null) {
                x3.a(j10, obj, l1.a(objE, objE2));
                b(obj, i12, i10);
            } else if (objE2 != null) {
                x3.a(j10, obj, objE2);
                b(obj, i12, i10);
            }
        }
    }

    public i2(int[] iArr, Object[] objArr, int i10, int i11, d2 d2Var, boolean z10, int[] iArr2, int i12, int i13, k2 k2Var, t1 t1Var, o3 o3Var, j0 j0Var, z1 z1Var) {
        boolean z11;
        this.f18202a = iArr;
        this.f18203b = objArr;
        this.f18204c = i10;
        this.f18205d = i11;
        this.f18208g = d2Var instanceof z0;
        this.f18209h = z10;
        if (j0Var != null && (d2Var instanceof GeneratedMessageLite$ExtendableMessage)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f18207f = z11;
        this.f18210i = iArr2;
        this.f18211j = i12;
        this.f18212k = i13;
        this.f18213l = k2Var;
        this.f18214m = t1Var;
        this.f18215n = o3Var;
        this.f18216o = j0Var;
        this.f18206e = d2Var;
        this.f18217p = z1Var;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void c(Object obj) {
        int i10;
        int i11 = this.f18211j;
        while (true) {
            i10 = this.f18212k;
            if (i11 >= i10) {
                break;
            }
            long j10 = this.f18202a[this.f18210i[i11] + 1] & 1048575;
            Object objE = x3.e(obj, j10);
            if (objE != null) {
                this.f18217p.getClass();
                ((y1) objE).f18350a = false;
                x3.a(j10, obj, objE);
            }
            i11++;
        }
        int length = this.f18210i.length;
        while (i10 < length) {
            this.f18214m.a(obj, this.f18210i[i10]);
            i10++;
        }
        this.f18215n.getClass();
        ((z0) obj).unknownFields.f18250e = false;
        if (this.f18207f) {
            this.f18216o.getClass();
            ((GeneratedMessageLite$ExtendableMessage) obj).extensions.e();
        }
    }

    public final void c(int i10, Object obj, Object obj2) {
        long j10 = this.f18202a[i10 + 1] & 1048575;
        Object objE = x3.e(obj, j10);
        if (objE != null) {
            this.f18217p.getClass();
            if (!((y1) objE).f18350a) {
                this.f18217p.getClass();
                y1 y1Var = y1.f18349b;
                y1 y1Var2 = y1Var.isEmpty() ? new y1() : new y1(y1Var);
                this.f18217p.getClass();
                z1.a(y1Var2, objE);
                x3.a(j10, obj, y1Var2);
                objE = y1Var2;
            }
        } else {
            this.f18217p.getClass();
            y1 y1Var3 = y1.f18349b;
            objE = y1Var3.isEmpty() ? new y1() : new y1(y1Var3);
            x3.a(j10, obj, objE);
        }
        this.f18217p.getClass();
        this.f18217p.getClass();
        obj2.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0398  */
    /* JADX WARN: Code duplicated, block: B:161:0x0446  */
    /* JADX WARN: Code duplicated, block: B:238:0x0634 A[PHI: r6
  0x0634: PHI (r6v70 int) = (r6v8 int), (r6v72 int) binds: [B:236:0x062d, B:59:0x017e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:387:0x0a28  */
    /* JADX WARN: Code duplicated, block: B:412:0x0ad6  */
    /* JADX WARN: Code duplicated, block: B:489:0x0ca8 A[PHI: r4
  0x0ca8: PHI (r4v68 int) = (r4v5 int), (r4v70 int) binds: [B:487:0x0ca1, B:311:0x080b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final int b(Object obj) {
        int i10;
        int i11;
        int iA;
        int iB;
        int iA2;
        int iB2;
        int iC;
        int iB3;
        int iA3;
        int iB4;
        int iB5;
        int iA4;
        int iB6;
        int iA5;
        int iA6;
        int iB7;
        int iC2;
        int iB8;
        int iA7;
        int iB9;
        int i12 = 267386880;
        int i13 = 1048575;
        if (this.f18209h) {
            Unsafe unsafe = f18201r;
            int i14 = 0;
            int iB10 = 0;
            while (true) {
                int[] iArr = this.f18202a;
                if (i14 < iArr.length) {
                    int i15 = iArr[i14 + 1];
                    int i16 = (i15 & 267386880) >>> 20;
                    int i17 = iArr[i14];
                    long j10 = i15 & i13;
                    if (i16 >= FieldType.DOUBLE_LIST_PACKED.id() && i16 <= FieldType.SINT64_LIST_PACKED.id()) {
                        int i18 = this.f18202a[i14 + 2];
                    }
                    switch (i16) {
                        case 0:
                            if (a(i14, obj)) {
                                iA4 = g2.a(i17, 8, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 1:
                            if (a(i14, obj)) {
                                iA4 = g2.a(i17, 4, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 2:
                            if (a(i14, obj)) {
                                long jD = x3.d(obj, j10);
                                iB6 = b0.b(i17);
                                iA5 = b0.a(jD);
                                iA6 = iA5 + iB6;
                                iA4 = iA6 + iB10;
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 3:
                            if (a(i14, obj)) {
                                iA6 = b0.a(x3.d(obj, j10)) + b0.b(i17);
                                iA4 = iA6 + iB10;
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 4:
                            if (a(i14, obj)) {
                                int iC3 = x3.c(obj, j10);
                                iB7 = b0.b(i17);
                                if (iC3 >= 0) {
                                    iC2 = b0.c(iC3);
                                } else {
                                    iC2 = 10;
                                }
                                iA6 = iC2 + iB7;
                                iA4 = iA6 + iB10;
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 5:
                            if (a(i14, obj)) {
                                iA4 = g2.a(i17, 8, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 6:
                            if (a(i14, obj)) {
                                iA4 = g2.a(i17, 4, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 7:
                            if (a(i14, obj)) {
                                iA4 = g2.a(i17, 1, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 8:
                            if (a(i14, obj)) {
                                Object objE = x3.e(obj, j10);
                                if (objE instanceof s) {
                                    iB8 = b0.b(i17);
                                    iA7 = b0.a((s) objE);
                                } else {
                                    iB8 = b0.b(i17);
                                    iA7 = b0.a((String) objE);
                                }
                                iA6 = iA7 + iB8;
                                iA4 = iA6 + iB10;
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 9:
                            if (a(i14, obj)) {
                                Object objE2 = x3.e(obj, j10);
                                t2 t2VarC = c(i14);
                                Class cls = u2.f18301a;
                                int iB11 = b0.b(i17);
                                int serializedSize = ((b) ((d2) objE2)).getSerializedSize(t2VarC);
                                iA4 = l0.a(serializedSize, serializedSize, iB11, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 10:
                            if (a(i14, obj)) {
                                s sVar = (s) x3.e(obj, j10);
                                iB8 = b0.b(i17);
                                iA7 = b0.a(sVar);
                                iA6 = iA7 + iB8;
                                iA4 = iA6 + iB10;
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 11:
                            if (a(i14, obj)) {
                                int iC4 = x3.c(obj, j10);
                                iB8 = b0.b(i17);
                                iA7 = b0.c(iC4);
                                iA6 = iA7 + iB8;
                                iA4 = iA6 + iB10;
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 12:
                            if (a(i14, obj)) {
                                int iC5 = x3.c(obj, j10);
                                iB8 = b0.b(i17);
                                iA7 = b0.a(iC5);
                                iA6 = iA7 + iB8;
                                iA4 = iA6 + iB10;
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 13:
                            if (a(i14, obj)) {
                                iA4 = g2.a(i17, 4, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 14:
                            if (a(i14, obj)) {
                                iA4 = g2.a(i17, 8, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 15:
                            if (a(i14, obj)) {
                                int iC6 = x3.c(obj, j10);
                                iB6 = b0.b(i17);
                                iA5 = b0.c(b0.d(iC6));
                                iA6 = iA5 + iB6;
                                iA4 = iA6 + iB10;
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 16:
                            if (a(i14, obj)) {
                                long jD2 = x3.d(obj, j10);
                                iB6 = b0.b(i17);
                                iA5 = b0.a(b0.b(jD2));
                                iA6 = iA5 + iB6;
                                iA4 = iA6 + iB10;
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 17:
                            if (a(i14, obj)) {
                                d2 d2Var = (d2) x3.e(obj, j10);
                                t2 t2VarC2 = c(i14);
                                iB6 = b0.b(i17) * 2;
                                iA5 = ((b) d2Var).getSerializedSize(t2VarC2);
                                iA6 = iA5 + iB6;
                                iA4 = iA6 + iB10;
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 18:
                            iA6 = u2.b(i17, (List) x3.e(obj, j10));
                            iA4 = iA6 + iB10;
                            iB10 = iA4;
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 19:
                            iA6 = u2.a(i17, (List) x3.e(obj, j10));
                            iA4 = iA6 + iB10;
                            iB10 = iA4;
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 20:
                            List list = (List) x3.e(obj, j10);
                            Class cls2 = u2.f18301a;
                            if (list.size() == 0) {
                                iA6 = 0;
                            } else {
                                iA6 = h2.a(i17, list.size(), u2.c(list));
                            }
                            iA4 = iA6 + iB10;
                            iB10 = iA4;
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 21:
                            List list2 = (List) x3.e(obj, j10);
                            Class cls3 = u2.f18301a;
                            int size = list2.size();
                            if (size == 0) {
                                iA6 = 0;
                            } else {
                                iA6 = h2.a(i17, size, u2.g(list2));
                            }
                            iA4 = iA6 + iB10;
                            iB10 = iA4;
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 22:
                            List list3 = (List) x3.e(obj, j10);
                            Class cls4 = u2.f18301a;
                            int size2 = list3.size();
                            if (size2 == 0) {
                                iA6 = 0;
                            } else {
                                iA6 = h2.a(i17, size2, u2.b(list3));
                            }
                            iA4 = iA6 + iB10;
                            iB10 = iA4;
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 23:
                            iA6 = u2.b(i17, (List) x3.e(obj, j10));
                            iA4 = iA6 + iB10;
                            iB10 = iA4;
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 24:
                            iA6 = u2.a(i17, (List) x3.e(obj, j10));
                            iA4 = iA6 + iB10;
                            iB10 = iA4;
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 25:
                            List list4 = (List) x3.e(obj, j10);
                            Class cls5 = u2.f18301a;
                            int size3 = list4.size();
                            iB10 = (size3 == 0 ? 0 : (b0.b(i17) + 1) * size3) + iB10;
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 26:
                            iA6 = u2.c(i17, (List) x3.e(obj, j10));
                            iA4 = iA6 + iB10;
                            iB10 = iA4;
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 27:
                            List list5 = (List) x3.e(obj, j10);
                            t2 t2VarC3 = c(i14);
                            Class cls6 = u2.f18301a;
                            int size4 = list5.size();
                            if (size4 == 0) {
                                iB9 = 0;
                            } else {
                                iB9 = b0.b(i17) * size4;
                                for (int i19 = 0; i19 < size4; i19++) {
                                    int serializedSize2 = ((b) ((d2) list5.get(i19))).getSerializedSize(t2VarC3);
                                    iB9 = b0.c(serializedSize2) + serializedSize2 + iB9;
                                }
                            }
                            iB10 = iB9 + iB10;
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 28:
                            List list6 = (List) x3.e(obj, j10);
                            Class cls7 = u2.f18301a;
                            int size5 = list6.size();
                            if (size5 == 0) {
                                iB9 = 0;
                            } else {
                                iB9 = b0.b(i17) * size5;
                                for (int i20 = 0; i20 < list6.size(); i20++) {
                                    iB9 = b0.a((s) list6.get(i20)) + iB9;
                                }
                            }
                            iB10 = iB9 + iB10;
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 29:
                            List list7 = (List) x3.e(obj, j10);
                            Class cls8 = u2.f18301a;
                            int size6 = list7.size();
                            if (size6 == 0) {
                                iA6 = 0;
                            } else {
                                iA6 = h2.a(i17, size6, u2.f(list7));
                            }
                            iA4 = iA6 + iB10;
                            iB10 = iA4;
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 30:
                            List list8 = (List) x3.e(obj, j10);
                            Class cls9 = u2.f18301a;
                            int size7 = list8.size();
                            if (size7 == 0) {
                                iA6 = 0;
                            } else {
                                iA6 = h2.a(i17, size7, u2.a(list8));
                            }
                            iA4 = iA6 + iB10;
                            iB10 = iA4;
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 31:
                            iA6 = u2.a(i17, (List) x3.e(obj, j10));
                            iA4 = iA6 + iB10;
                            iB10 = iA4;
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 32:
                            iA6 = u2.b(i17, (List) x3.e(obj, j10));
                            iA4 = iA6 + iB10;
                            iB10 = iA4;
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 33:
                            List list9 = (List) x3.e(obj, j10);
                            Class cls10 = u2.f18301a;
                            int size8 = list9.size();
                            if (size8 == 0) {
                                iA6 = 0;
                            } else {
                                iA6 = h2.a(i17, size8, u2.d(list9));
                            }
                            iA4 = iA6 + iB10;
                            iB10 = iA4;
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 34:
                            List list10 = (List) x3.e(obj, j10);
                            Class cls11 = u2.f18301a;
                            int size9 = list10.size();
                            if (size9 == 0) {
                                iA6 = 0;
                            } else {
                                iA6 = h2.a(i17, size9, u2.e(list10));
                            }
                            iA4 = iA6 + iB10;
                            iB10 = iA4;
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 35:
                            List list11 = (List) unsafe.getObject(obj, j10);
                            Class cls12 = u2.f18301a;
                            int size10 = list11.size() * 8;
                            if (size10 > 0) {
                                iA4 = l0.a(size10, b0.b(i17), size10, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 36:
                            List list12 = (List) unsafe.getObject(obj, j10);
                            Class cls13 = u2.f18301a;
                            int size11 = list12.size() * 4;
                            if (size11 > 0) {
                                iA4 = l0.a(size11, b0.b(i17), size11, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 37:
                            int iC7 = u2.c((List) unsafe.getObject(obj, j10));
                            if (iC7 > 0) {
                                iA4 = l0.a(iC7, b0.b(i17), iC7, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 38:
                            int iG = u2.g((List) unsafe.getObject(obj, j10));
                            if (iG > 0) {
                                iA4 = l0.a(iG, b0.b(i17), iG, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 39:
                            int iB12 = u2.b((List) unsafe.getObject(obj, j10));
                            if (iB12 > 0) {
                                iA4 = l0.a(iB12, b0.b(i17), iB12, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 40:
                            List list13 = (List) unsafe.getObject(obj, j10);
                            Class cls14 = u2.f18301a;
                            int size12 = list13.size() * 8;
                            if (size12 > 0) {
                                iA4 = l0.a(size12, b0.b(i17), size12, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 41:
                            List list14 = (List) unsafe.getObject(obj, j10);
                            Class cls15 = u2.f18301a;
                            int size13 = list14.size() * 4;
                            if (size13 > 0) {
                                iA4 = l0.a(size13, b0.b(i17), size13, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 42:
                            List list15 = (List) unsafe.getObject(obj, j10);
                            Class cls16 = u2.f18301a;
                            int size14 = list15.size();
                            if (size14 > 0) {
                                iA4 = l0.a(size14, b0.b(i17), size14, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 43:
                            int iF = u2.f((List) unsafe.getObject(obj, j10));
                            if (iF > 0) {
                                iA4 = l0.a(iF, b0.b(i17), iF, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 44:
                            int iA8 = u2.a((List) unsafe.getObject(obj, j10));
                            if (iA8 > 0) {
                                iA4 = l0.a(iA8, b0.b(i17), iA8, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 45:
                            List list16 = (List) unsafe.getObject(obj, j10);
                            Class cls17 = u2.f18301a;
                            int size15 = list16.size() * 4;
                            if (size15 > 0) {
                                iA4 = l0.a(size15, b0.b(i17), size15, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 46:
                            List list17 = (List) unsafe.getObject(obj, j10);
                            Class cls18 = u2.f18301a;
                            int size16 = list17.size() * 8;
                            if (size16 > 0) {
                                iA4 = l0.a(size16, b0.b(i17), size16, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 47:
                            int iD = u2.d((List) unsafe.getObject(obj, j10));
                            if (iD > 0) {
                                iA4 = l0.a(iD, b0.b(i17), iD, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 48:
                            int iE = u2.e((List) unsafe.getObject(obj, j10));
                            if (iE > 0) {
                                iA4 = l0.a(iE, b0.b(i17), iE, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 49:
                            List list18 = (List) x3.e(obj, j10);
                            t2 t2VarC4 = c(i14);
                            Class cls19 = u2.f18301a;
                            int size17 = list18.size();
                            if (size17 == 0) {
                                iB9 = 0;
                            } else {
                                iB9 = 0;
                                for (int i21 = 0; i21 < size17; i21++) {
                                    iB9 = ((b) ((d2) list18.get(i21))).getSerializedSize(t2VarC4) + (b0.b(i17) * 2) + iB9;
                                }
                            }
                            iB10 = iB9 + iB10;
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 50:
                            z1 z1Var = this.f18217p;
                            Object objE3 = x3.e(obj, j10);
                            Object objB = b(i14);
                            z1Var.getClass();
                            y1 y1Var = (y1) objE3;
                            if (objB == null) {
                                if (y1Var.isEmpty()) {
                                    continue;
                                } else {
                                    Iterator it = y1Var.entrySet().iterator();
                                    if (it.hasNext()) {
                                        Map.Entry entry = (Map.Entry) it.next();
                                        entry.getKey();
                                        entry.getValue();
                                        throw null;
                                    }
                                }
                                i14 += 3;
                                i13 = 1048575;
                            } else {
                                throw new ClassCastException();
                            }
                            break;
                        case 51:
                            if (a(obj, i17, i14)) {
                                iA4 = g2.a(i17, 8, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 52:
                            if (a(obj, i17, i14)) {
                                iA4 = g2.a(i17, 4, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 53:
                            if (a(obj, i17, i14)) {
                                long jLongValue = ((Long) x3.e(obj, j10)).longValue();
                                iB6 = b0.b(i17);
                                iA5 = b0.a(jLongValue);
                                iA6 = iA5 + iB6;
                                iA4 = iA6 + iB10;
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 54:
                            if (a(obj, i17, i14)) {
                                long jLongValue2 = ((Long) x3.e(obj, j10)).longValue();
                                iB6 = b0.b(i17);
                                iA5 = b0.a(jLongValue2);
                                iA6 = iA5 + iB6;
                                iA4 = iA6 + iB10;
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 55:
                            if (a(obj, i17, i14)) {
                                int iIntValue = ((Integer) x3.e(obj, j10)).intValue();
                                iB7 = b0.b(i17);
                                if (iIntValue >= 0) {
                                    iC2 = b0.c(iIntValue);
                                } else {
                                    iC2 = 10;
                                }
                                iA6 = iC2 + iB7;
                                iA4 = iA6 + iB10;
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 56:
                            if (a(obj, i17, i14)) {
                                iA4 = g2.a(i17, 8, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 57:
                            if (a(obj, i17, i14)) {
                                iA4 = g2.a(i17, 4, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 58:
                            if (a(obj, i17, i14)) {
                                iA4 = g2.a(i17, 1, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 59:
                            if (a(obj, i17, i14)) {
                                Object objE4 = x3.e(obj, j10);
                                if (objE4 instanceof s) {
                                    iB8 = b0.b(i17);
                                    iA7 = b0.a((s) objE4);
                                } else {
                                    iB8 = b0.b(i17);
                                    iA7 = b0.a((String) objE4);
                                }
                                iA6 = iA7 + iB8;
                                iA4 = iA6 + iB10;
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 60:
                            if (a(obj, i17, i14)) {
                                Object objE5 = x3.e(obj, j10);
                                t2 t2VarC5 = c(i14);
                                Class cls20 = u2.f18301a;
                                int iB13 = b0.b(i17);
                                int serializedSize3 = ((b) ((d2) objE5)).getSerializedSize(t2VarC5);
                                iA4 = l0.a(serializedSize3, serializedSize3, iB13, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 61:
                            if (a(obj, i17, i14)) {
                                s sVar2 = (s) x3.e(obj, j10);
                                iB8 = b0.b(i17);
                                iA7 = b0.a(sVar2);
                                iA6 = iA7 + iB8;
                                iA4 = iA6 + iB10;
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 62:
                            if (a(obj, i17, i14)) {
                                int iIntValue2 = ((Integer) x3.e(obj, j10)).intValue();
                                iB8 = b0.b(i17);
                                iA7 = b0.c(iIntValue2);
                                iA6 = iA7 + iB8;
                                iA4 = iA6 + iB10;
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 63:
                            if (a(obj, i17, i14)) {
                                int iIntValue3 = ((Integer) x3.e(obj, j10)).intValue();
                                iB8 = b0.b(i17);
                                iA7 = b0.a(iIntValue3);
                                iA6 = iA7 + iB8;
                                iA4 = iA6 + iB10;
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 64:
                            if (a(obj, i17, i14)) {
                                iA4 = g2.a(i17, 4, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 65:
                            if (a(obj, i17, i14)) {
                                iA4 = g2.a(i17, 8, iB10);
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 66:
                            if (a(obj, i17, i14)) {
                                int iIntValue4 = ((Integer) x3.e(obj, j10)).intValue();
                                iB6 = b0.b(i17);
                                iA5 = b0.c(b0.d(iIntValue4));
                                iA6 = iA5 + iB6;
                                iA4 = iA6 + iB10;
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 67:
                            if (a(obj, i17, i14)) {
                                long jLongValue3 = ((Long) x3.e(obj, j10)).longValue();
                                iB6 = b0.b(i17);
                                iA5 = b0.a(b0.b(jLongValue3));
                                iA6 = iA5 + iB6;
                                iA4 = iA6 + iB10;
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        case 68:
                            if (a(obj, i17, i14)) {
                                d2 d2Var2 = (d2) x3.e(obj, j10);
                                t2 t2VarC6 = c(i14);
                                iB6 = b0.b(i17) * 2;
                                iA5 = ((b) d2Var2).getSerializedSize(t2VarC6);
                                iA6 = iA5 + iB6;
                                iA4 = iA6 + iB10;
                                iB10 = iA4;
                            }
                            i14 += 3;
                            i13 = 1048575;
                            break;
                        default:
                            i14 += 3;
                            i13 = 1048575;
                            break;
                    }
                } else {
                    this.f18215n.getClass();
                    return ((z0) obj).unknownFields.a() + iB10;
                }
            }
        } else {
            Unsafe unsafe2 = f18201r;
            int i22 = 0;
            int iB14 = 0;
            int i23 = 1048575;
            int i24 = 0;
            while (true) {
                int[] iArr2 = this.f18202a;
                if (i22 < iArr2.length) {
                    int i25 = iArr2[i22 + 1];
                    int i26 = iArr2[i22];
                    int i27 = (i25 & i12) >>> 20;
                    if (i27 <= 17) {
                        int i28 = iArr2[i22 + 2];
                        i10 = 1048575;
                        int i29 = i28 & 1048575;
                        i11 = 1 << (i28 >>> 20);
                        if (i29 != i23) {
                            i24 = unsafe2.getInt(obj, i29);
                            i23 = i29;
                        }
                    } else {
                        i10 = 1048575;
                        i11 = 0;
                    }
                    long j11 = i25 & i10;
                    switch (i27) {
                        case 0:
                            if ((i24 & i11) != 0) {
                                iA = g2.a(i26, 8, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 1:
                            if ((i24 & i11) != 0) {
                                iA = g2.a(i26, 4, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 2:
                            if ((i24 & i11) != 0) {
                                long j12 = unsafe2.getLong(obj, j11);
                                iB = b0.b(i26);
                                iA2 = b0.a(j12);
                                iB4 = iA2 + iB;
                                iA = iB4 + iB14;
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 3:
                            if ((i24 & i11) != 0) {
                                long j13 = unsafe2.getLong(obj, j11);
                                iB = b0.b(i26);
                                iA2 = b0.a(j13);
                                iB4 = iA2 + iB;
                                iA = iB4 + iB14;
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 4:
                            if ((i24 & i11) != 0) {
                                int i30 = unsafe2.getInt(obj, j11);
                                iB2 = b0.b(i26);
                                if (i30 >= 0) {
                                    iC = b0.c(i30);
                                } else {
                                    iC = 10;
                                }
                                iB4 = iC + iB2;
                                iA = iB4 + iB14;
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 5:
                            if ((i24 & i11) != 0) {
                                iA = g2.a(i26, 8, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 6:
                            if ((i24 & i11) != 0) {
                                iA = g2.a(i26, 4, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 7:
                            if ((i24 & i11) != 0) {
                                iA = g2.a(i26, 1, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 8:
                            if ((i24 & i11) != 0) {
                                Object object = unsafe2.getObject(obj, j11);
                                if (object instanceof s) {
                                    iB3 = b0.b(i26);
                                    iA3 = b0.a((s) object);
                                } else {
                                    iB3 = b0.b(i26);
                                    iA3 = b0.a((String) object);
                                }
                                iB4 = iA3 + iB3;
                                iA = iB4 + iB14;
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 9:
                            if ((i24 & i11) != 0) {
                                Object object2 = unsafe2.getObject(obj, j11);
                                t2 t2VarC7 = c(i22);
                                Class cls21 = u2.f18301a;
                                int iB15 = b0.b(i26);
                                int serializedSize4 = ((b) ((d2) object2)).getSerializedSize(t2VarC7);
                                iA = l0.a(serializedSize4, serializedSize4, iB15, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 10:
                            if ((i24 & i11) != 0) {
                                s sVar3 = (s) unsafe2.getObject(obj, j11);
                                iB3 = b0.b(i26);
                                iA3 = b0.a(sVar3);
                                iB4 = iA3 + iB3;
                                iA = iB4 + iB14;
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 11:
                            if ((i24 & i11) != 0) {
                                int i31 = unsafe2.getInt(obj, j11);
                                iB3 = b0.b(i26);
                                iA3 = b0.c(i31);
                                iB4 = iA3 + iB3;
                                iA = iB4 + iB14;
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 12:
                            if ((i24 & i11) != 0) {
                                int i32 = unsafe2.getInt(obj, j11);
                                iB3 = b0.b(i26);
                                iA3 = b0.a(i32);
                                iB4 = iA3 + iB3;
                                iA = iB4 + iB14;
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 13:
                            if ((i24 & i11) != 0) {
                                iA = g2.a(i26, 4, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 14:
                            if ((i24 & i11) != 0) {
                                iA = g2.a(i26, 8, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 15:
                            if ((i24 & i11) != 0) {
                                int i33 = unsafe2.getInt(obj, j11);
                                iB = b0.b(i26);
                                iA2 = b0.c(b0.d(i33));
                                iB4 = iA2 + iB;
                                iA = iB4 + iB14;
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 16:
                            if ((i24 & i11) != 0) {
                                long j14 = unsafe2.getLong(obj, j11);
                                iB = b0.b(i26);
                                iA2 = b0.a(b0.b(j14));
                                iB4 = iA2 + iB;
                                iA = iB4 + iB14;
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 17:
                            if ((i24 & i11) != 0) {
                                d2 d2Var3 = (d2) unsafe2.getObject(obj, j11);
                                t2 t2VarC8 = c(i22);
                                iB = b0.b(i26) * 2;
                                iA2 = ((b) d2Var3).getSerializedSize(t2VarC8);
                                iB4 = iA2 + iB;
                                iA = iB4 + iB14;
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 18:
                            iB4 = u2.b(i26, (List) unsafe2.getObject(obj, j11));
                            iA = iB4 + iB14;
                            iB14 = iA;
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 19:
                            iB4 = u2.a(i26, (List) unsafe2.getObject(obj, j11));
                            iA = iB4 + iB14;
                            iB14 = iA;
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 20:
                            List list19 = (List) unsafe2.getObject(obj, j11);
                            Class cls22 = u2.f18301a;
                            if (list19.size() == 0) {
                                iB4 = 0;
                            } else {
                                iB4 = h2.a(i26, list19.size(), u2.c(list19));
                            }
                            iA = iB4 + iB14;
                            iB14 = iA;
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 21:
                            List list20 = (List) unsafe2.getObject(obj, j11);
                            Class cls23 = u2.f18301a;
                            int size18 = list20.size();
                            if (size18 == 0) {
                                iB4 = 0;
                            } else {
                                iB4 = h2.a(i26, size18, u2.g(list20));
                            }
                            iA = iB4 + iB14;
                            iB14 = iA;
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 22:
                            List list21 = (List) unsafe2.getObject(obj, j11);
                            Class cls24 = u2.f18301a;
                            int size19 = list21.size();
                            if (size19 == 0) {
                                iB4 = 0;
                            } else {
                                iB4 = h2.a(i26, size19, u2.b(list21));
                            }
                            iA = iB4 + iB14;
                            iB14 = iA;
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 23:
                            iB4 = u2.b(i26, (List) unsafe2.getObject(obj, j11));
                            iA = iB4 + iB14;
                            iB14 = iA;
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 24:
                            iB4 = u2.a(i26, (List) unsafe2.getObject(obj, j11));
                            iA = iB4 + iB14;
                            iB14 = iA;
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 25:
                            List list22 = (List) unsafe2.getObject(obj, j11);
                            Class cls25 = u2.f18301a;
                            int size20 = list22.size();
                            iB14 = (size20 == 0 ? 0 : (b0.b(i26) + 1) * size20) + iB14;
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 26:
                            iB4 = u2.c(i26, (List) unsafe2.getObject(obj, j11));
                            iA = iB4 + iB14;
                            iB14 = iA;
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 27:
                            List list23 = (List) unsafe2.getObject(obj, j11);
                            t2 t2VarC9 = c(i22);
                            Class cls26 = u2.f18301a;
                            int size21 = list23.size();
                            if (size21 == 0) {
                                iB5 = 0;
                            } else {
                                iB5 = b0.b(i26) * size21;
                                for (int i34 = 0; i34 < size21; i34++) {
                                    int serializedSize5 = ((b) ((d2) list23.get(i34))).getSerializedSize(t2VarC9);
                                    iB5 = b0.c(serializedSize5) + serializedSize5 + iB5;
                                }
                            }
                            iB14 = iB5 + iB14;
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 28:
                            List list24 = (List) unsafe2.getObject(obj, j11);
                            Class cls27 = u2.f18301a;
                            int size22 = list24.size();
                            if (size22 == 0) {
                                iB5 = 0;
                            } else {
                                iB5 = b0.b(i26) * size22;
                                for (int i35 = 0; i35 < list24.size(); i35++) {
                                    iB5 = b0.a((s) list24.get(i35)) + iB5;
                                }
                            }
                            iB14 = iB5 + iB14;
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 29:
                            List list25 = (List) unsafe2.getObject(obj, j11);
                            Class cls28 = u2.f18301a;
                            int size23 = list25.size();
                            if (size23 == 0) {
                                iB4 = 0;
                            } else {
                                iB4 = h2.a(i26, size23, u2.f(list25));
                            }
                            iA = iB4 + iB14;
                            iB14 = iA;
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 30:
                            List list26 = (List) unsafe2.getObject(obj, j11);
                            Class cls29 = u2.f18301a;
                            int size24 = list26.size();
                            if (size24 == 0) {
                                iB4 = 0;
                            } else {
                                iB4 = h2.a(i26, size24, u2.a(list26));
                            }
                            iA = iB4 + iB14;
                            iB14 = iA;
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 31:
                            iB4 = u2.a(i26, (List) unsafe2.getObject(obj, j11));
                            iA = iB4 + iB14;
                            iB14 = iA;
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 32:
                            iB4 = u2.b(i26, (List) unsafe2.getObject(obj, j11));
                            iA = iB4 + iB14;
                            iB14 = iA;
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 33:
                            List list27 = (List) unsafe2.getObject(obj, j11);
                            Class cls30 = u2.f18301a;
                            int size25 = list27.size();
                            if (size25 == 0) {
                                iB4 = 0;
                            } else {
                                iB4 = h2.a(i26, size25, u2.d(list27));
                            }
                            iA = iB4 + iB14;
                            iB14 = iA;
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 34:
                            List list28 = (List) unsafe2.getObject(obj, j11);
                            Class cls31 = u2.f18301a;
                            int size26 = list28.size();
                            if (size26 == 0) {
                                iB4 = 0;
                            } else {
                                iB4 = h2.a(i26, size26, u2.e(list28));
                            }
                            iA = iB4 + iB14;
                            iB14 = iA;
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 35:
                            List list29 = (List) unsafe2.getObject(obj, j11);
                            Class cls32 = u2.f18301a;
                            int size27 = list29.size() * 8;
                            if (size27 > 0) {
                                iA = l0.a(size27, b0.b(i26), size27, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 36:
                            List list30 = (List) unsafe2.getObject(obj, j11);
                            Class cls33 = u2.f18301a;
                            int size28 = list30.size() * 4;
                            if (size28 > 0) {
                                iA = l0.a(size28, b0.b(i26), size28, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 37:
                            int iC8 = u2.c((List) unsafe2.getObject(obj, j11));
                            if (iC8 > 0) {
                                iA = l0.a(iC8, b0.b(i26), iC8, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 38:
                            int iG2 = u2.g((List) unsafe2.getObject(obj, j11));
                            if (iG2 > 0) {
                                iA = l0.a(iG2, b0.b(i26), iG2, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 39:
                            int iB16 = u2.b((List) unsafe2.getObject(obj, j11));
                            if (iB16 > 0) {
                                iA = l0.a(iB16, b0.b(i26), iB16, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 40:
                            List list31 = (List) unsafe2.getObject(obj, j11);
                            Class cls34 = u2.f18301a;
                            int size29 = list31.size() * 8;
                            if (size29 > 0) {
                                iA = l0.a(size29, b0.b(i26), size29, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 41:
                            List list32 = (List) unsafe2.getObject(obj, j11);
                            Class cls35 = u2.f18301a;
                            int size30 = list32.size() * 4;
                            if (size30 > 0) {
                                iA = l0.a(size30, b0.b(i26), size30, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 42:
                            List list33 = (List) unsafe2.getObject(obj, j11);
                            Class cls36 = u2.f18301a;
                            int size31 = list33.size();
                            if (size31 > 0) {
                                iA = l0.a(size31, b0.b(i26), size31, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 43:
                            int iF2 = u2.f((List) unsafe2.getObject(obj, j11));
                            if (iF2 > 0) {
                                iA = l0.a(iF2, b0.b(i26), iF2, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 44:
                            int iA9 = u2.a((List) unsafe2.getObject(obj, j11));
                            if (iA9 > 0) {
                                iA = l0.a(iA9, b0.b(i26), iA9, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 45:
                            List list34 = (List) unsafe2.getObject(obj, j11);
                            Class cls37 = u2.f18301a;
                            int size32 = list34.size() * 4;
                            if (size32 > 0) {
                                iA = l0.a(size32, b0.b(i26), size32, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 46:
                            List list35 = (List) unsafe2.getObject(obj, j11);
                            Class cls38 = u2.f18301a;
                            int size33 = list35.size() * 8;
                            if (size33 > 0) {
                                iA = l0.a(size33, b0.b(i26), size33, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 47:
                            int iD2 = u2.d((List) unsafe2.getObject(obj, j11));
                            if (iD2 > 0) {
                                iA = l0.a(iD2, b0.b(i26), iD2, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 48:
                            int iE2 = u2.e((List) unsafe2.getObject(obj, j11));
                            if (iE2 > 0) {
                                iA = l0.a(iE2, b0.b(i26), iE2, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 49:
                            List list36 = (List) unsafe2.getObject(obj, j11);
                            t2 t2VarC10 = c(i22);
                            Class cls39 = u2.f18301a;
                            int size34 = list36.size();
                            if (size34 == 0) {
                                iB5 = 0;
                            } else {
                                iB5 = 0;
                                for (int i36 = 0; i36 < size34; i36++) {
                                    iB5 = ((b) ((d2) list36.get(i36))).getSerializedSize(t2VarC10) + (b0.b(i26) * 2) + iB5;
                                }
                            }
                            iB14 = iB5 + iB14;
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 50:
                            z1 z1Var2 = this.f18217p;
                            Object object3 = unsafe2.getObject(obj, j11);
                            Object objB2 = b(i22);
                            z1Var2.getClass();
                            y1 y1Var2 = (y1) object3;
                            if (objB2 == null) {
                                if (y1Var2.isEmpty()) {
                                    continue;
                                } else {
                                    Iterator it2 = y1Var2.entrySet().iterator();
                                    if (it2.hasNext()) {
                                        Map.Entry entry2 = (Map.Entry) it2.next();
                                        entry2.getKey();
                                        entry2.getValue();
                                        throw null;
                                    }
                                }
                                i22 += 3;
                                i12 = 267386880;
                            } else {
                                throw new ClassCastException();
                            }
                            break;
                        case 51:
                            if (a(obj, i26, i22)) {
                                iA = g2.a(i26, 8, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 52:
                            if (a(obj, i26, i22)) {
                                iA = g2.a(i26, 4, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 53:
                            if (a(obj, i26, i22)) {
                                long jLongValue4 = ((Long) x3.e(obj, j11)).longValue();
                                iB = b0.b(i26);
                                iA2 = b0.a(jLongValue4);
                                iB4 = iA2 + iB;
                                iA = iB4 + iB14;
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 54:
                            if (a(obj, i26, i22)) {
                                long jLongValue5 = ((Long) x3.e(obj, j11)).longValue();
                                iB = b0.b(i26);
                                iA2 = b0.a(jLongValue5);
                                iB4 = iA2 + iB;
                                iA = iB4 + iB14;
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 55:
                            if (a(obj, i26, i22)) {
                                int iIntValue5 = ((Integer) x3.e(obj, j11)).intValue();
                                iB2 = b0.b(i26);
                                if (iIntValue5 >= 0) {
                                    iC = b0.c(iIntValue5);
                                } else {
                                    iC = 10;
                                }
                                iB4 = iC + iB2;
                                iA = iB4 + iB14;
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 56:
                            if (a(obj, i26, i22)) {
                                iA = g2.a(i26, 8, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 57:
                            if (a(obj, i26, i22)) {
                                iA = g2.a(i26, 4, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 58:
                            if (a(obj, i26, i22)) {
                                iA = g2.a(i26, 1, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 59:
                            if (a(obj, i26, i22)) {
                                Object object4 = unsafe2.getObject(obj, j11);
                                if (object4 instanceof s) {
                                    iB3 = b0.b(i26);
                                    iA3 = b0.a((s) object4);
                                } else {
                                    iB3 = b0.b(i26);
                                    iA3 = b0.a((String) object4);
                                }
                                iB4 = iA3 + iB3;
                                iA = iB4 + iB14;
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 60:
                            if (a(obj, i26, i22)) {
                                Object object5 = unsafe2.getObject(obj, j11);
                                t2 t2VarC11 = c(i22);
                                Class cls40 = u2.f18301a;
                                int iB17 = b0.b(i26);
                                int serializedSize6 = ((b) ((d2) object5)).getSerializedSize(t2VarC11);
                                iA = l0.a(serializedSize6, serializedSize6, iB17, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 61:
                            if (a(obj, i26, i22)) {
                                s sVar4 = (s) unsafe2.getObject(obj, j11);
                                iB3 = b0.b(i26);
                                iA3 = b0.a(sVar4);
                                iB4 = iA3 + iB3;
                                iA = iB4 + iB14;
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 62:
                            if (a(obj, i26, i22)) {
                                int iIntValue6 = ((Integer) x3.e(obj, j11)).intValue();
                                iB3 = b0.b(i26);
                                iA3 = b0.c(iIntValue6);
                                iB4 = iA3 + iB3;
                                iA = iB4 + iB14;
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 63:
                            if (a(obj, i26, i22)) {
                                int iIntValue7 = ((Integer) x3.e(obj, j11)).intValue();
                                iB3 = b0.b(i26);
                                iA3 = b0.a(iIntValue7);
                                iB4 = iA3 + iB3;
                                iA = iB4 + iB14;
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 64:
                            if (a(obj, i26, i22)) {
                                iA = g2.a(i26, 4, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 65:
                            if (a(obj, i26, i22)) {
                                iA = g2.a(i26, 8, iB14);
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 66:
                            if (a(obj, i26, i22)) {
                                int iIntValue8 = ((Integer) x3.e(obj, j11)).intValue();
                                iB = b0.b(i26);
                                iA2 = b0.c(b0.d(iIntValue8));
                                iB4 = iA2 + iB;
                                iA = iB4 + iB14;
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 67:
                            if (a(obj, i26, i22)) {
                                long jLongValue6 = ((Long) x3.e(obj, j11)).longValue();
                                iB = b0.b(i26);
                                iA2 = b0.a(b0.b(jLongValue6));
                                iB4 = iA2 + iB;
                                iA = iB4 + iB14;
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        case 68:
                            if (a(obj, i26, i22)) {
                                d2 d2Var4 = (d2) unsafe2.getObject(obj, j11);
                                t2 t2VarC12 = c(i22);
                                iB = b0.b(i26) * 2;
                                iA2 = ((b) d2Var4).getSerializedSize(t2VarC12);
                                iB4 = iA2 + iB;
                                iA = iB4 + iB14;
                                iB14 = iA;
                            }
                            i22 += 3;
                            i12 = 267386880;
                            break;
                        default:
                            i22 += 3;
                            i12 = 267386880;
                            break;
                    }
                } else {
                    this.f18215n.getClass();
                    int iA10 = ((z0) obj).unknownFields.a() + iB14;
                    if (!this.f18207f) {
                        return iA10;
                    }
                    this.f18216o.getClass();
                    return ((GeneratedMessageLite$ExtendableMessage) obj).extensions.b() + iA10;
                }
            }
        }
    }

    public static Field a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public final void d(int i10, Object obj, Object obj2) {
        long j10 = this.f18202a[i10 + 1] & 1048575;
        if (a(i10, obj2)) {
            Object objE = x3.e(obj, j10);
            Object objE2 = x3.e(obj2, j10);
            if (objE != null && objE2 != null) {
                x3.a(j10, obj, l1.a(objE, objE2));
                b(i10, obj);
            } else if (objE2 != null) {
                x3.a(j10, obj, objE2);
                b(i10, obj);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final Object a() {
        k2 k2Var = this.f18213l;
        d2 d2Var = this.f18206e;
        k2Var.getClass();
        return ((z0) d2Var).dynamicMethod(y0.NEW_MUTABLE_INSTANCE);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(Object obj, Object obj2) {
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f18202a;
            if (i10 < iArr.length) {
                int i11 = iArr[i10 + 1];
                long j10 = 1048575 & i11;
                int i12 = iArr[i10];
                switch ((i11 & 267386880) >>> 20) {
                    case 0:
                        if (a(i10, obj2)) {
                            w3 w3Var = x3.f18340c;
                            w3Var.a(obj, j10, w3Var.c(obj2, j10));
                            b(i10, obj);
                        }
                        break;
                    case 1:
                        if (a(i10, obj2)) {
                            w3 w3Var2 = x3.f18340c;
                            w3Var2.a(obj, j10, w3Var2.d(obj2, j10));
                            b(i10, obj);
                        }
                        break;
                    case 2:
                        if (a(i10, obj2)) {
                            x3.a(obj, j10, x3.d(obj2, j10));
                            b(i10, obj);
                        }
                        break;
                    case 3:
                        if (a(i10, obj2)) {
                            x3.a(obj, j10, x3.d(obj2, j10));
                            b(i10, obj);
                        }
                        break;
                    case 4:
                        if (a(i10, obj2)) {
                            x3.a(obj, j10, x3.c(obj2, j10));
                            b(i10, obj);
                        }
                        break;
                    case 5:
                        if (a(i10, obj2)) {
                            x3.a(obj, j10, x3.d(obj2, j10));
                            b(i10, obj);
                        }
                        break;
                    case 6:
                        if (a(i10, obj2)) {
                            x3.a(obj, j10, x3.c(obj2, j10));
                            b(i10, obj);
                        }
                        break;
                    case 7:
                        if (a(i10, obj2)) {
                            w3 w3Var3 = x3.f18340c;
                            w3Var3.a(obj, j10, w3Var3.a(obj2, j10));
                            b(i10, obj);
                        }
                        break;
                    case 8:
                        if (a(i10, obj2)) {
                            x3.a(j10, obj, x3.e(obj2, j10));
                            b(i10, obj);
                        }
                        break;
                    case 9:
                        d(i10, obj, obj2);
                        break;
                    case 10:
                        if (a(i10, obj2)) {
                            x3.a(j10, obj, x3.e(obj2, j10));
                            b(i10, obj);
                        }
                        break;
                    case 11:
                        if (a(i10, obj2)) {
                            x3.a(obj, j10, x3.c(obj2, j10));
                            b(i10, obj);
                        }
                        break;
                    case 12:
                        if (a(i10, obj2)) {
                            x3.a(obj, j10, x3.c(obj2, j10));
                            b(i10, obj);
                        }
                        break;
                    case 13:
                        if (a(i10, obj2)) {
                            x3.a(obj, j10, x3.c(obj2, j10));
                            b(i10, obj);
                        }
                        break;
                    case 14:
                        if (a(i10, obj2)) {
                            x3.a(obj, j10, x3.d(obj2, j10));
                            b(i10, obj);
                        }
                        break;
                    case 15:
                        if (a(i10, obj2)) {
                            x3.a(obj, j10, x3.c(obj2, j10));
                            b(i10, obj);
                        }
                        break;
                    case 16:
                        if (a(i10, obj2)) {
                            x3.a(obj, j10, x3.d(obj2, j10));
                            b(i10, obj);
                        }
                        break;
                    case 17:
                        d(i10, obj, obj2);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.f18214m.a(j10, obj, obj2);
                        break;
                    case 50:
                        z1 z1Var = this.f18217p;
                        Class cls = u2.f18301a;
                        Object objE = x3.e(obj, j10);
                        Object objE2 = x3.e(obj2, j10);
                        z1Var.getClass();
                        x3.a(j10, obj, z1.a(objE, objE2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (a(obj2, i12, i10)) {
                            x3.a(j10, obj, x3.e(obj2, j10));
                            b(obj, i12, i10);
                        }
                        break;
                    case 60:
                        e(i10, obj, obj2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (a(obj2, i12, i10)) {
                            x3.a(j10, obj, x3.e(obj2, j10));
                            b(obj, i12, i10);
                        }
                        break;
                    case 68:
                        e(i10, obj, obj2);
                        break;
                }
                i10 += 3;
            } else {
                o3 o3Var = this.f18215n;
                Class cls2 = u2.f18301a;
                o3Var.getClass();
                z0 z0Var = (z0) obj;
                n3 n3VarA = z0Var.unknownFields;
                n3 n3Var = ((z0) obj2).unknownFields;
                if (!n3Var.equals(n3.f18245f)) {
                    n3VarA = n3.a(n3VarA, n3Var);
                }
                z0Var.unknownFields = n3VarA;
                if (this.f18207f) {
                    this.f18216o.getClass();
                    n0 n0Var = ((GeneratedMessageLite$ExtendableMessage) obj2).extensions;
                    if (n0Var.f18241a.isEmpty()) {
                        return;
                    }
                    ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable().a(n0Var);
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x030b  */
    /* JADX WARN: Code duplicated, block: B:101:0x031c  */
    /* JADX WARN: Code duplicated, block: B:102:0x032d  */
    /* JADX WARN: Code duplicated, block: B:103:0x033e  */
    /* JADX WARN: Code duplicated, block: B:104:0x034f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0360  */
    /* JADX WARN: Code duplicated, block: B:106:0x0371  */
    /* JADX WARN: Code duplicated, block: B:107:0x0382  */
    /* JADX WARN: Code duplicated, block: B:108:0x0393  */
    /* JADX WARN: Code duplicated, block: B:109:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:110:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:111:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:112:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:113:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:114:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:115:0x040e  */
    /* JADX WARN: Code duplicated, block: B:116:0x041f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0430  */
    /* JADX WARN: Code duplicated, block: B:118:0x0441  */
    /* JADX WARN: Code duplicated, block: B:119:0x0452  */
    /* JADX WARN: Code duplicated, block: B:120:0x0463  */
    /* JADX WARN: Code duplicated, block: B:121:0x0474  */
    /* JADX WARN: Code duplicated, block: B:122:0x0485  */
    /* JADX WARN: Code duplicated, block: B:123:0x0496  */
    /* JADX WARN: Code duplicated, block: B:124:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:126:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:127:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:129:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:130:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:132:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:133:0x04de  */
    /* JADX WARN: Code duplicated, block: B:135:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:136:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:138:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:139:0x0504  */
    /* JADX WARN: Code duplicated, block: B:141:0x050a  */
    /* JADX WARN: Code duplicated, block: B:142:0x0517  */
    /* JADX WARN: Code duplicated, block: B:144:0x051d  */
    /* JADX WARN: Code duplicated, block: B:145:0x052a  */
    /* JADX WARN: Code duplicated, block: B:147:0x0530  */
    /* JADX WARN: Code duplicated, block: B:148:0x053f  */
    /* JADX WARN: Code duplicated, block: B:150:0x0545  */
    /* JADX WARN: Code duplicated, block: B:151:0x0558  */
    /* JADX WARN: Code duplicated, block: B:153:0x055e  */
    /* JADX WARN: Code duplicated, block: B:154:0x0569  */
    /* JADX WARN: Code duplicated, block: B:156:0x056f  */
    /* JADX WARN: Code duplicated, block: B:157:0x057e  */
    /* JADX WARN: Code duplicated, block: B:159:0x0584  */
    /* JADX WARN: Code duplicated, block: B:160:0x0590  */
    /* JADX WARN: Code duplicated, block: B:162:0x0596  */
    /* JADX WARN: Code duplicated, block: B:163:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:165:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:166:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:168:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:169:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:171:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:172:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:174:0x05de  */
    /* JADX WARN: Code duplicated, block: B:175:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:177:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:192:0x0643  */
    /* JADX WARN: Code duplicated, block: B:19:0x0076  */
    /* JADX WARN: Code duplicated, block: B:212:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:214:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:215:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:217:0x06be  */
    /* JADX WARN: Code duplicated, block: B:218:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:220:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:221:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:223:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:224:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:226:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:227:0x0710  */
    /* JADX WARN: Code duplicated, block: B:229:0x0716  */
    /* JADX WARN: Code duplicated, block: B:230:0x0727  */
    /* JADX WARN: Code duplicated, block: B:232:0x072d  */
    /* JADX WARN: Code duplicated, block: B:233:0x073e  */
    /* JADX WARN: Code duplicated, block: B:235:0x0744  */
    /* JADX WARN: Code duplicated, block: B:236:0x0751  */
    /* JADX WARN: Code duplicated, block: B:238:0x0757  */
    /* JADX WARN: Code duplicated, block: B:239:0x0768  */
    /* JADX WARN: Code duplicated, block: B:241:0x076e  */
    /* JADX WARN: Code duplicated, block: B:242:0x0777  */
    /* JADX WARN: Code duplicated, block: B:244:0x077d  */
    /* JADX WARN: Code duplicated, block: B:245:0x078e  */
    /* JADX WARN: Code duplicated, block: B:247:0x0794  */
    /* JADX WARN: Code duplicated, block: B:248:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:250:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:251:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:253:0x07c2  */
    /* JADX WARN: Code duplicated, block: B:254:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:256:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:257:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:259:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:260:0x0801  */
    /* JADX WARN: Code duplicated, block: B:262:0x0807  */
    /* JADX WARN: Code duplicated, block: B:263:0x0816  */
    /* JADX WARN: Code duplicated, block: B:265:0x081c  */
    /* JADX WARN: Code duplicated, block: B:266:0x082b  */
    /* JADX WARN: Code duplicated, block: B:271:0x0845  */
    /* JADX WARN: Code duplicated, block: B:272:0x0858  */
    /* JADX WARN: Code duplicated, block: B:273:0x0867  */
    /* JADX WARN: Code duplicated, block: B:274:0x0876  */
    /* JADX WARN: Code duplicated, block: B:275:0x0885  */
    /* JADX WARN: Code duplicated, block: B:276:0x0894  */
    /* JADX WARN: Code duplicated, block: B:277:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:278:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:279:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:280:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:281:0x08df  */
    /* JADX WARN: Code duplicated, block: B:282:0x08ee  */
    /* JADX WARN: Code duplicated, block: B:283:0x08fd  */
    /* JADX WARN: Code duplicated, block: B:284:0x090c  */
    /* JADX WARN: Code duplicated, block: B:285:0x091b  */
    /* JADX WARN: Code duplicated, block: B:286:0x092a  */
    /* JADX WARN: Code duplicated, block: B:287:0x0939  */
    /* JADX WARN: Code duplicated, block: B:288:0x0948  */
    /* JADX WARN: Code duplicated, block: B:289:0x0957  */
    /* JADX WARN: Code duplicated, block: B:290:0x0966  */
    /* JADX WARN: Code duplicated, block: B:291:0x0975  */
    /* JADX WARN: Code duplicated, block: B:293:0x0986  */
    /* JADX WARN: Code duplicated, block: B:294:0x0994  */
    /* JADX WARN: Code duplicated, block: B:295:0x09a6  */
    /* JADX WARN: Code duplicated, block: B:296:0x09b3  */
    /* JADX WARN: Code duplicated, block: B:297:0x09b6  */
    /* JADX WARN: Code duplicated, block: B:298:0x09c6  */
    /* JADX WARN: Code duplicated, block: B:299:0x09d6  */
    /* JADX WARN: Code duplicated, block: B:300:0x09e6  */
    /* JADX WARN: Code duplicated, block: B:301:0x09f6  */
    /* JADX WARN: Code duplicated, block: B:302:0x0a06  */
    /* JADX WARN: Code duplicated, block: B:303:0x0a16  */
    /* JADX WARN: Code duplicated, block: B:304:0x0a26  */
    /* JADX WARN: Code duplicated, block: B:305:0x0a36  */
    /* JADX WARN: Code duplicated, block: B:307:0x0a3b  */
    /* JADX WARN: Code duplicated, block: B:308:0x0a48  */
    /* JADX WARN: Code duplicated, block: B:310:0x0a4d  */
    /* JADX WARN: Code duplicated, block: B:311:0x0a56  */
    /* JADX WARN: Code duplicated, block: B:313:0x0a5b  */
    /* JADX WARN: Code duplicated, block: B:314:0x0a64  */
    /* JADX WARN: Code duplicated, block: B:316:0x0a69  */
    /* JADX WARN: Code duplicated, block: B:317:0x0a74  */
    /* JADX WARN: Code duplicated, block: B:319:0x0a79  */
    /* JADX WARN: Code duplicated, block: B:320:0x0a84  */
    /* JADX WARN: Code duplicated, block: B:322:0x0a89  */
    /* JADX WARN: Code duplicated, block: B:323:0x0a94  */
    /* JADX WARN: Code duplicated, block: B:325:0x0a99  */
    /* JADX WARN: Code duplicated, block: B:326:0x0aa4  */
    /* JADX WARN: Code duplicated, block: B:328:0x0aa9  */
    /* JADX WARN: Code duplicated, block: B:329:0x0ab6  */
    /* JADX WARN: Code duplicated, block: B:331:0x0abb  */
    /* JADX WARN: Code duplicated, block: B:332:0x0acc  */
    /* JADX WARN: Code duplicated, block: B:334:0x0ad1  */
    /* JADX WARN: Code duplicated, block: B:335:0x0ada  */
    /* JADX WARN: Code duplicated, block: B:337:0x0adf  */
    /* JADX WARN: Code duplicated, block: B:338:0x0aeb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:340:0x0af0  */
    /* JADX WARN: Code duplicated, block: B:341:0x0afa  */
    /* JADX WARN: Code duplicated, block: B:343:0x0aff  */
    /* JADX WARN: Code duplicated, block: B:344:0x0b09  */
    /* JADX WARN: Code duplicated, block: B:346:0x0b0e  */
    /* JADX WARN: Code duplicated, block: B:347:0x0b18  */
    /* JADX WARN: Code duplicated, block: B:349:0x0b1d  */
    /* JADX WARN: Code duplicated, block: B:350:0x0b27  */
    /* JADX WARN: Code duplicated, block: B:352:0x0b2c  */
    /* JADX WARN: Code duplicated, block: B:353:0x0b36  */
    /* JADX WARN: Code duplicated, block: B:355:0x0b3b  */
    /* JADX WARN: Code duplicated, block: B:356:0x0b45  */
    /* JADX WARN: Code duplicated, block: B:358:0x0b4a  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:368:0x026d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:370:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:372:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:374:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:380:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:390:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:394:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:400:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:438:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:440:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:442:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:446:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0101  */
    /* JADX WARN: Code duplicated, block: B:450:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:458:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0114  */
    /* JADX WARN: Code duplicated, block: B:460:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:462:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:464:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:468:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:470:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:472:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:473:0x05fb A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:474:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x011a  */
    /* JADX WARN: Code duplicated, block: B:488:0x0833 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x012d  */
    /* JADX WARN: Code duplicated, block: B:501:0x0b53 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:0x0b53 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:505:0x0b53 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x0b53 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x0b53 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0133  */
    /* JADX WARN: Code duplicated, block: B:511:0x0b53 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:0x0b53 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x0b53 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:0x0b53 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:0x0b53 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0146  */
    /* JADX WARN: Code duplicated, block: B:521:0x0b53 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:523:0x0b53 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:525:0x0b53 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:527:0x0b53 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:529:0x0b53 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:531:0x0b53 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:0x0b53 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:535:0x0b53 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x014c  */
    /* JADX WARN: Code duplicated, block: B:54:0x015f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0165  */
    /* JADX WARN: Code duplicated, block: B:57:0x0174  */
    /* JADX WARN: Code duplicated, block: B:59:0x017a  */
    /* JADX WARN: Code duplicated, block: B:60:0x018d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0193  */
    /* JADX WARN: Code duplicated, block: B:63:0x019e  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:75:0x0202  */
    /* JADX WARN: Code duplicated, block: B:77:0x0208  */
    /* JADX WARN: Code duplicated, block: B:78:0x021b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0221  */
    /* JADX WARN: Code duplicated, block: B:81:0x0234  */
    /* JADX WARN: Code duplicated, block: B:83:0x023a  */
    /* JADX WARN: Code duplicated, block: B:84:0x024b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0251  */
    /* JADX WARN: Code duplicated, block: B:87:0x0262  */
    /* JADX WARN: Code duplicated, block: B:92:0x027f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0294  */
    /* JADX WARN: Code duplicated, block: B:94:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:95:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:96:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:97:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:98:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:99:0x02fa  */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(Object obj, c0 c0Var) {
        Iterator itD;
        Map.Entry entry;
        int i10;
        int i11;
        long j10;
        boolean z10;
        boolean z11;
        Map.Entry entry2;
        Iterator w2Var;
        c0Var.getClass();
        int i12 = 267386880;
        int i13 = 1048575;
        if (q4.ASCENDING == q4.DESCENDING) {
            this.f18215n.getClass();
            ((z0) obj).unknownFields.a(c0Var);
            if (this.f18207f) {
                this.f18216o.getClass();
                n0 n0Var = ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
                if (n0Var.f18241a.isEmpty()) {
                    entry2 = null;
                    w2Var = null;
                } else {
                    if (n0Var.f18243c) {
                        e3 e3Var = n0Var.f18241a;
                        if (e3Var.f18178g == null) {
                            e3Var.f18178g = new x2(e3Var);
                        }
                        w2Var = new o1(new w2(e3Var.f18178g.f18337b));
                    } else {
                        e3 e3Var2 = n0Var.f18241a;
                        if (e3Var2.f18178g == null) {
                            e3Var2.f18178g = new x2(e3Var2);
                        }
                        w2Var = new w2(e3Var2.f18178g.f18337b);
                    }
                    entry2 = (Map.Entry) w2Var.next();
                }
            } else {
                entry2 = null;
                w2Var = null;
            }
            for (int length = this.f18202a.length - 3; length >= 0; length -= 3) {
                int[] iArr = this.f18202a;
                int i14 = iArr[length + 1];
                int i15 = iArr[length];
                while (entry2 != null) {
                    this.f18216o.getClass();
                    if (((w0) entry2.getKey()).f18318b > i15) {
                        this.f18216o.getClass();
                        j0.a(c0Var, entry2);
                        entry2 = w2Var.hasNext() ? (Map.Entry) w2Var.next() : null;
                    } else {
                        switch ((i14 & 267386880) >>> 20) {
                            case 0:
                                if (a(length, obj)) {
                                    c0Var.a(i15, x3.f18340c.c(obj, i14 & 1048575));
                                }
                                break;
                            case 1:
                                if (a(length, obj)) {
                                    c0Var.a(i15, x3.f18340c.d(obj, i14 & 1048575));
                                }
                                break;
                            case 2:
                                if (a(length, obj)) {
                                    c0Var.f18158a.b(i15, x3.d(obj, i14 & 1048575));
                                }
                                break;
                            case 3:
                                if (a(length, obj)) {
                                    c0Var.f18158a.b(i15, x3.d(obj, i14 & 1048575));
                                }
                                break;
                            case 4:
                                if (a(length, obj)) {
                                    c0Var.f18158a.b(i15, x3.c(obj, i14 & 1048575));
                                }
                                break;
                            case 5:
                                if (a(length, obj)) {
                                    c0Var.f18158a.a(i15, x3.d(obj, i14 & 1048575));
                                }
                                break;
                            case 6:
                                if (a(length, obj)) {
                                    c0Var.f18158a.a(i15, x3.c(obj, i14 & 1048575));
                                }
                                break;
                            case 7:
                                if (a(length, obj)) {
                                    c0Var.f18158a.a(i15, x3.f18340c.a(obj, i14 & 1048575));
                                }
                                break;
                            case 8:
                                if (a(length, obj)) {
                                    a(i15, x3.e(obj, i14 & 1048575), c0Var);
                                }
                                break;
                            case 9:
                                if (a(length, obj)) {
                                    c0Var.f18158a.a(i15, (d2) x3.e(obj, i14 & 1048575), c(length));
                                }
                                break;
                            case 10:
                                if (a(length, obj)) {
                                    c0Var.f18158a.a(i15, (s) x3.e(obj, i14 & 1048575));
                                }
                                break;
                            case 11:
                                if (a(length, obj)) {
                                    c0Var.f18158a.d(i15, x3.c(obj, i14 & 1048575));
                                }
                                break;
                            case 12:
                                if (a(length, obj)) {
                                    c0Var.f18158a.b(i15, x3.c(obj, i14 & 1048575));
                                }
                                break;
                            case 13:
                                if (a(length, obj)) {
                                    c0Var.f18158a.a(i15, x3.c(obj, i14 & 1048575));
                                }
                                break;
                            case 14:
                                if (a(length, obj)) {
                                    c0Var.f18158a.a(i15, x3.d(obj, i14 & 1048575));
                                }
                                break;
                            case 15:
                                if (a(length, obj)) {
                                    c0Var.a(i15, x3.c(obj, i14 & 1048575));
                                }
                                break;
                            case 16:
                                if (a(length, obj)) {
                                    c0Var.a(i15, x3.d(obj, i14 & 1048575));
                                }
                                break;
                            case 17:
                                if (a(length, obj)) {
                                    c0Var.a(i15, x3.e(obj, i14 & 1048575), c(length));
                                }
                                break;
                            case 18:
                                u2.b(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, false);
                                break;
                            case 19:
                                u2.f(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, false);
                                break;
                            case 20:
                                u2.h(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, false);
                                break;
                            case 21:
                                u2.n(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, false);
                                break;
                            case 22:
                                u2.g(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, false);
                                break;
                            case 23:
                                u2.e(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, false);
                                break;
                            case 24:
                                u2.d(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, false);
                                break;
                            case 25:
                                u2.a(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, false);
                                break;
                            case 26:
                                u2.b(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var);
                                break;
                            case 27:
                                u2.b(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, c(length));
                                break;
                            case 28:
                                u2.a(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var);
                                break;
                            case 29:
                                u2.m(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, false);
                                break;
                            case 30:
                                u2.c(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, false);
                                break;
                            case 31:
                                u2.i(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, false);
                                break;
                            case 32:
                                u2.j(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, false);
                                break;
                            case 33:
                                u2.k(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, false);
                                break;
                            case 34:
                                u2.l(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, false);
                                break;
                            case 35:
                                u2.b(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, true);
                                break;
                            case 36:
                                u2.f(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, true);
                                break;
                            case 37:
                                u2.h(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, true);
                                break;
                            case 38:
                                u2.n(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, true);
                                break;
                            case 39:
                                u2.g(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, true);
                                break;
                            case 40:
                                u2.e(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, true);
                                break;
                            case 41:
                                u2.d(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, true);
                                break;
                            case 42:
                                u2.a(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, true);
                                break;
                            case 43:
                                u2.m(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, true);
                                break;
                            case 44:
                                u2.c(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, true);
                                break;
                            case 45:
                                u2.i(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, true);
                                break;
                            case 46:
                                u2.j(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, true);
                                break;
                            case 47:
                                u2.k(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, true);
                                break;
                            case 48:
                                u2.l(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, true);
                                break;
                            case 49:
                                u2.a(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, c(length));
                                break;
                            case 50:
                                if (x3.e(obj, i14 & 1048575) == null) {
                                    z1 z1Var = this.f18217p;
                                    Object objB = b(length);
                                    z1Var.getClass();
                                    objB.getClass();
                                    throw new ClassCastException();
                                }
                                break;
                                break;
                            case 51:
                                if (a(obj, i15, length)) {
                                    c0Var.a(i15, ((Double) x3.e(obj, i14 & 1048575)).doubleValue());
                                }
                                break;
                            case 52:
                                if (a(obj, i15, length)) {
                                    c0Var.a(i15, ((Float) x3.e(obj, i14 & 1048575)).floatValue());
                                }
                                break;
                            case 53:
                                if (a(obj, i15, length)) {
                                    c0Var.f18158a.b(i15, ((Long) x3.e(obj, i14 & 1048575)).longValue());
                                }
                                break;
                            case 54:
                                if (a(obj, i15, length)) {
                                    c0Var.f18158a.b(i15, ((Long) x3.e(obj, i14 & 1048575)).longValue());
                                }
                                break;
                            case 55:
                                if (a(obj, i15, length)) {
                                    c0Var.f18158a.b(i15, ((Integer) x3.e(obj, i14 & 1048575)).intValue());
                                }
                                break;
                            case 56:
                                if (a(obj, i15, length)) {
                                    c0Var.f18158a.a(i15, ((Long) x3.e(obj, i14 & 1048575)).longValue());
                                }
                                break;
                            case 57:
                                if (a(obj, i15, length)) {
                                    c0Var.f18158a.a(i15, ((Integer) x3.e(obj, i14 & 1048575)).intValue());
                                }
                                break;
                            case 58:
                                if (a(obj, i15, length)) {
                                    c0Var.f18158a.a(i15, ((Boolean) x3.e(obj, i14 & 1048575)).booleanValue());
                                }
                                break;
                            case 59:
                                if (a(obj, i15, length)) {
                                    a(i15, x3.e(obj, i14 & 1048575), c0Var);
                                }
                                break;
                            case 60:
                                if (a(obj, i15, length)) {
                                    c0Var.f18158a.a(i15, (d2) x3.e(obj, i14 & 1048575), c(length));
                                }
                                break;
                            case 61:
                                if (a(obj, i15, length)) {
                                    c0Var.f18158a.a(i15, (s) x3.e(obj, i14 & 1048575));
                                }
                                break;
                            case 62:
                                if (a(obj, i15, length)) {
                                    c0Var.f18158a.d(i15, ((Integer) x3.e(obj, i14 & 1048575)).intValue());
                                }
                                break;
                            case 63:
                                if (a(obj, i15, length)) {
                                    c0Var.f18158a.b(i15, ((Integer) x3.e(obj, i14 & 1048575)).intValue());
                                }
                                break;
                            case 64:
                                if (a(obj, i15, length)) {
                                    c0Var.f18158a.a(i15, ((Integer) x3.e(obj, i14 & 1048575)).intValue());
                                }
                                break;
                            case 65:
                                if (a(obj, i15, length)) {
                                    c0Var.f18158a.a(i15, ((Long) x3.e(obj, i14 & 1048575)).longValue());
                                }
                                break;
                            case 66:
                                if (a(obj, i15, length)) {
                                    c0Var.a(i15, ((Integer) x3.e(obj, i14 & 1048575)).intValue());
                                }
                                break;
                            case 67:
                                if (a(obj, i15, length)) {
                                    c0Var.a(i15, ((Long) x3.e(obj, i14 & 1048575)).longValue());
                                }
                                break;
                            case 68:
                                if (a(obj, i15, length)) {
                                    c0Var.a(i15, x3.e(obj, i14 & 1048575), c(length));
                                }
                                break;
                        }
                    }
                }
                switch ((i14 & 267386880) >>> 20) {
                    case 0:
                        if (a(length, obj)) {
                            c0Var.a(i15, x3.f18340c.c(obj, i14 & 1048575));
                        }
                        break;
                    case 1:
                        if (a(length, obj)) {
                            c0Var.a(i15, x3.f18340c.d(obj, i14 & 1048575));
                        }
                        break;
                    case 2:
                        if (a(length, obj)) {
                            c0Var.f18158a.b(i15, x3.d(obj, i14 & 1048575));
                        }
                        break;
                    case 3:
                        if (a(length, obj)) {
                            c0Var.f18158a.b(i15, x3.d(obj, i14 & 1048575));
                        }
                        break;
                    case 4:
                        if (a(length, obj)) {
                            c0Var.f18158a.b(i15, x3.c(obj, i14 & 1048575));
                        }
                        break;
                    case 5:
                        if (a(length, obj)) {
                            c0Var.f18158a.a(i15, x3.d(obj, i14 & 1048575));
                        }
                        break;
                    case 6:
                        if (a(length, obj)) {
                            c0Var.f18158a.a(i15, x3.c(obj, i14 & 1048575));
                        }
                        break;
                    case 7:
                        if (a(length, obj)) {
                            c0Var.f18158a.a(i15, x3.f18340c.a(obj, i14 & 1048575));
                        }
                        break;
                    case 8:
                        if (a(length, obj)) {
                            a(i15, x3.e(obj, i14 & 1048575), c0Var);
                        }
                        break;
                    case 9:
                        if (a(length, obj)) {
                            c0Var.f18158a.a(i15, (d2) x3.e(obj, i14 & 1048575), c(length));
                        }
                        break;
                    case 10:
                        if (a(length, obj)) {
                            c0Var.f18158a.a(i15, (s) x3.e(obj, i14 & 1048575));
                        }
                        break;
                    case 11:
                        if (a(length, obj)) {
                            c0Var.f18158a.d(i15, x3.c(obj, i14 & 1048575));
                        }
                        break;
                    case 12:
                        if (a(length, obj)) {
                            c0Var.f18158a.b(i15, x3.c(obj, i14 & 1048575));
                        }
                        break;
                    case 13:
                        if (a(length, obj)) {
                            c0Var.f18158a.a(i15, x3.c(obj, i14 & 1048575));
                        }
                        break;
                    case 14:
                        if (a(length, obj)) {
                            c0Var.f18158a.a(i15, x3.d(obj, i14 & 1048575));
                        }
                        break;
                    case 15:
                        if (a(length, obj)) {
                            c0Var.a(i15, x3.c(obj, i14 & 1048575));
                        }
                        break;
                    case 16:
                        if (a(length, obj)) {
                            c0Var.a(i15, x3.d(obj, i14 & 1048575));
                        }
                        break;
                    case 17:
                        if (a(length, obj)) {
                            c0Var.a(i15, x3.e(obj, i14 & 1048575), c(length));
                        }
                        break;
                    case 18:
                        u2.b(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, false);
                        break;
                    case 19:
                        u2.f(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, false);
                        break;
                    case 20:
                        u2.h(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, false);
                        break;
                    case 21:
                        u2.n(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, false);
                        break;
                    case 22:
                        u2.g(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, false);
                        break;
                    case 23:
                        u2.e(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, false);
                        break;
                    case 24:
                        u2.d(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, false);
                        break;
                    case 25:
                        u2.a(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, false);
                        break;
                    case 26:
                        u2.b(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var);
                        break;
                    case 27:
                        u2.b(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, c(length));
                        break;
                    case 28:
                        u2.a(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var);
                        break;
                    case 29:
                        u2.m(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, false);
                        break;
                    case 30:
                        u2.c(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, false);
                        break;
                    case 31:
                        u2.i(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, false);
                        break;
                    case 32:
                        u2.j(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, false);
                        break;
                    case 33:
                        u2.k(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, false);
                        break;
                    case 34:
                        u2.l(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, false);
                        break;
                    case 35:
                        u2.b(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, true);
                        break;
                    case 36:
                        u2.f(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, true);
                        break;
                    case 37:
                        u2.h(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, true);
                        break;
                    case 38:
                        u2.n(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, true);
                        break;
                    case 39:
                        u2.g(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, true);
                        break;
                    case 40:
                        u2.e(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, true);
                        break;
                    case 41:
                        u2.d(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, true);
                        break;
                    case 42:
                        u2.a(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, true);
                        break;
                    case 43:
                        u2.m(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, true);
                        break;
                    case 44:
                        u2.c(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, true);
                        break;
                    case 45:
                        u2.i(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, true);
                        break;
                    case 46:
                        u2.j(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, true);
                        break;
                    case 47:
                        u2.k(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, true);
                        break;
                    case 48:
                        u2.l(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, true);
                        break;
                    case 49:
                        u2.a(this.f18202a[length], (List) x3.e(obj, i14 & 1048575), c0Var, c(length));
                        break;
                    case 50:
                        if (x3.e(obj, i14 & 1048575) == null) {
                            z1 z1Var2 = this.f18217p;
                            Object objB2 = b(length);
                            z1Var2.getClass();
                            objB2.getClass();
                            throw new ClassCastException();
                        }
                        break;
                        break;
                    case 51:
                        if (a(obj, i15, length)) {
                            c0Var.a(i15, ((Double) x3.e(obj, i14 & 1048575)).doubleValue());
                        }
                        break;
                    case 52:
                        if (a(obj, i15, length)) {
                            c0Var.a(i15, ((Float) x3.e(obj, i14 & 1048575)).floatValue());
                        }
                        break;
                    case 53:
                        if (a(obj, i15, length)) {
                            c0Var.f18158a.b(i15, ((Long) x3.e(obj, i14 & 1048575)).longValue());
                        }
                        break;
                    case 54:
                        if (a(obj, i15, length)) {
                            c0Var.f18158a.b(i15, ((Long) x3.e(obj, i14 & 1048575)).longValue());
                        }
                        break;
                    case 55:
                        if (a(obj, i15, length)) {
                            c0Var.f18158a.b(i15, ((Integer) x3.e(obj, i14 & 1048575)).intValue());
                        }
                        break;
                    case 56:
                        if (a(obj, i15, length)) {
                            c0Var.f18158a.a(i15, ((Long) x3.e(obj, i14 & 1048575)).longValue());
                        }
                        break;
                    case 57:
                        if (a(obj, i15, length)) {
                            c0Var.f18158a.a(i15, ((Integer) x3.e(obj, i14 & 1048575)).intValue());
                        }
                        break;
                    case 58:
                        if (a(obj, i15, length)) {
                            c0Var.f18158a.a(i15, ((Boolean) x3.e(obj, i14 & 1048575)).booleanValue());
                        }
                        break;
                    case 59:
                        if (a(obj, i15, length)) {
                            a(i15, x3.e(obj, i14 & 1048575), c0Var);
                        }
                        break;
                    case 60:
                        if (a(obj, i15, length)) {
                            c0Var.f18158a.a(i15, (d2) x3.e(obj, i14 & 1048575), c(length));
                        }
                        break;
                    case 61:
                        if (a(obj, i15, length)) {
                            c0Var.f18158a.a(i15, (s) x3.e(obj, i14 & 1048575));
                        }
                        break;
                    case 62:
                        if (a(obj, i15, length)) {
                            c0Var.f18158a.d(i15, ((Integer) x3.e(obj, i14 & 1048575)).intValue());
                        }
                        break;
                    case 63:
                        if (a(obj, i15, length)) {
                            c0Var.f18158a.b(i15, ((Integer) x3.e(obj, i14 & 1048575)).intValue());
                        }
                        break;
                    case 64:
                        if (a(obj, i15, length)) {
                            c0Var.f18158a.a(i15, ((Integer) x3.e(obj, i14 & 1048575)).intValue());
                        }
                        break;
                    case 65:
                        if (a(obj, i15, length)) {
                            c0Var.f18158a.a(i15, ((Long) x3.e(obj, i14 & 1048575)).longValue());
                        }
                        break;
                    case 66:
                        if (a(obj, i15, length)) {
                            c0Var.a(i15, ((Integer) x3.e(obj, i14 & 1048575)).intValue());
                        }
                        break;
                    case 67:
                        if (a(obj, i15, length)) {
                            c0Var.a(i15, ((Long) x3.e(obj, i14 & 1048575)).longValue());
                        }
                        break;
                    case 68:
                        if (a(obj, i15, length)) {
                            c0Var.a(i15, x3.e(obj, i14 & 1048575), c(length));
                        }
                        break;
                }
            }
            while (entry2 != null) {
                this.f18216o.getClass();
                j0.a(c0Var, entry2);
                entry2 = w2Var.hasNext() ? (Map.Entry) w2Var.next() : null;
            }
            return;
        }
        if (this.f18209h) {
            b(obj, c0Var);
            return;
        }
        if (this.f18207f) {
            this.f18216o.getClass();
            n0 n0Var2 = ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
            if (n0Var2.f18241a.isEmpty()) {
                itD = null;
                entry = null;
            } else {
                itD = n0Var2.d();
                entry = (Map.Entry) itD.next();
            }
        } else {
            itD = null;
            entry = null;
        }
        int length2 = this.f18202a.length;
        Unsafe unsafe = f18201r;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1048575;
        while (i16 < length2) {
            int[] iArr2 = this.f18202a;
            int i19 = iArr2[i16 + 1];
            int i20 = iArr2[i16];
            int i21 = (i19 & i12) >>> 20;
            if (i21 <= 17) {
                int i22 = iArr2[i16 + 2];
                int i23 = i22 & i13;
                if (i23 != i18) {
                    i17 = unsafe.getInt(obj, i23);
                    i18 = i23;
                }
                i10 = 1 << (i22 >>> 20);
            } else {
                i10 = 0;
            }
            while (entry != null) {
                this.f18216o.getClass();
                if (((w0) entry.getKey()).f18318b <= i20) {
                    this.f18216o.getClass();
                    j0.a(c0Var, entry);
                    entry = itD.hasNext() ? (Map.Entry) itD.next() : null;
                } else {
                    i11 = length2;
                    j10 = i19 & i13;
                    switch (i21) {
                        case 0:
                            z10 = false;
                            if ((i17 & i10) != 0) {
                                c0Var.a(i20, x3.f18340c.c(obj, j10));
                            }
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 1:
                            z10 = false;
                            if ((i17 & i10) != 0) {
                                c0Var.a(i20, x3.f18340c.d(obj, j10));
                            }
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 2:
                            z10 = false;
                            if ((i17 & i10) != 0) {
                                c0Var.f18158a.b(i20, unsafe.getLong(obj, j10));
                            }
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 3:
                            z10 = false;
                            if ((i17 & i10) != 0) {
                                c0Var.f18158a.b(i20, unsafe.getLong(obj, j10));
                            }
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 4:
                            z10 = false;
                            if ((i17 & i10) != 0) {
                                c0Var.f18158a.b(i20, unsafe.getInt(obj, j10));
                            }
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 5:
                            z10 = false;
                            if ((i17 & i10) != 0) {
                                c0Var.f18158a.a(i20, unsafe.getLong(obj, j10));
                            }
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 6:
                            z10 = false;
                            if ((i17 & i10) != 0) {
                                c0Var.f18158a.a(i20, unsafe.getInt(obj, j10));
                            }
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 7:
                            z10 = false;
                            if ((i17 & i10) != 0) {
                                c0Var.f18158a.a(i20, x3.f18340c.a(obj, j10));
                            }
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 8:
                            z10 = false;
                            if ((i17 & i10) != 0) {
                                a(i20, unsafe.getObject(obj, j10), c0Var);
                            }
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 9:
                            z10 = false;
                            if ((i17 & i10) != 0) {
                                c0Var.f18158a.a(i20, (d2) unsafe.getObject(obj, j10), c(i16));
                            }
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 10:
                            z10 = false;
                            if ((i17 & i10) != 0) {
                                c0Var.f18158a.a(i20, (s) unsafe.getObject(obj, j10));
                            }
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 11:
                            z10 = false;
                            if ((i17 & i10) != 0) {
                                c0Var.f18158a.d(i20, unsafe.getInt(obj, j10));
                            }
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 12:
                            z10 = false;
                            if ((i17 & i10) != 0) {
                                c0Var.f18158a.b(i20, unsafe.getInt(obj, j10));
                            }
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 13:
                            z10 = false;
                            if ((i17 & i10) != 0) {
                                c0Var.f18158a.a(i20, unsafe.getInt(obj, j10));
                            }
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 14:
                            z10 = false;
                            if ((i17 & i10) != 0) {
                                c0Var.f18158a.a(i20, unsafe.getLong(obj, j10));
                            }
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 15:
                            z10 = false;
                            if ((i17 & i10) != 0) {
                                c0Var.a(i20, unsafe.getInt(obj, j10));
                            }
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 16:
                            z10 = false;
                            if ((i17 & i10) != 0) {
                                c0Var.a(i20, unsafe.getLong(obj, j10));
                            }
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 17:
                            z10 = false;
                            if ((i17 & i10) != 0) {
                                c0Var.a(i20, unsafe.getObject(obj, j10), c(i16));
                            }
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 18:
                            z10 = false;
                            u2.b(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, false);
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 19:
                            z10 = false;
                            u2.f(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, false);
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 20:
                            z10 = false;
                            u2.h(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, false);
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 21:
                            z10 = false;
                            u2.n(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, false);
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 22:
                            z10 = false;
                            u2.g(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, false);
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 23:
                            z10 = false;
                            u2.e(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, false);
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 24:
                            z10 = false;
                            u2.d(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, false);
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 25:
                            z10 = false;
                            u2.a(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, false);
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 26:
                            u2.b(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var);
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 27:
                            u2.b(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, c(i16));
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 28:
                            u2.a(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var);
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 29:
                            z11 = false;
                            u2.m(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, false);
                            z10 = z11;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 30:
                            z11 = false;
                            u2.c(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, false);
                            z10 = z11;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 31:
                            z11 = false;
                            u2.i(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, false);
                            z10 = z11;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 32:
                            z11 = false;
                            u2.j(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, false);
                            z10 = z11;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 33:
                            z11 = false;
                            u2.k(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, false);
                            z10 = z11;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 34:
                            z11 = false;
                            u2.l(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, false);
                            z10 = z11;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 35:
                            u2.b(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, true);
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 36:
                            u2.f(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, true);
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 37:
                            u2.h(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, true);
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 38:
                            u2.n(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, true);
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 39:
                            u2.g(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, true);
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 40:
                            u2.e(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, true);
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 41:
                            u2.d(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, true);
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 42:
                            u2.a(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, true);
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 43:
                            u2.m(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, true);
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 44:
                            u2.c(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, true);
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 45:
                            u2.i(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, true);
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 46:
                            u2.j(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, true);
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 47:
                            u2.k(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, true);
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 48:
                            u2.l(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, true);
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 49:
                            u2.a(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, c(i16));
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j10) != null) {
                                z1 z1Var3 = this.f18217p;
                                Object objB3 = b(i16);
                                z1Var3.getClass();
                                objB3.getClass();
                                throw new ClassCastException();
                            }
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 51:
                            if (a(obj, i20, i16)) {
                                c0Var.a(i20, ((Double) x3.e(obj, j10)).doubleValue());
                            }
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 52:
                            if (a(obj, i20, i16)) {
                                c0Var.a(i20, ((Float) x3.e(obj, j10)).floatValue());
                            }
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 53:
                            if (a(obj, i20, i16)) {
                                c0Var.f18158a.b(i20, ((Long) x3.e(obj, j10)).longValue());
                            }
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 54:
                            if (a(obj, i20, i16)) {
                                c0Var.f18158a.b(i20, ((Long) x3.e(obj, j10)).longValue());
                            }
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 55:
                            if (a(obj, i20, i16)) {
                                c0Var.f18158a.b(i20, ((Integer) x3.e(obj, j10)).intValue());
                            }
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 56:
                            if (a(obj, i20, i16)) {
                                c0Var.f18158a.a(i20, ((Long) x3.e(obj, j10)).longValue());
                            }
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 57:
                            if (a(obj, i20, i16)) {
                                c0Var.f18158a.a(i20, ((Integer) x3.e(obj, j10)).intValue());
                            }
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 58:
                            if (a(obj, i20, i16)) {
                                c0Var.f18158a.a(i20, ((Boolean) x3.e(obj, j10)).booleanValue());
                            }
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 59:
                            if (a(obj, i20, i16)) {
                                a(i20, unsafe.getObject(obj, j10), c0Var);
                            }
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 60:
                            if (a(obj, i20, i16)) {
                                c0Var.f18158a.a(i20, (d2) unsafe.getObject(obj, j10), c(i16));
                            }
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 61:
                            if (a(obj, i20, i16)) {
                                c0Var.f18158a.a(i20, (s) unsafe.getObject(obj, j10));
                            }
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 62:
                            if (a(obj, i20, i16)) {
                                c0Var.f18158a.d(i20, ((Integer) x3.e(obj, j10)).intValue());
                            }
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 63:
                            if (a(obj, i20, i16)) {
                                c0Var.f18158a.b(i20, ((Integer) x3.e(obj, j10)).intValue());
                            }
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 64:
                            if (a(obj, i20, i16)) {
                                c0Var.f18158a.a(i20, ((Integer) x3.e(obj, j10)).intValue());
                            }
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 65:
                            if (a(obj, i20, i16)) {
                                c0Var.f18158a.a(i20, ((Long) x3.e(obj, j10)).longValue());
                            }
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 66:
                            if (a(obj, i20, i16)) {
                                c0Var.a(i20, ((Integer) x3.e(obj, j10)).intValue());
                            }
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 67:
                            if (a(obj, i20, i16)) {
                                c0Var.a(i20, ((Long) x3.e(obj, j10)).longValue());
                            }
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        case 68:
                            if (a(obj, i20, i16)) {
                                c0Var.a(i20, unsafe.getObject(obj, j10), c(i16));
                            }
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                        default:
                            z10 = false;
                            i16 += 3;
                            length2 = i11;
                            i12 = 267386880;
                            i13 = 1048575;
                            break;
                    }
                }
            }
            i11 = length2;
            j10 = i19 & i13;
            switch (i21) {
                case 0:
                    z10 = false;
                    if ((i17 & i10) != 0) {
                        c0Var.a(i20, x3.f18340c.c(obj, j10));
                    }
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 1:
                    z10 = false;
                    if ((i17 & i10) != 0) {
                        c0Var.a(i20, x3.f18340c.d(obj, j10));
                    }
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 2:
                    z10 = false;
                    if ((i17 & i10) != 0) {
                        c0Var.f18158a.b(i20, unsafe.getLong(obj, j10));
                    }
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 3:
                    z10 = false;
                    if ((i17 & i10) != 0) {
                        c0Var.f18158a.b(i20, unsafe.getLong(obj, j10));
                    }
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 4:
                    z10 = false;
                    if ((i17 & i10) != 0) {
                        c0Var.f18158a.b(i20, unsafe.getInt(obj, j10));
                    }
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 5:
                    z10 = false;
                    if ((i17 & i10) != 0) {
                        c0Var.f18158a.a(i20, unsafe.getLong(obj, j10));
                    }
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 6:
                    z10 = false;
                    if ((i17 & i10) != 0) {
                        c0Var.f18158a.a(i20, unsafe.getInt(obj, j10));
                    }
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 7:
                    z10 = false;
                    if ((i17 & i10) != 0) {
                        c0Var.f18158a.a(i20, x3.f18340c.a(obj, j10));
                    }
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 8:
                    z10 = false;
                    if ((i17 & i10) != 0) {
                        a(i20, unsafe.getObject(obj, j10), c0Var);
                    }
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 9:
                    z10 = false;
                    if ((i17 & i10) != 0) {
                        c0Var.f18158a.a(i20, (d2) unsafe.getObject(obj, j10), c(i16));
                    }
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 10:
                    z10 = false;
                    if ((i17 & i10) != 0) {
                        c0Var.f18158a.a(i20, (s) unsafe.getObject(obj, j10));
                    }
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 11:
                    z10 = false;
                    if ((i17 & i10) != 0) {
                        c0Var.f18158a.d(i20, unsafe.getInt(obj, j10));
                    }
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 12:
                    z10 = false;
                    if ((i17 & i10) != 0) {
                        c0Var.f18158a.b(i20, unsafe.getInt(obj, j10));
                    }
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 13:
                    z10 = false;
                    if ((i17 & i10) != 0) {
                        c0Var.f18158a.a(i20, unsafe.getInt(obj, j10));
                    }
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 14:
                    z10 = false;
                    if ((i17 & i10) != 0) {
                        c0Var.f18158a.a(i20, unsafe.getLong(obj, j10));
                    }
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 15:
                    z10 = false;
                    if ((i17 & i10) != 0) {
                        c0Var.a(i20, unsafe.getInt(obj, j10));
                    }
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 16:
                    z10 = false;
                    if ((i17 & i10) != 0) {
                        c0Var.a(i20, unsafe.getLong(obj, j10));
                    }
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 17:
                    z10 = false;
                    if ((i17 & i10) != 0) {
                        c0Var.a(i20, unsafe.getObject(obj, j10), c(i16));
                    }
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 18:
                    z10 = false;
                    u2.b(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, false);
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 19:
                    z10 = false;
                    u2.f(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, false);
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 20:
                    z10 = false;
                    u2.h(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, false);
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 21:
                    z10 = false;
                    u2.n(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, false);
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 22:
                    z10 = false;
                    u2.g(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, false);
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 23:
                    z10 = false;
                    u2.e(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, false);
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 24:
                    z10 = false;
                    u2.d(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, false);
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 25:
                    z10 = false;
                    u2.a(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, false);
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 26:
                    u2.b(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var);
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 27:
                    u2.b(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, c(i16));
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 28:
                    u2.a(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var);
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 29:
                    z11 = false;
                    u2.m(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, false);
                    z10 = z11;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 30:
                    z11 = false;
                    u2.c(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, false);
                    z10 = z11;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 31:
                    z11 = false;
                    u2.i(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, false);
                    z10 = z11;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 32:
                    z11 = false;
                    u2.j(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, false);
                    z10 = z11;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 33:
                    z11 = false;
                    u2.k(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, false);
                    z10 = z11;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 34:
                    z11 = false;
                    u2.l(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, false);
                    z10 = z11;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 35:
                    u2.b(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, true);
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 36:
                    u2.f(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, true);
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 37:
                    u2.h(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, true);
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 38:
                    u2.n(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, true);
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 39:
                    u2.g(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, true);
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 40:
                    u2.e(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, true);
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 41:
                    u2.d(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, true);
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 42:
                    u2.a(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, true);
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 43:
                    u2.m(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, true);
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 44:
                    u2.c(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, true);
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 45:
                    u2.i(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, true);
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 46:
                    u2.j(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, true);
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 47:
                    u2.k(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, true);
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 48:
                    u2.l(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, true);
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 49:
                    u2.a(this.f18202a[i16], (List) unsafe.getObject(obj, j10), c0Var, c(i16));
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j10) != null) {
                        z1 z1Var4 = this.f18217p;
                        Object objB4 = b(i16);
                        z1Var4.getClass();
                        objB4.getClass();
                        throw new ClassCastException();
                    }
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 51:
                    if (a(obj, i20, i16)) {
                        c0Var.a(i20, ((Double) x3.e(obj, j10)).doubleValue());
                    }
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 52:
                    if (a(obj, i20, i16)) {
                        c0Var.a(i20, ((Float) x3.e(obj, j10)).floatValue());
                    }
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 53:
                    if (a(obj, i20, i16)) {
                        c0Var.f18158a.b(i20, ((Long) x3.e(obj, j10)).longValue());
                    }
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 54:
                    if (a(obj, i20, i16)) {
                        c0Var.f18158a.b(i20, ((Long) x3.e(obj, j10)).longValue());
                    }
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 55:
                    if (a(obj, i20, i16)) {
                        c0Var.f18158a.b(i20, ((Integer) x3.e(obj, j10)).intValue());
                    }
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 56:
                    if (a(obj, i20, i16)) {
                        c0Var.f18158a.a(i20, ((Long) x3.e(obj, j10)).longValue());
                    }
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 57:
                    if (a(obj, i20, i16)) {
                        c0Var.f18158a.a(i20, ((Integer) x3.e(obj, j10)).intValue());
                    }
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 58:
                    if (a(obj, i20, i16)) {
                        c0Var.f18158a.a(i20, ((Boolean) x3.e(obj, j10)).booleanValue());
                    }
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 59:
                    if (a(obj, i20, i16)) {
                        a(i20, unsafe.getObject(obj, j10), c0Var);
                    }
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 60:
                    if (a(obj, i20, i16)) {
                        c0Var.f18158a.a(i20, (d2) unsafe.getObject(obj, j10), c(i16));
                    }
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 61:
                    if (a(obj, i20, i16)) {
                        c0Var.f18158a.a(i20, (s) unsafe.getObject(obj, j10));
                    }
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 62:
                    if (a(obj, i20, i16)) {
                        c0Var.f18158a.d(i20, ((Integer) x3.e(obj, j10)).intValue());
                    }
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 63:
                    if (a(obj, i20, i16)) {
                        c0Var.f18158a.b(i20, ((Integer) x3.e(obj, j10)).intValue());
                    }
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 64:
                    if (a(obj, i20, i16)) {
                        c0Var.f18158a.a(i20, ((Integer) x3.e(obj, j10)).intValue());
                    }
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 65:
                    if (a(obj, i20, i16)) {
                        c0Var.f18158a.a(i20, ((Long) x3.e(obj, j10)).longValue());
                    }
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 66:
                    if (a(obj, i20, i16)) {
                        c0Var.a(i20, ((Integer) x3.e(obj, j10)).intValue());
                    }
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 67:
                    if (a(obj, i20, i16)) {
                        c0Var.a(i20, ((Long) x3.e(obj, j10)).longValue());
                    }
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                case 68:
                    if (a(obj, i20, i16)) {
                        c0Var.a(i20, unsafe.getObject(obj, j10), c(i16));
                    }
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
                default:
                    z10 = false;
                    i16 += 3;
                    length2 = i11;
                    i12 = 267386880;
                    i13 = 1048575;
                    break;
            }
        }
        while (entry != null) {
            this.f18216o.getClass();
            j0.a(c0Var, entry);
            entry = itD.hasNext() ? (Map.Entry) itD.next() : null;
        }
        this.f18215n.getClass();
        ((z0) obj).unknownFields.a(c0Var);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0388  */
    /* JADX WARN: Code duplicated, block: B:101:0x0399  */
    /* JADX WARN: Code duplicated, block: B:102:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:103:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:104:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:105:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:106:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:107:0x0403  */
    /* JADX WARN: Code duplicated, block: B:108:0x0414  */
    /* JADX WARN: Code duplicated, block: B:109:0x0425  */
    /* JADX WARN: Code duplicated, block: B:110:0x0436  */
    /* JADX WARN: Code duplicated, block: B:111:0x0447  */
    /* JADX WARN: Code duplicated, block: B:112:0x0458  */
    /* JADX WARN: Code duplicated, block: B:114:0x045e  */
    /* JADX WARN: Code duplicated, block: B:115:0x046d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0473  */
    /* JADX WARN: Code duplicated, block: B:118:0x047e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0484  */
    /* JADX WARN: Code duplicated, block: B:121:0x048f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0495  */
    /* JADX WARN: Code duplicated, block: B:124:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:126:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:127:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:129:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:130:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:132:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:133:0x04db  */
    /* JADX WARN: Code duplicated, block: B:135:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:136:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:138:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:139:0x0509  */
    /* JADX WARN: Code duplicated, block: B:141:0x050f  */
    /* JADX WARN: Code duplicated, block: B:142:0x051a  */
    /* JADX WARN: Code duplicated, block: B:144:0x0520  */
    /* JADX WARN: Code duplicated, block: B:145:0x052f  */
    /* JADX WARN: Code duplicated, block: B:147:0x0535  */
    /* JADX WARN: Code duplicated, block: B:148:0x0541  */
    /* JADX WARN: Code duplicated, block: B:150:0x0547  */
    /* JADX WARN: Code duplicated, block: B:151:0x0553  */
    /* JADX WARN: Code duplicated, block: B:153:0x0559  */
    /* JADX WARN: Code duplicated, block: B:154:0x0565  */
    /* JADX WARN: Code duplicated, block: B:156:0x056b  */
    /* JADX WARN: Code duplicated, block: B:157:0x0577  */
    /* JADX WARN: Code duplicated, block: B:159:0x057d  */
    /* JADX WARN: Code duplicated, block: B:160:0x0589  */
    /* JADX WARN: Code duplicated, block: B:162:0x058f  */
    /* JADX WARN: Code duplicated, block: B:163:0x059b  */
    /* JADX WARN: Code duplicated, block: B:165:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:175:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:245:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x007e  */
    /* JADX WARN: Code duplicated, block: B:251:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:271:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0095  */
    /* JADX WARN: Code duplicated, block: B:280:0x05ac A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00de  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:42:0x0110  */
    /* JADX WARN: Code duplicated, block: B:44:0x0116  */
    /* JADX WARN: Code duplicated, block: B:45:0x0125  */
    /* JADX WARN: Code duplicated, block: B:47:0x012b  */
    /* JADX WARN: Code duplicated, block: B:48:0x013e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0144  */
    /* JADX WARN: Code duplicated, block: B:51:0x014f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0155  */
    /* JADX WARN: Code duplicated, block: B:54:0x0168  */
    /* JADX WARN: Code duplicated, block: B:56:0x016e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0181  */
    /* JADX WARN: Code duplicated, block: B:59:0x0187  */
    /* JADX WARN: Code duplicated, block: B:60:0x019a  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:72:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:74:0x0202  */
    /* JADX WARN: Code duplicated, block: B:75:0x0213  */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    /* JADX WARN: Code duplicated, block: B:80:0x0230  */
    /* JADX WARN: Code duplicated, block: B:81:0x0245  */
    /* JADX WARN: Code duplicated, block: B:82:0x0256  */
    /* JADX WARN: Code duplicated, block: B:83:0x0267  */
    /* JADX WARN: Code duplicated, block: B:84:0x0278  */
    /* JADX WARN: Code duplicated, block: B:85:0x0289  */
    /* JADX WARN: Code duplicated, block: B:86:0x029a  */
    /* JADX WARN: Code duplicated, block: B:87:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:88:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:89:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:90:0x02de  */
    /* JADX WARN: Code duplicated, block: B:91:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:92:0x0300  */
    /* JADX WARN: Code duplicated, block: B:93:0x0311  */
    /* JADX WARN: Code duplicated, block: B:94:0x0322  */
    /* JADX WARN: Code duplicated, block: B:95:0x0333  */
    /* JADX WARN: Code duplicated, block: B:96:0x0344  */
    /* JADX WARN: Code duplicated, block: B:97:0x0355  */
    /* JADX WARN: Code duplicated, block: B:98:0x0366  */
    /* JADX WARN: Code duplicated, block: B:99:0x0377  */
    public final void b(Object obj, c0 c0Var) {
        Iterator itD;
        Map.Entry entry;
        if (this.f18207f) {
            this.f18216o.getClass();
            n0 n0Var = ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
            if (n0Var.f18241a.isEmpty()) {
                itD = null;
                entry = null;
            } else {
                itD = n0Var.d();
                entry = (Map.Entry) itD.next();
            }
        } else {
            itD = null;
            entry = null;
        }
        int length = this.f18202a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int[] iArr = this.f18202a;
            int i11 = iArr[i10 + 1];
            int i12 = iArr[i10];
            while (entry != null) {
                this.f18216o.getClass();
                if (((w0) entry.getKey()).f18318b <= i12) {
                    this.f18216o.getClass();
                    j0.a(c0Var, entry);
                    entry = itD.hasNext() ? (Map.Entry) itD.next() : null;
                } else {
                    switch ((267386880 & i11) >>> 20) {
                        case 0:
                            if (a(i10, obj)) {
                                c0Var.a(i12, x3.f18340c.c(obj, i11 & 1048575));
                            }
                            break;
                        case 1:
                            if (a(i10, obj)) {
                                c0Var.a(i12, x3.f18340c.d(obj, i11 & 1048575));
                            }
                            break;
                        case 2:
                            if (a(i10, obj)) {
                                c0Var.f18158a.b(i12, x3.d(obj, i11 & 1048575));
                            }
                            break;
                        case 3:
                            if (a(i10, obj)) {
                                c0Var.f18158a.b(i12, x3.d(obj, i11 & 1048575));
                            }
                            break;
                        case 4:
                            if (a(i10, obj)) {
                                c0Var.f18158a.b(i12, x3.c(obj, i11 & 1048575));
                            }
                            break;
                        case 5:
                            if (a(i10, obj)) {
                                c0Var.f18158a.a(i12, x3.d(obj, i11 & 1048575));
                            }
                            break;
                        case 6:
                            if (a(i10, obj)) {
                                c0Var.f18158a.a(i12, x3.c(obj, i11 & 1048575));
                            }
                            break;
                        case 7:
                            if (a(i10, obj)) {
                                c0Var.f18158a.a(i12, x3.f18340c.a(obj, i11 & 1048575));
                            }
                            break;
                        case 8:
                            if (a(i10, obj)) {
                                a(i12, x3.e(obj, i11 & 1048575), c0Var);
                            }
                            break;
                        case 9:
                            if (a(i10, obj)) {
                                c0Var.f18158a.a(i12, (d2) x3.e(obj, i11 & 1048575), c(i10));
                            }
                            break;
                        case 10:
                            if (a(i10, obj)) {
                                c0Var.f18158a.a(i12, (s) x3.e(obj, i11 & 1048575));
                            }
                            break;
                        case 11:
                            if (a(i10, obj)) {
                                c0Var.f18158a.d(i12, x3.c(obj, i11 & 1048575));
                            }
                            break;
                        case 12:
                            if (a(i10, obj)) {
                                c0Var.f18158a.b(i12, x3.c(obj, i11 & 1048575));
                            }
                            break;
                        case 13:
                            if (a(i10, obj)) {
                                c0Var.f18158a.a(i12, x3.c(obj, i11 & 1048575));
                            }
                            break;
                        case 14:
                            if (a(i10, obj)) {
                                c0Var.f18158a.a(i12, x3.d(obj, i11 & 1048575));
                            }
                            break;
                        case 15:
                            if (a(i10, obj)) {
                                c0Var.a(i12, x3.c(obj, i11 & 1048575));
                            }
                            break;
                        case 16:
                            if (a(i10, obj)) {
                                c0Var.a(i12, x3.d(obj, i11 & 1048575));
                            }
                            break;
                        case 17:
                            if (a(i10, obj)) {
                                c0Var.a(i12, x3.e(obj, i11 & 1048575), c(i10));
                            }
                            break;
                        case 18:
                            u2.b(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, false);
                            break;
                        case 19:
                            u2.f(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, false);
                            break;
                        case 20:
                            u2.h(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, false);
                            break;
                        case 21:
                            u2.n(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, false);
                            break;
                        case 22:
                            u2.g(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, false);
                            break;
                        case 23:
                            u2.e(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, false);
                            break;
                        case 24:
                            u2.d(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, false);
                            break;
                        case 25:
                            u2.a(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, false);
                            break;
                        case 26:
                            u2.b(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var);
                            break;
                        case 27:
                            u2.b(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, c(i10));
                            break;
                        case 28:
                            u2.a(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var);
                            break;
                        case 29:
                            u2.m(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, false);
                            break;
                        case 30:
                            u2.c(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, false);
                            break;
                        case 31:
                            u2.i(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, false);
                            break;
                        case 32:
                            u2.j(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, false);
                            break;
                        case 33:
                            u2.k(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, false);
                            break;
                        case 34:
                            u2.l(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, false);
                            break;
                        case 35:
                            u2.b(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, true);
                            break;
                        case 36:
                            u2.f(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, true);
                            break;
                        case 37:
                            u2.h(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, true);
                            break;
                        case 38:
                            u2.n(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, true);
                            break;
                        case 39:
                            u2.g(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, true);
                            break;
                        case 40:
                            u2.e(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, true);
                            break;
                        case 41:
                            u2.d(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, true);
                            break;
                        case 42:
                            u2.a(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, true);
                            break;
                        case 43:
                            u2.m(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, true);
                            break;
                        case 44:
                            u2.c(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, true);
                            break;
                        case 45:
                            u2.i(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, true);
                            break;
                        case 46:
                            u2.j(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, true);
                            break;
                        case 47:
                            u2.k(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, true);
                            break;
                        case 48:
                            u2.l(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, true);
                            break;
                        case 49:
                            u2.a(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, c(i10));
                            break;
                        case 50:
                            if (x3.e(obj, i11 & 1048575) == null) {
                                z1 z1Var = this.f18217p;
                                Object objB = b(i10);
                                z1Var.getClass();
                                objB.getClass();
                                throw new ClassCastException();
                            }
                            break;
                            break;
                        case 51:
                            if (a(obj, i12, i10)) {
                                c0Var.a(i12, ((Double) x3.e(obj, i11 & 1048575)).doubleValue());
                            }
                            break;
                        case 52:
                            if (a(obj, i12, i10)) {
                                c0Var.a(i12, ((Float) x3.e(obj, i11 & 1048575)).floatValue());
                            }
                            break;
                        case 53:
                            if (a(obj, i12, i10)) {
                                c0Var.f18158a.b(i12, ((Long) x3.e(obj, i11 & 1048575)).longValue());
                            }
                            break;
                        case 54:
                            if (a(obj, i12, i10)) {
                                c0Var.f18158a.b(i12, ((Long) x3.e(obj, i11 & 1048575)).longValue());
                            }
                            break;
                        case 55:
                            if (a(obj, i12, i10)) {
                                c0Var.f18158a.b(i12, ((Integer) x3.e(obj, i11 & 1048575)).intValue());
                            }
                            break;
                        case 56:
                            if (a(obj, i12, i10)) {
                                c0Var.f18158a.a(i12, ((Long) x3.e(obj, i11 & 1048575)).longValue());
                            }
                            break;
                        case 57:
                            if (a(obj, i12, i10)) {
                                c0Var.f18158a.a(i12, ((Integer) x3.e(obj, i11 & 1048575)).intValue());
                            }
                            break;
                        case 58:
                            if (a(obj, i12, i10)) {
                                c0Var.f18158a.a(i12, ((Boolean) x3.e(obj, i11 & 1048575)).booleanValue());
                            }
                            break;
                        case 59:
                            if (a(obj, i12, i10)) {
                                a(i12, x3.e(obj, i11 & 1048575), c0Var);
                            }
                            break;
                        case 60:
                            if (a(obj, i12, i10)) {
                                c0Var.f18158a.a(i12, (d2) x3.e(obj, i11 & 1048575), c(i10));
                            }
                            break;
                        case 61:
                            if (a(obj, i12, i10)) {
                                c0Var.f18158a.a(i12, (s) x3.e(obj, i11 & 1048575));
                            }
                            break;
                        case 62:
                            if (a(obj, i12, i10)) {
                                c0Var.f18158a.d(i12, ((Integer) x3.e(obj, i11 & 1048575)).intValue());
                            }
                            break;
                        case 63:
                            if (a(obj, i12, i10)) {
                                c0Var.f18158a.b(i12, ((Integer) x3.e(obj, i11 & 1048575)).intValue());
                            }
                            break;
                        case 64:
                            if (a(obj, i12, i10)) {
                                c0Var.f18158a.a(i12, ((Integer) x3.e(obj, i11 & 1048575)).intValue());
                            }
                            break;
                        case 65:
                            if (a(obj, i12, i10)) {
                                c0Var.f18158a.a(i12, ((Long) x3.e(obj, i11 & 1048575)).longValue());
                            }
                            break;
                        case 66:
                            if (a(obj, i12, i10)) {
                                c0Var.a(i12, ((Integer) x3.e(obj, i11 & 1048575)).intValue());
                            }
                            break;
                        case 67:
                            if (a(obj, i12, i10)) {
                                c0Var.a(i12, ((Long) x3.e(obj, i11 & 1048575)).longValue());
                            }
                            break;
                        case 68:
                            if (a(obj, i12, i10)) {
                                c0Var.a(i12, x3.e(obj, i11 & 1048575), c(i10));
                            }
                            break;
                    }
                }
            }
            switch ((267386880 & i11) >>> 20) {
                case 0:
                    if (a(i10, obj)) {
                        c0Var.a(i12, x3.f18340c.c(obj, i11 & 1048575));
                    }
                    break;
                case 1:
                    if (a(i10, obj)) {
                        c0Var.a(i12, x3.f18340c.d(obj, i11 & 1048575));
                    }
                    break;
                case 2:
                    if (a(i10, obj)) {
                        c0Var.f18158a.b(i12, x3.d(obj, i11 & 1048575));
                    }
                    break;
                case 3:
                    if (a(i10, obj)) {
                        c0Var.f18158a.b(i12, x3.d(obj, i11 & 1048575));
                    }
                    break;
                case 4:
                    if (a(i10, obj)) {
                        c0Var.f18158a.b(i12, x3.c(obj, i11 & 1048575));
                    }
                    break;
                case 5:
                    if (a(i10, obj)) {
                        c0Var.f18158a.a(i12, x3.d(obj, i11 & 1048575));
                    }
                    break;
                case 6:
                    if (a(i10, obj)) {
                        c0Var.f18158a.a(i12, x3.c(obj, i11 & 1048575));
                    }
                    break;
                case 7:
                    if (a(i10, obj)) {
                        c0Var.f18158a.a(i12, x3.f18340c.a(obj, i11 & 1048575));
                    }
                    break;
                case 8:
                    if (a(i10, obj)) {
                        a(i12, x3.e(obj, i11 & 1048575), c0Var);
                    }
                    break;
                case 9:
                    if (a(i10, obj)) {
                        c0Var.f18158a.a(i12, (d2) x3.e(obj, i11 & 1048575), c(i10));
                    }
                    break;
                case 10:
                    if (a(i10, obj)) {
                        c0Var.f18158a.a(i12, (s) x3.e(obj, i11 & 1048575));
                    }
                    break;
                case 11:
                    if (a(i10, obj)) {
                        c0Var.f18158a.d(i12, x3.c(obj, i11 & 1048575));
                    }
                    break;
                case 12:
                    if (a(i10, obj)) {
                        c0Var.f18158a.b(i12, x3.c(obj, i11 & 1048575));
                    }
                    break;
                case 13:
                    if (a(i10, obj)) {
                        c0Var.f18158a.a(i12, x3.c(obj, i11 & 1048575));
                    }
                    break;
                case 14:
                    if (a(i10, obj)) {
                        c0Var.f18158a.a(i12, x3.d(obj, i11 & 1048575));
                    }
                    break;
                case 15:
                    if (a(i10, obj)) {
                        c0Var.a(i12, x3.c(obj, i11 & 1048575));
                    }
                    break;
                case 16:
                    if (a(i10, obj)) {
                        c0Var.a(i12, x3.d(obj, i11 & 1048575));
                    }
                    break;
                case 17:
                    if (a(i10, obj)) {
                        c0Var.a(i12, x3.e(obj, i11 & 1048575), c(i10));
                    }
                    break;
                case 18:
                    u2.b(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, false);
                    break;
                case 19:
                    u2.f(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, false);
                    break;
                case 20:
                    u2.h(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, false);
                    break;
                case 21:
                    u2.n(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, false);
                    break;
                case 22:
                    u2.g(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, false);
                    break;
                case 23:
                    u2.e(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, false);
                    break;
                case 24:
                    u2.d(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, false);
                    break;
                case 25:
                    u2.a(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, false);
                    break;
                case 26:
                    u2.b(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var);
                    break;
                case 27:
                    u2.b(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, c(i10));
                    break;
                case 28:
                    u2.a(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var);
                    break;
                case 29:
                    u2.m(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, false);
                    break;
                case 30:
                    u2.c(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, false);
                    break;
                case 31:
                    u2.i(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, false);
                    break;
                case 32:
                    u2.j(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, false);
                    break;
                case 33:
                    u2.k(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, false);
                    break;
                case 34:
                    u2.l(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, false);
                    break;
                case 35:
                    u2.b(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, true);
                    break;
                case 36:
                    u2.f(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, true);
                    break;
                case 37:
                    u2.h(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, true);
                    break;
                case 38:
                    u2.n(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, true);
                    break;
                case 39:
                    u2.g(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, true);
                    break;
                case 40:
                    u2.e(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, true);
                    break;
                case 41:
                    u2.d(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, true);
                    break;
                case 42:
                    u2.a(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, true);
                    break;
                case 43:
                    u2.m(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, true);
                    break;
                case 44:
                    u2.c(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, true);
                    break;
                case 45:
                    u2.i(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, true);
                    break;
                case 46:
                    u2.j(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, true);
                    break;
                case 47:
                    u2.k(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, true);
                    break;
                case 48:
                    u2.l(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, true);
                    break;
                case 49:
                    u2.a(this.f18202a[i10], (List) x3.e(obj, i11 & 1048575), c0Var, c(i10));
                    break;
                case 50:
                    if (x3.e(obj, i11 & 1048575) == null) {
                        z1 z1Var2 = this.f18217p;
                        Object objB2 = b(i10);
                        z1Var2.getClass();
                        objB2.getClass();
                        throw new ClassCastException();
                    }
                    break;
                    break;
                case 51:
                    if (a(obj, i12, i10)) {
                        c0Var.a(i12, ((Double) x3.e(obj, i11 & 1048575)).doubleValue());
                    }
                    break;
                case 52:
                    if (a(obj, i12, i10)) {
                        c0Var.a(i12, ((Float) x3.e(obj, i11 & 1048575)).floatValue());
                    }
                    break;
                case 53:
                    if (a(obj, i12, i10)) {
                        c0Var.f18158a.b(i12, ((Long) x3.e(obj, i11 & 1048575)).longValue());
                    }
                    break;
                case 54:
                    if (a(obj, i12, i10)) {
                        c0Var.f18158a.b(i12, ((Long) x3.e(obj, i11 & 1048575)).longValue());
                    }
                    break;
                case 55:
                    if (a(obj, i12, i10)) {
                        c0Var.f18158a.b(i12, ((Integer) x3.e(obj, i11 & 1048575)).intValue());
                    }
                    break;
                case 56:
                    if (a(obj, i12, i10)) {
                        c0Var.f18158a.a(i12, ((Long) x3.e(obj, i11 & 1048575)).longValue());
                    }
                    break;
                case 57:
                    if (a(obj, i12, i10)) {
                        c0Var.f18158a.a(i12, ((Integer) x3.e(obj, i11 & 1048575)).intValue());
                    }
                    break;
                case 58:
                    if (a(obj, i12, i10)) {
                        c0Var.f18158a.a(i12, ((Boolean) x3.e(obj, i11 & 1048575)).booleanValue());
                    }
                    break;
                case 59:
                    if (a(obj, i12, i10)) {
                        a(i12, x3.e(obj, i11 & 1048575), c0Var);
                    }
                    break;
                case 60:
                    if (a(obj, i12, i10)) {
                        c0Var.f18158a.a(i12, (d2) x3.e(obj, i11 & 1048575), c(i10));
                    }
                    break;
                case 61:
                    if (a(obj, i12, i10)) {
                        c0Var.f18158a.a(i12, (s) x3.e(obj, i11 & 1048575));
                    }
                    break;
                case 62:
                    if (a(obj, i12, i10)) {
                        c0Var.f18158a.d(i12, ((Integer) x3.e(obj, i11 & 1048575)).intValue());
                    }
                    break;
                case 63:
                    if (a(obj, i12, i10)) {
                        c0Var.f18158a.b(i12, ((Integer) x3.e(obj, i11 & 1048575)).intValue());
                    }
                    break;
                case 64:
                    if (a(obj, i12, i10)) {
                        c0Var.f18158a.a(i12, ((Integer) x3.e(obj, i11 & 1048575)).intValue());
                    }
                    break;
                case 65:
                    if (a(obj, i12, i10)) {
                        c0Var.f18158a.a(i12, ((Long) x3.e(obj, i11 & 1048575)).longValue());
                    }
                    break;
                case 66:
                    if (a(obj, i12, i10)) {
                        c0Var.a(i12, ((Integer) x3.e(obj, i11 & 1048575)).intValue());
                    }
                    break;
                case 67:
                    if (a(obj, i12, i10)) {
                        c0Var.a(i12, ((Long) x3.e(obj, i11 & 1048575)).longValue());
                    }
                    break;
                case 68:
                    if (a(obj, i12, i10)) {
                        c0Var.a(i12, x3.e(obj, i11 & 1048575), c(i10));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f18216o.getClass();
            j0.a(c0Var, entry);
            entry = itD.hasNext() ? (Map.Entry) itD.next() : null;
        }
        this.f18215n.getClass();
        ((z0) obj).unknownFields.a(c0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(Object obj, s2 s2Var, h0 h0Var) {
        h0Var.getClass();
        a(this.f18215n, this.f18216o, obj, s2Var, h0Var);
    }

    public final void a(o3 o3Var, j0 j0Var, Object obj, s2 s2Var, h0 h0Var) {
        x0 x0VarA;
        Object objA;
        Object objB = null;
        n0 n0VarEnsureExtensionsAreMutable = null;
        while (true) {
            try {
                int iS = s2Var.s();
                int iA = (iS < this.f18204c || iS > this.f18205d) ? -1 : a(iS, 0);
                if (iA < 0) {
                    if (iS == Integer.MAX_VALUE) {
                        for (int i10 = this.f18211j; i10 < this.f18212k; i10++) {
                            objB = b(this.f18210i[i10], obj, objB);
                        }
                        if (objB != null) {
                            o3Var.getClass();
                            o3.a(obj, objB);
                            return;
                        }
                        return;
                    }
                    if (this.f18207f) {
                        d2 d2Var = this.f18206e;
                        j0Var.getClass();
                        x0VarA = h0Var.a(iS, d2Var);
                    } else {
                        x0VarA = null;
                    }
                    if (x0VarA != null) {
                        if (n0VarEnsureExtensionsAreMutable == null) {
                            j0Var.getClass();
                            n0VarEnsureExtensionsAreMutable = ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable();
                        }
                        j0Var.getClass();
                        objA = j0.a(s2Var, x0VarA, h0Var, n0VarEnsureExtensionsAreMutable, objB, o3Var);
                        objB = objA;
                    } else {
                        o3Var.getClass();
                        if (objB == null) {
                            z0 z0Var = (z0) obj;
                            n3 n3Var = z0Var.unknownFields;
                            if (n3Var == n3.f18245f) {
                                n3Var = new n3();
                                z0Var.unknownFields = n3Var;
                            }
                            objB = n3Var;
                        }
                        if (!o3.a(objB, s2Var)) {
                            for (int i11 = this.f18211j; i11 < this.f18212k; i11++) {
                                objB = b(this.f18210i[i11], obj, objB);
                            }
                            if (objB != null) {
                                o3.a(obj, objB);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    int i12 = this.f18202a[iA + 1];
                    switch ((267386880 & i12) >>> 20) {
                        case 0:
                            x3.f18340c.a(obj, d(i12), s2Var.h());
                            b(iA, obj);
                            break;
                        case 1:
                            x3.f18340c.a(obj, d(i12), s2Var.k());
                            b(iA, obj);
                            break;
                        case 2:
                            x3.a(obj, d(i12), s2Var.o());
                            b(iA, obj);
                            break;
                        case 3:
                            x3.a(obj, d(i12), s2Var.f());
                            b(iA, obj);
                            break;
                        case 4:
                            x3.a(obj, d(i12), s2Var.d());
                            b(iA, obj);
                            break;
                        case 5:
                            x3.a(obj, d(i12), s2Var.g());
                            b(iA, obj);
                            break;
                        case 6:
                            x3.a(obj, d(i12), s2Var.q());
                            b(iA, obj);
                            break;
                        case 7:
                            x3.f18340c.a(obj, d(i12), s2Var.r());
                            b(iA, obj);
                            break;
                        case 8:
                            if ((i12 & 536870912) != 0) {
                                x3.a(i12 & 1048575, obj, s2Var.p());
                            } else if (this.f18208g) {
                                x3.a(i12 & 1048575, obj, s2Var.n());
                            } else {
                                x3.a(i12 & 1048575, obj, s2Var.a());
                            }
                            b(iA, obj);
                            break;
                        case 9:
                            if (a(iA, obj)) {
                                x3.a(d(i12), obj, l1.a(x3.e(obj, d(i12)), s2Var.b(c(iA), h0Var)));
                            } else {
                                x3.a(d(i12), obj, s2Var.b(c(iA), h0Var));
                                b(iA, obj);
                            }
                            break;
                        case 10:
                            x3.a(d(i12), obj, s2Var.a());
                            b(iA, obj);
                            break;
                        case 11:
                            x3.a(obj, d(i12), s2Var.c());
                            b(iA, obj);
                            break;
                        case 12:
                            int iB = s2Var.b();
                            a(iA);
                            x3.a(obj, d(i12), iB);
                            b(iA, obj);
                            break;
                        case 13:
                            x3.a(obj, d(i12), s2Var.m());
                            b(iA, obj);
                            break;
                        case 14:
                            x3.a(obj, d(i12), s2Var.t());
                            b(iA, obj);
                            break;
                        case 15:
                            x3.a(obj, d(i12), s2Var.j());
                            b(iA, obj);
                            break;
                        case 16:
                            x3.a(obj, d(i12), s2Var.l());
                            b(iA, obj);
                            break;
                        case 17:
                            if (a(iA, obj)) {
                                x3.a(d(i12), obj, l1.a(x3.e(obj, d(i12)), s2Var.a(c(iA), h0Var)));
                            } else {
                                x3.a(d(i12), obj, s2Var.a(c(iA), h0Var));
                                b(iA, obj);
                            }
                            break;
                        case 18:
                            s2Var.j(this.f18214m.b(obj, d(i12)));
                            break;
                        case 19:
                            s2Var.d(this.f18214m.b(obj, d(i12)));
                            break;
                        case 20:
                            s2Var.k(this.f18214m.b(obj, d(i12)));
                            break;
                        case 21:
                            s2Var.a(this.f18214m.b(obj, d(i12)));
                            break;
                        case 22:
                            s2Var.o(this.f18214m.b(obj, d(i12)));
                            break;
                        case 23:
                            s2Var.n(this.f18214m.b(obj, d(i12)));
                            break;
                        case 24:
                            s2Var.e(this.f18214m.b(obj, d(i12)));
                            break;
                        case 25:
                            s2Var.l(this.f18214m.b(obj, d(i12)));
                            break;
                        case 26:
                            a(obj, i12, s2Var);
                            break;
                        case 27:
                            a(obj, i12, s2Var, c(iA), h0Var);
                            break;
                        case 28:
                            s2Var.h(this.f18214m.b(obj, d(i12)));
                            break;
                        case 29:
                            s2Var.i(this.f18214m.b(obj, d(i12)));
                            break;
                        case 30:
                            List listB = this.f18214m.b(obj, d(i12));
                            s2Var.p(listB);
                            a(iA);
                            objA = u2.a(iS, listB, objB, o3Var);
                            objB = objA;
                            break;
                        case 31:
                            s2Var.f(this.f18214m.b(obj, d(i12)));
                            break;
                        case 32:
                            s2Var.m(this.f18214m.b(obj, d(i12)));
                            break;
                        case 33:
                            s2Var.c(this.f18214m.b(obj, d(i12)));
                            break;
                        case 34:
                            s2Var.g(this.f18214m.b(obj, d(i12)));
                            break;
                        case 35:
                            s2Var.j(this.f18214m.b(obj, d(i12)));
                            break;
                        case 36:
                            s2Var.d(this.f18214m.b(obj, d(i12)));
                            break;
                        case 37:
                            s2Var.k(this.f18214m.b(obj, d(i12)));
                            break;
                        case 38:
                            s2Var.a(this.f18214m.b(obj, d(i12)));
                            break;
                        case 39:
                            s2Var.o(this.f18214m.b(obj, d(i12)));
                            break;
                        case 40:
                            s2Var.n(this.f18214m.b(obj, d(i12)));
                            break;
                        case 41:
                            s2Var.e(this.f18214m.b(obj, d(i12)));
                            break;
                        case 42:
                            s2Var.l(this.f18214m.b(obj, d(i12)));
                            break;
                        case 43:
                            s2Var.i(this.f18214m.b(obj, d(i12)));
                            break;
                        case 44:
                            List listB2 = this.f18214m.b(obj, d(i12));
                            s2Var.p(listB2);
                            a(iA);
                            objA = u2.a(iS, listB2, objB, o3Var);
                            objB = objA;
                            break;
                        case 45:
                            s2Var.f(this.f18214m.b(obj, d(i12)));
                            break;
                        case 46:
                            s2Var.m(this.f18214m.b(obj, d(i12)));
                            break;
                        case 47:
                            s2Var.c(this.f18214m.b(obj, d(i12)));
                            break;
                        case 48:
                            s2Var.g(this.f18214m.b(obj, d(i12)));
                            break;
                        case 49:
                            a(obj, d(i12), s2Var, c(iA), h0Var);
                            break;
                        case 50:
                            c(iA, obj, b(iA));
                            throw null;
                        case 51:
                            x3.a(d(i12), obj, Double.valueOf(s2Var.h()));
                            b(obj, iS, iA);
                            break;
                        case 52:
                            x3.a(d(i12), obj, Float.valueOf(s2Var.k()));
                            b(obj, iS, iA);
                            break;
                        case 53:
                            x3.a(d(i12), obj, Long.valueOf(s2Var.o()));
                            b(obj, iS, iA);
                            break;
                        case 54:
                            x3.a(d(i12), obj, Long.valueOf(s2Var.f()));
                            b(obj, iS, iA);
                            break;
                        case 55:
                            x3.a(d(i12), obj, Integer.valueOf(s2Var.d()));
                            b(obj, iS, iA);
                            break;
                        case 56:
                            x3.a(d(i12), obj, Long.valueOf(s2Var.g()));
                            b(obj, iS, iA);
                            break;
                        case 57:
                            x3.a(d(i12), obj, Integer.valueOf(s2Var.q()));
                            b(obj, iS, iA);
                            break;
                        case 58:
                            x3.a(d(i12), obj, Boolean.valueOf(s2Var.r()));
                            b(obj, iS, iA);
                            break;
                        case 59:
                            if ((i12 & 536870912) != 0) {
                                x3.a(i12 & 1048575, obj, s2Var.p());
                            } else if (this.f18208g) {
                                x3.a(i12 & 1048575, obj, s2Var.n());
                            } else {
                                x3.a(i12 & 1048575, obj, s2Var.a());
                            }
                            b(obj, iS, iA);
                            break;
                        case 60:
                            if (a(obj, iS, iA)) {
                                x3.a(d(i12), obj, l1.a(x3.e(obj, d(i12)), s2Var.b(c(iA), h0Var)));
                            } else {
                                x3.a(d(i12), obj, s2Var.b(c(iA), h0Var));
                                b(iA, obj);
                            }
                            b(obj, iS, iA);
                            break;
                        case 61:
                            x3.a(d(i12), obj, s2Var.a());
                            b(obj, iS, iA);
                            break;
                        case 62:
                            x3.a(d(i12), obj, Integer.valueOf(s2Var.c()));
                            b(obj, iS, iA);
                            break;
                        case 63:
                            int iB2 = s2Var.b();
                            a(iA);
                            x3.a(d(i12), obj, Integer.valueOf(iB2));
                            b(obj, iS, iA);
                            break;
                        case 64:
                            x3.a(d(i12), obj, Integer.valueOf(s2Var.m()));
                            b(obj, iS, iA);
                            break;
                        case 65:
                            x3.a(d(i12), obj, Long.valueOf(s2Var.t()));
                            b(obj, iS, iA);
                            break;
                        case 66:
                            x3.a(d(i12), obj, Integer.valueOf(s2Var.j()));
                            b(obj, iS, iA);
                            break;
                        case 67:
                            x3.a(d(i12), obj, Long.valueOf(s2Var.l()));
                            b(obj, iS, iA);
                            break;
                        case 68:
                            x3.a(d(i12), obj, s2Var.a(c(iA), h0Var));
                            b(obj, iS, iA);
                            break;
                        default:
                            if (objB == null) {
                                try {
                                    o3Var.getClass();
                                    objB = new n3();
                                } catch (m1 unused) {
                                    o3Var.getClass();
                                    if (objB == null) {
                                        z0 z0Var2 = (z0) obj;
                                        n3 n3Var2 = z0Var2.unknownFields;
                                        if (n3Var2 == n3.f18245f) {
                                            n3Var2 = new n3();
                                            z0Var2.unknownFields = n3Var2;
                                        }
                                        objB = n3Var2;
                                    }
                                    if (!o3.a(objB, s2Var)) {
                                        for (int i13 = this.f18211j; i13 < this.f18212k; i13++) {
                                            objB = b(this.f18210i[i13], obj, objB);
                                        }
                                        if (objB != null) {
                                            o3.a(obj, objB);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                break;
                            }
                            o3Var.getClass();
                            if (!o3.a(objB, s2Var)) {
                                for (int i14 = this.f18211j; i14 < this.f18212k; i14++) {
                                    objB = b(this.f18210i[i14], obj, objB);
                                }
                                if (objB != null) {
                                    o3.a(obj, objB);
                                    return;
                                }
                                return;
                            }
                            break;
                            break;
                    }
                }
            } catch (Throwable th2) {
                for (int i15 = this.f18211j; i15 < this.f18212k; i15++) {
                    objB = b(this.f18210i[i15], obj, objB);
                }
                if (objB != null) {
                    o3Var.getClass();
                    o3.a(obj, objB);
                }
                throw th2;
            }
        }
    }

    public final Object b(int i10) {
        return this.f18203b[(i10 / 3) * 2];
    }

    public final Object b(int i10, Object obj, Object obj2) {
        int[] iArr = this.f18202a;
        int i11 = iArr[i10];
        if (x3.e(obj, iArr[i10 + 1] & 1048575) == null) {
            return obj2;
        }
        a(i10);
        return obj2;
    }

    public final void b(int i10, Object obj) {
        int i11 = this.f18202a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        x3.a(obj, j10, (1 << (i11 >>> 20)) | x3.c(obj, j10));
    }

    public final void b(Object obj, int i10, int i11) {
        x3.a(obj, this.f18202a[i11 + 2] & 1048575, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int a(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, long j10, int i15, long j11, f fVar) throws n1 {
        int iD;
        int i16;
        int iA = i10;
        Unsafe unsafe = f18201r;
        k1 k1VarB = (k1) unsafe.getObject(obj, j11);
        if (!((c) k1VarB).f18157a) {
            int size = k1VarB.size();
            k1VarB = k1VarB.b(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j11, k1VarB);
        }
        switch (i15) {
            case 18:
            case 35:
                if (i13 == 2) {
                    d0 d0Var = (d0) k1VarB;
                    int iD2 = g.d(bArr, iA, fVar);
                    int i17 = fVar.f18180a + iD2;
                    while (iD2 < i17) {
                        d0Var.a(Double.longBitsToDouble(g.b(iD2, bArr)));
                        iD2 += 8;
                    }
                    if (iD2 == i17) {
                        return iD2;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i13 == 1) {
                    d0 d0Var2 = (d0) k1VarB;
                    d0Var2.a(Double.longBitsToDouble(g.b(iA, bArr)));
                    while (true) {
                        int i18 = iA + 8;
                        if (i18 >= i11) {
                            return i18;
                        }
                        iA = i18 + 1;
                        byte b10 = bArr[i18];
                        if (b10 >= 0) {
                            fVar.f18180a = b10;
                        } else {
                            iA = g.a(b10, bArr, iA, fVar);
                        }
                        if (i12 != fVar.f18180a) {
                            return i18;
                        }
                        d0Var2.a(Double.longBitsToDouble(g.b(iA, bArr)));
                    }
                }
                return iA;
            case 19:
            case 36:
                if (i13 == 2) {
                    q0 q0Var = (q0) k1VarB;
                    int iD3 = g.d(bArr, iA, fVar);
                    int i19 = fVar.f18180a + iD3;
                    while (iD3 < i19) {
                        q0Var.a(Float.intBitsToFloat(g.a(iD3, bArr)));
                        iD3 += 4;
                    }
                    if (iD3 == i19) {
                        return iD3;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i13 == 5) {
                    q0 q0Var2 = (q0) k1VarB;
                    q0Var2.a(Float.intBitsToFloat(g.a(iA, bArr)));
                    while (true) {
                        int i20 = iA + 4;
                        if (i20 >= i11) {
                            return i20;
                        }
                        iA = i20 + 1;
                        byte b11 = bArr[i20];
                        if (b11 >= 0) {
                            fVar.f18180a = b11;
                        } else {
                            iA = g.a(b11, bArr, iA, fVar);
                        }
                        if (i12 != fVar.f18180a) {
                            return i20;
                        }
                        q0Var2.a(Float.intBitsToFloat(g.a(iA, bArr)));
                    }
                }
                return iA;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i13 == 2) {
                    u1 u1Var = (u1) k1VarB;
                    int iD4 = g.d(bArr, iA, fVar);
                    int i21 = fVar.f18180a + iD4;
                    while (iD4 < i21) {
                        iD4 = g.e(bArr, iD4, fVar);
                        u1Var.a(fVar.f18181b);
                    }
                    if (iD4 == i21) {
                        return iD4;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i13 == 0) {
                    u1 u1Var2 = (u1) k1VarB;
                    int iE = g.e(bArr, iA, fVar);
                    u1Var2.a(fVar.f18181b);
                    while (iE < i11) {
                        int iA2 = iE + 1;
                        byte b12 = bArr[iE];
                        if (b12 >= 0) {
                            fVar.f18180a = b12;
                        } else {
                            iA2 = g.a(b12, bArr, iA2, fVar);
                        }
                        if (i12 != fVar.f18180a) {
                            return iE;
                        }
                        iE = g.e(bArr, iA2, fVar);
                        u1Var2.a(fVar.f18181b);
                    }
                    return iE;
                }
                return iA;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i13 == 2) {
                    return g.a(bArr, iA, k1VarB, fVar);
                }
                if (i13 == 0) {
                    return g.c(i12, bArr, i10, i11, k1VarB, fVar);
                }
                return iA;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i13 == 2) {
                    u1 u1Var3 = (u1) k1VarB;
                    int iD5 = g.d(bArr, iA, fVar);
                    int i22 = fVar.f18180a + iD5;
                    while (iD5 < i22) {
                        u1Var3.a(g.b(iD5, bArr));
                        iD5 += 8;
                    }
                    if (iD5 == i22) {
                        return iD5;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i13 == 1) {
                    u1 u1Var4 = (u1) k1VarB;
                    u1Var4.a(g.b(iA, bArr));
                    while (true) {
                        int i23 = iA + 8;
                        if (i23 >= i11) {
                            return i23;
                        }
                        iA = i23 + 1;
                        byte b13 = bArr[i23];
                        if (b13 >= 0) {
                            fVar.f18180a = b13;
                        } else {
                            iA = g.a(b13, bArr, iA, fVar);
                        }
                        if (i12 != fVar.f18180a) {
                            return i23;
                        }
                        u1Var4.a(g.b(iA, bArr));
                    }
                }
                return iA;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i13 == 2) {
                    a1 a1Var = (a1) k1VarB;
                    int iD6 = g.d(bArr, iA, fVar);
                    int i24 = fVar.f18180a + iD6;
                    while (iD6 < i24) {
                        a1Var.c(g.a(iD6, bArr));
                        iD6 += 4;
                    }
                    if (iD6 == i24) {
                        return iD6;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i13 == 5) {
                    a1 a1Var2 = (a1) k1VarB;
                    a1Var2.c(g.a(iA, bArr));
                    while (true) {
                        int i25 = iA + 4;
                        if (i25 >= i11) {
                            return i25;
                        }
                        iA = i25 + 1;
                        byte b14 = bArr[i25];
                        if (b14 >= 0) {
                            fVar.f18180a = b14;
                        } else {
                            iA = g.a(b14, bArr, iA, fVar);
                        }
                        if (i12 != fVar.f18180a) {
                            return i25;
                        }
                        a1Var2.c(g.a(iA, bArr));
                    }
                }
                return iA;
            case 25:
            case 42:
                if (i13 == 2) {
                    j jVar = (j) k1VarB;
                    iD = g.d(bArr, iA, fVar);
                    int i26 = fVar.f18180a + iD;
                    while (iD < i26) {
                        iD = g.e(bArr, iD, fVar);
                        jVar.a(fVar.f18181b != 0);
                    }
                    if (iD != i26) {
                        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    return iD;
                }
                if (i13 == 0) {
                    j jVar2 = (j) k1VarB;
                    iA = g.e(bArr, iA, fVar);
                    jVar2.a(fVar.f18181b != 0);
                    while (iA < i11) {
                        int iA3 = iA + 1;
                        byte b15 = bArr[iA];
                        if (b15 >= 0) {
                            fVar.f18180a = b15;
                        } else {
                            iA3 = g.a(b15, bArr, iA3, fVar);
                        }
                        if (i12 == fVar.f18180a) {
                            iA = g.e(bArr, iA3, fVar);
                            jVar2.a(fVar.f18181b != 0);
                        }
                    }
                }
                return iA;
            case 26:
                if (i13 == 2) {
                    if ((j10 & 536870912) == 0) {
                        return g.a(i12, bArr, i10, i11, k1VarB, fVar);
                    }
                    return g.b(i12, bArr, i10, i11, k1VarB, fVar);
                }
                return iA;
            case 27:
                if (i13 == 2) {
                    t2 t2VarC = c(i14);
                    iA = g.a(t2VarC, bArr, iA, i11, fVar);
                    k1VarB.add(fVar.f18182c);
                    while (iA < i11) {
                        int iA4 = iA + 1;
                        byte b16 = bArr[iA];
                        if (b16 >= 0) {
                            fVar.f18180a = b16;
                        } else {
                            iA4 = g.a(b16, bArr, iA4, fVar);
                        }
                        if (i12 == fVar.f18180a) {
                            iA = g.a(t2VarC, bArr, iA4, i11, fVar);
                            k1VarB.add(fVar.f18182c);
                        }
                    }
                }
                return iA;
            case 28:
                if (i13 == 2) {
                    int iD7 = g.d(bArr, iA, fVar);
                    int i27 = fVar.f18180a;
                    if (i27 >= 0) {
                        if (i27 > bArr.length - iD7) {
                            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                        if (i27 == 0) {
                            k1VarB.add(s.f18274b);
                            i16 = iD7;
                        } else {
                            i16 = iD7 + i27;
                            s.a(iD7, i16, bArr.length);
                            k1VarB.add(new q(s.f18275c.a(bArr, iD7, i27)));
                        }
                        while (i16 < i11) {
                            int iA5 = i16 + 1;
                            byte b17 = bArr[i16];
                            if (b17 >= 0) {
                                fVar.f18180a = b17;
                            } else {
                                iA5 = g.a(b17, bArr, iA5, fVar);
                            }
                            if (i12 != fVar.f18180a) {
                                return i16;
                            }
                            int iA6 = iA5 + 1;
                            byte b18 = bArr[iA5];
                            if (b18 >= 0) {
                                fVar.f18180a = b18;
                            } else {
                                iA6 = g.a(b18, bArr, iA6, fVar);
                            }
                            int i28 = fVar.f18180a;
                            if (i28 >= 0) {
                                if (i28 > bArr.length - iA6) {
                                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                }
                                if (i28 == 0) {
                                    k1VarB.add(s.f18274b);
                                    i16 = iA6;
                                } else {
                                    i16 = iA6 + i28;
                                    s.a(iA6, i16, bArr.length);
                                    k1VarB.add(new q(s.f18275c.a(bArr, iA6, i28)));
                                }
                            } else {
                                throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                            }
                        }
                        return i16;
                    }
                    throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                return iA;
            case 30:
            case 44:
                if (i13 != 2) {
                    if (i13 == 0) {
                        iD = g.c(i12, bArr, i10, i11, k1VarB, fVar);
                    }
                    return iA;
                }
                iD = g.a(bArr, iA, k1VarB, fVar);
                z0 z0Var = (z0) obj;
                n3 n3Var = z0Var.unknownFields;
                if (n3Var == n3.f18245f) {
                    n3Var = null;
                }
                a(i14);
                Class cls = u2.f18301a;
                if (n3Var != null) {
                    z0Var.unknownFields = n3Var;
                }
                return iD;
            case 33:
            case 47:
                if (i13 == 2) {
                    a1 a1Var3 = (a1) k1VarB;
                    int iD8 = g.d(bArr, iA, fVar);
                    int i29 = fVar.f18180a + iD8;
                    while (iD8 < i29) {
                        int i30 = iD8 + 1;
                        byte b19 = bArr[iD8];
                        if (b19 >= 0) {
                            fVar.f18180a = b19;
                            iD8 = i30;
                        } else {
                            iD8 = g.a(b19, bArr, i30, fVar);
                        }
                        a1Var3.c(w.b(fVar.f18180a));
                    }
                    if (iD8 == i29) {
                        return iD8;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i13 == 0) {
                    a1 a1Var4 = (a1) k1VarB;
                    int iD9 = g.d(bArr, iA, fVar);
                    a1Var4.c(w.b(fVar.f18180a));
                    while (iD9 < i11) {
                        int iA7 = iD9 + 1;
                        byte b20 = bArr[iD9];
                        if (b20 >= 0) {
                            fVar.f18180a = b20;
                        } else {
                            iA7 = g.a(b20, bArr, iA7, fVar);
                        }
                        if (i12 != fVar.f18180a) {
                            return iD9;
                        }
                        iD9 = iA7 + 1;
                        byte b21 = bArr[iA7];
                        if (b21 >= 0) {
                            fVar.f18180a = b21;
                        } else {
                            iD9 = g.a(b21, bArr, iD9, fVar);
                        }
                        a1Var4.c(w.b(fVar.f18180a));
                    }
                    return iD9;
                }
                return iA;
            case 34:
            case 48:
                if (i13 == 2) {
                    u1 u1Var5 = (u1) k1VarB;
                    int iD10 = g.d(bArr, iA, fVar);
                    int i31 = fVar.f18180a + iD10;
                    while (iD10 < i31) {
                        iD10 = g.e(bArr, iD10, fVar);
                        u1Var5.a(w.a(fVar.f18181b));
                    }
                    if (iD10 == i31) {
                        return iD10;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i13 == 0) {
                    u1 u1Var6 = (u1) k1VarB;
                    int iE2 = g.e(bArr, iA, fVar);
                    u1Var6.a(w.a(fVar.f18181b));
                    while (iE2 < i11) {
                        int iA8 = iE2 + 1;
                        byte b22 = bArr[iE2];
                        if (b22 >= 0) {
                            fVar.f18180a = b22;
                        } else {
                            iA8 = g.a(b22, bArr, iA8, fVar);
                        }
                        if (i12 != fVar.f18180a) {
                            return iE2;
                        }
                        iE2 = g.e(bArr, iA8, fVar);
                        u1Var6.a(w.a(fVar.f18181b));
                    }
                    return iE2;
                }
                return iA;
            case 49:
                if (i13 == 3) {
                    t2 t2VarC2 = c(i14);
                    int i32 = (i12 & (-8)) | 4;
                    iA = g.a(t2VarC2, bArr, i10, i11, i32, fVar);
                    k1VarB.add(fVar.f18182c);
                    while (iA < i11) {
                        int iD11 = g.d(bArr, iA, fVar);
                        if (i12 == fVar.f18180a) {
                            iA = g.a(t2VarC2, bArr, iD11, i11, i32, fVar);
                            k1VarB.add(fVar.f18182c);
                        }
                    }
                }
                return iA;
            default:
                return iA;
        }
    }

    public final int a(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, f fVar) throws n1 {
        Unsafe unsafe = f18201r;
        long j11 = this.f18202a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(g.b(i10, bArr))));
                int i18 = i10 + 8;
                unsafe.putInt(obj, j11, i13);
                return i18;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(g.a(i10, bArr))));
                int i19 = i10 + 4;
                unsafe.putInt(obj, j11, i13);
                return i19;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iE = g.e(bArr, i10, fVar);
                unsafe.putObject(obj, j10, Long.valueOf(fVar.f18181b));
                unsafe.putInt(obj, j11, i13);
                return iE;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iD = g.d(bArr, i10, fVar);
                unsafe.putObject(obj, j10, Integer.valueOf(fVar.f18180a));
                unsafe.putInt(obj, j11, i13);
                return iD;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Long.valueOf(g.b(i10, bArr)));
                int i20 = i10 + 8;
                unsafe.putInt(obj, j11, i13);
                return i20;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(g.a(i10, bArr)));
                int i21 = i10 + 4;
                unsafe.putInt(obj, j11, i13);
                return i21;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iE2 = g.e(bArr, i10, fVar);
                unsafe.putObject(obj, j10, Boolean.valueOf(fVar.f18181b != 0));
                unsafe.putInt(obj, j11, i13);
                return iE2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iD2 = g.d(bArr, i10, fVar);
                int i22 = fVar.f18180a;
                if (i22 == 0) {
                    unsafe.putObject(obj, j10, "");
                } else {
                    if ((i15 & 536870912) != 0) {
                        if (!d4.f18169a.b(bArr, iD2, iD2 + i22)) {
                            throw new n1("Protocol message had invalid UTF-8.");
                        }
                    }
                    unsafe.putObject(obj, j10, new String(bArr, iD2, i22, l1.f18232a));
                    iD2 += i22;
                }
                unsafe.putInt(obj, j11, i13);
                return iD2;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                int iA = g.a(c(i17), bArr, i10, i11, fVar);
                Object object = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                if (object == null) {
                    unsafe.putObject(obj, j10, fVar.f18182c);
                } else {
                    unsafe.putObject(obj, j10, l1.a(object, fVar.f18182c));
                }
                unsafe.putInt(obj, j11, i13);
                return iA;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iA2 = g.a(bArr, i10, fVar);
                unsafe.putObject(obj, j10, fVar.f18182c);
                unsafe.putInt(obj, j11, i13);
                return iA2;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iD3 = g.d(bArr, i10, fVar);
                int i23 = fVar.f18180a;
                a(i17);
                unsafe.putObject(obj, j10, Integer.valueOf(i23));
                unsafe.putInt(obj, j11, i13);
                return iD3;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int iD4 = g.d(bArr, i10, fVar);
                unsafe.putObject(obj, j10, Integer.valueOf(w.b(fVar.f18180a)));
                unsafe.putInt(obj, j11, i13);
                return iD4;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iE3 = g.e(bArr, i10, fVar);
                unsafe.putObject(obj, j10, Long.valueOf(w.a(fVar.f18181b)));
                unsafe.putInt(obj, j11, i13);
                return iE3;
            case 68:
                if (i14 != 3) {
                    return i10;
                }
                int iA3 = g.a(c(i17), bArr, i10, i11, (i12 & (-8)) | 4, fVar);
                Object object2 = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                if (object2 == null) {
                    unsafe.putObject(obj, j10, fVar.f18182c);
                } else {
                    unsafe.putObject(obj, j10, l1.a(object2, fVar.f18182c));
                }
                unsafe.putInt(obj, j11, i13);
                return iA3;
            default:
                return i10;
        }
    }

    public final void a(int i10) {
        if (this.f18203b[((i10 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 23841. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int a(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, com.fyber.inneractive.sdk.protobuf.f r38) throws com.fyber.inneractive.sdk.protobuf.n1 {
        /*
            Method dump skipped, instruction units count: 2384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.i2.a(java.lang.Object, byte[], int, int, int, com.fyber.inneractive.sdk.protobuf.f):int");
    }

    /* JADX WARN: Code duplicated, block: B:149:0x0395 A[PHI: r0 r15 r17 r18 r19 r27 r28 r29
  0x0395: PHI (r0v74 int) = (r0v69 int), (r0v78 int) binds: [B:148:0x0393, B:131:0x02fc] A[DONT_GENERATE, DONT_INLINE]
  0x0395: PHI (r15v9 java.lang.Object) = (r15v7 java.lang.Object), (r15v12 java.lang.Object) binds: [B:148:0x0393, B:131:0x02fc] A[DONT_GENERATE, DONT_INLINE]
  0x0395: PHI (r17v6 int) = (r17v5 int), (r17v9 int) binds: [B:148:0x0393, B:131:0x02fc] A[DONT_GENERATE, DONT_INLINE]
  0x0395: PHI (r18v6 int) = (r18v5 int), (r18v8 int) binds: [B:148:0x0393, B:131:0x02fc] A[DONT_GENERATE, DONT_INLINE]
  0x0395: PHI (r19v6 int) = (r19v5 int), (r19v8 int) binds: [B:148:0x0393, B:131:0x02fc] A[DONT_GENERATE, DONT_INLINE]
  0x0395: PHI (r27v5 int) = (r27v4 int), (r27v7 int) binds: [B:148:0x0393, B:131:0x02fc] A[DONT_GENERATE, DONT_INLINE]
  0x0395: PHI (r28v1 int) = (r28v0 int), (r28v3 int) binds: [B:148:0x0393, B:131:0x02fc] A[DONT_GENERATE, DONT_INLINE]
  0x0395: PHI (r29v8 sun.misc.Unsafe) = (r29v7 sun.misc.Unsafe), (r29v10 sun.misc.Unsafe) binds: [B:148:0x0393, B:131:0x02fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:150:0x03aa A[PHI: r0 r15 r17 r18 r19 r27 r28 r29
  0x03aa: PHI (r0v75 int) = (r0v69 int), (r0v78 int) binds: [B:148:0x0393, B:131:0x02fc] A[DONT_GENERATE, DONT_INLINE]
  0x03aa: PHI (r15v10 java.lang.Object) = (r15v7 java.lang.Object), (r15v12 java.lang.Object) binds: [B:148:0x0393, B:131:0x02fc] A[DONT_GENERATE, DONT_INLINE]
  0x03aa: PHI (r17v7 int) = (r17v5 int), (r17v9 int) binds: [B:148:0x0393, B:131:0x02fc] A[DONT_GENERATE, DONT_INLINE]
  0x03aa: PHI (r18v7 int) = (r18v5 int), (r18v8 int) binds: [B:148:0x0393, B:131:0x02fc] A[DONT_GENERATE, DONT_INLINE]
  0x03aa: PHI (r19v7 int) = (r19v5 int), (r19v8 int) binds: [B:148:0x0393, B:131:0x02fc] A[DONT_GENERATE, DONT_INLINE]
  0x03aa: PHI (r27v6 int) = (r27v4 int), (r27v7 int) binds: [B:148:0x0393, B:131:0x02fc] A[DONT_GENERATE, DONT_INLINE]
  0x03aa: PHI (r28v2 int) = (r28v0 int), (r28v3 int) binds: [B:148:0x0393, B:131:0x02fc] A[DONT_GENERATE, DONT_INLINE]
  0x03aa: PHI (r29v9 sun.misc.Unsafe) = (r29v7 sun.misc.Unsafe), (r29v10 sun.misc.Unsafe) binds: [B:148:0x0393, B:131:0x02fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x009f. Please report as an issue. */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(Object obj, byte[] bArr, int i10, int i11, f fVar) throws n1 {
        int iA;
        int i12;
        int i13;
        int i14;
        boolean z10;
        int i15;
        int i16;
        int i17;
        Unsafe unsafe;
        int i18;
        int i19;
        int i20;
        int iE;
        int iC;
        int i21;
        boolean z11;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z12;
        this = this;
        Object obj2 = obj;
        bArr = bArr;
        i11 = i11;
        fVar = fVar;
        if (this.f18209h) {
            Unsafe unsafe2 = f18201r;
            int i26 = -1;
            int i27 = 0;
            int iA2 = i10;
            int i28 = -1;
            int i29 = 0;
            int i30 = 0;
            int i31 = 1048575;
            while (iA2 < i11) {
                int iA3 = iA2 + 1;
                int i32 = bArr[iA2];
                if (i32 < 0) {
                    iA3 = g.a(i32, bArr, iA3, fVar);
                    i32 = fVar.f18180a;
                }
                int i33 = i32;
                int i34 = (i33 == true ? 1 : 0) >>> 3;
                int i35 = (i33 == true ? 1 : 0) & 7;
                if (i34 > i28) {
                    int i36 = i29 / 3;
                    if (i34 < this.f18204c || i34 > this.f18205d) {
                        i12 = i26;
                    } else {
                        iA = this.a(i34, i36);
                        i12 = iA;
                    }
                } else if (i34 < this.f18204c || i34 > this.f18205d) {
                    i12 = i26;
                } else {
                    iA = this.a(i34, i27);
                    i12 = iA;
                }
                if (i12 == i26) {
                    i13 = i34;
                    i14 = iA3;
                    z10 = i33 == true ? 1 : 0;
                    i15 = i30;
                    i16 = i26;
                    i17 = i27;
                    unsafe = unsafe2;
                } else {
                    int[] iArr = this.f18202a;
                    int i37 = iArr[i12 + 1];
                    int i38 = (i37 & 267386880) >>> 20;
                    int i39 = iA3;
                    int i40 = i33 == true ? 1 : 0;
                    long j10 = i37 & 1048575;
                    if (i38 <= 17) {
                        int i41 = iArr[i12 + 2];
                        int i42 = 1 << (i41 >>> 20);
                        int i43 = i41 & 1048575;
                        if (i43 != i31) {
                            if (i31 != 1048575) {
                                unsafe2.putInt(obj2, i31, i30);
                            }
                            if (i43 != 1048575) {
                                i30 = unsafe2.getInt(obj2, i43);
                            }
                            i18 = i43;
                        } else {
                            i18 = i31;
                        }
                        int i44 = i30;
                        switch (i38) {
                            case 0:
                                i13 = i34;
                                i27 = i12;
                                i19 = i39;
                                if (i35 == 1) {
                                    i20 = i19;
                                    x3.f18340c.a(obj, j10, Double.longBitsToDouble(g.b(i19, bArr)));
                                    iE = i20 + 8;
                                    i30 = i44 | i42;
                                    iA2 = iE;
                                    i31 = i18;
                                    i29 = i27;
                                    unsafe = unsafe2;
                                    i16 = -1;
                                    i17 = 0;
                                }
                                i21 = i19;
                                i15 = i44;
                                i14 = i21;
                                i31 = i18;
                                unsafe = unsafe2;
                                z10 = i40 == true ? 1 : 0;
                                i16 = -1;
                                i17 = 0;
                                break;
                            case 1:
                                i13 = i34;
                                i27 = i12;
                                i19 = i39;
                                if (i35 == 5) {
                                    x3.f18340c.a(obj2, j10, Float.intBitsToFloat(g.a(i19, bArr)));
                                    iE = i19 + 4;
                                    i30 = i44 | i42;
                                    iA2 = iE;
                                    i31 = i18;
                                    i29 = i27;
                                    unsafe = unsafe2;
                                    i16 = -1;
                                    i17 = 0;
                                }
                                i21 = i19;
                                i15 = i44;
                                i14 = i21;
                                i31 = i18;
                                unsafe = unsafe2;
                                z10 = i40 == true ? 1 : 0;
                                i16 = -1;
                                i17 = 0;
                                break;
                            case 2:
                            case 3:
                                i13 = i34;
                                i27 = i12;
                                i19 = i39;
                                if (i35 == 0) {
                                    iE = g.e(bArr, i19, fVar);
                                    unsafe2.putLong(obj, j10, fVar.f18181b);
                                    i30 = i44 | i42;
                                    iA2 = iE;
                                    i31 = i18;
                                    i29 = i27;
                                    unsafe = unsafe2;
                                    i16 = -1;
                                    i17 = 0;
                                }
                                i21 = i19;
                                i15 = i44;
                                i14 = i21;
                                i31 = i18;
                                unsafe = unsafe2;
                                z10 = i40 == true ? 1 : 0;
                                i16 = -1;
                                i17 = 0;
                                break;
                            case 4:
                            case 11:
                                i13 = i34;
                                i27 = i12;
                                i19 = i39;
                                if (i35 == 0) {
                                    int iA4 = i19 + 1;
                                    int i45 = bArr[i19];
                                    if (i45 >= 0) {
                                        fVar.f18180a = i45;
                                    } else {
                                        iA4 = g.a(i45, bArr, iA4, fVar);
                                    }
                                    iE = iA4;
                                    unsafe2.putInt(obj2, j10, fVar.f18180a);
                                    i30 = i44 | i42;
                                    iA2 = iE;
                                    i31 = i18;
                                    i29 = i27;
                                    unsafe = unsafe2;
                                    i16 = -1;
                                    i17 = 0;
                                }
                                i21 = i19;
                                i15 = i44;
                                i14 = i21;
                                i31 = i18;
                                unsafe = unsafe2;
                                z10 = i40 == true ? 1 : 0;
                                i16 = -1;
                                i17 = 0;
                                break;
                            case 5:
                            case 14:
                                i13 = i34;
                                i27 = i12;
                                i19 = i39;
                                if (i35 == 1) {
                                    i20 = i19;
                                    unsafe2.putLong(obj, j10, g.b(i19, bArr));
                                    iE = i20 + 8;
                                    i30 = i44 | i42;
                                    iA2 = iE;
                                    i31 = i18;
                                    i29 = i27;
                                    unsafe = unsafe2;
                                    i16 = -1;
                                    i17 = 0;
                                }
                                i21 = i19;
                                i15 = i44;
                                i14 = i21;
                                i31 = i18;
                                unsafe = unsafe2;
                                z10 = i40 == true ? 1 : 0;
                                i16 = -1;
                                i17 = 0;
                                break;
                            case 6:
                            case 13:
                                i13 = i34;
                                i27 = i12;
                                i19 = i39;
                                if (i35 == 5) {
                                    unsafe2.putInt(obj2, j10, g.a(i19, bArr));
                                    iE = i19 + 4;
                                    i30 = i44 | i42;
                                    iA2 = iE;
                                    i31 = i18;
                                    i29 = i27;
                                    unsafe = unsafe2;
                                    i16 = -1;
                                    i17 = 0;
                                }
                                i21 = i19;
                                i15 = i44;
                                i14 = i21;
                                i31 = i18;
                                unsafe = unsafe2;
                                z10 = i40 == true ? 1 : 0;
                                i16 = -1;
                                i17 = 0;
                                break;
                            case 7:
                                i13 = i34;
                                i27 = i12;
                                i19 = i39;
                                if (i35 == 0) {
                                    iE = g.e(bArr, i19, fVar);
                                    x3.f18340c.a(obj2, j10, fVar.f18181b != 0);
                                    i30 = i44 | i42;
                                    iA2 = iE;
                                    i31 = i18;
                                    i29 = i27;
                                    unsafe = unsafe2;
                                    i16 = -1;
                                    i17 = 0;
                                }
                                i21 = i19;
                                i15 = i44;
                                i14 = i21;
                                i31 = i18;
                                unsafe = unsafe2;
                                z10 = i40 == true ? 1 : 0;
                                i16 = -1;
                                i17 = 0;
                                break;
                            case 8:
                                i13 = i34;
                                i27 = i12;
                                i19 = i39;
                                if (i35 == 2) {
                                    if ((i37 & 536870912) == 0) {
                                        iC = g.b(bArr, i19, fVar);
                                    } else {
                                        iC = g.c(bArr, i19, fVar);
                                    }
                                    iE = iC;
                                    unsafe2.putObject(obj2, j10, fVar.f18182c);
                                    i30 = i44 | i42;
                                    iA2 = iE;
                                    i31 = i18;
                                    i29 = i27;
                                    unsafe = unsafe2;
                                    i16 = -1;
                                    i17 = 0;
                                }
                                i21 = i19;
                                i15 = i44;
                                i14 = i21;
                                i31 = i18;
                                unsafe = unsafe2;
                                z10 = i40 == true ? 1 : 0;
                                i16 = -1;
                                i17 = 0;
                                break;
                            case 9:
                                i13 = i34;
                                i27 = i12;
                                i19 = i39;
                                if (i35 == 2) {
                                    iE = g.a(this.c(i27), bArr, i19, i11, fVar);
                                    Object object = unsafe2.getObject(obj2, j10);
                                    if (object == null) {
                                        unsafe2.putObject(obj2, j10, fVar.f18182c);
                                    } else {
                                        unsafe2.putObject(obj2, j10, l1.a(object, fVar.f18182c));
                                    }
                                    i30 = i44 | i42;
                                    iA2 = iE;
                                    i31 = i18;
                                    i29 = i27;
                                    unsafe = unsafe2;
                                    i16 = -1;
                                    i17 = 0;
                                }
                                i21 = i19;
                                i15 = i44;
                                i14 = i21;
                                i31 = i18;
                                unsafe = unsafe2;
                                z10 = i40 == true ? 1 : 0;
                                i16 = -1;
                                i17 = 0;
                                break;
                            case 10:
                                i13 = i34;
                                i27 = i12;
                                i19 = i39;
                                if (i35 == 2) {
                                    iE = g.a(bArr, i19, fVar);
                                    unsafe2.putObject(obj2, j10, fVar.f18182c);
                                    i30 = i44 | i42;
                                    iA2 = iE;
                                    i31 = i18;
                                    i29 = i27;
                                    unsafe = unsafe2;
                                    i16 = -1;
                                    i17 = 0;
                                }
                                i21 = i19;
                                i15 = i44;
                                i14 = i21;
                                i31 = i18;
                                unsafe = unsafe2;
                                z10 = i40 == true ? 1 : 0;
                                i16 = -1;
                                i17 = 0;
                                break;
                            case 12:
                                i13 = i34;
                                i27 = i12;
                                i19 = i39;
                                if (i35 == 0) {
                                    int iA5 = i19 + 1;
                                    int i46 = bArr[i19];
                                    if (i46 >= 0) {
                                        fVar.f18180a = i46;
                                    } else {
                                        iA5 = g.a(i46, bArr, iA5, fVar);
                                    }
                                    iE = iA5;
                                    unsafe2.putInt(obj2, j10, fVar.f18180a);
                                    i30 = i44 | i42;
                                    iA2 = iE;
                                    i31 = i18;
                                    i29 = i27;
                                    unsafe = unsafe2;
                                    i16 = -1;
                                    i17 = 0;
                                }
                                i21 = i19;
                                i15 = i44;
                                i14 = i21;
                                i31 = i18;
                                unsafe = unsafe2;
                                z10 = i40 == true ? 1 : 0;
                                i16 = -1;
                                i17 = 0;
                                break;
                            case 15:
                                i13 = i34;
                                i27 = i12;
                                i19 = i39;
                                if (i35 == 0) {
                                    int iA6 = i19 + 1;
                                    int i47 = bArr[i19];
                                    if (i47 >= 0) {
                                        fVar.f18180a = i47;
                                    } else {
                                        iA6 = g.a(i47, bArr, iA6, fVar);
                                    }
                                    iE = iA6;
                                    unsafe2.putInt(obj2, j10, w.b(fVar.f18180a));
                                    i30 = i44 | i42;
                                    iA2 = iE;
                                    i31 = i18;
                                    i29 = i27;
                                    unsafe = unsafe2;
                                    i16 = -1;
                                    i17 = 0;
                                }
                                i21 = i19;
                                i15 = i44;
                                i14 = i21;
                                i31 = i18;
                                unsafe = unsafe2;
                                z10 = i40 == true ? 1 : 0;
                                i16 = -1;
                                i17 = 0;
                                break;
                            case 16:
                                if (i35 != 0) {
                                    i13 = i34;
                                    i27 = i12;
                                    i19 = i39;
                                    i21 = i19;
                                    i15 = i44;
                                    i14 = i21;
                                    i31 = i18;
                                    unsafe = unsafe2;
                                    z10 = i40 == true ? 1 : 0;
                                    i16 = -1;
                                    i17 = 0;
                                } else {
                                    iE = g.e(bArr, i39, fVar);
                                    i27 = i12;
                                    i13 = i34;
                                    unsafe2.putLong(obj, j10, w.a(fVar.f18181b));
                                    i30 = i44 | i42;
                                    iA2 = iE;
                                    i31 = i18;
                                    i29 = i27;
                                    unsafe = unsafe2;
                                    i16 = -1;
                                    i17 = 0;
                                }
                                break;
                            default:
                                i13 = i34;
                                i27 = i12;
                                i21 = i39;
                                i15 = i44;
                                i14 = i21;
                                i31 = i18;
                                unsafe = unsafe2;
                                z10 = i40 == true ? 1 : 0;
                                i16 = -1;
                                i17 = 0;
                                break;
                        }
                        i26 = i16;
                        i27 = i17;
                        i28 = i13;
                        unsafe2 = unsafe;
                    } else {
                        i13 = i34;
                        int i48 = i12;
                        if (i38 != 27) {
                            z11 = i40 == true ? 1 : 0;
                            if (i38 <= 49) {
                                i15 = i30;
                                i22 = i31;
                                i16 = -1;
                                i17 = 0;
                                unsafe = unsafe2;
                                iA2 = a(obj, bArr, i39, i11, z11 ? 1 : 0, i35, i48, i37, i38, j10, fVar);
                                i25 = i48;
                                obj2 = obj;
                                if (iA2 != i39) {
                                    i29 = i25;
                                    i26 = i16;
                                    i27 = i17;
                                    i28 = i13;
                                    i30 = i15;
                                    i31 = i22;
                                } else {
                                    i14 = iA2;
                                    i27 = i25;
                                    i31 = i22;
                                    z10 = z11;
                                }
                            } else {
                                i15 = i30;
                                i22 = i31;
                                i23 = i39;
                                i24 = i48;
                                unsafe = unsafe2;
                                i16 = -1;
                                i17 = 0;
                                if (i38 != 50) {
                                    i25 = i24;
                                    obj2 = obj;
                                    iA2 = a(obj, bArr, i23, i11, z11 ? 1 : 0, i13, i35, i37, i38, j10, i25, fVar);
                                    if (iA2 != i23) {
                                        i29 = i25;
                                        i26 = i16;
                                        i27 = i17;
                                        i28 = i13;
                                        i30 = i15;
                                        i31 = i22;
                                    } else {
                                        i14 = iA2;
                                        i27 = i25;
                                        i31 = i22;
                                        z10 = z11;
                                    }
                                } else if (i35 == 2) {
                                    z12 = z11;
                                    Unsafe unsafe3 = f18201r;
                                    Object objB = b(i24);
                                    Object object2 = unsafe3.getObject(obj, j10);
                                    this.f18217p.getClass();
                                    if (!((y1) object2).f18350a) {
                                        this.f18217p.getClass();
                                        y1 y1Var = y1.f18349b;
                                        y1 y1Var2 = y1Var.isEmpty() ? new y1() : new y1(y1Var);
                                        this.f18217p.getClass();
                                        z1.a(y1Var2, object2);
                                        unsafe3.putObject(obj, j10, y1Var2);
                                    }
                                    this.f18217p.getClass();
                                    objB.getClass();
                                    throw new ClassCastException();
                                }
                            }
                            unsafe2 = unsafe;
                        } else if (i35 == 2) {
                            k1 k1VarB = (k1) unsafe2.getObject(obj2, j10);
                            if (!((c) k1VarB).f18157a) {
                                int size = k1VarB.size();
                                k1VarB = k1VarB.b(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(obj2, j10, k1VarB);
                            }
                            t2 t2VarC = this.c(i48);
                            int iA7 = g.a(t2VarC, bArr, i39, i11, fVar);
                            k1VarB.add(fVar.f18182c);
                            while (iA7 < i11) {
                                int iA8 = iA7 + 1;
                                int i49 = bArr[iA7];
                                if (i49 >= 0) {
                                    fVar.f18180a = i49;
                                } else {
                                    iA8 = g.a(i49, bArr, iA8, fVar);
                                }
                                int i50 = i40;
                                if (i50 != fVar.f18180a) {
                                    iA2 = iA7;
                                    i29 = i48;
                                    i28 = i13;
                                    i26 = -1;
                                    i27 = 0;
                                } else {
                                    iA7 = g.a(t2VarC, bArr, iA8, i11, fVar);
                                    k1VarB.add(fVar.f18182c);
                                    i40 = i50 == true ? 1 : 0;
                                }
                            }
                            iA2 = iA7;
                            i29 = i48;
                            i28 = i13;
                            i26 = -1;
                            i27 = 0;
                        } else {
                            i15 = i30;
                            i22 = i31;
                            i23 = i39;
                            i24 = i48;
                            unsafe = unsafe2;
                            z12 = i40 == true ? 1 : 0;
                            i16 = -1;
                            i17 = 0;
                        }
                        z12 = z11;
                        i14 = i23;
                        i27 = i24;
                        i31 = i22;
                        obj2 = obj;
                        z10 = z12;
                    }
                }
                z0 z0Var = (z0) obj2;
                n3 n3Var = z0Var.unknownFields;
                if (n3Var == n3.f18245f) {
                    n3Var = new n3();
                    z0Var.unknownFields = n3Var;
                }
                iA2 = g.a(z10 ? 1 : 0, bArr, i14, i11, n3Var, fVar);
                i29 = i27;
                i30 = i15;
                i26 = i16;
                i27 = i17;
                i28 = i13;
                unsafe2 = unsafe;
            }
            int i51 = i30;
            Unsafe unsafe4 = unsafe2;
            if (i31 != 1048575) {
                unsafe4.putInt(obj2, i31, i51);
            }
            if (iA2 != i11) {
                throw new n1("Failed to parse the message.");
            }
            return;
        }
        a(obj, bArr, i10, i11, 0, fVar);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cd A[LOOP:1: B:49:0x00bc->B:54:0x00cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0 A[SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final boolean a(Object obj) {
        List list;
        t2 t2VarC;
        int i10;
        boolean zA;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            boolean zA2 = true;
            if (i12 < this.f18211j) {
                int i14 = this.f18210i[i12];
                int[] iArr = this.f18202a;
                int i15 = iArr[i14];
                int i16 = iArr[i14 + 1];
                int i17 = iArr[i14 + 2];
                int i18 = i17 & 1048575;
                int i19 = 1 << (i17 >>> 20);
                if (i18 != i11) {
                    if (i18 != 1048575) {
                        i13 = f18201r.getInt(obj, i18);
                    }
                    i11 = i18;
                }
                if ((268435456 & i16) != 0) {
                    if (i11 == 1048575) {
                        zA = a(i14, obj);
                    } else {
                        zA = (i13 & i19) != 0;
                    }
                    if (!zA) {
                        return false;
                    }
                }
                int i20 = (267386880 & i16) >>> 20;
                if (i20 == 9 || i20 == 17) {
                    if (i11 == 1048575) {
                        zA2 = a(i14, obj);
                    } else if ((i19 & i13) == 0) {
                        zA2 = false;
                    }
                    if (zA2 && !c(i14).a(x3.e(obj, i16 & 1048575))) {
                        return false;
                    }
                } else if (i20 == 27) {
                    list = (List) x3.e(obj, i16 & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        t2VarC = c(i14);
                        for (i10 = 0; i10 < list.size(); i10++) {
                            if (!t2VarC.a(list.get(i10))) {
                                return false;
                            }
                        }
                    }
                } else if (i20 == 60 || i20 == 68) {
                    if (a(obj, i15, i14) && !c(i14).a(x3.e(obj, i16 & 1048575))) {
                        return false;
                    }
                } else if (i20 == 49) {
                    list = (List) x3.e(obj, i16 & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        t2VarC = c(i14);
                        while (i10 < list.size()) {
                            if (!t2VarC.a(list.get(i10))) {
                                return false;
                            }
                        }
                    }
                } else if (i20 != 50) {
                    continue;
                } else {
                    z1 z1Var = this.f18217p;
                    Object objE = x3.e(obj, i16 & 1048575);
                    z1Var.getClass();
                    if (!((y1) objE).isEmpty()) {
                        Object objB = b(i14);
                        this.f18217p.getClass();
                        objB.getClass();
                        throw new ClassCastException();
                    }
                }
                i12++;
            } else {
                if (this.f18207f) {
                    this.f18216o.getClass();
                    if (!((GeneratedMessageLite$ExtendableMessage) obj).extensions.c()) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    public static void a(int i10, Object obj, c0 c0Var) {
        if (obj instanceof String) {
            c0Var.f18158a.a((String) obj, i10);
        } else {
            c0Var.f18158a.a(i10, (s) obj);
        }
    }

    public final void a(Object obj, int i10, s2 s2Var) {
        if ((536870912 & i10) != 0) {
            s2Var.b(this.f18214m.b(obj, i10 & 1048575));
        } else {
            s2Var.q(this.f18214m.b(obj, i10 & 1048575));
        }
    }

    public final void a(Object obj, int i10, s2 s2Var, t2 t2Var, h0 h0Var) {
        s2Var.b(this.f18214m.b(obj, i10 & 1048575), t2Var, h0Var);
    }

    public final void a(Object obj, long j10, s2 s2Var, t2 t2Var, h0 h0Var) {
        s2Var.a(this.f18214m.b(obj, j10), t2Var, h0Var);
    }

    public final boolean a(int i10, Object obj) {
        int[] iArr = this.f18202a;
        int i11 = iArr[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 != 1048575) {
            return ((1 << (i11 >>> 20)) & x3.c(obj, j10)) != 0;
        }
        int i12 = iArr[i10 + 1];
        long j11 = i12 & 1048575;
        switch ((i12 & 267386880) >>> 20) {
            case 0:
                return x3.f18340c.c(obj, j11) != 0.0d;
            case 1:
                return x3.f18340c.d(obj, j11) != 0.0f;
            case 2:
                return x3.d(obj, j11) != 0;
            case 3:
                return x3.d(obj, j11) != 0;
            case 4:
                return x3.c(obj, j11) != 0;
            case 5:
                return x3.d(obj, j11) != 0;
            case 6:
                return x3.c(obj, j11) != 0;
            case 7:
                return x3.f18340c.a(obj, j11);
            case 8:
                Object objE = x3.e(obj, j11);
                if (objE instanceof String) {
                    return !((String) objE).isEmpty();
                }
                if (objE instanceof s) {
                    return !s.f18274b.equals(objE);
                }
                throw new IllegalArgumentException();
            case 9:
                return x3.e(obj, j11) != null;
            case 10:
                return !s.f18274b.equals(x3.e(obj, j11));
            case 11:
                return x3.c(obj, j11) != 0;
            case 12:
                return x3.c(obj, j11) != 0;
            case 13:
                return x3.c(obj, j11) != 0;
            case 14:
                return x3.d(obj, j11) != 0;
            case 15:
                return x3.c(obj, j11) != 0;
            case 16:
                return x3.d(obj, j11) != 0;
            case 17:
                return x3.e(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean a(Object obj, int i10, int i11) {
        return x3.c(obj, (long) (this.f18202a[i11 + 2] & 1048575)) == i10;
    }

    public final boolean a(int i10, Object obj, Object obj2) {
        return a(i10, obj) == a(i10, obj2);
    }

    public final int a(int i10, int i11) {
        int length = (this.f18202a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f18202a[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }
}
