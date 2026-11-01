package com.mbridge.msdk.foundation.controller.authoritycontroller;

import android.text.TextUtils;

/* JADX INFO: compiled from: BaseAuthorityInfoBean.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f34578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34581d;

    public void a(int i10) {
        this.f34578a = i10;
        this.f34579b = i10;
        this.f34580c = i10;
    }

    public void authDeviceIdStatus(int i10) {
        this.f34579b = i10;
    }

    public void authGenDataStatus(int i10) {
        this.f34578a = i10;
    }

    public void authOtherDataStatus(int i10) {
        this.f34581d = i10;
    }

    public void authSerialIdStatus(int i10) {
        this.f34580c = i10;
    }

    public int getAuthDeviceIdStatus() {
        return this.f34579b;
    }

    public int getAuthGenDataStatus() {
        return this.f34578a;
    }

    public int getAuthSerialIdStatus() {
        return this.f34580c;
    }

    public int getOtherDataStatus() {
        return this.f34581d;
    }

    public int getStatusByKey(String str) {
        if (!TextUtils.isEmpty(str)) {
            str.hashCode();
            switch (str) {
                case "authority_serial_id":
                    return this.f34580c;
                case "authority_device_id":
                    return this.f34579b;
                case "authority_general_data":
                    return this.f34578a;
                case "authority_other":
                    return this.f34581d;
            }
        }
        return 1;
    }
}
