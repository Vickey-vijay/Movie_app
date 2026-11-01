package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.util.IAlog;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements com.fyber.inneractive.sdk.cache.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15060a = false;

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String a() {
        String str = IAConfigManager.O.f15008c;
        StringBuilder sb2 = new StringBuilder("https://");
        int i10 = k.f15121a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.baseConfigUrl");
        if (TextUtils.isEmpty(property)) {
            sb2.append("cdn2.inner-active.mobi/ia-sdk-config/apps/");
        } else {
            sb2.append(property);
        }
        sb2.append(str);
        sb2.append('/');
        sb2.append(str);
        sb2.append(".json");
        String string = sb2.toString();
        IAlog.d("%s: %s", "APP_CONFIG_REQUEST", string);
        return string;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String b() {
        return "IALastModifiedFromHeader";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String c() {
        return "inneractive.config";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final boolean d() {
        String string = com.fyber.inneractive.sdk.util.o.f18599a.getSharedPreferences("IAConfigurationPreferences", 0).getString("cached.config.appid", null);
        return string != null && string.equalsIgnoreCase(IAConfigManager.O.f15008c);
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final void a(Object obj) {
        h0 h0Var = (h0) obj;
        if (h0Var == null || h0Var.f15112a == null) {
            return;
        }
        com.fyber.inneractive.sdk.util.o.f18599a.getSharedPreferences("IAConfigurationPreferences", 0).edit().putString("cached.config.appid", h0Var.f15112a).apply();
    }

    public final void a(String str, Throwable th2) {
        String strSubstring;
        String name;
        String localizedMessage;
        if (this.f15060a) {
            return;
        }
        this.f15060a = true;
        if (TextUtils.isEmpty(str)) {
            strSubstring = "Empty Json Data";
        } else {
            strSubstring = str.substring(0, str.length() > 501 ? 500 : str.length() - 1);
        }
        if (th2 != null) {
            name = th2.getClass().getName();
            localizedMessage = th2.getLocalizedMessage();
        } else {
            name = "Bad remote configuration";
            localizedMessage = UnityAdsConstants.Messages.MSG_INTERNAL_ERROR;
        }
        String str2 = IAConfigManager.O.f15008c;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.t.FATAL_CONFIGURATION_ERROR);
        if (localizedMessage == null) {
            localizedMessage = "No message";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "EMPTY_APP_ID";
        }
        wVar.a("exception", name, "message", localizedMessage, "data", strSubstring, "appId", str2).a((String) null);
    }

    public static h0 a(com.fyber.inneractive.sdk.config.remote.e eVar) {
        boolean z10;
        Iterator it;
        Iterator it2;
        ArrayList arrayList;
        UnitDisplayType unitDisplayType;
        int i10;
        Set set;
        UnitDisplayType unitDisplayType2;
        String strB;
        com.fyber.inneractive.sdk.config.remote.e eVar2 = eVar;
        h0 h0Var = new h0();
        h0Var.f15114c = eVar2.f15164c;
        com.fyber.inneractive.sdk.config.remote.a aVar = eVar2.f15162a;
        h0Var.f15113b = aVar.f15152b;
        h0Var.f15112a = aVar.f15151a;
        Iterator it3 = eVar2.f15163b.iterator();
        while (it3.hasNext()) {
            com.fyber.inneractive.sdk.config.remote.h hVar = (com.fyber.inneractive.sdk.config.remote.h) it3.next();
            HashMap map = h0Var.f15115d;
            String str = hVar.f15166a;
            com.fyber.inneractive.sdk.config.remote.a aVar2 = eVar2.f15162a;
            HashMap map2 = h0Var.f15116e;
            j0 j0Var = h0Var.f15117f;
            q0 q0Var = new q0();
            int i11 = 2;
            com.fyber.inneractive.sdk.config.remote.c[] cVarArr = {aVar2, hVar};
            int i12 = 0;
            while (true) {
                if (i12 >= i11) {
                    z10 = true;
                    break;
                }
                com.fyber.inneractive.sdk.config.remote.c cVar = cVarArr[i12];
                if (cVar != null && (strB = cVar.b()) != null && strB.equals(com.ironsource.mediationsdk.metadata.a.f29886h)) {
                    z10 = false;
                    break;
                }
                i12++;
                i11 = 2;
            }
            q0Var.f15143b = z10;
            Iterator it4 = hVar.f15172g.iterator();
            while (it4.hasNext()) {
                com.fyber.inneractive.sdk.config.remote.i iVar = (com.fyber.inneractive.sdk.config.remote.i) it4.next();
                r0 r0Var = new r0();
                String str2 = iVar.f15173a;
                if (str2 != null) {
                    String str3 = iVar.f15174b;
                    if (str3 != null) {
                        r0Var.f15144a = str2;
                        r0Var.f15145b = str3;
                        com.fyber.inneractive.sdk.config.remote.b bVar = iVar.f15175c;
                        if (bVar != null) {
                            com.fyber.inneractive.sdk.config.remote.b bVar2 = hVar.f15168c;
                            com.fyber.inneractive.sdk.config.remote.b bVar3 = aVar2.f15155e;
                            l0 l0Var = new l0();
                            it = it3;
                            UnitDisplayType unitDisplayType3 = bVar.f15158a;
                            it2 = it4;
                            if (unitDisplayType3 == UnitDisplayType.BANNER || unitDisplayType3 == UnitDisplayType.MRECT || unitDisplayType3.isFullscreenUnit()) {
                                l0Var.f15131b = bVar.f15158a;
                                Integer num = (Integer) a((Object) null, bVar.f15160c, bVar2 != null ? bVar2.f15160c : null, bVar3 != null ? bVar3.f15160c : null);
                                if (num != null && num.intValue() >= 5 && num.intValue() <= 60) {
                                    l0Var.f15130a = num;
                                }
                                Boolean bool = Boolean.TRUE;
                                Boolean bool2 = (Boolean) a(bool, bVar.f15159b, bVar2 != null ? bVar2.f15159b : null, bVar3 != null ? bVar3.f15159b : null);
                                bool2.getClass();
                                l0Var.f15132c = bool2;
                                Integer num2 = (Integer) a((Object) null, bVar.f15161d, bVar2 != null ? bVar2.f15161d : null, bVar3 != null ? bVar3.f15161d : null);
                                if (num2 != null && num2.intValue() >= 5 && num2.intValue() <= 60) {
                                    l0Var.f15133d = num2;
                                }
                                if (l0Var.f15133d == null && !l0Var.f15132c.booleanValue() && ((unitDisplayType2 = bVar.f15158a) == UnitDisplayType.INTERSTITIAL || unitDisplayType2 == UnitDisplayType.REWARDED)) {
                                    l0Var.f15132c = bool;
                                }
                                r0Var.f15146c = l0Var;
                            } else {
                                it3 = it;
                                it4 = it2;
                            }
                        } else {
                            h0Var = h0Var;
                            it = it3;
                            map = map;
                            str = str;
                            map2 = map2;
                            it2 = it4;
                        }
                        com.fyber.inneractive.sdk.config.remote.j jVar = iVar.f15178f;
                        if (jVar != null || iVar.f15177e != null) {
                            if (jVar != null) {
                                UnitDisplayType unitDisplayType4 = jVar.f15189j;
                                UnitDisplayType unitDisplayType5 = UnitDisplayType.REWARDED;
                                if (unitDisplayType4 == unitDisplayType5 && iVar.f15175c == null) {
                                    l0 l0Var2 = new l0();
                                    r0Var.f15146c = l0Var2;
                                    l0Var2.f15132c = Boolean.FALSE;
                                    l0Var2.f15133d = -1;
                                    l0 l0Var3 = r0Var.f15146c;
                                    l0Var3.f15131b = unitDisplayType5;
                                    l0Var3.f15130a = -1;
                                }
                            }
                            t0 t0Var = new t0();
                            com.fyber.inneractive.sdk.config.remote.j jVar2 = iVar.f15178f;
                            com.fyber.inneractive.sdk.config.remote.j jVar3 = hVar.f15170e;
                            com.fyber.inneractive.sdk.config.remote.j jVar4 = aVar2.f15154d;
                            if (jVar2 != null && ((unitDisplayType = jVar2.f15189j) == UnitDisplayType.LANDSCAPE || unitDisplayType == UnitDisplayType.SQUARE || unitDisplayType == UnitDisplayType.INTERSTITIAL || unitDisplayType == UnitDisplayType.VERTICAL || unitDisplayType == UnitDisplayType.REWARDED || unitDisplayType == UnitDisplayType.MRECT)) {
                                t0Var.f15209j = unitDisplayType;
                            } else {
                                if (iVar.f15177e != null) {
                                    t0Var.f15209j = UnitDisplayType.NATIVE;
                                    r0Var.f15148e = new p0();
                                }
                                it3 = it;
                                it4 = it2;
                                h0Var = h0Var;
                                map = map;
                                str = str;
                                map2 = map2;
                            }
                            Object objA = a((Object) null, jVar2 != null ? jVar2.f15180a : null, jVar3 != null ? jVar3.f15180a : null, jVar4 != null ? jVar4.f15180a : null);
                            if (objA != null) {
                                t0Var.f15200a = (Boolean) objA;
                                t0Var.f15201b = (Integer) a((Object) 5000, jVar2 != null ? jVar2.f15181b : null, jVar3 != null ? jVar3.f15181b : null, jVar4 != null ? jVar4.f15181b : null);
                                Integer num3 = (Integer) a((Object) 0, jVar2 != null ? jVar2.f15182c : null, jVar3 != null ? jVar3.f15182c : null, jVar4 != null ? jVar4.f15182c : null);
                                t0Var.f15202c = Integer.valueOf(num3.intValue() < 0 ? 0 : num3.intValue());
                                t0Var.f15203d = (Boolean) a(Boolean.TRUE, jVar2 != null ? jVar2.f15184e : null, jVar3 != null ? jVar3.f15184e : null, jVar4 != null ? jVar4.f15184e : null);
                                t0Var.f15204e = (Orientation) a(Orientation.USER, jVar2 != null ? jVar2.f15186g : null, jVar3 != null ? jVar3.f15186g : null, jVar4 != null ? jVar4.f15186g : null);
                                Integer num4 = (Integer) a((Object) 0, jVar2 != null ? jVar2.f15188i : null, jVar3 != null ? jVar3.f15188i : null, jVar4 != null ? jVar4.f15188i : null);
                                t0Var.f15205f = Integer.valueOf(num4.intValue() < 0 ? 0 : num4.intValue());
                                Integer num5 = (Integer) a((Object) 2048, jVar2 != null ? jVar2.f15187h : null, jVar3 != null ? jVar3.f15187h : null, jVar4 != null ? jVar4.f15187h : null);
                                if (num5.intValue() > t0Var.f15201b.intValue()) {
                                    num5 = t0Var.f15201b;
                                }
                                t0Var.f15206g = num5;
                                t0Var.f15207h = (Skip) a(Skip._0, jVar2 != null ? jVar2.f15183d : null, jVar3 != null ? jVar3.f15183d : null, jVar4 != null ? jVar4.f15183d : null);
                                t0Var.f15208i = (TapAction) a(TapAction.DO_NOTHING, jVar2 != null ? jVar2.f15185f : null, jVar3 != null ? jVar3.f15185f : null, jVar4 != null ? jVar4.f15185f : null);
                                ArrayList arrayList2 = new ArrayList();
                                com.fyber.inneractive.sdk.config.remote.j jVarA = iVar.a();
                                if (jVarA != null && (arrayList = jVarA.f15190k) != null && arrayList.size() > 0) {
                                    arrayList2 = jVarA.f15190k;
                                }
                                t0Var.f15210k = arrayList2;
                                r0Var.f15149f = t0Var;
                            } else {
                                it3 = it;
                                it4 = it2;
                                h0Var = h0Var;
                                map = map;
                                str = str;
                                map2 = map2;
                            }
                        }
                        o0 o0Var = new o0();
                        HashSet hashSet = new HashSet();
                        com.fyber.inneractive.sdk.config.remote.f fVar = iVar.f15176d;
                        Set set2 = fVar != null ? fVar.f15165a : null;
                        com.fyber.inneractive.sdk.config.remote.f fVar2 = hVar.f15169d;
                        Set set3 = fVar2 != null ? fVar2.f15165a : null;
                        com.fyber.inneractive.sdk.config.remote.f fVar3 = aVar2.f15153c;
                        o0Var.f15139a = (Set) a(hashSet, set2, set3, fVar3 != null ? fVar3.f15165a : null);
                        r0Var.f15147d = o0Var;
                        u0 u0Var = new u0();
                        com.fyber.inneractive.sdk.config.remote.k kVar = iVar.f15179g;
                        com.fyber.inneractive.sdk.config.remote.k kVar2 = hVar.f15171f;
                        com.fyber.inneractive.sdk.config.remote.k kVar3 = aVar2.f15156f;
                        Integer num6 = (Integer) a((Object) 1, kVar != null ? kVar.f15191a : null, kVar2 != null ? kVar2.f15191a : null, kVar3 != null ? kVar3.f15191a : null);
                        if (num6.intValue() <= 0 && num6.intValue() > 100) {
                            u0Var.f15212a = 1;
                        } else {
                            u0Var.f15212a = num6;
                        }
                        Integer num7 = (Integer) a((Object) 0, kVar != null ? kVar.f15192b : null, kVar2 != null ? kVar2.f15192b : null, kVar3 != null ? kVar3.f15192b : null);
                        if (num7.intValue() < 0 && num7.intValue() > 100) {
                            u0Var.f15213b = 0;
                        } else {
                            u0Var.f15213b = num7;
                        }
                        HashSet hashSet2 = new HashSet();
                        Set set4 = kVar != null ? kVar.f15193c : null;
                        Set set5 = kVar2 != null ? kVar2.f15193c : null;
                        if (kVar3 != null) {
                            set = kVar3.f15193c;
                            i10 = 3;
                        } else {
                            i10 = 3;
                            set = null;
                        }
                        Object[] objArr = new Object[i10];
                        objArr[0] = set4;
                        objArr[1] = set5;
                        objArr[2] = set;
                        Set<Vendor> set6 = (Set) a(hashSet2, objArr);
                        u0Var.f15214c = set6;
                        r0Var.f15150g = u0Var;
                        if (j0Var != null && set6 != null) {
                            for (Vendor vendor : set6) {
                                if (vendor != null && !j0Var.f15120a.contains(vendor)) {
                                    j0Var.f15120a.add(vendor);
                                }
                            }
                        }
                        q0Var.f15142a.add(r0Var);
                        HashMap map3 = map2;
                        map3.put(r0Var.f15144a, r0Var);
                        it4 = it2;
                        h0Var = h0Var;
                        map = map;
                        str = str;
                        map2 = map3;
                    }
                } else {
                    it = it3;
                }
                it3 = it;
            }
            map.put(str, q0Var);
            eVar2 = eVar;
        }
        return h0Var;
    }

    public static Object a(Object obj, Object... objArr) {
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                return obj2;
            }
        }
        return obj;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final Object a(String str) {
        try {
            IAConfigManager iAConfigManager = IAConfigManager.O;
            iAConfigManager.D.f();
            com.fyber.inneractive.sdk.config.remote.e eVarA = com.fyber.inneractive.sdk.config.remote.e.a(new JSONObject(str));
            String str2 = iAConfigManager.f15008c;
            if (eVarA != null && str2.equals(eVarA.f15162a.f15151a)) {
                return a(eVarA);
            }
            IAlog.b("internal error while parsing local configuration", new Object[0]);
            if (eVarA != null && !str2.equals(eVarA.f15162a.f15151a)) {
                throw new InvalidAppIdException();
            }
            a(str, (Throwable) null);
            return null;
        } catch (Throwable th2) {
            a(str, th2);
            IAlog.b("Exception Error while parsing local configuration", new Object[0]);
            throw th2;
        }
    }
}
