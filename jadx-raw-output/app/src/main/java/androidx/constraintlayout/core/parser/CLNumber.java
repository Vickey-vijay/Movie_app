package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes2.dex */
public class CLNumber extends CLElement {
    public float value;

    public CLNumber(char[] cArr) {
        super(cArr);
        this.value = Float.NaN;
    }

    public static CLElement allocate(char[] cArr) {
        return new CLNumber(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public float getFloat() {
        if (Float.isNaN(this.value)) {
            this.value = Float.parseFloat(content());
        }
        return this.value;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int getInt() {
        if (Float.isNaN(this.value)) {
            this.value = Integer.parseInt(content());
        }
        return (int) this.value;
    }

    public void putValue(float f10) {
        this.value = f10;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        addIndent(sb2, i10);
        float f10 = getFloat();
        int i12 = (int) f10;
        if (i12 == f10) {
            sb2.append(i12);
        } else {
            sb2.append(f10);
        }
        return sb2.toString();
    }

    public CLNumber(float f10) {
        super(null);
        this.value = f10;
    }

    public boolean isInt() {
        float f10 = getFloat();
        if (((int) f10) == f10) {
            return true;
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        float f10 = getFloat();
        int i10 = (int) f10;
        if (i10 == f10) {
            return "" + i10;
        }
        return "" + f10;
    }
}
