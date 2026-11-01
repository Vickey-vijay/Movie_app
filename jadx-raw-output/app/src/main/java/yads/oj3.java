package yads;

import android.os.Bundle;
import com.vungle.ads.internal.protos.Sdk;
import yads.oj3;
import yads.xq;

/* JADX INFO: loaded from: classes9.dex */
public final class oj3 implements xq {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f81056f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f81057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f81058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f81059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f81060e;

    public static oj3 a(Bundle bundle) {
        return new oj3(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0), bundle.getFloat(Integer.toString(3, 36), 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj3)) {
            return false;
        }
        oj3 oj3Var = (oj3) obj;
        return this.f81057b == oj3Var.f81057b && this.f81058c == oj3Var.f81058c && this.f81059d == oj3Var.f81059d && this.f81060e == oj3Var.f81060e;
    }

    static {
        new wq() { // from class: cp.p7
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return oj3.a(bundle);
            }
        };
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f81060e) + ((((((this.f81057b + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31) + this.f81058c) * 31) + this.f81059d) * 31);
    }

    public oj3(int i10, int i11, int i12, float f10) {
        this.f81057b = i10;
        this.f81058c = i11;
        this.f81059d = i12;
        this.f81060e = f10;
    }
}
