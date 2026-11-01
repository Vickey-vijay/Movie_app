package io.bidmachine.analytics.internal;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import kotlin.Metadata;

/* JADX INFO: renamed from: io.bidmachine.analytics.internal.q0, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\fB!\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0018"}, d2 = {"Lio/bidmachine/analytics/internal/q0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "name", "Lio/bidmachine/analytics/internal/q0$a;", "b", "Lio/bidmachine/analytics/internal/q0$a;", "c", "()Lio/bidmachine/analytics/internal/q0$a;", "type", "reason", "<init>", "(Ljava/lang/String;Lio/bidmachine/analytics/internal/q0$a;Ljava/lang/String;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final /* data */ class TrackerError {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final a type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reason;

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.q0$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lio/bidmachine/analytics/internal/q0$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", InneractiveMediationDefs.GENDER_FEMALE, "g", "h", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public enum a {
        UNKNOWN,
        MONITOR_INVALID,
        MONITOR_NO_CONTENT,
        MONITOR_BAD_CONTENT,
        READER_INVALID,
        READER_NO_CONTENT,
        READER_BAD_CONTENT,
        READER_NO_ACCESS
    }

    public TrackerError(String str, a aVar, String str2) {
        this.name = str;
        this.type = aVar;
        this.reason = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackerError)) {
            return false;
        }
        TrackerError trackerError = (TrackerError) other;
        return ck.p.e(this.name, trackerError.name) && this.type == trackerError.type && ck.p.e(this.reason, trackerError.reason);
    }

    public /* synthetic */ TrackerError(String str, a aVar, String str2, int i10, ck.i iVar) {
        this(str, aVar, (i10 & 4) != 0 ? "" : str2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.type.hashCode()) * 31) + this.reason.hashCode();
    }

    public String toString() {
        return "TrackerError(name=" + this.name + ", type=" + this.type + ", reason=" + this.reason + ')';
    }
}
