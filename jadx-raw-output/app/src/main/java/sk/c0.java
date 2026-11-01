package sk;

import kotlin.Result;

/* JADX INFO: compiled from: StackTraceRecovery.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final StackTraceElement f71939a = new m.a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f71940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f71941c;

    public static final <E extends Throwable> E a(E e10) {
        return e10;
    }

    static {
        Object objM3458constructorimpl;
        Object objM3458constructorimpl2;
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(Class.forName("kotlin.coroutines.jvm.internal.BaseContinuationImpl").getCanonicalName());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) != null) {
            objM3458constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f71940b = (String) objM3458constructorimpl;
        try {
            objM3458constructorimpl2 = Result.m3458constructorimpl(c0.class.getCanonicalName());
        } catch (Throwable th3) {
            Result.a aVar3 = Result.Companion;
            objM3458constructorimpl2 = Result.m3458constructorimpl(kotlin.c.a(th3));
        }
        if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl2) != null) {
            objM3458constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f71941c = (String) objM3458constructorimpl2;
    }
}
