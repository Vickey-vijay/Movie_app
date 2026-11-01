package f0;

import android.text.TextUtils;
import com.danikula.videocache.ProxyCacheException;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Locale;

/* JADX INFO: compiled from: HttpProxyCache.java */
/* JADX INFO: loaded from: classes9.dex */
public class e extends l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h f52774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g0.b f52775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f52776k;

    @Override // f0.l
    public void g(int i10) {
        b bVar = this.f52776k;
        if (bVar != null) {
            bVar.a(this.f52775j.f53007b, this.f52774i.e(), i10);
        }
    }

    public final String p(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public final boolean q(d dVar) throws ProxyCacheException {
        long length = this.f52774i.length();
        return (((length > 0L ? 1 : (length == 0L ? 0 : -1)) > 0) && dVar.f52773c && ((float) dVar.f52772b) > ((float) this.f52775j.available()) + (((float) length) * 0.2f)) ? false : true;
    }

    public final String r(d dVar) throws IOException, ProxyCacheException {
        String strD = this.f52774i.d();
        boolean z10 = !TextUtils.isEmpty(strD);
        long jAvailable = this.f52775j.d() ? this.f52775j.available() : this.f52774i.length();
        boolean z11 = jAvailable >= 0;
        boolean z12 = dVar.f52773c;
        long j10 = z12 ? jAvailable - dVar.f52772b : jAvailable;
        boolean z13 = z11 && z12;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(dVar.f52773c ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n");
        sb2.append("Accept-Ranges: bytes\n");
        sb2.append(z11 ? p("Content-Length: %d\n", Long.valueOf(j10)) : "");
        sb2.append(z13 ? p("Content-Range: bytes %d-%d/%d\n", Long.valueOf(dVar.f52772b), Long.valueOf(jAvailable - 1), Long.valueOf(jAvailable)) : "");
        sb2.append(z10 ? p("Content-Type: %s\n", strD) : "");
        sb2.append("\n");
        return sb2.toString();
    }

    public void s(d dVar, Socket socket) throws IOException, ProxyCacheException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(r(dVar).getBytes("UTF-8"));
        long j10 = dVar.f52772b;
        if (q(dVar)) {
            u(bufferedOutputStream, j10);
        } else {
            v(bufferedOutputStream, j10);
        }
    }

    public void t(b bVar) {
        this.f52776k = bVar;
    }

    public final void u(OutputStream outputStream, long j10) throws IOException, ProxyCacheException {
        byte[] bArr = new byte[8192];
        while (true) {
            int iJ = j(bArr, j10, 8192);
            if (iJ == -1) {
                outputStream.flush();
                return;
            } else {
                outputStream.write(bArr, 0, iJ);
                j10 += (long) iJ;
            }
        }
    }

    public final void v(OutputStream outputStream, long j10) throws IOException, ProxyCacheException {
        h hVar = new h(this.f52774i);
        try {
            hVar.a((int) j10);
            byte[] bArr = new byte[8192];
            while (true) {
                int i10 = hVar.read(bArr);
                if (i10 == -1) {
                    outputStream.flush();
                    return;
                }
                outputStream.write(bArr, 0, i10);
            }
        } finally {
            hVar.close();
        }
    }

    public e(h hVar, g0.b bVar) {
        super(hVar, bVar);
        this.f52775j = bVar;
        this.f52774i = hVar;
    }
}
