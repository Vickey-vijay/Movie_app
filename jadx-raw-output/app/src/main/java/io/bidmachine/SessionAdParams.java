package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.models.ISessionAdParams;
import io.bidmachine.models.RequestParams;

/* JADX INFO: loaded from: classes3.dex */
public final class SessionAdParams extends RequestParams<SessionAdParams> implements ISessionAdParams<SessionAdParams> {
    private Integer sessionDuration;

    public void clear() {
        this.sessionDuration = null;
    }

    public void fillUserExtension(@NonNull Struct.Builder builder) {
        if (this.sessionDuration != null) {
            builder.putFields("sessionduration", Value.newBuilder().setNumberValue(this.sessionDuration.intValue()).build());
        }
    }

    @Nullable
    public Integer getSessionDuration() {
        return this.sessionDuration;
    }

    @Override // io.bidmachine.models.RequestParams
    public void merge(@NonNull SessionAdParams sessionAdParams) {
        this.sessionDuration = (Integer) Utils.oneOf(this.sessionDuration, sessionAdParams.sessionDuration);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.ISessionAdParams
    @NonNull
    @Deprecated
    public SessionAdParams setClickRate(@Nullable Float f10) {
        Logger.w("The method setClickRate is no longer supported and has no effect.");
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.ISessionAdParams
    @NonNull
    @Deprecated
    public SessionAdParams setCompletionRate(@Nullable Float f10) {
        Logger.w("The method setCompletionRate is no longer supported and has no effect.");
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.ISessionAdParams
    @NonNull
    @Deprecated
    public SessionAdParams setImpressionCount(@Nullable Integer num) {
        Logger.w("The method setImpressionCount is no longer supported and has no effect.");
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.ISessionAdParams
    @NonNull
    @Deprecated
    public SessionAdParams setIsUserClickedOnLastAd(@Nullable Boolean bool) {
        Logger.w("The method setIsUserClickedOnLastAd is no longer supported and has no effect.");
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.ISessionAdParams
    @NonNull
    public SessionAdParams setSessionDuration(@Nullable Integer num) {
        if (num == null || num.intValue() >= 0) {
            this.sessionDuration = num;
        } else {
            Logger.e("session duration shouldn't be negative");
        }
        return this;
    }
}
