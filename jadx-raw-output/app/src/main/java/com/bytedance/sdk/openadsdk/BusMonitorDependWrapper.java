package com.bytedance.sdk.openadsdk;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.openadsdk.vm.vt;
import com.bytedance.sdk.openadsdk.vm.vt.ouw;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class BusMonitorDependWrapper implements vt {
    private vt ouw;
    private Handler vt;

    public static Context getReflectContext() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, new Object[0]);
            return (Application) objInvoke.getClass().getMethod("getApplication", new Class[0]).invoke(objInvoke, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.vm.vt
    public Context getContext() {
        vt vtVar = this.ouw;
        return (vtVar == null || vtVar.getContext() == null) ? getReflectContext() : this.ouw.getContext();
    }

    @Override // com.bytedance.sdk.openadsdk.vm.vt
    public Handler getHandler() {
        vt vtVar = this.ouw;
        if (vtVar != null && vtVar.getHandler() != null) {
            return this.ouw.getHandler();
        }
        if (this.vt == null) {
            this.vt = new Handler(getSafeHandlerThread("pag_monitor", 0).getLooper());
        }
        return this.vt;
    }

    @Override // com.bytedance.sdk.openadsdk.vm.vt
    public int getOnceLogCount() {
        vt vtVar = this.ouw;
        if (vtVar != null) {
            return vtVar.getOnceLogCount();
        }
        return 20;
    }

    @Override // com.bytedance.sdk.openadsdk.vm.vt
    public int getOnceLogInterval() {
        vt vtVar = this.ouw;
        if (vtVar != null) {
            return vtVar.getOnceLogInterval();
        }
        return 1000;
    }

    @Override // com.bytedance.sdk.openadsdk.vm.vt
    public HandlerThread getSafeHandlerThread(String str, int i10) {
        HandlerThread safeHandlerThread;
        vt vtVar = this.ouw;
        if (vtVar != null && (safeHandlerThread = vtVar.getSafeHandlerThread(str, i10)) != null) {
            return safeHandlerThread;
        }
        HandlerThread handlerThread = new HandlerThread("pag_monitor");
        handlerThread.start();
        return handlerThread;
    }

    @Override // com.bytedance.sdk.openadsdk.vm.vt
    public int getUploadIntervalTime() {
        int uploadIntervalTime;
        vt vtVar = this.ouw;
        return (vtVar == null || (uploadIntervalTime = vtVar.getUploadIntervalTime()) < 3600000) ? BrandSafetyUtils.f43544g : uploadIntervalTime;
    }

    @Override // com.bytedance.sdk.openadsdk.vm.vt
    public boolean isMonitorOpen() {
        vt vtVar = this.ouw;
        if (vtVar != null) {
            return vtVar.isMonitorOpen();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.vm.vt
    public void onMonitorUpload(List<ouw> list) {
        vt vtVar = this.ouw;
        if (vtVar != null) {
            vtVar.onMonitorUpload(list);
        }
    }

    public BusMonitorDependWrapper(vt vtVar) {
        this.ouw = vtVar;
    }
}
