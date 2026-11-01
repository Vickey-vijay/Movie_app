package com.mbridge.msdk.click;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import java.net.URI;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: SocketRequestTask.java */
/* JADX INFO: loaded from: classes8.dex */
public class l extends com.mbridge.msdk.foundation.same.task.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f32838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f32840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f32841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CampaignEx f32842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f32843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f32844h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f32845i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f32846j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f32847k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private JumpLoaderResult f32848l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private g f32849m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private k f32850n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Semaphore f32837a = new Semaphore(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final o.f f32851o = new a();

    /* JADX INFO: compiled from: SocketRequestTask.java */
    public class a implements o.f {
        @Override // com.mbridge.msdk.click.o.f
        public boolean a(String str) {
            boolean zB = l.this.b(str);
            if (zB) {
                a();
            }
            return zB;
        }

        @Override // com.mbridge.msdk.click.o.f
        public boolean b(String str) {
            return false;
        }

        public a() {
        }

        @Override // com.mbridge.msdk.click.o.f
        public boolean c(String str) {
            boolean zB = l.this.b(str);
            if (zB) {
                a();
            }
            return zB;
        }

        @Override // com.mbridge.msdk.click.o.f
        public void a(String str, boolean z10, String str2) {
            l.this.b(str);
            l.this.f32848l.setContent(str2);
            a();
        }

        private void a() {
            synchronized (this) {
                l.this.f32848l.setSuccess(true);
                if (l.this.f32850n != null) {
                    l.this.f32850n.a(l.this.f32848l);
                }
                l.this.a();
            }
        }

        @Override // com.mbridge.msdk.click.o.f
        public void a(int i10, String str, String str2, String str3) {
            if (!TextUtils.isEmpty(str2)) {
                l.this.f32848l.setExceptionMsg(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                l.this.f32848l.setContent(str3);
            }
            l.this.b(str);
            a();
        }
    }

    @Override // com.mbridge.msdk.foundation.same.task.a
    public void cancelTask() {
    }

    @Override // com.mbridge.msdk.foundation.same.task.a
    public void pauseTask(boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        return m.a(str, this.f32842f, this.f32848l);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0162 A[LOOP:0: B:16:0x003c->B:66:0x0162, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x015b A[SYNTHETIC] */
    private JumpLoaderResult c(String str) {
        String scheme;
        String str2;
        int i10;
        String host = "";
        String strA = a(str);
        JumpLoaderResult jumpLoaderResult = new JumpLoaderResult();
        n nVar = new n();
        i iVar = new i();
        try {
            if (URLUtil.isNetworkUrl(strA)) {
                URI uriCreate = URI.create(strA);
                scheme = uriCreate.getScheme();
                try {
                    host = uriCreate.getHost();
                } catch (Exception e10) {
                    e = e10;
                    q0.b("SocketRequestTask", e.getMessage());
                }
                str2 = host;
                host = scheme;
            } else {
                str2 = "";
            }
        } catch (Exception e11) {
            e = e11;
            scheme = "";
        }
        String strA2 = strA;
        for (int i11 = 0; i11 < 10; i11++) {
            if (this.mState != com.mbridge.msdk.foundation.same.task.a.b.RUNNING) {
                return null;
            }
            if (strA2.startsWith("tcp")) {
                i10 = 3;
                this.f32847k = nVar.a(strA2, this.f32842f, this.f32843g, this.f32844h);
            } else {
                this.f32847k = iVar.a(strA2, this.f32843g, this.f32844h, this.f32842f);
                i10 = 1;
            }
            com.mbridge.msdk.click.entity.a aVar = this.f32847k;
            if (aVar == null) {
                jumpLoaderResult.setUrl(strA2);
                jumpLoaderResult.setSuccess(false);
                break;
            }
            if (!TextUtils.isEmpty(aVar.f32816h)) {
                jumpLoaderResult.setUrl(strA2);
                jumpLoaderResult.setExceptionMsg(this.f32847k.f32816h);
                jumpLoaderResult.setType(i10);
                jumpLoaderResult.setHeader(this.f32847k.a());
                jumpLoaderResult.setSuccess(false);
                if (i11 != 0) {
                    break;
                }
                com.mbridge.msdk.click.retry.a.b().a(strA2, this.f32847k.f32816h, this.f32842f, this.f32841e, this.f32843g, this.f32844h, this.f32845i);
                break;
            }
            int i12 = this.f32847k.f32814f;
            if (i12 == 200) {
                jumpLoaderResult.setjumpDone(true);
                jumpLoaderResult.setUrl(strA2);
                jumpLoaderResult.setSuccess(true);
                String str3 = this.f32847k.f32815g;
                jumpLoaderResult.setContent(str3 != null ? str3 : null);
                break;
            }
            if (i12 != 301 && i12 != 302 && i12 != 307) {
                jumpLoaderResult.setjumpDone(false);
                jumpLoaderResult.setUrl(strA2);
                if (i11 != 0) {
                    break;
                }
                com.mbridge.msdk.click.retry.a.b().a(strA2, this.f32847k.f32816h, this.f32842f, this.f32841e, this.f32843g, this.f32844h, this.f32845i);
                break;
            }
            jumpLoaderResult.setSuccess(true);
            jumpLoaderResult.setIs302Jump(true);
            if (TextUtils.isEmpty(this.f32847k.f32809a)) {
                jumpLoaderResult.setjumpDone(true);
                jumpLoaderResult.setUrl(strA2);
                break;
            }
            String str4 = this.f32847k.f32809a;
            if (str4.startsWith("http")) {
                if (u0.a.b(str4)) {
                    jumpLoaderResult.setjumpDone(true);
                    jumpLoaderResult.setUrl(str4);
                    break;
                }
                strA2 = a(str4);
            } else {
                if (!str4.startsWith("/") || TextUtils.isEmpty(host) || TextUtils.isEmpty(str2)) {
                    jumpLoaderResult.setjumpDone(true);
                    jumpLoaderResult.setUrl(str4);
                    break;
                }
                str4 = host + "://" + str2 + str4;
                host = null;
                str2 = null;
                if (u0.a.b(str4)) {
                    jumpLoaderResult.setjumpDone(true);
                    jumpLoaderResult.setUrl(str4);
                    break;
                }
                strA2 = a(str4);
            }
        }
        return jumpLoaderResult;
    }

    @Override // com.mbridge.msdk.foundation.same.task.a
    public void runTask() {
        JumpLoaderResult jumpLoaderResult;
        g gVar = this.f32849m;
        if (gVar != null) {
            gVar.b(null);
        }
        JumpLoaderResult jumpLoaderResult2 = new JumpLoaderResult();
        this.f32848l = jumpLoaderResult2;
        jumpLoaderResult2.setUrl(this.f32839c);
        JumpLoaderResult jumpLoaderResultC = c(this.f32839c);
        this.f32848l = jumpLoaderResultC;
        if (jumpLoaderResultC != null && !TextUtils.isEmpty(jumpLoaderResultC.getExceptionMsg())) {
            this.f32848l.setSuccess(true);
        }
        if (this.mState != com.mbridge.msdk.foundation.same.task.a.b.RUNNING) {
            k kVar = this.f32850n;
            if (kVar != null) {
                kVar.a(this.f32848l);
                return;
            }
            return;
        }
        JumpLoaderResult jumpLoaderResult3 = this.f32848l;
        if (jumpLoaderResult3 != null && !jumpLoaderResult3.isSuccess()) {
            k kVar2 = this.f32850n;
            if (kVar2 != null) {
                kVar2.a(this.f32848l);
                return;
            }
            return;
        }
        com.mbridge.msdk.click.entity.a aVar = this.f32847k;
        if (aVar != null && (jumpLoaderResult = this.f32848l) != null) {
            jumpLoaderResult.setStatusCode(aVar.f32814f);
        }
        m.a(this.f32842f, this.f32848l, this.f32847k, this.f32840d, this.f32841e, this.f32838b, this.f32851o, this.f32850n, this.f32837a);
    }

    public l(com.mbridge.msdk.click.entity.b bVar) {
        this.f32838b = bVar.c();
        this.f32839c = bVar.e();
        this.f32840d = bVar.b();
        this.f32841e = bVar.d();
        this.f32842f = bVar.a();
        this.f32843g = bVar.g();
        this.f32844h = bVar.i();
        this.f32845i = bVar.f();
        this.f32846j = bVar.h();
    }

    public void a(g gVar) {
        this.f32849m = gVar;
    }

    public void a(k kVar) {
        this.f32850n = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f32837a.release();
    }

    private String a(String str) {
        if (this.f32846j) {
            String strA = com.mbridge.msdk.setting.b.a(this.f32838b, str);
            if (!TextUtils.isEmpty(strA)) {
                str = str + strA;
            }
        }
        return com.mbridge.msdk.util.b.a() ? m.a(this.f32842f, str) : str;
    }
}
