package yads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import yads.s63;
import yads.xq;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s63 implements xq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o63 f82545b = new o63();

    public static s63 a(Bundle bundle) {
        sm2 sm2VarA = a(r63.f82117v, vq.a(bundle, Integer.toString(0, 36)));
        sm2 sm2VarA2 = a(p63.f81265i, vq.a(bundle, Integer.toString(1, 36)));
        int[] intArray = bundle.getIntArray(Integer.toString(2, 36));
        if (intArray == null) {
            int i10 = sm2VarA.f82699e;
            int[] iArr = new int[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                iArr[i11] = i11;
            }
            intArray = iArr;
        }
        return new q63(sm2VarA, sm2VarA2, intArray);
    }

    public abstract int a();

    public abstract int a(Object obj);

    public abstract Object a(int i10);

    public abstract p63 a(int i10, p63 p63Var, boolean z10);

    public abstract r63 a(int i10, r63 r63Var, long j10);

    public abstract int b();

    public int b(boolean z10) {
        if (c()) {
            return -1;
        }
        return b() - 1;
    }

    public final boolean equals(Object obj) {
        int iB;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s63)) {
            return false;
        }
        s63 s63Var = (s63) obj;
        if (s63Var.b() != b() || s63Var.a() != a()) {
            return false;
        }
        r63 r63Var = new r63();
        p63 p63Var = new p63();
        r63 r63Var2 = new r63();
        p63 p63Var2 = new p63();
        for (int i10 = 0; i10 < b(); i10++) {
            if (!a(i10, r63Var, 0L).equals(s63Var.a(i10, r63Var2, 0L))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < a(); i11++) {
            if (!a(i11, p63Var, true).equals(s63Var.a(i11, p63Var2, true))) {
                return false;
            }
        }
        int iA = a(true);
        if (iA != s63Var.a(true) || (iB = b(true)) != s63Var.b(true)) {
            return false;
        }
        while (iA != iB) {
            int iA2 = a(iA, 0, true);
            if (iA2 != s63Var.a(iA, 0, true)) {
                return false;
            }
            iA = iA2;
        }
        return true;
    }

    static {
        new wq() { // from class: cp.u9
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return s63.a(bundle);
            }
        };
    }

    public int b(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == a(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == a(z10) ? b(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public final int hashCode() {
        r63 r63Var = new r63();
        p63 p63Var = new p63();
        int iB = b() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE;
        for (int i10 = 0; i10 < b(); i10++) {
            iB = (iB * 31) + a(i10, r63Var, 0L).hashCode();
        }
        int iA = a() + (iB * 31);
        for (int i11 = 0; i11 < a(); i11++) {
            iA = (iA * 31) + a(i11, p63Var, true).hashCode();
        }
        int iA2 = a(true);
        while (iA2 != -1) {
            iA = (iA * 31) + iA2;
            iA2 = a(iA2, 0, true);
        }
        return iA;
    }

    public final boolean c() {
        if (b() == 0) {
            return true;
        }
        return false;
    }

    public static sm2 a(wq wqVar, IBinder iBinder) {
        int i10;
        if (iBinder == null) {
            m51 m51Var = p51.f81258c;
            return sm2.f82697f;
        }
        kx.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i11 = uq.f83572b;
        m51 m51Var2 = p51.f81258c;
        kx.a(4, "initialCapacity");
        Object[] objArrCopyOf2 = new Object[4];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1;
        while (i15 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i14);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i10 = parcelObtain2.readInt();
                        if (i10 == 1) {
                            Bundle bundle = parcelObtain2.readBundle();
                            bundle.getClass();
                            int i16 = i13 + 1;
                            if (objArrCopyOf2.length < i16) {
                                objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, i51.a(objArrCopyOf2.length, i16));
                            }
                            objArrCopyOf2[i13] = bundle;
                            i14++;
                            i13 = i16;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i15 = i10;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th2) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th2;
            }
        }
        sm2 sm2VarB = p51.b(i13, objArrCopyOf2);
        int i17 = 0;
        while (i12 < sm2VarB.f82699e) {
            xq xqVarFromBundle = wqVar.fromBundle((Bundle) sm2VarB.get(i12));
            xqVarFromBundle.getClass();
            int i18 = i17 + 1;
            if (objArrCopyOf.length < i18) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i51.a(objArrCopyOf.length, i18));
            }
            objArrCopyOf[i17] = xqVarFromBundle;
            i12++;
            i17 = i18;
        }
        return p51.b(i17, objArrCopyOf);
    }

    public int a(boolean z10) {
        return c() ? -1 : 0;
    }

    public final int a(int i10, p63 p63Var, r63 r63Var, int i11, boolean z10) {
        int i12 = a(i10, p63Var, false).f81268d;
        if (a(i12, r63Var, 0L).f82133q != i10) {
            return i10 + 1;
        }
        int iA = a(i12, i11, z10);
        if (iA == -1) {
            return -1;
        }
        return a(iA, r63Var, 0L).f82132p;
    }

    public int a(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == b(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == b(z10) ? a(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public final p63 a(int i10, p63 p63Var) {
        return a(i10, p63Var, false);
    }

    public p63 a(Object obj, p63 p63Var) {
        return a(a(obj), p63Var, true);
    }

    public final Pair a(r63 r63Var, p63 p63Var, int i10, long j10) {
        Pair pairA = a(r63Var, p63Var, i10, j10, 0L);
        pairA.getClass();
        return pairA;
    }

    public final Pair a(r63 r63Var, p63 p63Var, int i10, long j10, long j11) {
        ni.a(i10, b());
        a(i10, r63Var, j11);
        if (j10 == -9223372036854775807L) {
            j10 = r63Var.f82130n;
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = r63Var.f82132p;
        a(i11, p63Var, false);
        while (i11 < r63Var.f82133q && p63Var.f81270f != j10) {
            int i12 = i11 + 1;
            if (a(i12, p63Var, false).f81270f > j10) {
                break;
            }
            i11 = i12;
        }
        a(i11, p63Var, true);
        long jMin = j10 - p63Var.f81270f;
        long j12 = p63Var.f81269e;
        if (j12 != -9223372036854775807L) {
            jMin = Math.min(jMin, j12 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = p63Var.f81267c;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public final r63 a(int i10, r63 r63Var) {
        return a(i10, r63Var, 0L);
    }
}
