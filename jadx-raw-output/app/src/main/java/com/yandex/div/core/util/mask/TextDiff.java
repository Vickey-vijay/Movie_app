package com.yandex.div.core.util.mask;

import ck.i;

/* JADX INFO: compiled from: TextDiff.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class TextDiff {
    public static final Companion Companion = new Companion(null);
    private final int added;
    private final int removed;
    private final int start;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextDiff)) {
            return false;
        }
        TextDiff textDiff = (TextDiff) obj;
        return this.start == textDiff.start && this.added == textDiff.added && this.removed == textDiff.removed;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.start) * 31) + Integer.hashCode(this.added)) * 31) + Integer.hashCode(this.removed);
    }

    public String toString() {
        return "TextDiff(start=" + this.start + ", added=" + this.added + ", removed=" + this.removed + ')';
    }

    /* JADX INFO: compiled from: TextDiff.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final TextDiff build(String str, String str2) {
            if (str.length() > str2.length()) {
                TextDiff textDiffBuild = build(str2, str);
                return new TextDiff(textDiffBuild.getStart(), textDiffBuild.getRemoved(), textDiffBuild.getAdded());
            }
            int i10 = 0;
            int length = str2.length() - 1;
            int length2 = str2.length() - str.length();
            while (i10 < length && i10 < str.length() && str.charAt(i10) == str2.charAt(i10)) {
                i10++;
            }
            while (true) {
                int i11 = length - length2;
                if (i11 < i10 || str.charAt(i11) != str2.charAt(length)) {
                    break;
                }
                length--;
            }
            int i12 = (length + 1) - i10;
            return new TextDiff(i10, i12, i12 - length2);
        }
    }

    public final int getAdded() {
        return this.added;
    }

    public final int getRemoved() {
        return this.removed;
    }

    public final int getStart() {
        return this.start;
    }

    public TextDiff(int i10, int i11, int i12) {
        this.start = i10;
        this.added = i11;
        this.removed = i12;
    }
}
