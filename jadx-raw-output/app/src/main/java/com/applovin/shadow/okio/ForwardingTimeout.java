package com.applovin.shadow.okio;

import ck.p;
import com.ironsource.Ne;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ForwardingTimeout.kt */
/* JADX INFO: loaded from: classes7.dex */
public class ForwardingTimeout extends Timeout {
    private Timeout delegate;

    @Override // com.applovin.shadow.okio.Timeout
    public long deadlineNanoTime() {
        return this.delegate.deadlineNanoTime();
    }

    /* JADX INFO: renamed from: setDelegate, reason: collision with other method in class */
    public final /* synthetic */ void m199setDelegate(Timeout timeout) {
        p.j(timeout, "<set-?>");
        this.delegate = timeout;
    }

    public ForwardingTimeout(Timeout timeout) {
        p.j(timeout, "delegate");
        this.delegate = timeout;
    }

    @Override // com.applovin.shadow.okio.Timeout
    public Timeout clearDeadline() {
        return this.delegate.clearDeadline();
    }

    @Override // com.applovin.shadow.okio.Timeout
    public Timeout clearTimeout() {
        return this.delegate.clearTimeout();
    }

    @Override // com.applovin.shadow.okio.Timeout
    public Timeout deadlineNanoTime(long j10) {
        return this.delegate.deadlineNanoTime(j10);
    }

    public final Timeout delegate() {
        return this.delegate;
    }

    @Override // com.applovin.shadow.okio.Timeout
    public boolean hasDeadline() {
        return this.delegate.hasDeadline();
    }

    public final ForwardingTimeout setDelegate(Timeout timeout) {
        p.j(timeout, "delegate");
        this.delegate = timeout;
        return this;
    }

    @Override // com.applovin.shadow.okio.Timeout
    public void throwIfReached() throws IOException {
        this.delegate.throwIfReached();
    }

    @Override // com.applovin.shadow.okio.Timeout
    public Timeout timeout(long j10, TimeUnit timeUnit) {
        p.j(timeUnit, Ne.f27158n1);
        return this.delegate.timeout(j10, timeUnit);
    }

    @Override // com.applovin.shadow.okio.Timeout
    public long timeoutNanos() {
        return this.delegate.timeoutNanos();
    }
}
