package yads;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import yads.ef0;
import yads.h73;
import yads.hf0;
import yads.if0;
import yads.mx0;
import yads.xe0;

/* JADX INFO: loaded from: classes8.dex */
public final class if0 extends mi1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final sa2 f78613i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final sa2 f78614j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f78615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final np0 f78616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f78617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final af0 f78618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final df0 f78619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public pk f78620h;

    public if0(Context context, af0 af0Var, dc dcVar) {
        this(af0Var, dcVar, context);
    }

    public static void a(i73 i73Var, af0 af0Var, HashMap map) {
        o73 o73Var;
        for (int i10 = 0; i10 < i73Var.f78514b; i10++) {
            o73 o73Var2 = (o73) af0Var.f81766z.get(i73Var.a(i10));
            if (o73Var2 != null && ((o73Var = (o73) map.get(Integer.valueOf(o73Var2.f80958b.f78089d))) == null || (o73Var.f80959c.isEmpty() && !o73Var2.f80959c.isEmpty()))) {
                map.put(Integer.valueOf(o73Var2.f80958b.f78089d), o73Var2);
            }
        }
    }

    public static boolean a(boolean z10, int i10) {
        int i11 = i10 & 7;
        return i11 == 4 || (z10 && i11 == 3);
    }

    public static /* synthetic */ int b(Integer num, Integer num2) {
        return 0;
    }

    public final void b() {
        boolean z10;
        r73 r73Var;
        df0 df0Var;
        synchronized (this.f78615c) {
            z10 = this.f78618f.L && !this.f78617e && ib3.f78556a >= 32 && (df0Var = this.f78619g) != null && df0Var.f76661b;
        }
        if (!z10 || (r73Var = this.f82548a) == null) {
            return;
        }
        ((go0) r73Var).f77880i.f78499a.sendEmptyMessage(10);
    }

    static {
        Comparator comparator = new Comparator() { // from class: cp.u2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return if0.a((Integer) obj, (Integer) obj2);
            }
        };
        f78613i = comparator instanceof sa2 ? (sa2) comparator : new ey(comparator);
        Comparator comparator2 = new Comparator() { // from class: cp.v2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return if0.b((Integer) obj, (Integer) obj2);
            }
        };
        f78614j = comparator2 instanceof sa2 ? (sa2) comparator2 : new ey(comparator2);
    }

    public if0(af0 af0Var, dc dcVar, Context context) {
        this.f78615c = new Object();
        if (context != null) {
            context.getApplicationContext();
        }
        this.f78616d = dcVar;
        this.f78618f = af0Var;
        this.f78620h = pk.f81431h;
        boolean z10 = context != null && ib3.d(context);
        this.f78617e = z10;
        if (!z10 && context != null && ib3.f78556a >= 32) {
            this.f78619g = df0.a(context);
        }
        if (af0Var.L && context == null) {
            ih1.d("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int a(mx0 mx0Var, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(mx0Var.f80420d)) {
            return 4;
        }
        String strB = b(str);
        String strB2 = b(mx0Var.f80420d);
        if (strB2 == null || strB == null) {
            return (z10 && strB2 == null) ? 1 : 0;
        }
        if (strB2.startsWith(strB) || strB.startsWith(strB2)) {
            return 3;
        }
        int i10 = ib3.f78556a;
        return strB2.split("-", 2)[0].equals(strB.split("-", 2)[0]) ? 2 : 0;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static int a(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    public static int a(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "video/av01":
                return 4;
            case "video/hevc":
                return 3;
            case "video/avc":
                return 1;
            case "video/x-vnd.on2.vp9":
                return 2;
            default:
                return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x005e A[Catch: all -> 0x0085, FALL_THROUGH, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:8:0x000f, B:10:0x0014, B:34:0x0052, B:36:0x0056, B:38:0x005a, B:40:0x005e, B:42:0x0062, B:44:0x0066, B:46:0x006a, B:48:0x0070, B:50:0x0078, B:53:0x0083), top: B:58:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0082  */
    public final boolean a(mx0 mx0Var) {
        boolean z10;
        df0 df0Var;
        df0 df0Var2;
        synchronized (this.f78615c) {
            z10 = false;
            if (!this.f78618f.L || this.f78617e) {
                z10 = true;
            } else {
                if (mx0Var.f80442z > 2) {
                    String str = mx0Var.f80429m;
                    if (str != null) {
                        switch (str) {
                            case "audio/eac3-joc":
                            case "audio/ac3":
                            case "audio/ac4":
                            case "audio/eac3":
                                if (ib3.f78556a < 32 || (df0Var2 = this.f78619g) == null || !df0Var2.f76661b) {
                                    z10 = true;
                                    break;
                                }
                            default:
                                if (ib3.f78556a >= 32) {
                                    z10 = true;
                                    break;
                                }
                                break;
                        }
                    } else if (ib3.f78556a >= 32 && (df0Var = this.f78619g) != null && df0Var.f76661b && df0Var.a() && this.f78619g.b() && this.f78619g.a(mx0Var, this.f78620h)) {
                        z10 = true;
                    }
                } else {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final List a(af0 af0Var, boolean z10, int i10, h73 h73Var, int[] iArr) {
        og2 og2Var = new og2() { // from class: cp.c3
            @Override // yads.og2
            public final boolean apply(Object obj) {
                return this.f51258b.a((mx0) obj);
            }
        };
        m51 m51Var = p51.f81258c;
        kx.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i11 = 0;
        int i12 = 0;
        while (i11 < h73Var.f78087b) {
            xe0 xe0Var = new xe0(i10, h73Var, i11, af0Var, iArr[i11], z10, og2Var);
            int i13 = i12 + 1;
            if (objArrCopyOf.length < i13) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i51.a(objArrCopyOf.length, i13));
            }
            objArrCopyOf[i12] = xe0Var;
            i11++;
            i12 = i13;
        }
        return p51.b(i12, objArrCopyOf);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0039  */
    public static List a(af0 af0Var, int[] iArr, int i10, h73 h73Var, int[] iArr2) {
        int i11;
        int i12;
        int i13;
        int i14;
        Point point;
        int i15 = iArr[i10];
        int i16 = af0Var.f81750j;
        int i17 = af0Var.f81751k;
        boolean z10 = af0Var.f81752l;
        if (i16 == Integer.MAX_VALUE || i17 == Integer.MAX_VALUE) {
            i11 = Integer.MAX_VALUE;
        } else {
            int i18 = Integer.MAX_VALUE;
            for (int i19 = 0; i19 < h73Var.f78087b; i19++) {
                mx0 mx0Var = h73Var.f78090e[i19];
                int i20 = mx0Var.f80434r;
                if (i20 > 0 && (i12 = mx0Var.f80435s) > 0) {
                    if (!z10) {
                        i13 = i16;
                        i14 = i17;
                    } else if ((i20 > i12) != (i16 > i17)) {
                        i14 = i16;
                        i13 = i17;
                    } else {
                        i13 = i16;
                        i14 = i17;
                    }
                    int i21 = i20 * i14;
                    int i22 = i12 * i13;
                    if (i21 >= i22) {
                        int i23 = ib3.f78556a;
                        point = new Point(i13, ((i22 + i20) - 1) / i20);
                    } else {
                        int i24 = ib3.f78556a;
                        point = new Point(((i21 + i12) - 1) / i12, i14);
                    }
                    int i25 = mx0Var.f80434r;
                    int i26 = mx0Var.f80435s;
                    int i27 = i25 * i26;
                    if (i25 >= ((int) (point.x * 0.98f)) && i26 >= ((int) (point.y * 0.98f)) && i27 < i18) {
                        i18 = i27;
                    }
                }
            }
            i11 = i18;
        }
        kx.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i28 = 0;
        int i29 = 0;
        while (i28 < h73Var.f78087b) {
            int iA = h73Var.f78090e[i28].a();
            hf0 hf0Var = new hf0(i10, h73Var, i28, af0Var, iArr2[i28], i15, i11 == Integer.MAX_VALUE || (iA != -1 && iA <= i11));
            int i30 = i29 + 1;
            if (objArrCopyOf.length < i30) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i51.a(objArrCopyOf.length, i30));
            }
            objArrCopyOf[i29] = hf0Var;
            i28++;
            i29 = i30;
        }
        return p51.b(i29, objArrCopyOf);
    }

    public static /* synthetic */ int a(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    @Override // yads.s73
    public final void a() {
        df0 df0Var;
        synchronized (this.f78615c) {
            if (ib3.f78556a >= 32 && (df0Var = this.f78619g) != null) {
                df0Var.c();
            }
        }
        this.f82548a = null;
        this.f82549b = null;
    }

    public final Pair a(li1 li1Var, int[][][] iArr, final af0 af0Var) {
        final boolean z10 = false;
        for (int i10 = 0; i10 < li1Var.f79796a; i10++) {
            if (2 == li1Var.f79797b[i10] && li1Var.f79798c[i10].f78514b > 0) {
                z10 = true;
                break;
            }
        }
        return a(1, li1Var, iArr, new ff0() { // from class: cp.w2
            @Override // yads.ff0
            public final List a(int i11, h73 h73Var, int[] iArr2) {
                return this.f51653a.a(af0Var, z10, i11, h73Var, iArr2);
            }
        }, new Comparator() { // from class: cp.x2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return xe0.a((List) obj, (List) obj2);
            }
        });
    }

    public static Pair a(li1 li1Var, int[][][] iArr, final af0 af0Var, final String str) {
        return a(3, li1Var, iArr, new ff0() { // from class: cp.y2
            @Override // yads.ff0
            public final List a(int i10, h73 h73Var, int[] iArr2) {
                return if0.a(af0Var, str, i10, h73Var, iArr2);
            }
        }, new Comparator() { // from class: cp.z2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ef0.a((List) obj, (List) obj2);
            }
        });
    }

    public static Pair a(int i10, li1 li1Var, int[][][] iArr, ff0 ff0Var, Comparator comparator) {
        int i11;
        RandomAccess randomAccessA;
        li1 li1Var2 = li1Var;
        ArrayList arrayList = new ArrayList();
        int i12 = li1Var2.f79796a;
        int i13 = 0;
        int i14 = 0;
        while (i14 < i12) {
            if (i10 == li1Var2.f79797b[i14]) {
                i73 i73Var = li1Var2.f79798c[i14];
                int i15 = i13;
                while (i15 < i73Var.f78514b) {
                    h73 h73VarA = i73Var.a(i15);
                    List listA = ff0Var.a(i14, h73VarA, iArr[i14][i15]);
                    boolean[] zArr = new boolean[h73VarA.f78087b];
                    int i16 = i13;
                    while (i16 < h73VarA.f78087b) {
                        gf0 gf0Var = (gf0) listA.get(i16);
                        int iA = gf0Var.a();
                        if (zArr[i16] || iA == 0) {
                            i11 = i12;
                        } else {
                            if (iA == 1) {
                                Object[] objArr = new Object[1];
                                objArr[i13] = gf0Var;
                                randomAccessA = p51.a(objArr);
                                i11 = i12;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(gf0Var);
                                int i17 = i16 + 1;
                                while (i17 < h73VarA.f78087b) {
                                    gf0 gf0Var2 = (gf0) listA.get(i17);
                                    int i18 = i12;
                                    if (gf0Var2.a() == 2 && gf0Var.a(gf0Var2)) {
                                        arrayList2.add(gf0Var2);
                                        zArr[i17] = true;
                                    }
                                    i17++;
                                    i12 = i18;
                                }
                                i11 = i12;
                                randomAccessA = arrayList2;
                            }
                            arrayList.add(randomAccessA);
                        }
                        i16++;
                        i12 = i11;
                        i13 = 0;
                    }
                    i15++;
                    i13 = 0;
                }
            }
            i14++;
            li1Var2 = li1Var;
            i12 = i12;
            i13 = 0;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i19 = 0; i19 < list.size(); i19++) {
            iArr2[i19] = ((gf0) list.get(i19)).f77795d;
        }
        gf0 gf0Var3 = (gf0) list.get(0);
        return Pair.create(new mp0(0, gf0Var3.f77794c, iArr2), Integer.valueOf(gf0Var3.f77793b));
    }

    public static Pair a(li1 li1Var, int[][][] iArr, final int[] iArr2, final af0 af0Var) {
        return a(2, li1Var, iArr, new ff0() { // from class: cp.a3
            @Override // yads.ff0
            public final List a(int i10, h73 h73Var, int[] iArr3) {
                return if0.a(af0Var, iArr2, i10, h73Var, iArr3);
            }
        }, new Comparator() { // from class: cp.b3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return hf0.a((List) obj, (List) obj2);
            }
        });
    }

    @Override // yads.s73
    public final void a(pk pkVar) {
        boolean z10;
        synchronized (this.f78615c) {
            z10 = !this.f78620h.equals(pkVar);
            this.f78620h = pkVar;
        }
        if (z10) {
            b();
        }
    }

    public static List a(af0 af0Var, String str, int i10, h73 h73Var, int[] iArr) {
        m51 m51Var = p51.f81258c;
        kx.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i11 = 0;
        int i12 = 0;
        while (i11 < h73Var.f78087b) {
            ef0 ef0Var = new ef0(i10, h73Var, i11, af0Var, iArr[i11], str);
            int i13 = i12 + 1;
            if (objArrCopyOf.length < i13) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i51.a(objArrCopyOf.length, i13));
            }
            objArrCopyOf[i12] = ef0Var;
            i11++;
            i12 = i13;
        }
        return p51.b(i12, objArrCopyOf);
    }
}
