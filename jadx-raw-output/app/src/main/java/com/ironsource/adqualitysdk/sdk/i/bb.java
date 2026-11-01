package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class bb {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Map<String, ba> f745 = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bb$4, reason: invalid class name */
    public class AnonymousClass4 extends ir {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private /* synthetic */ String f752;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private /* synthetic */ ba.c f753;

        public AnonymousClass4(String str, ba.c cVar) {
            this.f752 = str;
            this.f753 = cVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ir
        /* JADX INFO: renamed from: ﾒ */
        public final void mo276() {
            ba baVarM788 = bb.m788(bb.this, this.f752);
            if (baVarM788 != null) {
                baVarM788.m781(this.f753);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bb$5, reason: invalid class name */
    public class AnonymousClass5 extends ir {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private /* synthetic */ ba.b f754;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private /* synthetic */ String f756;

        public AnonymousClass5(String str, ba.b bVar) {
            this.f756 = str;
            this.f754 = bVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ir
        /* JADX INFO: renamed from: ﾒ */
        public final void mo276() {
            ba baVarM788 = bb.m788(bb.this, this.f756);
            if (baVarM788 != null) {
                baVarM788.m780(this.f754);
            }
        }
    }

    public interface e extends r {
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized boolean m791() {
        Iterator it = new ArrayList(this.f745.values()).iterator();
        while (it.hasNext()) {
            if (((ba) it.next()).m778()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m792(String str) {
        this.f745.put(str, new ba(str));
    }

    public bb() {
        new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ ba m788(bb bbVar, String str) {
        Map<String, ba> map = bbVar.f745;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m790(String str) {
        Map<String, ba> map = this.f745;
        ba baVar = map != null ? map.get(str) : null;
        if (baVar != null) {
            return baVar.m779();
        }
        return null;
    }
}
