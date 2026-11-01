package com.unity3d.services.core.device;

import ck.i;
import ck.p;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import lk.c;
import mj.r;
import nj.b0;
import nj.s;
import org.json.JSONObject;
import qk.l;
import qk.v;

/* JADX INFO: compiled from: Storage.kt */
/* JADX INFO: loaded from: classes7.dex */
public class Storage extends JsonStorage {
    public static final Companion Companion = new Companion(null);
    private static final l<List<bk.l<StorageEventInfo, r>>> onStorageEventCallbacks = v.a(s.k());
    private final String _targetFileName;
    private final StorageManager.StorageType type;

    /* JADX INFO: compiled from: Storage.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final void addStorageEventCallback(bk.l<? super StorageEventInfo, r> lVar) {
            Object value;
            p.j(lVar, "callback");
            l lVar2 = Storage.onStorageEventCallbacks;
            do {
                value = lVar2.getValue();
            } while (!lVar2.a(value, b0.z0((List) value, lVar)));
        }

        public final void removeStorageEventCallback(bk.l<? super StorageEventInfo, r> lVar) {
            Object value;
            p.j(lVar, "callback");
            l lVar2 = Storage.onStorageEventCallbacks;
            do {
                value = lVar2.getValue();
            } while (!lVar2.a(value, b0.w0((List) value, lVar)));
        }
    }

    public synchronized boolean clearStorage() {
        clearData();
        return new File(this._targetFileName).delete();
    }

    public final synchronized boolean initStorage() {
        readStorage();
        super.initData();
        return true;
    }

    public synchronized boolean readStorage() {
        boolean z10 = true;
        try {
            try {
                byte[] fileBytes = Utilities.readFileBytes(new File(this._targetFileName));
                if (fileBytes == null) {
                    return false;
                }
                setData(new JSONObject(new String(fileBytes, c.f63591b)));
            } catch (FileNotFoundException e10) {
                DeviceLog.debug("Storage JSON file not found in local cache:", e10);
                z10 = false;
            }
        } catch (Exception e11) {
            DeviceLog.debug("Failed to read storage JSON file:", e11);
            z10 = false;
        }
        return z10;
    }

    public final synchronized void sendEvent(StorageEvent storageEvent, Object obj) {
        List<bk.l<StorageEventInfo, r>> value = onStorageEventCallbacks.getValue();
        if (!(!value.isEmpty())) {
            if (!(WebViewApp.getCurrentApp() != null ? WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.STORAGE, storageEvent, this.type.name(), obj) : false)) {
                DeviceLog.debug("Couldn't send storage event to WebApp");
            }
            return;
        }
        p.g(storageEvent);
        StorageEventInfo storageEventInfo = new StorageEventInfo(storageEvent, this.type, obj);
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            ((bk.l) it.next()).invoke(storageEventInfo);
        }
    }

    public final synchronized boolean storageFileExists() {
        return new File(this._targetFileName).exists();
    }

    public synchronized boolean writeStorage() {
        File file = new File(this._targetFileName);
        if (getData() == null) {
            return false;
        }
        return Utilities.writeFile(file, getData().toString());
    }

    public Storage(String str, StorageManager.StorageType storageType) {
        p.j(str, "_targetFileName");
        p.j(storageType, "type");
        this._targetFileName = str;
        this.type = storageType;
    }

    public final StorageManager.StorageType getType() {
        return this.type;
    }
}
