package io.bidmachine.rendering.model;

import ck.p;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lio/bidmachine/rendering/model/BrokenCreativeAlgorithmResult;", "", "", "a", "Z", "isBroken", "()Z", "Lio/bidmachine/rendering/model/BrokenCreativeAlgorithmParams;", "b", "Lio/bidmachine/rendering/model/BrokenCreativeAlgorithmParams;", "getAlgorithmParams", "()Lio/bidmachine/rendering/model/BrokenCreativeAlgorithmParams;", "algorithmParams", "", "c", "J", "getDurationMs", "()J", "durationMs", "<init>", "(ZLio/bidmachine/rendering/model/BrokenCreativeAlgorithmParams;J)V", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public final class BrokenCreativeAlgorithmResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isBroken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final BrokenCreativeAlgorithmParams algorithmParams;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long durationMs;

    public BrokenCreativeAlgorithmResult(boolean z10, BrokenCreativeAlgorithmParams brokenCreativeAlgorithmParams, long j10) {
        p.j(brokenCreativeAlgorithmParams, "algorithmParams");
        this.isBroken = z10;
        this.algorithmParams = brokenCreativeAlgorithmParams;
        this.durationMs = j10;
    }

    public final BrokenCreativeAlgorithmParams getAlgorithmParams() {
        return this.algorithmParams;
    }

    public final long getDurationMs() {
        return this.durationMs;
    }

    /* JADX INFO: renamed from: isBroken, reason: from getter */
    public final boolean getIsBroken() {
        return this.isBroken;
    }
}
