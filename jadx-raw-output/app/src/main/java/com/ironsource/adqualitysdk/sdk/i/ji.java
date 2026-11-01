package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import androidx.annotation.MainThread;
import com.ironsource.adqualitysdk.sdk.i.jd.AnonymousClass2;
import com.ironsource.adqualitysdk.sdk.i.jd.AnonymousClass3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ji {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static ji f2811;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<View> f2813 = new ArrayList();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private List<jl> f2815 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private List<View> f2812 = new ArrayList();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private io f2814 = new io() { // from class: com.ironsource.adqualitysdk.sdk.i.ji.1
        @Override // com.ironsource.adqualitysdk.sdk.i.io
        /* JADX INFO: renamed from: ｋ */
        public final void mo1839() {
            List<View> listM2739 = ju.m2739();
            ji.this.f2812.clear();
            ji.this.f2812.addAll(ji.this.f2813);
            for (int i10 = 0; i10 < listM2739.size(); i10++) {
                View view = listM2739.get(i10);
                ji.this.f2812.remove(view);
                if (!ji.this.f2813.contains(view)) {
                    ji.this.f2813.add(view);
                    ji.this.m2668(view);
                }
            }
            for (int i11 = 0; i11 < ji.this.f2812.size(); i11++) {
                View view2 = (View) ji.this.f2812.get(i11);
                ji.this.f2813.remove(view2);
                ji.this.m2671(view2);
            }
            ji.this.f2812.clear();
        }
    };

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static synchronized ji m2667() {
        if (f2811 == null) {
            f2811 = new ji();
        }
        return f2811;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public synchronized void m2671(View view) {
        Iterator<jl> it = this.f2815.iterator();
        while (it.hasNext()) {
            it.next().mo285(view);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2674(final jl jlVar) {
        synchronized (this) {
            this.f2815.add(jlVar);
        }
        t.m2991(jd.m2615().new AnonymousClass3(this.f2814));
        t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ji.3
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                Iterator it = ji.this.f2813.iterator();
                while (it.hasNext()) {
                    jlVar.mo289((View) it.next());
                }
            }
        });
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2675(jl jlVar) {
        synchronized (this) {
            this.f2815.remove(jlVar);
            if (this.f2815.size() == 0) {
                t.m2991(jd.m2615().new AnonymousClass2(this.f2814));
            }
        }
    }

    private ji() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public synchronized void m2668(View view) {
        Iterator<jl> it = this.f2815.iterator();
        while (it.hasNext()) {
            it.next().mo289(view);
        }
    }
}
