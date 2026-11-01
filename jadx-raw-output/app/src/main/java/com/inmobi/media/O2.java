package com.inmobi.media;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public abstract class O2 {
    public static HashMap a() {
        String networkOperatorName;
        HashMap map = new HashMap();
        Context context = Ji.f22951a;
        if (context == null) {
            return map;
        }
        int cellOperatorFlag = Yi.a().getCellOperatorFlag();
        boolean z10 = (cellOperatorFlag & 2) == 2;
        boolean z11 = (cellOperatorFlag & 1) == 1;
        M2 m10 = new M2();
        Object systemService = context.getSystemService("phone");
        ck.p.h(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        if (!z10) {
            int[] iArrA = a(telephonyManager.getNetworkOperator());
            m10.f23128a = iArrA[0];
            m10.f23129b = iArrA[1];
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (networkCountryIso != null) {
                Locale locale = Locale.ENGLISH;
                ck.p.i(locale, "ENGLISH");
                String lowerCase = networkCountryIso.toLowerCase(locale);
                ck.p.i(lowerCase, "toLowerCase(...)");
                m10.f23132e = lowerCase;
            }
        }
        if (!z11) {
            int[] iArrA2 = a(telephonyManager.getSimOperator());
            m10.f23130c = iArrA2[0];
            m10.f23131d = iArrA2[1];
        }
        String strB = m10.b();
        if (strB != null) {
            map.put("s-ho", strB);
        }
        String strA = m10.a();
        if (strA != null) {
            map.put("s-co", strA);
        }
        String str = m10.f23132e;
        if (str != null) {
            map.put("s-iso", str);
        }
        C3298x5.f25687a.getClass();
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        Object systemService2 = context.getSystemService("phone");
        TelephonyManager telephonyManager2 = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
        if (telephonyManager2 == null || (networkOperatorName = telephonyManager2.getNetworkOperatorName()) == null) {
            networkOperatorName = "";
        }
        map.put("s-cn", networkOperatorName);
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:37:0x009d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca  */
    public static HashMap b() {
        Context context;
        CellLocation cellLocation;
        int networkType;
        int networkType2;
        C3136qh c3136qh = Yi.f23856a;
        N2 n10 = null;
        if ((Ji.b() == null || Yi.a().isConnectedCellTowerEnabled()) && d() && e() && (context = Ji.f22951a) != null) {
            Object systemService = context.getSystemService("phone");
            ck.p.h(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            TelephonyManager telephonyManager = (TelephonyManager) systemService;
            int[] iArrA = a(telephonyManager.getNetworkOperator());
            String strValueOf = String.valueOf(iArrA[0]);
            String strValueOf2 = String.valueOf(iArrA[1]);
            List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
            if (allCellInfo != null) {
                int size = allCellInfo.size();
                CellInfo cellInfo = null;
                for (int i10 = 0; i10 < size; i10++) {
                    cellInfo = allCellInfo.get(i10);
                    if (cellInfo.isRegistered()) {
                        break;
                    }
                }
                if (cellInfo != null) {
                    n10 = new N2(cellInfo, strValueOf, strValueOf2, Build.VERSION.SDK_INT >= 30 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType());
                } else {
                    cellLocation = telephonyManager.getCellLocation();
                    if (cellLocation != null && iArrA[0] != -1) {
                        n10 = new N2();
                        if (cellLocation instanceof CdmaCellLocation) {
                            n10.f23185b = Integer.MAX_VALUE;
                            if (Build.VERSION.SDK_INT >= 30) {
                                networkType2 = telephonyManager.getDataNetworkType();
                            } else {
                                networkType2 = telephonyManager.getNetworkType();
                            }
                            n10.f23186c = networkType2;
                            CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
                            n10.f23184a = N2.a(strValueOf, cdmaCellLocation.getSystemId(), cdmaCellLocation.getNetworkId(), cdmaCellLocation.getBaseStationId());
                        } else {
                            GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                            n10.f23185b = Integer.MAX_VALUE;
                            if (Build.VERSION.SDK_INT >= 30) {
                                networkType = telephonyManager.getDataNetworkType();
                            } else {
                                networkType = telephonyManager.getNetworkType();
                            }
                            n10.f23186c = networkType;
                            n10.f23184a = N2.a(strValueOf, strValueOf2, gsmCellLocation.getLac(), gsmCellLocation.getCid(), gsmCellLocation.getPsc(), Integer.MAX_VALUE);
                        }
                    }
                }
            } else {
                cellLocation = telephonyManager.getCellLocation();
                if (cellLocation != null) {
                    n10 = new N2();
                    if (cellLocation instanceof CdmaCellLocation) {
                        n10.f23185b = Integer.MAX_VALUE;
                        if (Build.VERSION.SDK_INT >= 30) {
                            networkType2 = telephonyManager.getDataNetworkType();
                        } else {
                            networkType2 = telephonyManager.getNetworkType();
                        }
                        n10.f23186c = networkType2;
                        CdmaCellLocation cdmaCellLocation2 = (CdmaCellLocation) cellLocation;
                        n10.f23184a = N2.a(strValueOf, cdmaCellLocation2.getSystemId(), cdmaCellLocation2.getNetworkId(), cdmaCellLocation2.getBaseStationId());
                    } else {
                        GsmCellLocation gsmCellLocation2 = (GsmCellLocation) cellLocation;
                        n10.f23185b = Integer.MAX_VALUE;
                        if (Build.VERSION.SDK_INT >= 30) {
                            networkType = telephonyManager.getDataNetworkType();
                        } else {
                            networkType = telephonyManager.getNetworkType();
                        }
                        n10.f23186c = networkType;
                        n10.f23184a = N2.a(strValueOf, strValueOf2, gsmCellLocation2.getLac(), gsmCellLocation2.getCid(), gsmCellLocation2.getPsc(), Integer.MAX_VALUE);
                    }
                }
            }
        }
        HashMap map = new HashMap();
        if (n10 != null) {
            map.put("c-sc", n10.a().toString());
        }
        return map;
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT < 28) {
            return true;
        }
        Context context = Ji.f22951a;
        Object systemService = context != null ? context.getSystemService("location") : null;
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        return locationManager != null && locationManager.isLocationEnabled();
    }

    public static HashMap c() {
        ArrayList arrayList;
        Context context;
        int networkType;
        if (Ji.d() && d() && e()) {
            C3136qh c3136qh = Yi.f23856a;
            if ((Ji.b() != null && !Yi.a().isVisibleCellTowerEnabled()) || (context = Ji.f22951a) == null) {
                arrayList = new ArrayList();
            } else {
                Object systemService = context.getSystemService("phone");
                ck.p.h(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                TelephonyManager telephonyManager = (TelephonyManager) systemService;
                ArrayList arrayList2 = new ArrayList();
                int[] iArrA = a(telephonyManager.getNetworkOperator());
                String strValueOf = String.valueOf(iArrA[0]);
                String strValueOf2 = String.valueOf(iArrA[1]);
                List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
                if (allCellInfo != null) {
                    for (CellInfo cellInfo : allCellInfo) {
                        if (!cellInfo.isRegistered()) {
                            if (Build.VERSION.SDK_INT >= 30) {
                                networkType = telephonyManager.getDataNetworkType();
                            } else {
                                networkType = telephonyManager.getNetworkType();
                            }
                            arrayList2.add(new N2(cellInfo, strValueOf, strValueOf2, networkType));
                        }
                    }
                }
                arrayList = arrayList2;
            }
        } else {
            arrayList = new ArrayList();
        }
        HashMap map = new HashMap();
        if (!arrayList.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(((N2) arrayList.get(arrayList.size() - 1)).a());
            map.put("v-sc", jSONArray.toString());
        }
        return map;
    }

    public static boolean d() {
        if (!Ji.d()) {
            return false;
        }
        boolean zA = Kf.a(Ji.f22951a, "android.permission.READ_PHONE_STATE");
        boolean zA2 = Kf.a(Ji.f22951a, "android.permission.ACCESS_FINE_LOCATION");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 29) {
            if (!zA2) {
                ck.p.i("O2", "TAG");
            }
            return zA2;
        }
        if (i10 >= 30) {
            if (!zA2 || !zA) {
                ck.p.i("O2", "TAG");
            }
            if (!zA2 || !zA) {
                return false;
            }
            return true;
        }
        boolean zA3 = Kf.a(Ji.f22951a, "android.permission.ACCESS_COARSE_LOCATION");
        if (!zA3 && !zA2) {
            ck.p.i("O2", "TAG");
        }
        if (!zA3 && !zA2) {
            return false;
        }
        return true;
    }

    public static int[] a(String str) {
        int[] iArr = {-1, -1};
        if (str != null && !ck.p.e("", str)) {
            try {
                String strSubstring = str.substring(0, 3);
                ck.p.i(strSubstring, "substring(...)");
                int i10 = Integer.parseInt(strSubstring);
                String strSubstring2 = str.substring(3);
                ck.p.i(strSubstring2, "substring(...)");
                int i11 = Integer.parseInt(strSubstring2);
                iArr[0] = i10;
                iArr[1] = i11;
            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            }
        }
        return iArr;
    }
}
