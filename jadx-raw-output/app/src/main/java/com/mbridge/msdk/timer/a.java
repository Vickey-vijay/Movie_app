package com.mbridge.msdk.timer;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.l;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.i;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: LoopTimer.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f38085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f38086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinkedList<i> f38087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private LinkedList<i> f38088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f38089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f38090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f38091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.a f38092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private l f38093i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g f38094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Handler f38095k;

    /* JADX INFO: renamed from: com.mbridge.msdk.timer.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LoopTimer.java */
    public class HandlerC0393a extends Handler {
        public HandlerC0393a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            synchronized (a.this) {
                int i10 = message.what;
                if (i10 != 1) {
                    if (i10 == 2) {
                        a.this.c();
                    }
                } else {
                    if (a.this.f38086b) {
                        return;
                    }
                    a aVar = a.this;
                    aVar.a(aVar.f38085a);
                    sendMessageDelayed(obtainMessage(1), a.this.f38085a);
                }
            }
        }
    }

    /* JADX INFO: compiled from: LoopTimer.java */
    public class b implements com.mbridge.msdk.reward.adapter.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.reward.adapter.c f38097a;

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a.this.f38095k.sendMessage(a.this.f38095k.obtainMessage(2));
            this.f38097a.a((com.mbridge.msdk.reward.adapter.a) null);
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        }

        public b(com.mbridge.msdk.reward.adapter.c cVar) {
            this.f38097a = cVar;
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a.this.f38095k.sendMessage(a.this.f38095k.obtainMessage(2));
            this.f38097a.a((com.mbridge.msdk.reward.adapter.a) null);
        }
    }

    /* JADX INFO: compiled from: LoopTimer.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a f38099a = new a(null);
    }

    public /* synthetic */ a(HandlerC0393a handlerC0393a) {
        this();
    }

    private a() {
        this.f38086b = false;
        this.f38087c = new LinkedList<>();
        this.f38088d = new LinkedList<>();
        this.f38089e = 0;
        this.f38090f = 0;
        this.f38095k = new HandlerC0393a();
    }

    private void b() {
        if (this.f38094j == null) {
            this.f38094j = g.a(com.mbridge.msdk.foundation.controller.c.n().d());
        }
        if (this.f38093i == null) {
            this.f38093i = l.a(this.f38094j);
        }
        List<i> listA = this.f38093i.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO);
        if (listA != null) {
            this.f38088d.addAll(listA);
            for (i iVar : listA) {
                a(iVar.d(), iVar.g());
            }
        }
        List<i> listA2 = this.f38093i.a(94);
        if (listA2 != null) {
            this.f38087c.addAll(listA2);
            for (i iVar2 : listA2) {
                b(iVar2.d(), iVar2.g());
            }
        }
        if (this.f38091g == null) {
            this.f38091g = e.a(this.f38094j);
        }
        if (this.f38092h == null) {
            this.f38092h = com.mbridge.msdk.videocommon.setting.b.b().c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            LinkedList<i> linkedList = this.f38087c;
            if (linkedList == null || linkedList.size() <= 0 || this.f38089e >= this.f38087c.size()) {
                LinkedList<i> linkedList2 = this.f38088d;
                if (linkedList2 != null && linkedList2.size() > 0 && this.f38090f < this.f38088d.size()) {
                    i iVar = this.f38088d.get(this.f38090f);
                    this.f38090f++;
                    if (a(iVar)) {
                        c(iVar.d(), iVar.g());
                    }
                }
            } else {
                i iVar2 = this.f38087c.get(this.f38089e);
                this.f38089e++;
                if (a(iVar2)) {
                    a(iVar2.d(), iVar2.g(), false);
                }
            }
        } catch (Throwable th2) {
            q0.b("LoopTimer", th2.getMessage(), th2);
        }
    }

    public static a a() {
        return c.f38099a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j10) {
        LinkedList<i> linkedList = this.f38087c;
        if (linkedList == null || linkedList.size() <= 0 || this.f38089e == 0 || this.f38087c.size() <= this.f38089e) {
            LinkedList<i> linkedList2 = this.f38088d;
            if (linkedList2 == null || linkedList2.size() <= 0 || this.f38090f == 0 || this.f38088d.size() == this.f38090f) {
                this.f38090f = 0;
                this.f38089e = 0;
                Handler handler = this.f38095k;
                handler.sendMessage(handler.obtainMessage(2));
            }
        }
    }

    private boolean a(i iVar) {
        boolean z10 = false;
        if (iVar == null || TextUtils.isEmpty(iVar.g())) {
            return false;
        }
        String strG = iVar.g();
        try {
            if (this.f38091g != null) {
                com.mbridge.msdk.videocommon.setting.a aVar = this.f38092h;
                int iA = this.f38091g.a(strG, aVar != null ? aVar.e() : 0L);
                if (iA == -1) {
                    a(strG);
                } else if (iA != 1) {
                }
                try {
                    Handler handler = this.f38095k;
                    handler.sendMessage(handler.obtainMessage(2));
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    q0.b("LoopTimer", th.getMessage(), th);
                    return z10;
                }
            }
            return true;
        } catch (Throwable th3) {
            th = th3;
            z10 = true;
        }
    }

    private void c(String str, String str2) {
        a(str, str2, true);
    }

    private void a(String str, String str2, boolean z10) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD == null) {
                return;
            }
            com.mbridge.msdk.reward.adapter.c cVar = new com.mbridge.msdk.reward.adapter.c(contextD, str, str2);
            cVar.d(z10);
            cVar.a(new b(cVar));
            com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar2.i(SameMD5.getMD5(v0.d()));
            cVar2.n(str2);
            if (z10) {
                cVar2.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO);
            } else {
                cVar2.a(94);
            }
            cVar2.h("0");
            cVar2.f("1");
            cVar.a(1, 8000, false, cVar2);
        } catch (Exception e10) {
            q0.b("LoopTimer", e10.getMessage(), e10);
        }
    }

    public void b(long j10) {
        b();
        this.f38085a = j10;
        this.f38086b = false;
        Handler handler = this.f38095k;
        handler.sendMessageDelayed(handler.obtainMessage(1), this.f38085a);
    }

    public void b(String str, String str2) {
        if (this.f38087c.contains(str2)) {
            return;
        }
        this.f38087c.add(new i(str, str2, 94));
        l lVar = this.f38093i;
        if (lVar != null) {
            lVar.a(str, str2, 94);
        }
    }

    private void b(String str) {
        l lVar = this.f38093i;
        if (lVar != null) {
            lVar.a(str);
        }
    }

    public void a(String str, String str2) {
        if (this.f38088d.contains(str2)) {
            return;
        }
        this.f38088d.add(new i(str, str2, MBSupportMuteAdType.INTERSTITIAL_VIDEO));
        l lVar = this.f38093i;
        if (lVar != null) {
            lVar.a(str, str2, MBSupportMuteAdType.INTERSTITIAL_VIDEO);
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LinkedList<i> linkedList = this.f38087c;
        if (linkedList != null && linkedList.contains(str)) {
            this.f38087c.remove(str);
        } else {
            LinkedList<i> linkedList2 = this.f38088d;
            if (linkedList2 != null && linkedList2.contains(str)) {
                this.f38088d.remove(str);
            }
        }
        b(str);
    }
}
