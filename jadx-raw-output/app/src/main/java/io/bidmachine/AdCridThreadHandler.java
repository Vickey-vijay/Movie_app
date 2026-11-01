package io.bidmachine;

import io.bidmachine.core.Logger;
import io.bidmachine.utils.Tag;
import kotlin.Metadata;

/* JADX INFO: compiled from: AdCridThreadHandler.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lio/bidmachine/AdCridThreadHandler;", "", "Lmj/r;", "destroy", "Lio/bidmachine/utils/Tag;", "tag", "Lio/bidmachine/utils/Tag;", "", "name", "Ljava/lang/String;", "Ljava/lang/Runnable;", "runnable", "Ljava/lang/Runnable;", "Ljava/lang/Thread;", "thread", "Ljava/lang/Thread;", "crid", "<init>", "(Ljava/lang/String;)V", "bidmachine-android-sdk_bi_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class AdCridThreadHandler {
    private final String name;
    private final Runnable runnable;
    private final Tag tag;
    private Thread thread;

    public AdCridThreadHandler(String str) {
        ck.p.j(str, "crid");
        this.tag = new Tag("AdCridThreadManager");
        String str2 = "io.bidmachine.crid." + str;
        this.name = str2;
        Runnable runnable = new Runnable() { // from class: io.bidmachine.a
            @Override // java.lang.Runnable
            public final void run() {
                AdCridThreadHandler.runnable$lambda$0(this.f58507b);
            }
        };
        this.runnable = runnable;
        Thread thread = new Thread(runnable, str2);
        thread.start();
        this.thread = thread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runnable$lambda$0(AdCridThreadHandler adCridThreadHandler) {
        ck.p.j(adCridThreadHandler, "this$0");
        Thread threadCurrentThread = Thread.currentThread();
        try {
            Logger.d(adCridThreadHandler.tag, adCridThreadHandler.name + " started");
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException unused) {
            threadCurrentThread.interrupt();
        }
    }

    public final void destroy() {
        Thread thread = this.thread;
        if (thread != null) {
            thread.interrupt();
        }
        this.thread = null;
        Logger.d(this.tag, this.name + " stopped");
    }
}
