package com.bytedance.sdk.component.fkw.yu.lh.ouw.vt;

import android.graphics.Bitmap;
import android.support.v4.media.session.PlaybackStateCompat;
import com.bytedance.sdk.component.fkw.zih;

/* JADX INFO: loaded from: classes9.dex */
public final class ouw implements zih {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f11763lh;
    private long ouw = PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED;
    private int vt;
    private com.bytedance.sdk.component.fkw.yu.lh.ouw.lh<String, Bitmap> yu;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.sdk.component.fkw.ouw
    public boolean vt(String str) {
        try {
            return this.yu.ouw(str) != null;
        } catch (Throwable unused) {
        }
    }

    public ouw(int i10, int i11) {
        this.vt = i11;
        this.f11763lh = i10;
        this.yu = new com.bytedance.sdk.component.fkw.yu.lh.ouw.lh<>(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.sdk.component.fkw.ouw
    public Bitmap ouw(String str) {
        try {
            return this.yu.ouw(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.sdk.component.fkw.ouw
    public boolean ouw(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            try {
                int allocationByteCount = bitmap.getAllocationByteCount();
                if (allocationByteCount <= this.ouw && allocationByteCount != 0) {
                    this.yu.ouw(str, bitmap);
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
