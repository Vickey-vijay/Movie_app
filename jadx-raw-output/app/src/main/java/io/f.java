package io;

import org.fourthline.cling.support.model.TransportState;
import org.fourthline.cling.support.model.TransportStatus;

/* JADX INFO: compiled from: TransportInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TransportState f61019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TransportStatus f61020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f61021c;

    public f() {
        this.f61019a = TransportState.NO_MEDIA_PRESENT;
        this.f61020b = TransportStatus.OK;
        this.f61021c = "1";
    }

    public String a() {
        return this.f61021c;
    }

    public TransportState b() {
        return this.f61019a;
    }

    public TransportStatus c() {
        return this.f61020b;
    }

    public f(TransportState transportState, TransportStatus transportStatus, String str) {
        this.f61019a = TransportState.NO_MEDIA_PRESENT;
        TransportStatus transportStatus2 = TransportStatus.OK;
        this.f61019a = transportState;
        this.f61020b = transportStatus;
        this.f61021c = str;
    }
}
