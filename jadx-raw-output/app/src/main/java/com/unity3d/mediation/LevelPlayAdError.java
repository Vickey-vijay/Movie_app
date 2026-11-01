package com.unity3d.mediation;

import ck.i;
import ck.p;
import com.ironsource.Z7;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.controller.f;

/* JADX INFO: loaded from: classes2.dex */
public final class LevelPlayAdError {
    public static final a Companion = new a(null);
    public static final int ERROR_CODE_INVALID_AD_UNIT_ID = 626;
    public static final int ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK = 625;
    public static final int ERROR_CODE_LOAD_FAILED_ALREADY_CALLED = 627;
    public static final int ERROR_CODE_LOAD_WHILE_SHOW = 629;
    public static final int ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED = 624;
    public static final int ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK = 628;
    public static final int ERROR_CODE_SHOW_WHILE_LOAD = 631;
    public static final int ERROR_CODE_SHOW_WHILE_SHOW = 630;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IronSourceError f45299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f45301c;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    public LevelPlayAdError(IronSourceError ironSourceError, String str, String str2) {
        p.j(str, f.b.f30919c);
        this.f45299a = ironSourceError;
        this.f45300b = str;
        this.f45301c = str2;
    }

    public final String getAdId() {
        return this.f45300b;
    }

    public final String getAdUnitId() {
        return this.f45301c;
    }

    public final int getErrorCode() {
        IronSourceError ironSourceError = this.f45299a;
        if (ironSourceError != null) {
            return ironSourceError.getErrorCode();
        }
        return 0;
    }

    public final String getErrorMessage() {
        IronSourceError ironSourceError = this.f45299a;
        String errorMessage = ironSourceError != null ? ironSourceError.getErrorMessage() : null;
        return errorMessage == null ? "" : errorMessage;
    }

    public String toString() {
        String str = this.f45301c;
        IronSourceError ironSourceError = this.f45299a;
        return "adUnitId: " + str + Z7.f27998r + (ironSourceError != null ? ironSourceError.toString() : null);
    }

    public /* synthetic */ LevelPlayAdError(IronSourceError ironSourceError, String str, String str2, int i10, i iVar) {
        this(ironSourceError, str, (i10 & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdError(String str, String str2, int i10, String str3) {
        this(new IronSourceError(i10, str3), str, str2);
        p.j(str, f.b.f30919c);
        p.j(str2, "adUnitId");
        p.j(str3, "errorMessage");
    }
}
