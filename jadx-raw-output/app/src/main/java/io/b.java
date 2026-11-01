package io;

import org.fourthline.cling.support.model.RecordQualityMode;
import org.fourthline.cling.support.model.StorageMedium;

/* JADX INFO: compiled from: DeviceCapabilities.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public StorageMedium[] f58487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public StorageMedium[] f58488b = {StorageMedium.NOT_IMPLEMENTED};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecordQualityMode[] f58489c = {RecordQualityMode.NOT_IMPLEMENTED};

    public StorageMedium[] a() {
        return this.f58487a;
    }

    public StorageMedium[] b() {
        return this.f58488b;
    }

    public RecordQualityMode[] c() {
        return this.f58489c;
    }

    public b(StorageMedium[] storageMediumArr) {
        this.f58487a = storageMediumArr;
    }
}
