package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes11.dex */
public final class xy1 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yy1 f84747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f84748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f84749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fy1 f84750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Collection f84751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f84752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f84753h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f84754i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ yy1 f84755j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy1(List list, yy1 yy1Var, rj.c cVar) {
        super(2, cVar);
        this.f84754i = list;
        this.f84755j = yy1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        xy1 xy1Var = new xy1(this.f84754i, this.f84755j, cVar);
        xy1Var.f84753h = obj;
        return xy1Var;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((xy1) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0051  */
    /* JADX WARN: Code duplicated, block: B:14:0x006d  */
    /* JADX WARN: Code duplicated, block: B:16:0x007e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0085  */
    /* JADX WARN: Code duplicated, block: B:19:0x0088  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:43:0x0108 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x010a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00f4 -> B:41:0x00f8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.xy1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
