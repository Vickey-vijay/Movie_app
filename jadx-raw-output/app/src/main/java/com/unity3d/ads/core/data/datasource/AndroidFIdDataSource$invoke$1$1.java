package com.unity3d.ads.core.data.datasource;

import bk.l;
import bk.p;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.l0;
import rj.c;
import rj.f;
import tj.d;

/* JADX INFO: compiled from: AndroidFIdDataSource.kt */
/* JADX INFO: loaded from: classes7.dex */
@d(c = "com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1", f = "AndroidFIdDataSource.kt", l = {19}, m = "invokeSuspend")
public final class AndroidFIdDataSource$invoke$1$1 extends SuspendLambda implements p<l0, c<? super String>, Object> {
    public final /* synthetic */ Task<String> $task;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFIdDataSource$invoke$1$1(Task<String> task, c<? super AndroidFIdDataSource$invoke$1$1> cVar) {
        super(2, cVar);
        this.$task = task;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        return new AndroidFIdDataSource$invoke$1$1(this.$task, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(l0 l0Var, c<? super String> cVar) {
        return ((AndroidFIdDataSource$invoke$1$1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            Task<String> task = this.$task;
            this.L$0 = task;
            this.label = 1;
            final f fVar = new f(IntrinsicsKt__IntrinsicsJvmKt.c(this));
            final l<String, r> lVar = new l<String, r>() { // from class: com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(String str) {
                    invoke2(str);
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String str) {
                    fVar.resumeWith(Result.m3458constructorimpl(str));
                }
            };
            task.addOnSuccessListener(new OnSuccessListener(lVar) { // from class: com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$sam$com_google_android_gms_tasks_OnSuccessListener$0
                private final /* synthetic */ l function;

                {
                    ck.p.j(lVar, "function");
                    this.function = lVar;
                }

                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final /* synthetic */ void onSuccess(Object obj2) {
                    this.function.invoke(obj2);
                }
            });
            task.addOnFailureListener(new OnFailureListener() { // from class: com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1$1$2
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    ck.p.j(exc, "it");
                    c<String> cVar = fVar;
                    Result.a aVar = Result.Companion;
                    cVar.resumeWith(Result.m3458constructorimpl(kotlin.c.a(exc)));
                }
            });
            obj = fVar.a();
            if (obj == sj.a.f()) {
                tj.f.c(this);
            }
            if (obj == objF) {
                return objF;
            }
        }
        return obj;
    }
}
