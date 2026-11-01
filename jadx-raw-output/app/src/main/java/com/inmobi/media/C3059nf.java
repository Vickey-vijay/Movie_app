package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.R;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.nf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3059nf extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f24899a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3059nf(Context context, rj.c cVar) {
        super(2, cVar);
        this.f24899a = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3059nf(this.f24899a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3059nf(this.f24899a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        BufferedReader bufferedReader;
        sj.a.f();
        kotlin.c.b(obj);
        C3109pf c3109pf = C3109pf.f25078a;
        Context context = this.f24899a;
        C3183sf c3183sf = C3109pf.f25080c;
        if (c3183sf == null) {
            c3183sf = new C3183sf(context);
            C3109pf.f25080c = c3183sf;
        }
        String strA = c3183sf.f25325a.a("omid_js_string");
        if (strA == null) {
            Context context2 = this.f24899a;
            int i10 = R.raw.inmobi_omid_js;
            ck.p.j(context2, "<this>");
            try {
                InputStream inputStreamOpenRawResource = context2.getResources().openRawResource(i10);
                ck.p.i(inputStreamOpenRawResource, "openRawResource(...)");
                Reader inputStreamReader = new InputStreamReader(inputStreamOpenRawResource, lk.c.f63591b);
                if (inputStreamReader instanceof BufferedReader) {
                    bufferedReader = (BufferedReader) inputStreamReader;
                } else {
                    bufferedReader = new BufferedReader(inputStreamReader, 8192);
                }
                try {
                    String strE = yj.k.e(bufferedReader);
                    yj.b.a(bufferedReader, null);
                    return strE;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        yj.b.a(bufferedReader, th2);
                        throw th3;
                    }
                }
            } catch (Exception unused) {
                return "";
            }
        }
        return strA;
    }
}
