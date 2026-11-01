package com.fyber.inneractive.sdk.flow.nativead.mainasset;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.i;
import com.fyber.inneractive.sdk.flow.nativead.g;
import com.fyber.inneractive.sdk.flow.nativead.s;
import com.fyber.inneractive.sdk.flow.nativead.t;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.u0;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.response.nativead.j;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements d, s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f15520h = IAlog.a(b.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.nativead.f f15521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f15522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u0 f15523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.b f15524d = com.fyber.inneractive.sdk.flow.nativead.b.UNINITIALIZED;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f15525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r f15526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f15527g;

    @Override // com.fyber.inneractive.sdk.flow.nativead.s
    public final void a(g gVar, Exception exc, com.fyber.inneractive.sdk.response.nativead.f fVar) throws Throwable {
        String message;
        if (this.f15524d == com.fyber.inneractive.sdk.flow.nativead.b.LOADED) {
            return;
        }
        if (gVar == null) {
            this.f15524d = com.fyber.inneractive.sdk.flow.nativead.b.FAILED;
            i iVar = i.NATIVE_AD_IMAGE_LOAD_FAILED;
            if (exc != null) {
                message = exc.getMessage();
            } else {
                message = "Failed to download main media image: " + iVar.name();
            }
            IAlog.f("%s : %s", f15520h, message);
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, iVar);
            c cVar = this.f15522b;
            if (cVar != null) {
                ((com.fyber.inneractive.sdk.flow.nativead.f) cVar).a(inneractiveInfrastructureError, message);
                return;
            }
            return;
        }
        if (this.f15525e != null && this.f15526f != null) {
            u uVar = u.EVENT_READY_ON_CLIENT;
            j jVar = this.f15525e;
            JSONArray jSONArrayB = this.f15526f.b();
            w wVar = new w(jVar);
            wVar.f16129c = uVar;
            wVar.f16127a = null;
            wVar.f16130d = jSONArrayB;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f15527g;
            IAlog.a("%sMain image load took: " + jCurrentTimeMillis + " msec", IAlog.a(this));
            JSONObject jSONObject = new JSONObject();
            String str = this.f15521a.f18469d.f18463a;
            try {
                jSONObject.put("url", str);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "url", str);
            }
            String strB = com.fyber.inneractive.sdk.util.u.b(gVar.f15501b);
            try {
                jSONObject.put("mime", strB);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "mime", strB);
            }
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            try {
                jSONObject.put("load_time", lValueOf);
            } catch (Exception unused3) {
                IAlog.f("Got exception adding param to json object: %s, %s", "load_time", lValueOf);
            }
            wVar.f16132f.put(jSONObject);
            wVar.a((String) null);
        }
        this.f15524d = com.fyber.inneractive.sdk.flow.nativead.b.LOADED;
        c cVar2 = this.f15522b;
        if (cVar2 != null) {
            com.fyber.inneractive.sdk.flow.nativead.f fVar2 = (com.fyber.inneractive.sdk.flow.nativead.f) cVar2;
            fVar2.f15491d.add(gVar);
            fVar2.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void b() {
        com.fyber.inneractive.sdk.response.nativead.c cVar;
        String str;
        com.fyber.inneractive.sdk.response.nativead.f fVar = this.f15521a;
        if (fVar != null && (cVar = fVar.f18469d) != null && (str = cVar.f18463a) != null && !str.trim().isEmpty()) {
            this.f15527g = System.currentTimeMillis();
            this.f15524d = com.fyber.inneractive.sdk.flow.nativead.b.LOADING;
            t tVar = new t(this.f15521a, this);
            IAConfigManager iAConfigManager = IAConfigManager.O;
            u0 u0Var = new u0(tVar, iAConfigManager.f15027v.f15118a, new com.fyber.inneractive.sdk.cache.d(this.f15521a.f18469d.f18463a));
            this.f15523c = u0Var;
            iAConfigManager.f15024s.a(u0Var);
            return;
        }
        a aVar = new a("Main media image is not loadable");
        this.f15524d = com.fyber.inneractive.sdk.flow.nativead.b.FAILED;
        i iVar = i.NATIVE_AD_IMAGE_LOAD_FAILED;
        String message = aVar.getMessage();
        IAlog.f("%s : %s", f15520h, message);
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, iVar);
        c cVar2 = this.f15522b;
        if (cVar2 != null) {
            ((com.fyber.inneractive.sdk.flow.nativead.f) cVar2).a(inneractiveInfrastructureError, message);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void destroy() {
        u0 u0Var = this.f15523c;
        if (u0Var != null) {
            u0Var.c();
            this.f15523c = null;
        }
        this.f15525e = null;
        this.f15526f = null;
        this.f15521a = null;
        this.f15522b = null;
        this.f15524d = com.fyber.inneractive.sdk.flow.nativead.b.DESTROYED;
    }

    public b(com.fyber.inneractive.sdk.response.nativead.f fVar, com.fyber.inneractive.sdk.flow.nativead.f fVar2, j jVar, r rVar) {
        this.f15521a = fVar;
        this.f15522b = fVar2;
        this.f15525e = jVar;
        this.f15526f = rVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final boolean a() {
        return this.f15524d == com.fyber.inneractive.sdk.flow.nativead.b.LOADING;
    }
}
