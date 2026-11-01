package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.network.i1;
import com.fyber.inneractive.sdk.network.k1;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 implements com.fyber.inneractive.sdk.network.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAConfigManager f15035a;

    public b0(IAConfigManager iAConfigManager) {
        this.f15035a = iAConfigManager;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        int i10;
        h0 h0Var = (h0) obj;
        if (h0Var != null) {
            if (z10) {
                IAConfigManager iAConfigManager = this.f15035a;
                IAConfigManager iAConfigManager2 = IAConfigManager.O;
                iAConfigManager.getClass();
                iAConfigManager.f15010e = h0Var.f15114c;
                iAConfigManager.f15009d = h0Var.f15113b;
                iAConfigManager.f15006a = h0Var.f15115d;
                iAConfigManager.f15007b = h0Var.f15116e;
            } else {
                IAConfigManager.P = System.currentTimeMillis();
                IAConfigManager iAConfigManager3 = this.f15035a;
                iAConfigManager3.getClass();
                IAlog.a("Got new remote configuration from server:", new Object[0]);
                iAConfigManager3.f15010e = h0Var.f15114c;
                iAConfigManager3.f15009d = h0Var.f15113b;
                iAConfigManager3.f15006a = h0Var.f15115d;
                iAConfigManager3.f15007b = h0Var.f15116e;
            }
        } else if (exc instanceof com.fyber.inneractive.sdk.network.g) {
            IAConfigManager.P = System.currentTimeMillis();
        }
        if (z10) {
            return;
        }
        IAConfigManager iAConfigManager4 = this.f15035a;
        IAConfigManager iAConfigManager5 = IAConfigManager.O;
        if (iAConfigManager5.f15010e != null) {
            iAConfigManager4.a(null);
        } else {
            iAConfigManager4.getClass();
            if ((exc instanceof InvalidAppIdException) || (exc instanceof FileNotFoundException) || (!(exc instanceof k1) ? !TextUtils.isEmpty(iAConfigManager4.f15008c.trim()) : (i10 = ((k1) exc).f16038a) < 400 || i10 >= 500)) {
                iAConfigManager4.a(new InvalidAppIdException());
            } else if (exc instanceof com.fyber.inneractive.sdk.network.b) {
                iAConfigManager4.a(exc);
            } else {
                iAConfigManager4.a(new i0());
            }
        }
        if (iAConfigManager5.f15010e != null) {
            IAConfigManager iAConfigManager6 = this.f15035a;
            if (iAConfigManager6.C == null) {
                iAConfigManager6.C = new com.fyber.inneractive.sdk.network.v0(new e0(iAConfigManager6), iAConfigManager6.f15011f, new com.fyber.inneractive.sdk.config.global.m());
            }
            i1 i1Var = iAConfigManager6.C.f16090f;
            if (i1Var == i1.RUNNING || i1Var == i1.QUEUED) {
                return;
            }
            iAConfigManager5.f15024s.a(iAConfigManager6.C);
        }
    }
}
