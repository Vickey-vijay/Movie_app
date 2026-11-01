package yads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
public final class pt1 extends Lambda implements bk.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qt1 f81588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f81589c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt1(qt1 qt1Var, Map map) {
        super(1);
        this.f81588b = qt1Var;
        this.f81589c = map;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0036 A[Catch: Exception -> 0x0039, TRY_LEAVE, TryCatch #1 {Exception -> 0x0039, blocks: (B:3:0x0010, B:13:0x0029, B:21:0x0036, B:19:0x0032, B:20:0x0035, B:6:0x0016, B:8:0x001a, B:17:0x0030, B:12:0x0025), top: B:28:0x0010, inners: #0, #2 }] */
    @Override // bk.l
    public final Object invoke(Object obj) {
        byte[] bArrC;
        po2 po2Var = (po2) obj;
        qt1 qt1Var = this.f81588b;
        y11 y11VarB = qt1Var.b(po2Var, this.f81589c);
        qt1Var.f81968c.getClass();
        try {
            InputStream byteArrayInputStream = y11VarB.f84788d;
            if (byteArrayInputStream == null) {
                byteArrayInputStream = y11VarB.f84789e != null ? new ByteArrayInputStream(y11VarB.f84789e) : null;
            }
            if (byteArrayInputStream != null) {
                try {
                    bArrC = yj.a.c(byteArrayInputStream);
                    yj.b.a(byteArrayInputStream, null);
                    if (bArrC == null) {
                        bArrC = new byte[0];
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        yj.b.a(byteArrayInputStream, th2);
                        throw th3;
                    }
                }
            } else {
                bArrC = new byte[0];
            }
        } catch (Exception unused) {
            bArrC = new byte[0];
        }
        byte[] bArr = bArrC;
        int i10 = y11VarB.f84785a;
        List listUnmodifiableList = Collections.unmodifiableList(y11VarB.f84786b);
        y11 y11Var = new y11(i10, listUnmodifiableList, bArr);
        List listUnmodifiableList2 = Collections.unmodifiableList(listUnmodifiableList);
        vo2.a(System.currentTimeMillis(), po2Var, new e82(i10, bArr, e82.a(listUnmodifiableList2), listUnmodifiableList2, true));
        return y11Var;
    }
}
