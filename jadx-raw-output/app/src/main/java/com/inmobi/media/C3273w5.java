package com.inmobi.media;

import android.app.ActivityManager;
import android.content.Context;
import androidx.appcompat.widget.ActivityChooserModel;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.w5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3273w5 extends SuspendLambda implements bk.p {
    public C3273w5(rj.c cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3273w5(cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3273w5((rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ActivityManager activityManager;
        sj.a.f();
        kotlin.c.b(obj);
        try {
            Context context = Ji.f22951a;
            if (context == null) {
                return mj.r.f64562a;
            }
            Object systemService = context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            if (systemService instanceof ActivityManager) {
                activityManager = (ActivityManager) systemService;
            } else {
                activityManager = null;
            }
            if (activityManager == null) {
                return mj.r.f64562a;
            }
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            C3298x5 c3298x5 = C3298x5.f25687a;
            C3298x5.f25699m = memoryInfo.lowMemory;
            return mj.r.f64562a;
        } catch (Exception e10) {
            C3298x5 c3298x6 = C3298x5.f25687a;
            mj.g gVar = P9.f23321a;
            AbstractC2929i9.a(e10);
        }
    }
}
