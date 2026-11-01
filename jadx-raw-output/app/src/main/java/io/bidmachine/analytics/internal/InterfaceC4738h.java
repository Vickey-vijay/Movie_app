package io.bidmachine.analytics.internal;

import io.bidmachine.analytics.ReaderConfig;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: renamed from: io.bidmachine.analytics.internal.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0006J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/bidmachine/analytics/internal/h;", "", "", "Lio/bidmachine/analytics/internal/h$a;", "dataList", "Lmj/r;", "a", "(Ljava/util/List;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public interface InterfaceC4738h {

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.h$a, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\r\u0010\u0004R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u001b"}, d2 = {"Lio/bidmachine/analytics/internal/h$a;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/bidmachine/analytics/ReaderConfig$Rule;", "a", "Lio/bidmachine/analytics/ReaderConfig$Rule;", "c", "()Lio/bidmachine/analytics/ReaderConfig$Rule;", "rule", "b", "Ljava/lang/String;", "dataHash", "Lio/bidmachine/analytics/internal/q0;", "Lio/bidmachine/analytics/internal/q0;", "()Lio/bidmachine/analytics/internal/q0;", "error", "<init>", "(Lio/bidmachine/analytics/ReaderConfig$Rule;Ljava/lang/String;Lio/bidmachine/analytics/internal/q0;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ReaderConfig.Rule rule;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String dataHash;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final TrackerError error;

        public Data(ReaderConfig.Rule rule, String str, TrackerError trackerError) {
            this.rule = rule;
            this.dataHash = str;
            this.error = trackerError;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return ck.p.e(this.rule, data.rule) && ck.p.e(this.dataHash, data.dataHash) && ck.p.e(this.error, data.error);
        }

        public /* synthetic */ Data(ReaderConfig.Rule rule, String str, TrackerError trackerError, int i10, ck.i iVar) {
            this(rule, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : trackerError);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDataHash() {
            return this.dataHash;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TrackerError getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ReaderConfig.Rule getRule() {
            return this.rule;
        }

        public int hashCode() {
            int iHashCode = this.rule.hashCode() * 31;
            String str = this.dataHash;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            TrackerError trackerError = this.error;
            return iHashCode2 + (trackerError != null ? trackerError.hashCode() : 0);
        }

        public String toString() {
            return "Data(rule=" + this.rule + ", dataHash=" + this.dataHash + ", error=" + this.error + ')';
        }
    }

    void a(List<Data> dataList);
}
