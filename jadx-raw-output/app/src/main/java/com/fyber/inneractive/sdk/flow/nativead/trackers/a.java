package com.fyber.inneractive.sdk.flow.nativead.trackers;

import android.os.Handler;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import com.fyber.inneractive.sdk.web.m;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w0 f15551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f15552b;

    public final void a(c cVar) {
        for (String str : this.f15551a.f15744w) {
            if (!TextUtils.isEmpty(str)) {
                IAlog.a("%sHitting URL: %s", IAlog.a(this), str);
                z0.b(str);
            }
        }
        b bVar = new b(this.f15551a.f15745x, cVar);
        this.f15552b = bVar;
        if (bVar.f15557d == null || bVar.f15556c == null) {
            IAlog.b("%sWas destroyed, create a new instance", b.f15553e);
        } else {
            bVar.a();
        }
    }

    public a(w0 w0Var) {
        this.f15551a = w0Var;
    }

    public final void a() {
        b bVar = this.f15552b;
        if (bVar != null) {
            IAlog.a("%sDestroy called", b.f15553e);
            Handler handler = bVar.f15557d;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                bVar.f15557d = null;
            }
            m mVar = bVar.f15556c;
            if (mVar != null) {
                v.a(mVar);
                mVar.destroy();
                bVar.f15556c = null;
            }
            bVar.f15555b = null;
            this.f15552b = null;
        }
        this.f15551a = null;
    }
}
