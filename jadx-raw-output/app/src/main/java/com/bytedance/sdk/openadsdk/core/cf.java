package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.safedk.android.internal.partials.PangleVideoBridge;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class cf {
    private static final AtomicInteger ouw = new AtomicInteger(0);
    private static final AtomicBoolean vt = new AtomicBoolean(false);

    public static void ouw(String str) {
        AtomicBoolean atomicBoolean = vt;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!com.bytedance.sdk.component.utils.vm.vt(zih.ouw())) {
                atomicBoolean.set(false);
            } else {
                ouw.ouw();
                vt(str);
            }
        }
    }

    public static void vt(final String str) {
        com.bytedance.sdk.openadsdk.utils.bs.lh(new com.bytedance.sdk.component.pno.pno("ipv6") { // from class: com.bytedance.sdk.openadsdk.core.cf.1
            @Override // java.lang.Runnable
            public final void run() {
                final String strZin = com.bytedance.sdk.openadsdk.utils.uoy.zin();
                com.bytedance.sdk.openadsdk.rn.lh.ouw(0, strZin);
                com.bytedance.sdk.openadsdk.vm.lh.ouw(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.cf.1.1
                    @Override // com.bytedance.sdk.openadsdk.vm.yu
                    public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                        ouwVar.f13464lh = "ipv6";
                        return ouwVar;
                    }
                });
                if (TextUtils.isEmpty(strZin)) {
                    com.bytedance.sdk.openadsdk.rn.lh.ouw(-1, strZin, -1, "url is null");
                    com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("ipv6", "", -2, "url is null");
                    com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.cf.1.2
                        @Override // com.bytedance.sdk.openadsdk.vm.yu
                        public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                            com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                            ouwVar.f13464lh = "ipv6";
                            return ouwVar;
                        }
                    });
                    return;
                }
                com.bytedance.sdk.component.ra.vt.yu yuVarOuw = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.ouw();
                try {
                    yuVarOuw.ouw(strZin);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("connect_type", com.bytedance.sdk.component.utils.ksc.ouw(zih.ouw(), 0L));
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("device_id", Long.parseLong(str));
                    }
                    jSONObject.put("header", com.bytedance.sdk.openadsdk.yu.ouw.ouw.ouw().vt());
                    JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new ex(PangleEncryptConstant.CryptDataScene.DUAL_EVENT));
                    if (jSONObjectEncryptType4 != null && jSONObjectEncryptType4.optInt("cypher") == 4) {
                        tc.vt(true);
                        yuVarOuw.vt("x-pgli18n", "4");
                        yuVarOuw.vt("Content-Type", "application/json; charset=utf-8");
                    } else {
                        tc.vt(false);
                    }
                    if (cf.ouw(jSONObjectEncryptType4)) {
                        jSONObject = jSONObjectEncryptType4;
                    }
                    yuVarOuw.vt("Content-Type", "application/json; charset=utf-8");
                    yuVarOuw.vt("User-Agent", com.bytedance.sdk.openadsdk.utils.uoy.fkw());
                    yuVarOuw.ouw(jSONObject);
                    yuVarOuw.f11911ra = 6;
                    yuVarOuw.f11910le = "send_i_p_v6";
                    yuVarOuw.ouw(new com.bytedance.sdk.component.ra.ouw.ouw() { // from class: com.bytedance.sdk.openadsdk.core.cf.1.3
                        @Override // com.bytedance.sdk.component.ra.ouw.ouw
                        public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, IOException iOException) {
                            if (iOException != null) {
                                com.bytedance.sdk.openadsdk.rn.lh.ouw(-1, strZin, 1, iOException.getMessage());
                                com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("ipv6", strZin, -1, iOException.getMessage());
                                com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.cf.1.3.2
                                    @Override // com.bytedance.sdk.openadsdk.vm.yu
                                    public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                                        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                                        ouwVar.f13464lh = "ipv6";
                                        return ouwVar;
                                    }
                                });
                            }
                            cf.ouw();
                        }

                        @Override // com.bytedance.sdk.component.ra.ouw.ouw
                        public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, com.bytedance.sdk.component.ra.vt vtVar) {
                            if (vtVar.pno) {
                                cf.ouw(vtVar.yu, strZin);
                                return;
                            }
                            com.bytedance.sdk.openadsdk.rn.lh.ouw(-1, strZin, vtVar.ouw, vtVar.vt);
                            com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("ipv6", strZin, vtVar.ouw, vtVar.vt);
                            com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.cf.1.3.1
                                @Override // com.bytedance.sdk.openadsdk.vm.yu
                                public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                                    com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                                    ouwVar.f13464lh = "ipv6";
                                    return ouwVar;
                                }
                            });
                            cf.ouw();
                        }
                    });
                } catch (Exception e10) {
                    com.bytedance.sdk.openadsdk.rn.lh.ouw(-1, strZin, -2, e10.getMessage());
                    com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("ipv6", strZin, -3, e10.getMessage());
                    com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.cf.1.4
                        @Override // com.bytedance.sdk.openadsdk.vm.yu
                        public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                            com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                            ouwVar.f13464lh = "ipv6";
                            return ouwVar;
                        }
                    });
                    com.bytedance.sdk.component.utils.qbp.yu("build ipv6 request failed:" + e10.getMessage(), new Object[0]);
                }
            }
        });
    }

    public static /* synthetic */ void vt() {
        ouw.set(0);
    }

    public static class ouw implements com.bytedance.sdk.component.utils.ksc.ouw {
        private static final AtomicBoolean ouw = new AtomicBoolean(false);
        private static volatile long vt = -1;

        private ouw() {
        }

        public static void ouw() {
            if (ouw.compareAndSet(false, true)) {
                vt = System.currentTimeMillis();
                com.bytedance.sdk.component.utils.ksc.ouw(new ouw(), zih.ouw());
            }
        }

        @Override // com.bytedance.sdk.component.utils.ksc.ouw
        public final void ouw(boolean z10, int i10) {
            if (System.currentTimeMillis() - vt >= 2000 && i10 != 0) {
                cf.vt();
                cf.vt(ryl.ouw(zih.ouw()));
                com.bytedance.sdk.component.utils.ksc.ouw(this);
            }
        }
    }

    public static /* synthetic */ boolean ouw(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    public static /* synthetic */ void ouw(String str, String str2) {
        byte b10;
        try {
            JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(str);
            if (jSONObjectJsonObjectInit.optInt("cypher") != 4) {
                com.bytedance.sdk.openadsdk.rn.lh.ouw(-1, str2, 1, "cypher type error");
                com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("ipv6", str2, -4, "cypher type error");
                com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.cf.3
                    @Override // com.bytedance.sdk.openadsdk.vm.yu
                    public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                        ouwVar.f13464lh = "ipv6";
                        return ouwVar;
                    }
                });
                return;
            }
            Pair<Integer, String> pairDecryptType4 = PangleEncryptManager.decryptType4(jSONObjectJsonObjectInit.optString("message"));
            if (pairDecryptType4.second != null) {
                JSONObject jSONObjectJsonObjectInit2 = PangleVideoBridge.jsonObjectInit((String) pairDecryptType4.second);
                String strOptString = jSONObjectJsonObjectInit2.optString("ip_type");
                int iHashCode = strOptString.hashCode();
                if (iHashCode != 3239397) {
                    if (iHashCode != 3239399) {
                        if (iHashCode == 1959784951 && strOptString.equals("invalid")) {
                            b10 = 2;
                        } else {
                            b10 = -1;
                        }
                    } else if (strOptString.equals("ipv6")) {
                        b10 = 0;
                    } else {
                        b10 = -1;
                    }
                } else if (strOptString.equals("ipv4")) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
                if (b10 == 0) {
                    if (jSONObjectJsonObjectInit2.has("ip")) {
                        String strOptString2 = jSONObjectJsonObjectInit2.optString("ip");
                        com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, strOptString2);
                        com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("ttopenadsdk", "key_ipv4");
                        HashMap map = new HashMap();
                        map.put(PglSSConfig.CUSTOMINFO_KEY_IPV6, strOptString2);
                        com.bytedance.sdk.openadsdk.core.tlj.vt unused = com.bytedance.sdk.openadsdk.core.tlj.vt.ouw.ouw;
                        com.bytedance.sdk.openadsdk.core.tlj.vt.ouw(map);
                        com.bytedance.sdk.openadsdk.rn.lh.ouw(1, str2);
                        com.bytedance.sdk.openadsdk.vm.lh.vt(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.cf.5
                            @Override // com.bytedance.sdk.openadsdk.vm.yu
                            public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                                com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                                ouwVar.f13464lh = "ipv6";
                                return ouwVar;
                            }
                        });
                        return;
                    }
                    com.bytedance.sdk.openadsdk.rn.lh.ouw(-1, str2, 4, "no ip");
                    com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("ipv6", str2, -6, "no ip");
                    com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.cf.6
                        @Override // com.bytedance.sdk.openadsdk.vm.yu
                        public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                            com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                            ouwVar.f13464lh = "ipv6";
                            return ouwVar;
                        }
                    });
                    return;
                }
                if (b10 != 1) {
                    if (b10 != 2) {
                        com.bytedance.sdk.openadsdk.rn.lh.ouw(-1, str2, 3, "no ip type ");
                        com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("ipv6", str2, -7, "no ip type ");
                        com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.cf.9
                            @Override // com.bytedance.sdk.openadsdk.vm.yu
                            public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                                com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                                ouwVar.f13464lh = "ipv6";
                                return ouwVar;
                            }
                        });
                        return;
                    }
                    return;
                }
                if (jSONObjectJsonObjectInit2.has("ip")) {
                    com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("ttopenadsdk", "key_ipv4", jSONObjectJsonObjectInit2.optString("ip"));
                    com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6);
                    com.bytedance.sdk.openadsdk.rn.lh.ouw(1, str2);
                    com.bytedance.sdk.openadsdk.vm.lh.vt(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.cf.7
                        @Override // com.bytedance.sdk.openadsdk.vm.yu
                        public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                            com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                            ouwVar.f13464lh = "ipv6";
                            return ouwVar;
                        }
                    });
                    return;
                }
                com.bytedance.sdk.openadsdk.rn.lh.ouw(-1, str2, 4, "no ip");
                com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("ipv6", str2, -6, "no ip");
                com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.cf.8
                    @Override // com.bytedance.sdk.openadsdk.vm.yu
                    public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                        ouwVar.f13464lh = "ipv6";
                        return ouwVar;
                    }
                });
                return;
            }
            int iIntValue = ((Integer) pairDecryptType4.first).intValue();
            com.bytedance.sdk.openadsdk.rn.lh.ouw(-1, str2, 2, "decrypt failed ".concat(String.valueOf(iIntValue)));
            com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("ipv6", str2, -5, "decrypt failed ".concat(String.valueOf(iIntValue)));
            com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.cf.4
                @Override // com.bytedance.sdk.openadsdk.vm.yu
                public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                    com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                    ouwVar.f13464lh = "ipv6";
                    return ouwVar;
                }
            });
        } catch (JSONException unused2) {
            com.bytedance.sdk.openadsdk.rn.lh.ouw(-1, str2, 2, "decrypt failed, wrong data ");
            com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("ipv6", str2, -8, "decrypt failed, wrong data ");
            com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.cf.10
                @Override // com.bytedance.sdk.openadsdk.vm.yu
                public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                    com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                    ouwVar.f13464lh = "ipv6";
                    return ouwVar;
                }
            });
        }
    }

    public static /* synthetic */ void ouw() {
        if (ouw.getAndIncrement() <= 0) {
            com.bytedance.sdk.openadsdk.utils.bs.ouw().schedule(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cf.2
                @Override // java.lang.Runnable
                public final void run() {
                    cf.vt(ryl.ouw(zih.ouw()));
                }
            }, 10000L, TimeUnit.MILLISECONDS);
        }
    }
}
