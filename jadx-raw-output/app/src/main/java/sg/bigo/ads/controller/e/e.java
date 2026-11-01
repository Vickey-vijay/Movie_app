package sg.bigo.ads.controller.e;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.protobuf.EventTypeExtended;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends sg.bigo.ads.controller.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.common.g f70827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sg.bigo.ads.controller.b.d f70828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sg.bigo.ads.controller.b.h f70829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.b f70830d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f70834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f70835i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f70838l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f70831e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f70832f = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<b> f70836j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicReference<sg.bigo.ads.controller.g.h> f70837k = new AtomicReference<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f70833g = new AtomicInteger(0);

    public interface a {
        void a(int i10);

        void a(int i10, int i11, String str);
    }

    public static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f70848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f70849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final sg.bigo.ads.common.g f70850c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final sg.bigo.ads.controller.b.d f70851d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final sg.bigo.ads.controller.b.h f70852e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final sg.bigo.ads.controller.a.b f70853f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final e f70854g;

        public b(String str, a aVar, @NonNull sg.bigo.ads.controller.b.d dVar, @NonNull sg.bigo.ads.controller.b.h hVar, @NonNull sg.bigo.ads.common.g gVar, @NonNull sg.bigo.ads.controller.a.b bVar, @NonNull e eVar) {
            this.f70848a = str;
            this.f70849b = aVar;
            this.f70850c = gVar;
            this.f70851d = dVar;
            this.f70852e = hVar;
            this.f70853f = bVar;
            this.f70854g = eVar;
            if (c.a().f70803b.compareAndSet(-1, 0)) {
                sg.bigo.ads.common.t.a.a(0, 3, "ConfigInitProcessor", "reinit config and set status.");
            }
        }

        @Override // sg.bigo.ads.controller.e.e.a
        public final void a(int i10) {
            c.a().b();
            a aVar = this.f70849b;
            if (aVar != null) {
                aVar.a(i10);
            }
            if (sg.bigo.ads.api.a.i.f69318a.x()) {
                sg.bigo.ads.controller.a.b.d.a.f70471a.a(this.f70853f, this.f70850c, this.f70851d, this.f70852e, this.f70854g);
            }
        }

        @Override // sg.bigo.ads.controller.e.e.a
        public final void a(int i10, int i11, String str) {
            c cVarA = c.a();
            String str2 = this.f70848a;
            if (1101 == i11 || 1105 == i11) {
                Map concurrentHashMap = cVarA.f70802a;
                if (concurrentHashMap == null) {
                    concurrentHashMap = new ConcurrentHashMap();
                    cVarA.f70802a = concurrentHashMap;
                }
                if (str2 != null && c.a(concurrentHashMap, str2)) {
                    concurrentHashMap.put(str2, Long.valueOf(SystemClock.elapsedRealtime()));
                }
                if (cVarA.f70803b.compareAndSet(0, -1)) {
                    sg.bigo.ads.common.t.a.a(0, "ConfigInitProcessor", "Failed to init config and set status.");
                }
            }
            a aVar = this.f70849b;
            if (aVar != null) {
                aVar.a(i10, i11, str);
            }
        }
    }

    public e(@NonNull Context context, @NonNull sg.bigo.ads.controller.b.d dVar, @NonNull sg.bigo.ads.controller.b.h hVar, @NonNull sg.bigo.ads.common.g gVar, @NonNull sg.bigo.ads.controller.a.b bVar) {
        this.f70835i = context;
        this.f70827a = gVar;
        this.f70828b = dVar;
        this.f70829c = hVar;
        this.f70830d = bVar;
    }

    private void a(int i10, int i11) {
        if (this.f70837k.get() != null) {
            return;
        }
        this.f70837k.set(new sg.bigo.ads.controller.g.h(this.f70827a, this.f70830d, sg.bigo.ads.controller.b.e.E(), this));
        this.f70834h = i10;
        this.f70831e = SystemClock.elapsedRealtime();
        this.f70832f = sg.bigo.ads.common.f.b.d();
        this.f70833g.incrementAndGet();
        this.f70838l = i11;
        String strA = this.f70827a.a();
        if (q.a((CharSequence) strA)) {
            b(1100, "App id cannot be empty, please pass the id when initializing bigo sdk");
        } else if (c.a().a(strA)) {
            this.f70837k.get().b();
        } else {
            b(EventTypeExtended.EVENT_TYPE_CLICK_BY_SOURCE_VALUE, "The slot id is invalid, please make sure the id is aligned with app id.");
        }
    }

    public static /* synthetic */ void a(e eVar) {
        eVar.f70837k.set(null);
        Iterator<b> it = eVar.f70836j.iterator();
        while (it.hasNext()) {
            it.next().a(eVar.f70838l);
        }
        eVar.f70836j.clear();
    }

    @Override // sg.bigo.ads.controller.e
    public final void a(final int i10, final int i11, final int i12, @NonNull final String str, @Nullable Object obj) {
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.e.e.2
            @Override // java.lang.Runnable
            public final void run() {
                e eVar;
                int i13;
                sg.bigo.ads.common.t.a.a(0, "GlobalConfig", "request error, seq=" + i10 + ", error=" + i11 + ", message=" + str);
                StringBuilder sb2 = new StringBuilder("Error from server: ");
                sb2.append(str);
                String string = sb2.toString();
                if (i12 == -9) {
                    eVar = e.this;
                    i13 = 1105;
                } else {
                    eVar = e.this;
                    i13 = 1104;
                }
                eVar.b(i13, string);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                e eVar2 = e.this;
                long j10 = jElapsedRealtime - eVar2.f70831e;
                int i14 = i11;
                int i15 = i12;
                String str2 = str;
                int i16 = eVar2.f70834h;
                boolean z10 = eVar2.f70832f;
                int i17 = eVar2.f70833g.get();
                sg.bigo.ads.common.g gVar = e.this.f70827a;
                sg.bigo.ads.core.d.b.a(j10, i14, i15, str2, i16, z10, i17, gVar == null ? null : gVar.X());
            }
        });
    }

    @Override // sg.bigo.ads.controller.b
    public final void a(int i10, @NonNull String str) {
        a(i10, str, false);
    }

    public final void a(final int i10, @NonNull final String str, final boolean z10) {
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.e.e.1
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.controller.a.a aVar;
                int andSet = 0;
                sg.bigo.ads.common.t.a.a(0, 3, "GlobalConfig", "request success, seq=" + i10 + ", result=" + str);
                e eVar = e.this;
                int i11 = eVar.f70834h;
                if (z10) {
                    i11 = 2;
                }
                try {
                    boolean zN = eVar.f70828b.N();
                    JSONObject jSONObject = new JSONObject(str);
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("global");
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("slots");
                    if (jSONObjectOptJSONObject != null && jSONArrayOptJSONArray != null) {
                        if (((((long) e.this.f70828b.e(jSONObjectOptJSONObject)) & 1) != 0) && (aVar = e.this.f70830d.f70407a) != null) {
                            aVar.c();
                        }
                        e eVar2 = e.this;
                        eVar2.f70828b.c(eVar2.f70835i);
                        e.this.f70829c.a(jSONArrayOptJSONArray);
                        e eVar3 = e.this;
                        eVar3.f70829c.c(eVar3.f70835i);
                        sg.bigo.ads.a aVarA = BigoAdSdk.a(e.this.f70835i);
                        aVarA.f67260a = e.this.f70827a.a();
                        aVarA.c(e.this.f70835i);
                        if (!z10) {
                            e.a(e.this);
                            andSet = e.this.f70833g.getAndSet(0);
                        }
                        int i12 = andSet;
                        long jI = e.this.f70828b.i();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        e eVar4 = e.this;
                        long j10 = jElapsedRealtime - eVar4.f70831e;
                        boolean z11 = eVar4.f70832f;
                        sg.bigo.ads.common.g gVar = eVar4.f70827a;
                        sg.bigo.ads.core.d.b.a(jI, j10, zN, i11, z11, i12, gVar == null ? null : gVar.X());
                        h.a().a(e.this.f70828b.J());
                        return;
                    }
                    if (!z10) {
                        e.this.b(1102, "Missing `global` or `slots` params.");
                    }
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    e eVar5 = e.this;
                    long j11 = jElapsedRealtime2 - eVar5.f70831e;
                    boolean z12 = eVar5.f70832f;
                    int i13 = eVar5.f70833g.get();
                    sg.bigo.ads.common.g gVar2 = e.this.f70827a;
                    sg.bigo.ads.core.d.b.a(j11, 1102, Sdk.SDKError.Reason.AD_LOAD_TOO_FREQUENTLY_VALUE, "Missing `global` or `slots` params.", i11, z12, i13, gVar2 == null ? null : gVar2.X());
                } catch (JSONException unused) {
                    if (!z10) {
                        e.this.b(1103, "Failed to parse global config.");
                    }
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    e eVar6 = e.this;
                    long j12 = jElapsedRealtime3 - eVar6.f70831e;
                    boolean z13 = eVar6.f70832f;
                    int i14 = eVar6.f70833g.get();
                    sg.bigo.ads.common.g gVar3 = e.this.f70827a;
                    sg.bigo.ads.core.d.b.a(j12, 1103, Sdk.SDKError.Reason.AD_LOAD_TOO_FREQUENTLY_VALUE, "Failed to parse global config.", i11, z13, i14, gVar3 == null ? null : gVar3.X());
                }
            }
        });
    }

    @WorkerThread
    public final void a(@Nullable a aVar, int i10) {
        b bVar = new b(this.f70827a.a(), aVar, this.f70828b, this.f70829c, this.f70827a, this.f70830d, this);
        int iC = this.f70828b.C();
        if (iC != 2) {
            if (iC == 3) {
                this.f70836j.add(bVar);
                a(i10, iC);
                return;
            } else if (iC == 4) {
                bVar.a(iC);
                a(i10, iC);
                return;
            } else if (iC != 5) {
                return;
            }
        }
        bVar.a(iC);
    }

    public final void b(int i10, String str) {
        this.f70837k.set(null);
        if (this.f70836j.isEmpty()) {
            return;
        }
        this.f70836j.remove(0).a(this.f70838l, i10, str);
        if (this.f70836j.isEmpty()) {
            return;
        }
        a(this.f70834h, this.f70838l);
    }
}
