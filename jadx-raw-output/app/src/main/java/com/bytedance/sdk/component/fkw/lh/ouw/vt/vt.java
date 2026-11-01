package com.bytedance.sdk.component.fkw.lh.ouw.vt;

import com.bytedance.sdk.component.fkw.vm;

/* JADX INFO: loaded from: classes.dex */
public final class vt implements vm {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private com.bytedance.sdk.component.fkw.lh.ouw.lh<String, byte[]> f11716lh;
    private int ouw = Integer.MAX_VALUE;
    private int vt;

    @Override // com.bytedance.sdk.component.fkw.ouw
    public final /* bridge */ /* synthetic */ byte[] ouw(String str) {
        return this.f11716lh.ouw(str);
    }

    @Override // com.bytedance.sdk.component.fkw.ouw
    public final /* synthetic */ boolean vt(String str) {
        return this.f11716lh.ouw(str) != null;
    }

    public vt(int i10) {
        this.vt = i10;
        this.f11716lh = new com.bytedance.sdk.component.fkw.lh.ouw.lh<String, byte[]>(i10) { // from class: com.bytedance.sdk.component.fkw.lh.ouw.vt.vt.1
            @Override // com.bytedance.sdk.component.fkw.lh.ouw.lh
            public final /* bridge */ /* synthetic */ int vt(byte[] bArr) {
                byte[] bArr2 = bArr;
                if (bArr2 == null) {
                    return 0;
                }
                return bArr2.length;
            }
        };
    }

    @Override // com.bytedance.sdk.component.fkw.ouw
    public final /* bridge */ /* synthetic */ boolean ouw(String str, byte[] bArr) {
        String str2 = str;
        byte[] bArr2 = bArr;
        if (str2 == null || bArr2 == null) {
            return false;
        }
        this.f11716lh.ouw(str2, bArr2);
        return true;
    }
}
