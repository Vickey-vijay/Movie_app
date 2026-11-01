package com.caverock.androidsvg;

import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ironsource.C3426d4;
import com.ironsource.G5;
import com.safedk.android.utils.SdksMapping;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CSSParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MediaType f13668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Source f13669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13670c;

    public enum AttribOp {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    public enum Combinator {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    public enum MediaType {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        speech,
        tty,
        tv
    }

    public enum PseudoClassIdents {
        target,
        root,
        nth_child,
        nth_last_child,
        nth_of_type,
        nth_last_of_type,
        first_child,
        last_child,
        first_of_type,
        last_of_type,
        only_child,
        only_of_type,
        empty,
        not,
        lang,
        link,
        visited,
        hover,
        active,
        focus,
        enabled,
        disabled,
        checked,
        indeterminate,
        UNSUPPORTED;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Map<String, PseudoClassIdents> f13675b = new HashMap();

        static {
            for (PseudoClassIdents pseudoClassIdents : values()) {
                if (pseudoClassIdents != UNSUPPORTED) {
                    f13675b.put(pseudoClassIdents.name().replace('_', '-'), pseudoClassIdents);
                }
            }
        }

        public static PseudoClassIdents fromString(String str) {
            PseudoClassIdents pseudoClassIdents = f13675b.get(str);
            return pseudoClassIdents != null ? pseudoClassIdents : UNSUPPORTED;
        }
    }

    public enum Source {
        Document,
        RenderOptions
    }

    public static class c extends SVGParser.g {
        public final int C(int i10) {
            if (i10 >= 48 && i10 <= 57) {
                return i10 - 48;
            }
            int i11 = 65;
            if (i10 < 65 || i10 > 70) {
                i11 = 97;
                if (i10 < 97 || i10 > 102) {
                    return -1;
                }
            }
            return (i10 - i11) + 10;
        }

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f13683a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f13684b;

            public a(int i10, int i11) {
                this.f13683a = i10;
                this.f13684b = i11;
            }
        }

        public c(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        public String I() {
            char cCharAt;
            int iC;
            StringBuilder sb2 = new StringBuilder();
            while (!h() && (cCharAt = this.f13932a.charAt(this.f13933b)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !k(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                this.f13933b++;
                if (cCharAt == '\\') {
                    if (!h()) {
                        String str = this.f13932a;
                        int i10 = this.f13933b;
                        this.f13933b = i10 + 1;
                        cCharAt = str.charAt(i10);
                        if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                            int iC2 = C(cCharAt);
                            if (iC2 != -1) {
                                for (int i11 = 1; i11 <= 5 && !h() && (iC = C(this.f13932a.charAt(this.f13933b))) != -1; i11++) {
                                    this.f13933b++;
                                    iC2 = (iC2 * 16) + iC;
                                }
                                sb2.append((char) iC2);
                            }
                        }
                    }
                }
                sb2.append(cCharAt);
            }
            if (sb2.length() == 0) {
                return null;
            }
            return sb2.toString();
        }

        public final void O(o oVar, p pVar) throws CSSParseException {
            d dVar;
            d dVar2;
            String strH = H();
            if (strH == null) {
                throw new CSSParseException("Invalid pseudo class");
            }
            PseudoClassIdents pseudoClassIdentsFromString = PseudoClassIdents.fromString(strH);
            a aVar = null;
            switch (a.f13679b[pseudoClassIdentsFromString.ordinal()]) {
                case 1:
                    d eVar = new e(0, 1, true, false, null);
                    oVar.b();
                    dVar2 = eVar;
                    pVar.b(dVar2);
                    return;
                case 2:
                    d eVar2 = new e(0, 1, false, false, null);
                    oVar.b();
                    dVar2 = eVar2;
                    pVar.b(dVar2);
                    return;
                case 3:
                    d iVar = new i(false, null);
                    oVar.b();
                    dVar2 = iVar;
                    pVar.b(dVar2);
                    return;
                case 4:
                    d eVar3 = new e(0, 1, true, true, pVar.f13702b);
                    oVar.b();
                    dVar2 = eVar3;
                    pVar.b(dVar2);
                    return;
                case 5:
                    d eVar4 = new e(0, 1, false, true, pVar.f13702b);
                    oVar.b();
                    dVar2 = eVar4;
                    pVar.b(dVar2);
                    return;
                case 6:
                    d iVar2 = new i(true, pVar.f13702b);
                    oVar.b();
                    dVar2 = iVar2;
                    pVar.b(dVar2);
                    return;
                case 7:
                    d jVar = new j(aVar);
                    oVar.b();
                    dVar2 = jVar;
                    pVar.b(dVar2);
                    return;
                case 8:
                    d fVar = new f(aVar);
                    oVar.b();
                    dVar2 = fVar;
                    pVar.b(dVar2);
                    return;
                case 9:
                case 10:
                case 11:
                case 12:
                    boolean z10 = pseudoClassIdentsFromString == PseudoClassIdents.nth_child || pseudoClassIdentsFromString == PseudoClassIdents.nth_of_type;
                    boolean z11 = pseudoClassIdentsFromString == PseudoClassIdents.nth_of_type || pseudoClassIdentsFromString == PseudoClassIdents.nth_last_of_type;
                    a aVarD = D();
                    if (aVarD == null) {
                        throw new CSSParseException("Invalid or missing parameter section for pseudo class: " + strH);
                    }
                    d eVar5 = new e(aVarD.f13683a, aVarD.f13684b, z10, z11, pVar.f13702b);
                    oVar.b();
                    dVar = eVar5;
                    dVar2 = dVar;
                    pVar.b(dVar2);
                    return;
                case 13:
                    List<o> listK = K();
                    if (listK == null) {
                        throw new CSSParseException("Invalid or missing parameter section for pseudo class: " + strH);
                    }
                    g gVar = new g(listK);
                    oVar.f13700b = gVar.b();
                    dVar = gVar;
                    dVar2 = dVar;
                    pVar.b(dVar2);
                    return;
                case 14:
                    d kVar = new k(aVar);
                    oVar.b();
                    dVar2 = kVar;
                    pVar.b(dVar2);
                    return;
                case 15:
                    G();
                    d hVar = new h(strH);
                    oVar.b();
                    dVar2 = hVar;
                    pVar.b(dVar2);
                    return;
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    d hVar2 = new h(strH);
                    oVar.b();
                    dVar2 = hVar2;
                    pVar.b(dVar2);
                    return;
                default:
                    throw new CSSParseException("Unsupported pseudo class: " + strH);
            }
        }

        public final a D() throws CSSParseException {
            int i10;
            e0.a aVarC;
            int iD;
            a aVar;
            if (h()) {
                return null;
            }
            int i11 = this.f13933b;
            if (!f('(')) {
                return null;
            }
            A();
            int i12 = 1;
            if (g("odd")) {
                aVar = new a(2, 1);
            } else {
                int iD2 = 0;
                if (g("even")) {
                    aVar = new a(2, 0);
                } else {
                    if (!f('+') && f('-')) {
                        i10 = -1;
                    } else {
                        i10 = 1;
                    }
                    e0.a aVarC2 = e0.a.c(this.f13932a, this.f13933b, this.f13934c, false);
                    if (aVarC2 != null) {
                        this.f13933b = aVarC2.a();
                    }
                    if (!f('n') && !f('N')) {
                        aVarC = aVarC2;
                        aVarC2 = null;
                    } else {
                        if (aVarC2 == null) {
                            aVarC2 = new e0.a(1L, this.f13933b);
                        }
                        A();
                        boolean zF = f('+');
                        if (!zF && (zF = f('-'))) {
                            i12 = -1;
                        }
                        if (zF) {
                            A();
                            aVarC = e0.a.c(this.f13932a, this.f13933b, this.f13934c, false);
                            if (aVarC != null) {
                                this.f13933b = aVarC.a();
                            } else {
                                this.f13933b = i11;
                                return null;
                            }
                        } else {
                            aVarC = null;
                        }
                        int i13 = i12;
                        i12 = i10;
                        i10 = i13;
                    }
                    if (aVarC2 == null) {
                        iD = 0;
                    } else {
                        iD = i12 * aVarC2.d();
                    }
                    if (aVarC != null) {
                        iD2 = i10 * aVarC.d();
                    }
                    aVar = new a(iD, iD2);
                }
            }
            A();
            if (f(')')) {
                return aVar;
            }
            this.f13933b = i11;
            return null;
        }

        public final String E() {
            if (h()) {
                return null;
            }
            String strQ = q();
            if (strQ != null) {
                return strQ;
            }
            return H();
        }

        public String F() {
            int iC;
            if (h()) {
                return null;
            }
            char cCharAt = this.f13932a.charAt(this.f13933b);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            this.f13933b++;
            int iIntValue = l().intValue();
            while (iIntValue != -1 && iIntValue != cCharAt) {
                if (iIntValue == 92) {
                    iIntValue = l().intValue();
                    if (iIntValue != -1) {
                        if (iIntValue != 10 && iIntValue != 13 && iIntValue != 12) {
                            int iC2 = C(iIntValue);
                            if (iC2 != -1) {
                                for (int i10 = 1; i10 <= 5 && (iC = C((iIntValue = l().intValue()))) != -1; i10++) {
                                    iC2 = (iC2 * 16) + iC;
                                }
                                sb2.append((char) iC2);
                            }
                        } else {
                            iIntValue = l().intValue();
                        }
                    }
                }
                sb2.append((char) iIntValue);
                iIntValue = l().intValue();
            }
            return sb2.toString();
        }

        public final List<String> G() throws CSSParseException {
            if (h()) {
                return null;
            }
            int i10 = this.f13933b;
            if (!f('(')) {
                return null;
            }
            A();
            ArrayList arrayList = null;
            do {
                String strH = H();
                if (strH == null) {
                    this.f13933b = i10;
                    return null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strH);
                A();
            } while (z());
            if (f(')')) {
                return arrayList;
            }
            this.f13933b = i10;
            return null;
        }

        public String H() {
            int iP = P();
            int i10 = this.f13933b;
            if (iP == i10) {
                return null;
            }
            String strSubstring = this.f13932a.substring(i10, iP);
            this.f13933b = iP;
            return strSubstring;
        }

        public String J() {
            if (h()) {
                return null;
            }
            int i10 = this.f13933b;
            int iCharAt = this.f13932a.charAt(i10);
            int i11 = i10;
            while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && !j(iCharAt)) {
                if (!k(iCharAt)) {
                    i11 = this.f13933b + 1;
                }
                iCharAt = a();
            }
            if (this.f13933b > i10) {
                return this.f13932a.substring(i10, i11);
            }
            this.f13933b = i10;
            return null;
        }

        public final List<o> K() throws CSSParseException {
            List<p> list;
            List<d> list2;
            if (h()) {
                return null;
            }
            int i10 = this.f13933b;
            if (!f('(')) {
                return null;
            }
            A();
            List<o> listL = L();
            if (listL == null) {
                this.f13933b = i10;
                return null;
            }
            if (!f(')')) {
                this.f13933b = i10;
                return null;
            }
            Iterator<o> it = listL.iterator();
            while (it.hasNext() && (list = it.next().f13699a) != null) {
                Iterator<p> it2 = list.iterator();
                while (it2.hasNext() && (list2 = it2.next().f13704d) != null) {
                    Iterator<d> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (it3.next() instanceof g) {
                            return null;
                        }
                    }
                }
            }
            return listL;
        }

        public final List<o> L() throws CSSParseException {
            a aVar = null;
            if (h()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(1);
            o oVar = new o(aVar);
            while (!h() && M(oVar)) {
                if (z()) {
                    arrayList.add(oVar);
                    oVar = new o(aVar);
                }
            }
            if (!oVar.f()) {
                arrayList.add(oVar);
            }
            return arrayList;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x002d  */
        public boolean M(o oVar) throws CSSParseException {
            Combinator combinator;
            p pVar;
            AttribOp attribOp;
            String strE;
            if (h()) {
                return false;
            }
            int i10 = this.f13933b;
            if (!oVar.f()) {
                if (f('>')) {
                    combinator = Combinator.CHILD;
                    A();
                } else if (f('+')) {
                    combinator = Combinator.FOLLOWS;
                    A();
                } else {
                    combinator = null;
                }
            } else {
                combinator = null;
            }
            if (f('*')) {
                pVar = new p(combinator, null);
            } else {
                String strH = H();
                if (strH != null) {
                    p pVar2 = new p(combinator, strH);
                    oVar.c();
                    pVar = pVar2;
                } else {
                    pVar = null;
                }
            }
            while (!h()) {
                if (f('.')) {
                    if (pVar == null) {
                        pVar = new p(combinator, null);
                    }
                    String strH2 = H();
                    if (strH2 != null) {
                        pVar.a(SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS, AttribOp.EQUALS, strH2);
                        oVar.b();
                    } else {
                        throw new CSSParseException("Invalid \".class\" simpleSelectors");
                    }
                } else if (f('#')) {
                    if (pVar == null) {
                        pVar = new p(combinator, null);
                    }
                    String strH3 = H();
                    if (strH3 != null) {
                        pVar.a("id", AttribOp.EQUALS, strH3);
                        oVar.d();
                    } else {
                        throw new CSSParseException("Invalid \"#id\" simpleSelectors");
                    }
                } else if (f('[')) {
                    if (pVar == null) {
                        pVar = new p(combinator, null);
                    }
                    A();
                    String strH4 = H();
                    if (strH4 != null) {
                        A();
                        if (f(G5.T)) {
                            attribOp = AttribOp.EQUALS;
                        } else if (g("~=")) {
                            attribOp = AttribOp.INCLUDES;
                        } else if (g("|=")) {
                            attribOp = AttribOp.DASHMATCH;
                        } else {
                            attribOp = null;
                        }
                        if (attribOp != null) {
                            A();
                            strE = E();
                            if (strE != null) {
                                A();
                            } else {
                                throw new CSSParseException("Invalid attribute simpleSelectors");
                            }
                        } else {
                            strE = null;
                        }
                        if (f(']')) {
                            if (attribOp == null) {
                                attribOp = AttribOp.EXISTS;
                            }
                            pVar.a(strH4, attribOp, strE);
                            oVar.b();
                        } else {
                            throw new CSSParseException("Invalid attribute simpleSelectors");
                        }
                    } else {
                        throw new CSSParseException("Invalid attribute simpleSelectors");
                    }
                } else {
                    if (!f(':')) {
                        break;
                    }
                    if (pVar == null) {
                        pVar = new p(combinator, null);
                    }
                    O(oVar, pVar);
                }
            }
            if (pVar != null) {
                oVar.a(pVar);
                return true;
            }
            this.f13933b = i10;
            return false;
        }

        public String N() {
            if (h()) {
                return null;
            }
            int i10 = this.f13933b;
            if (!g("url(")) {
                return null;
            }
            A();
            String strF = F();
            if (strF == null) {
                strF = I();
            }
            if (strF == null) {
                this.f13933b = i10;
                return null;
            }
            A();
            if (!h() && !g(")")) {
                this.f13933b = i10;
                return null;
            }
            return strF;
        }

        public final int P() {
            int i10;
            if (h()) {
                return this.f13933b;
            }
            int i11 = this.f13933b;
            int iCharAt = this.f13932a.charAt(i11);
            if (iCharAt == 45) {
                iCharAt = a();
            }
            if ((iCharAt >= 65 && iCharAt <= 90) || ((iCharAt >= 97 && iCharAt <= 122) || iCharAt == 95)) {
                int iA = a();
                while (true) {
                    if ((iA < 65 || iA > 90) && ((iA < 97 || iA > 122) && !((iA >= 48 && iA <= 57) || iA == 45 || iA == 95))) {
                        break;
                    }
                    iA = a();
                }
                i10 = this.f13933b;
            } else {
                i10 = i11;
            }
            this.f13933b = i11;
            return i10;
        }
    }

    public interface d {
        boolean a(m mVar, SVG.j0 j0Var);
    }

    public static class e implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f13687c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f13688d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f13689e;

        @Override // com.caverock.androidsvg.CSSParser.d
        public boolean a(m mVar, SVG.j0 j0Var) {
            int i10;
            int i11;
            String strN = (this.f13688d && this.f13689e == null) ? j0Var.n() : this.f13689e;
            SVG.h0 h0Var = j0Var.f13835b;
            if (h0Var != null) {
                Iterator<SVG.l0> it = h0Var.k().iterator();
                i10 = 0;
                i11 = 0;
                while (it.hasNext()) {
                    SVG.j0 j0Var2 = (SVG.j0) it.next();
                    if (j0Var2 == j0Var) {
                        i10 = i11;
                    }
                    if (strN == null || j0Var2.n().equals(strN)) {
                        i11++;
                    }
                }
            } else {
                i10 = 0;
                i11 = 1;
            }
            int i12 = this.f13687c ? i10 + 1 : i11 - i10;
            int i13 = this.f13685a;
            if (i13 == 0) {
                return i12 == this.f13686b;
            }
            int i14 = this.f13686b;
            if ((i12 - i14) % i13 == 0) {
                return Integer.signum(i12 - i14) == 0 || Integer.signum(i12 - this.f13686b) == Integer.signum(this.f13685a);
            }
            return false;
        }

        public String toString() {
            String str = this.f13687c ? "" : "last-";
            return this.f13688d ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(this.f13685a), Integer.valueOf(this.f13686b), this.f13689e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(this.f13685a), Integer.valueOf(this.f13686b));
        }

        public e(int i10, int i11, boolean z10, boolean z11, String str) {
            this.f13685a = i10;
            this.f13686b = i11;
            this.f13687c = z10;
            this.f13688d = z11;
            this.f13689e = str;
        }
    }

    public static class f implements d {
        public f() {
        }

        public String toString() {
            return "empty";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.caverock.androidsvg.CSSParser.d
        public boolean a(m mVar, SVG.j0 j0Var) {
            return !(j0Var instanceof SVG.h0) || ((SVG.h0) j0Var).k().size() == 0;
        }

        public /* synthetic */ f(a aVar) {
            this();
        }
    }

    public static class g implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<o> f13690a;

        @Override // com.caverock.androidsvg.CSSParser.d
        public boolean a(m mVar, SVG.j0 j0Var) {
            Iterator<o> it = this.f13690a.iterator();
            while (it.hasNext()) {
                if (CSSParser.l(mVar, it.next(), j0Var)) {
                    return false;
                }
            }
            return true;
        }

        public int b() {
            Iterator<o> it = this.f13690a.iterator();
            int i10 = Integer.MIN_VALUE;
            while (it.hasNext()) {
                int i11 = it.next().f13700b;
                if (i11 > i10) {
                    i10 = i11;
                }
            }
            return i10;
        }

        public String toString() {
            return "not(" + this.f13690a + ")";
        }

        public g(List<o> list) {
            this.f13690a = list;
        }
    }

    public static class h implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f13691a;

        @Override // com.caverock.androidsvg.CSSParser.d
        public boolean a(m mVar, SVG.j0 j0Var) {
            return false;
        }

        public String toString() {
            return this.f13691a;
        }

        public h(String str) {
            this.f13691a = str;
        }
    }

    public static class i implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f13692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f13693b;

        @Override // com.caverock.androidsvg.CSSParser.d
        public boolean a(m mVar, SVG.j0 j0Var) {
            int i10;
            String strN = (this.f13692a && this.f13693b == null) ? j0Var.n() : this.f13693b;
            SVG.h0 h0Var = j0Var.f13835b;
            if (h0Var != null) {
                Iterator<SVG.l0> it = h0Var.k().iterator();
                i10 = 0;
                while (it.hasNext()) {
                    SVG.j0 j0Var2 = (SVG.j0) it.next();
                    if (strN == null || j0Var2.n().equals(strN)) {
                        i10++;
                    }
                }
            } else {
                i10 = 1;
            }
            return i10 == 1;
        }

        public String toString() {
            return this.f13692a ? String.format("only-of-type <%s>", this.f13693b) : String.format("only-child", new Object[0]);
        }

        public i(boolean z10, String str) {
            this.f13692a = z10;
            this.f13693b = str;
        }
    }

    public static class j implements d {
        public j() {
        }

        public String toString() {
            return "root";
        }

        @Override // com.caverock.androidsvg.CSSParser.d
        public boolean a(m mVar, SVG.j0 j0Var) {
            return j0Var.f13835b == null;
        }

        public /* synthetic */ j(a aVar) {
            this();
        }
    }

    public static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o f13694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SVG.Style f13695b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Source f13696c;

        public String toString() {
            return String.valueOf(this.f13694a) + " {...} (src=" + this.f13696c + ")";
        }

        public l(o oVar, SVG.Style style, Source source) {
            this.f13694a = oVar;
            this.f13695b = style;
            this.f13696c = source;
        }
    }

    public static class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SVG.j0 f13697a;

        public String toString() {
            SVG.j0 j0Var = this.f13697a;
            return j0Var != null ? String.format("<%s id=\"%s\">", j0Var.n(), this.f13697a.f13823c) : "";
        }
    }

    public static class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<l> f13698a = null;

        public void a(l lVar) {
            if (this.f13698a == null) {
                this.f13698a = new ArrayList();
            }
            for (int i10 = 0; i10 < this.f13698a.size(); i10++) {
                if (this.f13698a.get(i10).f13694a.f13700b > lVar.f13694a.f13700b) {
                    this.f13698a.add(i10, lVar);
                    return;
                }
            }
            this.f13698a.add(lVar);
        }

        public void b(n nVar) {
            if (nVar.f13698a == null) {
                return;
            }
            if (this.f13698a == null) {
                this.f13698a = new ArrayList(nVar.f13698a.size());
            }
            Iterator<l> it = nVar.f13698a.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }

        public List<l> c() {
            return this.f13698a;
        }

        public boolean d() {
            List<l> list = this.f13698a;
            return list == null || list.isEmpty();
        }

        public void e(Source source) {
            List<l> list = this.f13698a;
            if (list == null) {
                return;
            }
            Iterator<l> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().f13696c == source) {
                    it.remove();
                }
            }
        }

        public int f() {
            List<l> list = this.f13698a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public String toString() {
            if (this.f13698a == null) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator<l> it = this.f13698a.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().toString());
                sb2.append('\n');
            }
            return sb2.toString();
        }
    }

    public static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<p> f13699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13700b;

        public o() {
            this.f13699a = null;
            this.f13700b = 0;
        }

        public void a(p pVar) {
            if (this.f13699a == null) {
                this.f13699a = new ArrayList();
            }
            this.f13699a.add(pVar);
        }

        public void b() {
            this.f13700b += 1000;
        }

        public void c() {
            this.f13700b++;
        }

        public void d() {
            this.f13700b += 1000000;
        }

        public p e(int i10) {
            return this.f13699a.get(i10);
        }

        public boolean f() {
            List<p> list = this.f13699a;
            return list == null || list.isEmpty();
        }

        public int g() {
            List<p> list = this.f13699a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            Iterator<p> it = this.f13699a.iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                sb2.append(' ');
            }
            sb2.append('[');
            sb2.append(this.f13700b);
            sb2.append(']');
            return sb2.toString();
        }

        public /* synthetic */ o(a aVar) {
            this();
        }
    }

    public static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Combinator f13701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f13702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<b> f13703c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List<d> f13704d = null;

        public void a(String str, AttribOp attribOp, String str2) {
            if (this.f13703c == null) {
                this.f13703c = new ArrayList();
            }
            this.f13703c.add(new b(str, attribOp, str2));
        }

        public void b(d dVar) {
            if (this.f13704d == null) {
                this.f13704d = new ArrayList();
            }
            this.f13704d.add(dVar);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            Combinator combinator = this.f13701a;
            if (combinator == Combinator.CHILD) {
                sb2.append("> ");
            } else if (combinator == Combinator.FOLLOWS) {
                sb2.append("+ ");
            }
            String str = this.f13702b;
            if (str == null) {
                str = "*";
            }
            sb2.append(str);
            List<b> list = this.f13703c;
            if (list != null) {
                for (b bVar : list) {
                    sb2.append('[');
                    sb2.append(bVar.f13680a);
                    int i10 = a.f13678a[bVar.f13681b.ordinal()];
                    if (i10 == 1) {
                        sb2.append(G5.T);
                        sb2.append(bVar.f13682c);
                    } else if (i10 == 2) {
                        sb2.append("~=");
                        sb2.append(bVar.f13682c);
                    } else if (i10 == 3) {
                        sb2.append("|=");
                        sb2.append(bVar.f13682c);
                    }
                    sb2.append(']');
                }
            }
            List<d> list2 = this.f13704d;
            if (list2 != null) {
                for (d dVar : list2) {
                    sb2.append(':');
                    sb2.append(dVar);
                }
            }
            return sb2.toString();
        }

        public p(Combinator combinator, String str) {
            this.f13701a = null;
            this.f13702b = null;
            this.f13701a = combinator == null ? Combinator.DESCENDANT : combinator;
            this.f13702b = str;
        }
    }

    public CSSParser(Source source) {
        this(MediaType.screen, source);
    }

    public static int a(List<SVG.h0> list, int i10, SVG.j0 j0Var) {
        int i11 = 0;
        if (i10 < 0) {
            return 0;
        }
        SVG.h0 h0Var = list.get(i10);
        SVG.h0 h0Var2 = j0Var.f13835b;
        if (h0Var != h0Var2) {
            return -1;
        }
        Iterator<SVG.l0> it = h0Var2.k().iterator();
        while (it.hasNext()) {
            if (it.next() == j0Var) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public final void o(c cVar) {
        int i10 = 0;
        while (!cVar.h()) {
            int iIntValue = cVar.l().intValue();
            if (iIntValue == 59 && i10 == 0) {
                return;
            }
            if (iIntValue == 123) {
                i10++;
            } else if (iIntValue == 125 && i10 > 0 && (i10 = i10 - 1) == 0) {
                return;
            }
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f13679b;

        static {
            int[] iArr = new int[PseudoClassIdents.values().length];
            f13679b = iArr;
            try {
                iArr[PseudoClassIdents.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13679b[PseudoClassIdents.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13679b[PseudoClassIdents.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13679b[PseudoClassIdents.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13679b[PseudoClassIdents.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13679b[PseudoClassIdents.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13679b[PseudoClassIdents.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13679b[PseudoClassIdents.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13679b[PseudoClassIdents.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13679b[PseudoClassIdents.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13679b[PseudoClassIdents.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13679b[PseudoClassIdents.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f13679b[PseudoClassIdents.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f13679b[PseudoClassIdents.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f13679b[PseudoClassIdents.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f13679b[PseudoClassIdents.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f13679b[PseudoClassIdents.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f13679b[PseudoClassIdents.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f13679b[PseudoClassIdents.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f13679b[PseudoClassIdents.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f13679b[PseudoClassIdents.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f13679b[PseudoClassIdents.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f13679b[PseudoClassIdents.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f13679b[PseudoClassIdents.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr2 = new int[AttribOp.values().length];
            f13678a = iArr2;
            try {
                iArr2[AttribOp.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f13678a[AttribOp.INCLUDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f13678a[AttribOp.DASHMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f13680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AttribOp f13681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f13682c;

        public b(String str, AttribOp attribOp, String str2) {
            this.f13680a = str;
            this.f13681b = attribOp;
            this.f13682c = str2;
        }
    }

    public static class k implements d {
        public k() {
        }

        @Override // com.caverock.androidsvg.CSSParser.d
        public boolean a(m mVar, SVG.j0 j0Var) {
            return mVar != null && j0Var == mVar.f13697a;
        }

        public String toString() {
            return TypedValues.AttributesType.S_TARGET;
        }

        public /* synthetic */ k(a aVar) {
            this();
        }
    }

    public CSSParser(MediaType mediaType, Source source) {
        this.f13670c = false;
        this.f13668a = mediaType;
        this.f13669b = source;
    }

    public static boolean b(String str, MediaType mediaType) {
        c cVar = new c(str);
        cVar.A();
        return c(h(cVar), mediaType);
    }

    public static List<String> f(String str) {
        c cVar = new c(str);
        ArrayList arrayList = null;
        while (!cVar.h()) {
            String strR = cVar.r();
            if (strR != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strR);
                cVar.A();
            }
        }
        return arrayList;
    }

    public static List<MediaType> h(c cVar) {
        String strW;
        ArrayList arrayList = new ArrayList();
        while (!cVar.h() && (strW = cVar.w()) != null) {
            try {
                arrayList.add(MediaType.valueOf(strW));
            } catch (IllegalArgumentException unused) {
            }
            if (!cVar.z()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean l(m mVar, o oVar, SVG.j0 j0Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj = j0Var.f13835b; obj != null; obj = ((SVG.l0) obj).f13835b) {
            arrayList.add(0, obj);
        }
        int size = arrayList.size() - 1;
        return oVar.g() == 1 ? n(mVar, oVar.e(0), arrayList, size, j0Var) : k(mVar, oVar, oVar.g() - 1, arrayList, size, j0Var);
    }

    public static boolean n(m mVar, p pVar, List<SVG.h0> list, int i10, SVG.j0 j0Var) {
        List<String> list2;
        String str = pVar.f13702b;
        if (str != null && !str.equals(j0Var.n().toLowerCase(Locale.US))) {
            return false;
        }
        List<b> list3 = pVar.f13703c;
        if (list3 != null) {
            for (b bVar : list3) {
                String str2 = bVar.f13680a;
                str2.hashCode();
                if (str2.equals("id")) {
                    if (!bVar.f13682c.equals(j0Var.f13823c)) {
                        return false;
                    }
                } else if (!str2.equals(SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS) || (list2 = j0Var.f13827g) == null || !list2.contains(bVar.f13682c)) {
                    return false;
                }
            }
        }
        List<d> list4 = pVar.f13704d;
        if (list4 == null) {
            return true;
        }
        Iterator<d> it = list4.iterator();
        while (it.hasNext()) {
            if (!it.next().a(mVar, j0Var)) {
                return false;
            }
        }
        return true;
    }

    public n d(String str) {
        c cVar = new c(str);
        cVar.A();
        return j(cVar);
    }

    public final SVG.Style g(c cVar) throws CSSParseException {
        SVG.Style style = new SVG.Style();
        do {
            String strH = cVar.H();
            cVar.A();
            if (!cVar.f(':')) {
                throw new CSSParseException("Expected ':'");
            }
            cVar.A();
            String strJ = cVar.J();
            if (strJ == null) {
                throw new CSSParseException("Expected property value");
            }
            cVar.A();
            if (cVar.f('!')) {
                cVar.A();
                if (!cVar.g("important")) {
                    throw new CSSParseException("Malformed rule set: found unexpected '!'");
                }
                cVar.A();
            }
            cVar.f(';');
            SVGParser.S0(style, strH, strJ);
            cVar.A();
            if (cVar.h()) {
                break;
            }
        } while (!cVar.f('}'));
        return style;
    }

    public final n j(c cVar) {
        n nVar = new n();
        while (!cVar.h()) {
            try {
                if (!cVar.g("<!--") && !cVar.g("-->")) {
                    if (!cVar.f('@')) {
                        if (!i(nVar, cVar)) {
                            break;
                        }
                    } else {
                        e(nVar, cVar);
                    }
                }
            } catch (CSSParseException e10) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e10.getMessage());
            }
        }
        return nVar;
    }

    public static boolean c(List<MediaType> list, MediaType mediaType) {
        for (MediaType mediaType2 : list) {
            if (mediaType2 == MediaType.all || mediaType2 == mediaType) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(m mVar, o oVar, int i10, List<SVG.h0> list, int i11, SVG.j0 j0Var) {
        p pVarE = oVar.e(i10);
        if (!n(mVar, pVarE, list, i11, j0Var)) {
            return false;
        }
        Combinator combinator = pVarE.f13701a;
        if (combinator == Combinator.DESCENDANT) {
            if (i10 == 0) {
                return true;
            }
            while (i11 >= 0) {
                if (m(mVar, oVar, i10 - 1, list, i11)) {
                    return true;
                }
                i11--;
            }
            return false;
        }
        if (combinator == Combinator.CHILD) {
            return m(mVar, oVar, i10 - 1, list, i11);
        }
        int iA = a(list, i11, j0Var);
        if (iA <= 0) {
            return false;
        }
        return k(mVar, oVar, i10 - 1, list, i11, (SVG.j0) j0Var.f13835b.k().get(iA - 1));
    }

    public static boolean m(m mVar, o oVar, int i10, List<SVG.h0> list, int i11) {
        p pVarE = oVar.e(i10);
        SVG.j0 j0Var = (SVG.j0) list.get(i11);
        if (!n(mVar, pVarE, list, i11, j0Var)) {
            return false;
        }
        Combinator combinator = pVarE.f13701a;
        if (combinator == Combinator.DESCENDANT) {
            if (i10 == 0) {
                return true;
            }
            while (i11 > 0) {
                i11--;
                if (m(mVar, oVar, i10 - 1, list, i11)) {
                    return true;
                }
            }
            return false;
        }
        if (combinator == Combinator.CHILD) {
            return m(mVar, oVar, i10 - 1, list, i11 - 1);
        }
        int iA = a(list, i11, j0Var);
        if (iA <= 0) {
            return false;
        }
        return k(mVar, oVar, i10 - 1, list, i11, (SVG.j0) j0Var.f13835b.k().get(iA - 1));
    }

    public static void p(String str, Object... objArr) {
        Log.w("CSSParser", String.format(str, objArr));
    }

    public final void e(n nVar, c cVar) throws CSSParseException {
        String strH = cVar.H();
        cVar.A();
        if (strH != null) {
            if (!this.f13670c && strH.equals(C3426d4.i.I0)) {
                List<MediaType> listH = h(cVar);
                if (cVar.f('{')) {
                    cVar.A();
                    if (c(listH, this.f13668a)) {
                        this.f13670c = true;
                        nVar.b(j(cVar));
                        this.f13670c = false;
                    } else {
                        j(cVar);
                    }
                    if (!cVar.h() && !cVar.f('}')) {
                        throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
                    }
                } else {
                    throw new CSSParseException("Invalid @media rule: missing rule set");
                }
            } else if (!this.f13670c && strH.equals("import")) {
                String strN = cVar.N();
                if (strN == null) {
                    strN = cVar.F();
                }
                if (strN != null) {
                    cVar.A();
                    h(cVar);
                    if (!cVar.h() && !cVar.f(';')) {
                        throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
                    }
                    SVG.k();
                } else {
                    throw new CSSParseException("Invalid @import rule: expected string or url()");
                }
            } else {
                p("Ignoring @%s rule", strH);
                o(cVar);
            }
            cVar.A();
            return;
        }
        throw new CSSParseException("Invalid '@' rule");
    }

    public final boolean i(n nVar, c cVar) throws CSSParseException {
        List listL = cVar.L();
        if (listL != null && !listL.isEmpty()) {
            if (cVar.f('{')) {
                cVar.A();
                SVG.Style styleG = g(cVar);
                cVar.A();
                Iterator it = listL.iterator();
                while (it.hasNext()) {
                    nVar.a(new l((o) it.next(), styleG, this.f13669b));
                }
                return true;
            }
            throw new CSSParseException("Malformed rule block: expected '{'");
        }
        return false;
    }
}
