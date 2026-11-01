package com.inmobi.media;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class Uj extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f23653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ EnumC2735ak f23654d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Uj(String str, Map map, EnumC2735ak enumC2735ak, rj.c cVar) {
        super(2, cVar);
        this.f23652b = str;
        this.f23653c = map;
        this.f23654d = enumC2735ak;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new Uj(this.f23652b, this.f23653c, this.f23654d, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((Uj) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int iA;
        String str;
        Object objF = sj.a.f();
        int i10 = this.f23651a;
        try {
            if (i10 == 0) {
                kotlin.c.b(obj);
                Wj wj2 = Wj.f23753a;
                Map map = this.f23653c;
                EnumC2735ak enumC2735ak = this.f23654d;
                Objects.toString(map);
                Objects.toString(enumC2735ak);
                if (Wj.f23759g == null) {
                    return mj.r.f64562a;
                }
                if (Wj.a(this.f23652b, this.f23653c, this.f23654d)) {
                    return mj.r.f64562a;
                }
                C2964jk c2964jk = Wj.f23759g;
                if (c2964jk == null) {
                    ck.p.B("mTelemetryValidator");
                    c2964jk = null;
                }
                EnumC2735ak enumC2735ak2 = this.f23654d;
                String str2 = this.f23652b;
                c2964jk.getClass();
                ck.p.j(enumC2735ak2, "telemetryEventType");
                ck.p.j(str2, "eventType");
                int iOrdinal = enumC2735ak2.ordinal();
                if (iOrdinal == 0) {
                    iA = c2964jk.f24628b.a(str2);
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iA = c2964jk.f24629c.a(str2);
                }
                if (iA != 0) {
                    if (iA != 1) {
                        return mj.r.f64562a;
                    }
                    if (this.f23653c.get("samplingRate") == null) {
                        this.f23653c.put("samplingRate", tj.a.d(100));
                    }
                } else if (this.f23653c.get("samplingRate") == null) {
                    this.f23653c.put("samplingRate", tj.a.d(ek.b.b((((double) 1) - Wj.b().getSamplingFactor()) * ((double) 100))));
                }
                String str3 = this.f23652b;
                int iOrdinal2 = this.f23654d.ordinal();
                if (iOrdinal2 == 0) {
                    str = "sdk";
                } else {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "template";
                }
                C2838ek c2838ek = new C2838ek(str3, null, str);
                this.f23653c.put("eventType", c2838ek.f24528a);
                Map map2 = this.f23653c;
                String string = UUID.randomUUID().toString();
                ck.p.i(string, "toString(...)");
                map2.put("eventId", string);
                this.f23653c.put("isTemplateEvent", tj.a.a(this.f23654d == EnumC2735ak.TEMPLATE));
                Map map3 = this.f23653c;
                ck.p.h(map3, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                String string2 = new JSONObject(map3).toString();
                ck.p.i(string2, "toString(...)");
                ck.p.j(string2, "payload");
                c2838ek.f24529b = string2;
                this.f23651a = 1;
                if (wj2.a(c2838ek, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            Wj.f23753a.a();
        } catch (Exception e10) {
            Wj wj3 = Wj.f23753a;
            e10.getMessage();
        }
        return mj.r.f64562a;
    }
}
