package com.inmobi.media;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.media.C2766c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2766c extends AbstractC3198t5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bk.a f24097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f24098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f24099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f24100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public nk.l0 f24101g;

    public static final mj.r a(C2766c c2766c, InterfaceC3173s5 interfaceC3173s5) {
        if (c2766c.f24098d.get()) {
            if (c2766c.f24100f.hasMessages(2023)) {
                c2766c.f24100f.removeMessages(2023);
                if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger() && c2766c.f24099e.get()) {
                    StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                    ck.p.g(stackTrace);
                    ((C3223u5) interfaceC3173s5).a(new Wn(stackTrace));
                }
            }
            c2766c.f24099e.getAndSet(true);
            c2766c.f24100f.sendEmptyMessage(2023);
        }
        return mj.r.f64562a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2766c(long j10, final C3223u5 c3223u5) {
        super(c3223u5);
        ck.p.j(c3223u5, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f24096b = j10;
        this.f24097c = new bk.a() { // from class: b7.u5
            @Override // bk.a
            public final Object invoke() {
                return C2766c.a(this.f5200b, c3223u5);
            }
        };
        this.f24098d = new AtomicBoolean(false);
        this.f24099e = new AtomicBoolean(false);
        this.f24100f = new Handler(Looper.getMainLooper());
    }

    @Override // com.inmobi.media.AbstractC3198t5
    public final void b() {
        if (this.f24098d.getAndSet(false)) {
            this.f24098d.set(false);
            this.f24099e.set(false);
            F3.a(this.f24101g);
        }
    }

    @Override // com.inmobi.media.AbstractC3198t5
    public final void a() {
        if (this.f24098d.getAndSet(true)) {
            return;
        }
        ck.p.j("ANRWatchDog", "name");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new B9("ANRWatchDog", false));
        ck.p.i(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        nk.l0 l0VarA = kotlinx.coroutines.d.a(nk.l1.c(executorServiceNewSingleThreadExecutor));
        this.f24101g = l0VarA;
        if (l0VarA != null) {
            F3.a(l0VarA, 0L, this.f24096b, new C2740b(this.f24097c));
        }
    }
}
