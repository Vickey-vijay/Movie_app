package com.mbridge.msdk.foundation.same.net.wrapper;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.Z7;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.tracker.network.b0;
import com.mbridge.msdk.tracker.network.j;
import com.mbridge.msdk.tracker.network.q;
import com.mbridge.msdk.tracker.network.v;

/* JADX INFO: compiled from: MBridgeRequestListenerWrapper.java */
/* JADX INFO: loaded from: classes8.dex */
public class i<T> implements j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.foundation.same.net.b<T> f35071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f35072b = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: MBridgeRequestListenerWrapper.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v f35073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f35074b;

        public a(v vVar, q qVar) {
            this.f35073a = vVar;
            this.f35074b = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (i.this.f35071a != null) {
                    i.this.f35071a.onSuccess(i.this.a(this.f35073a, this.f35074b));
                }
            } catch (Exception e10) {
                q0.b("MBridgeRequestListenerWrapper", "onResponseSuccess error", e10);
            }
        }
    }

    /* JADX INFO: compiled from: MBridgeRequestListenerWrapper.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v f35076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f35077b;

        public b(v vVar, q qVar) {
            this.f35076a = vVar;
            this.f35077b = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (i.this.f35071a != null) {
                    i.this.f35071a.onError(i.this.a(this.f35076a.f38298c, this.f35077b));
                }
            } catch (Exception e10) {
                q0.b("MBridgeRequestListenerWrapper", "onResponseError error", e10);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.network.j
    public void b(com.mbridge.msdk.tracker.network.h<T> hVar, v<T> vVar, q qVar) {
        q0.a("MBridgeRequestListenerWrapper", "onResponseError: " + vVar.f38298c.d() + Z7.f27998r + vVar.f38298c.getMessage());
        this.f35072b.post(new b(vVar, qVar));
    }

    public i(com.mbridge.msdk.foundation.same.net.b<T> bVar) {
        this.f35071a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.net.e a(v<T> vVar, q qVar) {
        if (vVar == null) {
            return null;
        }
        return com.mbridge.msdk.foundation.same.net.e.a(vVar.f38296a, new com.mbridge.msdk.foundation.same.net.toolbox.a(qVar.f38220a, qVar.f38221b, qVar.f38223d));
    }

    @Override // com.mbridge.msdk.tracker.network.j
    public void a(com.mbridge.msdk.tracker.network.h<T> hVar, v<T> vVar, q qVar) {
        q0.a("MBridgeRequestListenerWrapper", "onResponseSuccess: " + vVar.f38296a);
        this.f35072b.post(new a(vVar, qVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.net.exception.a a(b0 b0Var, q qVar) {
        com.mbridge.msdk.foundation.same.net.toolbox.a aVar;
        if (b0Var == null) {
            return null;
        }
        if (qVar != null) {
            aVar = new com.mbridge.msdk.foundation.same.net.toolbox.a(qVar.f38220a, qVar.f38221b, qVar.f38223d);
        } else {
            aVar = new com.mbridge.msdk.foundation.same.net.toolbox.a(0, null, null);
        }
        if (b0Var.d() == 0) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(2, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 1) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(6, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 2) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(8, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 4) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(880041, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 5) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(8, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 6) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(15, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 7) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(7, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 8) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(10, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 9) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(4, aVar, b0Var.getMessage());
        }
        return new com.mbridge.msdk.foundation.same.net.exception.a(2, aVar, b0Var.getMessage());
    }
}
