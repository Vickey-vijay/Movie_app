package com.inmobi.media;

import java.io.FileInputStream;
import java.io.IOException;
import okio.Buffer;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes7.dex */
public final class S6 extends AbstractC3236ui {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23488a;

    @Override // com.inmobi.media.AbstractC3236ui
    public final String a() {
        return com.ironsource.G5.L;
    }

    public S6(String str) {
        ck.p.j(str, com.ironsource.Y5.c.f27928b);
        ck.p.j(com.ironsource.G5.L, "contentType");
        this.f23488a = str;
    }

    @Override // com.inmobi.media.AbstractC3236ui
    public final void a(BufferedSink bufferedSink) throws IOException {
        ck.p.j(bufferedSink, "bufferedSink");
        String str = this.f23488a;
        ck.p.j(str, com.ironsource.Y5.c.f27929c);
        Buffer buffer = new Buffer();
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            buffer.readFrom(fileInputStream);
            yj.b.a(fileInputStream, null);
            try {
                try {
                    try {
                        bufferedSink.writeAll(buffer);
                        ck.p.j(buffer, "<this>");
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            yj.b.a(buffer, th2);
                            throw th3;
                        }
                    }
                } catch (IOException e10) {
                    throw e10;
                } catch (Exception unused) {
                    mj.r rVar = mj.r.f64562a;
                    ck.p.j(buffer, "<this>");
                }
                try {
                    buffer.close();
                } catch (IOException unused2) {
                }
                yj.b.a(buffer, null);
            } catch (Throwable th4) {
                ck.p.j(buffer, "<this>");
                try {
                    buffer.close();
                } catch (IOException unused3) {
                }
                throw th4;
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                yj.b.a(fileInputStream, th5);
                throw th6;
            }
        }
    }
}
