package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: UnitCacheCtroller.java */
/* JADX INFO: loaded from: classes4.dex */
public class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f39543c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> f39545e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f39548h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f39550j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f39551k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f39553m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private k f39556p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f39557q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<CampaignEx> f39541a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f39542b = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f39544d = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f39546f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> f39547g = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f39549i = 3600;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f39552l = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public com.mbridge.msdk.setting.l f39554n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.mbridge.msdk.setting.l f39555o = null;

    /* JADX INFO: compiled from: UnitCacheCtroller.java */
    public class a implements c {
        @Override // com.mbridge.msdk.videocommon.download.c
        public void onProgress(long j10, int i10) {
            if (i10 == 5 || i10 == 4) {
                l.this.f39542b = true;
                l.this.d();
            }
            if (i10 == 2) {
                l.this.f39542b = true;
            }
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: UnitCacheCtroller.java */
    public class b implements com.mbridge.msdk.videocommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f39559a;

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            if (l.this.f39543c != null) {
                l.this.f39543c.a(str);
            }
            if (l.this.f39545e == null || l.this.f39545e.size() <= 0 || this.f39559a == null) {
                return;
            }
            com.mbridge.msdk.videocommon.listener.a aVar = (com.mbridge.msdk.videocommon.listener.a) l.this.f39545e.get(this.f39559a.getRequestId() + "_" + this.f39559a.getSecondRequestIndex());
            if (aVar != null) {
                aVar.a(str);
                l.this.f39545e.remove(this.f39559a.getRequestId() + "_" + this.f39559a.getSecondRequestIndex());
            }
        }

        public b(CampaignEx campaignEx) {
            this.f39559a = campaignEx;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            if (l.this.f39543c != null) {
                l.this.f39543c.a(str, str2);
            }
            CampaignEx campaignEx = this.f39559a;
            if (campaignEx == null || campaignEx.getRsIgnoreCheckRule() == null || this.f39559a.getRsIgnoreCheckRule().size() <= 0 || !this.f39559a.getRsIgnoreCheckRule().contains(0)) {
                if (l.this.f39545e == null || l.this.f39545e.size() <= 0 || this.f39559a == null) {
                    return;
                }
                com.mbridge.msdk.videocommon.listener.a aVar = (com.mbridge.msdk.videocommon.listener.a) l.this.f39545e.get(this.f39559a.getRequestId() + "_" + this.f39559a.getSecondRequestIndex());
                if (aVar != null) {
                    aVar.a(str, str2);
                    l.this.f39545e.remove(this.f39559a.getRequestId() + "_" + this.f39559a.getSecondRequestIndex());
                    return;
                }
                return;
            }
            q0.c("UnitCacheCtroller", "Is not check video download status");
        }
    }

    public l(Context context, List<CampaignEx> list, String str, int i10) {
        this.f39553m = 1;
        try {
            boolean zB = j.a().b(i10);
            this.f39557q = zB;
            if (zB) {
                this.f39550j = str;
                this.f39553m = i10;
                this.f39556p = new k(list, str, i10);
                return;
            }
        } catch (Exception unused) {
            this.f39556p = null;
            this.f39557q = false;
        }
        this.f39548h = com.mbridge.msdk.foundation.controller.c.n().d();
        List<CampaignEx> list2 = this.f39541a;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        this.f39550j = str;
        this.f39553m = i10;
        a(this.f39541a);
    }

    private boolean a(CampaignEx.c cVar) {
        return true;
    }

    public CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> c() {
        k kVar;
        return (!this.f39557q || (kVar = this.f39556p) == null) ? this.f39547g : kVar.e();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0199 A[Catch: all -> 0x0225, TryCatch #1 {, blocks: (B:11:0x0016, B:13:0x001f, B:14:0x0021, B:15:0x0027, B:17:0x002d, B:20:0x0036, B:21:0x003e, B:23:0x0044, B:26:0x0054, B:29:0x005b, B:31:0x0061, B:32:0x0063, B:35:0x006f, B:36:0x007f, B:38:0x0090, B:40:0x0094, B:41:0x009c, B:42:0x00a0, B:48:0x00b5, B:50:0x00b9, B:51:0x00cd, B:53:0x00d1, B:55:0x00d7, B:57:0x00db, B:59:0x00df, B:60:0x00f3, B:62:0x00f7, B:74:0x0125, B:76:0x012a, B:78:0x0130, B:82:0x0167, B:83:0x016b, B:85:0x0170, B:89:0x0178, B:93:0x017e, B:95:0x0182, B:96:0x018b, B:98:0x018f, B:102:0x0199, B:103:0x019d, B:105:0x01bf, B:109:0x01c5, B:111:0x01c9, B:115:0x01d7, B:119:0x01e0, B:121:0x01eb, B:123:0x01ef, B:126:0x01f3, B:129:0x01f9, B:131:0x0204, B:135:0x020c, B:136:0x0211, B:142:0x021e, B:141:0x021b, B:63:0x00fc, B:65:0x0100, B:69:0x0115, B:70:0x011b, B:72:0x011f, B:143:0x0223), top: B:151:0x0016, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x01bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:96:0x018b A[Catch: all -> 0x0225, TryCatch #1 {, blocks: (B:11:0x0016, B:13:0x001f, B:14:0x0021, B:15:0x0027, B:17:0x002d, B:20:0x0036, B:21:0x003e, B:23:0x0044, B:26:0x0054, B:29:0x005b, B:31:0x0061, B:32:0x0063, B:35:0x006f, B:36:0x007f, B:38:0x0090, B:40:0x0094, B:41:0x009c, B:42:0x00a0, B:48:0x00b5, B:50:0x00b9, B:51:0x00cd, B:53:0x00d1, B:55:0x00d7, B:57:0x00db, B:59:0x00df, B:60:0x00f3, B:62:0x00f7, B:74:0x0125, B:76:0x012a, B:78:0x0130, B:82:0x0167, B:83:0x016b, B:85:0x0170, B:89:0x0178, B:93:0x017e, B:95:0x0182, B:96:0x018b, B:98:0x018f, B:102:0x0199, B:103:0x019d, B:105:0x01bf, B:109:0x01c5, B:111:0x01c9, B:115:0x01d7, B:119:0x01e0, B:121:0x01eb, B:123:0x01ef, B:126:0x01f3, B:129:0x01f9, B:131:0x0204, B:135:0x020c, B:136:0x0211, B:142:0x021e, B:141:0x021b, B:63:0x00fc, B:65:0x0100, B:69:0x0115, B:70:0x011b, B:72:0x011f, B:143:0x0223), top: B:151:0x0016, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x018f A[Catch: all -> 0x0225, TryCatch #1 {, blocks: (B:11:0x0016, B:13:0x001f, B:14:0x0021, B:15:0x0027, B:17:0x002d, B:20:0x0036, B:21:0x003e, B:23:0x0044, B:26:0x0054, B:29:0x005b, B:31:0x0061, B:32:0x0063, B:35:0x006f, B:36:0x007f, B:38:0x0090, B:40:0x0094, B:41:0x009c, B:42:0x00a0, B:48:0x00b5, B:50:0x00b9, B:51:0x00cd, B:53:0x00d1, B:55:0x00d7, B:57:0x00db, B:59:0x00df, B:60:0x00f3, B:62:0x00f7, B:74:0x0125, B:76:0x012a, B:78:0x0130, B:82:0x0167, B:83:0x016b, B:85:0x0170, B:89:0x0178, B:93:0x017e, B:95:0x0182, B:96:0x018b, B:98:0x018f, B:102:0x0199, B:103:0x019d, B:105:0x01bf, B:109:0x01c5, B:111:0x01c9, B:115:0x01d7, B:119:0x01e0, B:121:0x01eb, B:123:0x01ef, B:126:0x01f3, B:129:0x01f9, B:131:0x0204, B:135:0x020c, B:136:0x0211, B:142:0x021e, B:141:0x021b, B:63:0x00fc, B:65:0x0100, B:69:0x0115, B:70:0x011b, B:72:0x011f, B:143:0x0223), top: B:151:0x0016, inners: #0, #2 }] */
    public void d() {
        int iG;
        ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> concurrentHashMap;
        com.mbridge.msdk.videocommon.listener.a aVar;
        k kVar;
        if (this.f39557q && (kVar = this.f39556p) != null) {
            kVar.j();
            return;
        }
        b();
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.f39547g;
        if (copyOnWriteArrayList != null) {
            synchronized (copyOnWriteArrayList) {
                if (!a(this.f39547g)) {
                    this.f39542b = true;
                }
                for (Map<String, com.mbridge.msdk.videocommon.download.a> map : this.f39547g) {
                    if (map != null) {
                        Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                            if (value != null && !value.t()) {
                                if (this.f39553m == 95) {
                                    this.f39542b = true;
                                }
                                int iO = value.o();
                                CampaignEx campaignExH = value.h();
                                if (campaignExH != null && iO == 0) {
                                    iO = com.mbridge.msdk.videocommon.download.b.getInstance().b(campaignExH.getId(), campaignExH.getVideoUrlEncode());
                                }
                                int i10 = iO;
                                value.a(new b(campaignExH));
                                int iB = b(campaignExH);
                                if (this.f39553m == 1) {
                                    if (this.f39554n == null) {
                                        this.f39554n = com.mbridge.msdk.setting.l.i(this.f39550j);
                                    }
                                    iB = a(campaignExH);
                                }
                                int i11 = iB;
                                value.d(i11);
                                int i12 = this.f39553m;
                                if (i12 == 94 || i12 == 287 || i12 == 95) {
                                    if (this.f39551k == null) {
                                        this.f39551k = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f39550j, this.f39553m == 287);
                                    }
                                    com.mbridge.msdk.videocommon.setting.c cVar = this.f39551k;
                                    iG = cVar != null ? cVar.g() : 0;
                                } else {
                                    if (i12 != 298) {
                                        iG = 0;
                                    } else {
                                        if (this.f39555o == null) {
                                            this.f39555o = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f39550j);
                                        }
                                        com.mbridge.msdk.setting.l lVar = this.f39555o;
                                        if (lVar != null) {
                                            iG = lVar.i();
                                        } else {
                                            iG = 0;
                                        }
                                    }
                                    if (this.f39553m == 1) {
                                        if (this.f39554n == null) {
                                            this.f39554n = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f39550j);
                                        }
                                        com.mbridge.msdk.setting.l lVar2 = this.f39554n;
                                        if (lVar2 != null) {
                                            iG = lVar2.i();
                                        }
                                    }
                                }
                                value.b(iG);
                                int videoCtnType = campaignExH != null ? campaignExH.getVideoCtnType() : 1;
                                value.e(videoCtnType);
                                q0.b("UnitCacheCtroller", "ready_rate : " + i11 + " cd_rate : " + iG + " videoCtnType : " + videoCtnType);
                                if (a(value, b(campaignExH))) {
                                    String videoUrlEncode = campaignExH != null ? campaignExH.getVideoUrlEncode() : "";
                                    com.mbridge.msdk.videocommon.listener.a aVar2 = this.f39543c;
                                    if (aVar2 != null) {
                                        int i13 = this.f39553m;
                                        if (i13 == 297 || i13 == 298) {
                                            try {
                                                aVar2.a(videoUrlEncode);
                                            } catch (Exception e10) {
                                                if (MBridgeConstans.DEBUG) {
                                                    q0.b("UnitCacheCtroller", e10.getMessage());
                                                }
                                            }
                                            concurrentHashMap = this.f39545e;
                                            if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                                                String requestId = campaignExH != null ? campaignExH.getRequestId() : "";
                                                aVar = this.f39545e.get(requestId + "_" + campaignExH.getSecondRequestIndex());
                                                if (aVar != null) {
                                                    try {
                                                        aVar.a(videoUrlEncode);
                                                    } catch (Exception e11) {
                                                        if (MBridgeConstans.DEBUG) {
                                                            q0.b("UnitCacheCtroller", e11.getMessage());
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            concurrentHashMap = this.f39545e;
                                            if (concurrentHashMap != null) {
                                                if (campaignExH != null) {
                                                }
                                                aVar = this.f39545e.get(requestId + "_" + campaignExH.getSecondRequestIndex());
                                                if (aVar != null) {
                                                    aVar.a(videoUrlEncode);
                                                }
                                            }
                                        }
                                    } else {
                                        concurrentHashMap = this.f39545e;
                                        if (concurrentHashMap != null) {
                                            if (campaignExH != null) {
                                            }
                                            aVar = this.f39545e.get(requestId + "_" + campaignExH.getSecondRequestIndex());
                                            if (aVar != null) {
                                                aVar.a(videoUrlEncode);
                                            }
                                        }
                                    }
                                }
                                if (i10 != 1 && (i10 != 5 || !a(value, i11))) {
                                    if (i10 == 4) {
                                        continue;
                                    } else {
                                        if (m0.s(this.f39548h) != 9 && this.f39552l == 2) {
                                            return;
                                        }
                                        if (i10 == 2 || this.f39542b) {
                                            value.a(this.f39546f);
                                            if (a(value, i11)) {
                                                int i14 = this.f39553m;
                                                if (i14 == 94 || i14 == 287) {
                                                    value.B();
                                                }
                                            } else {
                                                int i15 = this.f39553m;
                                                if (i15 == 1 || i15 == 95 || i15 == 298) {
                                                    this.f39542b = false;
                                                }
                                                value.B();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void e() {
        k kVar;
        if (this.f39557q && (kVar = this.f39556p) != null) {
            kVar.k();
            return;
        }
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.f39547g;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    for (Map<String, com.mbridge.msdk.videocommon.download.a> map : this.f39547g) {
                        if (map != null) {
                            Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                                if (value != null && value.o() == 1) {
                                    value.c("playing and stop download");
                                    value.g();
                                    this.f39547g.remove(map);
                                    return;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("UnitCacheCtroller", th2.getMessage());
                }
            }
        }
    }

    public void b(List<CampaignEx> list) {
        k kVar;
        if (this.f39557q && (kVar = this.f39556p) != null) {
            kVar.a(list);
            return;
        }
        List<CampaignEx> list2 = this.f39541a;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        a(this.f39541a);
    }

    public void f(CampaignEx campaignEx) {
        k kVar;
        if (this.f39557q && (kVar = this.f39556p) != null) {
            kVar.h(campaignEx);
            return;
        }
        List<CampaignEx> list = this.f39541a;
        if (list != null && campaignEx != null) {
            list.add(campaignEx);
        }
        a(this.f39541a);
    }

    public void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        k kVar;
        if (this.f39557q && (kVar = this.f39556p) != null) {
            kVar.a(aVar);
        } else {
            this.f39543c = aVar;
        }
    }

    private int c(CampaignEx campaignEx) {
        try {
            if (campaignEx.getAdType() == 298) {
                if (this.f39555o == null) {
                    this.f39555o = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f39550j);
                }
                return this.f39555o.C();
            }
            if (campaignEx.getAdType() == 42) {
                return a((CampaignEx) null);
            }
            if (this.f39551k == null) {
                this.f39551k = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f39550j, false);
            }
            return this.f39551k.w();
        } catch (Throwable th2) {
            q0.b("UnitCacheCtroller", th2.getMessage(), th2);
            return 100;
        }
    }

    public void a(String str, com.mbridge.msdk.videocommon.listener.a aVar) {
        k kVar;
        if (this.f39557q && (kVar = this.f39556p) != null) {
            kVar.a(str, aVar);
            return;
        }
        if (this.f39545e == null) {
            this.f39545e = new ConcurrentHashMap<>();
        }
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f39545e.put(str, aVar);
    }

    public void b() {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList;
        k kVar;
        if (this.f39557q && (kVar = this.f39556p) != null) {
            kVar.a();
            return;
        }
        if (s0.a().a("u_n_c_e_d", true) || (copyOnWriteArrayList = this.f39547g) == null) {
            return;
        }
        try {
            synchronized (copyOnWriteArrayList) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                int i10 = 0;
                while (i10 < this.f39547g.size()) {
                    Map<String, com.mbridge.msdk.videocommon.download.a> map = this.f39547g.get(i10);
                    Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                        if (value != null) {
                            if (jCurrentTimeMillis - value.n() > this.f39549i * 1000 && value.o() == 1) {
                                value.c("download timeout");
                                value.c(this.f39552l);
                                value.g();
                                this.f39547g.remove(map);
                                i10--;
                            }
                            if (value.o() != 1 && value.o() != 5 && value.o() != 0) {
                                value.g();
                                this.f39547g.remove(map);
                                i10--;
                            }
                        }
                    }
                    i10++;
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc A[Catch: Exception -> 0x00f2, TryCatch #4 {Exception -> 0x00f2, blocks: (B:34:0x00b2, B:36:0x00bc, B:38:0x00c5, B:39:0x00cb, B:41:0x00d3, B:42:0x00e7, B:44:0x00eb), top: B:118:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5 A[Catch: Exception -> 0x00f2, TryCatch #4 {Exception -> 0x00f2, blocks: (B:34:0x00b2, B:36:0x00bc, B:38:0x00c5, B:39:0x00cb, B:41:0x00d3, B:42:0x00e7, B:44:0x00eb), top: B:118:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3 A[Catch: Exception -> 0x00f2, TryCatch #4 {Exception -> 0x00f2, blocks: (B:34:0x00b2, B:36:0x00bc, B:38:0x00c5, B:39:0x00cb, B:41:0x00d3, B:42:0x00e7, B:44:0x00eb), top: B:118:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb A[Catch: Exception -> 0x00f2, TRY_LEAVE, TryCatch #4 {Exception -> 0x00f2, blocks: (B:34:0x00b2, B:36:0x00bc, B:38:0x00c5, B:39:0x00cb, B:41:0x00d3, B:42:0x00e7, B:44:0x00eb), top: B:118:0x00b2 }] */
    private void a(List<CampaignEx> list) {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList;
        boolean z10;
        com.mbridge.msdk.videocommon.setting.a aVarC;
        com.mbridge.msdk.videocommon.setting.c cVar;
        if (list == null || list.size() == 0) {
            return;
        }
        if (list.get(0) != null) {
            this.f39544d = list.get(0).getCurrentLocalRid();
        }
        a();
        b();
        int i10 = this.f39553m;
        if (i10 == 1) {
            try {
                if (!TextUtils.isEmpty(this.f39550j)) {
                    com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f39550j);
                    this.f39554n = lVarE;
                    if (lVarE == null) {
                        this.f39554n = com.mbridge.msdk.setting.l.i(this.f39550j);
                    }
                    com.mbridge.msdk.setting.l lVar = this.f39554n;
                    if (lVar != null) {
                        this.f39549i = lVar.p();
                        this.f39552l = this.f39554n.q();
                    }
                }
            } catch (Exception unused) {
                q0.b("UnitCacheCtroller", "make sure your had put native video jar into your project");
                return;
            }
        } else if (i10 == 287) {
            try {
                aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
                if (aVarC == null) {
                    com.mbridge.msdk.videocommon.setting.b.b().a();
                }
                if (aVarC != null) {
                    this.f39549i = aVarC.c();
                }
                if (!TextUtils.isEmpty(this.f39550j)) {
                    this.f39551k = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f39550j);
                }
                cVar = this.f39551k;
                if (cVar != null) {
                    this.f39552l = cVar.l();
                }
            } catch (Exception unused2) {
                q0.b("UnitCacheCtroller", "make sure your had put reward jar into your project");
                return;
            }
        } else if (i10 == 298) {
            com.mbridge.msdk.setting.l lVarA = com.mbridge.msdk.setting.h.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f39550j);
            this.f39555o = lVarA;
            if (lVarA == null) {
                this.f39555o = com.mbridge.msdk.setting.h.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f39550j);
            }
            com.mbridge.msdk.setting.l lVar2 = this.f39555o;
            if (lVar2 != null) {
                this.f39549i = lVar2.p();
                this.f39552l = this.f39555o.q();
            }
        } else if (i10 == 94) {
            aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (aVarC == null) {
                com.mbridge.msdk.videocommon.setting.b.b().a();
            }
            if (aVarC != null) {
                this.f39549i = aVarC.c();
            }
            if (!TextUtils.isEmpty(this.f39550j)) {
                this.f39551k = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f39550j);
            }
            cVar = this.f39551k;
            if (cVar != null) {
                this.f39552l = cVar.l();
            }
        } else if (i10 == 95) {
            try {
                if (!TextUtils.isEmpty(this.f39550j)) {
                    com.mbridge.msdk.setting.l lVarE2 = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f39550j);
                    if (lVarE2 == null) {
                        lVarE2 = com.mbridge.msdk.setting.l.j(this.f39550j);
                    }
                    if (lVarE2 != null) {
                        this.f39549i = lVarE2.p();
                        this.f39552l = lVarE2.q();
                    }
                }
            } catch (Exception unused3) {
                q0.b("UnitCacheCtroller", "make sure your had put feeds jar into your project");
                return;
            }
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            CampaignEx campaignEx = list.get(i11);
            if (campaignEx != null) {
                int i12 = this.f39553m;
                String str = (i12 != 94 && i12 != 287) ? campaignEx.getId() + campaignEx.getVideoUrlEncode() + campaignEx.getBidToken() : campaignEx.getRequestId() + campaignEx.getId() + campaignEx.getVideoUrlEncode();
                if ((d(campaignEx) || !TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) && (copyOnWriteArrayList = this.f39547g) != null) {
                    synchronized (copyOnWriteArrayList) {
                        int i13 = 0;
                        while (true) {
                            try {
                                if (i13 >= this.f39547g.size()) {
                                    z10 = false;
                                    break;
                                }
                                Map<String, com.mbridge.msdk.videocommon.download.a> map = this.f39547g.get(i13);
                                if (map != null && map.containsKey(str)) {
                                    com.mbridge.msdk.videocommon.download.a aVar = map.get(str);
                                    if (aVar != null) {
                                        aVar.e(campaignEx);
                                        aVar.c(this.f39552l);
                                        aVar.b(false);
                                        map.remove(str);
                                        map.put(str, aVar);
                                        this.f39547g.set(i13, map);
                                    }
                                    z10 = true;
                                    break;
                                }
                                i13++;
                            } catch (Throwable th2) {
                                if (MBridgeConstans.DEBUG) {
                                    q0.b("UnitCacheCtroller", th2.getMessage());
                                }
                            }
                        }
                        if (!z10) {
                            com.mbridge.msdk.videocommon.download.a aVar2 = new com.mbridge.msdk.videocommon.download.a(this.f39548h, campaignEx, this.f39550j, this.f39552l);
                            aVar2.c(this.f39552l);
                            aVar2.a(this.f39553m);
                            HashMap map2 = new HashMap();
                            map2.put(str, aVar2);
                            this.f39547g.add(map2);
                        } else {
                            e(campaignEx);
                        }
                    }
                }
            }
        }
        List<CampaignEx> list2 = this.f39541a;
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        this.f39541a.clear();
    }

    private void e(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("cache", 1);
                eVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(b(campaignEx)));
                if (b(campaignEx) == 100) {
                    eVar.a("resumed_breakpoint", "2");
                } else {
                    eVar.a("resumed_breakpoint", "1");
                }
                eVar.a("resource_type", 4);
                eVar.a("scenes", "1");
                eVar.a("url", campaignEx.getVideoUrlEncode());
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_download_start", campaignEx, eVar);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public l(Context context, CampaignEx campaignEx, String str, int i10) {
        this.f39553m = 1;
        try {
            boolean zB = j.a().b(i10);
            this.f39557q = zB;
            if (zB) {
                this.f39550j = str;
                this.f39553m = i10;
                this.f39556p = new k(campaignEx, str, i10);
                return;
            }
        } catch (Exception unused) {
            this.f39556p = null;
            this.f39557q = false;
        }
        this.f39548h = com.mbridge.msdk.foundation.controller.c.n().d();
        List<CampaignEx> list = this.f39541a;
        if (list != null && campaignEx != null) {
            list.add(campaignEx);
        }
        this.f39550j = str;
        this.f39553m = i10;
        a(this.f39541a);
    }

    private int b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return -1;
        }
        if (campaignEx.getReady_rate() != -1) {
            return campaignEx.getReady_rate();
        }
        return c(campaignEx);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0198 A[Catch: all -> 0x02a9, Exception -> 0x02ab, TRY_LEAVE, TryCatch #0 {Exception -> 0x02ab, blocks: (B:11:0x0019, B:15:0x0025, B:28:0x006f, B:29:0x0074, B:31:0x007c, B:32:0x008c, B:34:0x0092, B:36:0x00a0, B:39:0x00a8, B:40:0x00b2, B:42:0x00b8, B:49:0x00db, B:52:0x00e3, B:55:0x00ea, B:57:0x00fa, B:58:0x0102, B:88:0x0161, B:90:0x0173, B:96:0x0184, B:98:0x018a, B:141:0x0228, B:100:0x0198, B:104:0x01a2, B:106:0x01a8, B:114:0x01b4, B:116:0x01c2, B:118:0x01cc, B:120:0x01da, B:126:0x01f5, B:128:0x01fb, B:130:0x0201, B:134:0x020c, B:140:0x0220, B:145:0x023b, B:148:0x0243, B:150:0x0247, B:152:0x0251, B:154:0x0257, B:158:0x025f, B:161:0x0269, B:163:0x0273, B:165:0x0279, B:62:0x0110, B:64:0x0116, B:66:0x0120, B:69:0x0129, B:71:0x012f, B:73:0x0135, B:76:0x0141, B:78:0x0147, B:82:0x014f, B:84:0x0159, B:19:0x0033, B:21:0x003f, B:27:0x0055, B:173:0x029f, B:25:0x0049), top: B:187:0x0019, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01a8 A[Catch: all -> 0x02a9, Exception -> 0x02ab, TRY_LEAVE, TryCatch #0 {Exception -> 0x02ab, blocks: (B:11:0x0019, B:15:0x0025, B:28:0x006f, B:29:0x0074, B:31:0x007c, B:32:0x008c, B:34:0x0092, B:36:0x00a0, B:39:0x00a8, B:40:0x00b2, B:42:0x00b8, B:49:0x00db, B:52:0x00e3, B:55:0x00ea, B:57:0x00fa, B:58:0x0102, B:88:0x0161, B:90:0x0173, B:96:0x0184, B:98:0x018a, B:141:0x0228, B:100:0x0198, B:104:0x01a2, B:106:0x01a8, B:114:0x01b4, B:116:0x01c2, B:118:0x01cc, B:120:0x01da, B:126:0x01f5, B:128:0x01fb, B:130:0x0201, B:134:0x020c, B:140:0x0220, B:145:0x023b, B:148:0x0243, B:150:0x0247, B:152:0x0251, B:154:0x0257, B:158:0x025f, B:161:0x0269, B:163:0x0273, B:165:0x0279, B:62:0x0110, B:64:0x0116, B:66:0x0120, B:69:0x0129, B:71:0x012f, B:73:0x0135, B:76:0x0141, B:78:0x0147, B:82:0x014f, B:84:0x0159, B:19:0x0033, B:21:0x003f, B:27:0x0055, B:173:0x029f, B:25:0x0049), top: B:187:0x0019, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c2 A[Catch: all -> 0x02a9, Exception -> 0x02ab, TryCatch #0 {Exception -> 0x02ab, blocks: (B:11:0x0019, B:15:0x0025, B:28:0x006f, B:29:0x0074, B:31:0x007c, B:32:0x008c, B:34:0x0092, B:36:0x00a0, B:39:0x00a8, B:40:0x00b2, B:42:0x00b8, B:49:0x00db, B:52:0x00e3, B:55:0x00ea, B:57:0x00fa, B:58:0x0102, B:88:0x0161, B:90:0x0173, B:96:0x0184, B:98:0x018a, B:141:0x0228, B:100:0x0198, B:104:0x01a2, B:106:0x01a8, B:114:0x01b4, B:116:0x01c2, B:118:0x01cc, B:120:0x01da, B:126:0x01f5, B:128:0x01fb, B:130:0x0201, B:134:0x020c, B:140:0x0220, B:145:0x023b, B:148:0x0243, B:150:0x0247, B:152:0x0251, B:154:0x0257, B:158:0x025f, B:161:0x0269, B:163:0x0273, B:165:0x0279, B:62:0x0110, B:64:0x0116, B:66:0x0120, B:69:0x0129, B:71:0x012f, B:73:0x0135, B:76:0x0141, B:78:0x0147, B:82:0x014f, B:84:0x0159, B:19:0x0033, B:21:0x003f, B:27:0x0055, B:173:0x029f, B:25:0x0049), top: B:187:0x0019, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x01cc A[Catch: all -> 0x02a9, Exception -> 0x02ab, TryCatch #0 {Exception -> 0x02ab, blocks: (B:11:0x0019, B:15:0x0025, B:28:0x006f, B:29:0x0074, B:31:0x007c, B:32:0x008c, B:34:0x0092, B:36:0x00a0, B:39:0x00a8, B:40:0x00b2, B:42:0x00b8, B:49:0x00db, B:52:0x00e3, B:55:0x00ea, B:57:0x00fa, B:58:0x0102, B:88:0x0161, B:90:0x0173, B:96:0x0184, B:98:0x018a, B:141:0x0228, B:100:0x0198, B:104:0x01a2, B:106:0x01a8, B:114:0x01b4, B:116:0x01c2, B:118:0x01cc, B:120:0x01da, B:126:0x01f5, B:128:0x01fb, B:130:0x0201, B:134:0x020c, B:140:0x0220, B:145:0x023b, B:148:0x0243, B:150:0x0247, B:152:0x0251, B:154:0x0257, B:158:0x025f, B:161:0x0269, B:163:0x0273, B:165:0x0279, B:62:0x0110, B:64:0x0116, B:66:0x0120, B:69:0x0129, B:71:0x012f, B:73:0x0135, B:76:0x0141, B:78:0x0147, B:82:0x014f, B:84:0x0159, B:19:0x0033, B:21:0x003f, B:27:0x0055, B:173:0x029f, B:25:0x0049), top: B:187:0x0019, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x01da A[Catch: all -> 0x02a9, Exception -> 0x02ab, TryCatch #0 {Exception -> 0x02ab, blocks: (B:11:0x0019, B:15:0x0025, B:28:0x006f, B:29:0x0074, B:31:0x007c, B:32:0x008c, B:34:0x0092, B:36:0x00a0, B:39:0x00a8, B:40:0x00b2, B:42:0x00b8, B:49:0x00db, B:52:0x00e3, B:55:0x00ea, B:57:0x00fa, B:58:0x0102, B:88:0x0161, B:90:0x0173, B:96:0x0184, B:98:0x018a, B:141:0x0228, B:100:0x0198, B:104:0x01a2, B:106:0x01a8, B:114:0x01b4, B:116:0x01c2, B:118:0x01cc, B:120:0x01da, B:126:0x01f5, B:128:0x01fb, B:130:0x0201, B:134:0x020c, B:140:0x0220, B:145:0x023b, B:148:0x0243, B:150:0x0247, B:152:0x0251, B:154:0x0257, B:158:0x025f, B:161:0x0269, B:163:0x0273, B:165:0x0279, B:62:0x0110, B:64:0x0116, B:66:0x0120, B:69:0x0129, B:71:0x012f, B:73:0x0135, B:76:0x0141, B:78:0x0147, B:82:0x014f, B:84:0x0159, B:19:0x0033, B:21:0x003f, B:27:0x0055, B:173:0x029f, B:25:0x0049), top: B:187:0x0019, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:125:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:130:0x0201 A[Catch: all -> 0x02a9, Exception -> 0x02ab, TRY_LEAVE, TryCatch #0 {Exception -> 0x02ab, blocks: (B:11:0x0019, B:15:0x0025, B:28:0x006f, B:29:0x0074, B:31:0x007c, B:32:0x008c, B:34:0x0092, B:36:0x00a0, B:39:0x00a8, B:40:0x00b2, B:42:0x00b8, B:49:0x00db, B:52:0x00e3, B:55:0x00ea, B:57:0x00fa, B:58:0x0102, B:88:0x0161, B:90:0x0173, B:96:0x0184, B:98:0x018a, B:141:0x0228, B:100:0x0198, B:104:0x01a2, B:106:0x01a8, B:114:0x01b4, B:116:0x01c2, B:118:0x01cc, B:120:0x01da, B:126:0x01f5, B:128:0x01fb, B:130:0x0201, B:134:0x020c, B:140:0x0220, B:145:0x023b, B:148:0x0243, B:150:0x0247, B:152:0x0251, B:154:0x0257, B:158:0x025f, B:161:0x0269, B:163:0x0273, B:165:0x0279, B:62:0x0110, B:64:0x0116, B:66:0x0120, B:69:0x0129, B:71:0x012f, B:73:0x0135, B:76:0x0141, B:78:0x0147, B:82:0x014f, B:84:0x0159, B:19:0x0033, B:21:0x003f, B:27:0x0055, B:173:0x029f, B:25:0x0049), top: B:187:0x0019, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x020c A[Catch: all -> 0x02a9, Exception -> 0x02ab, TRY_ENTER, TryCatch #0 {Exception -> 0x02ab, blocks: (B:11:0x0019, B:15:0x0025, B:28:0x006f, B:29:0x0074, B:31:0x007c, B:32:0x008c, B:34:0x0092, B:36:0x00a0, B:39:0x00a8, B:40:0x00b2, B:42:0x00b8, B:49:0x00db, B:52:0x00e3, B:55:0x00ea, B:57:0x00fa, B:58:0x0102, B:88:0x0161, B:90:0x0173, B:96:0x0184, B:98:0x018a, B:141:0x0228, B:100:0x0198, B:104:0x01a2, B:106:0x01a8, B:114:0x01b4, B:116:0x01c2, B:118:0x01cc, B:120:0x01da, B:126:0x01f5, B:128:0x01fb, B:130:0x0201, B:134:0x020c, B:140:0x0220, B:145:0x023b, B:148:0x0243, B:150:0x0247, B:152:0x0251, B:154:0x0257, B:158:0x025f, B:161:0x0269, B:163:0x0273, B:165:0x0279, B:62:0x0110, B:64:0x0116, B:66:0x0120, B:69:0x0129, B:71:0x012f, B:73:0x0135, B:76:0x0141, B:78:0x0147, B:82:0x014f, B:84:0x0159, B:19:0x0033, B:21:0x003f, B:27:0x0055, B:173:0x029f, B:25:0x0049), top: B:187:0x0019, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x021a  */
    /* JADX WARN: Code duplicated, block: B:145:0x023b A[Catch: all -> 0x02a9, Exception -> 0x02ab, TryCatch #0 {Exception -> 0x02ab, blocks: (B:11:0x0019, B:15:0x0025, B:28:0x006f, B:29:0x0074, B:31:0x007c, B:32:0x008c, B:34:0x0092, B:36:0x00a0, B:39:0x00a8, B:40:0x00b2, B:42:0x00b8, B:49:0x00db, B:52:0x00e3, B:55:0x00ea, B:57:0x00fa, B:58:0x0102, B:88:0x0161, B:90:0x0173, B:96:0x0184, B:98:0x018a, B:141:0x0228, B:100:0x0198, B:104:0x01a2, B:106:0x01a8, B:114:0x01b4, B:116:0x01c2, B:118:0x01cc, B:120:0x01da, B:126:0x01f5, B:128:0x01fb, B:130:0x0201, B:134:0x020c, B:140:0x0220, B:145:0x023b, B:148:0x0243, B:150:0x0247, B:152:0x0251, B:154:0x0257, B:158:0x025f, B:161:0x0269, B:163:0x0273, B:165:0x0279, B:62:0x0110, B:64:0x0116, B:66:0x0120, B:69:0x0129, B:71:0x012f, B:73:0x0135, B:76:0x0141, B:78:0x0147, B:82:0x014f, B:84:0x0159, B:19:0x0033, B:21:0x003f, B:27:0x0055, B:173:0x029f, B:25:0x0049), top: B:187:0x0019, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x0241  */
    /* JADX WARN: Code duplicated, block: B:148:0x0243 A[Catch: all -> 0x02a9, Exception -> 0x02ab, TryCatch #0 {Exception -> 0x02ab, blocks: (B:11:0x0019, B:15:0x0025, B:28:0x006f, B:29:0x0074, B:31:0x007c, B:32:0x008c, B:34:0x0092, B:36:0x00a0, B:39:0x00a8, B:40:0x00b2, B:42:0x00b8, B:49:0x00db, B:52:0x00e3, B:55:0x00ea, B:57:0x00fa, B:58:0x0102, B:88:0x0161, B:90:0x0173, B:96:0x0184, B:98:0x018a, B:141:0x0228, B:100:0x0198, B:104:0x01a2, B:106:0x01a8, B:114:0x01b4, B:116:0x01c2, B:118:0x01cc, B:120:0x01da, B:126:0x01f5, B:128:0x01fb, B:130:0x0201, B:134:0x020c, B:140:0x0220, B:145:0x023b, B:148:0x0243, B:150:0x0247, B:152:0x0251, B:154:0x0257, B:158:0x025f, B:161:0x0269, B:163:0x0273, B:165:0x0279, B:62:0x0110, B:64:0x0116, B:66:0x0120, B:69:0x0129, B:71:0x012f, B:73:0x0135, B:76:0x0141, B:78:0x0147, B:82:0x014f, B:84:0x0159, B:19:0x0033, B:21:0x003f, B:27:0x0055, B:173:0x029f, B:25:0x0049), top: B:187:0x0019, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0247 A[Catch: all -> 0x02a9, Exception -> 0x02ab, TryCatch #0 {Exception -> 0x02ab, blocks: (B:11:0x0019, B:15:0x0025, B:28:0x006f, B:29:0x0074, B:31:0x007c, B:32:0x008c, B:34:0x0092, B:36:0x00a0, B:39:0x00a8, B:40:0x00b2, B:42:0x00b8, B:49:0x00db, B:52:0x00e3, B:55:0x00ea, B:57:0x00fa, B:58:0x0102, B:88:0x0161, B:90:0x0173, B:96:0x0184, B:98:0x018a, B:141:0x0228, B:100:0x0198, B:104:0x01a2, B:106:0x01a8, B:114:0x01b4, B:116:0x01c2, B:118:0x01cc, B:120:0x01da, B:126:0x01f5, B:128:0x01fb, B:130:0x0201, B:134:0x020c, B:140:0x0220, B:145:0x023b, B:148:0x0243, B:150:0x0247, B:152:0x0251, B:154:0x0257, B:158:0x025f, B:161:0x0269, B:163:0x0273, B:165:0x0279, B:62:0x0110, B:64:0x0116, B:66:0x0120, B:69:0x0129, B:71:0x012f, B:73:0x0135, B:76:0x0141, B:78:0x0147, B:82:0x014f, B:84:0x0159, B:19:0x0033, B:21:0x003f, B:27:0x0055, B:173:0x029f, B:25:0x0049), top: B:187:0x0019, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x0267 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:161:0x0269 A[Catch: all -> 0x02a9, Exception -> 0x02ab, TryCatch #0 {Exception -> 0x02ab, blocks: (B:11:0x0019, B:15:0x0025, B:28:0x006f, B:29:0x0074, B:31:0x007c, B:32:0x008c, B:34:0x0092, B:36:0x00a0, B:39:0x00a8, B:40:0x00b2, B:42:0x00b8, B:49:0x00db, B:52:0x00e3, B:55:0x00ea, B:57:0x00fa, B:58:0x0102, B:88:0x0161, B:90:0x0173, B:96:0x0184, B:98:0x018a, B:141:0x0228, B:100:0x0198, B:104:0x01a2, B:106:0x01a8, B:114:0x01b4, B:116:0x01c2, B:118:0x01cc, B:120:0x01da, B:126:0x01f5, B:128:0x01fb, B:130:0x0201, B:134:0x020c, B:140:0x0220, B:145:0x023b, B:148:0x0243, B:150:0x0247, B:152:0x0251, B:154:0x0257, B:158:0x025f, B:161:0x0269, B:163:0x0273, B:165:0x0279, B:62:0x0110, B:64:0x0116, B:66:0x0120, B:69:0x0129, B:71:0x012f, B:73:0x0135, B:76:0x0141, B:78:0x0147, B:82:0x014f, B:84:0x0159, B:19:0x0033, B:21:0x003f, B:27:0x0055, B:173:0x029f, B:25:0x0049), top: B:187:0x0019, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x020a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x022a A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x0238 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0161 A[Catch: all -> 0x02a9, Exception -> 0x02ab, TRY_ENTER, TryCatch #0 {Exception -> 0x02ab, blocks: (B:11:0x0019, B:15:0x0025, B:28:0x006f, B:29:0x0074, B:31:0x007c, B:32:0x008c, B:34:0x0092, B:36:0x00a0, B:39:0x00a8, B:40:0x00b2, B:42:0x00b8, B:49:0x00db, B:52:0x00e3, B:55:0x00ea, B:57:0x00fa, B:58:0x0102, B:88:0x0161, B:90:0x0173, B:96:0x0184, B:98:0x018a, B:141:0x0228, B:100:0x0198, B:104:0x01a2, B:106:0x01a8, B:114:0x01b4, B:116:0x01c2, B:118:0x01cc, B:120:0x01da, B:126:0x01f5, B:128:0x01fb, B:130:0x0201, B:134:0x020c, B:140:0x0220, B:145:0x023b, B:148:0x0243, B:150:0x0247, B:152:0x0251, B:154:0x0257, B:158:0x025f, B:161:0x0269, B:163:0x0273, B:165:0x0279, B:62:0x0110, B:64:0x0116, B:66:0x0120, B:69:0x0129, B:71:0x012f, B:73:0x0135, B:76:0x0141, B:78:0x0147, B:82:0x014f, B:84:0x0159, B:19:0x0033, B:21:0x003f, B:27:0x0055, B:173:0x029f, B:25:0x0049), top: B:187:0x0019, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0173 A[Catch: all -> 0x02a9, Exception -> 0x02ab, TRY_LEAVE, TryCatch #0 {Exception -> 0x02ab, blocks: (B:11:0x0019, B:15:0x0025, B:28:0x006f, B:29:0x0074, B:31:0x007c, B:32:0x008c, B:34:0x0092, B:36:0x00a0, B:39:0x00a8, B:40:0x00b2, B:42:0x00b8, B:49:0x00db, B:52:0x00e3, B:55:0x00ea, B:57:0x00fa, B:58:0x0102, B:88:0x0161, B:90:0x0173, B:96:0x0184, B:98:0x018a, B:141:0x0228, B:100:0x0198, B:104:0x01a2, B:106:0x01a8, B:114:0x01b4, B:116:0x01c2, B:118:0x01cc, B:120:0x01da, B:126:0x01f5, B:128:0x01fb, B:130:0x0201, B:134:0x020c, B:140:0x0220, B:145:0x023b, B:148:0x0243, B:150:0x0247, B:152:0x0251, B:154:0x0257, B:158:0x025f, B:161:0x0269, B:163:0x0273, B:165:0x0279, B:62:0x0110, B:64:0x0116, B:66:0x0120, B:69:0x0129, B:71:0x012f, B:73:0x0135, B:76:0x0141, B:78:0x0147, B:82:0x014f, B:84:0x0159, B:19:0x0033, B:21:0x003f, B:27:0x0055, B:173:0x029f, B:25:0x0049), top: B:187:0x0019, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0184 A[Catch: all -> 0x02a9, Exception -> 0x02ab, TRY_ENTER, TryCatch #0 {Exception -> 0x02ab, blocks: (B:11:0x0019, B:15:0x0025, B:28:0x006f, B:29:0x0074, B:31:0x007c, B:32:0x008c, B:34:0x0092, B:36:0x00a0, B:39:0x00a8, B:40:0x00b2, B:42:0x00b8, B:49:0x00db, B:52:0x00e3, B:55:0x00ea, B:57:0x00fa, B:58:0x0102, B:88:0x0161, B:90:0x0173, B:96:0x0184, B:98:0x018a, B:141:0x0228, B:100:0x0198, B:104:0x01a2, B:106:0x01a8, B:114:0x01b4, B:116:0x01c2, B:118:0x01cc, B:120:0x01da, B:126:0x01f5, B:128:0x01fb, B:130:0x0201, B:134:0x020c, B:140:0x0220, B:145:0x023b, B:148:0x0243, B:150:0x0247, B:152:0x0251, B:154:0x0257, B:158:0x025f, B:161:0x0269, B:163:0x0273, B:165:0x0279, B:62:0x0110, B:64:0x0116, B:66:0x0120, B:69:0x0129, B:71:0x012f, B:73:0x0135, B:76:0x0141, B:78:0x0147, B:82:0x014f, B:84:0x0159, B:19:0x0033, B:21:0x003f, B:27:0x0055, B:173:0x029f, B:25:0x0049), top: B:187:0x0019, outer: #1 }] */
    public com.mbridge.msdk.videocommon.download.a b(int i10, boolean z10) {
        List<CampaignEx> listB;
        boolean z11;
        char c10;
        boolean zIsEmpty;
        int iO;
        int i11;
        long jN;
        int i12;
        k kVar;
        i10 = i10;
        z10 = z10;
        if (this.f39557q && (kVar = this.f39556p) != null) {
            return kVar.i();
        }
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.f39547g;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        synchronized (copyOnWriteArrayList) {
            try {
                try {
                    int i13 = this.f39553m;
                    char c11 = 287;
                    int i14 = 94;
                    boolean z12 = true;
                    if (i13 != 94 && i13 != 287) {
                        listB = com.mbridge.msdk.videocommon.cache.a.a().c(this.f39550j, 1);
                        if (listB == null) {
                            return null;
                        }
                    } else {
                        listB = com.mbridge.msdk.videocommon.cache.a.a().b(this.f39550j, 1, z10);
                        if ((listB == null || listB.size() == 0) && (i10 == 94 || i10 == 287)) {
                            listB = com.mbridge.msdk.videocommon.cache.a.a().c(this.f39550j, 1, z10);
                        }
                        if (listB != null) {
                            q0.a("UnitCacheCtroller", "UnitCache isReady campaignList = " + listB.size());
                        } else {
                            q0.a("UnitCacheCtroller", "UnitCache isReady campaignList = 0");
                            return null;
                        }
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i15 = 0;
                    while (i15 < this.f39547g.size()) {
                        Map<String, com.mbridge.msdk.videocommon.download.a> map = this.f39547g.get(i15);
                        Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                            if (value == null || value.h() == null) {
                                z11 = z12;
                            } else {
                                CampaignEx campaignExH = value.h();
                                Iterator<CampaignEx> it2 = listB.iterator();
                                boolean z13 = false;
                                while (it2.hasNext()) {
                                    if (campaignExH.getId().equals(it2.next().getId())) {
                                        z13 = true;
                                    }
                                }
                                if (z13 && ((!z10 || campaignExH.isBidCampaign()) && (z10 || !campaignExH.isBidCampaign()))) {
                                    String str = campaignExH.getendcard_url();
                                    String videoUrlEncode = campaignExH.getVideoUrlEncode();
                                    String strJ = campaignExH.getRewardTemplateMode() != null ? campaignExH.getRewardTemplateMode().j() : "";
                                    CampaignEx.c rewardTemplateMode = campaignExH.getRewardTemplateMode();
                                    if (this.f39553m == i14 || i10 == 287) {
                                        if (TextUtils.isEmpty(strJ) || strJ.contains(CampaignEx.KEY_IS_CMPT_ENTRY) || a(this.f39553m, campaignExH, strJ)) {
                                            if (b(str, campaignExH)) {
                                                if (value.t()) {
                                                    value.y();
                                                } else {
                                                    if (a1.a(videoUrlEncode)) {
                                                        if (a(rewardTemplateMode)) {
                                                            return value;
                                                        }
                                                    } else if (a(value, b(campaignExH)) && a(rewardTemplateMode)) {
                                                        return value;
                                                    }
                                                    zIsEmpty = TextUtils.isEmpty(value.k());
                                                    iO = value.o();
                                                    if (this.f39553m != 298) {
                                                    }
                                                    if (iO == 5) {
                                                        if (value.t()) {
                                                            value.y();
                                                            this.f39547g.remove(map);
                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                        } else if (!zIsEmpty) {
                                                            value.a(0, 0);
                                                            if (this.f39553m == 95) {
                                                                return value;
                                                            }
                                                        } else {
                                                            if (a(str, campaignExH)) {
                                                            }
                                                            return null;
                                                        }
                                                    } else {
                                                        if (!s0.a().a("u_n_c_e_d", true)) {
                                                            jN = value.n();
                                                            if (value.o() == 1) {
                                                                jCurrentTimeMillis = jCurrentTimeMillis;
                                                                if (jCurrentTimeMillis - jN > this.f39549i * 1000) {
                                                                    value.c("download timeout");
                                                                    value.g();
                                                                    this.f39547g.remove(map);
                                                                    i15--;
                                                                    i12 = this.f39553m;
                                                                    if (i12 != 1) {
                                                                    }
                                                                }
                                                            } else {
                                                                jCurrentTimeMillis = jCurrentTimeMillis;
                                                            }
                                                            if (this.f39553m == 95) {
                                                                if (value.t()) {
                                                                    return value;
                                                                }
                                                                value.y();
                                                                this.f39547g.remove(map);
                                                            } else {
                                                                if (s0.a().a("u_n_c_e_d", true)) {
                                                                }
                                                                z11 = true;
                                                                if (iO == 1) {
                                                                    if (value.t()) {
                                                                        i14 = 94;
                                                                        c10 = 287;
                                                                        z12 = z11;
                                                                        c11 = c10;
                                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                                    } else if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                                        return value;
                                                                    }
                                                                }
                                                                i11 = this.f39553m;
                                                                i14 = 94;
                                                                c10 = 287;
                                                                if (i11 != 94) {
                                                                }
                                                                z12 = z11;
                                                                c11 = c10;
                                                                jCurrentTimeMillis = jCurrentTimeMillis;
                                                            }
                                                        } else {
                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                            if (this.f39553m == 95) {
                                                                if (value.t()) {
                                                                    return value;
                                                                }
                                                                value.y();
                                                                this.f39547g.remove(map);
                                                            } else {
                                                                if (s0.a().a("u_n_c_e_d", true)) {
                                                                }
                                                                z11 = true;
                                                                if (iO == 1) {
                                                                    if (value.t()) {
                                                                        i14 = 94;
                                                                        c10 = 287;
                                                                        z12 = z11;
                                                                        c11 = c10;
                                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                                    } else if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                                        return value;
                                                                    }
                                                                }
                                                                i11 = this.f39553m;
                                                                i14 = 94;
                                                                c10 = 287;
                                                                if (i11 != 94) {
                                                                }
                                                                z12 = z11;
                                                                c11 = c10;
                                                                jCurrentTimeMillis = jCurrentTimeMillis;
                                                            }
                                                        }
                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                        c11 = 287;
                                                        i14 = 94;
                                                        z12 = true;
                                                    }
                                                    i15--;
                                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                                    c11 = 287;
                                                    i14 = 94;
                                                    z12 = true;
                                                }
                                            } else {
                                                zIsEmpty = TextUtils.isEmpty(value.k());
                                                iO = value.o();
                                                if (this.f39553m != 298 && a(value, b(campaignExH))) {
                                                    return value;
                                                }
                                                if (iO == 5) {
                                                    if (value.t()) {
                                                        value.y();
                                                        this.f39547g.remove(map);
                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                    } else if (!zIsEmpty) {
                                                        value.a(0, 0);
                                                        if (this.f39553m == 95) {
                                                            return value;
                                                        }
                                                    } else {
                                                        if (a(str, campaignExH) || !a(rewardTemplateMode)) {
                                                            return null;
                                                        }
                                                        return value;
                                                    }
                                                } else {
                                                    if (!s0.a().a("u_n_c_e_d", true)) {
                                                        jN = value.n();
                                                        if (value.o() == 1) {
                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                            if (jCurrentTimeMillis - jN > this.f39549i * 1000) {
                                                                value.c("download timeout");
                                                                value.g();
                                                                this.f39547g.remove(map);
                                                                i15--;
                                                                i12 = this.f39553m;
                                                                if (i12 != 1 || i12 == 94) {
                                                                }
                                                            }
                                                        } else {
                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                        }
                                                        if (this.f39553m == 95) {
                                                            if (value.t()) {
                                                                return value;
                                                            }
                                                            value.y();
                                                            this.f39547g.remove(map);
                                                        } else if (s0.a().a("u_n_c_e_d", true) && (iO == 4 || iO == 2)) {
                                                            this.f39547g.remove(map);
                                                            value.g();
                                                        } else {
                                                            z11 = true;
                                                            if (iO == 1) {
                                                                if (value.t()) {
                                                                    i14 = 94;
                                                                    c10 = 287;
                                                                    z12 = z11;
                                                                    c11 = c10;
                                                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                                                } else if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY && a(value, b(campaignExH)) && a(str, campaignExH) && a(rewardTemplateMode)) {
                                                                    return value;
                                                                }
                                                            }
                                                            i11 = this.f39553m;
                                                            i14 = 94;
                                                            c10 = 287;
                                                            if ((i11 != 94 || i11 == 287) && a(value, b(campaignExH)) && a(str, campaignExH) && a(rewardTemplateMode)) {
                                                            }
                                                            z12 = z11;
                                                            c11 = c10;
                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                        }
                                                    } else {
                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                        if (this.f39553m == 95) {
                                                            if (value.t()) {
                                                                return value;
                                                            }
                                                            value.y();
                                                            this.f39547g.remove(map);
                                                        } else {
                                                            if (s0.a().a("u_n_c_e_d", true)) {
                                                            }
                                                            z11 = true;
                                                            if (iO == 1) {
                                                                if (value.t()) {
                                                                    i14 = 94;
                                                                    c10 = 287;
                                                                    z12 = z11;
                                                                    c11 = c10;
                                                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                                                } else if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                                    return value;
                                                                }
                                                            }
                                                            i11 = this.f39553m;
                                                            i14 = 94;
                                                            c10 = 287;
                                                            return i11 != 94 ? value : value;
                                                            z12 = z11;
                                                            c11 = c10;
                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                        }
                                                    }
                                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                                    c11 = 287;
                                                    i14 = 94;
                                                    z12 = true;
                                                }
                                                i15--;
                                                jCurrentTimeMillis = jCurrentTimeMillis;
                                                c11 = 287;
                                                i14 = 94;
                                                z12 = true;
                                            }
                                        }
                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                        z11 = true;
                                        i14 = 94;
                                        c10 = 287;
                                        z12 = z11;
                                        c11 = c10;
                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                    } else {
                                        zIsEmpty = TextUtils.isEmpty(value.k());
                                        iO = value.o();
                                        if (this.f39553m != 298) {
                                        }
                                        if (iO == 5) {
                                            if (value.t()) {
                                                value.y();
                                                this.f39547g.remove(map);
                                                jCurrentTimeMillis = jCurrentTimeMillis;
                                            } else if (!zIsEmpty) {
                                                value.a(0, 0);
                                                if (this.f39553m == 95) {
                                                    return value;
                                                }
                                                jCurrentTimeMillis = jCurrentTimeMillis;
                                                z11 = true;
                                                i14 = 94;
                                                c10 = 287;
                                                z12 = z11;
                                                c11 = c10;
                                                jCurrentTimeMillis = jCurrentTimeMillis;
                                            } else {
                                                if (a(str, campaignExH)) {
                                                }
                                                return null;
                                            }
                                        } else {
                                            if (!s0.a().a("u_n_c_e_d", true)) {
                                                jN = value.n();
                                                if (value.o() == 1) {
                                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                                    if (jCurrentTimeMillis - jN > this.f39549i * 1000) {
                                                        value.c("download timeout");
                                                        value.g();
                                                        this.f39547g.remove(map);
                                                        i15--;
                                                        i12 = this.f39553m;
                                                        if (i12 != 1) {
                                                        }
                                                    }
                                                } else {
                                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                                }
                                                if (this.f39553m == 95) {
                                                    if (value.t()) {
                                                        return value;
                                                    }
                                                    value.y();
                                                    this.f39547g.remove(map);
                                                } else {
                                                    if (s0.a().a("u_n_c_e_d", true)) {
                                                    }
                                                    z11 = true;
                                                    if (iO == 1) {
                                                        if (value.t()) {
                                                            i14 = 94;
                                                            c10 = 287;
                                                            z12 = z11;
                                                            c11 = c10;
                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                        } else if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                            return value;
                                                        }
                                                    }
                                                    i11 = this.f39553m;
                                                    i14 = 94;
                                                    c10 = 287;
                                                    if (i11 != 94) {
                                                    }
                                                    z12 = z11;
                                                    c11 = c10;
                                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                                }
                                            } else {
                                                jCurrentTimeMillis = jCurrentTimeMillis;
                                                if (this.f39553m == 95) {
                                                    if (value.t()) {
                                                        return value;
                                                    }
                                                    value.y();
                                                    this.f39547g.remove(map);
                                                } else {
                                                    if (s0.a().a("u_n_c_e_d", true)) {
                                                    }
                                                    z11 = true;
                                                    if (iO == 1) {
                                                        if (value.t()) {
                                                            i14 = 94;
                                                            c10 = 287;
                                                            z12 = z11;
                                                            c11 = c10;
                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                        } else if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                            return value;
                                                        }
                                                    }
                                                    i11 = this.f39553m;
                                                    i14 = 94;
                                                    c10 = 287;
                                                    if (i11 != 94) {
                                                    }
                                                    z12 = z11;
                                                    c11 = c10;
                                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                                }
                                            }
                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                            c11 = 287;
                                            i14 = 94;
                                            z12 = true;
                                        }
                                        i15--;
                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                        c11 = 287;
                                        i14 = 94;
                                        z12 = true;
                                    }
                                } else {
                                    z11 = true;
                                }
                            }
                            c10 = c11;
                            z12 = z11;
                            c11 = c10;
                            jCurrentTimeMillis = jCurrentTimeMillis;
                        }
                        i15++;
                        z10 = z10;
                        jCurrentTimeMillis = jCurrentTimeMillis;
                        i10 = i10;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean d(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            return campaignEx.getPlayable_ads_without_video() == 2;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th2.printStackTrace();
            return false;
        }
    }

    private void a() {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.f39547g;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    int i10 = 0;
                    while (i10 < this.f39547g.size()) {
                        Map<String, com.mbridge.msdk.videocommon.download.a> map = this.f39547g.get(i10);
                        Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                            if (value != null && value.h() != null && value.t()) {
                                value.y();
                                this.f39547g.remove(map);
                                i10--;
                            }
                        }
                        i10++;
                    }
                }
            } catch (Throwable unused) {
                q0.b("UnitCacheCtroller", "cleanDisplayTask ERROR");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d7 A[Catch: Exception -> 0x0222, all -> 0x02ca, TryCatch #3 {, blocks: (B:11:0x0025, B:12:0x002a, B:14:0x0032, B:15:0x0042, B:17:0x0048, B:19:0x0056, B:22:0x005e, B:23:0x0068, B:25:0x006e, B:28:0x0078, B:30:0x0082, B:32:0x008c, B:34:0x009a, B:36:0x00a8, B:38:0x00b2, B:44:0x00cf, B:47:0x00d7, B:50:0x00e1, B:52:0x00f1, B:54:0x00fd, B:87:0x0172, B:89:0x0181, B:91:0x0187, B:93:0x0197, B:95:0x019f, B:97:0x01a8, B:99:0x01af, B:101:0x01b5, B:104:0x01ba, B:107:0x01bd, B:109:0x01c7, B:111:0x01cd, B:113:0x01d7, B:115:0x01e5, B:135:0x022e, B:139:0x023c, B:141:0x0240, B:143:0x024a, B:145:0x0250, B:148:0x0258, B:183:0x02ce, B:184:0x02d1, B:157:0x0276, B:159:0x0280, B:161:0x0286, B:163:0x028c, B:129:0x0214, B:57:0x010b, B:59:0x0111, B:61:0x011b, B:64:0x0125, B:66:0x012b, B:68:0x0131, B:71:0x013d, B:73:0x0143, B:75:0x0149, B:77:0x0150, B:79:0x015a, B:81:0x0160), top: B:198:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x01e5 A[Catch: Exception -> 0x0222, all -> 0x02ca, TryCatch #3 {, blocks: (B:11:0x0025, B:12:0x002a, B:14:0x0032, B:15:0x0042, B:17:0x0048, B:19:0x0056, B:22:0x005e, B:23:0x0068, B:25:0x006e, B:28:0x0078, B:30:0x0082, B:32:0x008c, B:34:0x009a, B:36:0x00a8, B:38:0x00b2, B:44:0x00cf, B:47:0x00d7, B:50:0x00e1, B:52:0x00f1, B:54:0x00fd, B:87:0x0172, B:89:0x0181, B:91:0x0187, B:93:0x0197, B:95:0x019f, B:97:0x01a8, B:99:0x01af, B:101:0x01b5, B:104:0x01ba, B:107:0x01bd, B:109:0x01c7, B:111:0x01cd, B:113:0x01d7, B:115:0x01e5, B:135:0x022e, B:139:0x023c, B:141:0x0240, B:143:0x024a, B:145:0x0250, B:148:0x0258, B:183:0x02ce, B:184:0x02d1, B:157:0x0276, B:159:0x0280, B:161:0x0286, B:163:0x028c, B:129:0x0214, B:57:0x010b, B:59:0x0111, B:61:0x011b, B:64:0x0125, B:66:0x012b, B:68:0x0131, B:71:0x013d, B:73:0x0143, B:75:0x0149, B:77:0x0150, B:79:0x015a, B:81:0x0160), top: B:198:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0209  */
    /* JADX WARN: Code duplicated, block: B:133:0x0229  */
    /* JADX WARN: Code duplicated, block: B:135:0x022e A[Catch: Exception -> 0x0295, all -> 0x02ca, TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:11:0x0025, B:12:0x002a, B:14:0x0032, B:15:0x0042, B:17:0x0048, B:19:0x0056, B:22:0x005e, B:23:0x0068, B:25:0x006e, B:28:0x0078, B:30:0x0082, B:32:0x008c, B:34:0x009a, B:36:0x00a8, B:38:0x00b2, B:44:0x00cf, B:47:0x00d7, B:50:0x00e1, B:52:0x00f1, B:54:0x00fd, B:87:0x0172, B:89:0x0181, B:91:0x0187, B:93:0x0197, B:95:0x019f, B:97:0x01a8, B:99:0x01af, B:101:0x01b5, B:104:0x01ba, B:107:0x01bd, B:109:0x01c7, B:111:0x01cd, B:113:0x01d7, B:115:0x01e5, B:135:0x022e, B:139:0x023c, B:141:0x0240, B:143:0x024a, B:145:0x0250, B:148:0x0258, B:183:0x02ce, B:184:0x02d1, B:157:0x0276, B:159:0x0280, B:161:0x0286, B:163:0x028c, B:129:0x0214, B:57:0x010b, B:59:0x0111, B:61:0x011b, B:64:0x0125, B:66:0x012b, B:68:0x0131, B:71:0x013d, B:73:0x0143, B:75:0x0149, B:77:0x0150, B:79:0x015a, B:81:0x0160), top: B:198:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0234  */
    /* JADX WARN: Code duplicated, block: B:139:0x023c A[Catch: Exception -> 0x0295, all -> 0x02ca, TRY_ENTER, TryCatch #3 {, blocks: (B:11:0x0025, B:12:0x002a, B:14:0x0032, B:15:0x0042, B:17:0x0048, B:19:0x0056, B:22:0x005e, B:23:0x0068, B:25:0x006e, B:28:0x0078, B:30:0x0082, B:32:0x008c, B:34:0x009a, B:36:0x00a8, B:38:0x00b2, B:44:0x00cf, B:47:0x00d7, B:50:0x00e1, B:52:0x00f1, B:54:0x00fd, B:87:0x0172, B:89:0x0181, B:91:0x0187, B:93:0x0197, B:95:0x019f, B:97:0x01a8, B:99:0x01af, B:101:0x01b5, B:104:0x01ba, B:107:0x01bd, B:109:0x01c7, B:111:0x01cd, B:113:0x01d7, B:115:0x01e5, B:135:0x022e, B:139:0x023c, B:141:0x0240, B:143:0x024a, B:145:0x0250, B:148:0x0258, B:183:0x02ce, B:184:0x02d1, B:157:0x0276, B:159:0x0280, B:161:0x0286, B:163:0x028c, B:129:0x0214, B:57:0x010b, B:59:0x0111, B:61:0x011b, B:64:0x0125, B:66:0x012b, B:68:0x0131, B:71:0x013d, B:73:0x0143, B:75:0x0149, B:77:0x0150, B:79:0x015a, B:81:0x0160), top: B:198:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0240 A[Catch: Exception -> 0x0295, all -> 0x02ca, TryCatch #3 {, blocks: (B:11:0x0025, B:12:0x002a, B:14:0x0032, B:15:0x0042, B:17:0x0048, B:19:0x0056, B:22:0x005e, B:23:0x0068, B:25:0x006e, B:28:0x0078, B:30:0x0082, B:32:0x008c, B:34:0x009a, B:36:0x00a8, B:38:0x00b2, B:44:0x00cf, B:47:0x00d7, B:50:0x00e1, B:52:0x00f1, B:54:0x00fd, B:87:0x0172, B:89:0x0181, B:91:0x0187, B:93:0x0197, B:95:0x019f, B:97:0x01a8, B:99:0x01af, B:101:0x01b5, B:104:0x01ba, B:107:0x01bd, B:109:0x01c7, B:111:0x01cd, B:113:0x01d7, B:115:0x01e5, B:135:0x022e, B:139:0x023c, B:141:0x0240, B:143:0x024a, B:145:0x0250, B:148:0x0258, B:183:0x02ce, B:184:0x02d1, B:157:0x0276, B:159:0x0280, B:161:0x0286, B:163:0x028c, B:129:0x0214, B:57:0x010b, B:59:0x0111, B:61:0x011b, B:64:0x0125, B:66:0x012b, B:68:0x0131, B:71:0x013d, B:73:0x0143, B:75:0x0149, B:77:0x0150, B:79:0x015a, B:81:0x0160), top: B:198:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0265  */
    /* JADX WARN: Code duplicated, block: B:153:0x026b  */
    /* JADX WARN: Code duplicated, block: B:159:0x0280 A[Catch: Exception -> 0x02b2, all -> 0x02ca, TryCatch #3 {, blocks: (B:11:0x0025, B:12:0x002a, B:14:0x0032, B:15:0x0042, B:17:0x0048, B:19:0x0056, B:22:0x005e, B:23:0x0068, B:25:0x006e, B:28:0x0078, B:30:0x0082, B:32:0x008c, B:34:0x009a, B:36:0x00a8, B:38:0x00b2, B:44:0x00cf, B:47:0x00d7, B:50:0x00e1, B:52:0x00f1, B:54:0x00fd, B:87:0x0172, B:89:0x0181, B:91:0x0187, B:93:0x0197, B:95:0x019f, B:97:0x01a8, B:99:0x01af, B:101:0x01b5, B:104:0x01ba, B:107:0x01bd, B:109:0x01c7, B:111:0x01cd, B:113:0x01d7, B:115:0x01e5, B:135:0x022e, B:139:0x023c, B:141:0x0240, B:143:0x024a, B:145:0x0250, B:148:0x0258, B:183:0x02ce, B:184:0x02d1, B:157:0x0276, B:159:0x0280, B:161:0x0286, B:163:0x028c, B:129:0x0214, B:57:0x010b, B:59:0x0111, B:61:0x011b, B:64:0x0125, B:66:0x012b, B:68:0x0131, B:71:0x013d, B:73:0x0143, B:75:0x0149, B:77:0x0150, B:79:0x015a, B:81:0x0160), top: B:198:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:210:0x01cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0181 A[Catch: Exception -> 0x0299, all -> 0x02ca, TryCatch #2 {Exception -> 0x0299, blocks: (B:54:0x00fd, B:87:0x0172, B:89:0x0181, B:91:0x0187, B:93:0x0197, B:95:0x019f, B:97:0x01a8, B:99:0x01af, B:101:0x01b5, B:107:0x01bd, B:57:0x010b, B:59:0x0111, B:61:0x011b, B:64:0x0125, B:66:0x012b, B:68:0x0131, B:71:0x013d, B:73:0x0143, B:75:0x0149, B:77:0x0150, B:79:0x015a, B:81:0x0160), top: B:202:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0187 A[Catch: Exception -> 0x0299, all -> 0x02ca, TryCatch #2 {Exception -> 0x0299, blocks: (B:54:0x00fd, B:87:0x0172, B:89:0x0181, B:91:0x0187, B:93:0x0197, B:95:0x019f, B:97:0x01a8, B:99:0x01af, B:101:0x01b5, B:107:0x01bd, B:57:0x010b, B:59:0x0111, B:61:0x011b, B:64:0x0125, B:66:0x012b, B:68:0x0131, B:71:0x013d, B:73:0x0143, B:75:0x0149, B:77:0x0150, B:79:0x015a, B:81:0x0160), top: B:202:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0195 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0197 A[Catch: Exception -> 0x0299, all -> 0x02ca, TryCatch #2 {Exception -> 0x0299, blocks: (B:54:0x00fd, B:87:0x0172, B:89:0x0181, B:91:0x0187, B:93:0x0197, B:95:0x019f, B:97:0x01a8, B:99:0x01af, B:101:0x01b5, B:107:0x01bd, B:57:0x010b, B:59:0x0111, B:61:0x011b, B:64:0x0125, B:66:0x012b, B:68:0x0131, B:71:0x013d, B:73:0x0143, B:75:0x0149, B:77:0x0150, B:79:0x015a, B:81:0x0160), top: B:202:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:95:0x019f A[Catch: Exception -> 0x0299, all -> 0x02ca, TryCatch #2 {Exception -> 0x0299, blocks: (B:54:0x00fd, B:87:0x0172, B:89:0x0181, B:91:0x0187, B:93:0x0197, B:95:0x019f, B:97:0x01a8, B:99:0x01af, B:101:0x01b5, B:107:0x01bd, B:57:0x010b, B:59:0x0111, B:61:0x011b, B:64:0x0125, B:66:0x012b, B:68:0x0131, B:71:0x013d, B:73:0x0143, B:75:0x0149, B:77:0x0150, B:79:0x015a, B:81:0x0160), top: B:202:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a8 A[Catch: Exception -> 0x0299, all -> 0x02ca, TryCatch #2 {Exception -> 0x0299, blocks: (B:54:0x00fd, B:87:0x0172, B:89:0x0181, B:91:0x0187, B:93:0x0197, B:95:0x019f, B:97:0x01a8, B:99:0x01af, B:101:0x01b5, B:107:0x01bd, B:57:0x010b, B:59:0x0111, B:61:0x011b, B:64:0x0125, B:66:0x012b, B:68:0x0131, B:71:0x013d, B:73:0x0143, B:75:0x0149, B:77:0x0150, B:79:0x015a, B:81:0x0160), top: B:202:0x00fd }] */
    public List<com.mbridge.msdk.videocommon.download.a> a(String str, int i10, boolean z10, List<CampaignEx> list, boolean z11, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        long j10;
        Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it;
        String str2;
        String str3;
        String str4;
        boolean zIsEmpty;
        int iO;
        long jN;
        String str5;
        int i11;
        long j11;
        k kVar;
        if (this.f39557q && (kVar = this.f39556p) != null) {
            return kVar.a(list, z11);
        }
        ArrayList arrayList = new ArrayList();
        String str6 = "";
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.f39547g;
        if (copyOnWriteArrayList != null) {
            synchronized (copyOnWriteArrayList) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i12 = 0;
                    while (i12 < this.f39547g.size()) {
                        Map<String, com.mbridge.msdk.videocommon.download.a> map = this.f39547g.get(i12);
                        Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it2 = map.entrySet().iterator();
                        while (it2.hasNext()) {
                            try {
                                com.mbridge.msdk.videocommon.download.a value = it2.next().getValue();
                                if (value == null || value.h() == null) {
                                    arrayList = arrayList;
                                    j10 = jCurrentTimeMillis;
                                    it = it2;
                                    str2 = "task or task's campaign is NULL";
                                } else {
                                    CampaignEx campaignExH = value.h();
                                    boolean z12 = false;
                                    for (CampaignEx campaignEx : list) {
                                        if (campaignExH != null && campaignEx != null && !TextUtils.isEmpty(campaignExH.getRequestId()) && !TextUtils.isEmpty(campaignEx.getRequestId()) && campaignExH.getId().equals(campaignEx.getId()) && campaignExH.getRequestId().equals(campaignEx.getRequestId())) {
                                            if (!TextUtils.isEmpty(campaignEx.getNLRid())) {
                                                campaignExH.setNLRid(campaignEx.getNLRid());
                                            }
                                            z12 = true;
                                        }
                                    }
                                    if (!z12) {
                                        arrayList = arrayList;
                                        str6 = "campaign is not available";
                                        j10 = jCurrentTimeMillis;
                                        it = it2;
                                    } else if ((!z10 || campaignExH.isBidCampaign()) && (z10 || !campaignExH.isBidCampaign())) {
                                        String str7 = campaignExH.getendcard_url();
                                        String videoUrlEncode = campaignExH.getVideoUrlEncode();
                                        String strJ = campaignExH.getRewardTemplateMode() != null ? campaignExH.getRewardTemplateMode().j() : "";
                                        String str8 = str6;
                                        try {
                                            CampaignEx.c rewardTemplateMode = campaignExH.getRewardTemplateMode();
                                            it = it2;
                                            if (i10 == 94 || i10 == 287) {
                                                if (TextUtils.isEmpty(strJ) || strJ.contains(CampaignEx.KEY_IS_CMPT_ENTRY) || a(i10, campaignExH, strJ)) {
                                                    if (!b(str7, campaignExH)) {
                                                        str3 = "endcard is downloading or fail";
                                                    } else if (value.t()) {
                                                        value.y();
                                                        str4 = "task is displayed";
                                                    } else {
                                                        if (a1.a(videoUrlEncode)) {
                                                            if (a(rewardTemplateMode)) {
                                                                arrayList.add(value);
                                                            } else {
                                                                str3 = "image list is downloading or fail";
                                                            }
                                                        } else if (a(value, b(campaignExH), z11) && a(rewardTemplateMode)) {
                                                            arrayList.add(value);
                                                        } else {
                                                            str3 = "video and image list is downloading or fail";
                                                        }
                                                        arrayList = arrayList;
                                                        j10 = jCurrentTimeMillis;
                                                        str6 = str8;
                                                    }
                                                    str8 = str3;
                                                    zIsEmpty = TextUtils.isEmpty(value.k());
                                                    iO = value.o();
                                                    if (iO == 5) {
                                                        if (value.t()) {
                                                            value.y();
                                                            this.f39547g.remove(map);
                                                            i12--;
                                                            str4 = "task is displayed";
                                                        } else {
                                                            if (!zIsEmpty) {
                                                                value.a(0, 0);
                                                                if (i10 == 95) {
                                                                    arrayList.add(value);
                                                                } else {
                                                                    str6 = "resource path is not effective";
                                                                }
                                                            } else {
                                                                if (a(str7, campaignExH) || !a(rewardTemplateMode)) {
                                                                    return null;
                                                                }
                                                                arrayList.add(value);
                                                            }
                                                            arrayList = arrayList;
                                                            j10 = jCurrentTimeMillis;
                                                            str6 = str8;
                                                        }
                                                        j10 = jCurrentTimeMillis;
                                                    } else {
                                                        arrayList = arrayList;
                                                        try {
                                                            if (s0.a().a("u_n_c_e_d", true)) {
                                                                j10 = jCurrentTimeMillis;
                                                                i11 = 1;
                                                            } else {
                                                                try {
                                                                    jN = value.n();
                                                                    if (value.o() == 1) {
                                                                        j11 = jCurrentTimeMillis - jN;
                                                                        j10 = jCurrentTimeMillis;
                                                                        if (j11 > this.f39549i * 1000) {
                                                                            value.c("download timeout");
                                                                            value.g();
                                                                            this.f39547g.remove(map);
                                                                            i12--;
                                                                            if (i10 != 1 || i10 == 94) {
                                                                                str6 = "video download time over dlct";
                                                                                arrayList = arrayList;
                                                                            } else {
                                                                                str8 = "video download time over dlct";
                                                                            }
                                                                        }
                                                                    } else {
                                                                        j10 = jCurrentTimeMillis;
                                                                    }
                                                                    if (iO != 4 || iO == 2) {
                                                                        this.f39547g.remove(map);
                                                                        value.g();
                                                                        i12--;
                                                                        str5 = "video download stop or pause";
                                                                    } else {
                                                                        i11 = 1;
                                                                    }
                                                                    str6 = str5;
                                                                    arrayList = arrayList;
                                                                } catch (Exception e10) {
                                                                    e = e10;
                                                                    str6 = str8;
                                                                    arrayList = arrayList;
                                                                }
                                                            }
                                                            if (iO != i11) {
                                                                if (value.t()) {
                                                                    str5 = "video was displayed";
                                                                    str6 = str5;
                                                                    arrayList = arrayList;
                                                                } else {
                                                                    if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                                        if (!a(value, b(campaignExH), z11) && a(str7, campaignExH) && a(rewardTemplateMode)) {
                                                                            arrayList = arrayList;
                                                                            try {
                                                                                arrayList.add(value);
                                                                            } catch (Exception e11) {
                                                                                e = e11;
                                                                            }
                                                                        } else {
                                                                            str8 = "video or endcard or image list is downloading or fail";
                                                                        }
                                                                    }
                                                                    if (i10 == 94) {
                                                                    }
                                                                    if (!a(value, b(campaignExH), z11)) {
                                                                    }
                                                                    str2 = "video or endcard or image list is downloading or fail";
                                                                }
                                                                str6 = str8;
                                                                e.printStackTrace();
                                                            } else if (i10 == 94 && i10 != 287) {
                                                                arrayList = arrayList;
                                                                str6 = str8;
                                                            } else if (!a(value, b(campaignExH), z11) && a(str7, campaignExH) && a(rewardTemplateMode)) {
                                                                arrayList.add(value);
                                                            } else {
                                                                str2 = "video or endcard or image list is downloading or fail";
                                                            }
                                                            str6 = str8;
                                                        } catch (Exception e12) {
                                                            e = e12;
                                                            arrayList = arrayList;
                                                        }
                                                    }
                                                    it2 = it;
                                                    jCurrentTimeMillis = j10;
                                                } else {
                                                    str4 = "template is null or download is not ready";
                                                }
                                                str6 = str4;
                                                j10 = jCurrentTimeMillis;
                                            } else {
                                                zIsEmpty = TextUtils.isEmpty(value.k());
                                                iO = value.o();
                                                if (iO == 5) {
                                                    if (value.t()) {
                                                        value.y();
                                                        this.f39547g.remove(map);
                                                        i12--;
                                                        str4 = "task is displayed";
                                                        str6 = str4;
                                                    } else {
                                                        if (!zIsEmpty) {
                                                            value.a(0, 0);
                                                            if (i10 == 95) {
                                                                arrayList.add(value);
                                                            } else {
                                                                str6 = "resource path is not effective";
                                                            }
                                                        } else {
                                                            if (a(str7, campaignExH)) {
                                                            }
                                                            return null;
                                                        }
                                                        arrayList = arrayList;
                                                        j10 = jCurrentTimeMillis;
                                                        str6 = str8;
                                                    }
                                                    j10 = jCurrentTimeMillis;
                                                } else {
                                                    arrayList = arrayList;
                                                    if (s0.a().a("u_n_c_e_d", true)) {
                                                        jN = value.n();
                                                        if (value.o() == 1) {
                                                            j11 = jCurrentTimeMillis - jN;
                                                            j10 = jCurrentTimeMillis;
                                                            if (j11 > this.f39549i * 1000) {
                                                                value.c("download timeout");
                                                                value.g();
                                                                this.f39547g.remove(map);
                                                                i12--;
                                                                if (i10 != 1) {
                                                                }
                                                                str6 = "video download time over dlct";
                                                                arrayList = arrayList;
                                                            }
                                                        } else {
                                                            j10 = jCurrentTimeMillis;
                                                        }
                                                        if (iO != 4) {
                                                        }
                                                        this.f39547g.remove(map);
                                                        value.g();
                                                        i12--;
                                                        str5 = "video download stop or pause";
                                                        str6 = str5;
                                                        arrayList = arrayList;
                                                    } else {
                                                        j10 = jCurrentTimeMillis;
                                                        i11 = 1;
                                                    }
                                                    if (iO != i11) {
                                                        if (value.t()) {
                                                            str5 = "video was displayed";
                                                            str6 = str5;
                                                            arrayList = arrayList;
                                                        } else {
                                                            if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                                if (!a(value, b(campaignExH), z11)) {
                                                                }
                                                                str8 = "video or endcard or image list is downloading or fail";
                                                            }
                                                            if (i10 == 94) {
                                                            }
                                                            if (!a(value, b(campaignExH), z11)) {
                                                            }
                                                            str2 = "video or endcard or image list is downloading or fail";
                                                        }
                                                        str6 = str8;
                                                        e.printStackTrace();
                                                    } else {
                                                        if (i10 == 94) {
                                                        }
                                                        if (!a(value, b(campaignExH), z11)) {
                                                        }
                                                        str2 = "video or endcard or image list is downloading or fail";
                                                    }
                                                    str6 = str8;
                                                }
                                                it2 = it;
                                                jCurrentTimeMillis = j10;
                                            }
                                        } catch (Exception e13) {
                                            e = e13;
                                            arrayList = arrayList;
                                        }
                                    }
                                    arrayList = arrayList;
                                    it2 = it;
                                    jCurrentTimeMillis = j10;
                                }
                                str6 = str2;
                                arrayList = arrayList;
                                it2 = it;
                                jCurrentTimeMillis = j10;
                            } catch (Exception e14) {
                                e = e14;
                                arrayList = arrayList;
                            }
                        }
                        i12++;
                    }
                    arrayList = arrayList;
                } catch (Exception e15) {
                    e = e15;
                    arrayList = arrayList;
                }
            }
        } else {
            arrayList = arrayList;
        }
        try {
            if (arrayList.size() == 0 && eVar != null) {
                eVar.a("is_ready_fail_reason", str6);
            }
        } catch (Throwable th2) {
            q0.b("UnitCacheCtroller", th2.getMessage());
        }
        return arrayList;
    }

    private boolean b(String str, CampaignEx campaignEx) {
        if (campaignEx.isMraid() || TextUtils.isEmpty(str)) {
            return true;
        }
        if (campaignEx.getLoadTimeoutState() == 1 && !d(campaignEx)) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) {
            return a1.b(H5DownLoadManager.getInstance().getH5ResAddress(str)) || a1.b(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str));
        }
        q0.c("UnitCacheCtroller", "Is not check endCard download status : " + str);
        return true;
    }

    public void b(String str) {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList;
        k kVar;
        if (this.f39557q && (kVar = this.f39556p) != null) {
            kVar.c(str);
            return;
        }
        try {
            synchronized (this.f39547g) {
                if (!TextUtils.isEmpty(str) && (copyOnWriteArrayList = this.f39547g) != null && copyOnWriteArrayList.size() > 0) {
                    for (Map<String, com.mbridge.msdk.videocommon.download.a> map : this.f39547g) {
                        if (map != null) {
                            for (Map.Entry<String, com.mbridge.msdk.videocommon.download.a> entry : map.entrySet()) {
                                if (entry != null && TextUtils.equals(entry.getKey(), str)) {
                                    this.f39547g.remove(map);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("UnitCacheCtroller", e10.getMessage());
            }
        }
    }

    public boolean a(List<CampaignEx> list, String str) {
        if (list == null || list.size() == 0) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            CampaignEx campaignEx = list.get(i10);
            if (campaignEx == null || !a(new com.mbridge.msdk.videocommon.download.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, str, this.f39552l), b(campaignEx), false) || !a(campaignEx.getendcard_url(), campaignEx)) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(com.mbridge.msdk.videocommon.download.a aVar, int i10) {
        long jM = aVar.m();
        long j10 = aVar.j();
        if (TextUtils.isEmpty(aVar.i())) {
            q0.a("UnitCacheCtroller", "checkVideoDownload video done return true");
            return true;
        }
        if (i10 == 0) {
            if (aVar.h() != null && !TextUtils.isEmpty(aVar.h().getVideoUrlEncode())) {
                return true;
            }
        } else if (j10 > 0 && jM * 100 >= j10 * ((long) i10)) {
            if (i10 != 100 || aVar.o() == 5) {
                return true;
            }
            aVar.g();
            return false;
        }
        return false;
    }

    public static boolean a(com.mbridge.msdk.videocommon.download.a aVar, int i10, boolean z10) {
        long jM = aVar.m();
        long j10 = aVar.j();
        if (TextUtils.isEmpty(aVar.i())) {
            q0.a("UnitCacheCtroller", "checkVideoDownload video done return true");
            return true;
        }
        CampaignEx campaignExH = aVar.h();
        if (campaignExH != null) {
            if (campaignExH.getRsIgnoreCheckRule() != null && campaignExH.getRsIgnoreCheckRule().size() > 0 && campaignExH.getRsIgnoreCheckRule().contains(0)) {
                q0.c("UnitCacheCtroller", "Is not check video download status");
                return true;
            }
            if (campaignExH.getIsTimeoutCheckVideoStatus() == 1 && campaignExH.getVideoCheckType() == 1) {
                return true;
            }
            if (z10 && campaignExH.getVideoCheckType() == 1) {
                if (i10 == 0) {
                    return true;
                }
                if ((j10 != 0 || jM != 0) && jM >= ((long) (i10 / 100)) * j10) {
                    campaignExH.setIsTimeoutCheckVideoStatus(1);
                    return true;
                }
            }
        }
        return a(aVar, i10);
    }

    private boolean a(String str, CampaignEx campaignEx) {
        try {
            if (campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) {
                return (campaignEx.isDynamicView() && !v0.l(str)) || a1.a(str) || b(str, campaignEx);
            }
            q0.c("UnitCacheCtroller", "Is not check endCard download status : " + str);
            return true;
        } catch (Throwable th2) {
            q0.b("UnitCacheCtroller", th2.getMessage(), th2);
            return false;
        }
    }

    private boolean a(int i10, CampaignEx campaignEx, String str) {
        if (campaignEx.isDynamicView()) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
            q0.c("UnitCacheCtroller", "Is not check template download status");
            return true;
        }
        if (!TextUtils.isEmpty(str) && campaignEx.getLoadTimeoutState() == 0) {
            q0.a("UnitCacheCtroller", "check template 下载情况：" + H5DownLoadManager.getInstance().getH5ResAddress(str));
            if (H5DownLoadManager.getInstance().getH5ResAddress(str) == null) {
                return false;
            }
        }
        return true;
    }

    public com.mbridge.msdk.videocommon.download.a a(int i10, boolean z10) {
        k kVar;
        if (this.f39557q && (kVar = this.f39556p) != null) {
            return kVar.d();
        }
        try {
            return b(i10, z10);
        } catch (Throwable th2) {
            q0.b("UnitCacheCtroller", th2.getMessage(), th2);
            return null;
        }
    }

    public com.mbridge.msdk.videocommon.download.a a(String str) {
        k kVar;
        if (this.f39557q && (kVar = this.f39556p) != null) {
            return kVar.a(str);
        }
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.f39547g;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        synchronized (copyOnWriteArrayList) {
            try {
                for (Map<String, com.mbridge.msdk.videocommon.download.a> map : this.f39547g) {
                    if (map != null && map.containsKey(str)) {
                        return map.get(str);
                    }
                }
            } catch (Throwable unused) {
                q0.b("UnitCacheCtroller", "failed to get campaignTast by cid");
            }
            return null;
        }
    }

    private boolean a(CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList) {
        try {
            for (Map<String, com.mbridge.msdk.videocommon.download.a> map : copyOnWriteArrayList) {
                if (map != null) {
                    Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        if (it.next().getValue().o() == 1) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th2.printStackTrace();
            return false;
        }
    }

    private int a(CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.setting.l lVar = this.f39554n;
            if (lVar != null) {
                return lVar.C();
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("UnitCacheCtroller", e10.getMessage());
            }
        }
        return 100;
    }
}
