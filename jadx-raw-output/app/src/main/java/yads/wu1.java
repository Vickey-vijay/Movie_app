package yads;

import com.ironsource.Z7;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public abstract class wu1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f84316a = new AtomicBoolean(false);

    public static final void a() {
        if (f84316a.compareAndSet(false, true)) {
            lc1.b("Yandex Mobile Ads" + Z7.f27998r + "7.18.1 initialized successfully", new Object[0]);
        }
    }
}
