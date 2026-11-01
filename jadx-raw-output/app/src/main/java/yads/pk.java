package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import yads.pk;
import yads.xq;

/* JADX INFO: loaded from: classes10.dex */
public final class pk implements xq {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final pk f81431h = new pk(0, 0, 1, 1, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f81432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f81433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f81434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f81435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f81436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ok f81437g;

    public static pk a(Bundle bundle) {
        return new pk(bundle.containsKey(Integer.toString(0, 36)) ? bundle.getInt(Integer.toString(0, 36)) : 0, bundle.containsKey(Integer.toString(1, 36)) ? bundle.getInt(Integer.toString(1, 36)) : 0, bundle.containsKey(Integer.toString(2, 36)) ? bundle.getInt(Integer.toString(2, 36)) : 1, bundle.containsKey(Integer.toString(3, 36)) ? bundle.getInt(Integer.toString(3, 36)) : 1, bundle.containsKey(Integer.toString(4, 36)) ? bundle.getInt(Integer.toString(4, 36)) : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pk.class != obj.getClass()) {
            return false;
        }
        pk pkVar = (pk) obj;
        return this.f81432b == pkVar.f81432b && this.f81433c == pkVar.f81433c && this.f81434d == pkVar.f81434d && this.f81435e == pkVar.f81435e && this.f81436f == pkVar.f81436f;
    }

    static {
        new wq() { // from class: cp.h8
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return pk.a(bundle);
            }
        };
    }

    public final int hashCode() {
        return ((((((((this.f81432b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f81433c) * 31) + this.f81434d) * 31) + this.f81435e) * 31) + this.f81436f;
    }

    public pk(int i10, int i11, int i12, int i13, int i14) {
        this.f81432b = i10;
        this.f81433c = i11;
        this.f81434d = i12;
        this.f81435e = i13;
        this.f81436f = i14;
    }
}
