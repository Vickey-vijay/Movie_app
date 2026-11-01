package sg.bigo.ads.common.y;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f70325a = new AtomicInteger();

    public static int a() {
        return f70325a.incrementAndGet();
    }

    public static void a(int i10) {
        f70325a.set(i10);
    }
}
