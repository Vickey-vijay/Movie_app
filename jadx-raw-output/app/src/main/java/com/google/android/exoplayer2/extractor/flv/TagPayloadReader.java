package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import g5.t;
import q3.u;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TagPayloadReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f19179a;

    public abstract boolean b(t tVar) throws ParserException;

    public abstract boolean c(t tVar, long j10) throws ParserException;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str);
        }
    }

    public TagPayloadReader(u uVar) {
        this.f19179a = uVar;
    }

    public final boolean a(t tVar, long j10) throws ParserException {
        if (b(tVar) && c(tVar, j10)) {
            return true;
        }
        return false;
    }
}
