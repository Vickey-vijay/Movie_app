package sg.bigo.ads.ad.interstitial.a.a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.b.f;
import sg.bigo.ads.api.core.d;
import sg.bigo.ads.controller.landing.e;
import sg.bigo.ads.core.f.a.p;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:20:0x0048  */
    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0091  */
    /* JADX WARN: Code duplicated, block: B:47:0x009e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00be  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cb  */
    public static d a(@NonNull Context context, @Nullable Activity activity, @NonNull Ad ad2, @NonNull sg.bigo.ads.api.core.b bVar, @Nullable String str, @Nullable p pVar, @Nullable sg.bigo.ads.core.f.a.a.C0736a c0736a, boolean z10) {
        String str2;
        sg.bigo.ads.api.core.b.InterfaceC0698b interfaceC0698bN;
        sg.bigo.ads.ad.c cVar;
        boolean z11;
        String strA = str;
        ArrayList arrayList = new ArrayList();
        String strA2 = c0736a == null ? null : c0736a.f71389a;
        if (bVar instanceof sg.bigo.ads.core.a.a) {
            sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) bVar;
            strA2 = e.a(strA2, aVar.bn(), aVar.bo());
        }
        if (TextUtils.isEmpty(strA2) || strA2.startsWith("http")) {
            if (!URLUtil.isNetworkUrl(strA2)) {
            }
            if (TextUtils.isEmpty(str)) {
                strA = strA2;
            } else {
                if (!strA.startsWith("http")) {
                    arrayList.add(strA);
                } else if (TextUtils.isEmpty(strA2) || !URLUtil.isNetworkUrl(str)) {
                }
                strA = strA2;
            }
            if (pVar == null) {
                str2 = null;
            } else {
                str2 = pVar.f71472m;
            }
            if (!TextUtils.isEmpty(str2)) {
                if (!str2.startsWith("http")) {
                    arrayList.add(str2);
                } else if (TextUtils.isEmpty(strA) && URLUtil.isNetworkUrl(str2)) {
                    strA = str2;
                }
            }
            interfaceC0698bN = bVar.N();
            if (!TextUtils.isEmpty(interfaceC0698bN.b())) {
                arrayList.add(interfaceC0698bN.b());
            }
            if (TextUtils.isEmpty(strA)) {
                strA = interfaceC0698bN.a();
                if (bVar instanceof sg.bigo.ads.core.a.a) {
                    sg.bigo.ads.core.a.a aVar2 = (sg.bigo.ads.core.a.a) bVar;
                    strA = e.a(strA, aVar2.bn(), aVar2.bo());
                }
            }
            if (strA == null) {
                strA = "";
            }
            String str3 = strA;
            if (ad2 instanceof sg.bigo.ads.ad.c) {
                cVar = (sg.bigo.ads.ad.c) ad2;
            } else {
                cVar = null;
            }
            boolean z12 = cVar instanceof f;
            if (z10 || z12) {
                z11 = false;
            } else {
                z11 = true;
            }
            d dVarA = e.a(context, activity, arrayList, str3, interfaceC0698bN.g(), bVar.a(2), interfaceC0698bN.c(), interfaceC0698bN.d(), (sg.bigo.ads.ad.c<?, ?>) cVar, bVar.ar(), z11);
            dVarA.f69365g = str3;
            return dVarA;
        }
        arrayList.add(strA2);
        strA2 = null;
        if (TextUtils.isEmpty(str)) {
            strA = strA2;
        } else {
            if (!strA.startsWith("http")) {
                arrayList.add(strA);
            } else if (TextUtils.isEmpty(strA2)) {
            }
            strA = strA2;
        }
        if (pVar == null) {
            str2 = null;
        } else {
            str2 = pVar.f71472m;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (!str2.startsWith("http")) {
                arrayList.add(str2);
            } else if (TextUtils.isEmpty(strA)) {
                strA = str2;
            }
        }
        interfaceC0698bN = bVar.N();
        if (!TextUtils.isEmpty(interfaceC0698bN.b())) {
            arrayList.add(interfaceC0698bN.b());
        }
        if (TextUtils.isEmpty(strA)) {
            strA = interfaceC0698bN.a();
            if (bVar instanceof sg.bigo.ads.core.a.a) {
                sg.bigo.ads.core.a.a aVar3 = (sg.bigo.ads.core.a.a) bVar;
                strA = e.a(strA, aVar3.bn(), aVar3.bo());
            }
        }
        if (strA == null) {
            strA = "";
        }
        String str4 = strA;
        if (ad2 instanceof sg.bigo.ads.ad.c) {
            cVar = (sg.bigo.ads.ad.c) ad2;
        } else {
            cVar = null;
        }
        boolean z13 = cVar instanceof f;
        if (z10) {
            z11 = false;
        } else {
            z11 = false;
        }
        d dVarA2 = e.a(context, activity, arrayList, str4, interfaceC0698bN.g(), bVar.a(2), interfaceC0698bN.c(), interfaceC0698bN.d(), (sg.bigo.ads.ad.c<?, ?>) cVar, bVar.ar(), z11);
        dVarA2.f69365g = str4;
        return dVarA2;
    }
}
