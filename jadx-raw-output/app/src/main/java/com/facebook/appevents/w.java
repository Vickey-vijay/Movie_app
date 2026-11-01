package com.facebook.appevents;

import kotlin.Metadata;

/* JADX INFO: compiled from: FlushStatistics.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/facebook/appevents/w;", "", "", "a", "I", "()I", "c", "(I)V", "numEvents", "Lcom/facebook/appevents/FlushResult;", "b", "Lcom/facebook/appevents/FlushResult;", "()Lcom/facebook/appevents/FlushResult;", "setResult", "(Lcom/facebook/appevents/FlushResult;)V", "result", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int numEvents;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public FlushResult result = FlushResult.SUCCESS;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getNumEvents() {
        return this.numEvents;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final FlushResult getResult() {
        return this.result;
    }

    public final void c(int i10) {
        this.numEvents = i10;
    }

    public final void setResult(FlushResult flushResult) {
        ck.p.j(flushResult, "<set-?>");
        this.result = flushResult;
    }
}
