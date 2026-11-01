package yads;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public abstract class y21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicLong f84797a = new AtomicLong();

    public static final long a() {
        return f84797a.getAndIncrement();
    }
}
