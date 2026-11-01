package sg.bigo.ads.common.p;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.InterfaceC3382ae;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public sg.bigo.ads.common.h.a.a f69809b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, C0713a> f69808a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<C0713a> f69812e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f69813f = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f69810c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f69811d = new byte[0];

    /* JADX INFO: renamed from: sg.bigo.ads.common.p.a$a, reason: collision with other inner class name */
    public class C0713a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f69841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f69842c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f69844e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List<g> f69845f;

        private C0713a(@NonNull String str, @Nullable String str2, boolean z10, g gVar) {
            ArrayList arrayList = new ArrayList();
            this.f69845f = arrayList;
            this.f69842c = false;
            this.f69840a = str;
            this.f69841b = str2;
            this.f69844e = z10;
            arrayList.add(gVar);
        }

        public /* synthetic */ C0713a(a aVar, String str, String str2, boolean z10, g gVar, byte b10) {
            this(str, str2, z10, gVar);
        }

        public static /* synthetic */ void a(C0713a c0713a, Context context, int i10, String str, String str2) {
            synchronized (a.this.f69811d) {
                sg.bigo.ads.common.t.a.a(0, 5, a.this.a(), "Failed to download image: " + c0713a.f69840a);
                Iterator<g> it = c0713a.f69845f.iterator();
                while (it.hasNext()) {
                    it.next().a(i10, str, str2);
                }
                a.this.f69808a.remove(c0713a.f69840a);
                a.this.c(context);
            }
        }

        public static /* synthetic */ void a(C0713a c0713a, Context context, final Bitmap bitmap, final String str, final long j10, final String str2) {
            synchronized (a.this.f69811d) {
                sg.bigo.ads.common.t.a.a(0, 4, a.this.a(), "Succeed to download image: " + c0713a.f69840a);
                for (final g gVar : c0713a.f69845f) {
                    a.this.f69810c.post(new Runnable() { // from class: sg.bigo.ads.common.p.a.a.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            gVar.a(bitmap, new f(1, str, j10, str2, C0713a.this.f69840a));
                        }
                    });
                }
                a.this.f69808a.remove(c0713a.f69840a);
                a.this.c(context);
            }
        }

        public final void a(@Nullable Executor executor, final Context context) {
            if (this.f69842c) {
                return;
            }
            this.f69842c = true;
            sg.bigo.ads.common.u.b.a aVar = new sg.bigo.ads.common.u.b.a(sg.bigo.ads.common.y.a.a(), new sg.bigo.ads.common.u.b.d(this.f69840a), this.f69844e, context);
            if (executor == null) {
                executor = sg.bigo.ads.common.u.a.e.h();
            }
            aVar.f69951l = executor;
            sg.bigo.ads.common.u.g.a(aVar, new sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.a, sg.bigo.ads.common.u.c.a>() { // from class: sg.bigo.ads.common.p.a.a.2
                @Override // sg.bigo.ads.common.u.b
                public final /* bridge */ /* synthetic */ sg.bigo.ads.common.u.c.c a(@NonNull sg.bigo.ads.common.u.c.a aVar2) {
                    return aVar2;
                }

                @Override // sg.bigo.ads.common.u.b
                public final /* synthetic */ void a(@NonNull sg.bigo.ads.common.u.b.c cVar, @NonNull sg.bigo.ads.common.u.c.c cVar2) {
                    sg.bigo.ads.common.u.c.a aVar2 = (sg.bigo.ads.common.u.c.a) cVar2;
                    C0713a.this.f69842c = false;
                    String strA = aVar2.a("Content-Type");
                    sg.bigo.ads.common.t.a.a(0, 4, a.this.a(), "Content-Type:".concat(String.valueOf(strA)));
                    if (Build.VERSION.SDK_INT == 28 && "image/webp".equalsIgnoreCase(strA)) {
                        C0713a.a(C0713a.this, context, 1303, "Not support parsing webp images in Android P.", strA);
                        return;
                    }
                    C0713a c0713a = C0713a.this;
                    String strA2 = a.a(c0713a.f69840a, c0713a.f69841b);
                    a aVar3 = a.this;
                    Context context2 = context;
                    InputStream inputStream = aVar2.f69959b;
                    sg.bigo.ads.common.c cVarA = inputStream == null ? null : aVar3.a(aVar3.a(inputStream, strA2, context2).getPath(), context2);
                    if (cVarA == null) {
                        C0713a.a(C0713a.this, context, 1304, "Failed to parse image.", strA);
                        return;
                    }
                    sg.bigo.ads.common.t.a.a(0, 4, a.this.a(), "mimeType:" + cVarA.f69495b);
                    if (q.a((CharSequence) cVarA.f69495b)) {
                        cVarA.f69495b = strA;
                    }
                    a.this.a(context, strA2, cVarA);
                    C0713a.a(C0713a.this, context, cVarA.f69494a, cVarA.f69495b, sg.bigo.ads.common.utils.f.a(a.this.c(context, strA2), 2), cVarA.f69496c);
                    a.this.d(context);
                }

                @Override // sg.bigo.ads.common.u.b
                public final /* synthetic */ void a(@NonNull sg.bigo.ads.common.u.b.c cVar, @NonNull sg.bigo.ads.common.u.h hVar) {
                    C0713a.this.f69842c = false;
                    C0713a.a(C0713a.this, context, hVar.f69975a, hVar.getMessage(), "");
                }
            });
        }

        public final void a(g gVar) {
            synchronized (a.this.f69811d) {
                this.f69845f.add(gVar);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0713a.class != obj.getClass()) {
                return false;
            }
            return this.f69840a.equals(((C0713a) obj).f69840a);
        }
    }

    public static String a(String str, String str2) {
        return !TextUtils.isEmpty(str2) ? str2 : String.valueOf(str.hashCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, @Nullable Executor executor, @NonNull String str, @Nullable String str2, boolean z10, g gVar) {
        int i10;
        String str3;
        if (!URLUtil.isNetworkUrl(str)) {
            i10 = InterfaceC3382ae.c.f28183e;
            str3 = "Unknown scheme.";
        } else {
            if (!this.f69809b.b()) {
                sg.bigo.ads.common.t.a.a(0, 3, a(), "Obtain the bitmap through network.");
                synchronized (this.f69811d) {
                    if (this.f69808a.containsKey(str)) {
                        sg.bigo.ads.common.t.a.a(0, 3, a(), "The target url is already in the requesting list: ".concat(String.valueOf(str)));
                        C0713a c0713a = this.f69808a.get(str);
                        if (c0713a != null) {
                            c0713a.a(gVar);
                        }
                    } else {
                        C0713a c0713a2 = new C0713a(this, str, str2, z10, gVar, (byte) 0);
                        int iIndexOf = this.f69812e.indexOf(c0713a2);
                        if (iIndexOf >= 0) {
                            sg.bigo.ads.common.t.a.a(0, 3, a(), "The target url is already in the waiting list: ".concat(String.valueOf(str)));
                            C0713a c0713a3 = this.f69812e.get(iIndexOf);
                            c0713a3.a(gVar);
                            if (executor != null) {
                                this.f69812e.remove(c0713a3);
                                a(context, executor, c0713a3);
                            }
                        } else if (executor != null) {
                            a(context, executor, c0713a2);
                        } else {
                            this.f69812e.add(c0713a2);
                            c(context);
                        }
                    }
                }
                return;
            }
            i10 = 1302;
            str3 = "Unable to download image.";
        }
        gVar.a(i10, str3, "");
    }

    private synchronized void a(final Context context, @NonNull final Executor executor, final C0713a c0713a) {
        if (executor == null || c0713a == null) {
            return;
        }
        this.f69808a.put(c0713a.f69840a, c0713a);
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.common.p.a.3
            @Override // java.lang.Runnable
            public final void run() {
                c0713a.a(executor, context);
            }
        });
    }

    public static /* synthetic */ void a(a aVar, Context context) {
        File[] fileArrListFiles;
        if (sg.bigo.ads.common.n.d.b()) {
            return;
        }
        sg.bigo.ads.common.t.a.a(0, 3, aVar.a(), "Start check and delete expired images.");
        File file = new File(aVar.b(context));
        if (!file.exists() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: sg.bigo.ads.common.p.a.6
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(File file2, File file3) {
                long jLastModified = file2.lastModified() - file3.lastModified();
                if (jLastModified > 0) {
                    return -1;
                }
                return jLastModified == 0 ? 0 : 1;
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis() - aVar.f69809b.f69683d;
        for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
            File file2 = fileArrListFiles[i10];
            if (i10 >= aVar.b() || file2.lastModified() <= jCurrentTimeMillis) {
                file2.delete();
            }
        }
    }

    @NonNull
    public final File a(@NonNull InputStream inputStream, String str, Context context) throws Throwable {
        FileOutputStream fileOutputStream;
        Throwable th2;
        String strB = b(context);
        sg.bigo.ads.common.utils.f.a(strB, str);
        File file = new File(strB, str);
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i10);
                }
                fileOutputStream.flush();
                sg.bigo.ads.common.utils.g.a((Closeable) inputStream);
                sg.bigo.ads.common.utils.g.a(fileOutputStream);
            } catch (IOException unused) {
                fileOutputStream2 = fileOutputStream;
                sg.bigo.ads.common.utils.g.a((Closeable) inputStream);
                sg.bigo.ads.common.utils.g.a(fileOutputStream2);
            } catch (Throwable th3) {
                th2 = th3;
                sg.bigo.ads.common.utils.g.a((Closeable) inputStream);
                sg.bigo.ads.common.utils.g.a(fileOutputStream);
                throw th2;
            }
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            fileOutputStream = null;
            th2 = th4;
        }
        return file;
    }

    public abstract String a();

    public abstract sg.bigo.ads.common.c a(Context context, String str);

    public final sg.bigo.ads.common.c a(String str, Context context) {
        return this instanceof d ? sg.bigo.ads.common.utils.d.b(str) : sg.bigo.ads.common.utils.d.b(str, context);
    }

    public abstract void a(Context context);

    public abstract void a(Context context, String str, sg.bigo.ads.common.c cVar);

    public final void a(final Context context, @Nullable final Executor executor, @NonNull final String str, final boolean z10, final g gVar) {
        String strA = a(str, (String) null);
        final sg.bigo.ads.common.c cVarA = a(context, strA);
        if (cVarA != null) {
            if (!cVarA.f69494a.isRecycled()) {
                sg.bigo.ads.common.t.a.a(0, 3, a(), "Get bitmap from cache, mimeType=" + cVarA.f69495b);
                this.f69810c.post(new Runnable() { // from class: sg.bigo.ads.common.p.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        g gVar2 = gVar;
                        sg.bigo.ads.common.c cVar = cVarA;
                        gVar2.a(cVar.f69494a, new f(2, cVar.f69495b, 0L, cVar.f69496c, str));
                    }
                });
                return;
            }
            b(context, strA);
        }
        if (!sg.bigo.ads.common.utils.f.b(c(context, strA))) {
            a(context, executor, str, null, z10, gVar);
            return;
        }
        final String strA2 = a(str, (String) null);
        final String strC = c(context, strA2);
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.common.p.a.2

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ String f69824g = null;

            @Override // java.lang.Runnable
            public final void run() {
                final sg.bigo.ads.common.c cVarA2 = a.this.a(strC, context);
                if (cVarA2 == null) {
                    a.this.a(context, executor, str, this.f69824g, z10, gVar);
                    return;
                }
                a.this.a(context, strA2, cVarA2);
                final long jA = sg.bigo.ads.common.utils.f.a(strC, 2);
                sg.bigo.ads.common.t.a.a(0, 3, a.this.a(), "Obtain the bitmap from local file, mimeType=" + cVarA2.f69495b);
                a.this.f69810c.post(new Runnable() { // from class: sg.bigo.ads.common.p.a.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        g gVar2 = gVar;
                        sg.bigo.ads.common.c cVar = cVarA2;
                        gVar2.a(cVar.f69494a, new f(0, cVar.f69495b, jA, cVar.f69496c, str));
                    }
                });
                new File(strC).setLastModified(System.currentTimeMillis());
                a.this.d(context);
            }
        });
    }

    public final void a(sg.bigo.ads.common.h.a.a aVar) {
        this.f69809b = aVar;
    }

    public final boolean a(String str) {
        boolean zContainsKey;
        synchronized (this.f69811d) {
            zContainsKey = this.f69808a.containsKey(str);
            if (!zContainsKey) {
                Iterator<C0713a> it = this.f69812e.iterator();
                while (it.hasNext()) {
                    if (TextUtils.equals(it.next().f69840a, str)) {
                        zContainsKey = true;
                        break;
                    }
                }
            }
        }
        return zContainsKey;
    }

    public abstract int b();

    public abstract String b(Context context);

    public abstract void b(Context context, String str);

    public abstract String c(Context context, String str);

    public final synchronized void c(final Context context) {
        if (this.f69812e.isEmpty()) {
            return;
        }
        sg.bigo.ads.common.t.a.a(0, 3, a(), "scheduleDownload");
        while (true) {
            if (!(this.f69808a.size() < this.f69809b.f69680a)) {
                sg.bigo.ads.common.t.a.a(0, 3, a(), "Current size of waiting list: " + this.f69812e.size());
                return;
            }
            if (this.f69812e.isEmpty()) {
                return;
            }
            final C0713a c0713aRemove = this.f69812e.remove(0);
            this.f69808a.put(c0713aRemove.f69840a, c0713aRemove);
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.common.p.a.4
                @Override // java.lang.Runnable
                public final void run() {
                    c0713aRemove.a(null, context);
                }
            });
        }
    }

    public final synchronized void d(final Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f69813f > 3600000) {
            this.f69813f = jCurrentTimeMillis;
            sg.bigo.ads.common.n.d.a(0, new Runnable() { // from class: sg.bigo.ads.common.p.a.5
                @Override // java.lang.Runnable
                public final void run() {
                    a.a(a.this, context);
                }
            });
        }
    }

    public final boolean d(Context context, String str) {
        String strA = a(str, (String) null);
        return a(context, strA) != null || sg.bigo.ads.common.utils.f.b(c(context, strA));
    }

    public final void e(Context context) {
        synchronized (this.f69811d) {
            this.f69812e.clear();
            this.f69808a.clear();
            a(context);
        }
    }
}
