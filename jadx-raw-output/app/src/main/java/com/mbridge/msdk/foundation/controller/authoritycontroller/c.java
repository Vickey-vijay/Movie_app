package com.mbridge.msdk.foundation.controller.authoritycontroller;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;

/* JADX INFO: compiled from: SDKAuthorityController.java */
/* JADX INFO: loaded from: classes11.dex */
public class c extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile c f34595j;

    public static void c(boolean z10) {
    }

    public static boolean l() {
        return true;
    }

    public static c m() {
        if (f34595j == null) {
            synchronized (c.class) {
                if (f34595j == null) {
                    f34595j = new c();
                }
            }
        }
        return f34595j;
    }

    @Override // com.mbridge.msdk.foundation.controller.authoritycontroller.b
    public int a(g gVar, String str) {
        if (gVar == null) {
            gVar = h.b().a();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return gVar.u0();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return gVar.t0();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_SERIAL_ID)) {
            return gVar.v0();
        }
        return -1;
    }

    private c() {
        h();
    }

    public boolean c(String str) {
        boolean z10;
        boolean z11;
        g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarD == null) {
            gVarD = h.b().a();
            z10 = true;
        } else {
            z10 = false;
        }
        int iI0 = gVarD.i0();
        if (iI0 != 0 ? !(iI0 != 1 || a(gVarD, str) != 1) : !(a(str) != 1 || a(gVarD, str) != 1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (str.equals(MBridgeConstans.AUTHORITY_OTHER)) {
            if (a(str) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID) && m().e() == 2) {
            if (gVarD.F0() || z10 || a(str) != 1) {
                return false;
            }
            return true;
        }
        return z11;
    }
}
