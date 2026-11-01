package io.bidmachine.media3.exoplayer.analytics;

import android.media.metrics.LogSessionId;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
@UnstableApi
public final class PlayerId {
    public static final PlayerId UNSET;

    @Nullable
    private final Object equalityToken;

    @Nullable
    private final a logSessionIdApi31;
    public final String name;

    public PlayerId(String str) {
        Assertions.checkState(Util.SDK_INT < 31);
        this.name = str;
        this.logSessionIdApi31 = null;
        this.equalityToken = new Object();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerId)) {
            return false;
        }
        PlayerId playerId = (PlayerId) obj;
        return Objects.equals(this.name, playerId.name) && Objects.equals(this.logSessionIdApi31, playerId.logSessionIdApi31) && Objects.equals(this.equalityToken, playerId.equalityToken);
    }

    public int hashCode() {
        return Objects.hash(this.name, this.logSessionIdApi31, this.equalityToken);
    }

    @RequiresApi(31)
    public static final class a {
        public static final a UNSET = new a(LogSessionId.LOG_SESSION_ID_NONE);
        public final LogSessionId logSessionId;

        public a(LogSessionId logSessionId) {
            this.logSessionId = logSessionId;
        }
    }

    static {
        UNSET = Util.SDK_INT < 31 ? new PlayerId("") : new PlayerId(a.UNSET, "");
    }

    @RequiresApi(31)
    public LogSessionId getLogSessionId() {
        return ((a) Assertions.checkNotNull(this.logSessionIdApi31)).logSessionId;
    }

    @RequiresApi(31)
    public PlayerId(LogSessionId logSessionId, String str) {
        this(new a(logSessionId), str);
    }

    private PlayerId(a aVar, String str) {
        this.logSessionIdApi31 = aVar;
        this.name = str;
        this.equalityToken = new Object();
    }
}
