package com.bytedance.sdk.component.fkw.yu.lh.ouw.vt;

import android.support.v4.media.session.PlaybackStateCompat;
import com.bytedance.sdk.component.fkw.vm;

/* JADX INFO: loaded from: classes2.dex */
public class vt implements vm {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f11764lh;
    private long ouw = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    private int vt;
    private com.bytedance.sdk.component.fkw.yu.lh.ouw.lh<String, byte[]> yu;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.sdk.component.fkw.ouw
    public boolean vt(String str) {
        try {
            return this.yu.ouw(str) != null;
        } catch (Throwable unused) {
        }
    }

    public vt(int i10, int i11) {
        this.f11764lh = i10;
        this.vt = i11;
        this.yu = new com.bytedance.sdk.component.fkw.yu.lh.ouw.lh<>(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.sdk.component.fkw.ouw
    public boolean ouw(String str, byte[] bArr) {
        if (str != null && bArr != null) {
            try {
                if (bArr.length > this.ouw) {
                    return false;
                }
                this.yu.ouw(str, bArr);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.sdk.component.fkw.ouw
    public byte[] ouw(String str) {
        try {
            return this.yu.ouw(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
