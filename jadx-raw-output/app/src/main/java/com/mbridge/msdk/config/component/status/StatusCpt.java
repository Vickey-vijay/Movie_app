package com.mbridge.msdk.config.component.status;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.safedk.android.analytics.events.CrashEvent;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class StatusCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static c f33548k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static e f33549l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static d f33550m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static a f33551n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f33552h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map<String, Object> f33553i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map<String, Object> f33554j = null;

    private void g() {
        boolean zC = c("916002");
        boolean zC2 = c("916005");
        boolean z10 = c("916004") || c("916003");
        boolean zC3 = c("916006");
        if (zC || zC2 || z10 || zC3) {
            return;
        }
        f33551n = null;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void c(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f33553i = map;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        String strValueOf;
        List<String> list;
        super.d();
        Map<String, Object> map = this.f33553i;
        if (map == null || map.isEmpty()) {
            return;
        }
        if (f33551n == null) {
            f33551n = new a() { // from class: com.mbridge.msdk.config.component.status.f
                @Override // com.mbridge.msdk.config.component.status.a
                public final void a(com.mbridge.msdk.config.component.base.b bVar) {
                    this.f33579a.c(bVar);
                }
            };
        }
        if (d("916002")) {
            if (!c("916002")) {
                c cVar = f33548k;
                if (cVar != null) {
                    cVar.b(f33551n);
                    f33548k.d();
                }
                f33548k = null;
            } else if (f33548k == null) {
                c cVar2 = new c();
                f33548k = cVar2;
                cVar2.a(f33551n);
            }
        }
        if (d("916003") || d("916004")) {
            if (c("916003") || c("916004")) {
                b bVar = com.mbridge.msdk.foundation.controller.a.f34557s;
                if (bVar != null) {
                    bVar.a(f33551n);
                }
            } else {
                b bVar2 = com.mbridge.msdk.foundation.controller.a.f34557s;
                if (bVar2 != null) {
                    bVar2.b(f33551n);
                }
            }
        }
        if (d("916005")) {
            if (!c("916005")) {
                e eVar = f33549l;
                if (eVar != null) {
                    eVar.b(f33551n);
                    f33549l.d();
                }
                f33549l = null;
            } else if (f33549l == null) {
                e eVar2 = new e();
                f33549l = eVar2;
                eVar2.a(f33551n);
            }
        }
        if (d("916006")) {
            Map<String, Object> map2 = this.f33554j;
            if (map2 != null) {
                Object obj = map2.get(DownloadModel.FILE_NAME);
                if (obj == null) {
                    obj = "";
                }
                strValueOf = String.valueOf(obj);
                list = (this.f33554j.containsKey("key_list") && (this.f33554j.get("key_list") instanceof List)) ? (List) this.f33554j.get("key_list") : null;
            } else {
                strValueOf = null;
                list = null;
            }
            if (!c("916006")) {
                d dVar = f33550m;
                if (dVar != null) {
                    dVar.b(f33551n);
                }
                f33550m = null;
            } else if (f33550m == null) {
                d dVar2 = new d(strValueOf);
                f33550m = dVar2;
                dVar2.a(list);
                f33550m.a(f33551n);
            }
        }
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(com.mbridge.msdk.config.component.base.b bVar) {
        String strC = bVar.c();
        strC.hashCode();
        switch (strC) {
            case "916002":
                String strValueOf = String.valueOf(bVar.b().get("networkType"));
                if (!TextUtils.isEmpty(this.f33552h)) {
                    if (!this.f33552h.equals(strValueOf)) {
                        this.f33552h = strValueOf;
                        a(a(bVar.c(), bVar.b()));
                        break;
                    }
                } else {
                    this.f33552h = strValueOf;
                    break;
                }
                break;
            case "916003":
            case "916004":
            case "916005":
            case "916006":
                a(a(bVar.c(), bVar.b()));
                break;
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f32957f = "916001";
        if (map == null) {
            return;
        }
        this.f33554j = map;
    }

    private boolean c(String str) {
        Object obj = this.f33553i.get(str);
        if (obj instanceof Map) {
            return String.valueOf(((Map) obj).get(CrashEvent.f44624e)).equals("1");
        }
        return false;
    }

    private boolean d(String str) {
        Object obj;
        Object obj2 = this.f33553i.get(str);
        if (!(obj2 instanceof Map) || (obj = ((Map) obj2).get(CrashEvent.f44624e)) == null) {
            return false;
        }
        String strValueOf = String.valueOf(obj);
        return strValueOf.equals("1") || strValueOf.equals("0");
    }
}
