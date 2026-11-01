package kotlinx.coroutines.flow;

import mj.r;
import pk.p;
import qk.d;
import rj.c;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class FlowKt__ChannelsKt {
    public static final <T> Object b(d<? super T> dVar, p<? extends T> pVar, c<? super r> cVar) throws Throwable {
        Object objC = c(dVar, pVar, true, cVar);
        return objC == sj.a.f() ? objC : r.f64562a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x007e A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #0 {all -> 0x009b, blocks: (B:13:0x0036, B:22:0x0060, B:26:0x0075, B:28:0x007e, B:18:0x0052, B:21:0x005c), top: B:41:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0090 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final <T> java.lang.Object c(qk.d<? super T> r7, pk.p<? extends T> r8, boolean r9, rj.c<? super mj.r> r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = sj.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L56
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3c
            boolean r9 = r0.Z$0
            java.lang.Object r7 = r0.L$2
            pk.f r7 = (pk.f) r7
            java.lang.Object r8 = r0.L$1
            pk.p r8 = (pk.p) r8
            java.lang.Object r2 = r0.L$0
            qk.d r2 = (qk.d) r2
            kotlin.c.b(r10)     // Catch: java.lang.Throwable -> L9b
        L39:
            r10 = r7
            r7 = r2
            goto L60
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L44:
            boolean r9 = r0.Z$0
            java.lang.Object r7 = r0.L$2
            pk.f r7 = (pk.f) r7
            java.lang.Object r8 = r0.L$1
            pk.p r8 = (pk.p) r8
            java.lang.Object r2 = r0.L$0
            qk.d r2 = (qk.d) r2
            kotlin.c.b(r10)     // Catch: java.lang.Throwable -> L9b
            goto L75
        L56:
            kotlin.c.b(r10)
            qk.e.o(r7)
            pk.f r10 = r8.iterator()     // Catch: java.lang.Throwable -> L9b
        L60:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L9b
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L9b
            r0.L$2 = r10     // Catch: java.lang.Throwable -> L9b
            r0.Z$0 = r9     // Catch: java.lang.Throwable -> L9b
            r0.label = r4     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r2 = r10.a(r0)     // Catch: java.lang.Throwable -> L9b
            if (r2 != r1) goto L71
            return r1
        L71:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L75:
            r5 = 0
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L9b
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L9b
            if (r10 == 0) goto L93
            java.lang.Object r10 = r7.next()     // Catch: java.lang.Throwable -> L9b
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L9b
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L9b
            r0.L$2 = r7     // Catch: java.lang.Throwable -> L9b
            r0.Z$0 = r9     // Catch: java.lang.Throwable -> L9b
            r0.label = r3     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L9b
            if (r10 != r1) goto L39
            return r1
        L93:
            if (r9 == 0) goto L98
            pk.j.a(r8, r5)
        L98:
            mj.r r7 = mj.r.f64562a
            return r7
        L9b:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L9d
        L9d:
            r10 = move-exception
            if (r9 == 0) goto La3
            pk.j.a(r8, r7)
        La3:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ChannelsKt.c(qk.d, pk.p, boolean, rj.c):java.lang.Object");
    }

    public static final <T> qk.c<T> d(p<? extends T> pVar) {
        return new qk.a(pVar, false, null, 0, null, 28, null);
    }
}
