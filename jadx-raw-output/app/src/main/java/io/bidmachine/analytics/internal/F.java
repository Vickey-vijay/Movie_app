package io.bidmachine.analytics.internal;

import com.applovin.sdk.AppLovinEventTypes;
import java.text.ParseException;
import kotlin.Metadata;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0002\u0005\u000bB\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lio/bidmachine/analytics/internal/F;", "", "", "line", "Lio/bidmachine/analytics/internal/F$b;", "a", "(Ljava/lang/String;)Lio/bidmachine/analytics/internal/F$b;", "Lkotlin/text/Regex;", "Lkotlin/text/Regex;", "lineRegex", "Lio/bidmachine/analytics/internal/N;", "b", "Lio/bidmachine/analytics/internal/N;", "timestampParser", "<init>", "()V", "c", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Regex lineRegex = new Regex("^(\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}\\.\\d{3}) ([A-Z])\\/(\\S+)\\(\\s*(\\d+)\\): (.*)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final N timestampParser = new N();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\r\u0010\u0004R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u001a"}, d2 = {"Lio/bidmachine/analytics/internal/F$b;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "a", "J", "d", "()J", "timestamp", "b", "Ljava/lang/String;", "c", "tag", AppLovinEventTypes.USER_COMPLETED_LEVEL, "message", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long timestamp;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String tag;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String level;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String message;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.timestamp == bVar.timestamp && ck.p.e(this.tag, bVar.tag) && ck.p.e(this.level, bVar.level) && ck.p.e(this.message, bVar.message);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLevel() {
            return this.level;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return (((((Long.hashCode(this.timestamp) * 31) + this.tag.hashCode()) * 31) + this.level.hashCode()) * 31) + this.message.hashCode();
        }

        public b(long j10, String str, String str2, String str3) {
            this.timestamp = j10;
            this.tag = str;
            this.level = str2;
            this.message = str3;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final b a(String line) throws ParseException {
        lk.i iVarFind$default = Regex.find$default(this.lineRegex, line, 0, 2, null);
        if (iVarFind$default == null) {
            return null;
        }
        lk.i.b bVarA = iVarFind$default.a();
        String str = bVarA.a().b().get(1);
        String str2 = bVarA.a().b().get(2);
        String str3 = bVarA.a().b().get(3);
        String str4 = bVarA.a().b().get(5);
        Long lA = this.timestampParser.a(str);
        return new b(lA != null ? lA.longValue() : 0L, str3, str2, str4);
    }
}
