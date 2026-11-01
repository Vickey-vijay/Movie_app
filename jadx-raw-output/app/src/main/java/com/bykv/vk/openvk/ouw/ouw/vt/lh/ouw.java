package com.bykv.vk.openvk.ouw.ouw.vt.lh;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ouw implements lh {
    public lh.ra fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public boolean f10464le = false;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public lh.ouw f10465lh;
    public lh.fkw ouw;
    private lh.yu pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private lh.InterfaceC0062lh f10466ra;
    public lh.vt vt;
    public lh.le yu;

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final void ouw(lh.fkw fkwVar) {
        this.ouw = fkwVar;
    }

    public final boolean vt(int i10, int i11) {
        try {
            lh.yu yuVar = this.pno;
            if (yuVar != null) {
                yuVar.ouw(this, i10, i11);
            }
            return false;
        } catch (Throwable th2) {
            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnInfo error: ", th2);
            return false;
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final void ouw(lh.vt vtVar) {
        this.vt = vtVar;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final void ouw(lh.ouw ouwVar) {
        this.f10465lh = ouwVar;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final void ouw(lh.le leVar) {
        this.yu = leVar;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final void ouw(lh.InterfaceC0062lh interfaceC0062lh) {
        this.f10466ra = interfaceC0062lh;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final void ouw(lh.yu yuVar) {
        this.pno = yuVar;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final void ouw(lh.ra raVar) {
        this.fkw = raVar;
    }

    public final void ouw() {
        this.ouw = null;
        this.f10465lh = null;
        this.vt = null;
        this.yu = null;
        this.fkw = null;
        this.f10466ra = null;
        this.pno = null;
    }

    public final boolean ouw(int i10, int i11) {
        try {
            lh.InterfaceC0062lh interfaceC0062lh = this.f10466ra;
            if (interfaceC0062lh == null) {
                return false;
            }
            interfaceC0062lh.ouw(i10, i11);
            return true;
        } catch (Throwable th2) {
            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnError error: ", th2);
            return false;
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final void ouw(boolean z10) {
        this.f10464le = z10;
    }
}
