package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import androidx.annotation.RequiresApi;
import ck.i;
import ck.p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import nj.s;

/* JADX INFO: compiled from: DeletionRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(33)
public final class DeletionRequest {
    public static final Companion Companion = new Companion(null);
    public static final int DELETION_MODE_ALL = 0;
    public static final int DELETION_MODE_EXCLUDE_INTERNAL_DATA = 1;
    public static final int MATCH_BEHAVIOR_DELETE = 0;
    public static final int MATCH_BEHAVIOR_PRESERVE = 1;
    private final int deletionMode;
    private final List<Uri> domainUris;
    private final Instant end;
    private final int matchBehavior;
    private final List<Uri> originUris;
    private final Instant start;

    /* JADX INFO: compiled from: DeletionRequest.kt */
    @RequiresApi(33)
    public static final class Builder {
        private final int deletionMode;
        private List<? extends Uri> domainUris;
        private Instant end;
        private final int matchBehavior;
        private List<? extends Uri> originUris;
        private Instant start;

        public final DeletionRequest build() {
            return new DeletionRequest(this.deletionMode, this.matchBehavior, this.start, this.end, this.domainUris, this.originUris);
        }

        public final Builder setDomainUris(List<? extends Uri> list) {
            p.j(list, "domainUris");
            this.domainUris = list;
            return this;
        }

        public final Builder setEnd(Instant instant) {
            p.j(instant, "end");
            this.end = instant;
            return this;
        }

        public final Builder setOriginUris(List<? extends Uri> list) {
            p.j(list, "originUris");
            this.originUris = list;
            return this;
        }

        public Builder(int i10, int i11) {
            this.deletionMode = i10;
            this.matchBehavior = i11;
            Instant instant = Instant.MIN;
            p.i(instant, "MIN");
            this.start = instant;
            Instant instant2 = Instant.MAX;
            p.i(instant2, "MAX");
            this.end = instant2;
            this.domainUris = s.k();
            this.originUris = s.k();
        }

        public final Builder setStart(Instant instant) {
            p.j(instant, "start");
            this.start = instant;
            return this;
        }
    }

    /* JADX INFO: compiled from: DeletionRequest.kt */
    public static final class Companion {

        /* JADX INFO: compiled from: DeletionRequest.kt */
        @Retention(RetentionPolicy.SOURCE)
        public @interface DeletionMode {
        }

        /* JADX INFO: compiled from: DeletionRequest.kt */
        @Retention(RetentionPolicy.SOURCE)
        public @interface MatchBehavior {
        }

        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeletionRequest(int i10, int i11, Instant instant, Instant instant2, List<? extends Uri> list, List<? extends Uri> list2) {
        p.j(instant, "start");
        p.j(instant2, "end");
        p.j(list, "domainUris");
        p.j(list2, "originUris");
        this.deletionMode = i10;
        this.matchBehavior = i11;
        this.start = instant;
        this.end = instant2;
        this.domainUris = list;
        this.originUris = list2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeletionRequest)) {
            return false;
        }
        DeletionRequest deletionRequest = (DeletionRequest) obj;
        return this.deletionMode == deletionRequest.deletionMode && p.e(new HashSet(this.domainUris), new HashSet(deletionRequest.domainUris)) && p.e(new HashSet(this.originUris), new HashSet(deletionRequest.originUris)) && p.e(this.start, deletionRequest.start) && p.e(this.end, deletionRequest.end) && this.matchBehavior == deletionRequest.matchBehavior;
    }

    public final int getDeletionMode() {
        return this.deletionMode;
    }

    public final List<Uri> getDomainUris() {
        return this.domainUris;
    }

    public final Instant getEnd() {
        return this.end;
    }

    public final int getMatchBehavior() {
        return this.matchBehavior;
    }

    public final List<Uri> getOriginUris() {
        return this.originUris;
    }

    public final Instant getStart() {
        return this.start;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.deletionMode) * 31) + this.domainUris.hashCode()) * 31) + this.originUris.hashCode()) * 31) + this.start.hashCode()) * 31) + this.end.hashCode()) * 31) + Integer.hashCode(this.matchBehavior);
    }

    public String toString() {
        return "DeletionRequest { DeletionMode=" + (this.deletionMode == 0 ? "DELETION_MODE_ALL" : "DELETION_MODE_EXCLUDE_INTERNAL_DATA") + ", MatchBehavior=" + (this.matchBehavior == 0 ? "MATCH_BEHAVIOR_DELETE" : "MATCH_BEHAVIOR_PRESERVE") + ", Start=" + this.start + ", End=" + this.end + ", DomainUris=" + this.domainUris + ", OriginUris=" + this.originUris + " }";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DeletionRequest(int i10, int i11, Instant instant, Instant instant2, List list, List list2, int i12, i iVar) {
        if ((i12 & 4) != 0) {
            instant = Instant.MIN;
            p.i(instant, "MIN");
        }
        Instant instant3 = instant;
        if ((i12 & 8) != 0) {
            instant2 = Instant.MAX;
            p.i(instant2, "MAX");
        }
        this(i10, i11, instant3, instant2, (i12 & 16) != 0 ? s.k() : list, (i12 & 32) != 0 ? s.k() : list2);
    }
}
