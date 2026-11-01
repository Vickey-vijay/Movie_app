package io.bidmachine.rendering.model;

import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\u0006\u0010\u001d\u001a\u00020\b\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001d\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\fR\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lio/bidmachine/rendering/model/BrokenCreativeDetectorParams;", "", "", "a", "J", "getTimeout", "()J", "timeout", "", "b", "D", "getDownscaleFactor", "()D", "downscaleFactor", "", "c", "Z", "isErrorOnly", "()Z", "d", "isAllowDuplicate", "Lio/bidmachine/rendering/model/StopDetectorAfter;", "e", "Lio/bidmachine/rendering/model/StopDetectorAfter;", "getStopAfter", "()Lio/bidmachine/rendering/model/StopDetectorAfter;", "stopAfter", InneractiveMediationDefs.GENDER_FEMALE, "getWeightThreshold", "weightThreshold", "", "Lio/bidmachine/rendering/model/BrokenCreativeAlgorithmParams;", "g", "Ljava/util/List;", "getAlgorithms", "()Ljava/util/List;", "algorithms", "<init>", "(JDZZLio/bidmachine/rendering/model/StopDetectorAfter;DLjava/util/List;)V", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public final class BrokenCreativeDetectorParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long timeout;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final double downscaleFactor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isErrorOnly;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isAllowDuplicate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final StopDetectorAfter stopAfter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final double weightThreshold;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List algorithms;

    public BrokenCreativeDetectorParams(long j10, double d10, boolean z10, boolean z11, StopDetectorAfter stopDetectorAfter, double d11, List<BrokenCreativeAlgorithmParams> list) {
        p.j(stopDetectorAfter, "stopAfter");
        p.j(list, "algorithms");
        this.timeout = j10;
        this.downscaleFactor = d10;
        this.isErrorOnly = z10;
        this.isAllowDuplicate = z11;
        this.stopAfter = stopDetectorAfter;
        this.weightThreshold = d11;
        this.algorithms = list;
    }

    public final List<BrokenCreativeAlgorithmParams> getAlgorithms() {
        return this.algorithms;
    }

    public final double getDownscaleFactor() {
        return this.downscaleFactor;
    }

    public final StopDetectorAfter getStopAfter() {
        return this.stopAfter;
    }

    public final long getTimeout() {
        return this.timeout;
    }

    public final double getWeightThreshold() {
        return this.weightThreshold;
    }

    /* JADX INFO: renamed from: isAllowDuplicate, reason: from getter */
    public final boolean getIsAllowDuplicate() {
        return this.isAllowDuplicate;
    }

    /* JADX INFO: renamed from: isErrorOnly, reason: from getter */
    public final boolean getIsErrorOnly() {
        return this.isErrorOnly;
    }
}
