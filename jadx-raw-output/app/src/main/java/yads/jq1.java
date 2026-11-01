package yads;

import java.util.NoSuchElementException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes9.dex */
public abstract class jq1 {
    public static ih2 a(String str, Exception exc) {
        zg2 zg2Var;
        if (exc instanceof TimeoutCancellationException) {
            zg2Var = zg2.f85387d;
        } else if (exc instanceof IllegalArgumentException) {
            zg2Var = zg2.f85388e;
        } else {
            zg2Var = exc instanceof NoSuchElementException ? zg2.f85389f : zg2.f85390g;
        }
        boolean z10 = ad1.f75480a;
        return jh2.a(str, zg2Var.b(), Integer.valueOf(zg2Var.a()));
    }

    public static ih2 a(String str) {
        zg2 zg2Var = zg2.f85389f;
        boolean z10 = ad1.f75480a;
        return jh2.a(str, zg2Var.b(), Integer.valueOf(zg2Var.a()));
    }

    public static ih2 a() {
        zg2.f85389f.b();
        boolean z10 = ad1.f75480a;
        return jh2.a();
    }
}
