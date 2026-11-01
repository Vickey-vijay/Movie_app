package yads;

/* JADX INFO: loaded from: classes11.dex */
public abstract class xt implements og2 {
    public abstract boolean a(char c10);

    @Override // yads.og2
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }

    public int a(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        ng2.b(i10, length);
        while (i10 < length) {
            if (!a(charSequence.charAt(i10))) {
                i10++;
            } else {
                return i10;
            }
        }
        return -1;
    }
}
