package io;

import org.fourthline.cling.support.model.RecordMediumWriteStatus;
import org.fourthline.cling.support.model.StorageMedium;

/* JADX INFO: compiled from: MediaInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f61002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f61003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f61004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f61005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public org.fourthline.cling.model.types.b f61006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f61007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public StorageMedium f61008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public StorageMedium f61009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RecordMediumWriteStatus f61010i;

    public c() {
        this.f61002a = "";
        this.f61003b = "";
        this.f61004c = "NOT_IMPLEMENTED";
        this.f61005d = "NOT_IMPLEMENTED";
        this.f61006e = new org.fourthline.cling.model.types.b(0L);
        this.f61007f = "00:00:00";
        this.f61008g = StorageMedium.NONE;
        this.f61009h = StorageMedium.NOT_IMPLEMENTED;
        this.f61010i = RecordMediumWriteStatus.NOT_IMPLEMENTED;
    }

    public String a() {
        return this.f61002a;
    }

    public String b() {
        return this.f61003b;
    }

    public String c() {
        return this.f61007f;
    }

    public String d() {
        return this.f61004c;
    }

    public String e() {
        return this.f61005d;
    }

    public org.fourthline.cling.model.types.b f() {
        return this.f61006e;
    }

    public StorageMedium g() {
        return this.f61009h;
    }

    public RecordMediumWriteStatus h() {
        return this.f61010i;
    }

    public c(String str, String str2) {
        this.f61002a = "";
        this.f61003b = "";
        this.f61004c = "NOT_IMPLEMENTED";
        this.f61005d = "NOT_IMPLEMENTED";
        this.f61006e = new org.fourthline.cling.model.types.b(0L);
        this.f61007f = "00:00:00";
        this.f61008g = StorageMedium.NONE;
        this.f61009h = StorageMedium.NOT_IMPLEMENTED;
        this.f61010i = RecordMediumWriteStatus.NOT_IMPLEMENTED;
        this.f61002a = str;
        this.f61003b = str2;
    }
}
