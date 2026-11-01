package io.bidmachine.analytics.internal;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006R\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\b\u0010\u0014¨\u0006\u0019"}, d2 = {"Lio/bidmachine/analytics/internal/T;", "", "", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "id", "b", "d", "name", "e", JsonStorageKeyNames.SESSION_ID_KEY, "", "J", InneractiveMediationDefs.GENDER_FEMALE, "()J", "timestamp", "", "[B", "()[B", "data", "error", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J[B[B)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String sessionId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long timestamp;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final byte[] data;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final byte[] error;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte[] getData() {
        return this.data;
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
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public T(String str, String str2, String str3, long j10, byte[] bArr, byte[] bArr2) {
        this.id = str;
        this.name = str2;
        this.sessionId = str3;
        this.timestamp = j10;
        this.data = bArr;
        this.error = bArr2;
    }
}
