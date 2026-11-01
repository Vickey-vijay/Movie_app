package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.j;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: ConnectionSpecSelector.java */
/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<j> f37541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37542b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f37543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f37544d;

    public j a(SSLSocket sSLSocket) throws IOException {
        j jVar;
        int i10 = this.f37542b;
        int size = this.f37541a.size();
        while (true) {
            if (i10 >= size) {
                jVar = null;
                break;
            }
            jVar = this.f37541a.get(i10);
            if (jVar.a(sSLSocket)) {
                this.f37542b = i10 + 1;
                break;
            }
            i10++;
        }
        if (jVar != null) {
            this.f37543c = b(sSLSocket);
            com.mbridge.msdk.thrid.okhttp.internal.a.f37503a.a(jVar, sSLSocket, this.f37544d);
            return jVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f37544d + ", modes=" + this.f37541a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    private boolean b(SSLSocket sSLSocket) {
        for (int i10 = this.f37542b; i10 < this.f37541a.size(); i10++) {
            if (this.f37541a.get(i10).a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public b(List<j> list) {
        this.f37541a = list;
    }

    public boolean a(IOException iOException) {
        this.f37544d = true;
        if (!this.f37543c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z10 = iOException instanceof SSLHandshakeException;
        if ((z10 && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return z10 || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException);
    }
}
