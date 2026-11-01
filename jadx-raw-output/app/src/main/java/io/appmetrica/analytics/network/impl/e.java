package io.appmetrica.analytics.network.impl;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import mj.r;

/* JADX INFO: loaded from: classes8.dex */
public abstract class e {
    public static byte[] a(int i10, bk.a aVar) {
        try {
            InputStream inputStream = (InputStream) aVar.invoke();
            if (inputStream != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            byte[] bArr = new byte[8192];
                            int i11 = 0;
                            while (true) {
                                int i12 = inputStream.read(bArr);
                                if (-1 == i12 || i11 > i10) {
                                    break;
                                    break;
                                }
                                if (i12 > 0) {
                                    byteArrayOutputStream.write(bArr, 0, i12);
                                    i11 += i12;
                                }
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            yj.b.a(byteArrayOutputStream, null);
                            yj.b.a(inputStream, null);
                            return byteArray;
                        } catch (Throwable unused) {
                            r rVar = r.f64562a;
                            yj.b.a(byteArrayOutputStream, null);
                            yj.b.a(inputStream, null);
                            return new byte[0];
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            yj.b.a(byteArrayOutputStream, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        yj.b.a(inputStream, th4);
                        throw th5;
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return new byte[0];
    }

    public static final Map a(Map map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }
}
