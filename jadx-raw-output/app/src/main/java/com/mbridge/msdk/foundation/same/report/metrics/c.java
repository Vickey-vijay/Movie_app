package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.C3426d4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: MetricsData.java */
/* JADX INFO: loaded from: classes.dex */
public class c implements Serializable, Cloneable {
    private int A;
    private int B;
    private CampaignEx C;
    private CopyOnWriteArrayList<CampaignEx> D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f35158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Map<String, String>> f35159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Map<String, String>> f35160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Map<String, String>> f35161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Long> f35162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.foundation.error.b f35163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f35164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f35165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f35166i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f35167j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f35168k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f35169l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f35170m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f35171n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f35172o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f35173p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f35174q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f35175r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f35176s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f35177t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f35178u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f35179v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f35180w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f35181x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f35182y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f35183z;

    public c() {
        this.f35158a = false;
        this.f35159b = new HashMap();
        this.f35160c = new HashMap();
        this.f35161d = new HashMap();
        this.f35162e = new HashMap();
        this.f35164g = "";
        this.f35165h = new CopyOnWriteArrayList<>();
        this.f35176s = -1;
        this.f35178u = false;
        this.f35180w = false;
        this.D = new CopyOnWriteArrayList<>();
    }

    public void a(boolean z10) {
        this.f35178u = z10;
    }

