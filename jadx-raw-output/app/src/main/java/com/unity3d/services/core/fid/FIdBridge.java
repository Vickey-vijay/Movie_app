package com.unity3d.services.core.fid;

import ck.p;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.C3605n2;
import com.unity3d.services.core.reflection.GenericBridge;
import kotlin.Pair;
import nj.l0;

/* JADX INFO: compiled from: FIdBridge.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FIdBridge extends GenericBridge {
    private final Object instance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FIdBridge(Object obj) {
        super(l0.g(new Pair(Constants.GET_APP_INSTANCE_ID, new Class[0])), false);
        p.j(obj, C3605n2.f30210p);
        this.instance = obj;
    }

    public final Task<String> getAppInstanceId() {
        Task<String> task = (Task) callNonVoidMethod(Constants.GET_APP_INSTANCE_ID, this.instance, new Object[0]);
        if (task != null) {
            return task;
        }
        Task<String> taskForResult = Tasks.forResult(null);
        p.i(taskForResult, "forResult(null)");
        return taskForResult;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return Constants.Companion.getClassName();
    }
}
