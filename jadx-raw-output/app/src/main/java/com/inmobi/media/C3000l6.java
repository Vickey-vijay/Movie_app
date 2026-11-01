package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3426d4;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: com.inmobi.media.l6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3000l6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC2799d6 f24740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Jf f24741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Wj f24742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f24743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f24744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f24745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedList f24746h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final nk.l0 f24747i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C2773c6 f24748j;

    /* JADX WARN: Code duplicated, block: B:38:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:45:0x010b  */
    /* JADX WARN: Code duplicated, block: B:46:0x010e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0133  */
    /* JADX WARN: Code duplicated, block: B:58:0x0168  */
    /* JADX WARN: Code duplicated, block: B:61:0x0178 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x0190  */
    /* JADX WARN: Code duplicated, block: B:69:0x0197  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object a(C3000l6 c3000l6, boolean z10, ContinuationImpl continuationImpl) throws Throwable {
        C2850f6 c2850f6;
        C2773c6 c2773c6;
        boolean z11;
        C2773c6 c2773c7;
        int iIntValue;
        int iL;
        C2773c6 c2773c8;
        int i10;
        long j10;
        Object objA;
        int i11;
        boolean z12;
        int i12;
        Ak ak2;
        C2773c6 c2773c9;
        long j11;
        boolean zBooleanValue;
        Ak ak3;
        C2773c6 c2773c10;
        long j12;
        int i13;
        int i14;
        boolean z13;
        boolean z14;
        Ak ak4;
        long j13;
        C2773c6 c2773c11;
        boolean z15;
        C2824e6 c2824e6;
        c3000l6.getClass();
        if (continuationImpl instanceof C2850f6) {
            c2850f6 = (C2850f6) continuationImpl;
            int i15 = c2850f6.f24351j;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                c2850f6.f24351j = i15 - Integer.MIN_VALUE;
            } else {
                c2850f6 = new C2850f6(c3000l6, continuationImpl);
            }
        } else {
            c2850f6 = new C2850f6(c3000l6, continuationImpl);
        }
        C2850f6 c2850f7 = c2850f6;
        Object objA2 = c2850f7.f24349h;
        Object objF = sj.a.f();
        int i16 = c2850f7.f24351j;
        Ak ak5 = null;
        if (i16 == 0) {
            kotlin.c.b(objA2);
            c2773c6 = c3000l6.f24748j;
            if (c3000l6.f24745g.get() || c3000l6.f24744f.get() || c2773c6 == null) {
                return mj.r.f64562a;
            }
            ck.p.i(c3000l6.f24743e, "TAG");
            long jCurrentTimeMillis = System.currentTimeMillis() - (c2773c6.f24115b * ((long) 1000));
            AbstractC2799d6 abstractC2799d6 = c3000l6.f24740b;
            c2850f7.f24342a = null;
            c2850f7.f24343b = c2773c6;
            c2850f7.f24344c = z10;
            c2850f7.f24351j = 1;
            if (abstractC2799d6.a(jCurrentTimeMillis, c2850f7) != objF) {
                z11 = z10;
            }
            return objF;
        }
        if (i16 == 1) {
            z11 = c2850f7.f24344c;
            C2773c6 c2773c12 = c2850f7.f24343b;
            Ak ak6 = c2850f7.f24342a;
            kotlin.c.b(objA2);
            c2773c6 = c2773c12;
            ak5 = ak6;
        } else {
            if (i16 == 2) {
                z11 = c2850f7.f24344c;
                C2773c6 c2773c13 = c2850f7.f24343b;
                ak5 = c2850f7.f24342a;
                kotlin.c.b(objA2);
                c2773c7 = c2773c13;
                iIntValue = ((Number) objA2).intValue();
                C3298x5.f25687a.getClass();
                iL = C3298x5.l();
                c2773c8 = c3000l6.f24748j;
                if (c2773c8 == null) {
                    i10 = 0;
                } else {
                    i10 = (iL == 0 || iL != 1) ? c2773c8.f24120g : c2773c8.f24118e;
                }
                if (c2773c8 == null) {
                    j10 = 0;
                } else {
                    j10 = (iL == 0 || iL != 1) ? c2773c8.f24123j : c2773c8.f24122i;
                }
                long j14 = c2773c7.f24117d;
                c2850f7.f24342a = ak5;
                c2850f7.f24343b = c2773c7;
                c2850f7.f24344c = z11;
                c2850f7.f24346e = iIntValue;
                c2850f7.f24347f = i10;
                c2850f7.f24348g = j10;
                c2850f7.f24351j = 3;
                objA = c3000l6.a(j14, c2850f7);
                if (objA != objF) {
                    i11 = iIntValue;
                    z12 = z11;
                    i12 = i10;
                    objA2 = objA;
                    ak2 = ak5;
                    c2773c9 = c2773c7;
                    j11 = j10;
                    zBooleanValue = ((Boolean) objA2).booleanValue();
                    long j15 = c2773c9.f24116c;
                    long j16 = c2773c9.f24117d;
                    c2850f7.f24342a = ak2;
                    c2850f7.f24343b = c2773c9;
                    c2850f7.f24344c = z12;
                    c2850f7.f24346e = i11;
                    c2850f7.f24347f = i12;
                    c2850f7.f24348g = j11;
                    c2850f7.f24345d = zBooleanValue;
                    c2850f7.f24351j = 4;
                    ak3 = ak2;
                    c2773c10 = c2773c9;
                    objA2 = c3000l6.a(j15, j16, c2850f7);
                    if (objA2 != objF) {
                        j12 = j11;
                        i13 = i12;
                        i14 = i11;
                        z13 = z12;
                        z14 = zBooleanValue;
                        ak4 = ak3;
                        boolean zBooleanValue2 = ((Boolean) objA2).booleanValue();
                        if (i13 > i14) {
                        }
                        Jf jf2 = c3000l6.f24741c;
                        c2850f7.f24342a = ak4;
                        c2850f7.f24343b = c2773c10;
                        c2850f7.f24344c = z13;
                        c2850f7.f24348g = j12;
                        c2850f7.f24351j = 5;
                        objA2 = jf2.a(c2850f7);
                        if (objA2 != objF) {
                            j13 = j12;
                            c2773c11 = c2773c10;
                            z15 = z13;
                        }
                    }
                }
                return objF;
            }
            if (i16 == 3) {
                long j17 = c2850f7.f24348g;
                int i17 = c2850f7.f24347f;
                int i18 = c2850f7.f24346e;
                boolean z16 = c2850f7.f24344c;
                C2773c6 c2773c14 = c2850f7.f24343b;
                Ak ak7 = c2850f7.f24342a;
                kotlin.c.b(objA2);
                i11 = i18;
                z12 = z16;
                c2773c9 = c2773c14;
                j11 = j17;
                ak2 = ak7;
                i12 = i17;
                zBooleanValue = ((Boolean) objA2).booleanValue();
                long j18 = c2773c9.f24116c;
                long j19 = c2773c9.f24117d;
                c2850f7.f24342a = ak2;
                c2850f7.f24343b = c2773c9;
                c2850f7.f24344c = z12;
                c2850f7.f24346e = i11;
                c2850f7.f24347f = i12;
                c2850f7.f24348g = j11;
                c2850f7.f24345d = zBooleanValue;
                c2850f7.f24351j = 4;
                ak3 = ak2;
                c2773c10 = c2773c9;
                objA2 = c3000l6.a(j18, j19, c2850f7);
                if (objA2 != objF) {
                    j12 = j11;
                    i13 = i12;
                    i14 = i11;
                    z13 = z12;
                    z14 = zBooleanValue;
                    ak4 = ak3;
                    boolean zBooleanValue3 = ((Boolean) objA2).booleanValue();
                    if (i13 > i14) {
                    }
                    Jf jf3 = c3000l6.f24741c;
                    c2850f7.f24342a = ak4;
                    c2850f7.f24343b = c2773c10;
                    c2850f7.f24344c = z13;
                    c2850f7.f24348g = j12;
                    c2850f7.f24351j = 5;
                    objA2 = jf3.a(c2850f7);
                    if (objA2 != objF) {
                        j13 = j12;
                        c2773c11 = c2773c10;
                        z15 = z13;
                    }
                }
                return objF;
            }
            if (i16 == 4) {
                z14 = c2850f7.f24345d;
                j12 = c2850f7.f24348g;
                i13 = c2850f7.f24347f;
                i14 = c2850f7.f24346e;
                z13 = c2850f7.f24344c;
                C2773c6 c2773c15 = c2850f7.f24343b;
                ak4 = c2850f7.f24342a;
                kotlin.c.b(objA2);
                c2773c10 = c2773c15;
                boolean zBooleanValue4 = ((Boolean) objA2).booleanValue();
                if (i13 > i14 || z14 || zBooleanValue4) {
                    Jf jf4 = c3000l6.f24741c;
                    c2850f7.f24342a = ak4;
                    c2850f7.f24343b = c2773c10;
                    c2850f7.f24344c = z13;
                    c2850f7.f24348g = j12;
                    c2850f7.f24351j = 5;
                    objA2 = jf4.a(c2850f7);
                    if (objA2 != objF) {
                        j13 = j12;
                        c2773c11 = c2773c10;
                        z15 = z13;
                    }
                    return objF;
                }
                return mj.r.f64562a;
            }
            if (i16 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j20 = c2850f7.f24348g;
            boolean z17 = c2850f7.f24344c;
            c2773c11 = c2850f7.f24343b;
            Ak ak8 = c2850f7.f24342a;
            kotlin.c.b(objA2);
            z15 = z17;
            ak4 = ak8;
            j13 = j20;
        }
        c2824e6 = (C2824e6) objA2;
        if (c2824e6 != null) {
            c3000l6.f24744f.set(true);
            mj.g gVar = AbstractC3050n6.f24876a;
            String str = c2773c11.f24124k;
            int i19 = c2773c11.f24114a + 1;
            ck.p.j(c2824e6, "payload");
            ck.p.j(c3000l6, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            AbstractC3050n6.a(c2824e6, str, i19, i19, j13, ak4, c3000l6, z15);
        }
        return mj.r.f64562a;
        AbstractC2799d6 abstractC2799d7 = c3000l6.f24740b;
        c2850f7.f24342a = ak5;
        c2850f7.f24343b = c2773c6;
        c2850f7.f24344c = z11;
        c2850f7.f24351j = 2;
        Object objA3 = abstractC2799d7.a(c2850f7);
        if (objA3 != objF) {
            c2773c7 = c2773c6;
            objA2 = objA3;
            iIntValue = ((Number) objA2).intValue();
            C3298x5.f25687a.getClass();
            iL = C3298x5.l();
            c2773c8 = c3000l6.f24748j;
            if (c2773c8 == null) {
                i10 = 0;
            } else if (iL == 0) {
                i10 = c2773c8.f24120g;
            }
            if (c2773c8 == null) {
                j10 = 0;
            } else if (iL == 0) {
                j10 = c2773c8.f24123j;
            }
            long j110 = c2773c7.f24117d;
            c2850f7.f24342a = ak5;
            c2850f7.f24343b = c2773c7;
            c2850f7.f24344c = z11;
            c2850f7.f24346e = iIntValue;
            c2850f7.f24347f = i10;
            c2850f7.f24348g = j10;
            c2850f7.f24351j = 3;
            objA = c3000l6.a(j110, c2850f7);
            if (objA != objF) {
                i11 = iIntValue;
                z12 = z11;
                i12 = i10;
                objA2 = objA;
                ak2 = ak5;
                c2773c9 = c2773c7;
                j11 = j10;
                zBooleanValue = ((Boolean) objA2).booleanValue();
                long j111 = c2773c9.f24116c;
                long j112 = c2773c9.f24117d;
                c2850f7.f24342a = ak2;
                c2850f7.f24343b = c2773c9;
                c2850f7.f24344c = z12;
                c2850f7.f24346e = i11;
                c2850f7.f24347f = i12;
                c2850f7.f24348g = j11;
                c2850f7.f24345d = zBooleanValue;
                c2850f7.f24351j = 4;
                ak3 = ak2;
                c2773c10 = c2773c9;
                objA2 = c3000l6.a(j111, j112, c2850f7);
                if (objA2 != objF) {
                    j12 = j11;
                    i13 = i12;
                    i14 = i11;
                    z13 = z12;
                    z14 = zBooleanValue;
                    ak4 = ak3;
                    boolean zBooleanValue5 = ((Boolean) objA2).booleanValue();
                    if (i13 > i14) {
                    }
                    Jf jf5 = c3000l6.f24741c;
                    c2850f7.f24342a = ak4;
                    c2850f7.f24343b = c2773c10;
                    c2850f7.f24344c = z13;
                    c2850f7.f24348g = j12;
                    c2850f7.f24351j = 5;
                    objA2 = jf5.a(c2850f7);
                    if (objA2 != objF) {
                        j13 = j12;
                        c2773c11 = c2773c10;
                        z15 = z13;
                        c2824e6 = (C2824e6) objA2;
                        if (c2824e6 != null) {
                            c3000l6.f24744f.set(true);
                            mj.g gVar2 = AbstractC3050n6.f24876a;
                            String str2 = c2773c11.f24124k;
                            int i110 = c2773c11.f24114a + 1;
                            ck.p.j(c2824e6, "payload");
                            ck.p.j(c3000l6, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                            AbstractC3050n6.a(c2824e6, str2, i110, i110, j13, ak4, c3000l6, z15);
                        }
                        return mj.r.f64562a;
                    }
                }
            }
        }
        return objF;
    }

    public C3000l6(String str, AbstractC2799d6 abstractC2799d6, Jf jf2, C2773c6 c2773c6, Wj wj2) {
        ck.p.j(str, "tableName");
        ck.p.j(abstractC2799d6, "mEventDao");
        ck.p.j(jf2, "mPayloadProvider");
        ck.p.j(c2773c6, "eventConfig");
        this.f24739a = str;
        this.f24740b = abstractC2799d6;
        this.f24741c = jf2;
        this.f24742d = wj2;
        this.f24743e = C3000l6.class.getSimpleName();
        this.f24744f = new AtomicBoolean(false);
        this.f24745g = new AtomicBoolean(false);
        this.f24747i = A9.f22351c;
        this.f24746h = new LinkedList();
        this.f24748j = c2773c6;
    }

    public final long a() {
        Context context = Ji.f22951a;
        if (context == null) {
            return -1L;
        }
        ConcurrentHashMap concurrentHashMap = Ea.f22576b;
        Ea eaA = Da.a(context, "batch_processing_info");
        String str = this.f24739a + "_last_batch_process";
        ck.p.j(str, C3426d4.i.W);
        return eaA.f22577a.getLong(str, -1L);
    }

    public final void a(long j10) {
        Context context = Ji.f22951a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Ea.f22576b;
            Da.a(context, "batch_processing_info").a(this.f24739a + "_last_batch_process", j10, false);
        }
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [T, kotlinx.coroutines.g] */
    public final void a(boolean z10) {
        C2773c6 c2773c6 = this.f24748j;
        if (this.f24745g.get() || c2773c6 == null) {
            return;
        }
        long j10 = c2773c6.f24116c;
        if (this.f24746h.contains("default")) {
            return;
        }
        this.f24746h.add("default");
        ck.p.i(this.f24743e, "TAG");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        nk.l0 l0Var = this.f24747i;
        C2773c6 c2773c7 = this.f24748j;
        long jA = a();
        if (jA == -1) {
            a(System.currentTimeMillis());
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ref$ObjectRef.element = F3.a(l0Var, Math.max(0L, (timeUnit.toSeconds(jA) + (c2773c7 != null ? c2773c7.f24116c : 0L)) - timeUnit.toSeconds(System.currentTimeMillis())) * 1000, 1000 * j10, new C2950j6(this, z10, ref$ObjectRef, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j10, ContinuationImpl continuationImpl) throws Throwable {
        C2876g6 c2876g6;
        if (continuationImpl instanceof C2876g6) {
            c2876g6 = (C2876g6) continuationImpl;
            int i10 = c2876g6.f24410d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2876g6.f24410d = i10 - Integer.MIN_VALUE;
            } else {
                c2876g6 = new C2876g6(this, continuationImpl);
            }
        } else {
            c2876g6 = new C2876g6(this, continuationImpl);
        }
        Object objB = c2876g6.f24408b;
        Object objF = sj.a.f();
        int i11 = c2876g6.f24410d;
        if (i11 == 0) {
            kotlin.c.b(objB);
            AbstractC2799d6 abstractC2799d6 = this.f24740b;
            c2876g6.f24407a = j10;
            c2876g6.f24410d = 1;
            objB = abstractC2799d6.b(1, c2876g6);
            if (objB == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = c2876g6.f24407a;
            kotlin.c.b(objB);
        }
        List list = (List) objB;
        return tj.a.a(!list.isEmpty() && TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - ((AbstractC2922i2) list.get(0)).f24530c) > j10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j10, long j11, ContinuationImpl continuationImpl) throws Throwable {
        C2975k6 c2975k6;
        long seconds;
        if (continuationImpl instanceof C2975k6) {
            c2975k6 = (C2975k6) continuationImpl;
            int i10 = c2975k6.f24657e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2975k6.f24657e = i10 - Integer.MIN_VALUE;
            } else {
                c2975k6 = new C2975k6(this, continuationImpl);
            }
        } else {
            c2975k6 = new C2975k6(this, continuationImpl);
        }
        Object objB = c2975k6.f24655c;
        Object objF = sj.a.f();
        int i11 = c2975k6.f24657e;
        if (i11 == 0) {
            kotlin.c.b(objB);
            seconds = j10 + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            AbstractC2799d6 abstractC2799d6 = this.f24740b;
            c2975k6.f24653a = j11;
            c2975k6.f24654b = seconds;
            c2975k6.f24657e = 1;
            objB = abstractC2799d6.b(1, c2975k6);
            if (objB == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            seconds = c2975k6.f24654b;
            j11 = c2975k6.f24653a;
            kotlin.c.b(objB);
        }
        List list = (List) objB;
        return tj.a.a(!list.isEmpty() && seconds - TimeUnit.MILLISECONDS.toSeconds(((AbstractC2922i2) list.get(0)).f24530c) >= j11);
    }
}
