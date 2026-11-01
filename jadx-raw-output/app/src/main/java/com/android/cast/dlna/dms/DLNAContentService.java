package com.android.cast.dlna.dms;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import ck.i;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.nio.charset.Charset;
import java.util.UUID;
import org.fourthline.cling.android.AndroidUpnpServiceImpl;
import un.e;
import un.f;
import un.g;
import un.h;
import yn.s;
import yn.w;
import yn.z;

/* JADX INFO: compiled from: DLNAContentService.kt */
/* JADX INFO: loaded from: classes5.dex */
public class DLNAContentService extends AndroidUpnpServiceImpl {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f6220h = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v.b f6221d = v.b.f73000b.a("LocalContentService");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f6222e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f6223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a0.a f6224g;

    /* JADX INFO: compiled from: DLNAContentService.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final void startService(Context context) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            context.getApplicationContext().startService(new Intent(context, (Class<?>) DLNAContentService.class));
        }
    }

    /* JADX INFO: compiled from: DLNAContentService.kt */
    public final class b extends AndroidUpnpServiceImpl.b {
        public b() {
            super();
        }
    }

    /* JADX INFO: compiled from: DLNAContentService.kt */
    public static final class c extends gn.d {
        @Override // fn.a, fn.c
        public s[] q() {
            return null;
        }
    }

    /* JADX INFO: compiled from: DLNAContentService.kt */
    public static final class d extends mn.b<go.a> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ DLNAContentService f6226g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f<go.a> fVar, DLNAContentService dLNAContentService) {
            super(fVar);
            this.f6226g = dLNAContentService;
        }

        @Override // mn.b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public go.a f() {
            a0.a aVar = this.f6226g.f6224g;
            if (aVar == null) {
                p.B("contentControl");
                aVar = null;
            }
            return new a0.c(aVar);
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

    public e d(String str) {
        z zVar;
        p.j(str, "baseUrl");
        String str2 = "DLNA_ContentService-" + str + '-' + Build.MODEL + '-' + Build.MANUFACTURER;
        try {
            Charset charset = lk.c.f63591b;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = str2.getBytes(charset);
            p.i(bytes, "(this as java.lang.String).getBytes(charset)");
            zVar = new z(UUID.nameUUIDFromBytes(bytes));
            v.b.f(this.f6221d, "create local device: [MediaServer][" + zVar + "](" + str + ')', null, 2, null);
            un.c cVar = new un.c(zVar);
            w wVar = new w("MediaServer", 1);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DMS (");
            String str3 = Build.MODEL;
            sb2.append(str3);
            sb2.append(')');
            return new e(cVar, wVar, new un.b(sb2.toString(), new g(Build.MANUFACTURER), new h(str3, "MSI MediaServer", "v1", str)), new un.d[0], e());
        } catch (Exception unused) {
            zVar = new z(UUID.randomUUID());
        }
    }

    public f<?>[] e() {
        f<?> fVarB = new in.b().b(go.a.class);
        p.h(fVarB, "null cannot be cast to non-null type org.fourthline.cling.model.meta.LocalService<org.fourthline.cling.support.contentdirectory.AbstractContentDirectoryService>");
        fVarB.v(new d(fVarB, this));
        return new f[]{fVarB};
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl, android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f6222e;
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl, android.app.Service
    public void onCreate() {
        v.b.f(this.f6221d, "DLNAContentService create.", null, 2, null);
        super.onCreate();
        this.f6224g = new a0.b(this);
        try {
            this.f6223f = d(v.e.b(v.e.f73007a, this, 0, 2, null));
            this.f65749b.getRegistry().s(this.f6223f);
        } catch (Exception e10) {
            e10.printStackTrace();
            stopSelf();
        }
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl, android.app.Service
    public void onDestroy() {
        v.b.i(this.f6221d, "DLNAContentService destroy.", null, 2, null);
        e eVar = this.f6223f;
        if (eVar != null) {
            this.f65749b.getRegistry().m(eVar);
        }
        super.onDestroy();
    }
}
