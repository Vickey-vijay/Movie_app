package yads;

import android.text.TextUtils;
import com.ironsource.C3426d4;

/* JADX INFO: loaded from: classes8.dex */
public final class q01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81669b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q01.class != obj.getClass()) {
            return false;
        }
        q01 q01Var = (q01) obj;
        return TextUtils.equals(this.f81668a, q01Var.f81668a) && TextUtils.equals(this.f81669b, q01Var.f81669b);
    }

    public final int hashCode() {
        return this.f81669b.hashCode() + (this.f81668a.hashCode() * 31);
    }

    public final String toString() {
        return "Header[name=" + this.f81668a + ",value=" + this.f81669b + C3426d4.j.f28588e;
    }

    public q01(String str, String str2) {
        this.f81668a = str;
        this.f81669b = str2;
    }
}
