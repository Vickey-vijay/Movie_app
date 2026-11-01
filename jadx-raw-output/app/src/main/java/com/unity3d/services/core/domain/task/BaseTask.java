package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.task.BaseParams;
import kotlin.Result;
import rj.c;
import sj.a;

/* JADX INFO: compiled from: BaseTask.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface BaseTask<P extends BaseParams, R> extends IServiceComponent {

    /* JADX INFO: compiled from: BaseTask.kt */
    public static final class DefaultImpls {
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
        public static <P extends BaseParams, R> Object m3178invokegIAlus(BaseTask<? super P, R> baseTask, P p10, c<? super Result<? extends R>> cVar) throws Throwable {
            BaseTask$invoke$1 baseTask$invoke$1;
            if (cVar instanceof BaseTask$invoke$1) {
                baseTask$invoke$1 = (BaseTask$invoke$1) cVar;
                int i10 = baseTask$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    baseTask$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    baseTask$invoke$1 = new BaseTask$invoke$1(cVar);
                }
            } else {
                baseTask$invoke$1 = new BaseTask$invoke$1(cVar);
            }
            Object obj = baseTask$invoke$1.result;
            Object objF = a.f();
            int i11 = baseTask$invoke$1.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                return ((Result) obj).m3466unboximpl();
            }
            kotlin.c.b(obj);
            baseTask$invoke$1.label = 1;
            Object objMo3176doWorkgIAlus = baseTask.mo3176doWorkgIAlus(p10, baseTask$invoke$1);
            return objMo3176doWorkgIAlus == objF ? objF : objMo3176doWorkgIAlus;
        }

        public static <P extends BaseParams, R> IServiceProvider getServiceProvider(BaseTask<? super P, R> baseTask) {
            return IServiceComponent.DefaultImpls.getServiceProvider(baseTask);
        }
    }

    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name */
    Object mo3176doWorkgIAlus(P p10, c<? super Result<? extends R>> cVar);

    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    Object mo3177invokegIAlus(P p10, c<? super Result<? extends R>> cVar);
}
