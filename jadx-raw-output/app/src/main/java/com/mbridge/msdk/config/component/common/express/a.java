package com.mbridge.msdk.config.component.common.express;

import com.applovin.impl.pc;
import com.applovin.impl.qc;
import com.google.android.material.badge.BadgeDrawable;
import com.ironsource.C3426d4;
import com.ironsource.Z7;
import com.mbridge.msdk.config.component.common.express.node.i;
import com.mbridge.msdk.config.component.common.express.node.j;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ExpressionASTParser.java */
/* JADX INFO: loaded from: classes7.dex */
class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, Integer> f32981c = g.a(new Map.Entry[]{f.a("=", 0), f.a("+=", 0), f.a("-=", 0), f.a("*=", 0), f.a("/=", 0), f.a("%=", 0), f.a("or", 1), f.a("OR", 1), f.a("and", 2), f.a("AND", 2), f.a("==", 3), f.a("!=", 3), f.a(">", 4), f.a("<", 4), f.a(">=", 4), f.a("<=", 4), f.a(ScarConstants.IN_SIGNAL_KEY, 4), f.a("IN", 4), f.a(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, 5), f.a("-", 5), f.a("*", 6), f.a("/", 6), f.a("%", 6)});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f32982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32983b;

    private List<String> b(String str) {
        int i10;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        boolean z10 = false;
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '\"') {
                sb2.append(cCharAt);
                z10 = !z10;
            } else if (z10) {
                sb2.append(cCharAt);
            } else if (Character.isWhitespace(cCharAt)) {
                if (sb2.length() > 0) {
                    arrayList.add(sb2.toString());
                    sb2.setLength(0);
                }
            } else if ("().,!><=|&+-*/%{}[]:".indexOf(cCharAt) >= 0) {
                if (sb2.length() > 0) {
                    arrayList.add(sb2.toString());
                    sb2.setLength(0);
                }
                if ((cCharAt == '!' || cCharAt == '=' || cCharAt == '>' || cCharAt == '<' || cCharAt == '+' || cCharAt == '-' || cCharAt == '*' || cCharAt == '/' || cCharAt == '%') && (i10 = i11 + 1) < length && str.charAt(i10) == '=') {
                    arrayList.add(cCharAt + "=");
                    i11 = i10;
                } else {
                    arrayList.add(String.valueOf(cCharAt));
                }
            } else {
                sb2.append(cCharAt);
            }
            i11++;
        }
        if (sb2.length() > 0) {
            arrayList.add(sb2.toString());
        }
        return arrayList;
    }

    public com.mbridge.msdk.config.component.common.express.node.d a(String str) {
        this.f32982a = b(str);
        this.f32983b = 0;
        return b(null, false);
    }

    private com.mbridge.msdk.config.component.common.express.node.d c(com.mbridge.msdk.config.component.common.express.node.d dVar, boolean z10) {
        if (!this.f32982a.get(this.f32983b).equals("(")) {
            return a(dVar, z10);
        }
        this.f32983b++;
        com.mbridge.msdk.config.component.common.express.node.d dVarB = b(dVar, true);
        int i10 = this.f32983b + 1;
        this.f32983b = i10;
        return i10 > this.f32982a.size() - 1 ? dVarB : b(dVarB, false);
    }

    private com.mbridge.msdk.config.component.common.express.node.d a(com.mbridge.msdk.config.component.common.express.node.d dVar, int i10, boolean z10) {
        String str;
        Integer num;
        com.mbridge.msdk.config.component.common.express.node.d cVar;
        com.mbridge.msdk.config.component.common.express.node.d dVarC = c(dVar, z10);
        while (this.f32983b < this.f32982a.size() && (num = f32981c.get((str = this.f32982a.get(this.f32983b)))) != null && num.intValue() >= i10) {
            int i11 = this.f32983b + 1;
            this.f32983b = i11;
            if (i11 > this.f32982a.size() - 1) {
                break;
            }
            com.mbridge.msdk.config.component.common.express.node.d dVarA = a(dVar, num.intValue() + 1, z10);
            if (str.matches("=|\\+=|-=|\\*=|/=|%=")) {
                cVar = new com.mbridge.msdk.config.component.common.express.node.b(str, dVarC, dVarA);
            } else {
                cVar = new com.mbridge.msdk.config.component.common.express.node.c(str, dVarC, dVarA);
            }
            dVarC = cVar;
        }
        return dVarC;
    }

    private com.mbridge.msdk.config.component.common.express.node.d a(com.mbridge.msdk.config.component.common.express.node.d dVar, boolean z10) {
        com.mbridge.msdk.config.component.common.express.node.d jVar;
        com.mbridge.msdk.config.component.common.express.node.e eVar;
        com.mbridge.msdk.config.component.common.express.node.d aVar;
        int i10;
        if (dVar == null) {
            List<String> list = this.f32982a;
            int i11 = this.f32983b;
            this.f32983b = i11 + 1;
            dVar = new i(list.get(i11));
        }
        int i12 = this.f32983b;
        while (this.f32983b < this.f32982a.size()) {
            boolean z11 = true;
            String str = "";
            if (this.f32982a.get(this.f32983b - 1).startsWith("$") && this.f32983b >= i12) {
                while (true) {
                    if (this.f32983b - 1 < this.f32982a.size()) {
                        String str2 = this.f32982a.get(this.f32983b - 1);
                        if (this.f32983b != this.f32982a.size() && (this.f32983b >= this.f32982a.size() || "!><aoiAOI".indexOf(this.f32982a.get(this.f32983b).charAt(0)) < 0)) {
                            String str3 = this.f32982a.get(this.f32983b);
                            if ("!=><+-*%aoiAOI/".indexOf(str3.charAt(0)) >= 0) {
                                break;
                            }
                            if ("{[(.".indexOf(str3.charAt(0)) >= 0) {
                                this.f32983b = i12;
                                i12++;
                            } else {
                                str = str + str2;
                                this.f32983b++;
                            }
                        } else {
                            dVar = new i(str + str2);
                            break;
                        }
                    }
                    z11 = false;
                    break;
                }
                if (z11) {
                    this.f32983b = i12;
                    break;
                }
            } else if (this.f32982a.get(this.f32983b).equals(".")) {
                i12 = this.f32983b;
                int i13 = i12 + 1;
                List<String> list2 = this.f32982a;
                this.f32983b = i13 + 1;
                String str4 = list2.get(i13);
                if (this.f32983b < this.f32982a.size() && this.f32982a.get(this.f32983b).equals("(")) {
                    this.f32983b++;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int i14 = 1;
                    while (this.f32983b < this.f32982a.size() && i14 > 0) {
                        String str5 = this.f32982a.get(this.f32983b);
                        if (str5.equals("(")) {
                            i14++;
                        } else if (str5.equals(")")) {
                            i14--;
                        }
                        if (i14 > 0) {
                            if (str5.equals(StringUtils.COMMA) && i14 == 1) {
                                arrayList.add(new a().a(qc.a(Z7.f27998r, arrayList2)));
                                arrayList2.clear();
                            } else {
                                arrayList2.add(str5);
                            }
                        }
                        this.f32983b++;
                    }
                    if (!arrayList2.isEmpty()) {
                        arrayList.add(new a().a(qc.a(Z7.f27998r, arrayList2)));
                    }
                    eVar = new com.mbridge.msdk.config.component.common.express.node.e(dVar, str4, arrayList);
                    dVar = eVar;
                } else {
                    jVar = new j(dVar, str4);
                    dVar = jVar;
                }
            } else if (!this.f32982a.get(this.f32983b - 1).equals(C3426d4.j.f28586d) && !this.f32982a.get(this.f32983b).equals(C3426d4.j.f28586d)) {
                if (!this.f32982a.get(this.f32983b - 1).equals(h.f44171d) && !this.f32982a.get(this.f32983b).equals(h.f44171d)) {
                    if (this.f32982a.get(this.f32983b).equals(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
                        i12 = this.f32983b;
                        String str6 = this.f32982a.get(i12 - 1);
                        int i15 = this.f32983b + 1;
                        List<String> list3 = this.f32982a;
                        this.f32983b = i15 + 1;
                        jVar = new com.mbridge.msdk.config.component.common.express.node.g(new a().a(pc.a(Z7.f27998r, new CharSequence[]{str6})), new a().a(pc.a(Z7.f27998r, new CharSequence[]{list3.get(i15)})));
                        dVar = jVar;
                    } else {
                        i12 = this.f32983b;
                        String str7 = this.f32982a.get(i12 - 1);
                        if (this.f32983b < this.f32982a.size() && this.f32982a.get(this.f32983b).equals("(")) {
                            i iVar = new i("");
                            this.f32983b++;
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            int i16 = 1;
                            while (this.f32983b < this.f32982a.size() && i16 > 0) {
                                String str8 = this.f32982a.get(this.f32983b);
                                if (str8.equals("(")) {
                                    i16++;
                                } else if (str8.equals(")")) {
                                    i16--;
                                }
                                if (i16 > 0) {
                                    if (str8.equals(StringUtils.COMMA) && i16 == 1) {
                                        arrayList3.add(new a().a(qc.a(Z7.f27998r, arrayList4)));
                                        arrayList4.clear();
                                    } else {
                                        arrayList4.add(str8);
                                    }
                                }
                                this.f32983b++;
                            }
                            if (!arrayList4.isEmpty()) {
                                arrayList3.add(new a().a(qc.a(Z7.f27998r, arrayList4)));
                            }
                            eVar = new com.mbridge.msdk.config.component.common.express.node.e(iVar, str7, arrayList3);
                            dVar = eVar;
                        } else {
                            if (this.f32983b >= this.f32982a.size() || "!=><+-*%aoiAOI/".indexOf(this.f32982a.get(this.f32983b).charAt(0)) >= 0 || (z10 && ")".indexOf(this.f32982a.get(this.f32983b).charAt(0)) >= 0)) {
                                break;
                            }
                            this.f32983b++;
                        }
                    }
                } else {
                    if (this.f32982a.get(this.f32983b).equals(h.f44171d)) {
                        int i17 = this.f32983b;
                        this.f32983b = i17 + 1;
                        i12 = i17;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    int i18 = 1;
                    while (this.f32983b < this.f32982a.size() && i18 > 0) {
                        String str9 = this.f32982a.get(this.f32983b);
                        if (str9.equals(h.f44171d)) {
                            i18++;
                        } else if (str9.equals(h.f44172e)) {
                            i18--;
                        }
                        if (i18 > 0) {
                            if (str9.equals(StringUtils.COMMA) && i18 == 1) {
                                arrayList5.add(new a().a(qc.a(Z7.f27998r, arrayList6)));
                                arrayList6.clear();
                            } else {
                                arrayList6.add(str9);
                            }
                        }
                        this.f32983b++;
                    }
                    if (!arrayList6.isEmpty()) {
                        arrayList5.add(new a().a(qc.a(Z7.f27998r, arrayList6)));
                    }
                    aVar = new com.mbridge.msdk.config.component.common.express.node.h(arrayList5);
                    dVar = aVar;
                }
            } else {
                if (this.f32982a.get(this.f32983b).equals(C3426d4.j.f28586d)) {
                    i12 = this.f32983b;
                    this.f32983b = i12 + 1;
                }
                if (this.f32983b < this.f32982a.size() && this.f32982a.get(this.f32983b).equals("?")) {
                    this.f32983b++;
                    ArrayList arrayList7 = new ArrayList();
                    int i19 = 1;
                    while (this.f32983b < this.f32982a.size() && i19 > 0) {
                        String str10 = this.f32982a.get(this.f32983b);
                        if (str10.equals(C3426d4.j.f28586d)) {
                            i19++;
                        } else if (str10.equals(C3426d4.j.f28588e)) {
                            i19--;
                        }
                        if (i19 > 0) {
                            arrayList7.add(str10);
                        }
                        this.f32983b++;
                    }
                    com.mbridge.msdk.config.component.common.express.node.d dVarA = new a().a(qc.a(Z7.f27998r, arrayList7));
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.add(dVarA);
                    aVar = new com.mbridge.msdk.config.component.common.express.node.e(dVar, "filter", arrayList8);
                } else {
                    ArrayList arrayList9 = new ArrayList();
                    int i20 = this.f32983b;
                    int i21 = i20 - 2;
                    if (i21 >= 0 && ((i20 <= 2 || !this.f32982a.get(i21).equals("(")) && ((i10 = this.f32983b) <= 2 || !f32981c.containsKey(this.f32982a.get(i10 - 2))))) {
                        int i22 = 1;
                        while (this.f32983b < this.f32982a.size() && i22 > 0) {
                            String str11 = this.f32982a.get(this.f32983b);
                            if (str11.equals(C3426d4.j.f28586d)) {
                                i22++;
                            } else if (str11.equals(C3426d4.j.f28588e)) {
                                i22--;
                            }
                            if (i22 > 0) {
                                arrayList9.add(str11);
                            }
                            this.f32983b++;
                        }
                        jVar = new com.mbridge.msdk.config.component.common.express.node.f(dVar, new a().a(qc.a(Z7.f27998r, arrayList9)));
                        dVar = jVar;
                    } else {
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = new ArrayList();
                        int i23 = 1;
                        while (this.f32983b < this.f32982a.size() && i23 > 0) {
                            String str12 = this.f32982a.get(this.f32983b);
                            if (str12.equals(C3426d4.j.f28586d)) {
                                i23++;
                            } else if (str12.equals(C3426d4.j.f28588e)) {
                                i23--;
                            }
                            if (i23 > 0) {
                                if (str12.equals(StringUtils.COMMA) && i23 == 1) {
                                    arrayList10.add(new a().a(qc.a(Z7.f27998r, arrayList11)));
                                    arrayList11.clear();
                                } else {
                                    arrayList11.add(str12);
                                }
                            }
                            this.f32983b++;
                        }
                        if (!arrayList11.isEmpty()) {
                            arrayList10.add(new a().a(qc.a(Z7.f27998r, arrayList11)));
                        }
                        aVar = new com.mbridge.msdk.config.component.common.express.node.a(arrayList10);
                    }
                }
                dVar = aVar;
            }
        }
        return dVar;
    }

    private com.mbridge.msdk.config.component.common.express.node.d b(com.mbridge.msdk.config.component.common.express.node.d dVar, boolean z10) {
        return a(dVar, 0, z10);
    }
}
