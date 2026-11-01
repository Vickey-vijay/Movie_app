package com.yandex.android.beacon;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.WorkerThread;
import ck.i;
import com.yandex.android.beacon.SendBeaconWorkerImpl;
import com.yandex.android.beacon.SendBeaconWorkerImpl.c;
import com.yandex.div.internal.Log;
import com.yandex.div.internal.util.Clock;
import com.yandex.div.internal.util.SingleThreadExecutor;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import ld.e;
import ld.f;
import ld.h;
import mj.g;
import org.json.JSONObject;

/* JADX INFO: compiled from: SendBeaconWorkerImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class SendBeaconWorkerImpl implements f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f45770g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f45771h = TimeUnit.DAYS.toMillis(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f45772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ld.a f45773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f45774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImplThread f45775d = new ImplThread();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference<b> f45776e = new AtomicReference<>(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Boolean f45777f;

    /* JADX INFO: compiled from: SendBeaconWorkerImpl.kt */
    @WorkerThread
    public final class ImplThread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f45778a;

        public ImplThread() {
            this.f45778a = kotlin.b.a(new bk.a<c>() { // from class: com.yandex.android.beacon.SendBeaconWorkerImpl$ImplThread$workerData$2
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // bk.a
                public final SendBeaconWorkerImpl.c invoke() {
                    SendBeaconWorkerImpl sendBeaconWorkerImpl = sendBeaconWorkerImpl;
                    return sendBeaconWorkerImpl.new c(sendBeaconWorkerImpl.f45772a, sendBeaconWorkerImpl.f45773b.a());
                }
            });
        }

        public final void a(boolean z10, c cVar, com.yandex.android.beacon.a aVar) throws IOException {
            if (z10 && e(aVar)) {
                cVar.g();
            } else if (((b) SendBeaconWorkerImpl.this.f45776e.get()) == null) {
                SendBeaconWorkerImpl.this.l().a(SendBeaconWorkerImpl.this);
            }
        }

        public final c c() {
            return (c) this.f45778a.getValue();
        }

        public final boolean e(com.yandex.android.beacon.a aVar) {
            com.yandex.android.beacon.c cVarA = com.yandex.android.beacon.c.f45796e.a(aVar);
            Uri uriE = aVar.e();
            String string = cVarA.a().toString();
            SendBeaconWorkerImpl.this.k().b(string);
            try {
                e eVarA = SendBeaconWorkerImpl.this.m().a(cVarA);
                if (eVarA.isValid()) {
                    SendBeaconWorkerImpl.this.k().a(string);
                    Log.d("SendBeaconWorker", "Sent url ok " + uriE);
                } else {
                    if (!d(eVarA)) {
                        SendBeaconWorkerImpl.this.k().c(string, false);
                        Log.e("SendBeaconWorker", "Failed to send url " + uriE);
                        return false;
                    }
                    SendBeaconWorkerImpl.this.k().d(string);
                    Log.e("SendBeaconWorker", "Failed to send url " + uriE + ", but treat as sent.");
                }
                return true;
            } catch (IOException e10) {
                SendBeaconWorkerImpl.this.k().c(string, true);
                Log.e("SendBeaconWorker", "Failed to send url " + uriE, e10);
                return false;
            }
        }

        public final void b(Uri uri, Map<String, String> map, JSONObject jSONObject, boolean z10) throws IOException {
            a(z10, c(), c().h(uri, map, Clock.get().getCurrentTimeMs(), jSONObject));
        }

        public final boolean d(e eVar) {
            if (eVar.getResponseCode() / 100 == 5) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: SendBeaconWorkerImpl.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: SendBeaconWorkerImpl.kt */
    public static final class b {
    }

    /* JADX INFO: compiled from: SendBeaconWorkerImpl.kt */
    @WorkerThread
    public final class c implements Iterable<com.yandex.android.beacon.a>, dk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.yandex.android.beacon.b f45780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Deque<com.yandex.android.beacon.a> f45781c;

        /* JADX INFO: compiled from: SendBeaconWorkerImpl.kt */
        public static final class a implements Iterator<com.yandex.android.beacon.a>, dk.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public com.yandex.android.beacon.a f45783b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Iterator<com.yandex.android.beacon.a> f45784c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ c f45785d;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Iterator<? extends com.yandex.android.beacon.a> it, c cVar) {
                this.f45784c = it;
                this.f45785d = cVar;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.yandex.android.beacon.a next() {
                com.yandex.android.beacon.a next = this.f45784c.next();
                this.f45783b = next;
                return next;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f45784c.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() throws IOException {
                this.f45784c.remove();
                com.yandex.android.beacon.b bVar = this.f45785d.f45780b;
                com.yandex.android.beacon.a aVar = this.f45783b;
                bVar.h(aVar != null ? aVar.a() : null);
                this.f45785d.j();
            }
        }

        public c(Context context, String str) {
            com.yandex.android.beacon.b bVarA = com.yandex.android.beacon.b.f45794d.a(context, str);
            this.f45780b = bVarA;
            ArrayDeque arrayDeque = new ArrayDeque(bVarA.d());
            this.f45781c = arrayDeque;
            Log.e("SendBeaconWorker", "Reading from database, items count: " + arrayDeque.size());
            j();
        }

        public final void g() throws IOException {
            this.f45780b.h(this.f45781c.pop().a());
            j();
        }

        public final com.yandex.android.beacon.a h(Uri uri, Map<String, String> map, long j10, JSONObject jSONObject) throws IOException {
            com.yandex.android.beacon.a.C0451a c0451aA = this.f45780b.a(uri, map, j10, jSONObject);
            this.f45781c.push(c0451aA);
            j();
            return c0451aA;
        }

        @Override // java.lang.Iterable
        public Iterator<com.yandex.android.beacon.a> iterator() {
            return new a(this.f45781c.iterator(), this);
        }

        public final void j() {
            SendBeaconWorkerImpl.this.f45777f = Boolean.valueOf(!this.f45781c.isEmpty());
        }
    }

    /* JADX INFO: compiled from: SendBeaconWorkerImpl.kt */
    public static final class d extends SingleThreadExecutor {
        @Override // com.yandex.div.internal.util.SingleThreadExecutor
        public void handleError(RuntimeException runtimeException) {
        }

        public d(Executor executor) {
            super(executor, "SendBeacon");
        }
    }

    public static final void j(SendBeaconWorkerImpl sendBeaconWorkerImpl, Uri uri, Map map, JSONObject jSONObject, boolean z10) throws IOException {
        sendBeaconWorkerImpl.f45775d.b(uri, map, jSONObject, z10);
    }

    public final void i(final Uri uri, final Map<String, String> map, final JSONObject jSONObject, final boolean z10) {
        Log.d("SendBeaconWorker", "Adding url " + uri);
        this.f45774c.post(new Runnable() { // from class: ld.g
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                SendBeaconWorkerImpl.j(this.f63526b, uri, map, jSONObject, z10);
            }
        });
    }

    public final ld.c k() {
        return this.f45773b.c();
    }

    public final h l() {
        return this.f45773b.e();
    }

    public final ld.d m() {
        return this.f45773b.d();
    }

    public SendBeaconWorkerImpl(Context context, ld.a aVar) {
        this.f45772a = context;
        this.f45773b = aVar;
        this.f45774c = new d(aVar.b());
        Log.d("SendBeaconWorker", "SendBeaconWorker created");
    }
}
