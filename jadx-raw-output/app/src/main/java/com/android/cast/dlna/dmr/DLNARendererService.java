package com.android.cast.dlna.dmr;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import ck.i;
import ck.p;
import ho.l;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.IOException;
import java.util.UUID;
import lk.a0;
import nj.b0;
import org.fourthline.cling.android.AndroidUpnpServiceImpl;
import org.fourthline.cling.model.ValidationException;
import un.g;
import un.h;
import yn.w;
import yn.z;
import z.f;

/* JADX INFO: compiled from: DLNARendererService.kt */
/* JADX INFO: loaded from: classes.dex */
public class DLNARendererService extends AndroidUpnpServiceImpl {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f6208i = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v.b f6209d = v.c.a("RendererService");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f6210e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f6211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z.c f6212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public un.e f6213h;

    /* JADX INFO: compiled from: DLNARendererService.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final void startService(Context context) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            context.getApplicationContext().startService(new Intent(context, (Class<?>) DLNARendererService.class));
        }
    }

    /* JADX INFO: compiled from: DLNARendererService.kt */
    public final class b extends AndroidUpnpServiceImpl.b implements y.b {
        public b() {
            super();
        }

        @Override // y.b
        public DLNARendererService a() {
            return DLNARendererService.this;
        }
    }

    /* JADX INFO: compiled from: DLNARendererService.kt */
    public static final class c extends gn.d {
        @Override // fn.a, fn.c
        public int m() {
            return 5000;
        }
    }

    /* JADX INFO: compiled from: DLNARendererService.kt */
    public static final class d extends l<z.b> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ DLNARendererService f6215h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(un.f<z.b> fVar, DLNARendererService dLNARendererService, fo.a aVar) {
            super(fVar, aVar);
            this.f6215h = dLNARendererService;
        }

        @Override // mn.b
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public z.b f() {
            f fVar = this.f6215h.f6211f;
            if (fVar == null) {
                p.B("avTransportControl");
                fVar = null;
            }
            return new z.b(fVar);
        }
    }

    /* JADX INFO: compiled from: DLNARendererService.kt */
    public static final class e extends l<z.e> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ DLNARendererService f6216h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(un.f<z.e> fVar, DLNARendererService dLNARendererService, lo.i iVar) {
            super(fVar, iVar);
            this.f6216h = dLNARendererService;
        }

        @Override // mn.b
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public z.e f() {
            z.c cVar = this.f6216h.f6212g;
            if (cVar == null) {
                p.B("audioControl");
                cVar = null;
            }
            return new z.e(cVar);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return 1;
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl
    public fn.c a() {
        return new c();
    }

    public final void e(y.a aVar) {
        f fVar = this.f6211f;
        if (fVar == null) {
            p.B("avTransportControl");
            fVar = null;
        }
        z.a aVar2 = fVar instanceof z.a ? (z.a) fVar : null;
        if (aVar2 != null) {
            aVar2.g(aVar);
        }
    }

    public final un.e f(String str) throws ValidationException, IOException {
        z zVar;
        p.j(str, "baseUrl");
        try {
            byte[] bytes = ("DLNA_MediaPlayer-" + str + '-' + Build.MODEL + '-' + Build.MANUFACTURER).getBytes(lk.c.f63591b);
            p.i(bytes, "this as java.lang.String).getBytes(charset)");
            zVar = new z(UUID.nameUUIDFromBytes(bytes));
        } catch (Exception unused) {
            zVar = new z(UUID.randomUUID());
        }
        v.b bVar = this.f6209d;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("create local device: [MediaRenderer][");
        String strA = zVar.a();
        p.i(strA, "getIdentifierString(...)");
        sb2.append((String) b0.r0(a0.N0(strA, new String[]{"-"}, false, 0, 6, null)));
        sb2.append("](");
        sb2.append(str);
        sb2.append(')');
        v.b.f(bVar, sb2.toString(), null, 2, null);
        un.c cVar = new un.c(zVar);
        w wVar = new w("MediaRenderer", 1);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("DMR (");
        String str2 = Build.MODEL;
        sb3.append(str2);
        sb3.append(')');
        return new un.e(cVar, wVar, new un.b(sb3.toString(), new g(Build.MANUFACTURER), new h(str2, "MPI MediaPlayer", "v1", str)), new un.d[0], g());
    }

    public un.f<?>[] g() {
        in.b bVar = new in.b();
        un.f<?> fVarB = bVar.b(z.b.class);
        p.h(fVarB, "null cannot be cast to non-null type org.fourthline.cling.model.meta.LocalService<com.android.cast.dlna.dmr.service.AVTransportServiceImpl>");
        fVarB.v(new d(fVarB, this, new fo.a()));
        un.f<?> fVarB2 = bVar.b(z.e.class);
        p.h(fVarB2, "null cannot be cast to non-null type org.fourthline.cling.model.meta.LocalService<com.android.cast.dlna.dmr.service.AudioRenderServiceImpl>");
        fVarB2.v(new e(fVarB2, this, new lo.i()));
        return new un.f[]{fVarB, fVarB2};
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl, android.app.Service
    public IBinder onBind(Intent intent) {
        p.j(intent, "intent");
        return this.f6210e;
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl, android.app.Service
    public void onCreate() {
        v.b.f(this.f6209d, "DLNARendererService create.", null, 2, null);
        super.onCreate();
        Context applicationContext = getApplicationContext();
        p.i(applicationContext, "getApplicationContext(...)");
        this.f6211f = new z.a(applicationContext);
        Context applicationContext2 = getApplicationContext();
        p.i(applicationContext2, "getApplicationContext(...)");
        this.f6212g = new z.d(applicationContext2);
        try {
            v.e eVar = v.e.f73007a;
            Context applicationContext3 = getApplicationContext();
            p.i(applicationContext3, "getApplicationContext(...)");
            this.f6213h = f(v.e.b(eVar, applicationContext3, 0, 2, null));
            this.f65749b.getRegistry().s(this.f6213h);
        } catch (Exception e10) {
            e10.printStackTrace();
            stopSelf();
        }
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl, android.app.Service
    public void onDestroy() {
        v.b.i(this.f6209d, "DLNARendererService destroy.", null, 2, null);
        un.e eVar = this.f6213h;
        if (eVar != null) {
            this.f65749b.getRegistry().m(eVar);
        }
        f fVar = this.f6211f;
        if (fVar == null) {
            p.B("avTransportControl");
            fVar = null;
        }
        z.a aVar = fVar instanceof z.a ? (z.a) fVar : null;
        if (aVar != null) {
            aVar.g(null);
        }
        super.onDestroy();
    }
}
