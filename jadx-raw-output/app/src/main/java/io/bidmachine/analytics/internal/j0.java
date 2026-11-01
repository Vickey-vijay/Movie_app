package io.bidmachine.analytics.internal;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006R\u0017\u0010\u0016\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\b\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001e"}, d2 = {"Lio/bidmachine/analytics/internal/j0;", "", "", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "id", "b", "d", "name", "", "J", InneractiveMediationDefs.GENDER_FEMALE, "()J", "timestamp", "dataHash", "e", "rule", "", "[B", "()[B", "error", "", "g", "Z", "()Z", "isDirty", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;[BZ)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long timestamp;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String dataHash;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String rule;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final byte[] error;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean isDirty;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDataHash() {
        return this.dataHash;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final byte[] getError() {
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
    public final String getRule() {
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

    public j0(String str, String str2, long j10, String str3, String str4, byte[] bArr, boolean z10) {
        this.id = str;
        this.name = str2;
        this.timestamp = j10;
        this.dataHash = str3;
        this.rule = str4;
        this.error = bArr;
        this.isDirty = z10;
    }
}
