package com.inmobi.media;

import java.util.HashMap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes5.dex */
public final class F8 extends AbstractC2935ig {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3026m7 f22624d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F8(C3085og c3085og) {
        super(c3085og);
        ck.p.j(c3085og, "dao");
        this.f22624d = new C3026m7(c3085og, new E8(this), this.f24560c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Rf rf2, ContinuationImpl continuationImpl) throws Throwable {
        C8 c10;
        if (continuationImpl instanceof C8) {
            c10 = (C8) continuationImpl;
            int i10 = c10.f22457d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c10.f22457d = i10 - Integer.MIN_VALUE;
            } else {
                c10 = new C8(this, continuationImpl);
            }
        } else {
            c10 = new C8(this, continuationImpl);
        }
        Object objA = c10.f22455b;
        Object objF = sj.a.f();
        int i11 = c10.f22457d;
        if (i11 == 0) {
            kotlin.c.b(objA);
            Cif cif = this.f24560c;
            c10.f22454a = rf2;
            c10.f22457d = 1;
            cif.getClass();
            HashMap map = new HashMap(rf2.f23454c);
            map.put("user-agent", Ji.c());
            objA = cif.f24557a.f25449a.a(new Je(rf2.f23452a, map, null, null, null, rf2.f23455d, 28), c10);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rf2 = c10.f22454a;
            kotlin.c.b(objA);
        }
        Ne ne2 = (Ne) objA;
        return new Xf(rf2, ne2.c(), ne2.e());
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ab A[Catch: Error -> 0x0152, Exception -> 0x018d, TryCatch #4 {Error -> 0x0152, Exception -> 0x018d, blocks: (B:14:0x003d, B:71:0x0143, B:17:0x0044, B:51:0x00dd, B:41:0x00a3, B:43:0x00ab, B:45:0x00bd, B:48:0x00d7, B:33:0x0078, B:35:0x0086, B:37:0x008e), top: B:94:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00bd A[Catch: Error -> 0x0152, Exception -> 0x018d, TryCatch #4 {Error -> 0x0152, Exception -> 0x018d, blocks: (B:14:0x003d, B:71:0x0143, B:17:0x0044, B:51:0x00dd, B:41:0x00a3, B:43:0x00ab, B:45:0x00bd, B:48:0x00d7, B:33:0x0078, B:35:0x0086, B:37:0x008e), top: B:94:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d7 A[Catch: Error -> 0x0152, Exception -> 0x018d, TryCatch #4 {Error -> 0x0152, Exception -> 0x018d, blocks: (B:14:0x003d, B:71:0x0143, B:17:0x0044, B:51:0x00dd, B:41:0x00a3, B:43:0x00ab, B:45:0x00bd, B:48:0x00d7, B:33:0x0078, B:35:0x0086, B:37:0x008e), top: B:94:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00db  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd A[Catch: Error -> 0x0152, Exception -> 0x018d, PHI: r2 r5
  0x00dd: PHI (r2v16 com.inmobi.media.Rf) = (r2v13 com.inmobi.media.Rf), (r2v19 com.inmobi.media.Rf) binds: [B:49:0x00d9, B:24:0x0059] A[DONT_GENERATE, DONT_INLINE]
  0x00dd: PHI (r5v10 com.inmobi.media.fg) = (r5v7 com.inmobi.media.fg), (r5v13 com.inmobi.media.fg) binds: [B:49:0x00d9, B:24:0x0059] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {Error -> 0x0152, Exception -> 0x018d, blocks: (B:14:0x003d, B:71:0x0143, B:17:0x0044, B:51:0x00dd, B:41:0x00a3, B:43:0x00ab, B:45:0x00bd, B:48:0x00d7, B:33:0x0078, B:35:0x0086, B:37:0x008e), top: B:94:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f9 A[Catch: Error -> 0x006d, Exception -> 0x0071, TryCatch #3 {Error -> 0x006d, Exception -> 0x0071, blocks: (B:20:0x004d, B:55:0x00f1, B:57:0x00f9, B:61:0x0122, B:64:0x0129, B:60:0x0120, B:67:0x012f, B:23:0x0056, B:26:0x0064), top: B:94:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:59:0x011f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0120 A[Catch: Error -> 0x006d, Exception -> 0x0071, TryCatch #3 {Error -> 0x006d, Exception -> 0x0071, blocks: (B:20:0x004d, B:55:0x00f1, B:57:0x00f9, B:61:0x0122, B:64:0x0129, B:60:0x0120, B:67:0x012f, B:23:0x0056, B:26:0x0064), top: B:94:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0128  */
    /* JADX WARN: Code duplicated, block: B:64:0x0129 A[Catch: Error -> 0x006d, Exception -> 0x0071, TryCatch #3 {Error -> 0x006d, Exception -> 0x0071, blocks: (B:20:0x004d, B:55:0x00f1, B:57:0x00f9, B:61:0x0122, B:64:0x0129, B:60:0x0120, B:67:0x012f, B:23:0x0056, B:26:0x0064), top: B:94:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:66:0x012d  */
    /* JADX WARN: Code duplicated, block: B:67:0x012f A[Catch: Error -> 0x006d, Exception -> 0x0071, TRY_LEAVE, TryCatch #3 {Error -> 0x006d, Exception -> 0x0071, blocks: (B:20:0x004d, B:55:0x00f1, B:57:0x00f9, B:61:0x0122, B:64:0x0129, B:60:0x0120, B:67:0x012f, B:23:0x0056, B:26:0x0064), top: B:94:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0142  */
    /* JADX WARN: Code duplicated, block: B:78:0x0163  */
    /* JADX WARN: Code duplicated, block: B:79:0x016c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:87:0x019e  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a7  */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014e, code lost:
    
        if (r0.a(r3) == r4) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018a, code lost:
    
        if (r0.a(r3) == r4) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c4, code lost:
    
        if (r0.a(r3) == r4) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.inmobi.media.Rf r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.F8.b(com.inmobi.media.Rf, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
