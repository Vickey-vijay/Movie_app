package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
class n5 extends l5 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final o7 f8516q;

    public class a implements e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w7 f8517a;

        public a(w7 w7Var) {
            this.f8517a = w7Var;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                this.f8517a.a(uri);
                n5.this.f8516q.b(true);
                return;
            }
            com.applovin.impl.sdk.o oVar = n5.this.f7707c;
            if (com.applovin.impl.sdk.o.a()) {
                n5 n5Var = n5.this;
                n5Var.f7707c.b(n5Var.f7706b, "Failed to cache static companion ad");
            }
        }
    }

    public class b implements l5.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w7 f8519a;

        public b(w7 w7Var) {
            this.f8519a = w7Var;
        }

        @Override // com.applovin.impl.l5.e
        public void a(String str) {
            this.f8519a.a(str);
            n5.this.f8516q.b(true);
        }
    }

    public class c implements l5.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w7 f8521a;

        public c(w7 w7Var) {
            this.f8521a = w7Var;
        }

        @Override // com.applovin.impl.l5.e
        public void a(String str) {
            this.f8521a.a(str);
            n5.this.f8516q.b(true);
        }
    }

    public class d implements e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c8 f8523a;

        public d(c8 c8Var) {
            this.f8523a = c8Var;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                com.applovin.impl.sdk.o oVar = n5.this.f7707c;
                if (com.applovin.impl.sdk.o.a()) {
                    n5 n5Var = n5.this;
                    n5Var.f7707c.a(n5Var.f7706b, "Video file successfully cached into: " + uri);
                }
                this.f8523a.a(uri);
                return;
            }
            com.applovin.impl.sdk.o oVar2 = n5.this.f7707c;
            if (com.applovin.impl.sdk.o.a()) {
                n5 n5Var2 = n5.this;
                n5Var2.f7707c.b(n5Var2.f7706b, "Failed to cache video file: " + this.f8523a);
            }
        }
    }

    public class e implements l5.e {
        public e() {
        }

        @Override // com.applovin.impl.l5.e
        public void a(String str) {
            if (n5.this.f8516q.isOpenMeasurementEnabled()) {
                str = n5.this.f7705a.e0().a(str, f2.a((AppLovinAdImpl) n5.this.f7882g));
            }
            n5.this.f8516q.d(str);
            com.applovin.impl.sdk.o oVar = n5.this.f7707c;
            if (com.applovin.impl.sdk.o.a()) {
                n5 n5Var = n5.this;
                n5Var.f7707c.a(n5Var.f7706b, "Finish caching HTML template " + n5.this.f8516q.i1() + " for ad #" + n5.this.f8516q.getAdIdNumber());
            }
        }
    }

    public n5(o7 o7Var, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", o7Var, kVar, appLovinAdLoadListener);
        this.f8516q = o7Var;
    }

    private String d(String str) {
        for (String str2 : StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f7705a.a(x4.f9942h5)), 1)) {
            if (!TextUtils.isEmpty(str2)) {
                Uri uriA = a(str2, Collections.emptyList(), false);
                if (uriA != null) {
                    str = str.replace(str2, uriA.toString());
                    this.f7882g.a(uriA.toString(), str2);
                } else if (com.applovin.impl.sdk.o.a()) {
                    this.f7707c.b(this.f7706b, "Failed to cache JavaScript resource: " + str2);
                }
            }
        }
        return str;
    }

    private c0 p() {
        if (!this.f8516q.u1()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Companion ad caching disabled. Skipping...");
            }
            return null;
        }
        r7 r7VarG1 = this.f8516q.g1();
        if (r7VarG1 == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "No companion ad provided. Skipping...");
            }
            return null;
        }
        w7 w7VarE = r7VarG1.e();
        if (w7VarE == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.b(this.f7706b, "Failed to retrieve non-video resources from companion ad. Skipping...");
            }
            return null;
        }
        Uri uriC = w7VarE.c();
        String string = uriC != null ? uriC.toString() : "";
        String strB = w7VarE.b();
        if (URLUtil.isValidUrl(string) || StringUtils.isValidString(strB)) {
            if (w7VarE.d() == w7.a.STATIC) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7707c.a(this.f7706b, "Caching static companion ad at " + string + "...");
                }
                return new e0(string, this.f8516q, Collections.emptyList(), false, this.f7884i, this.f7705a, new a(w7VarE));
            }
            if (w7VarE.d() == w7.a.HTML) {
                if (!StringUtils.isValidString(string)) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7707c.a(this.f7706b, "Caching provided HTML for companion ad. No fetch required. HTML: " + strB);
                    }
                    return a(strB, Collections.emptyList(), new c(w7VarE));
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7707c.a(this.f7706b, "Begin caching HTML companion ad. Fetching from " + string + "...");
                }
                String strC = c(string, null, false);
                if (StringUtils.isValidString(strC)) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7707c.a(this.f7706b, "HTML fetched. Caching HTML now...");
                    }
                    return a(strC, Collections.emptyList(), new b(w7VarE));
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7707c.b(this.f7706b, "Unable to load companion ad resources from " + string);
                }
            } else if (w7VarE.d() == w7.a.IFRAME && com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Skip caching of iFrame resource...");
            }
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.k(this.f7706b, "Companion ad does not have any resources attached. Skipping...");
        }
        return null;
    }

    @Override // com.applovin.impl.l5
    public void a(int i10) {
        this.f8516q.getAdEventTracker().f();
        super.a(i10);
    }

    @Override // com.applovin.impl.l5
    public void f() {
        this.f8516q.getAdEventTracker().h();
        super.f();
    }

    public d0 q() {
        if (!TextUtils.isEmpty(this.f8516q.i1())) {
            return a(this.f8516q.i1(), this.f8516q.S(), new e());
        }
        if (!com.applovin.impl.sdk.o.a()) {
            return null;
        }
        this.f7707c.a(this.f7706b, "Unable to load HTML template");
        return null;
    }

    public e0 r() {
        c8 c8VarQ1;
        Uri uriE;
        if (!this.f8516q.v1()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Video caching disabled. Skipping...");
            }
            return null;
        }
        if (this.f8516q.p1() == null || (c8VarQ1 = this.f8516q.q1()) == null || (uriE = c8VarQ1.e()) == null) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Caching video file " + c8VarQ1 + " creative...");
        }
        return a(uriE.toString(), Collections.emptyList(), false, new d(c8VarQ1));
    }

    private void m() {
        String string;
        if (l()) {
            return;
        }
        if (this.f8516q.u1()) {
            r7 r7VarG1 = this.f8516q.g1();
            if (r7VarG1 != null) {
                w7 w7VarE = r7VarG1.e();
                if (w7VarE != null) {
                    Uri uriC = w7VarE.c();
                    if (uriC != null) {
                        string = uriC.toString();
                    } else {
                        string = "";
                    }
                    String strB = w7VarE.b();
                    if (!URLUtil.isValidUrl(string) && !StringUtils.isValidString(strB)) {
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f7707c.k(this.f7706b, "Companion ad does not have any resources attached. Skipping...");
                            return;
                        }
                        return;
                    }
                    if (w7VarE.d() == w7.a.STATIC) {
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f7707c.a(this.f7706b, "Caching static companion ad at " + string + "...");
                        }
                        Uri uriA = a(string, Collections.emptyList(), false);
                        if (uriA != null) {
                            w7VarE.a(uriA);
                            this.f8516q.b(true);
                            return;
                        } else {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f7707c.b(this.f7706b, "Failed to cache static companion ad");
                                return;
                            }
                            return;
                        }
                    }
                    if (w7VarE.d() == w7.a.HTML) {
                        if (StringUtils.isValidString(string)) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f7707c.a(this.f7706b, "Begin caching HTML companion ad. Fetching from " + string + "...");
                            }
                            String strC = c(string, null, false);
                            if (StringUtils.isValidString(strC)) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f7707c.a(this.f7706b, "HTML fetched. Caching HTML now...");
                                }
                                w7VarE.a(a(strC, Collections.emptyList(), this.f8516q));
                                this.f8516q.b(true);
                                return;
                            }
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f7707c.b(this.f7706b, "Unable to load companion ad resources from " + string);
                                return;
                            }
                            return;
                        }
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f7707c.a(this.f7706b, "Caching provided HTML for companion ad. No fetch required. HTML: " + strB);
                        }
                        if (((Boolean) this.f7705a.a(x4.f9933g5)).booleanValue()) {
                            strB = d(strB);
                        }
                        w7VarE.a(a(strB, Collections.emptyList(), this.f8516q));
                        this.f8516q.b(true);
                        return;
                    }
                    if (w7VarE.d() == w7.a.IFRAME && com.applovin.impl.sdk.o.a()) {
                        this.f7707c.a(this.f7706b, "Skip caching of iFrame resource...");
                        return;
                    }
                    return;
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7707c.b(this.f7706b, "Failed to retrieve non-video resources from companion ad. Skipping...");
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "No companion ad provided. Skipping...");
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Companion ad caching disabled. Skipping...");
        }
    }

    private void n() {
        if (!l() && a8.a(this.f8516q)) {
            String strI1 = this.f8516q.i1();
            if (StringUtils.isValidString(strI1)) {
                String strA = a(strI1, this.f8516q.S(), this.f7882g);
                if (this.f8516q.isOpenMeasurementEnabled()) {
                    strA = this.f7705a.e0().a(strA, f2.a((AppLovinAdImpl) this.f7882g));
                }
                this.f8516q.d(strA);
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7707c.a(this.f7706b, "Finish caching HTML template " + this.f8516q.i1() + " for ad #" + this.f8516q.getAdIdNumber());
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Unable to load HTML template");
            }
        }
    }

    private void o() {
        c8 c8VarQ1;
        Uri uriE;
        if (l()) {
            return;
        }
        if (this.f8516q.v1()) {
            if (this.f8516q.p1() != null && (c8VarQ1 = this.f8516q.q1()) != null && (uriE = c8VarQ1.e()) != null) {
                Uri uriB = b(uriE.toString(), Collections.emptyList(), false);
                if (uriB != null) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7707c.a(this.f7706b, "Video file successfully cached into: " + uriB);
                    }
                    c8VarQ1.a(uriB);
                    return;
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7707c.b(this.f7706b, "Failed to cache video file: " + c8VarQ1);
                    return;
                }
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Video caching disabled. Skipping...");
        }
    }

    @Override // com.applovin.impl.l5, java.lang.Runnable
    public void run() {
        String str;
        super.run();
        boolean zC0 = this.f8516q.C0();
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVar = this.f7707c;
            String str2 = this.f7706b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Begin caching for VAST ");
            if (zC0) {
                str = "streaming ";
            } else {
                str = "";
            }
            sb2.append(str);
            sb2.append("ad #");
            sb2.append(this.f7882g.getAdIdNumber());
            sb2.append("...");
            oVar.a(str2, sb2.toString());
        }
        if (zC0) {
            if (((Boolean) this.f7705a.a(x4.I0)).booleanValue()) {
                if (!o0.d()) {
                    a(e());
                }
                if (this.f8516q.s1()) {
                    f();
                    ArrayList arrayList = new ArrayList();
                    c0 c0VarP = p();
                    if (c0VarP != null) {
                        arrayList.add(c0VarP);
                    }
                    d0 d0VarQ = q();
                    if (d0VarQ != null) {
                        arrayList.add(d0VarQ);
                    }
                    e0 e0VarR = r();
                    if (e0VarR != null) {
                        arrayList.add(e0VarR);
                    }
                    a(arrayList);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    if (this.f8516q.j1() == o7.c.COMPANION_AD) {
                        c0 c0VarP2 = p();
                        if (c0VarP2 != null) {
                            arrayList2.add(c0VarP2);
                        }
                        d0 d0VarQ2 = q();
                        if (d0VarQ2 != null) {
                            arrayList2.add(d0VarQ2);
                        }
                        a(arrayList2);
                        f();
                        e0 e0VarR2 = r();
                        if (e0VarR2 != null) {
                            arrayList3.add(e0VarR2);
                        }
                        a(arrayList3);
                    } else {
                        e0 e0VarR3 = r();
                        if (e0VarR3 != null) {
                            arrayList2.add(e0VarR3);
                        }
                        a(arrayList2);
                        f();
                        c0 c0VarP3 = p();
                        if (c0VarP3 != null) {
                            arrayList3.add(c0VarP3);
                        }
                        d0 d0VarQ3 = q();
                        if (d0VarQ3 != null) {
                            arrayList3.add(d0VarQ3);
                        }
                        a(arrayList3);
                    }
                }
            } else {
                j();
                if (this.f8516q.s1()) {
                    f();
                }
                o7.c cVarJ1 = this.f8516q.j1();
                o7.c cVar = o7.c.COMPANION_AD;
                if (cVarJ1 == cVar) {
                    m();
                    n();
                    a(this.f8516q);
                } else {
                    o();
                }
                if (!this.f8516q.s1()) {
                    f();
                }
                if (this.f8516q.j1() == cVar) {
                    o();
                } else {
                    m();
                    n();
                    a(this.f8516q);
                }
            }
        } else if (((Boolean) this.f7705a.a(x4.I0)).booleanValue()) {
            ArrayList arrayList4 = new ArrayList();
            if (!o0.d()) {
                arrayList4.addAll(e());
            }
            c0 c0VarP4 = p();
            if (c0VarP4 != null) {
                arrayList4.add(c0VarP4);
            }
            e0 e0VarR4 = r();
            if (e0VarR4 != null) {
                arrayList4.add(e0VarR4);
            }
            d0 d0VarQ4 = q();
            if (d0VarQ4 != null) {
                arrayList4.add(d0VarQ4);
            }
            a(arrayList4);
            f();
        } else {
            j();
            m();
            o();
            n();
            a(this.f8516q);
            f();
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Finished caching VAST ad #" + this.f8516q.getAdIdNumber());
        }
        this.f8516q.t1();
        k();
    }
}
