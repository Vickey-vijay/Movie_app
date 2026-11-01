package com.unity3d.ads.core.data.model;

/* JADX INFO: compiled from: TokenCounters.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class TokenCounters {
    private int seq;
    private int starts;
    private int wins;

    public static /* synthetic */ TokenCounters copy$default(TokenCounters tokenCounters, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = tokenCounters.seq;
        }
        if ((i13 & 2) != 0) {
            i11 = tokenCounters.wins;
        }
        if ((i13 & 4) != 0) {
            i12 = tokenCounters.starts;
        }
        return tokenCounters.copy(i10, i11, i12);
    }

    public final int component1() {
        return this.seq;
    }

    public final int component2() {
        return this.wins;
    }

    public final int component3() {
        return this.starts;
    }

    public final TokenCounters copy(int i10, int i11, int i12) {
        return new TokenCounters(i10, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenCounters)) {
            return false;
        }
        TokenCounters tokenCounters = (TokenCounters) obj;
        return this.seq == tokenCounters.seq && this.wins == tokenCounters.wins && this.starts == tokenCounters.starts;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.seq) * 31) + Integer.hashCode(this.wins)) * 31) + Integer.hashCode(this.starts);
    }

    public String toString() {
        return "TokenCounters(seq=" + this.seq + ", wins=" + this.wins + ", starts=" + this.starts + ')';
    }

    public final int getSeq() {
        return this.seq;
    }

    public final int getStarts() {
        return this.starts;
    }

    public final int getWins() {
        return this.wins;
    }

    public final void setSeq(int i10) {
        this.seq = i10;
    }

    public final void setStarts(int i10) {
        this.starts = i10;
    }

    public final void setWins(int i10) {
        this.wins = i10;
    }

    public TokenCounters(int i10, int i11, int i12) {
        this.seq = i10;
        this.wins = i11;
        this.starts = i12;
    }
}
