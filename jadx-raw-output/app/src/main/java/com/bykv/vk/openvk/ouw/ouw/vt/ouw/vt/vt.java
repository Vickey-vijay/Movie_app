package com.bykv.vk.openvk.ouw.ouw.vt.ouw.vt;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class vt {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public File f10495lh;
    public com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private Context f10496ra;
    public File yu;
    public volatile boolean vt = false;
    public final List<com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw> fkw = new ArrayList();

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public volatile boolean f10494le = false;

    public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar, int i10) {
        synchronized (com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw.class) {
            for (com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw interfaceC0059ouw : this.fkw) {
                if (interfaceC0059ouw != null) {
                    interfaceC0059ouw.ouw(lhVar, i10);
                }
            }
        }
    }

    public vt(Context context, com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar) {
        this.f10495lh = null;
        this.yu = null;
        this.f10496ra = context;
        this.ouw = lhVar;
        this.f10495lh = com.bykv.vk.openvk.ouw.ouw.vt.yu.vt.ouw(lhVar.f10446lh, lhVar.bly());
        this.yu = com.bykv.vk.openvk.ouw.ouw.vt.yu.vt.vt(lhVar.f10446lh, lhVar.bly());
    }

    public static /* synthetic */ void ouw(vt vtVar, com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar, int i10, String str) {
        synchronized (com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw.class) {
            for (com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw interfaceC0059ouw : vtVar.fkw) {
                if (interfaceC0059ouw != null) {
                    interfaceC0059ouw.ouw(lhVar, i10, str);
                }
            }
        }
    }

    public static /* synthetic */ void ouw(vt vtVar, com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar, int i10) {
        synchronized (com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw.class) {
            for (com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw interfaceC0059ouw : vtVar.fkw) {
                if (interfaceC0059ouw != null) {
                    interfaceC0059ouw.vt(lhVar, i10);
                }
            }
        }
    }

    public static /* synthetic */ void ouw(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }
}
