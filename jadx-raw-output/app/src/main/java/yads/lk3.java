package yads;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class lk3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final lk3 f79833b = new lk3();

    public lk3() {
        super(0);
    }

    @Override // bk.a
    public final Object invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
