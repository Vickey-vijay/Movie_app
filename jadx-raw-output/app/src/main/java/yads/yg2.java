package yads;

import android.content.Context;
import android.content.Intent;
import com.safedk.android.utils.Logger;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class yg2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f84951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lv f84952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f84953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tg2 f84954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uf0 f84955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final av f84956f;

    public /* synthetic */ yg2(d4 d4Var, lu2 lu2Var, v9 v9Var, j83 j83Var, lv lvVar) {
        this(j83Var, lvVar, new a1(), new tg2(), new uf0(d4Var, lu2Var, v9Var), new av());
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    public final void a(sg2 sg2Var, uu uuVar, boolean z10) {
        this.f84956f.getClass();
        String strA = av.a(uuVar);
        Map mapD = nj.l0.d();
        mapD.put("click_url", xa3.a(sg2Var.f82634b));
        mapD.put("deeplink_package_name", sg2Var.f82633a);
        mapD.put("deeplink_success", Boolean.valueOf(z10));
        if (z10) {
            mapD.put("click_destination", strA);
        }
        Map mapB = kotlin.collections.a.B(nj.l0.c(mapD));
        lv lvVar = this.f84952b;
        co2 co2Var = co2.f76372w;
        eo2 eo2VarA = lvVar.a(co2Var, mapB);
        lvVar.f79937d.a(eo2VarA);
        lvVar.f79939f.a(co2Var, eo2VarA.f77159b, bo2.f75924a, null);
    }

    public yg2(j83 j83Var, lv lvVar, a1 a1Var, tg2 tg2Var, uf0 uf0Var, av avVar) {
        this.f84951a = j83Var;
        this.f84952b = lvVar;
        this.f84953c = a1Var;
        this.f84954d = tg2Var;
        this.f84955e = uf0Var;
        this.f84956f = avVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Context context, sg2 sg2Var, rj.c cVar) throws Throwable {
        wg2 wg2Var;
        yg2 yg2Var;
        uu uuVar;
        if (cVar instanceof wg2) {
            wg2Var = (wg2) cVar;
            int i10 = wg2Var.f84203g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                wg2Var.f84203g = i10 - Integer.MIN_VALUE;
            } else {
                wg2Var = new wg2(this, cVar);
            }
        } else {
            wg2Var = new wg2(this, cVar);
        }
        Object obj = wg2Var.f84201e;
        Object objF = sj.a.f();
        int i11 = wg2Var.f84203g;
        if (i11 == 0) {
            kotlin.c.b(obj);
            uu uuVar2 = new uu(sg2Var);
            try {
                this.f84954d.getClass();
                Intent intentA = tg2.a(context, sg2Var);
                if (sg2Var.f82637e == bb0.f75773d) {
                    uf0 uf0Var = this.f84955e;
                    wg2Var.f84198b = this;
                    wg2Var.f84199c = sg2Var;
                    wg2Var.f84200d = uuVar2;
                    wg2Var.f84203g = 1;
                    if (uf0Var.a(context, intentA, wg2Var) == objF) {
                        return objF;
                    }
                } else {
                    safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intentA);
                }
                yg2Var = this;
                uuVar = uuVar2;
            } catch (Exception unused) {
                yg2Var = this;
                uuVar = uuVar2;
                yg2Var.f84951a.a(sg2Var.f82639g, uuVar);
                yg2Var.a(sg2Var, uuVar, false);
                boolean z10 = ad1.f75480a;
                return tj.a.a(false);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uuVar = wg2Var.f84200d;
            sg2Var = wg2Var.f84199c;
            yg2Var = wg2Var.f84198b;
            try {
                kotlin.c.b(obj);
            } catch (Exception unused2) {
                yg2Var.f84951a.a(sg2Var.f82639g, uuVar);
                yg2Var.a(sg2Var, uuVar, false);
                boolean z11 = ad1.f75480a;
                return tj.a.a(false);
            }
        }
        yg2Var.f84951a.a(sg2Var.f82638f, uuVar);
        yg2Var.a(sg2Var, uuVar, true);
        return tj.a.a(true);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:34:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x0094 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0089 -> B:35:0x008c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(android.content.Context r8, java.util.List r9, rj.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof yads.xg2
            if (r0 == 0) goto L13
            r0 = r10
            yads.xg2 r0 = (yads.xg2) r0
            int r1 = r0.f84591h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f84591h = r1
            goto L18
        L13:
            yads.xg2 r0 = new yads.xg2
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f84589f
            java.lang.Object r1 = sj.a.f()
            int r2 = r0.f84591h
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            yads.sg2 r8 = r0.f84588e
            java.util.Iterator r9 = r0.f84587d
            android.content.Context r2 = r0.f84586c
            yads.yg2 r5 = r0.f84585b
            kotlin.c.b(r10)
            goto L8c
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            kotlin.c.b(r10)
            android.app.Activity r10 = yads.j1.a()
            if (r10 == 0) goto L45
            r8 = r10
            goto L69
        L45:
            yads.a1 r10 = r7.f84953c
            r10.getClass()
            r10 = 0
            r2 = r8
        L4c:
            boolean r5 = r2 instanceof android.content.ContextWrapper
            if (r5 == 0) goto L65
            int r5 = r10 + 1
            r6 = 10
            if (r10 >= r6) goto L65
            boolean r10 = r2 instanceof android.app.Activity
            if (r10 == 0) goto L5d
            android.app.Activity r2 = (android.app.Activity) r2
            goto L66
        L5d:
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            r10 = r5
            goto L4c
        L65:
            r2 = r3
        L66:
            if (r2 == 0) goto L69
            r8 = r2
        L69:
            java.util.Iterator r9 = r9.iterator()
            r5 = r7
            r2 = r8
        L6f:
            boolean r8 = r9.hasNext()
            if (r8 == 0) goto L95
            java.lang.Object r8 = r9.next()
            yads.sg2 r8 = (yads.sg2) r8
            r0.f84585b = r5
            r0.f84586c = r2
            r0.f84587d = r9
            r0.f84588e = r8
            r0.f84591h = r4
            java.lang.Object r10 = r5.a(r2, r8, r0)
            if (r10 != r1) goto L8c
            return r1
        L8c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L6f
            return r8
        L95:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.yg2.a(android.content.Context, java.util.List, rj.c):java.lang.Object");
    }
}
