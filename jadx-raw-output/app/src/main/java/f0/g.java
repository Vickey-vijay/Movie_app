package f0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.danikula.videocache.ProxyCacheException;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: HttpProxyCacheServerClients.java */
/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f52793a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile e f52795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<b> f52796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f52797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f52798f;

    /* JADX INFO: compiled from: HttpProxyCacheServerClients.java */
    public static final class a extends Handler implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f52799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<b> f52800c;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Iterator<b> it = this.f52800c.iterator();
            while (it.hasNext()) {
                it.next().a((File) message.obj, this.f52799b, message.arg1);
            }
        }

        public a(String str, List<b> list) {
            super(Looper.getMainLooper());
            this.f52799b = str;
            this.f52800c = list;
        }

        @Override // f0.b
        public void a(File file, String str, int i10) {
            Message messageObtainMessage = obtainMessage();
            messageObtainMessage.arg1 = i10;
            messageObtainMessage.obj = file;
            sendMessage(messageObtainMessage);
        }
    }

    public final synchronized void a() {
        if (this.f52793a.decrementAndGet() <= 0) {
            this.f52795c.m();
            this.f52795c = null;
        }
    }

    public final synchronized void e() throws ProxyCacheException {
        this.f52795c = this.f52795c == null ? c() : this.f52795c;
    }

    public int b() {
        return this.f52793a.get();
    }

    public final e c() throws ProxyCacheException {
        String str = this.f52794b;
        c cVar = this.f52798f;
        e eVar = new e(new h(str, cVar.f52767d, cVar.f52768e), new g0.b(this.f52798f.a(this.f52794b), this.f52798f.f52766c));
        eVar.t(this.f52797e);
        return eVar;
    }

    public g(String str, c cVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f52796d = copyOnWriteArrayList;
        this.f52794b = (String) k.c(str);
        this.f52798f = (c) k.c(cVar);
        this.f52797e = new a(str, copyOnWriteArrayList);
    }

    public void d(d dVar, Socket socket) throws IOException, ProxyCacheException {
        e();
        try {
            this.f52793a.incrementAndGet();
            this.f52795c.s(dVar, socket);
        } finally {
            a();
        }
    }
}
