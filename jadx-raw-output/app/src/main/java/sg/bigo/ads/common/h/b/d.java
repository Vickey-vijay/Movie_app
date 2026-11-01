package sg.bigo.ads.common.h.b;

import android.content.Context;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f69709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InputStream f69710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f69711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f69712d;

    public d(Context context, a aVar) {
        this.f69712d = context;
        this.f69709a = aVar;
        sg.bigo.ads.common.h.a aVar2 = aVar.f69703b;
        this.f69711c = new File(aVar2.f69661c, sg.bigo.ads.common.utils.f.c(aVar2.f69662d));
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0195  */
    /* JADX WARN: Code duplicated, block: B:86:0x019b  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:94:0x01be  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c0  */
    private void a() throws Throwable {
        boolean z10;
        RandomAccessFile randomAccessFile;
        String str;
        String str2;
        int i10;
        boolean z11;
        boolean z12;
        String str3;
        String str4 = "the download task error and download state is not loading.";
        String str5 = "the download stream has not been read completely.";
        a("startDownloadTask");
        if (this.f69710b == null) {
            b("downloadStream is null");
            return;
        }
        this.f69709a.f69706e = h.f69720d;
        f.a().a(this.f69709a.f69702a);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f69710b);
        byte[] bArr = new byte[1048576];
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.f69711c, "rwd");
            try {
                long j10 = this.f69709a.f69703b.f69665g;
                randomAccessFile2.seek(j10);
                sg.bigo.ads.common.t.a.a(0, 3, IDownloadTask.TAG, this.f69709a.f69702a + " startDownloadTask.");
                while (true) {
                    int i11 = this.f69709a.f69706e;
                    i10 = h.f69720d;
                    if (i11 != i10) {
                        z11 = false;
                        break;
                    }
                    int i12 = bufferedInputStream.read(bArr, 0, 1048576);
                    if (i12 == -1) {
                        z11 = true;
                        break;
                    }
                    randomAccessFile2.write(bArr, 0, i12);
                    str4 = str4;
                    str5 = str5;
                    j10 += (long) i12;
                    try {
                        this.f69709a.b(j10);
                        f.a().a(this.f69709a.f69702a);
                        str4 = str4;
                        str5 = str5;
                    } catch (Exception e10) {
                        e = e10;
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = false;
                        randomAccessFile = randomAccessFile2;
                        if (!z10) {
                            if (!q.a((CharSequence) "")) {
                                str = "";
                            } else if (this.f69709a.f69703b.f69665g > 0) {
                                str = "the download file has a invalid size.";
                            } else {
                                str = "the download file has a invalid size.";
                            }
                            b("Failed to download due to: ".concat(str));
                        }
                        sg.bigo.ads.common.utils.g.a(randomAccessFile);
                        sg.bigo.ads.common.utils.g.a((Closeable) bufferedInputStream);
                        sg.bigo.ads.common.utils.g.a((Closeable) this.f69710b);
                        throw th;
                    }
                    z10 = false;
                    randomAccessFile = randomAccessFile2;
                    try {
                        String message = e.getMessage();
                        if (!z10) {
                            if (!q.a((CharSequence) message)) {
                                str2 = message;
                            } else if (this.f69709a.f69703b.f69665g <= 0 || this.f69711c.length() <= 0) {
                                str2 = "the download file has a invalid size.";
                            } else {
                                str2 = this.f69709a.f69706e != h.f69720d ? str4 : str5;
                            }
                            b("Failed to download due to: ".concat(String.valueOf(str2)));
                        }
                        sg.bigo.ads.common.utils.g.a(randomAccessFile);
                        sg.bigo.ads.common.utils.g.a((Closeable) bufferedInputStream);
                        sg.bigo.ads.common.utils.g.a((Closeable) this.f69710b);
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        if (!z10) {
                            if (!q.a((CharSequence) "")) {
                                str = "";
                            } else if (this.f69709a.f69703b.f69665g > 0 || this.f69711c.length() <= 0) {
                                str = "the download file has a invalid size.";
                            } else {
                                str = this.f69709a.f69706e != h.f69720d ? str4 : str5;
                            }
                            b("Failed to download due to: ".concat(str));
                        }
                        sg.bigo.ads.common.utils.g.a(randomAccessFile);
                        sg.bigo.ads.common.utils.g.a((Closeable) bufferedInputStream);
                        sg.bigo.ads.common.utils.g.a((Closeable) this.f69710b);
                        throw th;
                    }
                }
                if (z11 && j10 > 0 && this.f69711c.length() == j10 && this.f69709a.f69706e == i10) {
                    File file = this.f69711c;
                    sg.bigo.ads.common.h.a aVar = this.f69709a.f69703b;
                    file.renameTo(new File(aVar.f69661c, aVar.f69662d));
                    this.f69709a.f69706e = h.f69722f;
                    try {
                        f.a().a(this.f69709a.f69702a);
                        a("download is over.");
                        z12 = true;
                    } catch (Exception e11) {
                        e = e11;
                        randomAccessFile = randomAccessFile2;
                        z10 = true;
                    } catch (Throwable th4) {
                        th = th4;
                        randomAccessFile = randomAccessFile2;
                        z10 = true;
                        if (!z10) {
                            if (!q.a((CharSequence) "")) {
                                str = "";
                            } else if (this.f69709a.f69703b.f69665g > 0) {
                                str = "the download file has a invalid size.";
                            } else {
                                str = "the download file has a invalid size.";
                            }
                            b("Failed to download due to: ".concat(str));
                        }
                        sg.bigo.ads.common.utils.g.a(randomAccessFile);
                        sg.bigo.ads.common.utils.g.a((Closeable) bufferedInputStream);
                        sg.bigo.ads.common.utils.g.a((Closeable) this.f69710b);
                        throw th;
                    }
                } else {
                    z12 = false;
                }
                if (!z12) {
                    if (!q.a((CharSequence) "")) {
                        str3 = "";
                    } else if (this.f69709a.f69703b.f69665g <= 0 || this.f69711c.length() <= 0) {
                        str3 = "the download file has a invalid size.";
                    } else {
                        str3 = this.f69709a.f69706e != i10 ? str4 : str5;
                    }
                    b("Failed to download due to: ".concat(str3));
                }
                sg.bigo.ads.common.utils.g.a(randomAccessFile2);
                sg.bigo.ads.common.utils.g.a((Closeable) bufferedInputStream);
                sg.bigo.ads.common.utils.g.a((Closeable) this.f69710b);
            } catch (Exception e12) {
                e = e12;
                str4 = str4;
                str5 = str5;
            } catch (Throwable th5) {
                th = th5;
                str4 = str4;
                str5 = str5;
            }
        } catch (Exception e13) {
            e = e13;
            str4 = "the download task error and download state is not loading.";
            str5 = "the download stream has not been read completely.";
            z10 = false;
            randomAccessFile = null;
        } catch (Throwable th6) {
            th = th6;
            str4 = "the download task error and download state is not loading.";
            str5 = "the download stream has not been read completely.";
            z10 = false;
            randomAccessFile = null;
        }
    }

    private void a(String str) {
        sg.bigo.ads.common.t.a.a(0, 3, IDownloadTask.TAG, str + ",taskId=" + this.f69709a.f69702a + ", downloadinfo = " + this.f69709a.toString());
    }

    private void b(String str) {
        sg.bigo.ads.common.t.a.a(0, IDownloadTask.TAG, str + " , " + this.f69709a.f69702a + " has a error ! " + this.f69709a.toString());
        a aVar = this.f69709a;
        aVar.f69707f = str;
        aVar.f69706e = h.f69723g;
        f.a().a(this.f69709a.f69702a);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean z10;
        while (true) {
            sg.bigo.ads.common.u.b.a aVar = new sg.bigo.ads.common.u.b.a(sg.bigo.ads.common.y.a.a(), new sg.bigo.ads.common.u.b.d(this.f69709a.f69703b.f69660b), this.f69709a.f69703b.f69675q, this.f69712d);
            aVar.f69951l = sg.bigo.ads.common.u.a.e.h();
            String str = "bytes=" + this.f69709a.f69703b.f69665g + "-";
            aVar.a(Command.HTTP_HEADER_RANGE, str);
            a("Range = ".concat(String.valueOf(str)));
            sg.bigo.ads.common.u.c<sg.bigo.ads.common.u.c.a> cVarA = sg.bigo.ads.common.u.g.a(aVar);
            T t10 = cVarA.f69956a;
            if (t10 != 0) {
                sg.bigo.ads.common.u.c.b bVarA = sg.bigo.ads.common.u.c.b.a(((sg.bigo.ads.common.u.c.a) t10).a("Content-Range"));
                long jA = bVarA != null ? bVarA.f69964b : 0L;
                if (jA <= 0) {
                    jA = ((sg.bigo.ads.common.u.c.a) cVarA.f69956a).a();
                }
                this.f69709a.a(jA);
                T t11 = cVarA.f69956a;
                this.f69710b = ((sg.bigo.ads.common.u.c.a) t11).f69959b;
                this.f69709a.f69703b.f69674p = ((sg.bigo.ads.common.u.c.a) t11).a("Content-Type");
                z10 = true;
                if (!this.f69711c.exists()) {
                    break;
                }
                sg.bigo.ads.common.h.a aVar2 = this.f69709a.f69703b;
                long j10 = aVar2.f69665g;
                long j11 = bVarA != null ? bVarA.f69963a : 0L;
                if (j10 > 0 && j10 == j11) {
                    aVar2.f69673o = true;
                    z10 = false;
                    break;
                }
                a("Delete tmp file.");
                if (!sg.bigo.ads.common.utils.f.a(this.f69711c)) {
                    b("Failed to delete temp file.");
                    return;
                }
                this.f69709a.b(0L);
                if (j11 <= 0) {
                    break;
                }
                sg.bigo.ads.common.utils.g.a((Closeable) this.f69710b);
                this.f69710b = null;
            } else {
                String str2 = "Failed to request url.";
                if (cVarA.f69957b != null) {
                    str2 = "Failed to request url. Error code: " + cVarA.f69957b.f69975a + ", error msg: " + cVarA.f69957b.getMessage();
                }
                b(str2);
                return;
            }
        }
        if (z10 && !sg.bigo.ads.common.utils.f.c(this.f69711c)) {
            b("Failed to create temp file.");
            return;
        }
        this.f69709a.f69706e = h.f69719c;
        f.a().a(this.f69709a.f69702a);
        a();
    }
}