    public void b(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    if (!this.D.isEmpty()) {
                        this.D.clear();
                    }
                    this.D.addAll(list);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public Map<String, String> c(String str) {
        com.mbridge.msdk.foundation.error.b bVarU;
        com.mbridge.msdk.foundation.error.b bVarU2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        e eVar = new e();
        try {
            this.f35175r = str;
            eVar.a("ts", Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.isEmpty(B())) {
                eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, B());
            }
            if (this.f35167j != 0) {
                eVar.a("adtp", Integer.valueOf(g()));
            }
            if (!TextUtils.isEmpty(s())) {
                eVar.a(CampaignEx.JSON_KEY_HB, s());
            }
            if (!TextUtils.isEmpty(l())) {
                eVar.a("bid_tk", l());
            }
            if (!TextUtils.isEmpty(str)) {
                eVar.a(C3426d4.i.W, str);
            }
            if (Arrays.asList(b.f35143a).contains(str)) {
                eVar.a("from_cache", D() ? "1" : "2");
            }
            if ("2000047".contains(str) && (bVarU2 = u()) != null) {
                eVar.a("type", Integer.valueOf(bVarU2.h()));
                eVar.a("reason", bVarU2.l());
                if (!TextUtils.isEmpty(bVarU2.m())) {
                    eVar.a("reason_d", bVarU2.m());
                    eVar.a("type_d", Integer.valueOf(bVarU2.n()));
                }
            }
            if ("2000048".contains(str) && (bVarU = u()) != null && !TextUtils.isEmpty(bVarU.m())) {
                eVar.a("type", Integer.valueOf(bVarU.n()));
                eVar.a("reason", bVarU.m());
            }
            if (this.f35167j == 296) {
                eVar.a("auto_load", j());
                eVar.a("auto_refresh", Integer.valueOf(i()));
                eVar.a("auto_refresh_interval", Integer.valueOf(k()));
                eVar.a("content_type", Integer.valueOf(p()));
                eVar.a("temp_display_type", Integer.valueOf(A()));
            }
            a(eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return eVar.a();
    }

    public void d(String str) {
        if (this.f35162e == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f35162e.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public void e(int i10) {
        this.f35176s = i10;
    }

    public void f(String str) {
        this.f35174q = str;
    }

    public int g() {
        return this.f35167j;
    }

    public void i(String str) {
        this.f35164g = str;
    }

    public void j(String str) {
        this.f35175r = str;
    }

    public void k(String str) {
        this.f35169l = str;
    }

    public String l() {
        return this.f35168k;
    }

    public List<CampaignEx> m() {
        return this.f35165h;
    }

    public CampaignEx n() {
        return this.C;
    }

    public List<CampaignEx> o() {
        return this.D;
    }

    public int A() {
        return this.B;
    }

    public String C() {
        return this.f35171n;
    }

    public boolean D() {
        return this.f35178u;
    }

    public boolean E() {
        return this.f35180w;
    }

    public boolean F() {
        return this.f35179v;
    }

    public boolean G() {
        return this.f35158a;
    }

    public void a(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.isEmpty()) {
                    return;
                }
                if (!this.f35165h.isEmpty()) {
                    this.f35165h.clear();
                }
                this.f35165h.addAll(list);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String str2 = this.f35164g + str;
            Map<String, Map<String, String>> map = this.f35159b;
            if (map == null || !map.containsKey(str2)) {
                return;
            }
            this.f35159b.remove(str2);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void f(int i10) {
        this.f35177t = i10;
    }

    public void g(String str) {
        this.f35168k = str;
    }

    public void h(String str) {
        this.f35173p = str;
    }

    public int i() {
        return this.f35182y;
    }

    public String j() {
        return this.f35174q;
    }

    public int k() {
        return this.f35183z;
    }

    public void l(String str) {
        this.f35172o = str;
    }

    public void m(String str) {
        this.f35170m = str;
    }

    public void n(String str) {
        this.f35166i = str;
    }

    public void o(String str) {
        this.f35171n = str;
    }

    public int p() {
        return this.A;
    }

    public int q() {
        return this.f35176s;
    }

    public int r() {
        return this.f35177t;
    }

    public String s() {
        return this.f35173p;
    }

    public String t() {
        return this.f35164g;
    }

    public com.mbridge.msdk.foundation.error.b u() {
        return this.f35163f;
    }

    public Map<String, Map<String, String>> v() {
        return this.f35161d;
    }

    public Map<String, Map<String, String>> w() {
        return this.f35159b;
    }

    public String x() {
        return this.f35169l;
    }

    public String y() {
        return this.f35172o;
    }

    public String z() {
        return this.f35170m;
    }

    public String B() {
        Map<String, String> map;
        if (!TextUtils.isEmpty(this.f35166i)) {
            return this.f35166i;
        }
        try {
            if (TextUtils.isEmpty(this.f35166i)) {
                String str = this.f35164g + this.f35175r;
                Map<String, Map<String, String>> map2 = this.f35159b;
                if (map2 != null && map2.containsKey(str) && (map = this.f35159b.get(str)) != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                    this.f35166i = map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return this.f35166i;
    }

    @NonNull
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void d(boolean z10) {
        this.f35181x = z10;
    }

    public void g(int i10) {
        this.B = i10;
    }

    public void d(int i10) {
        this.A = i10;
    }

    public void b(String str, e eVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || eVar == null) {
            return;
        }
        try {
            String str2 = this.f35164g + str;
            Map<String, Map<String, String>> map2 = this.f35160c;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f35160c.get(str2)) != null) {
                    map.putAll(eVar.a());
                } else {
                    this.f35160c.put(str2, eVar.a());
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(CampaignEx campaignEx) {
        this.C = campaignEx;
        if (campaignEx == null) {
            return;
        }
        try {
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.D;
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                for (int i10 = 0; i10 < this.D.size(); i10++) {
                    if (this.D.get(i10) != null && this.D.get(i10).getId().equals(campaignEx.getId())) {
                        this.D.set(i10, campaignEx);
                        break;
                    }
                }
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.f35165h;
            if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.isEmpty()) {
                return;
            }
            for (int i11 = 0; i11 < this.f35165h.size(); i11++) {
                if (this.f35165h.get(i11) != null && this.f35165h.get(i11).getId().equals(campaignEx.getId())) {
                    this.f35165h.set(i11, campaignEx);
                    return;
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public c(boolean z10) {
        this.f35158a = false;
        this.f35159b = new HashMap();
        this.f35160c = new HashMap();
        this.f35161d = new HashMap();
        this.f35162e = new HashMap();
        this.f35164g = "";
        this.f35165h = new CopyOnWriteArrayList<>();
        this.f35176s = -1;
        this.f35178u = false;
        this.f35180w = false;
        this.D = new CopyOnWriteArrayList<>();
        this.f35158a = z10;
    }

    public long b(String str) {
        Map<String, Long> map;
        try {
            if (TextUtils.isEmpty(str) || (map = this.f35162e) == null || !map.containsKey(str)) {
                return 0L;
            }
            Long l10 = this.f35162e.get(str);
            return System.currentTimeMillis() - (l10 != null ? l10.longValue() : 0L);
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return 0L;
            }
            e10.printStackTrace();
            return 0L;
        }
    }

    public void a(int i10) {
        this.f35167j = i10;
    }

    public Map<String, String> a(String str) {
        return this.f35160c.containsKey(str) ? this.f35160c.remove(str) : new HashMap();
    }

    public void b(boolean z10) {
        this.f35180w = z10;
    }

    public void a(String str, e eVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || eVar == null) {
            return;
        }
        try {
            String str2 = this.f35164g + str;
            Map<String, Map<String, String>> map2 = this.f35159b;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f35159b.get(str2)) != null) {
                    map.putAll(eVar.a());
                } else {
                    this.f35159b.put(str2, eVar.a());
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void b(int i10) {
        this.f35182y = i10;
    }

    private void a(e eVar) {
        if ("2000126".equals(this.f35175r)) {
            String strA = com.mbridge.msdk.foundation.same.net.d.a(l());
            if (eVar != null) {
                eVar.a("dns_ty", Integer.valueOf(com.mbridge.msdk.setting.e.a().a(strA)));
                eVar.a("dns_hs", strA);
            }
        }
    }

    public void a(com.mbridge.msdk.foundation.error.b bVar) {
        this.f35163f = bVar;
    }

    public void c(boolean z10) {
        this.f35179v = z10;
    }

    public void c(int i10) {
        this.f35183z = i10;
    }
}
