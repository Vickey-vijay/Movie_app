package yads;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import yads.xq;

/* JADX INFO: loaded from: classes2.dex */
public final class e6 implements xq {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e6 f76925h = new e6(null, new d6[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d6 f76926i = new d6(0, -1, new int[0], new Uri[0], new long[0], 0, false).a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final wq f76927j = new wq() { // from class: cp.e1
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return yads.e6.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f76928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f76929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f76930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f76931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f76932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d6[] f76933g;

    public static e6 a(Bundle bundle) {
        d6[] d6VarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(1, 36));
        if (parcelableArrayList == null) {
            d6VarArr = new d6[0];
        } else {
            d6[] d6VarArr2 = new d6[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                d6VarArr2[i10] = (d6) d6.f76579i.fromBundle((Bundle) parcelableArrayList.get(i10));
            }
            d6VarArr = d6VarArr2;
        }
        return new e6(null, d6VarArr, bundle.getLong(Integer.toString(2, 36), 0L), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getInt(Integer.toString(4, 36)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e6.class != obj.getClass()) {
            return false;
        }
        e6 e6Var = (e6) obj;
        return ib3.a(this.f76928b, e6Var.f76928b) && this.f76929c == e6Var.f76929c && this.f76930d == e6Var.f76930d && this.f76931e == e6Var.f76931e && this.f76932f == e6Var.f76932f && Arrays.equals(this.f76933g, e6Var.f76933g);
    }

    public final int hashCode() {
        int i10 = this.f76929c * 31;
        Object obj = this.f76928b;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f76930d)) * 31) + ((int) this.f76931e)) * 31) + this.f76932f) * 31) + Arrays.hashCode(this.f76933g);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=");
        sb2.append(this.f76928b);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f76930d);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f76933g.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f76933g[i10].f76580b);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f76933g[i10].f76583e.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f76933g[i10].f76583e[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f76933g[i10].f76584f[i11]);
                sb2.append(')');
                if (i11 < this.f76933g[i10].f76583e.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f76933g.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }

    public e6(Object obj, d6[] d6VarArr, long j10, long j11, int i10) {
        this.f76928b = obj;
        this.f76930d = j10;
        this.f76931e = j11;
        this.f76929c = d6VarArr.length + i10;
        this.f76933g = d6VarArr;
        this.f76932f = i10;
    }

    public final d6 a(int i10) {
        int i11 = this.f76932f;
        if (i10 < i11) {
            return f76926i;
        }
        return this.f76933g[i10 - i11];
    }
}
