package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.u0;
import java.net.URI;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: WebViewSpiderLoader.java */
/* JADX INFO: loaded from: classes4.dex */
public class p extends f implements com.mbridge.msdk.foundation.same.task.a.InterfaceC0332a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f32886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JumpLoaderResult f32887c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f32889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Context f32890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.task.b f32891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f32892h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f32888d = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f32893i = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: WebViewSpiderLoader.java */
    public class a implements k {
        public a() {
        }

        @Override // com.mbridge.msdk.click.k
        public void a(JumpLoaderResult jumpLoaderResult) {
            p.this.f32887c = jumpLoaderResult;
        }
    }

    /* JADX INFO: compiled from: WebViewSpiderLoader.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (p.this.f32886b != null) {
                if (p.this.f32887c.isSuccess()) {
                    p.this.f32886b.a(p.this.f32887c);
                } else {
                    p.this.f32886b.a(p.this.f32887c, p.this.f32887c.getMsg());
                }
            }
        }
    }

    /* JADX INFO: compiled from: WebViewSpiderLoader.java */
    public class c extends com.mbridge.msdk.foundation.same.task.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f32897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f32898c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f32899d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f32900e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CampaignEx f32901f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f32902g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f32903h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f32904i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Semaphore f32896a = new Semaphore(0);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private o.f f32905j = new a();

        /* JADX INFO: compiled from: WebViewSpiderLoader.java */
        public class a implements o.f {
            @Override // com.mbridge.msdk.click.o.f
            public boolean a(String str) {
                boolean zD = c.this.d(str);
                if (zD) {
                    a();
                }
                return zD;
            }

            @Override // com.mbridge.msdk.click.o.f
            public boolean b(String str) {
                return false;
            }

            public a() {
            }

            @Override // com.mbridge.msdk.click.o.f
            public boolean c(String str) {
                boolean zD = c.this.d(str);
                if (zD) {
                    a();
                }
                return zD;
            }

            @Override // com.mbridge.msdk.click.o.f
            public void a(String str, boolean z10, String str2) {
                c.this.d(str);
                p.this.f32887c.setContent(str2);
                a();
            }

            @Override // com.mbridge.msdk.click.o.f
            public void a(int i10, String str, String str2, String str3) {
                if (!TextUtils.isEmpty(str2)) {
                    p.this.f32887c.setExceptionMsg(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    p.this.f32887c.setContent(str3);
                }
                c.this.d(str);
                a();
            }

            private void a() {
                synchronized (p.this) {
                    p.this.f32887c.setSuccess(true);
                    c.this.a();
                }
            }
        }

        private boolean a(int i10) {
            return i10 == 200;
        }

        private boolean b(int i10) {
            return i10 == 301 || i10 == 302 || i10 == 307;
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void pauseTask(boolean z10) {
        }

        public c(Context context, String str, String str2, String str3, CampaignEx campaignEx, boolean z10, boolean z11, int i10) {
            this.f32897b = context;
            this.f32898c = str;
            this.f32899d = str2;
            this.f32900e = str3;
            this.f32901f = campaignEx;
            this.f32902g = z10;
            this.f32903h = z11;
            this.f32904i = i10;
        }

        private boolean c(String str) {
            return str.startsWith("/");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d(String str) {
            return q.a(str, this.f32901f, p.this.f32887c);
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void runTask() {
            if (p.this.f32886b != null) {
                p.this.f32886b.b(null);
            }
            p.this.f32887c = new JumpLoaderResult();
            p.this.f32887c.setUrl(this.f32898c);
            p.this.f32887c = a(this.f32898c, this.f32902g, this.f32903h, this.f32901f, this.f32904i);
            if (!TextUtils.isEmpty(p.this.f32887c.getExceptionMsg())) {
                p.this.f32887c.setSuccess(true);
            }
            if (p.this.f32888d && p.this.f32887c.isSuccess()) {
                if (p.this.f32892h != null) {
                    p.this.f32887c.setStatusCode(p.this.f32892h.f32814f);
                }
                q.a(this.f32901f, p.this.f32887c, p.this.f32892h, this.f32899d, this.f32900e, this.f32897b, this.f32905j, this.f32896a);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            this.f32896a.release();
        }

        private boolean b(String str) {
            return !URLUtil.isNetworkUrl(str);
        }

        private JumpLoaderResult a(String str, boolean z10, boolean z11, CampaignEx campaignEx, int i10) {
            String scheme;
            String str2;
            String strA = str;
            String host = "";
            if (p.this.f32889e) {
                String strA2 = com.mbridge.msdk.setting.b.a(this.f32897b, strA);
                if (!TextUtils.isEmpty(strA2)) {
                    strA = strA + strA2;
                }
            }
            if (com.mbridge.msdk.util.b.a()) {
                strA = q.a(this.f32901f, strA);
            }
            String str3 = strA;
            JumpLoaderResult jumpLoaderResult = new JumpLoaderResult();
            i iVar = new i();
            try {
                if (b(str3)) {
                    str2 = "";
                } else {
                    URI uriCreate = URI.create(str3);
                    scheme = uriCreate.getScheme();
                    try {
                        host = uriCreate.getHost();
                    } catch (Exception e10) {
                        e = e10;
                        e.printStackTrace();
                    }
                    str2 = host;
                    host = scheme;
                }
            } catch (Exception e11) {
                e = e11;
                scheme = "";
            }
            String strA3 = str3;
            String scheme2 = host;
            String host2 = str2;
            for (int i11 = 0; i11 < 10; i11++) {
                if (!p.this.f32888d) {
                    return null;
                }
                p.this.f32892h = iVar.a(strA3, z10, z11, campaignEx);
                if (p.this.f32892h != null) {
                    if (!TextUtils.isEmpty(p.this.f32892h.f32816h)) {
                        jumpLoaderResult.setUrl(strA3);
                        jumpLoaderResult.setExceptionMsg(p.this.f32892h.f32816h);
                        jumpLoaderResult.setType(1);
                        jumpLoaderResult.setHeader(p.this.f32892h.a());
                        jumpLoaderResult.setSuccess(false);
                        if (i11 != 0) {
                            break;
                        }
                        com.mbridge.msdk.click.retry.a.b().a(strA3, p.this.f32892h.f32816h, campaignEx, this.f32900e, z10, z11, i10);
                        break;
                    }
                    jumpLoaderResult.setSuccess(true);
                    if (!b(p.this.f32892h.f32814f)) {
                        if (a(p.this.f32892h.f32814f)) {
                            jumpLoaderResult.setjumpDone(true);
                            jumpLoaderResult.setUrl(strA3);
                            jumpLoaderResult.setContent(p.this.f32892h.f32815g);
                            break;
                        }
                        jumpLoaderResult.setjumpDone(false);
                        jumpLoaderResult.setUrl(strA3);
                        if (i11 != 0) {
                            break;
                        }
                        com.mbridge.msdk.click.retry.a.b().a(strA3, "error code:" + p.this.f32892h.f32814f, campaignEx, this.f32900e, z10, z11, i10);
                        break;
                    }
                    jumpLoaderResult.setIs302Jump(true);
                    if (!TextUtils.isEmpty(p.this.f32892h.f32809a)) {
                        strA3 = p.this.f32892h.f32809a;
                        if (b(strA3)) {
                            if (!c(strA3) || TextUtils.isEmpty(scheme2) || TextUtils.isEmpty(host2)) {
                                jumpLoaderResult.setjumpDone(true);
                                jumpLoaderResult.setUrl(strA3);
                                break;
                            }
                            strA3 = scheme2 + "://" + host2 + strA3;
                            host2 = null;
                            scheme2 = null;
                        } else if (!b(strA3)) {
                            try {
                                URI uriCreate2 = URI.create(strA3);
                                scheme2 = uriCreate2.getScheme();
                                host2 = uriCreate2.getHost();
                            } catch (Exception e12) {
                                e12.printStackTrace();
                            }
                        }
                        if (!a(strA3)) {
                            if (p.this.f32889e) {
                                String strA4 = com.mbridge.msdk.setting.b.a(this.f32897b, strA3);
                                if (!TextUtils.isEmpty(strA4)) {
                                    strA3 = strA3 + strA4;
                                }
                            }
                            if (com.mbridge.msdk.util.b.a()) {
                                strA3 = q.a(this.f32901f, strA3);
                            }
                        } else {
                            jumpLoaderResult.setjumpDone(true);
                            jumpLoaderResult.setUrl(strA3);
                            break;
                        }
                    } else {
                        jumpLoaderResult.setjumpDone(true);
                        jumpLoaderResult.setUrl(strA3);
                        break;
                    }
                } else {
                    jumpLoaderResult.setUrl(strA3);
                    jumpLoaderResult.setSuccess(false);
                    jumpLoaderResult.setMsg("request url is invalided");
                    break;
                }
            }
            return jumpLoaderResult;
        }

        private boolean a(String str) {
            return u0.a.b(str);
        }
    }

    public p(Context context) {
        this.f32890f = context;
        this.f32891g = new com.mbridge.msdk.foundation.same.task.b(context, 2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void a(String str, g gVar, boolean z10, String str2, String str3, CampaignEx campaignEx, boolean z11, boolean z12, int i10) {
        com.mbridge.msdk.foundation.same.task.a cVar;
        this.f32886b = gVar;
        this.f32889e = z10;
        com.mbridge.msdk.click.entity.b bVar = new com.mbridge.msdk.click.entity.b();
        bVar.a(this.f32890f);
        bVar.c(str);
        bVar.b(z10);
        bVar.a(str2);
        bVar.b(str3);
        bVar.a(campaignEx);
        bVar.a(z11);
        bVar.c(z12);
        bVar.a(i10);
        if (str.startsWith("tcp")) {
            l lVar = new l(bVar);
            lVar.a(this.f32886b);
            lVar.a(new a());
            cVar = lVar;
        } else {
            cVar = new c(this.f32890f, str, str2, str3, campaignEx, z11, z12, i10);
        }
        this.f32891g.b(cVar, this);
    }

    @Override // com.mbridge.msdk.foundation.same.task.a.InterfaceC0332a
    public void a(com.mbridge.msdk.foundation.same.task.a.b bVar) {
        if (bVar == com.mbridge.msdk.foundation.same.task.a.b.FINISH && this.f32888d) {
            this.f32893i.post(new b());
        }
    }
}
