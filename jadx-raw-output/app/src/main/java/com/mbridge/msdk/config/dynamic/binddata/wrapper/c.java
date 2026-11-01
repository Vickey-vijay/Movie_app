package com.mbridge.msdk.config.dynamic.binddata.wrapper;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: ViewObserverImpl.java */
/* JADX INFO: loaded from: classes11.dex */
public class c implements b<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f33869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f33870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AtomicBoolean f33871e = new AtomicBoolean(false);

    private boolean b(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("mbridge_")) {
            return false;
        }
        try {
            com.mbridge.msdk.config.dynamic.utils.c.valueOf(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public View a() {
        return this.f33869c;
    }

    @Override // com.mbridge.msdk.config.dynamic.binddata.wrapper.b
    public void a(String str, Object obj) {
        if (b(this.f33867a)) {
            a(String.valueOf(obj));
        } else {
            b(str, obj);
        }
    }

    public c(String str, String str2, View view, int i10) {
        this.f33869c = view;
        this.f33867a = str;
        this.f33868b = str2;
        this.f33870d = i10;
    }

    private void b(String str, Object obj) {
        KeyEvent.Callback callback = this.f33869c;
        if (callback instanceof com.mbridge.msdk.config.dynamic.baseview.inter.a) {
            ((com.mbridge.msdk.config.dynamic.baseview.inter.a) callback).updateBindData(str, obj);
        }
    }

    private void a(String str) {
        View view;
        if (this.f33871e.get() || (view = this.f33869c) == null) {
            return;
        }
        try {
            com.mbridge.msdk.config.dynamic.utils.a.a(view, this.f33867a, this.f33868b, str);
        } catch (Exception e10) {
            q0.b("ViewObserverImpl", e10.getMessage());
        }
    }
}
