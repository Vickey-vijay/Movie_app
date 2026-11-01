package xo;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import top.zibin.luban.io.BufferedInputStreamWrap;

/* JADX INFO: compiled from: ArrayPoolProvide.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static b f75080d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet<String> f75081a = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap<String, BufferedInputStreamWrap> f75082b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f75083c = new g(4194304);

    public final BufferedInputStreamWrap h(ContentResolver contentResolver, Uri uri) {
        BufferedInputStreamWrap bufferedInputStreamWrap = null;
        try {
            BufferedInputStreamWrap bufferedInputStreamWrap2 = new BufferedInputStreamWrap(contentResolver.openInputStream(uri));
            try {
                int iAvailable = bufferedInputStreamWrap2.available();
                if (iAvailable <= 0) {
                    iAvailable = 8388608;
                }
                bufferedInputStreamWrap2.mark(iAvailable);
                this.f75082b.put(uri.toString(), bufferedInputStreamWrap2);
                this.f75081a.add(uri.toString());
                return bufferedInputStreamWrap2;
            } catch (Exception e10) {
                e = e10;
                bufferedInputStreamWrap = bufferedInputStreamWrap2;
                e.printStackTrace();
                return bufferedInputStreamWrap;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public final BufferedInputStreamWrap i(String str) {
        BufferedInputStreamWrap bufferedInputStreamWrap = null;
        try {
            BufferedInputStreamWrap bufferedInputStreamWrap2 = new BufferedInputStreamWrap(new FileInputStream(str));
            try {
                int iAvailable = bufferedInputStreamWrap2.available();
                if (iAvailable <= 0) {
                    iAvailable = 8388608;
                }
                bufferedInputStreamWrap2.mark(iAvailable);
                this.f75082b.put(str, bufferedInputStreamWrap2);
                this.f75081a.add(str);
                return bufferedInputStreamWrap2;
            } catch (Exception e10) {
                e = e10;
                bufferedInputStreamWrap = bufferedInputStreamWrap2;
                e.printStackTrace();
                return bufferedInputStreamWrap;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public static void b(Closeable closeable) {
        if (closeable instanceof Closeable) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static b d() {
        if (f75080d == null) {
            synchronized (b.class) {
                if (f75080d == null) {
                    f75080d = new b();
                }
            }
        }
        return f75080d;
    }

    public void a() {
        for (String str : this.f75081a) {
            b(this.f75082b.get(str));
            this.f75082b.remove(str);
        }
        this.f75081a.clear();
        this.f75083c.a();
    }

    public byte[] c(int i10) {
        return (byte[]) this.f75083c.e(i10, byte[].class);
    }

    public InputStream e(ContentResolver contentResolver, Uri uri) {
        try {
            try {
                BufferedInputStreamWrap bufferedInputStreamWrapH = this.f75082b.get(uri.toString());
                if (bufferedInputStreamWrapH != null) {
                    bufferedInputStreamWrapH.reset();
                } else {
                    bufferedInputStreamWrapH = h(contentResolver, uri);
                }
                return bufferedInputStreamWrapH;
            } catch (Exception e10) {
                e10.printStackTrace();
                return h(contentResolver, uri);
            }
        } catch (Exception unused) {
            return contentResolver.openInputStream(uri);
        }
    }

    public InputStream f(String str) {
        try {
            BufferedInputStreamWrap bufferedInputStreamWrapI = this.f75082b.get(str);
            if (bufferedInputStreamWrapI != null) {
                bufferedInputStreamWrapI.reset();
            } else {
                bufferedInputStreamWrapI = i(str);
            }
            return bufferedInputStreamWrapI;
        } catch (Exception unused) {
            return i(str);
        }
    }

    public void g(byte[] bArr) {
        this.f75083c.n(bArr);
    }
}
