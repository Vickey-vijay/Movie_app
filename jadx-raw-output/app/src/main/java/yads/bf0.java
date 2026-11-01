package yads;

import android.os.Bundle;
import java.util.Arrays;
import yads.bf0;
import yads.xq;

/* JADX INFO: loaded from: classes8.dex */
public final class bf0 implements xq {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wq f75795e = new wq() { // from class: cp.k
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return bf0.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f75796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f75797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f75798d;

    public static bf0 a(Bundle bundle) {
        int i10 = bundle.getInt(Integer.toString(0, 36), -1);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        int i11 = bundle.getInt(Integer.toString(2, 36), -1);
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException();
        }
        intArray.getClass();
        return new bf0(i10, i11, intArray);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bf0.class != obj.getClass()) {
            return false;
        }
        bf0 bf0Var = (bf0) obj;
        return this.f75796b == bf0Var.f75796b && Arrays.equals(this.f75797c, bf0Var.f75797c) && this.f75798d == bf0Var.f75798d;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f75797c) + (this.f75796b * 31)) * 31) + this.f75798d;
    }

    public bf0(int i10, int i11, int[] iArr) {
        this.f75796b = i10;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        this.f75797c = iArrCopyOf;
        this.f75798d = i11;
        Arrays.sort(iArrCopyOf);
    }
}
