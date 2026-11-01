package com.yandex.div.core.timer;

import bk.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import mj.r;

/* JADX INFO: compiled from: TimerController.kt */
/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class TimerController$ticker$1 extends FunctionReferenceImpl implements l<Long, r> {
    public TimerController$ticker$1(Object obj) {
        super(1, obj, TimerController.class, "updateTimerVariable", "updateTimerVariable(J)V", 0);
    }

    @Override // bk.l
    public /* bridge */ /* synthetic */ r invoke(Long l10) {
        invoke(l10.longValue());
        return r.f64562a;
    }

    public final void invoke(long j10) {
        ((TimerController) this.receiver).updateTimerVariable(j10);
    }
}
