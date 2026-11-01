package wo;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import top.zibin.luban.Checker;

/* JADX INFO: compiled from: Luban.java */
/* JADX INFO: loaded from: classes8.dex */
public class e implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f74168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f74169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f74170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f74171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i f74172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f74173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h f74174h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public wo.a f74175i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<d> f74176j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Handler f74177k;

    /* JADX INFO: compiled from: Luban.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f74178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f74179c;

        public a(Context context, d dVar) {
            this.f74178b = context;
            this.f74179c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e.this.f74177k.sendMessage(e.this.f74177k.obtainMessage(1));
                File fileD = e.this.d(this.f74178b, this.f74179c);
                Message messageObtainMessage = e.this.f74177k.obtainMessage(0);
                messageObtainMessage.arg1 = this.f74179c.getIndex();
                messageObtainMessage.obj = fileD;
                Bundle bundle = new Bundle();
                bundle.putString("source", this.f74179c.getPath());
                messageObtainMessage.setData(bundle);
                e.this.f74177k.sendMessage(messageObtainMessage);
            } catch (Exception unused) {
                Message messageObtainMessage2 = e.this.f74177k.obtainMessage(2);
                messageObtainMessage2.arg1 = this.f74179c.getIndex();
                Bundle bundle2 = new Bundle();
                bundle2.putString("source", this.f74179c.getPath());
                messageObtainMessage2.setData(bundle2);
                e.this.f74177k.sendMessage(messageObtainMessage2);
            }
        }
    }

    /* JADX INFO: compiled from: Luban.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f74181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f74182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f74183c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public i f74186f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public g f74187g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public h f74188h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public wo.a f74189i;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f74184d = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f74185e = 100;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public List<d> f74190j = new ArrayList();

        /* JADX INFO: compiled from: Luban.java */
        public class a extends wo.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ File f74191a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f74192b;

            public a(File file, int i10) {
                this.f74191a = file;
                this.f74192b = i10;
            }

            @Override // wo.d
            public int getIndex() {
                return this.f74192b;
            }

            @Override // wo.d
            public String getPath() {
                return this.f74191a.getAbsolutePath();
            }

            @Override // wo.c
            public InputStream a() {
                return xo.b.d().f(this.f74191a.getAbsolutePath());
            }
        }

        /* JADX INFO: renamed from: wo.e$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Luban.java */
        public class C0785b extends wo.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f74194a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f74195b;

            public C0785b(String str, int i10) {
                this.f74194a = str;
                this.f74195b = i10;
            }

            @Override // wo.d
            public int getIndex() {
                return this.f74195b;
            }

            @Override // wo.d
            public String getPath() {
                return this.f74194a;
            }

            @Override // wo.c
            public InputStream a() {
                return xo.b.d().f(this.f74194a);
            }
        }

        /* JADX INFO: compiled from: Luban.java */
        public class c extends wo.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Uri f74197a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f74198b;

            public c(Uri uri, int i10) {
                this.f74197a = uri;
                this.f74198b = i10;
            }

            @Override // wo.c
            public InputStream a() throws IOException {
                return b.this.f74184d ? xo.b.d().e(b.this.f74181a.getContentResolver(), this.f74197a) : b.this.f74181a.getContentResolver().openInputStream(this.f74197a);
            }

            @Override // wo.d
            public int getIndex() {
                return this.f74198b;
            }

            @Override // wo.d
            public String getPath() {
                return Checker.isContent(this.f74197a.toString()) ? this.f74197a.toString() : this.f74197a.getPath();
            }
        }

        public final e k() {
            return new e(this, null);
        }

        public b l(wo.a aVar) {
            this.f74189i = aVar;
            return this;
        }

        public b m(int i10) {
            this.f74185e = i10;
            return this;
        }

        public final b o(Uri uri, int i10) {
            this.f74190j.add(new c(uri, i10));
            return this;
        }

        public final b p(File file, int i10) {
            this.f74190j.add(new a(file, i10));
            return this;
        }

        public final b q(String str, int i10) {
            this.f74190j.add(new C0785b(str, i10));
            return this;
        }

        public b s(h hVar) {
            this.f74188h = hVar;
            return this;
        }

        public b t(i iVar) {
            this.f74186f = iVar;
            return this;
        }

        public b(Context context) {
            this.f74181a = context;
        }

        public void n() {
            k().j(this.f74181a);
        }

        public <T> b r(List<T> list) {
            int i10 = -1;
            for (T t10 : list) {
                i10++;
                if (t10 instanceof String) {
                    q((String) t10, i10);
                } else if (t10 instanceof File) {
                    p((File) t10, i10);
                } else if (t10 instanceof Uri) {
                    o((Uri) t10, i10);
                } else {
                    throw new IllegalArgumentException("Incoming data type exception, it must be String, File, Uri or Bitmap");
                }
            }
            return this;
        }
    }

    public /* synthetic */ e(b bVar, a aVar) {
        this(bVar);
    }

    public e(b bVar) {
        this.f74168b = bVar.f74182b;
        this.f74169c = bVar.f74183c;
        this.f74170d = bVar.f74184d;
        this.f74172f = bVar.f74186f;
        this.f74176j = bVar.f74190j;
        this.f74173g = bVar.f74187g;
        this.f74174h = bVar.f74188h;
        this.f74171e = bVar.f74185e;
        this.f74175i = bVar.f74189i;
        this.f74177k = new Handler(Looper.getMainLooper(), this);
    }

    public static b k(Context context) {
        return new b(context);
    }

    public final File e(Context context, d dVar) throws IOException {
        Checker checker = Checker.SINGLE;
        File fileH = h(context, checker.extSuffix(dVar));
        String strB = Checker.isContent(dVar.getPath()) ? f.b(context, Uri.parse(dVar.getPath())) : dVar.getPath();
        i iVar = this.f74172f;
        if (iVar != null) {
            fileH = i(context, iVar.a(strB));
        }
        wo.a aVar = this.f74175i;
        if (aVar != null) {
            return (aVar.a(strB) && checker.needCompress(this.f74171e, strB)) ? new wo.b(dVar, fileH, this.f74169c).a() : new File(strB);
        }
        return checker.needCompress(this.f74171e, strB) ? new wo.b(dVar, fileH, this.f74169c).a() : new File(strB);
    }

    public final File f(Context context) {
        return g(context, "luban_disk_cache");
    }

    public final File h(Context context, String str) {
        if (TextUtils.isEmpty(this.f74168b)) {
            this.f74168b = f(context).getAbsolutePath();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f74168b);
        sb2.append("/");
        sb2.append(System.currentTimeMillis());
        sb2.append((int) (Math.random() * 1000.0d));
        if (TextUtils.isEmpty(str)) {
            str = ".jpg";
        }
        sb2.append(str);
        return new File(sb2.toString());
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            g gVar = this.f74173g;
            if (gVar != null) {
                gVar.a(message.arg1, (File) message.obj);
            }
            h hVar = this.f74174h;
            if (hVar == null) {
                return false;
            }
            hVar.a(message.getData().getString("source"), (File) message.obj);
            return false;
        }
        if (i10 == 1) {
            g gVar2 = this.f74173g;
            if (gVar2 != null) {
                gVar2.onStart();
            }
            h hVar2 = this.f74174h;
            if (hVar2 == null) {
                return false;
            }
            hVar2.onStart();
            return false;
        }
        if (i10 != 2) {
            return false;
        }
        g gVar3 = this.f74173g;
        if (gVar3 != null) {
            gVar3.b(message.arg1, (Throwable) message.obj);
        }
        h hVar3 = this.f74174h;
        if (hVar3 == null) {
            return false;
        }
        hVar3.b(message.getData().getString("source"), (Throwable) message.obj);
        return false;
    }

    public final File i(Context context, String str) {
        if (TextUtils.isEmpty(this.f74168b)) {
            this.f74168b = f(context).getAbsolutePath();
        }
        return new File(this.f74168b + "/" + str);
    }

    public final void j(Context context) {
        List<d> list = this.f74176j;
        if (list != null && list.size() != 0) {
            Iterator<d> it = this.f74176j.iterator();
            while (it.hasNext()) {
                AsyncTask.SERIAL_EXECUTOR.execute(new a(context, it.next()));
                it.remove();
            }
            return;
        }
        g gVar = this.f74173g;
        if (gVar != null) {
            gVar.b(-1, new NullPointerException("image file cannot be null"));
        }
        h hVar = this.f74174h;
        if (hVar != null) {
            hVar.b("", new NullPointerException("image file cannot be null"));
        }
    }

    public static File g(Context context, String str) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir != null) {
            File file = new File(externalCacheDir, str);
            if (!file.mkdirs() && (!file.exists() || !file.isDirectory())) {
                return null;
            }
            return file;
        }
        if (Log.isLoggable("Luban", 6)) {
            Log.e("Luban", "default disk cache dir is null");
        }
        return null;
    }

    public final File d(Context context, d dVar) throws IOException {
        try {
            return e(context, dVar);
        } finally {
            dVar.close();
        }
    }
}
