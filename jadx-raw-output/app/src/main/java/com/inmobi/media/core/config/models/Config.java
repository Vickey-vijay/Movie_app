package com.inmobi.media.core.config.models;

import androidx.annotation.Keep;
import androidx.core.graphics.drawable.IconCompat;
import ck.p;
import com.inmobi.media.A8;
import com.inmobi.media.AbstractC3029ma;
import com.inmobi.media.T9;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public abstract class Config {
    private T9 includeIds = new T9(false, 1, null);

    @A8
    private long lastUpdateTimeStamp;

    public abstract String getType();

    public abstract boolean isValid();

    public boolean equals(Object obj) {
        return (obj instanceof Config) && p.e(getType(), ((Config) obj).getType());
    }

    public final T9 getIncludeIdParams() {
        return this.includeIds;
    }

    public final T9 getIncludeIds() {
        return this.includeIds;
    }

    public final long getLastUpdateTimeStamp() {
        return this.lastUpdateTimeStamp;
    }

    public final void setIncludeIds(T9 t10) {
        p.j(t10, "<set-?>");
        this.includeIds = t10;
    }

    public final void setLastUpdateTimeStamp(long j10) {
        this.lastUpdateTimeStamp = j10;
    }

    public final JSONObject toJson() {
        p.j(this, IconCompat.EXTRA_OBJ);
        JSONObject jSONObjectA = AbstractC3029ma.a(this, getClass());
        return jSONObjectA == null ? new JSONObject() : jSONObjectA;
    }

    public int hashCode() {
        return getType().hashCode();
    }
}
