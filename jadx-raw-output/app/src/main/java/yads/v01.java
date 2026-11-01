package yads;

import android.os.Bundle;
import java.util.Arrays;
import yads.v01;
import yads.xq;

/* JADX INFO: loaded from: classes11.dex */
public final class v01 extends ql2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wq f83714e = new wq() { // from class: cp.cb
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return v01.b(bundle);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f83715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f83716d;

    public v01() {
        this.f83715c = false;
        this.f83716d = false;
    }

    public static v01 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) == 0) {
            return bundle.getBoolean(Integer.toString(1, 36), false) ? new v01(bundle.getBoolean(Integer.toString(2, 36), false)) : new v01();
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v01)) {
            return false;
        }
        v01 v01Var = (v01) obj;
        return this.f83716d == v01Var.f83716d && this.f83715c == v01Var.f83715c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f83715c), Boolean.valueOf(this.f83716d)});
    }

    public v01(boolean z10) {
        this.f83715c = true;
        this.f83716d = z10;
    }
}
