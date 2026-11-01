package sg.bigo.ads.core.player.a.a;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import sg.bigo.ads.common.utils.f;
import sg.bigo.ads.core.d.b;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements sg.bigo.ads.core.player.a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f71753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sg.bigo.ads.common.h.a f71754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RandomAccessFile f71755c;

    public a(sg.bigo.ads.common.h.a aVar) {
        try {
            this.f71754b = aVar;
            File file = new File(aVar.a());
            this.f71753a = file;
            this.f71753a = file.exists() ? this.f71753a : new File(this.f71753a.getParentFile(), f.c(this.f71753a.getName()));
            this.f71755c = new RandomAccessFile(this.f71753a, "r");
        } catch (IOException e10) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error using file " + this.f71753a + " as disc cache, error message is : " + e10.toString());
        }
    }

    @Override // sg.bigo.ads.core.player.a.a
    public final synchronized int a(byte[] bArr, long j10) {
        int i10;
        i10 = 0;
        try {
            this.f71755c.seek(j10);
            i10 = this.f71755c.read(bArr, 0, 8192);
        } catch (IOException e10) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error reading 8192 bytes with offset " + j10 + " from file[" + a() + " bytes] to buffer[" + bArr.length + " bytes], error message is : " + e10.toString());
        }
        return i10;
    }

    @Override // sg.bigo.ads.core.player.a.a
    public final synchronized long a() {
        long length;
        try {
            length = this.f71755c.length();
        } catch (IOException e10) {
            b.a(3005, 10112, e10.toString());
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error reading length of file " + this.f71753a + ", error message is : " + e10.toString());
            length = 0;
        }
        return length;
    }

    @Override // sg.bigo.ads.core.player.a.a
    public final synchronized void b() {
        try {
            this.f71755c.close();
        } catch (IOException e10) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error closing file " + this.f71753a + ", error message is : " + e10.toString());
        }
    }

    @Override // sg.bigo.ads.core.player.a.a
    public final synchronized boolean c() {
        return this.f71754b.b();
    }
}
