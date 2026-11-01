package com.inmobi.media;

import android.widget.ProgressBar;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.an, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2738an extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f24017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f24018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ProgressBar f24019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ProgressBar f24021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C2764bn f24022i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f24023j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2738an(ProgressBar progressBar, C2764bn c2764bn, int i10, rj.c cVar) {
        super(2, cVar);
        this.f24021h = progressBar;
        this.f24022i = c2764bn;
        this.f24023j = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2738an(this.f24021h, this.f24022i, this.f24023j, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C2738an) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0049  */
    /* JADX WARN: Code duplicated, block: B:12:0x0067 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0065 -> B:13:0x0068). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = sj.a.f()
            int r1 = r11.f24020g
            r2 = 10
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 != r3) goto L1e
            int r1 = r11.f24016c
            int r2 = r11.f24015b
            float r4 = r11.f24018e
            long r5 = r11.f24017d
            int r7 = r11.f24014a
            android.widget.ProgressBar r8 = r11.f24019f
            kotlin.c.b(r12)
            r12 = r11
            goto L68
        L1e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L26:
            kotlin.c.b(r12)
            android.widget.ProgressBar r12 = r11.f24021h
            int r12 = r12.getProgress()
            com.inmobi.media.bn r1 = r11.f24022i
            com.inmobi.media.Fg r1 = r1.f24090c
            long r4 = r1.f22653f
            long r6 = (long) r2
            long r4 = r4 / r6
            int r1 = r11.f24023j
            int r1 = r1 - r12
            float r1 = (float) r1
            r6 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 / r6
            android.widget.ProgressBar r6 = r11.f24021h
            r7 = 0
            r8 = r6
            r5 = r4
            r4 = r1
            r1 = r7
            r7 = r12
            r12 = r11
        L47:
            if (r1 >= r2) goto L6a
            float r9 = (float) r7
            int r10 = r1 + 1
            float r10 = (float) r10
            float r10 = r10 * r4
            float r10 = r10 + r9
            int r9 = (int) r10
            com.inmobi.media.AbstractC3266vn.a(r8, r9)
            r12.f24019f = r8
            r12.f24014a = r7
            r12.f24017d = r5
            r12.f24018e = r4
            r12.f24015b = r2
            r12.f24016c = r1
            r12.f24020g = r3
            java.lang.Object r9 = nk.s0.a(r5, r12)
            if (r9 != r0) goto L68
            return r0
        L68:
            int r1 = r1 + r3
            goto L47
        L6a:
            mj.r r12 = mj.r.f64562a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2738an.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
