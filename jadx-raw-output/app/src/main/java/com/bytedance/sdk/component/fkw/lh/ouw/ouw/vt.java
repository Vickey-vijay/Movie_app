package com.bytedance.sdk.component.fkw.lh.ouw.ouw;

import android.util.Log;
import com.bytedance.sdk.component.utils.tlj;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes8.dex */
public final class vt implements com.bytedance.sdk.component.fkw.lh {
    private long ouw;
    private ouw vt;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.sdk.component.fkw.ouw
    /* JADX INFO: renamed from: lh, reason: merged with bridge method [inline-methods] */
    public boolean vt(String str) {
        try {
            try {
                ouw.lh lhVarOuw = this.vt.ouw(str);
                boolean z10 = lhVarOuw != null;
                tlj.ouw(lhVarOuw);
                return z10;
            } catch (IOException e10) {
                Log.w("LruCountDiskCache", e10.getMessage());
                tlj.ouw(null);
                return false;
            }
        } catch (Throwable th2) {
            tlj.ouw(null);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.sdk.component.fkw.ouw
    /* JADX INFO: renamed from: vt, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] ouw(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        ouw ouwVar = this.vt;
        InputStream inputStream2 = null;
        if (ouwVar == null || str == null) {
            return null;
        }
        try {
            ouw.lh lhVarOuw = ouwVar.ouw(str);
            if (lhVarOuw == null) {
                tlj.ouw(null);
                tlj.ouw(null);
                return null;
            }
            inputStream = lhVarOuw.ouw[0];
            if (inputStream != null) {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i10 = inputStream.read(bArr);
                                if (i10 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i10);
                            }
                        } catch (IOException e10) {
                            e = e10;
                            Log.w("LruCountDiskCache", e.toString());
                            tlj.ouw(inputStream);
                            tlj.ouw(byteArrayOutputStream);
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream2 = inputStream;
                        tlj.ouw(inputStream2);
                        tlj.ouw(byteArrayOutputStream);
                        throw th;
                    }
                } catch (IOException e11) {
                    e = e11;
                    byteArrayOutputStream = null;
                    Log.w("LruCountDiskCache", e.toString());
                    tlj.ouw(inputStream);
                    tlj.ouw(byteArrayOutputStream);
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    byteArrayOutputStream = null;
                    inputStream2 = inputStream;
                    tlj.ouw(inputStream2);
                    tlj.ouw(byteArrayOutputStream);
                    throw th;
                }
            } else {
                byteArrayOutputStream = null;
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            tlj.ouw(inputStream);
            tlj.ouw(byteArrayOutputStream);
            return byteArray;
        } catch (IOException e12) {
            e = e12;
            inputStream = null;
            byteArrayOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
            tlj.ouw(inputStream2);
            tlj.ouw(byteArrayOutputStream);
            throw th;
        }
        Log.w("LruCountDiskCache", e.toString());
        tlj.ouw(inputStream);
        tlj.ouw(byteArrayOutputStream);
        return null;
    }

    public vt(File file, long j10, ExecutorService executorService) {
        this.ouw = j10;
        try {
            this.vt = ouw.ouw(file, j10, executorService);
        } catch (IOException e10) {
            Log.w("LruCountDiskCache", e10.toString());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.fkw.lh
    public final InputStream ouw(String str) {
        ouw ouwVar = this.vt;
        if (ouwVar == null) {
            return null;
        }
        try {
            ouw.lh lhVarOuw = ouwVar.ouw(str);
            if (lhVarOuw != null) {
                return lhVarOuw.ouw[0];
            }
        } catch (IOException e10) {
            Log.w("LruCountDiskCache", e10.getMessage());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // com.bytedance.sdk.component.fkw.ouw
    public boolean ouw(String str, byte[] bArr) throws Throwable {
        ouw ouwVar = this.vt;
        if (ouwVar == null || bArr == null || str == null) {
            return false;
        }
        ouw.C0088ouw c0088ouw = null;
        ?? r10 = 0;
        try {
            try {
                ouw.C0088ouw c0088ouwVt = ouwVar.vt(str);
                try {
                    if (c0088ouwVt == null) {
                        Log.w("LruCountDiskCache", "save " + str + " failed for edit null");
                        tlj.ouw(null);
                        return false;
                    }
                    OutputStream outputStreamOuw = c0088ouwVt.ouw();
                    if (outputStreamOuw == ouw.f11704lh) {
                        Log.w("LruCountDiskCache", "save " + str + " failed for null OutputStream");
                        tlj.ouw(outputStreamOuw);
                        return false;
                    }
                    outputStreamOuw.write(bArr);
                    if (c0088ouwVt.f11712lh) {
                        ouw.this.ouw(c0088ouwVt, false);
                        ouw.this.lh(c0088ouwVt.ouw.ouw);
                    } else {
                        ouw.this.ouw(c0088ouwVt, true);
                    }
                    c0088ouwVt.yu = true;
                    this.vt.ouw();
                    tlj.ouw(outputStreamOuw);
                    return true;
                } catch (IOException e10) {
                    e = e10;
                    c0088ouw = c0088ouwVt;
                    try {
                        Log.w("LruCountDiskCache", e.toString());
                        if (c0088ouw != null) {
                            try {
                                c0088ouw.vt();
                            } catch (IOException unused) {
                            }
                        }
                        tlj.ouw(0);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        r10 = c0088ouw;
                        tlj.ouw(r10);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                tlj.ouw(r10);
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }
}
