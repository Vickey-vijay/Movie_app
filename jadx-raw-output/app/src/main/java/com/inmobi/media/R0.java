package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public abstract class R0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3053n9 f23419a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(bk.l lVar, ContinuationImpl continuationImpl) throws Throwable {
        P0 p10;
        if (continuationImpl instanceof P0) {
            p10 = (P0) continuationImpl;
            int i10 = p10.f23309d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                p10.f23309d = i10 - Integer.MIN_VALUE;
            } else {
                p10 = new P0(this, continuationImpl);
            }
        } else {
            p10 = new P0(this, continuationImpl);
        }
        Object objA = p10.f23307b;
        Object objF = sj.a.f();
        int i11 = p10.f23309d;
        if (i11 == 0) {
            kotlin.c.b(objA);
            lVar.invoke(C2881gb.f24421a);
            p10.f23306a = lVar;
            p10.f23309d = 1;
            objA = a(p10);
            if (objA != objF) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objA);
            return objA;
        }
        lVar = p10.f23306a;
        kotlin.c.b(objA);
        p10.f23306a = null;
        p10.f23309d = 2;
        Object objA2 = a((String) objA, lVar, p10);
        return objA2 == objF ? objF : objA2;
    }

    public abstract Object a(rj.c cVar);

    public abstract mj.r a(AdResponse adResponse, bk.l lVar);

    public R0(C3053n9 c3053n9) {
        this.f23419a = c3053n9;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:35|(1:37)|38|88|39) */
    /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:53:0x0103  */
    /* JADX WARN: Code duplicated, block: B:66:0x013c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x016c  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (r1 == r4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
    
        if (r0.a(r2) == r4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0114, code lost:
    
        if (r1.a(r0, r14) == r4) goto L57;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00d5, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00ed, please report this as an issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00ca -> B:19:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00d3 -> B:19:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00d5 -> B:19:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00eb -> B:19:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00ed -> B:19:0x005a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r17, bk.l r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.R0.a(java.lang.String, bk.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
