package mk;

import java.text.DecimalFormat;

/* JADX INFO: compiled from: DurationJvm.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f64568a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<DecimalFormat>[] f64569b;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i10 = 0; i10 < 4; i10++) {
            threadLocalArr[i10] = new ThreadLocal<>();
        }
        f64569b = threadLocalArr;
    }

    public static final boolean a() {
        return f64568a;
    }
}
