package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: Okio.java */
/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f38056a = Logger.getLogger(l.class.getName());

    /* JADX INFO: compiled from: Okio.java */
    public static class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f38057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ OutputStream f38058b;

        public a(t tVar, OutputStream outputStream) {
            this.f38057a = tVar;
            this.f38058b = outputStream;
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            u.a(cVar.f38037b, 0L, j10);
            while (j10 > 0) {
                this.f38057a.e();
                o oVar = cVar.f38036a;
                int iMin = (int) Math.min(j10, oVar.f38071c - oVar.f38070b);
                this.f38058b.write(oVar.f38069a, oVar.f38070b, iMin);
                int i10 = oVar.f38070b + iMin;
                oVar.f38070b = i10;
                long j11 = iMin;
                j10 -= j11;
                cVar.f38037b -= j11;
                if (i10 == oVar.f38071c) {
                    cVar.f38036a = oVar.b();
                    p.a(oVar);
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return this.f38057a;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f38058b.close();
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            this.f38058b.flush();
        }

        public String toString() {
            return "sink(" + this.f38058b + ")";
        }
    }

    /* JADX INFO: compiled from: Okio.java */
    public static class b implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f38059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InputStream f38060b;

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            if (j10 == 0) {
                return 0L;
            }
            try {
                this.f38059a.e();
                o oVarB = cVar.b(1);
                int i10 = this.f38060b.read(oVarB.f38069a, oVarB.f38071c, (int) Math.min(j10, 8192 - oVarB.f38071c));
                if (i10 == -1) {
                    return -1L;
                }
                oVarB.f38071c += i10;
                long j11 = i10;
                cVar.f38037b += j11;
                return j11;
            } catch (AssertionError e10) {
                if (l.a(e10)) {
                    throw new IOException(e10);
                }
                throw e10;
            }
        }

        public b(t tVar, InputStream inputStream) {
            this.f38059a = tVar;
            this.f38060b = inputStream;
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f38060b.close();
        }

        public String toString() {
            return "source(" + this.f38060b + ")";
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return this.f38059a;
        }
    }

    /* JADX INFO: compiled from: Okio.java */
    public static class c extends com.mbridge.msdk.thrid.okio.a {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Socket f38061k;

        public c(Socket socket) {
            this.f38061k = socket;
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public IOException b(@Nullable IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public void j() {
            try {
                this.f38061k.close();
            } catch (AssertionError e10) {
                if (!l.a(e10)) {
                    throw e10;
                }
                l.f38056a.log(Level.WARNING, "Failed to close timed out socket " + this.f38061k, (Throwable) e10);
            } catch (Exception e11) {
                l.f38056a.log(Level.WARNING, "Failed to close timed out socket " + this.f38061k, (Throwable) e11);
            }
        }
    }

    public static e a(s sVar) {
        return new n(sVar);
    }

    public static d a(r rVar) {
        return new m(rVar);
    }

    public static s b(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        com.mbridge.msdk.thrid.okio.a aVarC = c(socket);
        return aVarC.a(a(socket.getInputStream(), aVarC));
    }

    private static com.mbridge.msdk.thrid.okio.a c(Socket socket) {
        return new c(socket);
    }

    private l() {
    }

    private static r a(OutputStream outputStream, t tVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (tVar != null) {
            return new a(tVar, outputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static r a(Socket socket) throws IOException {
        if (socket != null) {
            if (socket.getOutputStream() != null) {
                com.mbridge.msdk.thrid.okio.a aVarC = c(socket);
                return aVarC.a(a(socket.getOutputStream(), aVarC));
            }
            throw new IOException("socket's output stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static s a(InputStream inputStream) {
        return a(inputStream, new t());
    }

    private static s a(InputStream inputStream, t tVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (tVar != null) {
            return new b(tVar, inputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
