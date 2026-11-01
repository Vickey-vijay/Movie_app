package com.bytedance.sdk.openadsdk.multipro.aidl.ouw;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.ICommonPermissionListener;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public class lh extends ouw {
    private static final HashMap<String, RemoteCallbackList<ICommonPermissionListener>> ouw = new HashMap<>();
    private static volatile lh vt;

    public static lh ouw() {
        if (vt == null) {
            synchronized (lh.class) {
                if (vt == null) {
                    vt = new lh();
                }
            }
        }
        return vt;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.ouw.ouw, com.bytedance.sdk.openadsdk.IListenerManager
    public void broadcastPermissionListener(String str, String str2) throws RemoteException {
        ko.vt("MultiProcess", "00000 CommonPermissionListenerManagerImpl broadcastDialogListener: 00000" + str + ", " + str2);
        RemoteCallbackList<ICommonPermissionListener> remoteCallbackListRemove = ouw.remove(str);
        if (remoteCallbackListRemove == null) {
            return;
        }
        int iBeginBroadcast = remoteCallbackListRemove.beginBroadcast();
        for (int i10 = 0; i10 < iBeginBroadcast; i10++) {
            ICommonPermissionListener iCommonPermissionListener = (ICommonPermissionListener) remoteCallbackListRemove.getBroadcastItem(i10);
            if (iCommonPermissionListener != null) {
                ko.vt("MultiProcess", "CommonPermissionListenerManagerImpl broadcastDialogListener: " + str + ", " + str2);
                if (str2 == null) {
                    iCommonPermissionListener.onGranted();
                } else {
                    iCommonPermissionListener.onDenied(str2);
                }
            }
        }
        remoteCallbackListRemove.finishBroadcast();
        remoteCallbackListRemove.kill();
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.ouw.ouw, com.bytedance.sdk.openadsdk.IListenerManager
    public void registerPermissionListener(String str, ICommonPermissionListener iCommonPermissionListener) throws RemoteException {
        if (iCommonPermissionListener == null) {
            return;
        }
        ko.vt("MultiProcess", "CommonPermissionListenerManagerImpl registerPermissionListener");
        RemoteCallbackList<ICommonPermissionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iCommonPermissionListener);
        ouw.put(str, remoteCallbackList);
    }
}
