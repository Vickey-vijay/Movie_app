package com.inmobi.media;

import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoWcdma;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class N2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23186c;

    public N2() {
    }

    public static String a(String str, int i10, int i11, int i12) {
        ck.p.j(str, "mcc");
        return str + "#" + i10 + "#" + i11 + "#" + i12;
    }

    public N2(CellInfo cellInfo, String str, String str2, int i10) {
        ck.p.j(str, "mcc");
        ck.p.j(str2, "mnc");
        if (cellInfo instanceof CellInfoGsm) {
            this.f23186c = i10;
            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
            this.f23185b = cellInfoGsm.getCellSignalStrength().getDbm();
            CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
            ck.p.i(cellIdentity, "getCellIdentity(...)");
            this.f23184a = a(str, str2, cellIdentity.getLac(), cellIdentity.getCid(), -1, Integer.MAX_VALUE);
            return;
        }
        if (cellInfo instanceof CellInfoCdma) {
            this.f23186c = i10;
            CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
            this.f23185b = cellInfoCdma.getCellSignalStrength().getDbm();
            CellIdentityCdma cellIdentity2 = cellInfoCdma.getCellIdentity();
            ck.p.i(cellIdentity2, "getCellIdentity(...)");
            this.f23184a = a(str, cellIdentity2.getSystemId(), cellIdentity2.getNetworkId(), cellIdentity2.getBasestationId());
            return;
        }
        if (cellInfo instanceof CellInfoWcdma) {
            this.f23186c = i10;
            CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
            this.f23185b = cellInfoWcdma.getCellSignalStrength().getDbm();
            CellIdentityWcdma cellIdentity3 = cellInfoWcdma.getCellIdentity();
            ck.p.i(cellIdentity3, "getCellIdentity(...)");
            this.f23184a = a(str, str2, cellIdentity3.getLac(), cellIdentity3.getCid(), cellIdentity3.getPsc(), Integer.MAX_VALUE);
        }
    }

    public static String a(String str, String str2, int i10, int i11, int i12, int i13) {
        ck.p.j(str, "mcc");
        ck.p.j(str2, "mnc");
        return str + "#" + str2 + "#" + i10 + "#" + i11 + "#" + (i12 == -1 ? "" : Integer.valueOf(i12)) + "#" + (i13 != Integer.MAX_VALUE ? Integer.valueOf(i13) : "");
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f23184a);
            int i10 = this.f23185b;
            if (i10 != Integer.MAX_VALUE) {
                jSONObject.put("ss", i10);
            }
            jSONObject.put("nt", this.f23186c);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
