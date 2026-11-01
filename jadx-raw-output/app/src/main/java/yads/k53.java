package yads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class k53 {
    public static Object a(Callable callable, Object obj, String str, String str2) {
        if (obj == null) {
            boolean z10 = ad1.f75480a;
            return null;
        }
        try {
            return callable.call();
        } catch (Throwable unused) {
            boolean z11 = ad1.f75480a;
            return null;
        }
    }
}
