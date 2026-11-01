package io.bidmachine.models;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface ISessionAdParams<SelfType> {
    @NonNull
    @Deprecated
    SelfType setClickRate(@Nullable @FloatRange(from = 0.0d, to = 100.0d) Float f10);

    @NonNull
    @Deprecated
    SelfType setCompletionRate(@Nullable @FloatRange(from = 0.0d, to = 100.0d) Float f10);

    @NonNull
    @Deprecated
    SelfType setImpressionCount(@IntRange(from = 0) @Nullable Integer num);

    @NonNull
    @Deprecated
    SelfType setIsUserClickedOnLastAd(@Nullable Boolean bool);

    @NonNull
    SelfType setSessionDuration(@IntRange(from = 0) @Nullable Integer num);
}
