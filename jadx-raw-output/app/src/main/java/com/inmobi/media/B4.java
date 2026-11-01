package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class B4 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4 f22401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W5 f22402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f22403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22404e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B4(C4 c10, W5 w10, long j10, int i10, rj.c cVar) {
        super(2, cVar);
        this.f22401b = c10;
        this.f22402c = w10;
        this.f22403d = j10;
        this.f22404e = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new B4(this.f22401b, this.f22402c, this.f22403d, this.f22404e, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((B4) create((C2879g9) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        if (r1.a(r8, r7) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Object r0 = sj.a.f()
            int r1 = r7.f22400a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.c.b(r8)
            goto L7e
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            kotlin.c.b(r8)
            goto L4f
        L1e:
            kotlin.c.b(r8)
            com.inmobi.media.C4 r8 = r7.f22401b
            com.inmobi.media.g9 r8 = r8.f22449a
            com.inmobi.media.W5 r1 = r7.f22402c
            java.lang.String r4 = "<this>"
            ck.p.j(r1, r4)
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            java.lang.String r5 = r1.f23725a
            java.lang.String r6 = "e_data"
            r4.put(r6, r5)
            long r5 = r1.f23726b
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.lang.String r5 = "timestamp"
            r4.put(r5, r1)
            r7.f22400a = r3
            r1 = 4
            java.lang.String r3 = "c_data"
            java.lang.Object r8 = r8.a(r3, r4, r1, r7)
            if (r8 != r0) goto L4f
            goto L7d
        L4f:
            long r3 = r7.f22403d
            int r8 = r7.f22404e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "DELETE FROM c_data WHERE id NOT IN (SELECT id FROM (SELECT id FROM c_data WHERE timestamp > "
            r1.append(r5)
            r1.append(r3)
            java.lang.String r3 = " ORDER BY timestamp DESC LIMIT "
            r1.append(r3)
            r1.append(r8)
            java.lang.String r8 = ") foo);"
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            com.inmobi.media.C4 r1 = r7.f22401b
            com.inmobi.media.g9 r1 = r1.f22449a
            r7.f22400a = r2
            java.lang.Object r8 = r1.a(r8, r7)
            if (r8 != r0) goto L7e
        L7d:
            return r0
        L7e:
            mj.r r8 = mj.r.f64562a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.B4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
