package com.bytedance.sdk.component.fkw.yu.lh.ouw.ouw;

import com.bytedance.sdk.component.fkw.lh;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.tlj;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes11.dex */
public final class vt implements lh {
    private int ouw;
    private ouw vt;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.sdk.component.fkw.ouw
    /* JADX INFO: renamed from: lh, reason: merged with bridge method [inline-methods] */
    public boolean vt(String str) {
        try {
            InputStream inputStreamOuw = this.vt.ouw(str);
            boolean z10 = inputStreamOuw != null;
            tlj.ouw(inputStreamOuw);
            return z10;
        } catch (Throwable th2) {
            try {
                ko.yu("LruCountDiskCache", th2.getMessage());
                return false;
            } finally {
                tlj.ouw(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.sdk.component.fkw.ouw
    /* JADX INFO: renamed from: vt, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] ouw(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th2;
        InputStream inputStreamOuw;
        ouw ouwVar = this.vt;
        if (ouwVar == null || str == null) {
            return null;
        }
        try {
            inputStreamOuw = ouwVar.ouw(str);
            if (inputStreamOuw != null) {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i10 = inputStreamOuw.read(bArr);
                                if (i10 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i10);
                            }
                        } catch (IOException e10) {
                            e = e10;
                            ko.yu("LruCountDiskCache", e.toString());
                            tlj.ouw(inputStreamOuw);
                            tlj.ouw(byteArrayOutputStream);
                            return null;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        tlj.ouw(inputStreamOuw);
                        tlj.ouw(byteArrayOutputStream);
                        throw th2;
                    }
                } catch (IOException e11) {
                    e = e11;
                    byteArrayOutputStream = null;
                    ko.yu("LruCountDiskCache", e.toString());
                    tlj.ouw(inputStreamOuw);
                    tlj.ouw(byteArrayOutputStream);
                    return null;
                } catch (Throwable th4) {
                    th2 = th4;
                    byteArrayOutputStream = null;
                    tlj.ouw(inputStreamOuw);
                    tlj.ouw(byteArrayOutputStream);
                    throw th2;
                }
            } else {
                byteArrayOutputStream = null;
            }
            if (byteArrayOutputStream != null) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                tlj.ouw(inputStreamOuw);
                tlj.ouw(byteArrayOutputStream);
                return byteArray;
            }
        } catch (IOException e12) {
            e = e12;
            inputStreamOuw = null;
            byteArrayOutputStream = null;
        } catch (Throwable th5) {
            byteArrayOutputStream = null;
            th2 = th5;
            inputStreamOuw = null;
        }
        tlj.ouw(inputStreamOuw);
        tlj.ouw(byteArrayOutputStream);
        return null;
    }

    @Override // com.bytedance.sdk.component.fkw.ouw
    public final /* bridge */ /* synthetic */ boolean ouw(String str, byte[] bArr) {
        String str2 = str;
        byte[] bArr2 = bArr;
        ouw ouwVar = this.vt;
        if (ouwVar == null || bArr2 == null || str2 == null) {
            return false;
        }
        return ouwVar.ouw(str2, bArr2);
    }

    public vt(File file, long j10) {
        int i10 = (int) j10;
        this.ouw = i10;
        this.vt = ouw.ouw(i10, file);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.fkw.lh
    public final InputStream ouw(String str) {
        ouw ouwVar = this.vt;
        if (ouwVar == null) {
            return null;
        }
        return ouwVar.ouw(str);
    }
}
