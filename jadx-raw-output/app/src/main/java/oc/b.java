package oc;

import com.unity3d.scar.adapter.common.GMAEvent;

/* JADX INFO: compiled from: GMAAdsError.java */
/* JADX INFO: loaded from: classes9.dex */
public class b extends l {
    public b(GMAEvent gMAEvent, Object... objArr) {
        super(gMAEvent, null, objArr);
    }

    public static b a(qc.c cVar) {
        String str = String.format("Cannot show ad that is not loaded for placement %s", cVar.c());
        return new b(GMAEvent.AD_NOT_LOADED_ERROR, str, cVar.c(), cVar.d(), str);
    }

    @Override // oc.l
    public String getDomain() {
        return "GMA";
    }

    public b(GMAEvent gMAEvent, String str, Object... objArr) {
        super(gMAEvent, str, objArr);
    }

    public static b b(String str) {
        return new b(GMAEvent.SCAR_UNSUPPORTED, str, new Object[0]);
    }

    public static b c(qc.c cVar, String str) {
        return new b(GMAEvent.INTERNAL_LOAD_ERROR, str, cVar.c(), cVar.d(), str);
    }

    public static b d(qc.c cVar, String str) {
        return new b(GMAEvent.INTERNAL_SHOW_ERROR, str, cVar.c(), cVar.d(), str);
    }

    public static b e(String str) {
        return new b(GMAEvent.INTERNAL_SIGNALS_ERROR, str, str);
    }

    public static b f(String str, String str2, String str3) {
        return new b(GMAEvent.NO_AD_ERROR, str3, str, str2, str3);
    }
}
