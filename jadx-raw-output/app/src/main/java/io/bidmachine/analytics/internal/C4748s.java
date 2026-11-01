package io.bidmachine.analytics.internal;

import kotlin.Metadata;

/* JADX INFO: renamed from: io.bidmachine.analytics.internal.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0004\u0010\f¨\u0006\u0010"}, d2 = {"Lio/bidmachine/analytics/internal/s;", "", "", "data", "a", "([B)[B", "Lio/bidmachine/analytics/internal/b;", "Lio/bidmachine/analytics/internal/b;", "algorithm", "Lio/bidmachine/analytics/internal/C;", "b", "Lio/bidmachine/analytics/internal/C;", "()Lio/bidmachine/analytics/internal/C;", "keyManager", "<init>", "(Lio/bidmachine/analytics/internal/b;Lio/bidmachine/analytics/internal/C;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class C4748s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4732b algorithm;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C keyManager;

    public final byte[] a(byte[] data) {
        return this.algorithm.a(this.keyManager.a(), data);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C getKeyManager() {
        return this.keyManager;
    }

    public C4748s(InterfaceC4732b interfaceC4732b, C c10) {
        this.algorithm = interfaceC4732b;
        this.keyManager = c10;
    }
}
