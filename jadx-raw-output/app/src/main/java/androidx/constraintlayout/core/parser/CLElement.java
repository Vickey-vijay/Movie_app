package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes9.dex */
public class CLElement {
    public static int BASE_INDENT = 2;
    public static int MAX_LINE = 80;
    private int line;
    public CLContainer mContainer;
    private final char[] mContent;
    public long start = -1;
    public long end = Long.MAX_VALUE;

    public void addIndent(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(' ');
        }
    }

    public String toFormattedJSON(int i10, int i11) {
        return "";
    }

    public String toJSON() {
        return "";
    }

    public String content() {
        String str = new String(this.mContent);
        long j10 = this.end;
        if (j10 != Long.MAX_VALUE) {
            long j11 = this.start;
            if (j10 >= j11) {
                return str.substring((int) j11, ((int) j10) + 1);
            }
        }
        long j12 = this.start;
        return str.substring((int) j12, ((int) j12) + 1);
    }

    public CLElement getContainer() {
        return this.mContainer;
    }

    public String getDebugName() {
        if (!CLParser.DEBUG) {
            return "";
        }
        return getStrClass() + " -> ";
    }

    public long getEnd() {
        return this.end;
    }

    public float getFloat() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getFloat();
        }
        return Float.NaN;
    }

    public int getInt() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getInt();
        }
        return 0;
    }

    public int getLine() {
        return this.line;
    }

    public long getStart() {
        return this.start;
    }

    public boolean isDone() {
        return this.end != Long.MAX_VALUE;
    }

    public boolean isStarted() {
        return this.start > -1;
    }

    public boolean notStarted() {
        return this.start == -1;
    }

    public void setContainer(CLContainer cLContainer) {
        this.mContainer = cLContainer;
    }

    public void setEnd(long j10) {
        if (this.end != Long.MAX_VALUE) {
            return;
        }
        this.end = j10;
        if (CLParser.DEBUG) {
            System.out.println("closing " + hashCode() + " -> " + this);
        }
        CLContainer cLContainer = this.mContainer;
        if (cLContainer != null) {
            cLContainer.add(this);
        }
    }

    public void setLine(int i10) {
        this.line = i10;
    }

    public void setStart(long j10) {
        this.start = j10;
    }

    public String toString() {
        long j10 = this.start;
        long j11 = this.end;
        if (j10 > j11 || j11 == Long.MAX_VALUE) {
            return getClass() + " (INVALID, " + this.start + "-" + this.end + ")";
        }
        return getStrClass() + " (" + this.start + " : " + this.end + ") <<" + new String(this.mContent).substring((int) this.start, ((int) this.end) + 1) + ">>";
    }

    public CLElement(char[] cArr) {
        this.mContent = cArr;
    }

    public String getStrClass() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }
}
