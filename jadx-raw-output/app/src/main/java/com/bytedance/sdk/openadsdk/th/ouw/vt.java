package com.bytedance.sdk.openadsdk.th.ouw;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.utils.qbp;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class vt {
    private byte[] fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public Bitmap f13355lh;
    public Drawable ouw;
    public Bitmap vt;
    public int yu;

    public vt(Drawable drawable, int i10) {
        this.fkw = null;
        this.vt = null;
        this.f13355lh = null;
        this.ouw = drawable;
        this.yu = i10;
    }

    public final byte[] ouw() {
        try {
            if (this.fkw == null) {
                Bitmap bitmap = this.vt;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bitmap.getByteCount());
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                this.fkw = byteArrayOutputStream.toByteArray();
            }
        } catch (OutOfMemoryError e10) {
            qbp.lh("GifRequestResult", e10.getMessage());
        }
        return this.fkw;
    }

    public final boolean vt() {
        if (this.vt != null || this.ouw != null) {
            return true;
        }
        byte[] bArr = this.fkw;
        return bArr != null && bArr.length > 0;
    }

    public vt(byte[] bArr, int i10) {
        this.ouw = null;
        this.vt = null;
        this.f13355lh = null;
        this.fkw = bArr;
        this.yu = i10;
    }

    public vt(Bitmap bitmap, Bitmap bitmap2, int i10) {
        this.ouw = null;
        this.fkw = null;
        this.f13355lh = bitmap2;
        this.vt = bitmap;
        this.yu = i10;
    }
}
