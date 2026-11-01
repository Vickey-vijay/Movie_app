package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f18653a;

    public d(i1 i1Var) {
        this.f18653a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar = this.f18653a;
        if (iVar.f18691k) {
            IAlog.a("No user web action detected for : %s blocking.", iVar.f18692l);
            i iVar2 = this.f18653a;
            String strC = iVar2.f18692l.c();
            String strA = this.f18653a.f18692l.a();
            j1 j1Var = iVar2.f18687g;
            if (j1Var != null) {
                j1Var.a(strC, strA);
            }
            IAlog.d("AD_AUTO_CLICK_DETECTED", new Object[0]);
            this.f18653a.f18692l.b();
            this.f18653a.i();
        } else {
            IAlog.a("User web action detected for: %s", iVar.f18692l);
            this.f18653a.f18692l.d();
        }
        this.f18653a.f18692l = null;
    }
}
