package io.bidmachine.analytics.internal;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.UUID;
import kotlin.Metadata;

/* JADX INFO: renamed from: io.bidmachine.analytics.internal.h0, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0017\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u000eBI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b'\u0010(JX\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u000e\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u001a\u0010#R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006)"}, d2 = {"Lio/bidmachine/analytics/internal/h0;", "", "", "id", "name", "", "timestamp", "dataHash", "Lio/bidmachine/analytics/internal/h0$a;", "rule", "Lio/bidmachine/analytics/internal/q0;", "error", "", "isDirty", "a", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lio/bidmachine/analytics/internal/h0$a;Lio/bidmachine/analytics/internal/q0;Z)Lio/bidmachine/analytics/internal/h0;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "d", "J", InneractiveMediationDefs.GENDER_FEMALE, "()J", "e", "Lio/bidmachine/analytics/internal/h0$a;", "()Lio/bidmachine/analytics/internal/h0$a;", "Lio/bidmachine/analytics/internal/q0;", "()Lio/bidmachine/analytics/internal/q0;", "g", "Z", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lio/bidmachine/analytics/internal/h0$a;Lio/bidmachine/analytics/internal/q0;Z)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final /* data */ class ReaderRecord {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dataHash;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Rule rule;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final TrackerError error;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDirty;

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.h0$a, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u0004¨\u0006\u0013"}, d2 = {"Lio/bidmachine/analytics/internal/h0$a;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "tag", "path", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class Rule {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String tag;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String path;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Rule)) {
                return false;
            }
            Rule rule = (Rule) other;
            return ck.p.e(this.tag, rule.tag) && ck.p.e(this.path, rule.path);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            return (this.tag.hashCode() * 31) + this.path.hashCode();
        }

        public String toString() {
            return "Rule(tag=" + this.tag + ", path=" + this.path + ')';
        }

        public Rule(String str, String str2) {
            this.tag = str;
            this.path = str2;
        }
    }

    public ReaderRecord(String str, String str2, long j10, String str3, Rule rule, TrackerError trackerError, boolean z10) {
        this.id = str;
        this.name = str2;
        this.timestamp = j10;
        this.dataHash = str3;
        this.rule = rule;
        this.error = trackerError;
        this.isDirty = z10;
    }

    public final ReaderRecord a(String id2, String name, long timestamp, String dataHash, Rule rule, TrackerError error, boolean isDirty) {
        return new ReaderRecord(id2, name, timestamp, dataHash, rule, error, isDirty);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReaderRecord)) {
            return false;
        }
        ReaderRecord readerRecord = (ReaderRecord) other;
        return ck.p.e(this.id, readerRecord.id) && ck.p.e(this.name, readerRecord.name) && this.timestamp == readerRecord.timestamp && ck.p.e(this.dataHash, readerRecord.dataHash) && ck.p.e(this.rule, readerRecord.rule) && ck.p.e(this.error, readerRecord.error) && this.isDirty == readerRecord.isDirty;
    }

    public /* synthetic */ ReaderRecord(String str, String str2, long j10, String str3, Rule rule, TrackerError trackerError, boolean z10, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? UUID.randomUUID().toString() : str, str2, (i10 & 4) != 0 ? System.currentTimeMillis() : j10, str3, rule, (i10 & 32) != 0 ? null : trackerError, (i10 & 64) != 0 ? true : z10);
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
    public final Rule getRule() {
        return this.rule;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsDirty() {
        return this.isDirty;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    public int hashCode() {
        int iHashCode = ((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + this.dataHash.hashCode()) * 31) + this.rule.hashCode()) * 31;
        TrackerError trackerError = this.error;
        int iHashCode2 = (iHashCode + (trackerError == null ? 0 : trackerError.hashCode())) * 31;
        boolean z10 = this.isDirty;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode2 + r10;
    }

    public String toString() {
        return "ReaderRecord(id=" + this.id + ", name=" + this.name + ", timestamp=" + this.timestamp + ", dataHash=" + this.dataHash + ", rule=" + this.rule + ", error=" + this.error + ", isDirty=" + this.isDirty + ')';
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDataHash() {
        return this.dataHash;
    }
}
