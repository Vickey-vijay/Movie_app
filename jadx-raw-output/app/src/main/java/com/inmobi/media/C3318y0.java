package com.inmobi.media;

import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3318y0 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdConfig f25755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public A0 f25756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f25757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AdQualityResult f25758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ A0 f25760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AdConfig f25761g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3318y0(A0 a10, AdConfig adConfig, rj.c cVar) {
        super(2, cVar);
        this.f25760f = a10;
        this.f25761g = adConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3318y0(this.f25760f, this.f25761g, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3318y0(this.f25760f, this.f25761g, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0059  */
    /* JADX WARN: Code duplicated, block: B:18:0x0091  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b1 A[Catch: all -> 0x00cd, FileNotFoundException -> 0x00de, TryCatch #7 {FileNotFoundException -> 0x00de, all -> 0x00cd, blocks: (B:21:0x00a0, B:22:0x00ab, B:24:0x00b1, B:25:0x00ba), top: B:79:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:49:0x0125  */
    /* JADX WARN: Code duplicated, block: B:52:0x0131  */
    /* JADX WARN: Code duplicated, block: B:54:0x0134  */
    /* JADX WARN: Code duplicated, block: B:56:0x013d  */
    /* JADX WARN: Code duplicated, block: B:58:0x014b  */
    /* JADX WARN: Code duplicated, block: B:61:0x015b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0169  */
    /* JADX WARN: Code duplicated, block: B:79:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0125 -> B:50:0x0127). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3318y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
