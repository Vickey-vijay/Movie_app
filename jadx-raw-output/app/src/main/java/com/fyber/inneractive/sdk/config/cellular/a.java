package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import com.fyber.inneractive.sdk.util.z0;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f15038a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f15040c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z0 f15039b = z0.UNKNOWN;

    @Override // com.fyber.inneractive.sdk.config.cellular.h
    public final void a(z0 z0Var) {
        this.f15039b = z0Var;
        for (h hVar : this.f15040c) {
            if (hVar != null) {
                hVar.a(this.f15039b);
            }
        }
    }

    public a(Context context) {
        this.f15038a = e.a(context);
    }
}
