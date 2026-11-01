package yads;

import android.os.Bundle;
import java.util.Arrays;
import yads.ne2;
import yads.xq;

/* JADX INFO: loaded from: classes6.dex */
public final class ne2 implements xq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f80659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f80660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fm1 f80661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f80662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f80663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f80664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f80665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f80666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f80667j;

    public static ne2 a(Bundle bundle) {
        int i10 = bundle.getInt(Integer.toString(0, 36), -1);
        Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
        return new ne2(null, i10, bundle2 == null ? null : (fm1) fm1.f77442h.fromBundle(bundle2), null, bundle.getInt(Integer.toString(2, 36), -1), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getLong(Integer.toString(4, 36), -9223372036854775807L), bundle.getInt(Integer.toString(5, 36), -1), bundle.getInt(Integer.toString(6, 36), -1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ne2.class != obj.getClass()) {
            return false;
        }
        ne2 ne2Var = (ne2) obj;
        return this.f80660c == ne2Var.f80660c && this.f80663f == ne2Var.f80663f && this.f80664g == ne2Var.f80664g && this.f80665h == ne2Var.f80665h && this.f80666i == ne2Var.f80666i && this.f80667j == ne2Var.f80667j && l92.a(this.f80659b, ne2Var.f80659b) && l92.a(this.f80662e, ne2Var.f80662e) && l92.a(this.f80661d, ne2Var.f80661d);
    }

    static {
        new wq() { // from class: cp.u6
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return ne2.a(bundle);
            }
        };
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80659b, Integer.valueOf(this.f80660c), this.f80661d, this.f80662e, Integer.valueOf(this.f80663f), Long.valueOf(this.f80664g), Long.valueOf(this.f80665h), Integer.valueOf(this.f80666i), Integer.valueOf(this.f80667j)});
    }

    public ne2(Object obj, int i10, fm1 fm1Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        this.f80659b = obj;
        this.f80660c = i10;
        this.f80661d = fm1Var;
        this.f80662e = obj2;
        this.f80663f = i11;
        this.f80664g = j10;
        this.f80665h = j11;
        this.f80666i = i12;
        this.f80667j = i13;
    }
}
