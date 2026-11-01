package io.bidmachine.analytics.internal;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;

/* JADX INFO: renamed from: io.bidmachine.analytics.internal.Q, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0080\b\u0018\u0000 %2\u00020\u0001:\u0001\fBM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b#\u0010$JZ\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\f\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\u0019\u0010\"¨\u0006&"}, d2 = {"Lio/bidmachine/analytics/internal/Q;", "", "", "id", "name", JsonStorageKeyNames.SESSION_ID_KEY, "", "timestamp", "", "data", "Lio/bidmachine/analytics/internal/q0;", "error", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;Lio/bidmachine/analytics/internal/q0;)Lio/bidmachine/analytics/internal/Q;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "d", "e", "J", InneractiveMediationDefs.GENDER_FEMALE, "()J", "Ljava/util/Map;", "()Ljava/util/Map;", "Lio/bidmachine/analytics/internal/q0;", "()Lio/bidmachine/analytics/internal/q0;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;Lio/bidmachine/analytics/internal/q0;)V", "g", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final /* data */ class MonitorRecord {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sessionId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, Object> data;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final TrackerError error;

    public MonitorRecord(String str, String str2, String str3, long j10, Map<String, ? extends Object> map, TrackerError trackerError) {
        this.id = str;
        this.name = str2;
        this.sessionId = str3;
        this.timestamp = j10;
        this.data = map;
        this.error = trackerError;
    }

    public final MonitorRecord a(String id2, String name, String sessionId, long timestamp, Map<String, ? extends Object> data, TrackerError error) {
        return new MonitorRecord(id2, name, sessionId, timestamp, data, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MonitorRecord)) {
            return false;
        }
        MonitorRecord monitorRecord = (MonitorRecord) other;
        return ck.p.e(this.id, monitorRecord.id) && ck.p.e(this.name, monitorRecord.name) && ck.p.e(this.sessionId, monitorRecord.sessionId) && this.timestamp == monitorRecord.timestamp && ck.p.e(this.data, monitorRecord.data) && ck.p.e(this.error, monitorRecord.error);
    }

    public /* synthetic */ MonitorRecord(String str, String str2, String str3, long j10, Map map, TrackerError trackerError, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? UUID.randomUUID().toString() : str, str2, str3, (i10 & 8) != 0 ? System.currentTimeMillis() : j10, (i10 & 16) != 0 ? kotlin.collections.a.j() : map, (i10 & 32) != 0 ? null : trackerError);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MonitorRecord a(MonitorRecord monitorRecord, String str, String str2, String str3, long j10, Map map, TrackerError trackerError, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = monitorRecord.id;
        }
        if ((i10 & 2) != 0) {
            str2 = monitorRecord.name;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            str3 = monitorRecord.sessionId;
        }
        String str5 = str3;
        if ((i10 & 8) != 0) {
            j10 = monitorRecord.timestamp;
        }
        long j11 = j10;
        if ((i10 & 16) != 0) {
            map = monitorRecord.data;
        }
        Map map2 = map;
        if ((i10 & 32) != 0) {
            trackerError = monitorRecord.error;
        }
        return monitorRecord.a(str, str4, str5, j11, map2, trackerError);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TrackerError getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.sessionId.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + this.data.hashCode()) * 31;
        TrackerError trackerError = this.error;
        return iHashCode + (trackerError == null ? 0 : trackerError.hashCode());
    }

    public String toString() {
        return "MonitorRecord(id=" + this.id + ", name=" + this.name + ", sessionId=" + this.sessionId + ", timestamp=" + this.timestamp + ", data=" + this.data + ", error=" + this.error + ')';
    }

    public final Map<String, Object> a() {
        return this.data;
    }
}
