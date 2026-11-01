package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import yads.ot1;

/* JADX INFO: loaded from: classes11.dex */
public final class ot1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f81141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f81142b;

    public /* synthetic */ ot1() {
        this(new Executor() { // from class: cp.x7
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                ot1.a(runnable);
            }
        }, Executors.newFixedThreadPool(2));
    }

    public static final void a(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    public ot1(Executor executor, Executor executor2) {
        this.f81141a = executor;
        this.f81142b = executor2;
    }
}
