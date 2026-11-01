package com.mbridge.msdk.config.component.load;

import android.text.TextUtils;
import com.ironsource.Z7;
import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.config.component.load.downloader.b;
import com.mbridge.msdk.config.component.load.downloader.c;
import com.mbridge.msdk.config.component.load.downloader.f;
import com.mbridge.msdk.config.component.load.downloader.g;
import com.mbridge.msdk.config.component.load.downloader.h;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class LoadCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.mbridge.msdk.config.component.load.model.a f33236l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f33232h = "DownloadComponent";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f33233i = "1000001";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f33234j = "1000002";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f33235k = "1000003";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f33237m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h<Object> f33238n = new a();

    public class a implements h<Object> {
        @Override // com.mbridge.msdk.config.component.load.downloader.h
        public void a(b<Object> bVar) {
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.h
        public void a(b<Object> bVar, com.mbridge.msdk.config.component.load.downloader.a aVar) {
            HashMap map = new HashMap();
            map.put("percent", String.valueOf(bVar.b()));
            map.put("file_size", String.valueOf(bVar.a()));
            map.put("code", "1000002");
            map.put("reason", aVar.a().getMessage());
            LoadCpt loadCpt = LoadCpt.this;
            loadCpt.a(loadCpt.a("912005", map));
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.h
        public void c(b<Object> bVar) {
        }

        public a() {
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.h
        public void b(b<Object> bVar) {
            HashMap map = new HashMap();
            map.put("file_size", String.valueOf(bVar.a()));
            LoadCpt loadCpt = LoadCpt.this;
            loadCpt.a(loadCpt.a("912002", map));
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.h
        public void d(b<Object> bVar) {
            HashMap map = new HashMap();
            map.put("percent", String.valueOf(bVar.b()));
            map.put("file_size", String.valueOf(bVar.a()));
            map.put("file_path", bVar.e());
            map.put("md5", bVar.f());
            try {
                com.mbridge.msdk.config.component.common.file.b bVarE = com.mbridge.msdk.config.component.common.file.a.e(LoadCpt.this.f33236l.d());
                if (bVarE != null && bVarE.b().contains("zip") && bVar.b() >= 100.0f) {
                    if (TextUtils.isEmpty(bVarE.d())) {
                        map.put("file_path", bVarE.d());
                    } else {
                        if (!com.mbridge.msdk.config.component.common.file.a.b(bVar.e(), com.mbridge.msdk.config.component.common.file.a.g(LoadCpt.this.f33236l.d()))) {
                            LoadCpt.this.a("912005", "1000003", "Unzip file failed");
                            return;
                        }
                        map.put("file_path", com.mbridge.msdk.config.component.common.file.a.j(LoadCpt.this.f33236l.d()));
                    }
                }
                LoadCpt loadCpt = LoadCpt.this;
                loadCpt.a(loadCpt.a("912004", map));
            } catch (Exception e10) {
                LoadCpt.this.a("912005", "1000002", e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.h
        public void a(b<Object> bVar, DownloadProgress downloadProgress) {
            q0.b("DownloadComponent", bVar + Z7.f27998r + downloadProgress.getCurrentDownloadRate());
            int currentDownloadRate = downloadProgress.getCurrentDownloadRate();
            if (bVar.g()) {
                return;
            }
            LoadCpt loadCpt = LoadCpt.this;
            if (currentDownloadRate == loadCpt.f33237m) {
                return;
            }
            loadCpt.f33237m = currentDownloadRate;
            HashMap map = new HashMap();
            map.put("percent", String.valueOf(currentDownloadRate));
            map.put("file_size", String.valueOf(downloadProgress.getTotal()));
            LoadCpt loadCpt2 = LoadCpt.this;
            loadCpt2.a(loadCpt2.a("912003", map));
        }
    }

    private void g() {
        try {
            com.mbridge.msdk.config.component.common.file.b bVarE = com.mbridge.msdk.config.component.common.file.a.e(this.f33236l.d());
            if (bVarE == null) {
                return;
            }
            int iB = (int) (this.f33236l.b() * 100.0f);
            com.mbridge.msdk.config.component.load.model.a aVar = this.f33236l;
            g.a().a(new b<>(aVar, aVar.d(), bVarE.a(), iB)).b(this.f33236l.f()).a(this.f33236l.f()).c(this.f33236l.f()).a(c.HIGH).withHttpRetryCounter(this.f33236l.e()).a(this.f33238n).withTimeout(60000L).build().n();
        } catch (Throwable th2) {
            q0.b("DownloadComponent", th2.getMessage());
            HashMap map = new HashMap();
            map.put("code", "");
            map.put("reason", th2.getMessage());
            a(a("912005", map));
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f32957f = "912001";
        this.f33236l = new com.mbridge.msdk.config.component.load.model.a(map);
        h();
    }

    public void i() {
        if (this.f33236l != null) {
            String strB = g.a().b(this.f33236l.d());
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            g.a().a(strB);
        }
    }

    public void j() {
        if (this.f33236l != null) {
            g();
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        if (TextUtils.isEmpty(this.f33236l.a())) {
            a("912005", "1000001", "Input parameter error");
            return;
        }
        if (this.f33236l.a().equals("start")) {
            j();
        }
        if (this.f33236l.a().equals("stop")) {
            i();
        }
    }

    public void h() {
        try {
            if (!g.a().b()) {
                g.a().a(new f.b().a(this.f33236l.c()).a());
            }
        } catch (Throwable th2) {
            q0.b("DownloadComponent", th2.getMessage());
        }
    }
}
