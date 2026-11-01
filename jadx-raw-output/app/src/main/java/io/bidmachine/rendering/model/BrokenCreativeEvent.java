package io.bidmachine.rendering.model;

import ck.p;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b+\u0010,J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\t\u0010\f\u001a\u00020\u0007HÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\r2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0001R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0012\u0010\u001aR\u0017\u0010\u0013\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lio/bidmachine/rendering/model/BrokenCreativeEvent;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "component1", "component2", "component3", "", "component4", "", "Lio/bidmachine/rendering/model/BrokenCreativeAlgorithmResult;", "component5", "isBroken", "adPhaseSequence", "adElementName", "durationMs", "algorithmResults", "copy", "a", "D", "()D", "b", "I", "getAdPhaseSequence", "()I", "c", "Ljava/lang/String;", "getAdElementName", "()Ljava/lang/String;", "d", "J", "getDurationMs", "()J", "e", "Ljava/util/List;", "getAlgorithmResults", "()Ljava/util/List;", "<init>", "(DILjava/lang/String;JLjava/util/List;)V", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public final /* data */ class BrokenCreativeEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final double isBroken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int adPhaseSequence;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String adElementName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long durationMs;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List algorithmResults;

    public BrokenCreativeEvent(double d10, int i10, String str, long j10, List<BrokenCreativeAlgorithmResult> list) {
        p.j(str, "adElementName");
        p.j(list, "algorithmResults");
        this.isBroken = d10;
        this.adPhaseSequence = i10;
        this.adElementName = str;
        this.durationMs = j10;
        this.algorithmResults = list;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getIsBroken() {
        return this.isBroken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAdPhaseSequence() {
        return this.adPhaseSequence;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAdElementName() {
        return this.adElementName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getDurationMs() {
        return this.durationMs;
    }

    public final List<BrokenCreativeAlgorithmResult> component5() {
        return this.algorithmResults;
    }

    public final BrokenCreativeEvent copy(double isBroken, int adPhaseSequence, String adElementName, long durationMs, List<BrokenCreativeAlgorithmResult> algorithmResults) {
        p.j(adElementName, "adElementName");
        p.j(algorithmResults, "algorithmResults");
        return new BrokenCreativeEvent(isBroken, adPhaseSequence, adElementName, durationMs, algorithmResults);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!p.e(BrokenCreativeEvent.class, other != null ? other.getClass() : null)) {
            return false;
        }
        p.h(other, "null cannot be cast to non-null type io.bidmachine.rendering.model.BrokenCreativeEvent");
        BrokenCreativeEvent brokenCreativeEvent = (BrokenCreativeEvent) other;
        return this.isBroken == brokenCreativeEvent.isBroken && this.adPhaseSequence == brokenCreativeEvent.adPhaseSequence && p.e(this.adElementName, brokenCreativeEvent.adElementName);
    }

    public final String getAdElementName() {
        return this.adElementName;
    }

    public final int getAdPhaseSequence() {
        return this.adPhaseSequence;
    }

    public final List<BrokenCreativeAlgorithmResult> getAlgorithmResults() {
        return this.algorithmResults;
    }

    public final long getDurationMs() {
        return this.durationMs;
    }

    public int hashCode() {
        return (((Double.hashCode(this.isBroken) * 31) + this.adPhaseSequence) * 31) + this.adElementName.hashCode();
    }

    public final double isBroken() {
        return this.isBroken;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("isBroken - ");
        sb2.append(this.isBroken);
        sb2.append(" (");
        sb2.append(this.isBroken == 1.0d);
        sb2.append("), adPhaseSequence - ");
        sb2.append(this.adPhaseSequence);
        sb2.append(", adElementName - ");
        sb2.append(this.adElementName);
        sb2.append(", durationMs - ");
        sb2.append(this.durationMs);
        return sb2.toString();
    }
}
