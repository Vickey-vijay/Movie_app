package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import yads.mx;
import yads.xq;

/* JADX INFO: loaded from: classes10.dex */
public final class mx implements xq {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wq f80412g = new wq() { // from class: cp.q6
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return mx.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f80413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f80414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f80415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f80416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f80417f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mx.class != obj.getClass()) {
            return false;
        }
        mx mxVar = (mx) obj;
        return this.f80413b == mxVar.f80413b && this.f80414c == mxVar.f80414c && this.f80415d == mxVar.f80415d && Arrays.equals(this.f80416e, mxVar.f80416e);
    }

    public static mx a(Bundle bundle) {
        return new mx(bundle.getInt(Integer.toString(0, 36), -1), bundle.getInt(Integer.toString(1, 36), -1), bundle.getInt(Integer.toString(2, 36), -1), bundle.getByteArray(Integer.toString(3, 36)));
    }

    public final int hashCode() {
        if (this.f80417f == 0) {
            this.f80417f = Arrays.hashCode(this.f80416e) + ((((((this.f80413b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f80414c) * 31) + this.f80415d) * 31);
        }
        return this.f80417f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(this.f80413b);
        sb2.append(", ");
        sb2.append(this.f80414c);
        sb2.append(", ");
        sb2.append(this.f80415d);
        sb2.append(", ");
        sb2.append(this.f80416e != null);
        sb2.append(")");
        return sb2.toString();
    }

    public mx(int i10, int i11, int i12, byte[] bArr) {
        this.f80413b = i10;
        this.f80414c = i11;
        this.f80415d = i12;
        this.f80416e = bArr;
    }
}
