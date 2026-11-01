package com.inmobi.media;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2972k3 {
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(S2 s10, ContinuationImpl continuationImpl) throws Throwable {
        C2947j3 c2947j3;
        String str;
        Exception e10;
        String str2;
        S2 s11 = s10;
        if (continuationImpl instanceof C2947j3) {
            c2947j3 = (C2947j3) continuationImpl;
            int i10 = c2947j3.f24583d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2947j3.f24583d = i10 - Integer.MIN_VALUE;
            } else {
                c2947j3 = new C2947j3(this, continuationImpl);
            }
        } else {
            c2947j3 = new C2947j3(this, continuationImpl);
        }
        Object objA = c2947j3.f24581b;
        Object objF = sj.a.f();
        int i11 = c2947j3.f24583d;
        if (i11 == 0) {
            kotlin.c.b(objA);
            C3271w3 c3271w3 = C3271w3.f25610a;
            ck.p.i("w3", "access$getTAG$p(...)");
            int i12 = s11.f23478a;
            str = "access$getTAG$p(...)";
            Je je2 = new Je(s11.f23479b, C3271w3.a(s10), new C3114pk(C3271w3.c().getPingTimeout() * 1000, C3271w3.c().getPingTimeout() * 1000, C3271w3.c().getPingTimeout() * 1000), s11.f23480c, null, s11.f23481d, 16);
            try {
                C3227u9 c3227u9 = (C3227u9) He.f22815f.getValue();
                c2947j3.f24580a = s11;
                c2947j3.f24583d = 1;
                objA = c3227u9.f25449a.a(je2, c2947j3);
                if (objA == objF) {
                    return objF;
                }
            } catch (CancellationException unused) {
                str2 = str;
                C3271w3 c3271w4 = C3271w3.f25610a;
                ck.p.i("w3", str2);
                return EnumC2721a6.f23958n;
            } catch (Exception e11) {
                e10 = e11;
                C3271w3 c3271w5 = C3271w3.f25610a;
                ck.p.i("w3", str);
                e10.getMessage();
                return EnumC2721a6.f23948d;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s11 = c2947j3.f24580a;
            try {
                kotlin.c.b(objA);
                str = "access$getTAG$p(...)";
            } catch (CancellationException unused2) {
                str2 = "access$getTAG$p(...)";
                C3271w3 c3271w6 = C3271w3.f25610a;
                ck.p.i("w3", str2);
                return EnumC2721a6.f23958n;
            } catch (Exception e12) {
                e10 = e12;
                str = "access$getTAG$p(...)";
                C3271w3 c3271w7 = C3271w3.f25610a;
                ck.p.i("w3", str);
                e10.getMessage();
                return EnumC2721a6.f23948d;
            }
        }
        Ne ne2 = (Ne) objA;
        C3271w3 c3271w8 = C3271w3.f25610a;
        if (AbstractC2891gl.a(ne2)) {
            return null;
        }
        int iC = ne2.c();
        if (200 <= iC && iC < 300) {
            return null;
        }
        if (!s11.f23481d) {
            Y5 y10 = EnumC2721a6.f23946b;
            if (303 == iC || 302 == iC) {
                return null;
            }
        }
        EnumC2721a6.f23946b.getClass();
        return Y5.a(iC);
    }
}
