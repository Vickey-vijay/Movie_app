package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.Lg;
import com.ironsource.C3426d4;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class Lg extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f23089a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lg(Context context, rj.c cVar) {
        super(2, cVar);
        this.f23089a = context;
    }

    public static final boolean b(String str) {
        return ck.p.e(str, "a_i_dep");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new Lg(this.f23089a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new Lg(this.f23089a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        try {
            Og og2 = Og.f23290a;
            Context context = this.f23089a;
            og2.getClass();
            if (Og.f23293d == null) {
                Og.f23293d = new C3359zg(context, "pub_signals_store");
            }
            C3359zg c3359zg = null;
            try {
                C3359zg c3359zg2 = Og.f23293d;
                if (c3359zg2 == null) {
                    ck.p.B("prefDao");
                    c3359zg2 = null;
                }
                String strA = c3359zg2.a("saved_signals");
                if (strA != null) {
                    JSONObject jSONObject = new JSONObject(strA);
                    Iterator<String> itKeys = jSONObject.keys();
                    ck.p.i(itKeys, "keys(...)");
                    Iterator it = SequencesKt___SequencesKt.T(SequencesKt___SequencesKt.A(kk.r.g(itKeys), new bk.l() { // from class: b7.x2
                        @Override // bk.l
                        public final Object invoke(Object obj2) {
                            return Boolean.valueOf(Lg.a((String) obj2));
                        }
                    })).iterator();
                    while (it.hasNext()) {
                        jSONObject.remove((String) it.next());
                    }
                    C3359zg c3359zg3 = Og.f23293d;
                    if (c3359zg3 == null) {
                        ck.p.B("prefDao");
                        c3359zg3 = null;
                    }
                    String string = jSONObject.toString();
                    ck.p.i(string, "toString(...)");
                    c3359zg3.getClass();
                    ck.p.j("saved_signals", C3426d4.i.W);
                    ck.p.j(string, "value");
                    c3359zg3.f25848a.a("saved_signals", string, true);
                }
            } catch (Exception e10) {
                C3359zg c3359zg4 = Og.f23293d;
                if (c3359zg4 == null) {
                    ck.p.B("prefDao");
                    c3359zg4 = null;
                }
                c3359zg4.getClass();
                ck.p.j("saved_signals", C3426d4.i.W);
                c3359zg4.f25848a.a("saved_signals");
                Og.f23290a.getClass();
                Og.f23294e.a();
                Kb.a((byte) 1, "PubSignals", "Publisher signals could not be reset.");
                mj.g gVar = P9.f23321a;
                P9.a(new L2(e10));
            }
            try {
                C3359zg c3359zg5 = Og.f23293d;
                if (c3359zg5 == null) {
                    ck.p.B("prefDao");
                    c3359zg5 = null;
                }
                String strA2 = c3359zg5.a("imp_depth");
                if (strA2 != null) {
                    JSONObject jSONObject2 = new JSONObject(strA2);
                    Iterator<String> itKeys2 = jSONObject2.keys();
                    ck.p.i(itKeys2, "keys(...)");
                    Iterator it2 = SequencesKt___SequencesKt.T(SequencesKt___SequencesKt.A(kk.r.g(itKeys2), new bk.l() { // from class: b7.y2
                        @Override // bk.l
                        public final Object invoke(Object obj2) {
                            return Boolean.valueOf(Lg.b((String) obj2));
                        }
                    })).iterator();
                    while (it2.hasNext()) {
                        jSONObject2.remove((String) it2.next());
                    }
                    C3359zg c3359zg6 = Og.f23293d;
                    if (c3359zg6 == null) {
                        ck.p.B("prefDao");
                        c3359zg6 = null;
                    }
                    String string2 = jSONObject2.toString();
                    ck.p.i(string2, "toString(...)");
                    c3359zg6.getClass();
                    ck.p.j("imp_depth", C3426d4.i.W);
                    ck.p.j(string2, "value");
                    Ea ea2 = c3359zg6.f25848a;
                    ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                    ea2.a("imp_depth", string2, false);
                }
            } catch (Exception unused) {
                C3359zg c3359zg7 = Og.f23293d;
                if (c3359zg7 == null) {
                    ck.p.B("prefDao");
                } else {
                    c3359zg = c3359zg7;
                }
                c3359zg.getClass();
                ck.p.j("imp_depth", C3426d4.i.W);
                c3359zg.f25848a.a("imp_depth");
            }
            Og.f23290a.getClass();
            I1 i10 = Og.f23294e;
            i10.f22836c = i10.f22834a.invoke();
            I1 i11 = Og.f23295f;
            i11.f22836c = i11.f22834a.invoke();
        } catch (Exception e11) {
            Kb.a((byte) 1, "PubSignals", "Publisher signals could not be reset.");
            mj.g gVar2 = P9.f23321a;
            AbstractC2929i9.a(e11);
        }
        Og.f23290a.getClass();
        I1 i12 = Og.f23294e;
        i12.f22836c = i12.f22834a.invoke();
        I1 i13 = Og.f23295f;
        i13.f22836c = i13.f22834a.invoke();
        return mj.r.f64562a;
    }

    public static final boolean a(String str) {
        ck.p.g(str);
        return lk.x.R(str, "auto_", false, 2, null);
    }
}
