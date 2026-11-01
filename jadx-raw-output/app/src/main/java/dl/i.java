package dl;

import kotlin.Result;

/* JADX INFO: compiled from: ArrayPools.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f52154a;

    static {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            ck.p.i(property, "getProperty(\"kotlinx.ser…lization.json.pool.size\")");
            objM3458constructorimpl = Result.m3458constructorimpl(lk.w.r(property));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = null;
        }
        Integer num = (Integer) objM3458constructorimpl;
        f52154a = num != null ? num.intValue() : 2097152;
    }
}
