package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: renamed from: com.inmobi.media.o9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3078o9 {
    public static void a() {
        Context context;
        try {
            Iterator it = AbstractC3128q9.f25157a.iterator();
            while (it.hasNext()) {
                Jb jb2 = (Jb) ((WeakReference) it.next()).get();
                if (jb2 != null && (context = (Context) jb2.f22922f.get()) != null) {
                    nk.l0 l0Var = Sb.f23496a;
                    Rb.a(new Ib(jb2, context, null));
                }
            }
        } catch (Exception e10) {
            mj.g gVar = P9.f23321a;
            AbstractC2929i9.a(e10);
        }
    }
}
