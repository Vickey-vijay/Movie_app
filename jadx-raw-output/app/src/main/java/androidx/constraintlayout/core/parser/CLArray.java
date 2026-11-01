package androidx.constraintlayout.core.parser;

import com.ironsource.C3426d4;

/* JADX INFO: loaded from: classes9.dex */
public class CLArray extends CLContainer {
    public static CLElement allocate(char[] cArr) {
        return new CLArray(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        String json = toJSON();
        if (i11 > 0 || json.length() + i10 >= CLElement.MAX_LINE) {
            sb2.append("[\n");
            boolean z10 = true;
            for (CLElement cLElement : this.mElements) {
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append(",\n");
                }
                addIndent(sb2, CLElement.BASE_INDENT + i10);
                sb2.append(cLElement.toFormattedJSON(CLElement.BASE_INDENT + i10, i11 - 1));
            }
            sb2.append("\n");
            addIndent(sb2, i10);
            sb2.append(C3426d4.j.f28588e);
        } else {
            sb2.append(json);
        }
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        StringBuilder sb2 = new StringBuilder(getDebugName() + C3426d4.j.f28586d);
        boolean z10 = true;
        for (int i10 = 0; i10 < this.mElements.size(); i10++) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(this.mElements.get(i10).toJSON());
        }
        return ((Object) sb2) + C3426d4.j.f28588e;
    }

    public CLArray(char[] cArr) {
        super(cArr);
    }
}
