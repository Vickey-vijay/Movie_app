package io.bidmachine.analytics;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lio/bidmachine/analytics/MonitorConfig;", "", "", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "b", "getUrl", "url", "", "c", "I", "getBatchSize", "()I", "batchSize", "", "d", "J", "getInterval", "()J", "interval", "", "e", "Z", "isReportEnabled", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJZ)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class MonitorConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int batchSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long interval;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isReportEnabled;

    public MonitorConfig(String str, String str2, int i10, long j10, boolean z10) {
        this.name = str;
        this.url = str2;
        this.batchSize = i10;
        this.interval = j10;
        this.isReportEnabled = z10;
    }

    public final int getBatchSize() {
        return this.batchSize;
    }

    public final long getInterval() {
        return this.interval;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: isReportEnabled, reason: from getter */
    public final boolean getIsReportEnabled() {
        return this.isReportEnabled;
    }
}
