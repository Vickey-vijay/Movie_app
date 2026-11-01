package androidx.privacysandbox.ads.adservices.topics;

import ck.p;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: GetTopicsResponse.kt */
/* JADX INFO: loaded from: classes.dex */
public final class GetTopicsResponse {
    private final List<Topic> topics;

    public int hashCode() {
        return Objects.hash(this.topics);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetTopicsResponse)) {
            return false;
        }
        GetTopicsResponse getTopicsResponse = (GetTopicsResponse) obj;
        if (this.topics.size() != getTopicsResponse.topics.size()) {
            return false;
        }
        return p.e(new HashSet(this.topics), new HashSet(getTopicsResponse.topics));
    }

    public final List<Topic> getTopics() {
        return this.topics;
    }

    public String toString() {
        return "Topics=" + this.topics;
    }

    public GetTopicsResponse(List<Topic> list) {
        p.j(list, "topics");
        this.topics = list;
    }
}
