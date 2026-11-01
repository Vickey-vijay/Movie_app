package io.bidmachine.analytics.internal;

import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR(\u0010\u0015\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014¨\u0006\u0019"}, d2 = {"Lio/bidmachine/analytics/internal/L;", "", "", "line", "Lmj/r;", "a", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "I", "maxBufferSize", "Ljava/lang/StringBuffer;", "b", "Ljava/lang/StringBuffer;", "buffer", "", "<set-?>", "c", "Ljava/lang/Long;", "()Ljava/lang/Long;", "lastAddedTimestamp", "capacity", "<init>", "(II)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int maxBufferSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final StringBuffer buffer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Long lastAddedTimestamp;

    public final void a(String line) throws IOException {
        if (this.buffer.length() + line.length() < this.maxBufferSize) {
            this.buffer.append((CharSequence) line).append('\n');
            this.lastAddedTimestamp = Long.valueOf(System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getLastAddedTimestamp() {
        return this.lastAddedTimestamp;
    }

    public String toString() {
        return this.buffer.toString();
    }

    public L(int i10, int i11) {
        this.maxBufferSize = i11;
        this.buffer = new StringBuffer(i10);
    }
}
