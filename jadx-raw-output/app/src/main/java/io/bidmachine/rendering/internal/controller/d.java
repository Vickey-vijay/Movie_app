package io.bidmachine.rendering.internal.controller;

import ck.p;
import io.bidmachine.rendering.internal.o;
import io.bidmachine.rendering.utils.taskmanager.CancelableTask;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends CancelableTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.c f60196b;

    public d(io.bidmachine.rendering.internal.c cVar) {
        p.j(cVar, "adElement");
        this.f60196b = cVar;
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.CancelableTask
    public void runTask() {
        try {
            this.f60196b.c();
        } catch (Throwable th2) {
            o.b(th2);
        }
    }
}
