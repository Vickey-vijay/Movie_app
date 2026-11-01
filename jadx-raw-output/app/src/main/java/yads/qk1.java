package yads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class qk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f81877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f81878c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != qk1.class) {
            return false;
        }
        qk1 qk1Var = (qk1) obj;
        return TextUtils.equals(this.f81876a, qk1Var.f81876a) && this.f81877b == qk1Var.f81877b && this.f81878c == qk1Var.f81878c;
    }

    public final int hashCode() {
        return ((k4.a(this.f81876a, 31, 31) + (this.f81877b ? 1231 : 1237)) * 31) + (this.f81878c ? 1231 : 1237);
    }

    public qk1(String str, boolean z10, boolean z11) {
        this.f81876a = str;
        this.f81877b = z10;
        this.f81878c = z11;
    }
}
